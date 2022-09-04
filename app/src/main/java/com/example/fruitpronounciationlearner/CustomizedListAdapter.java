package com.example.fruitpronounciationlearner;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.ArrayList;

public class CustomizedListAdapter extends ArrayAdapter<ListItem> {
    ArrayList<ListItem> lst;
    public CustomizedListAdapter(@NonNull Context ctx, int resource, ArrayList<ListItem> lst)
    {
        super(ctx,resource, lst );
        this.lst = lst;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ListItem listitem = lst.get(i);

        View v = LayoutInflater.from(getContext()).inflate(R.layout.activity_custom_list_view, null, true);

        TextView txtView =  v.findViewById(R.id.textView);
        ImageView imgView =  v.findViewById(R.id.imageIcon);
        txtView.setText(listitem.getName());
        imgView.setImageResource(listitem.getImage());

        return v;
    }
}
