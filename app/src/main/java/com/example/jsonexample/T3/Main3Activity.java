//package com.example.jsonexample.T3;
//
//import android.os.AsyncTask;
//import android.support.v7.app.AppCompatActivity;
//import android.os.Bundle;
//import android.widget.ListView;
//import android.widget.Toast;
//
//import com.example.jsonexample.R;
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
//import java.util.Stack;
//
//public class Main3Activity extends AppCompatActivity {
//
//
//    public static MyListener myListener;
//    private MyAdapter myAdapter;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main3);
//
//
//
////        String parenthesis="(({})){[()}";
//        String parenthesis="(}";
//
//        Stack stack=new Stack();
//        for (int i = 0; i <parenthesis.length(); i++) {
//            char c=parenthesis.charAt(i);
//            if (c=='{'||c=='['||c=='('){
//             //add to stack
//                stack.push(c);
//            }else {
//                char cc = (char) stack.pop();
//                if (c=='}'){
//                    if (cc!='{'){
//                        Toast.makeText(this, "false", Toast.LENGTH_SHORT).show();
//                        return;
//                    }
//                }else if(c==']'){
//                    if (cc!='['){
//                        Toast.makeText(this, "false", Toast.LENGTH_SHORT).show();
//                        break;
//                    }
//                }else if(c==')'){
//                    if (cc!='('){
//                        Toast.makeText(this, "false", Toast.LENGTH_SHORT).show();
//                        break;
//                    }
//                }
//            }
//        }
//
//        Toast.makeText(this, "true", Toast.LENGTH_SHORT).show();
//
//        final ArrayList<MyItem> myItems = new ArrayList<>();
//        for (int i = 0; i < 5; i++) {
//
//            String[] str=new String[]{"name" + i, "date" + i};
//            new MyAsync().execute(str);
//        }
//
//
//        ListView listV = (ListView) findViewById(R.id.listV);
//        myAdapter = new MyAdapter(this, R.layout.item_lay, myItems);
//        listV.setAdapter(myAdapter);
//
//
//        myListener = new MyListener() {
//            @Override
//            public void msg(MyItem myItem) {
//                myItems.add(myItem);
//                myAdapter.notifyDataSetChanged();
//            }
//        };
//
//    }
//
//
//    class MyAsync extends AsyncTask<String, String, String> {
//
//
//        @Override
//        protected String doInBackground(String... strings) {
//
//            String str0=strings[0];
//            String str1=strings[1];
//            StringBuilder stringBuilder = null;
//            try {
//                URL url = new URL("url");
//                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
//                InputStream inputStream = new BufferedInputStream(httpURLConnection.getInputStream());
//
//                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
//
//
//                stringBuilder = new StringBuilder();
//                String line;
//                if ((line = bufferedReader.readLine()) != null) {
//                    stringBuilder.append(line);
//                }
//
//
//            } catch (MalformedURLException e) {
//                e.printStackTrace();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
////            return stringBuilder.toString();
//            return str0;
//        }
//
//        @Override
//        protected void onPostExecute(String s) {
//
//
//            if (myListener != null) {
//                myListener.msg(new MyItem(s, "date"));
//            }
//
//            super.onPostExecute(s);
//        }
//
//    }
//}
