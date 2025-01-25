package com.example.availableroutecourses;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_splash);
       Runnable runnable=new Runnable() {
           @Override
           public void run() {
               navigationToCoursesActivity();
           }
       };
       new Handler().postDelayed(runnable,2000);
    }

    private void navigationToCoursesActivity() {
        Intent intent =new Intent(this,CoursesActivity.class);
        startActivity(intent);
    }
}