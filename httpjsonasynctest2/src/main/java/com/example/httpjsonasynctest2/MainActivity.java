package com.example.httpjsonasynctest2;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.JsonReader;
import android.widget.ListView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView=(ListView)findViewById(R.id.listView);

        final ArrayList<MyItem>  arrayList=new ArrayList();

        final MyAdapter myAdapter=new MyAdapter(this,R.layout.item,arrayList);
        listView.setAdapter(myAdapter);





        MyListener myListener=new MyListener() {
            @Override
            public void get(String data) {
                JSONArray jsonArray = null;
                try {

//                    JSONObject jsonObject=new JSONObject(data);
//                    JSONArray jsonArray=jsonObject.getJSONArray();

                    jsonArray=new JSONArray(data);



                } catch (JSONException e) {
                    e.printStackTrace();
                }



                for (int i = 0; i <jsonArray.length() ; i++) {
                    try {
                        JSONObject o = (JSONObject) jsonArray.get(i);
                        MyItem myItem = new MyItem();


                        myItem.setId(o.get("id").toString());
                        myItem.setTitle(o.get("title").toString());
                        myItem.setBody(o.get("body").toString());


                        arrayList.add(myItem);
                        myAdapter.notifyDataSetChanged();

                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }




            }
        };

        MyAsync myAsync = new MyAsync(myListener);

        myAsync.execute("https://jsonplaceholder.typicode.com/todos/1/posts");


    }
}
