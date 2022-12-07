package com.example.odev5;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.odev5.databinding.FragmentAnasayfaBinding;

import java.util.Timer;
import java.util.TimerTask;

public class AnasayfaFragment extends Fragment {
    private FragmentAnasayfaBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentAnasayfaBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }
}