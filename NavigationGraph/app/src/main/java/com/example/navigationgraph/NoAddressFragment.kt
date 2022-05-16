package com.example.navigationgraph

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.example.navigationgraph.databinding.FragmentNoAddressBinding

class NoAddressFragment : Fragment() {
   private lateinit var NoAddressFragmentBinding : FragmentNoAddressBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        NoAddressFragmentBinding = DataBindingUtil.inflate(inflater,R.layout.fragment_no_address, container, false)
        return NoAddressFragmentBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        NoAddressFragmentBinding.AddressButton.setOnClickListener {
            findNavController().navigate(R.id.action_noAddressFragment_to_pageNotFoundFragment)
        }
        super.onViewCreated(view, savedInstanceState)
    }

}