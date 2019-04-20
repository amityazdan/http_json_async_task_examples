//package com.example.jsonexample.T1;
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
//
//class MyAdapter extends ArrayAdapter<MyMovie> {
//
//    private final ArrayList<MyMovie> arr;
//
//    public MyAdapter(Context context, int my_movie, ArrayList<MyMovie> arr) {
//        super(context, my_movie,arr);
//        this.arr=arr;
//
//
//
//
//
//    }
//
//    @Override
//    public View getView(int position, View convertView, ViewGroup parent) {
//
//
//        LayoutInflater inflater = LayoutInflater.from(getContext());
//
//        View v = inflater.inflate(R.layout.my_movie, null, true);
//
//        TextView nameT= v.findViewById(R.id.nameTv);
////        nameT.setText(getItem(position).getName());
//        nameT.setText(arr.get(position).getName());
//
//        return v;
//
//
//    }
//}
