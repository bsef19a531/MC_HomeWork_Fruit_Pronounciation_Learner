package com.example.fruitpronounciationlearner;

import static android.content.ContentValues.TAG;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
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

    int [] fruitAudio = {R.raw.apple_en_gb_1, R.raw.apricot_en_gb_1, R.raw.banana_en_gb_1, R.raw.guava_en_gb_1, R.raw.mango_en_gb_1, R.raw.orange_en_gb_1, R.raw.pineapple_en_gb_1, R.raw.pomegranate_en_gb_1};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<ListItem> lst = new ArrayList<>();
       lst.add(new ListItem(fruitName[0], fruitImage[0]));
        lst.add(new ListItem(fruitName[1], fruitImage[1]));
        lst.add(new ListItem(fruitName[2], fruitImage[2]));
        lst.add(new ListItem(fruitName[3], fruitImage[3]));
        lst.add(new ListItem(fruitName[4], fruitImage[4]));
        lst.add(new ListItem(fruitName[5], fruitImage[5]));
        lst.add(new ListItem(fruitName[6], fruitImage[6]));
        lst.add(new ListItem(fruitName[7], fruitImage[7]));

        CustomizedListAdapter customAdapter = new CustomizedListAdapter(this, R.layout.activity_custom_list_view ,lst);

        fruitList = findViewById(R.id.myListView);
        fruitList.setAdapter(customAdapter);



        fruitList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                final MediaPlayer audio = MediaPlayer.create(MainActivity.this, fruitAudio[i]);
                audio.start();
            }
        });

    }
}