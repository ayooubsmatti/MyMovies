package com.ayoubsmatti.mymovies;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.ayoubsmatti.mymovies.Controller.MoviesAdapter;
import com.ayoubsmatti.mymovies.Model.Movie;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Movie> movieList = new ArrayList<>();
    private RecyclerView recyclerView;
    private MoviesAdapter moviesAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView =findViewById(R.id.recyclerView);
        moviesAdapter = new MoviesAdapter(this,movieList);
        RecyclerView.LayoutManager layoutManager= new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(moviesAdapter);

        MovieData();
    }

    private void MovieData() {
        Movie movie = new Movie("The Shawshank Redemption","Drama ","1994",R.drawable.a1);
        movieList.add(movie);
        moviesAdapter.notifyDataSetChanged();
    }
}
