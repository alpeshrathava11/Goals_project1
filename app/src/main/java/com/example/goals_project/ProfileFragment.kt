package com.example.goals_project

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.goals_project.databinding.FragmentProfileBinding

class ProfileFragment : Fragment() {

    private lateinit var binding: FragmentProfileBinding

    @SuppressLint("UseRequireInsteadOfGet")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {

        binding = FragmentProfileBinding.inflate(inflater, container, false)
        val viewBinding = binding.root

        val url = "https://play.google.com/store/apps/details?id=com.habitnow"

        // Share App Intent
        binding.shareAppIntent.setOnClickListener {
            val intent = Intent(Intent.ACTION_SEND).apply {
                type = "text/plain"
                putExtra(Intent.EXTRA_TEXT, url)
            }
            val chooser = Intent.createChooser(intent, "Share using...")
            startActivity(chooser)
        }

        // Login button click
        binding.clickLogin.setOnClickListener {
            val intent = Intent(requireContext(), SignUpActivity::class.java)
            startActivity(intent)
        }

        // Feedback button click
        binding.feedbackClick.setOnClickListener {
            val intent = Intent(requireContext(), FeedbackActivity::class.java)
            startActivity(intent)
        }

        return viewBinding
    }
}
