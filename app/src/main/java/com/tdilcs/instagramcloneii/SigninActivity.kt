package com.tdilcs.instagramcloneii

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Button
import com.tdilcs.instagramcloneii.databinding.ActivitySigninBinding

class SigninActivity : AppCompatActivity() {
    private var _binding:ActivitySigninBinding?=null
    private val binding get()=_binding!!

     fun onCreate(inflater:LayoutInflater, container:ViewGroup? ,savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signin)

        _binding=ActivitySigninBinding.inflate(inflater, container, false)
        _binding!!.signupLinkBtn.setOnClickListener{
            startActivity(Intent(this, SignupActivity::class.java))
        }
    }
}
