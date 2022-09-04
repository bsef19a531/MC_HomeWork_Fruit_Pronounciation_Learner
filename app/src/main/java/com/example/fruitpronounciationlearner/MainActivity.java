package com.example.fruitpronounciationlearner;

import static android.content.ContentValues.TAG;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
//import android.widget.LinearLayout;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    String[] fruitName = {"Apple", "Apricot", "Banana", "Guava", "Mango", "Orange", "Pineapple", "Pomegranate"};
    int [] fruitImage = {R.drawable.apple,R.drawable.apricot, R.drawable.banana, R.drawable.guava, R.drawable.mango, R.drawable.orange, R.drawable.pineapple, R.drawable.pomegranate};
    ListView fruitList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<ListItem> lst = new ArrayList<>();
        ListItem li;
        for(int i = 0; i < fruitName.length; i++)
        {
            li = new ListItem(fruitName[i], fruitImage[i]);
            lst.add(li);
        }

        CustomizedListAdapter customAdapter = new CustomizedListAdapter(this, R.layout.activity_custom_list_view ,lst);

        fruitList = findViewById(R.id.myListView);
        fruitList.setAdapter(customAdapter);

        fruitList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

            }
        });

    }
}