package com.example.assignment.ui.Login

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation
import com.example.assignment.R

class LoginPage : Fragment() {


   private lateinit var signInButton:Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view: View = inflater.inflate(R.layout.fragment_login_page, container, false)
        signInButton=view.findViewById(R.id.loginButton)
        signInButton.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.loginPage)
        }
        return view
    }

}