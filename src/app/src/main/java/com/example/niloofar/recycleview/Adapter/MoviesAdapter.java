package com.example.niloofar.recycleview.Adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.niloofar.recycleview.Model.Movie;
import com.example.niloofar.recycleview.R;

import java.util.List;

public class MoviesAdapter extends RecyclerView.Adapter<MoviesAdapter.MovieViewHolder> {

    List<Movie>movies;

    public MoviesAdapter(List<Movie> movies) {
        this.movies = movies;
    }

    @NonNull
    @Override
    public MovieViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View view= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.movie_list_row,viewGroup,false);

        return new MovieViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MovieViewHolder movieViewHolder, int i) {

        Movie movie=movies.get(i);
        movieViewHolder.txvTitle.setText(movie.getTitle());
        movieViewHolder.txvGenre.setText(movie.getGenre());
        movieViewHolder.txvYear.setText(movie.getYear());


    }

    @Override
    public int getItemCount() {
        return movies.size();
    }

    public class MovieViewHolder extends RecyclerView.ViewHolder {

        public TextView txvTitle;
        public TextView txvGenre;
        public TextView txvYear;


        public MovieViewHolder(@NonNull View itemView) {
            super(itemView);

            txvTitle=itemView.findViewById(R.id.txv_title);
            txvGenre=itemView.findViewById(R.id.txv_genre);
            txvYear=itemView.findViewById(R.id.txv_year);

        }
    }
}
