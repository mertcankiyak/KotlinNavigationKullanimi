package com.kodless.kotlinnavigationkullanimi

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_ikinci.*

class IkinciFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_ikinci, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        arguments?.let {
            val gelenVeri = IkinciFragmentArgs.fromBundle(it).gelecekOlanDeger
            textView2.text = gelenVeri
        }
        button2.setOnClickListener {
            val action = IkinciFragmentDirections.actionİkinciFragmentToBirinciFragment()
            Navigation.findNavController(it).navigate(action)
        }
    }

}