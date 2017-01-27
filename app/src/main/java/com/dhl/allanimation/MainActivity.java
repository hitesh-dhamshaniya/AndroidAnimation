package com.dhl.allanimation;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    Spinner spinner;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initUI();
    }

    private void initUI() {

        imageView = (ImageView) findViewById(R.id.imageView1);
        spinner = (Spinner) findViewById(R.id.spinner1);


        //================================================================
        //	Let's Animate Image based on the selection from Spinner
        // Don't forget to add all animation files into res/anim folder before you use following code.
        //===============================================================
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
                // TODO Auto-generated method stub

                //========================
                //Alpha Animation
                //========================
                if (arg2 == 0) {
                    Animation an = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha);
                    imageView.startAnimation(an);

                } else if (arg2 == 1) {
                    //========================
                    //Rotate Animation
                    //========================

                    Animation an = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.rotate);
                    imageView.startAnimation(an);
                } else if (arg2 == 2) {
                    //========================
                    //Translate Animation
                    //========================

                    Animation an = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.translate);
                    imageView.startAnimation(an);
                } else {
                    //========================
                    //scale Animation
                    //========================

                    Animation an = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.scale);
                    imageView.startAnimation(an);
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
                // TODO Auto-generated method stub

            }

        });
    }
}
