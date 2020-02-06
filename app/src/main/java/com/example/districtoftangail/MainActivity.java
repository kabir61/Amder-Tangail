package com.example.districtoftangail;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void IntroID(View view) {
        Intent I=new Intent(MainActivity.this,First.class);
        startActivity(I);
    }

    public void HistoID(View view) {
        Intent H=new Intent(MainActivity.this,Second.class);
        startActivity(H);
    }

    public void FamousID(View view) {
        Intent F=new Intent(MainActivity.this,Third.class);
        startActivity(F);
    }

    public void ImageID(View view) {
        Intent Im=new Intent(MainActivity.this,Four.class);
        startActivity(Im);
    }

    public void UpazilaID(View view) {
        Intent U=new Intent(MainActivity.this,Five.class);
        startActivity(U);
    }

    public void InstituteID(View view) {
        Intent In=new Intent(MainActivity.this,Six.class);
        startActivity(In);
    }

    public void mapID(View view) {
        Intent M=new Intent(MainActivity.this,MapsActivity.class);
        startActivity(M);
    }

    public void AboutID(View view) {
        Intent A=new Intent(MainActivity.this,Seven.class);
        startActivity(A);
    }
}
