package com.nikhil.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button spotifyStreamer = (Button) findViewById(R.id.spotifyStreamer);
        spotifyStreamer.setOnClickListener(this);
        spotifyStreamer.setTag(spotifyStreamer.getText());

        Button scoresApp = (Button) findViewById(R.id.scoresApp);
        scoresApp.setOnClickListener(this);
        scoresApp.setTag(scoresApp.getText());

        Button libraryApp = (Button) findViewById(R.id.libraryApp);
        libraryApp.setOnClickListener(this);
        libraryApp.setTag(libraryApp.getText());

        Button buildItBigger = (Button) findViewById(R.id.buildItBigger);
        buildItBigger.setOnClickListener(this);
        buildItBigger.setTag(buildItBigger.getText());

        Button xyzReader = (Button) findViewById(R.id.xyzReader);
        xyzReader.setOnClickListener(this);
        xyzReader.setTag(xyzReader.getText());

        Button capstoneMyApp = (Button) findViewById(R.id.capstoneMyApp);
        capstoneMyApp.setOnClickListener(this);
        capstoneMyApp.setTag(getString(R.string.capstone));

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {

        Toast.makeText(MainActivity.this, getString(R.string.toast_text) + " " + v.getTag().toString().toLowerCase() + " " + getString(R.string.app), Toast.LENGTH_SHORT).show();

    }
}
