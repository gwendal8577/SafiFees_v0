package com.example.safifees_v0.ui.acManagement

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.safifees_v0.R

class AcManagementFragment : Fragment() {

    private lateinit var acManagementViewModel: AcManagementViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        acManagementViewModel =
            ViewModelProviders.of(this).get(AcManagementViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_ac_management, container, false)
        val textView: TextView = root.findViewById(R.id.text_acManagement)
        acManagementViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}
