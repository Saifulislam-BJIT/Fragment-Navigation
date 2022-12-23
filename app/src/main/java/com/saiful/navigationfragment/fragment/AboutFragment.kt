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
import kotlinx.android.synthetic.main.fragment_about.*


class AboutFragment : Fragment() {

    private val args: AboutFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_about, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val trainee = args.trainee
        about_Title.text = "${trainee.name}\n${trainee.id}"
//        Log.d("TAG", "onViewCreated: $args")

        button_home_about.setOnClickListener {
            val action = AboutFragmentDirections.actionAboutToHome()
            findNavController().navigate(action)
        }

        button_profile_about.setOnClickListener {
            val action = AboutFragmentDirections.actionAboutToProfile()
            findNavController().navigate(action)
        }

        button_edit_about.setOnClickListener {
            val trainee = Trainee(args.trainee.name, args.trainee.id)
            val action = AboutFragmentDirections.actionAboutFragmentToEditFragment(trainee)
            findNavController().navigate(action)
        }
    }
}