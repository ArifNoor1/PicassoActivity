package com.example.picassoactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.imgPicasso);
        String url = "https://i.pinimg.com/736x/76/6e/0e/766e0eb0923c79a51cf34ddba5187970.jpg";

        Picasso.get()
                .load(url)
                .into(imageView);
    }
}