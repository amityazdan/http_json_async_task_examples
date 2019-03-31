//package com.example.jsonexample.T2;
//
//import android.os.AsyncTask;
//import android.support.v7.app.AppCompatActivity;
//import android.os.Bundle;
//import android.widget.ListView;
//
//import com.example.jsonexample.R;
//
//import org.json.JSONException;
//import org.json.JSONObject;
//
//import java.io.BufferedInputStream;
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStream;
//import java.io.InputStreamReader;
//import java.net.HttpURLConnection;
//import java.net.MalformedURLException;
//import java.net.URL;
//import java.util.ArrayList;
//
//import static com.example.jsonexample.T2.Main2Activity.myListener;
//
//public class Main2Activity extends AppCompatActivity {
//
//
//    public static MyListener myListener;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main2);
//
//
//        ListView l = (ListView) findViewById(R.id.lv);
//
//        final ArrayList<Amit> amits = new ArrayList<>();
//        for (int i = 0; i < 10; i++) {
//            amits.add(new Amit("amit" + i));
//        }
//
//
//        final AmitAdapter adapter = new AmitAdapter(this, R.id.movies_list, amits);
//        l.setAdapter(adapter);
//
//
//        new MyAsync().execute();
//
//        myListener=new MyListener() {
//            @Override
//            public void msg(Amit amit) {
//                   amits.add(amit);
//                   adapter.notifyDataSetChanged();
//            }
//        };
//
//    }
//
//}
//
//class MyAsync extends AsyncTask<String, String, String> {
//
//    private StringBuilder stringBuilder;
//
//    @Override
//    protected String doInBackground(String... strings) {
//        try {
//            URL url = new URL("url");
//            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
//
//            InputStream inputStream = new BufferedInputStream(httpURLConnection.getInputStream());
//
//            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
//            String line;
//
//            stringBuilder = new StringBuilder();
//            while ((line = reader.readLine()) != null) {
//                stringBuilder.append(line);
//            }
//
//            httpURLConnection.disconnect();
//
//        } catch (MalformedURLException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//
//        return "";
//    }
//
//
//    @Override
//    protected void onPostExecute(String s) {
//        JSONObject jsonObject = null;
//        try {
//            jsonObject = new JSONObject(s);
//        } catch (JSONException e) {
//            e.printStackTrace();
//        }
//
//        if(myListener!=null){
//            myListener.msg(new Amit("aaaa"));
//        }
//
//
//
//    }
//}
