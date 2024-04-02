package com.skyblue.skybluea;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.skyblue.skybluea.databinding.ActivityMainBinding;
import com.skyblue.skybluea.java_sample.JavaGoogleSignInActivity;
import com.skyblue.skybluea.kotlin_sample.KotlinGoogleSignInActivity;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    private final Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.java.setOnClickListener(view -> startActivity(new Intent(context, JavaGoogleSignInActivity.class)));
        binding.kotlin.setOnClickListener(view -> startActivity(new Intent(context, KotlinGoogleSignInActivity.class)));
    }
}