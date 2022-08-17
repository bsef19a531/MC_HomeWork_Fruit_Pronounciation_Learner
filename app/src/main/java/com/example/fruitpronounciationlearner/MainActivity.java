package com.example.fruitpronounciationlearner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    String fruitName [] = {"Apple", "Apricot", "Banana", "Guava", "Mango", "Orange", "Pineapple", "Pomegranate"};
    int fruitImage [] = {R.drawable.apple,R.drawable.apricot, R.drawable.banana, R.drawable.guava, R.drawable.mango, R.drawable.orange, R.drawable.pineapple, R.drawable.pomegranate};
    ListView fruitList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        CustomListAdapter listAdapter = new CustomListAdapter(this, fruitName, fruitImage);
        fruitList = (ListView) findViewById(R.id.myListView);
        fruitList.setAdapter(listAdapter);
    }
}