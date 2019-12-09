package com.example.safifees_v0.ui.myProfil

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.safifees_v0.R

class MyProfilFragment : Fragment() {

    private lateinit var myProfilViewModel: MyProfilViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        myProfilViewModel =
            ViewModelProviders.of(this).get(MyProfilViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_my_profil, container, false)
        val textView: TextView = root.findViewById(R.id.text_myProfil)
        myProfilViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}
