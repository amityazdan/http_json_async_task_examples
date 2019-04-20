package com.example.httpjsonasynctask;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.widget.TextView;


class MyDialog extends Dialog {
    private final MyItem myItem;
    private MyListener myListener ;

    public MyDialog(Context context, MyItem myItem) {
        super(context);
        this.myItem=myItem;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.my_dialog);


        final TextView t_Tv=(TextView) findViewById(R.id.t_Tv);



        myListener=new MyListener() {
            @Override
            public void send(String data) {
                t_Tv.setText(data);
            }
        };
        new MyAsync(myListener).execute();

    }
}
