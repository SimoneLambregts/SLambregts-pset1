package com.simone.slambregts_pset1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {

    ImageView arms;
    ImageView ears;
    ImageView eyebrows;
    ImageView eyes;
    ImageView glasses;
    ImageView hat;
    ImageView mouth;
    ImageView mustache;
    ImageView nose;
    ImageView shoes;

    CheckBox checkarms;
    CheckBox checkears;
    CheckBox checkeyebrows;
    CheckBox checkeyes;
    CheckBox checkglasses;
    CheckBox checkhat;
    CheckBox checkmouth;
    CheckBox checkmustache;
    CheckBox checknose;
    CheckBox checkshoes;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        arms = (ImageView) findViewById(R.id.armsview);
        ears = (ImageView) findViewById(R.id.earsview);
        eyebrows = (ImageView) findViewById(R.id.eyebrowsview);
        eyes = (ImageView) findViewById(R.id.eyesview);
        glasses = (ImageView) findViewById(R.id.glassesview);
        hat = (ImageView) findViewById(R.id.hatview);
        mouth = (ImageView) findViewById(R.id.mouthview);
        mustache = (ImageView) findViewById(R.id.mustacheview);
        nose = (ImageView) findViewById(R.id.noseview);
        shoes = (ImageView) findViewById(R.id.shoesview);

        arms.setVisibility(View.INVISIBLE);
        ears.setVisibility(View.INVISIBLE);
        eyebrows.setVisibility(View.INVISIBLE);
        eyes.setVisibility(View.INVISIBLE);
        glasses.setVisibility(View.INVISIBLE);
        hat.setVisibility(View.INVISIBLE);
        mouth.setVisibility(View.INVISIBLE);
        mustache.setVisibility(View.INVISIBLE);
        nose.setVisibility(View.INVISIBLE);
        shoes.setVisibility(View.INVISIBLE);

        checkarms = (CheckBox) findViewById(R.id.checkbox_arms);
        checkears = (CheckBox) findViewById(R.id.checkbox_ears);
        checkeyebrows = (CheckBox) findViewById(R.id.checkbox_eyebrows);
        checkeyes = (CheckBox) findViewById(R.id.checkbox_eyes);
        checkglasses = (CheckBox) findViewById(R.id.checkbox_glasses);
        checkhat = (CheckBox) findViewById(R.id.checkbox_hat);
        checkmouth = (CheckBox) findViewById(R.id.checkbox_mouth);
        checkmustache = (CheckBox) findViewById(R.id.checkbox_mustache);
        checknose = (CheckBox) findViewById(R.id.checkbox_nose);
        checkshoes = (CheckBox) findViewById(R.id.checkbox_shoes);

        checkarms.setChecked(false);
        checkears.setChecked(false);
        checkeyebrows.setChecked(false);
        checkeyes.setChecked(false);
        checkglasses.setChecked(false);
        checkhat.setChecked(false);
        checkmouth.setChecked(false);
        checkmustache.setChecked(false);
        checknose.setChecked(false);
        checkshoes.setChecked(false);

        checkarms.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {


                if (checkarms.isChecked()) {
                    arms.setVisibility(View.VISIBLE);
                } else {
                    arms.setVisibility(View.INVISIBLE);
                }
            }

        });

        checkears.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {


                if (checkears.isChecked()) {
                    ears.setVisibility(View.VISIBLE);
                } else {
                    ears.setVisibility(View.INVISIBLE);
                }
            }

        });

        checkeyebrows.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {


                if (checkeyebrows.isChecked()) {
                    eyebrows.setVisibility(View.VISIBLE);
                } else {
                    eyebrows.setVisibility(View.INVISIBLE);
                }
            }

        });

        checkeyes.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {


                if (checkeyes.isChecked()) {
                    eyes.setVisibility(View.VISIBLE);
                } else {
                    eyes.setVisibility(View.INVISIBLE);
                }
            }

        });

        checkglasses.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {


                if (checkglasses.isChecked()) {
                    glasses.setVisibility(View.VISIBLE);
                } else {
                    glasses.setVisibility(View.INVISIBLE);
                }
            }

        });

        checkhat.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {


                if (checkhat.isChecked()) {
                    hat.setVisibility(View.VISIBLE);
                } else {
                    hat.setVisibility(View.INVISIBLE);
                }
            }

        });

        checkmouth.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {


                if (checkmouth.isChecked()) {
                    mouth.setVisibility(View.VISIBLE);
                } else {
                    mouth.setVisibility(View.INVISIBLE);
                }
            }

        });

        checkmustache.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {


                if (checkmustache.isChecked()) {
                    mustache.setVisibility(View.VISIBLE);
                } else {
                    mustache.setVisibility(View.INVISIBLE);
                }
            }

        });

        checknose.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {


                if (checknose.isChecked()) {
                    nose.setVisibility(View.VISIBLE);
                } else {
                    nose.setVisibility(View.INVISIBLE);
                }
            }

        });

        checkshoes.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {


                if (checkshoes.isChecked()) {
                    shoes.setVisibility(View.VISIBLE);
                } else {
                    shoes.setVisibility(View.INVISIBLE);
                }
            }

        });



    }
}
