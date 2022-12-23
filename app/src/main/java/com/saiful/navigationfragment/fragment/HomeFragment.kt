package com.saiful.navigationfragment.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.saiful.navigationfragment.R
import com.saiful.navigationfragment.Trainee
import kotlinx.android.synthetic.main.fragment_home.*


class HomeFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        button_about_home.setOnClickListener {
            val trainee = Trainee("saiful", 30046)
            val action = HomeFragmentDirections.actionHomeToAbout(trainee)
            findNavController().navigate(action)
        }

        button_profile_home.setOnClickListener {
            val action = HomeFragmentDirections.actionHomeToProfile(30046)
            findNavController().navigate(action)
        }
    }

}