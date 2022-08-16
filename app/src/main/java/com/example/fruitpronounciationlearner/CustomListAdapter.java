package com.example.fruitpronounciationlearner;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomListAdapter extends BaseAdapter {
    Context ctx;
    String [] Names;
    int [] Images;
    LayoutInflater inflater;

    public CustomListAdapter(Context ctx, String [] Names, int [] Images)
    {
        this.ctx= ctx;
        this.Names = Names;
        this.Images = Images;
        this.inflater = LayoutInflater.from(ctx);
    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = inflater.inflate(R.layout.activity_custom_list_view, null);
        TextView txtView = (TextView) view.findViewById(R.id.textView);
        ImageView imgView = (ImageView) view.findViewById(R.id.imageIcon);
        txtView.setText(Names[i]);
        imgView.setImageResource(Images[i]);
        return view;

    }
}
