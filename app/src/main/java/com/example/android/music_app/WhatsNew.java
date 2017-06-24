package com.example.android.music_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;
import static android.os.Build.VERSION_CODES.M;

public class WhatsNew extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_whats_new);

        //Find the View that opens My Albums
        Button myAlbums = (Button) findViewById(R.id.my_albums);

        //Find the View that returns to the Main Page
        Button mainPage = (Button) findViewById (R.id.returnPage);
        //Set a click Listener
        mainPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view) {
                //Create Intent
                Intent returnPageIntent = new Intent (WhatsNew.this, MainPage.class);
                //start activity
                startActivity(returnPageIntent);
            }
        });

        // Set on Click Listener
        myAlbums.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view) {
                //Creates Intent that opens my albums
                Intent myAlbumsIntent = new Intent (WhatsNew.this, MyAlbums.class);
                //Starts Activity
                startActivity(myAlbumsIntent);
            }
        });

        //Find the View that Opens Concerts Around
        Button concerts = (Button) findViewById(R.id.concerts_around);
        //Set a Click Listener
        concerts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view) {
                //Create Intent
                Intent concertsIntent = new Intent(WhatsNew.this, Concerts.class);
                //start activity
                startActivity(concertsIntent);

            }
        });

    }
}
