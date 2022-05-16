package com.example.navigationgraph

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.example.navigationgraph.databinding.FragmentPageNotFoundBinding

class PageNotFoundFragment : Fragment() {
    private lateinit var PageNotFoundFragmentBinding : FragmentPageNotFoundBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        PageNotFoundFragmentBinding = DataBindingUtil.inflate(inflater,R.layout.fragment_page_not_found, container, false)
        return PageNotFoundFragmentBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        PageNotFoundFragmentBinding.PageNotFoundButton.setOnClickListener {
            findNavController().navigate(R.id.action_pageNotFoundFragment3_to_yourCartisEmptyFragment)
        }
        super.onViewCreated(view, savedInstanceState)
    }

}