package com.saiful.navigationfragment.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.saiful.navigationfragment.R
import com.saiful.navigationfragment.Trainee
import kotlinx.android.synthetic.main.fragment_profile.*


class ProfileFragment : Fragment() {

    private val args: ProfileFragmentArgs by navArgs()
//    val args: ProfileFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_profile, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        profile_Title.text = args.id.toString()

        button_home_profile.setOnClickListener {
            val action = ProfileFragmentDirections.actionProfileToHome()
            findNavController().navigate(action)
        }

        button_about_profile.setOnClickListener {
            val action = ProfileFragmentDirections.actionProfileToAbout(Trainee())
            findNavController().navigate(action)
        }
    }
}