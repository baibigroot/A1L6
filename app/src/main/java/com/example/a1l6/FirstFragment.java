package com.example.a1l6;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class FirstFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        Log.e("this", "onCreateView");
        return inflater.inflate(R.layout.fragment_first, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Log.e("this", "onViewCreated");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.e("this", "onStart");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.e("this", "onResume");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.e("this", "onPause");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.e("this", "onStop");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.e("this", "onDestroy");
    }
}