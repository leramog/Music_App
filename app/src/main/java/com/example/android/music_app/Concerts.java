package com.example.android.music_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Concerts extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_concerts);


        //Find the View that returns to the Main Page
        Button mainPage = (Button) findViewById (R.id.returnPage);
        //Set a click Listener
        mainPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view) {
                //Create Intent
                Intent returnPageIntent = new Intent (Concerts.this, MainPage.class);
                //start activity
                startActivity(returnPageIntent);
            }
        });
        //Find the View that Opens My Albums
        TextView myAlbums = (TextView) findViewById(R.id.my_albums);

        //Set a click Listener on the View
        myAlbums.setOnClickListener(new View.OnClickListener() {
            //The code will be executed when view is clicked
            @Override
            public void onClick (View view) {
                //Create new Intent to open {@link MyAlums}
                Intent myAlbumsIntent = new Intent (Concerts.this, MyAlbums.class);
                //Start the new activity
                startActivity(myAlbumsIntent);
            }
        });

        //Find the View that Opens Whats New
        TextView whatsNew = (TextView) findViewById(R.id.whats_new);

        //Set a click Listener
        whatsNew.setOnClickListener(new View.OnClickListener(){
            //The code will be executed when View is clicked
            @Override
            public void onClick (View view) {
                //Create new Intent to open {@link Whats New}
                Intent whatsNewIntent = new Intent (Concerts.this, WhatsNew.class);
                //Start the new activity
                startActivity(whatsNewIntent);
            }
        });
    }
}
