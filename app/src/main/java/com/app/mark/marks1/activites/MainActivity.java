package com.app.mark.marks1.activites;

import android.os.Handler;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import com.app.mark.marks1.R;
import com.app.mark.marks1.fragments.InfoFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //display info fragment inside main activity
        final int SPLASH_TIME_OUT = 3000;
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                InfoFragment info  = new InfoFragment();
                getSupportFragmentManager().beginTransaction().add(R.id.main,info).setCustomAnimations(R.anim.enter_from_left, R.anim.exit_to_right, R.anim.enter_from_right, R.anim.exit_to_left).commit();


            }
        },SPLASH_TIME_OUT);


    }
}
