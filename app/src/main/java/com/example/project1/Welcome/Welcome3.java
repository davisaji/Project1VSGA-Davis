package com.example.project1.Welcome;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.project1.R;

import androidx.fragment.app.Fragment;

public class Welcome3 extends Fragment {

    View view;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.activity_welcome3, container, false);
        super.onCreate(savedInstanceState);
        return view;
    }
}