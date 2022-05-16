package com.example.navigationgraph

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.example.navigationgraph.databinding.FragmentNoNotificationsYetBinding

class NoNotificationsYetFragment : Fragment() {

    private lateinit var NoNotificationsYetFragmentBinding : FragmentNoNotificationsYetBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        NoNotificationsYetFragmentBinding = DataBindingUtil.inflate(inflater,R.layout.fragment_no_notifications_yet, container, false)
        return NoNotificationsYetFragmentBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        NoNotificationsYetFragmentBinding.NoNotificationsButton.setOnClickListener {
            findNavController().navigate(R.id.action_noNotificationsYetFragment_to_noMessagesFragment)
        }
        super.onViewCreated(view, savedInstanceState)
    }


}