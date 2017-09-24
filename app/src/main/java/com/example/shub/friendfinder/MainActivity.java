package com.example.shub.friendfinder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.content.Intent;
import android.widget.ImageView;
import android.widget.EditText;
import android.support.v7.widget.Toolbar;
import android.provider.MediaStore;
import android.graphics.Bitmap;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity  {
    static final int REQUEST_IMAGE_CAPTURE = 1;
    ImageView image_rec;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        /*super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);*/

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button image_cap = (Button) findViewById(R.id.button1);
        Button submit = (Button) findViewById(R.id.submit_b);
        Button image_gal = (Button) findViewById(R.id.button_gallery);
        image_rec = (ImageView) findViewById(R.id.imageView3);

        image_cap.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                dispatchTakePictureIntent();
            }
        });
        image_gal.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                dispatchGetPictureIntent();
            }
        });
         submit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                dispatchNewActivityIntent();
            }
        });


        /*//CREATES AN INSTANCE FOR LOCATION
        mFusedLocationClient = LocationServices.getFusedLocationProviderClient(this);
        mFusedLocationClient.getLastLocation().addOnSuccessListener(this, new OnSuccessListener<Location>() {
            @Override
            public void onSuccess(Location location) {
                // Got last known location. In some rare situations this can be null.
                if (location != null) {
                    // Logic to handle location object
                }
            }
        });*/
    }









    private void dispatchTakePictureIntent() {
        Intent takePictureIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        if (takePictureIntent.resolveActivity(getPackageManager()) != null) {
            startActivityForResult(takePictureIntent, REQUEST_IMAGE_CAPTURE);
        }
    }

    private void dispatchGetPictureIntent() {
        Intent getPictureIntent = new Intent(Intent.ACTION_PICK, android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
        startActivityForResult(getPictureIntent, 1);

    }

    private void dispatchNewActivityIntent() {
        Intent intent = new Intent(this, freetime.class);
        this.startActivity(intent);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == REQUEST_IMAGE_CAPTURE && resultCode == RESULT_OK) {
            Bundle extras = data.getExtras();
            Bitmap imageBitmap = (Bitmap) extras.get("data");
            image_rec.setImageBitmap(imageBitmap);
        }
        if (requestCode == 1 && resultCode == RESULT_OK) {
            Bundle extras = data.getExtras();
            Bitmap imageBitmap = (Bitmap) extras.get("data");
            image_rec.setImageBitmap(imageBitmap);
        }
    }



}




