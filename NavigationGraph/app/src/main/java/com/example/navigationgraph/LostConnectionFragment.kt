package com.example.navigationgraph

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.example.navigationgraph.databinding.FragmentLostConnectionBinding

class LostConnectionFragment : Fragment() {
private lateinit var LostConnectionFragmentBinding : FragmentLostConnectionBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        LostConnectionFragmentBinding= DataBindingUtil.inflate(inflater,R.layout.fragment_lost_connection, container, false)
        return LostConnectionFragmentBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        LostConnectionFragmentBinding.LostConnectionButton.setOnClickListener {
            findNavController().navigate(R.id.action_lostConnectionFragment_to_noAddressFragment)
        }
        super.onViewCreated(view, savedInstanceState)
    }


}