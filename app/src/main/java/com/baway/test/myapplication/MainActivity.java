package com.baway.test.myapplication;

import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private MyView my;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        my = (MyView) findViewById(R.id.myview);


        my.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ObjectAnimator animator = ObjectAnimator.ofFloat(my, "translationX", 0f, 650f);
                animator.setDuration(5000);
                animator.start();
                ObjectAnimator animator1 = ObjectAnimator.ofFloat(my, "translationY", 0f, 1085f);
                animator1.setDuration(5000);
                animator1.start();
            }
        });

    }
}