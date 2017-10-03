package com.example.george.frag;

import android.app.Fragment;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by george on 9/30/2017.
 */

public class FragmentB extends Fragment {
    TextView textView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_b,container,false);

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        textView= (TextView) getActivity().findViewById(R.id.editText);
    }
    public void changeData(int i){
        Resources res = getResources();
        String [] description = res.getStringArray(R.array.description);
        textView.setText(description[i]);
    }
    public void changeText(String data){
        textView.setText(data);

    }
}
