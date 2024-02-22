package com.tdilcs.instagramcloneii

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import com.tdilcs.instagramcloneii.R.*
import com.tdilcs.instagramcloneii.databinding.ActivitySigninBinding
import com.tdilcs.instagramcloneii.databinding.ActivitySignupBinding

class SignupActivity : AppCompatActivity() {
    private var _binding:ActivitySignupBinding?=null
    private val binding get()=_binding!!

    fun onCreate(inflater: LayoutInflater, container:ViewGroup?, savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        _binding=ActivitySignupBinding.inflate(inflater, container, false)
        _binding!!.signupBtn.setOnClickListener{
            startActivity(Intent(this, SignupActivity::class.java))
        }
    }
}