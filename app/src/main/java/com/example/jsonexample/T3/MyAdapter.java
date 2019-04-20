//package com.example.jsonexample.T3;
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
//class MyAdapter extends ArrayAdapter<MyItem> {
//
//    private final ArrayList<MyItem> myItems;
//
//    public MyAdapter(Context context, int item_lay, ArrayList<MyItem> myItems){
//            super(context,item_lay,myItems);
//            this.myItems=myItems;
//    }
//
//    @Override
//    public View getView(int position,  View convertView,  ViewGroup parent) {
//
//        LayoutInflater layoutInflater=LayoutInflater.from(getContext());
//        View view =layoutInflater.inflate(R.layout.item_lay,null);
//
//        TextView name = view.findViewById(R.id.nameTv);
//        TextView date = view.findViewById(R.id.dateTv);
//
//        name.setText(myItems.get(position).getName());
//        date.setText(myItems.get(position).getDate());
//        return view;
//    }
//}
