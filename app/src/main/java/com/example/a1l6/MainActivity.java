package com.example.a1l6;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {

    Button btn;
    FrameLayout frameLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       btn = findViewById(R.id.button1);
       frameLayout = findViewById(R.id.frlayaout);

       FirstFragment f1 = new FirstFragment();

       btn.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {

               frameLayout.setVisibility(View.VISIBLE);
               btn.setVisibility(View.GONE);

               FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
               transaction.add(R.id.frlayaout, f1);
               transaction.commit();

           }
       });





    }
}