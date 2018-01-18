package com.biggerlens.cupdesignlibs;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //测试成功Library中引用的库文件都会在被别人做为依赖时添加到项目中
        /*
           并不会按照上面说的一样，
           部分引用可以传递，
           但是很多还是不可以的
         */
    }

}
