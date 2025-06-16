package com.mayerdoua.drayer;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private DrawerLayout drawerLayout;
    private NavigationView navigationView;
    private ImageView dot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        drawerLayout = findViewById(R.id.drawer_layout);
        navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        dot = findViewById(R.id.dot);
        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // ড্রয়ার ওপেন
                drawerLayout.openDrawer(GravityCompat.START);
            }
        });

    } ///////////


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        // মেনু আইটেম ক্লিক হ্যান্ডেল
        int id = item.getItemId();
        if (id == R.id.nav_home) {
            // Home ক্লিক হ্যান্ডেল
        } else if (id == R.id.nav_profile) {
            // Profile ক্লিক হ্যান্ডেল
        }
        drawerLayout.closeDrawer(GravityCompat.START); // ক্লিকের পর ড্রয়ার বন্ধ :contentReference[oaicite:8]{index=8}
        return true;
    }




}