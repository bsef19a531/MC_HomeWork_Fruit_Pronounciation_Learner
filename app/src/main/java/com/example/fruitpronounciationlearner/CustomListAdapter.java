package com.example.fruitpronounciationlearner;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;


public class CustomListAdapter extends ArrayAdapter {
    private final Activity ctx;
    private final String [] Names;
    private final int [] Images;

    public CustomListAdapter(Activity ctx, String [] Names, int [] Images)
    {
        super(ctx,R.layout.activity_custom_list_view);
        this.ctx= ctx;
        this.Names = Names;
        this.Images = Images;
//        this.inflater = LayoutInflater.from(ctx);
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        LayoutInflater inflater = ctx.getLayoutInflater();

        View v = inflater.inflate(R.layout.activity_custom_list_view, null, true);

        TextView txtView = (TextView) v.findViewById(R.id.textView);
        ImageView imgView = (ImageView) v.findViewById(R.id.imageIcon);
        txtView.setText(Names[i]);
        imgView.setImageResource(Images[i]);
        return v;

    }
}
