package com.example.odev5;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.NavigationUI;

import android.os.Bundle;
import android.os.Handler;

import com.example.odev5.databinding.ActivityMainBinding;
import com.example.odev5.databinding.FragmentAnasayfaBinding;

public class MainActivity extends AppCompatActivity{
    private ActivityMainBinding binding;
    Runnable runnable;
    Handler handler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        handler = new Handler();
        runnable = new Runnable() {
            @Override
            public void run() {
                getSupportFragmentManager().beginTransaction().replace(R.id.navHostFragment, new HesapMakinesiFragment()).commit();
            }
        };handler.postDelayed(runnable, 3000);
    }
}