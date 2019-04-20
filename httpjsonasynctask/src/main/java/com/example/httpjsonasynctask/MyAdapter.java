package com.example.httpjsonasynctask;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

class MyAdapter extends ArrayAdapter<MyItem> {
    private final ArrayList<MyItem> arr;

//    public MyAdapter(Context context, int resource, ArrayList<Main4Activity.MyItem> arr) {
//        super(context, resource,arr);
//        this.arr=arr;
//    }

    public MyAdapter(MainActivity context, int item, ArrayList<MyItem> arr) {
        super(context, item, arr);
        this.arr = arr;

    }


    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        LayoutInflater layoutInflater = LayoutInflater.from(getContext());

        View view = layoutInflater.inflate(R.layout.item, null);

        TextView user = view.findViewById(R.id.user);
        TextView title = view.findViewById(R.id.title);
        TextView body = view.findViewById(R.id.body);
        user.setText(arr.get(position).getUserId());
        title.setText(arr.get(position).getTitle());
        body.setText(arr.get(position).getBody());


        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MyDialog myDialog= new MyDialog(getContext(), arr.get(position));
                myDialog.show();
            }
        });
        return view;
    }
}
