package com.example.apple.rxjava_okhttp_retrofit.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.apple.rxjava_okhttp_retrofit.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Net2Fragment extends Fragment {


    public Net2Fragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.net2_fragment,null);
        return view;
    }

}
