package com.example.projet;


import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity5 extends AppCompatActivity {

    ImageView mImageView;
    Button mChooseBtn;

    private static final int Image_pick_code = 1000;
    private static final int PERMISSION_code= 1001;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        mImageView = findViewById(R.id.image2);
        mChooseBtn =findViewById(R.id.button5);

        mChooseBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
           //check runtime permission
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                    if (checkSelfPermission(Manifest.permission.READ_EXTERNAL_STORAGE) == PackageManager.PERMISSION_DENIED) {
                       //permission not granted ,request it.
                        String[] permissions ={Manifest.permission.READ_EXTERNAL_STORAGE};
                      //show popup for runtime permissions
                        requestPermissions(permissions, PERMISSION_code);
                    } else {
                        //permission already granted
                        pickImageFromGallery();
                    }
                }
                else{
                //system os is less then marshmallow
                    pickImageFromGallery();
                }

            }
        });
    }

    private void pickImageFromGallery(){
        //intent to pick image
        Intent intent = new Intent (Intent.ACTION_PICK);
        intent.setType("image/*");
        startActivityForResult(intent, Image_pick_code);


    }
    //handle result of runtime permission


    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        switch (requestCode){
            case PERMISSION_code:{
              if(grantResults.length >0 && grantResults[0] == PackageManager.PERMISSION_GRANTED  ){
                  //permission was granted
                pickImageFromGallery();
              }
             else{
                 //permission was denied
                  Toast.makeText(this,"Permission denied...!", Toast.LENGTH_SHORT).show();


              }

            }

        }
    }
         // handle result of picked image
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == RESULT_OK && requestCode == Image_pick_code) {
            mImageView.setImageURI(data.getData());

        }
    }
}