package com.example.navigationgraph

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.example.navigationgraph.databinding.FragmentNoFavouritesBinding

class NoFavouritesFragment : Fragment() {

    private lateinit var NoFavouritesFragmentBinding:FragmentNoFavouritesBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        NoFavouritesFragmentBinding= DataBindingUtil.inflate(inflater,R.layout.fragment_no_favourites,container,false)
        return NoFavouritesFragmentBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        NoFavouritesFragmentBinding.button.setOnClickListener {
            findNavController().navigate(R.id.action_noFavouritesFragment_to_lostConnectionFragment)
        }
        super.onViewCreated(view, savedInstanceState)
    }


}