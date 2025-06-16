<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools">

    <application
        android:allowBackup="true"
        android:dataExtractionRules="@xml/data_extraction_rules"
        android:fullBackupContent="@xml/backup_rules"
        android:icon="@mipmap/ic_launcher"
        android:label="@string/app_name"
        android:roundIcon="@mipmap/ic_launcher_round"
        android:supportsRtl="true"
        android:theme="@style/Theme.Drayer"
        tools:targetApi="31">

        <activity
            android:name=".MainActivity"
            android:exported="true">
            <intent-filter>
                <action android:name="android.intent.action.MAIN" />

                <category android:name="android.intent.category.LAUNCHER" />
            </intent-filter>
        </activity>
    </application>

</manifest>







///////////////////////////////////2222222222222222222222222222222222222
MainAcitivity.java


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

///////////////33333333333333333333333333333333333333333333333333
acativity_main.xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:id="@+id/main"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity"
    android:orientation="vertical">


    <androidx.drawerlayout.widget.DrawerLayout
        xmlns:android="http://schemas.android.com/apk/res/android"
        android:id="@+id/drawer_layout"
        android:layout_width="match_parent"
        android:layout_height="match_parent">

        <!-- Main Content: শুধুমাত্র Button -->
        <RelativeLayout
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            android:padding="16dp">

            <ImageView
                android:id="@+id/dot"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:src="@drawable/ic_info"
                android:layout_centerInParent="true"/>
        </RelativeLayout>


        <!-- Akhane Baki Design code korben -->



        <!-- Navigation Drawer View -->
        <com.google.android.material.navigation.NavigationView
            android:id="@+id/nav_view"
            android:layout_width="wrap_content"
            android:layout_height="match_parent"
            android:layout_gravity="start"
            app:menu="@menu/nav_menu"
            app:headerLayout="@layout/nav_header"/>
    </androidx.drawerlayout.widget.DrawerLayout>


</LinearLayout>
/////////////////444444444444444444444444444444444/////////////////////////////////////////////////////
layout: nev_header.xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:orientation="vertical"
    android:layout_width="match_parent"
    android:layout_height="160dp"
    android:background="#91BD5F"
    android:padding="16dp">

    <ImageView
        android:layout_width="64dp"
        android:layout_height="64dp"
        android:src="@drawable/ic_info"/>

    <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Username"
        android:textSize="18sp"
        android:paddingTop="8dp"/>
</LinearLayout>
/////////5555555555555555555555555555555555///////////////////////////////////////////////////
nev-menu///
<?xml version="1.0" encoding="utf-8"?>
<menu xmlns:android="http://schemas.android.com/apk/res/android">
    <item
        android:id="@+id/nav_home"
        android:icon="@drawable/ic_info"
        android:title="Home" />
    <item
        android:id="@+id/nav_profile"
        android:icon="@drawable/ic_info"
        android:title="Profile" />
    <!-- প্রয়োজনমতো আরও আইটেম যোগ করুন -->
</menu>

/////////////////////////
 implementation 'androidx.drawerlayout:drawerlayout:1.1.1'  

