package com.tdilcs.instagramcloneii.fragments

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.tdilcs.instagramcloneii.AccountSettingsActivity
import com.tdilcs.instagramcloneii.R
import com.tdilcs.instagramcloneii.databinding.FragmentHomeBinding
import com.tdilcs.instagramcloneii.databinding.FragmentProfileBinding


class ProfileFragment : Fragment() {
    private var _binding:FragmentProfileBinding?=null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding=FragmentProfileBinding.inflate(inflater, container, false)
        _binding!!.editAccountSettingsBtn.setOnClickListener{
            startActivity(Intent(context, AccountSettingsActivity::class.java))
        }
        return  binding.root
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding=null
    }
}