package com.example.safifees_v0.ui.sheetHistory

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.safifees_v0.R

class SheetHistoryFragment : Fragment() {

    private lateinit var sheetHistoryViewModel: SheetHistoryViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        sheetHistoryViewModel =
            ViewModelProviders.of(this).get(SheetHistoryViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_sheet_history, container, false)
        val textView: TextView = root.findViewById(R.id.text_sheetHistory)
        sheetHistoryViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}
