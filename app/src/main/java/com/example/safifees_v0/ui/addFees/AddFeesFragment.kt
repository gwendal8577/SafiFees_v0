package com.example.safifees_v0.ui.addFees

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.safifees_v0.R

class AddFeesFragment : Fragment() {

    private lateinit var addFeesViewModel: AddFeesViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        addFeesViewModel =
            ViewModelProviders.of(this).get(AddFeesViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_add_fees, container, false)
        val textView: TextView = root.findViewById(R.id.text_addFees)
        addFeesViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}
