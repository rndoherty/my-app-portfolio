package com.rndoherty.udacityappportfolio;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
//import android.view.Menu;
//import android.view.MenuItem;

import android.view.*;
import android.content.*;
import android.widget.*;

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }

    /** Called when the user touches the button */
    public void displayToast(View view) {
        // Do something in response to button click
        Context context = getApplicationContext();
        CharSequence text = "";
        int duration = Toast.LENGTH_SHORT;

        switch (view.getId()) {
            case R.id.btnSpotifyStreamer:
                text="You clicked on Spotify Streamer";
                break;
            case R.id.btnScoresApp:
                text="You clicked on Scores App";
                break;
            case R.id.btnLibraryApp:
                text="You clicked on Library App";
                break;
            case R.id.btnBuildItBigger:
                text="You clicked on Build It Bigger";
                break;
            case R.id.btnXYZReader:
                text="You clicked on XYZ Reader";
                break;
            case R.id.btnCapstone:
                text="You clicked on Capstone";
                break;

        }

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
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
}
