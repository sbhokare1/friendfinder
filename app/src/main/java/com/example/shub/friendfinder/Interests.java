package com.example.shub.friendfinder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.content.Intent;
import android.widget.ImageView;
import android.widget.EditText;
import android.support.v7.widget.Toolbar;
import android.provider.MediaStore;
import android.graphics.Bitmap;
import android.view.MenuItem;
import android.graphics.BitmapFactory;
import android.widget.ListView;
import android.widget.ArrayAdapter;
import android.location.LocationListener;
import android.Manifest.permission;
import android.widget.Toast;
import android.widget.Button;

public class Interests extends AppCompatActivity {

    /*//DECLARATIONS FOR LOCATION DETERMINATION
    // GPSTracker class
    GPSTracker gps;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interests);

        Button btnShowLocation = (Button) findViewById(R.id.btnShowLocation);

        // Show location button click event
        btnShowLocation.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // Create class object
                gps = new GPSTracker(Interests.this);

                // Check if GPS enabled
                if(gps.canGetLocation()) {

                    double latitude = gps.getLatitude();
                    double longitude = gps.getLongitude();

                    // \n is for new line
                    Toast.makeText(getApplicationContext(), "Your Location is - \nLat: " + latitude + "\nLong: " + longitude, Toast.LENGTH_LONG).show();

                } else {
                    // Can't get location.
                    // GPS or network is not enabled.
                    // Ask user to enable GPS/network in settings.
                    gps.showSettingsAlert();
                }
            }
        });
    }

    */

    public void onCheckboxClicked(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();

        // Check which checkbox was clicked
        switch (view.getId()) {
            case R.id.checkbox_meal:
                if (checked) {
                    Intent intent = new Intent(this, MapsActivity.class);
                    this.startActivity(intent);
                }
                else

                    break;
            case R.id.checkbox_coffee:
                if (checked) {
                    Intent intent = new Intent(this, MapsActivity.class);
                    this.startActivity(intent);
                }
                else

                    break;
            case R.id.checkbox_switch:
                if (checked) {
                    Intent intent = new Intent(this, MapsActivity.class);
                    this.startActivity(intent);
                }
                else

                    break;
            case R.id.checkbox_Soccer:
                if (checked) {
                    Intent intent = new Intent(this, MapsActivity.class);
                    this.startActivity(intent);
                }
                else

                    break;
            case R.id.checkbox_Basketball:
                if (checked) {
                    Intent intent = new Intent(this, MapsActivity.class);
                    this.startActivity(intent);
                }
                else

                    break;
            case R.id.checkbox_volleyball:
                if (checked) {
                    Intent intent = new Intent(this, MapsActivity.class);
                    this.startActivity(intent);
                }
                else

                    break;
            case R.id.checkbox_Tennis:
                if (checked) {
                    Intent intent = new Intent(this, MapsActivity.class);
                    this.startActivity(intent);
                }
                else

                    break;
            case R.id.checkbox_chat:
                if (checked) {
                    Intent intent = new Intent(this, MapsActivity.class);
                    this.startActivity(intent);
                }
                else

                    break;
            case R.id.checkbox_Pingpong:
                if (checked) {
                    Intent intent = new Intent(this, MapsActivity.class);
                    this.startActivity(intent);
                }
                else

                    break;
            case R.id.checkbox_console:
                if (checked) {
                    Intent intent = new Intent(this, MapsActivity.class);
                    this.startActivity(intent);
                }
                else

                    break;
            case R.id.checkbox_movie:
                if (checked) {
                    Intent intent = new Intent(this, MapsActivity.class);
                    this.startActivity(intent);
                }
                else

                    break;
            case R.id.checkbox_gym:
                if (checked) {
                    Intent intent = new Intent(this, MapsActivity.class);
                    this.startActivity(intent);
                }
                else

                    break;

        }
    }
}
