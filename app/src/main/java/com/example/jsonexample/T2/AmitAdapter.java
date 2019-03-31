//package com.example.jsonexample.T2;
//
//import android.content.Context;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.ArrayAdapter;
//import android.widget.TextView;
//
//import com.example.jsonexample.R;
//
//import java.util.ArrayList;
//import java.util.zip.Inflater;
//
//class AmitAdapter extends ArrayAdapter<Amit> {
//    private ArrayList<Amit> arr;
//
//    public AmitAdapter(Context context, int layout, ArrayList<Amit> arr) {
//        super(context, layout, arr);
//
//        this.arr = arr;
//
//    }
//
//
//    @Override
//    public View getView(int position, View convertView, ViewGroup parent) {
//
//        LayoutInflater inflater = LayoutInflater.from(getContext());
//        View v = inflater.inflate(R.layout.my_movie, null);
//
//        TextView viewById = v.findViewById(R.id.nameTv);
//        viewById.setText(arr.get(position).getName());
//
//        return v;
//    }
//}
