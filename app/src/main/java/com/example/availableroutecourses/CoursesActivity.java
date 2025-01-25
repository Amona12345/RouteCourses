package com.example.availableroutecourses;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.availableroutecourses.utilits.Constantes;

public class CoursesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_courses);

    }
    public void onViewClick(View view ){
        if(view.getId()==R.id.android_imv||view.getId()==R.id.android_btn){
            naviigateToCourseDetails(Constantes.ANDROID_COURSES);
            return;
        }
        if(view.getId()==R.id.ios_imv||view.getId()==R.id.ios_btn){
            naviigateToCourseDetails(Constantes.IOS_COURSES);
            return;
        }
        if(view.getId()==R.id.fullStack_imv||view.getId()==R.id.fullStack_btn){
            naviigateToCourseDetails(Constantes.FULL_STACK_COURSES);
        }
    }

    private void naviigateToCourseDetails( String course) {
        Intent intent =new Intent(this,CourseDetailsActivity.class);
        intent.putExtra(Constantes.COURSES,course);
        startActivity(intent);

    }
}