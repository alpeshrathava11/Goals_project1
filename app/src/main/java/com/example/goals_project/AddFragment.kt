package com.example.goals_project

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.goals_project.databinding.ActivityMainBinding
import com.example.goals_project.databinding.FragmentAddBinding
import com.example.goals_project.databinding.FragmentProfileBinding


class AddFragment : Fragment() {

    private lateinit var binding: FragmentAddBinding

    @SuppressLint("UseRequireInsteadOfGet")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        binding = FragmentAddBinding.inflate(inflater , container,false)
        val viewBinding = binding.root

        binding.motivationScreen.setOnClickListener {

            val intent = Intent(requireContext(),MotivationScreen::class.java)
            startActivity(intent)

        }


        return viewBinding
    }

}