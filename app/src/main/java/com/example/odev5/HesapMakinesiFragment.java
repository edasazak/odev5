package com.example.odev5;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.odev5.databinding.FragmentHesapMakinesiBinding;

import java.util.ArrayList;

public class HesapMakinesiFragment extends Fragment {
    private FragmentHesapMakinesiBinding binding;
    boolean addition = true;
    int sayi1;
    int sayi2;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentHesapMakinesiBinding.inflate(inflater, container, false);

        binding.button1.setOnClickListener(v -> {
            binding.textView.setText(binding.button1.getText());
        });
        binding.button2.setOnClickListener(v -> {
            binding.textView.setText(binding.button2.getText());
        });
        binding.button3.setOnClickListener(v -> {
            binding.textView.setText(binding.button3.getText());
        });
        binding.button4.setOnClickListener(v -> {
            binding.textView.setText(binding.button4.getText());
        });
        binding.button5.setOnClickListener(v -> {
            binding.textView.setText(binding.button5.getText());
        });
        binding.button6.setOnClickListener(v -> {
            binding.textView.setText(binding.button6.getText());
        });
        binding.button7.setOnClickListener(v -> {
            binding.textView.setText(binding.button7.getText());
        });
        binding.button8.setOnClickListener(v -> {
            binding.textView.setText(binding.button8.getText());
        });
        binding.button9.setOnClickListener(v -> {
            binding.textView.setText(binding.button9.getText());
        });
        binding.button0.setOnClickListener(v -> {
            binding.textView.setText(binding.button0.getText());
        });

        binding.buttonArti.setOnClickListener(v -> {
            if(binding.textView == null){
                binding.textView.setText("");
            }else{
                sayi1 = Integer.parseInt((String) binding.textView.getText());
                addition = true;
                //binding.textView.setText(null);
            }
        });

        binding.buttonEsittir.setOnClickListener(v -> {
            sayi2 = Integer.parseInt((String) binding.textView.getText());
            if(addition == true){
                binding.textView.setText(sayi1+sayi2+"");
                addition=false;
            }
        });

        binding.buttonClear.setOnClickListener(v -> {
            binding.textView.setText("");
        });

        return binding.getRoot();

    }
}