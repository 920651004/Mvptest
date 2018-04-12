package com.example.duan.mvptest.main2activity;

import android.support.annotation.UiThread;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.duan.mvptest.R;

public class Main2Activity extends AppCompatActivity implements Mainview {
    EditText accout;
    EditText pwd;
    Button login;
    Mainpresent mainpresent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        accout=findViewById(R.id.main_account);
        pwd=findViewById(R.id.main_pwd);
        login=findViewById(R.id.main_login);
        mainpresent=new Mainpresent(this,Main2Activity.this);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainpresent.Login(accout.getText().toString(),pwd.getText().toString());
            }
        });
    }



    @Override
    public void getAccountIsNull() {
      runOnUiThread(new Runnable() {
          @Override
          public void run() {
              if (TextUtils.isEmpty(accout.getText().toString())){
                  Toast.makeText(Main2Activity.this,"账户为空",Toast.LENGTH_SHORT).show();
              }
          }
      });


    }

    @Override
    public void onSuccess() {
        runOnUiThread(new Runnable() {
            @Override
            public void run() {

                    Toast.makeText(Main2Activity.this,"登陆成功",Toast.LENGTH_SHORT).show();

            }
        });
    }

    @Override
    public void getPwdIsNull() {
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                if (TextUtils.isEmpty(pwd.getText().toString())){
                    Toast.makeText(Main2Activity.this,"密码为空",Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
}
