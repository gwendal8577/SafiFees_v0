package com.example.safifees_v0.ui.accountManagement

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.safifees_v0.R

class AccountManagementFragment : Fragment() {

    private lateinit var accountManagementViewModel: AccountManagementViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        accountManagementViewModel =
                ViewModelProviders.of(this).get(AccountManagementViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_account_management, container, false)
        val textView: TextView = root.findViewById(R.id.text_accountManagement)
        accountManagementViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}
