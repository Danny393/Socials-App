package com.example.socials;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;


import android.os.Bundle;
import android.view.MenuItem;


import com.example.socials.fragments.ComposeFragment;
import com.example.socials.fragments.PostsFragment;
import com.example.socials.fragments.ProfileFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;


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
                    frag = new ProfileFragment();
                }
                else if(item.getItemId() == R.id.action_compose) {
                    frag = new ComposeFragment();
                }
                else{
                    frag = new PostsFragment();
                }

                fragManager.beginTransaction().replace(R.id.flContainer, frag).commit();

                return true;
            }
        });

        //default selection
        bnvNavBar.setSelectedItemId(R.id.action_home);
    }
}