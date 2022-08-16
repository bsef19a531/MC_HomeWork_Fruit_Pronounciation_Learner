package com.example.fruitpronounciationlearner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    String fruitName [] = {"Apple", "Apricot", "Banana", "Guava", "Mango", "Orange", "Pineapple", "Pomegranate"};
    int fruitImage [] = {R.drawable.apple,R.drawable.apricot, R.drawable.banana, R.drawable.guava, R.drawable.mango, R.drawable.orange, R.drawable.pineapple, R.drawable.pomegranate};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}