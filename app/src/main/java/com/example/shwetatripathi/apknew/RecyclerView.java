package com.example.shwetatripathi.apknew;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.os.Handler;

public class RecyclerView extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);


recyclerView= (RecyclerView)findViewById(R.id.recycler_view);



    }
}
