package com.example.android.music_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static android.R.attr.start;

public class MyAlbums extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_albums);

        //Find the View that returns to the Main Page
        Button mainPage = (Button) findViewById (R.id.returnPage);
                //Set a click Listener
        mainPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view) {
                //Create Intent
                Intent returnPageIntent = new Intent (MyAlbums.this, MainPage.class);
                //start activity
                startActivity(returnPageIntent);
            }
                                    });

        //Find the View that opens Create Music
        Button create = (Button) findViewById(R.id.create_music);

        //Set A Click Listener
        create.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick (View view) {
                //Create Intent to open Create Music
                Intent createIntent = new Intent(MyAlbums.this, Create.class);
                //Start Activity
                startActivity(createIntent);
            }
        });

        //Find the View that Opens Concerts Around
        Button concerts = (Button) findViewById(R.id.concerts);
        //Set a Click Listener
        concerts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view) {
                //Create Intent
                Intent concertsIntent = new Intent (MyAlbums.this, Concerts.class);
                //start activity
                startActivity(concertsIntent);


            }
        });
    }
}
