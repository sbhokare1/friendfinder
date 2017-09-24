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

public class Interests extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interests);
    }

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
            case R.id.checkbox_library:
                if (checked) {
                    Intent intent = new Intent(this, MapsActivity.class);
                    this.startActivity(intent);
                }
                else

                    break;
            case R.id.checkbox_bars:
                if (checked) {
                    Intent intent = new Intent(this, MapsActivity.class);
                    this.startActivity(intent);
                }
                else

                    break;
        }
    }
}
