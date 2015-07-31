package com.javierviveros.tableroelectronico;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.javierviveros.tableroelectronico.R;


public class Msg extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View rootView = inflater.inflate(R.layout.fragment_msg, container, false);

        MainActivity.msg_show = (TextView) rootView.findViewById(R.id.tMensaje);
        MainActivity.stateBT = (TextView) rootView.findViewById(R.id.tEstado);

        MainActivity.msg_show.setText(MainActivity.mensaj);
        MainActivity.stateBT.setText(MainActivity.msgStBt);

        return rootView;

    }



}
