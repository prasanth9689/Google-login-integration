package com.skyblue.skybluea.kotlin_sample

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.skyblue.skybluea.R
import com.skyblue.skybluea.databinding.ActivityKotlinGoogleSignInBinding
import com.skyblue.skybluea.databinding.ActivityKotlinProfileBinding

class KotlinProfileActivity : AppCompatActivity() {
    private lateinit var binding: ActivityKotlinProfileBinding
    private var context: Context = this@KotlinProfileActivity
    var googleData: String? = null
    var googleProfileImage: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityKotlinProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val intent = intent
        googleData = intent.getStringExtra("googleData")
        googleProfileImage = intent.getStringExtra("googleProfileImage")
        Glide.with(this@KotlinProfileActivity)
            .load(googleProfileImage)
            .circleCrop()
            .into(binding.userImage)
        binding.userValues.text = googleData
    }
}