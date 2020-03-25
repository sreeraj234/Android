package com.example.love_hate;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    String[] L = {"@drawable/a","@drawable/b","@drawable/c","@drawable/d"};
    String[] H = {"@drawable/p","@drawable/q","@drawable/r","@drawable/s"};
    int i=0,j=0;
    
    public void love(View view){
        i++;
        if(i>3) i=0;
        ImageView img= (ImageView) findViewById(R.id.first);
        int ResId = getResources().getIdentifier(L[i], "drawable",getPackageName());
        img.setImageResource(ResId);
    }

    public void hate(View view){
        j++;
        if(j>3) j=0;
        ImageView img = (ImageView) findViewById(R.id.second);
        int ResId = getResources().getIdentifier(H[j], "drawable",getPackageName());
        img.setImageResource(ResId);
    }

}
