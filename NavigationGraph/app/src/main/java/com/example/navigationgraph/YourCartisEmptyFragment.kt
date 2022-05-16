package com.example.navigationgraph

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.example.navigationgraph.databinding.FragmentYourCartisEmptyBinding

class YourCartisEmptyFragment : Fragment() {

    private lateinit var YourCartisEmptyFragmentBinding : FragmentYourCartisEmptyBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        YourCartisEmptyFragmentBinding = DataBindingUtil.inflate(inflater,R.layout.fragment_your_cartis_empty, container, false)
        return YourCartisEmptyFragmentBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        YourCartisEmptyFragmentBinding.CartButton.setOnClickListener {
            findNavController().navigate(R.id.action_yourCartisEmptyFragment_to_noNotificationsYetFragment)
        }
        super.onViewCreated(view, savedInstanceState)
    }

}