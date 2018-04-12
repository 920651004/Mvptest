package com.example.duan.mvptest.main2activity;

import android.content.Context;
import android.text.TextUtils;
import android.widget.Toast;

import com.example.duan.mvptest.BasePresent;

/**
 * Created by Duan 2018/4/11
 */

public class Mainpresent extends BasePresent {

    Mainview mainview;
    Context context;
    public  Mainpresent (Mainview mainview, Context context){
        this.mainview=mainview;
        this.context=context;

    }
public  void  Login(final String account, final String pwd){
    new Thread(new Runnable() {
        @Override
        public void run() {
            try {
                boolean Isok=false;
                Thread.sleep(1000);
                if (!TextUtils.isEmpty(account)){
                    Isok=true;
                }
                else {
                    mainview.getAccountIsNull();
                }
                if (!TextUtils.isEmpty(pwd)){
                    Isok=true;
                }
                else {
                    mainview.getPwdIsNull();
                }
                if (Isok=true){

                    mainview.onSuccess();
                   // Toast.makeText(context,"登录成功",Toast.LENGTH_SHORT).show();
                }

            } catch (InterruptedException e) {

            }
        }
    }).start();
}
    @Override
    public void Destroyview() {
        mainview=null;
    }
}
