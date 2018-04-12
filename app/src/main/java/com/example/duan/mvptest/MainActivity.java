package com.example.duan.mvptest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements Testview{
DemoPresent present;

    TextView view;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        view=findViewById(R.id.mvp_text);

        present=new DemoPresent(this,MainActivity.this);
        present.settextview();

    }

    @Override
    public void settext(String text) {
        view.setText(text);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
