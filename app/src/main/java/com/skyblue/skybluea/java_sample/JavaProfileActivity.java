package com.skyblue.skybluea.java_sample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.skyblue.skybluea.R;
import com.skyblue.skybluea.databinding.ActivityJavaProfileBinding;

public class JavaProfileActivity extends AppCompatActivity {
    private ActivityJavaProfileBinding binding;
    private final Context context = this;
    String googleData, googleProfileImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityJavaProfileBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Intent intent = getIntent();

        googleData = intent.getStringExtra("googleData");
        googleProfileImage = intent.getStringExtra("googleProfileImage");

        Glide
                .with(JavaProfileActivity.this)
                .load(googleProfileImage)
                .apply(RequestOptions.circleCropTransform())
                .placeholder(R.drawable.ic_launcher_background)
                .into(binding.userImage);

        binding.userValues.setText(googleData);
    }
}