package com.example.niloofar.recycleview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.niloofar.recycleview.Adapter.MoviesAdapter;
import com.example.niloofar.recycleview.Model.Movie;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Movie>movies=new ArrayList<>();
    private RecyclerView recyclerView;
    private MoviesAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=findViewById(R.id.rv_recycle);
        adapter=new MoviesAdapter(movies);

        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));
        recyclerView.setAdapter(adapter);
        setData();
    }

    private void setData(){

        movies.add(new Movie("Mad Max:Fury Road","Action & Advanture","2015"));
        adapter.notifyDataSetChanged();

    }
}
