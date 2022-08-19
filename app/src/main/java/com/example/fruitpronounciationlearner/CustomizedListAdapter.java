package com.example.fruitpronounciationlearner;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomizedListAdapter extends ArrayAdapter<ListItem> {
    public CustomizedListAdapter(Context ctx, ArrayList<ListItem> lst)
    {
        super(ctx,R.layout.activity_custom_list_view, lst);
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ListItem listitem = getItem(i);

            view = LayoutInflater.from(getContext()).inflate(R.layout.activity_custom_list_view, viewGroup, true);

        TextView txtView = (TextView) view.findViewById(R.id.textView);
        ImageView imgView = (ImageView) view.findViewById(R.id.imageIcon);
        txtView.setText(listitem.getName());
        imgView.setImageResource(listitem.getImage());

        return view;
    }
}
