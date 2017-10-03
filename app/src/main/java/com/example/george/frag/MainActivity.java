package com.example.george.frag;

import android.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements communicator{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public void respond(int i) {
        FragmentManager fragmentManager= getFragmentManager();
        FragmentB f= (FragmentB) fragmentManager.findFragmentById(R.id.fragment4);
        f.changeData(i);

    }
    public void showDialog(View v){

    }
}
