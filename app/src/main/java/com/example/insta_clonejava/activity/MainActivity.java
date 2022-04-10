package com.example.insta_clonejava.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.insta_clonejava.R;
import com.example.insta_clonejava.adapter.ViewPagerAdapter;
import com.example.insta_clonejava.fragment.FavoriteFragment;
import com.example.insta_clonejava.fragment.HomeFragment;
import com.example.insta_clonejava.fragment.ProfileFragment;
import com.example.insta_clonejava.fragment.SearchFragment;
import com.example.insta_clonejava.fragment.UploadFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

/**
 * It contains view pager with 5 fargments in MainActivity,
 * and pager can be controlled by BottomNavigationView
 */

public class MainActivity extends BaseActivity {
    private static final String TAG = MainActivity.class.getSimpleName();
    int index =0;
    HomeFragment homeFragment;
    UploadFragment uploadFragment;
    ViewPagerAdapter viewPagerAdapter;
    ViewPager viewPager;
    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

    private void initViews() {
        viewPager = findViewById(R.id.viewPager);
        bottomNavigationView = findViewById(R.id.bottomNavigationView);

        bottomNavigationView.setOnItemSelectedListener(item -> {
            switch (item.getItemId()){
                case R.id.navigation_home:
                    viewPager.setCurrentItem(0);
                    break;
                case R.id.navigation_search:
                    viewPager.setCurrentItem(1);
                    break;
                case R.id.navigation_upload:
                    viewPager.setCurrentItem(2);
                    break;
                case R.id.navigation_favorite:
                    viewPager.setCurrentItem(3);
                    break;
                case R.id.navigation_profile:
                    viewPager.setCurrentItem(4);
                    break;
            }
            return true;
        });

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                index = position;
                bottomNavigationView.getMenu().getItem(index).setChecked(true);
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

        /**
         * Home and Upload Fragments are global for communication purpose
         */

        setViewPager(viewPager);
    }

    private void setViewPager(ViewPager viewPager){
        viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());

        viewPagerAdapter.add(new HomeFragment(),"");
        viewPagerAdapter.add(new SearchFragment(),"");
        viewPagerAdapter.add(new UploadFragment(),"");
        viewPagerAdapter.add(new FavoriteFragment(),"");
        viewPagerAdapter.add(new ProfileFragment(),"");
        
        viewPager.setAdapter(viewPagerAdapter);
    }
}