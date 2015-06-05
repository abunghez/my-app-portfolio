package com.bgz.project0;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.HashMap;
import java.util.Map;


public class MainActivity extends ActionBarActivity {


    private Button mSpotifyButton, mScoresButton, mLibraryButton, mBuildItButton, mXyzReaderButton,
        mCapstoneButton;
    private View.OnClickListener ocl = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            CharSequence message;
            switch (v.getId()) {
                case R.id.spotifyButton:
                    message = getResources().getString(R.string.spotify_toast);
                    break;
                case R.id.scoresButton:
                    message = getResources().getString(R.string.scores_toast);
                    break;

                case R.id.libraryButton:
                    message = getResources().getString(R.string.library_toast);
                    break;

                case R.id.buildItButton:
                    message = getResources().getString(R.string.build_it_toast);
                    break;

                case R.id.xyzButton:
                    message = getResources().getString(R.string.xyz_toast);
                    break;

                case R.id.capstoneButton:
                    message = getResources().getString(R.string.caps_toast);
                    break;

                default:
                    message = "Unknown";
            }

            Toast.makeText(MainActivity.this, message, Toast.LENGTH_SHORT).show();

        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mSpotifyButton = (Button)findViewById(R.id.spotifyButton);
        mScoresButton  = (Button)findViewById(R.id.scoresButton);
        mLibraryButton = (Button)findViewById(R.id.libraryButton);
        mBuildItButton = (Button)findViewById(R.id.buildItButton);
        mXyzReaderButton = (Button)findViewById(R.id.xyzButton);
        mCapstoneButton = (Button)findViewById(R.id.capstoneButton);

        mSpotifyButton.setOnClickListener(ocl);
        mScoresButton.setOnClickListener(ocl);
        mLibraryButton.setOnClickListener(ocl);
        mBuildItButton.setOnClickListener(ocl);
        mXyzReaderButton.setOnClickListener(ocl);
        mCapstoneButton.setOnClickListener(ocl);

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
