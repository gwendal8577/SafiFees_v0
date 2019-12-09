package com.example.safifees_v0.ui.homeBack

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.safifees_v0.R

class HomeBackFragment : Fragment() {

    private lateinit var homeBackViewModel: HomeBackViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        homeBackViewModel =
            ViewModelProviders.of(this).get(HomeBackViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_home_back, container, false)
        val textView: TextView = root.findViewById(R.id.text_homeBack)
        homeBackViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}
