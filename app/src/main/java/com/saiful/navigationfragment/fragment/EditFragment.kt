package com.saiful.navigationfragment.fragment

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.saiful.navigationfragment.R
import com.saiful.navigationfragment.Trainee
import kotlinx.android.synthetic.main.fragment_edit.*

class EditFragment : Fragment() {

    private val args: EditFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_edit, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        trainee_name.setText(args.trainee.name)
        trainee_id.setText(args.trainee.id.toString())
//        Log.d("TAG", "onViewCreated: ${args.trainee.name}")

        update.setOnClickListener {
//            Log.d("TAG", "onViewCreated: ${trainee_name.text.toString()}")
            val trainee = Trainee(trainee_name.text.toString(), trainee_id.text.toString().toInt())
            Log.d("TAG", "onViewCreated: $trainee")
            val action = EditFragmentDirections.actionEditFragmentToAboutFragment(trainee)
            findNavController().navigate(action)
        }
    }

}