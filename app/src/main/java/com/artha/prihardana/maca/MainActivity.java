package com.artha.prihardana.maca;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

import com.artha.prihardana.maca.Fragments.BeritaUtamaFragment;
import com.artha.prihardana.maca.Fragments.PopulerFragment;
import com.artha.prihardana.maca.Fragments.SumberFragment;

public class MainActivity extends AppCompatActivity {

    private ActionBar toolbar;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Fragment fragment;
            switch (item.getItemId()) {
                case R.id.navigation_berita:
                    toolbar.setTitle(R.string.title_berita);
                    fragment = new BeritaUtamaFragment();
                    loadFragment(fragment);
                    return true;
                case R.id.navigation_populer:
                    toolbar.setTitle(R.string.title_populer);
                    fragment = new PopulerFragment();
                    loadFragment(fragment);
                    return true;
                case R.id.navigation_sumber:
                    toolbar.setTitle(R.string.title_sumber);
                    fragment = new SumberFragment();
                    loadFragment(fragment);
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = getSupportActionBar();

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        toolbar.setTitle(R.string.title_berita);
        loadFragment(new BeritaUtamaFragment());
    }

    private void loadFragment(Fragment fragment) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frame_container, fragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }

}
