package com.example.duan.mvptest;

import android.content.Context;

/**
 * Created by Duan 2018/4/11
 */

public class DemoPresent  extends BasePresent{
    Testview testview;
    public DemoPresent (Testview testview, Context context){
        this.testview=testview;
    }
    public void settextview(){
        String text="你才我猜不猜";

            testview.settext(text);


    }
    @Override
    public void Destroyview() {
        testview=null;
    }
}
