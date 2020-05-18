package com.ayoubsmatti.mymovies.View;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.ayoubsmatti.mymovies.R;

public class DetailsActivity extends AppCompatActivity {
    private TextView title,genre,year;
    private ImageView imageView;
    private Bundle extras;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        extras = getIntent().getExtras();
        title = findViewById(R.id.mytitle);
        year = findViewById(R.id.myyear);
        genre = findViewById(R.id.mygenre);
        imageView = findViewById(R.id.movieImageView);

        if (extras != null){
            title.setText(extras.getString("title"));
            genre.setText(extras.getString("genre"));
            year.setText(extras.getString("year"));
            imageView.setImageResource(extras.getInt("image"));
        }

    }
}
