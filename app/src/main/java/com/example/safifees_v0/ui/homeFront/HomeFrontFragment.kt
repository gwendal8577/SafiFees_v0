package com.example.safifees_v0.ui.homeFront

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.safifees_v0.R

class HomeFrontFragment : Fragment() {

    private lateinit var homeFrontViewModel: HomeFrontViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        homeFrontViewModel =
            ViewModelProviders.of(this).get(HomeFrontViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_home_front, container, false)
        val textView: TextView = root.findViewById(R.id.text_homeFront)
        homeFrontViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}
