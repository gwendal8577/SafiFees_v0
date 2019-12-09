package com.example.safifees_v0.ui.sheetToProceed

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.safifees_v0.R

class SheetToProceedFragment : Fragment() {

    private lateinit var sheetToProceedViewModel: SheetToProceedViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        sheetToProceedViewModel =
            ViewModelProviders.of(this).get(SheetToProceedViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_sheet_to_proceed, container, false)
        val textView: TextView = root.findViewById(R.id.text_sheetToProceed)
        sheetToProceedViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}
