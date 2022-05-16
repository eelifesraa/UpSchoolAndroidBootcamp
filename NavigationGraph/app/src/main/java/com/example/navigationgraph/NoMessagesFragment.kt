package com.example.navigationgraph

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.example.navigationgraph.databinding.FragmentNoMessagesBinding

class NoMessagesFragment : Fragment() {

   private lateinit var noMessagesFragmentbinding:FragmentNoMessagesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        noMessagesFragmentbinding = DataBindingUtil.inflate(inflater,R.layout.fragment_no_messages,container,false)
        // val view =inflater.inflate(R.layout.fragment_blank, container, false)

        return noMessagesFragmentbinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        noMessagesFragmentbinding.goBackButton.setOnClickListener {
            findNavController().navigate(R.id.action_noMessagesFragment_to_noFavouritesFragment)
        }
        super.onViewCreated(view, savedInstanceState)
    }


}