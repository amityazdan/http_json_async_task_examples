package com.example.httpjsonasynctest2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

class MyAdapter extends ArrayAdapter<MyItem> {
    public MyAdapter(Context context, int resource, ArrayList<MyItem> myItems) {
        super(context, resource, myItems);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater layoutInflater = LayoutInflater.from(getContext());


        View view=layoutInflater.inflate(R.layout.item,null);

        TextView id=(TextView)view.findViewById(R.id.id);
        TextView title=(TextView)view.findViewById(R.id.title);
        TextView body=(TextView)view.findViewById(R.id.body);

        id.setText(getItem(position).getId());
        title.setText(getItem(position).getTitle());
        body.setText(getItem(position).getBody());


        return view;
    }
}
