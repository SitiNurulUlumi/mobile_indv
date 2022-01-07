package com.example.myuas;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {

    private DrawerLayout draw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        draw = findViewById(R.id.drawer_layout);
        final ActionBarDrawerToggle t = new ActionBarDrawerToggle(this, draw,
                R.string.open,
                R.string.close);

        draw.addDrawerListener(t);
        t.syncState();

        NavigationView navigationview = findViewById(R.id.nav);
        navigationview.setItemIconTintList(null);

        navigationview.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();
                switch(id) {
                    case R.id.item1:
                        Toast.makeText(MainActivity.this,
                                "Item1 di klik", Toast.LENGTH_SHORT).show();
                        Intent Intent =new Intent(getApplicationContext(), SplashScreen.class);
                        startActivity(Intent);
                        break;
                    case R.id.item2:
                        Toast.makeText(MainActivity.this,
                                "Item2 di klik", Toast.LENGTH_SHORT).show();
                        Intent IntenT =new Intent(getApplicationContext(), MainActivityProfil.class);
                        startActivity(IntenT);
                        break;
                    case R.id.item3:
                        Toast.makeText(MainActivity.this,
                                "Item3 di klik", Toast.LENGTH_SHORT).show();
                        Intent IntEnt =new Intent(getApplicationContext(), MainActivityFb.class);
                        startActivity(IntEnt);
                        break;
                    case R.id.item4:
                        Toast.makeText(MainActivity.this,
                                "Item4 di klik", Toast.LENGTH_SHORT).show();
                        Intent inTent =new Intent(getApplicationContext(), MainActivityIg.class);
                        startActivity(inTent);
                        break;
                    case R.id.lain1:
                        Toast.makeText(MainActivity.this,
                                "Lain1 di klik", Toast.LENGTH_SHORT).show();
                        Intent IntEnT =new Intent(getApplicationContext(), MainActivitySet.class);
                        startActivity(IntEnT);
                        break;
                    case R.id.lain2:
                        Toast.makeText(MainActivity.this,
                                "Lain2 di klik", Toast.LENGTH_SHORT).show();
                        Intent InteNt =new Intent(getApplicationContext(), MainActivityBantuan.class);
                        startActivity(InteNt);
                        break;
                }
                return true;
            }
        });
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            openDrawer();
            if (item.getItemId() == android.R.id.home) {
                if ((draw) != null && (draw.isDrawerOpen(GravityCompat.START)))
                    closeDrawer();
            }
        }
        return true;
    }

    @SuppressWarnings("deprecation")
    private void closeDrawer() {
        draw.setDrawerListener(null);
        draw.closeDrawers();
    }
    @SuppressWarnings("deprecation")
    private void openDrawer() {
        draw.setDrawerListener(null);
        draw.openDrawer(GravityCompat.START);
    }
}