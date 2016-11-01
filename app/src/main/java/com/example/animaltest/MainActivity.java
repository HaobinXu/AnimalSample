package com.example.animaltest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void toAnimalResource(View view) {
        Intent intent = new Intent(this, AnimResourceActivity.class);
        startActivity(intent);
    }

    public void toValueAnim(View view) {
        Intent intent = new Intent(this, ValueAnimActivity.class);
        startActivity(intent);
    }

    public void toObjectAnim(View view) {
        Intent intent = new Intent(this, ObjectAnimActivity.class);
        startActivity(intent);
    }

    public void jumpToCustomAnim(View view) {
        Intent intent = new Intent(this, CustomObjectAnimActivity.class);
        startActivity(intent);
    }

    public void jumpToPropertyValue(View view) {
        Intent intent = new Intent(this, PropertyValuesHolderActivity.class);
        startActivity(intent);
    }

    public void jumpToAnimSet(View view) {
        Intent intent = new Intent(this, AnimatorSetActivity.class);
        startActivity(intent);
    }
}
