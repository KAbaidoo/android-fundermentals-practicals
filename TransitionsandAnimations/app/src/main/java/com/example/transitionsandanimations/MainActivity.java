package com.example.transitionsandanimations;

import androidx.appcompat.app.AppCompatActivity;

import androidx.core.app.ActivityCompat;
import androidx.core.app.ActivityOptionsCompat;
import androidx.core.util.Pair;


import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.transition.Explode;
import android.view.View;
import android.view.Window;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }



    public void openWithExplode(View view) {
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
ActivityOptionsCompat activityOptions = ActivityOptionsCompat.makeSceneTransitionAnimation(MainActivity.this,

        // Now we provide a list of Pair items which contain the view we can transitioning
        // from, and the name of the view it is transitioning to, in the launched activity
        new Pair<>(view.findViewById(R.id.redBlock), "redBlockDetail"));

        // Now we can start the Activity, providing the activity options as a bundle
        ActivityCompat.startActivity(MainActivity.this, intent, activityOptions.toBundle());
        // END_INCLUDE(start_activity)



    }
}