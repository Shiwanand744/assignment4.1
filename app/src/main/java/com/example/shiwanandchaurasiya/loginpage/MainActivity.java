package com.example.shiwanandchaurasiya.loginpage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
/*
  This is the main Activity means the launcher activity of our Application.And through this activity we are showing the UI
*/
/*
* This activity is extending AppCompatActivity to make this activity compatible with backword
* */
public class MainActivity extends AppCompatActivity {

    /*
    @Override means this is an overrriden method of the Activity LifeCycle and this call back is used to create the UI of the Acivity.
    @return This method is not returning anything as it's return type is void.
    @Param This method is taking the Bundle's instance as an arguement named as savedInstanceState used to fetch the details sent by another activity or method.
    This method is responsible for initializing all the views and setting the content view through the layout file.

    */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /*
        * setContentView is method to bind layout xml file with activity
        * */
        setContentView(R.layout.activity_main);
    }
}
