package com.tz.tztest;

import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    Button bt;
    LinearLayout ll;

    public Handler mHandler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            switch (msg.what) {
                case 1:
                    nishinoNanase();
                    break;
                default:
                    break;
            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt = (Button) findViewById(R.id.bt);
        ll = (LinearLayout) findViewById(R.id.ll);
        textView = new TextView(MainActivity.this);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ll.addView(textView);
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        Message m = new Message();
                        m.what = 1;
                        mHandler.sendMessage(m);
                    }
                }).start();
            }
        });
    }

    private void nishinoNanase() {
        textView = new TextView(MainActivity.this);
        String name = "西野七濑";
        textView.setText(name);
        textView.setGravity(Gravity.CENTER);
        textView.setTextSize(48);
        textView.setTextColor(Color.BLUE);
    }
}
