package com.example.apple.rxjava_okhttp_retrofit;

import android.os.Bundle;

import com.example.apple.rxjava_okhttp_retrofit.fragment.MainFragment;
import com.example.apple.rxjava_okhttp_retrofit.rxbus.RxBus;
import com.trello.rxlifecycle.components.support.RxFragmentActivity;

public class MainActivity extends RxFragmentActivity {

    private RxBus _bus;
    //得到rxbus的实例
    public RxBus getRxbusSingleton(){
        if(_bus==null){
            return new RxBus();
        }
        return _bus;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initFragment();
    }

    private void initFragment(){
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.main_contain,new MainFragment(),MainFragment.class.getName())
                .commit();
    }
}
