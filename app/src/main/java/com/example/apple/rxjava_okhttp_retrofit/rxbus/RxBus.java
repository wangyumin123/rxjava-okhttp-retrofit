package com.example.apple.rxjava_okhttp_retrofit.rxbus;/**
 * Created by apple on 16/9/7.
 */

import rx.Observable;
import rx.subjects.PublishSubject;
import rx.subjects.SerializedSubject;
import rx.subjects.Subject;

/**
 * 作者：Wyumer on 16/9/7 14:49
 * 邮箱：18518917561@163.com
 */
public class RxBus {
    //线程安全
    private final Subject<Object,Object> _bus=new SerializedSubject<>(PublishSubject.create());

    public void send(Object o){
        _bus.onNext(o);
    }

    //获取实际的Bus对象
    public Observable<Object> toOberverable(){
        return _bus;
    }

    //是不含有观察者
    public boolean hasObservers(){
        return _bus.hasObservers();
    }
}
