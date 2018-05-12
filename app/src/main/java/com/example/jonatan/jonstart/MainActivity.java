package com.example.jonatan.jonstart;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        User user = new User();
        user.setName("Test");
        user.setAge(19);

        Log.d("User get\\set", user.getName() + " ^ " + user.getAge());

        user = new User("Test2", 15);

        Log.d("User constructor", user.getName() + " ^ " + user.getAge());

        user.sayHello();


    }

}