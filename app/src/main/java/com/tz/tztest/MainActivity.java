package com.tz.tztest;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.Random;

import static com.tz.tztest.R.id.bt;
import static com.tz.tztest.R.id.ll;

public class MainActivity extends AppCompatActivity {

    TextView mTextView;
    LinearLayout mLinearLayout;
    Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        mButton = (Button) findViewById(bt);
        mLinearLayout = (LinearLayout) findViewById(ll);
        mTextView = new TextView(MainActivity.this);
    }

    public void doClick(View view) {
        switch (view.getId()) {
            case R.id.bt:
                Random random = new Random();
                int i = random.nextInt(5);
                for (; i < 5; i++) {
                    nishinoNanase(i);
                }
                break;
            default:
                break;
        }
    }

    private void nishinoNanase(int i) {
        mLinearLayout.addView(mTextView);
        String name = "西野七濑"+i;
        mTextView.setText(name);
        mTextView.setGravity(Gravity.CENTER);
        mTextView.setTextSize(48);
        mTextView.setTextColor(Color.BLUE);
        mTextView = new TextView(MainActivity.this);
    }
}
