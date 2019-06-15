package com;


import android.graphics.Color;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.mrlonewolfer.example46.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class MainFragment extends Fragment {

    RadioButton rbRed,rbYellow,rbGreen;
    RadioGroup radioGroup;
    LinearLayout linearLayout;
    public MainFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_main, container, false);
        radioGroup=view.findViewById(R.id.rdGroup);
        rbRed=view.findViewById(R.id.rdRed);
        rbGreen=view.findViewById(R.id.rdGreen);
        rbYellow=view.findViewById(R.id.rdYellow);
        linearLayout=view.findViewById(R.id.linearlayout);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rdRed){
                    linearLayout.setBackgroundColor(Color.parseColor("#FF0000"));
                }
                else if(checkedId==R.id.rdGreen){
                    linearLayout.setBackgroundColor(Color.parseColor("#008000"));
                }
                else{
                    linearLayout.setBackgroundColor(Color.parseColor("#FFFF00"));
                }
            }
        });


        return  view;
    }


}
