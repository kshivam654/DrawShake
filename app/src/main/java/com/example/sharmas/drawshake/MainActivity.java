package com.example.sharmas.drawshake;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.paolorotolo.appintro.AppIntro;
import com.github.paolorotolo.appintro.AppIntroFragment;

public class MainActivity extends AppIntro {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        addSlide(AppIntroFragment.newInstance("This app is shakky itself", "Follow instructions to feel high",
                R.drawable.one, ContextCompat.getColor(getApplicationContext(), R.color.colorAccent)));
        addSlide(AppIntroFragment.newInstance("First Draw", "Draw something free hand in a single stroke within 10 second and then wait for a bit",
                R.drawable.two, ContextCompat.getColor(getApplicationContext(), R.color.orange)));
        addSlide(AppIntroFragment.newInstance("Time to shake", "Shake your device and observe your drawing",
                R.drawable.three, ContextCompat.getColor(getApplicationContext(), R.color.blue)));

    }

    @Override
    public void onDonePressed(Fragment currentFragment) {
        super.onDonePressed(currentFragment);
        Intent intent = new Intent(getApplicationContext(), WebActivity.class);
        startActivity(intent);
        finish();
    }

    @Override
    public void onSkipPressed(Fragment currentFragment) {
        super.onSkipPressed(currentFragment);
        Intent intent = new Intent(getApplicationContext(), WebActivity.class);
        startActivity(intent);
        finish();
    }
}
