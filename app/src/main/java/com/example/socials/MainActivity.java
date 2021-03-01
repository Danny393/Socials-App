package com.example.socials;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.FileProvider;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.socials.fragments.ComposeFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.parse.FindCallback;
import com.parse.ParseException;
import com.parse.ParseFile;
import com.parse.ParseQuery;
import com.parse.ParseUser;
import com.parse.SaveCallback;

import java.io.File;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bnvNavBar;
    final FragmentManager fragManager = getSupportFragmentManager();
    String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bnvNavBar = findViewById(R.id.bnvNav);

        bnvNavBar.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment frag;
                if(item.getItemId() == R.id.action_profile){
                    frag = new ComposeFragment();
                }
                else if(item.getItemId() == R.id.action_compose) {
                    frag = new ComposeFragment();
                }
                else{
                    frag = new ComposeFragment();
                }

                fragManager.beginTransaction().replace(R.id.flContainer, frag).commit();

                return true;
            }
        });

        //default selection
        bnvNavBar.setSelectedItemId(R.id.action_home);
    }
}