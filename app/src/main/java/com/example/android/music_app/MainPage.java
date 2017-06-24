package com.example.android.music_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;

public class MainPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);

        //Find the View that Opens My Albums
        TextView myAlbums = (TextView) findViewById(R.id.album);

        //Set a cick Listener on the View
        myAlbums.setOnClickListener(new View.OnClickListener() {
            //The code will be executed when view is clicked
            @Override
            public void onClick (View view) {
                //Create new Intent to open {@link MyAlums}
                Intent myAlbumsIntent = new Intent (MainPage.this, MyAlbums.class);
                //Start the new activity
                startActivity(myAlbumsIntent);
            }
        });

        //Find the View that Opens Whats New
        TextView whatsNew = (TextView) findViewById(R.id.whatnew);

        //Set a click Listener
        whatsNew.setOnClickListener(new View.OnClickListener(){
            //The code will be executed when View is clicked
            @Override
            public void onClick (View view) {
                //Create new Intent to open {@link Whats New}
                Intent whatsNewIntent = new Intent (MainPage.this, WhatsNew.class);
                //Start the new activity
                startActivity(whatsNewIntent);
            }
        });

        //Find the View that Opens Create Music
        TextView create = (TextView) findViewById(R.id.create);

        //Set a click Listener
        create.setOnClickListener(new View.OnClickListener() {
            //The code will be executed when View is clicked
            @Override
            public void onClick (View view) {
                //Create new Intent that opens {@link Create Music}
                Intent createIntent = new Intent(MainPage.this, Create.class);
                //Start new activity
                startActivity(createIntent);
            }
        });

        //Find View that Opens Concerts
        TextView concerts = (TextView) findViewById(R.id.concerts);
        //Set a click Listener
        concerts.setOnClickListener( new View.OnClickListener() {
            //The code will be execuded when View is clicked
            @Override
            public void onClick (View view) {
                //Create new Intent that opens {@link Concerts}
                Intent concertsIntent = new Intent(MainPage.this, Concerts.class);
                //Start new activity
                startActivity(concertsIntent);
            }
        });
    }
}
