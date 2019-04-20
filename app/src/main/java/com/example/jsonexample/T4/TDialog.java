package com.example.jsonexample.T4;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.widget.TextView;

import com.example.jsonexample.R;


class TDialog extends Dialog {
    private final MyItem myItem;
    private MyListener myListener ;

    public TDialog(Context context, MyItem myItem) {
        super(context);
        this.myItem=myItem;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.t_dialog);


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
