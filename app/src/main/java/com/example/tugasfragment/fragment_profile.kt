package com.example.tugasfragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class fragment_profile : Fragment() {

    companion object{
        fun getInstance(): fragment_profile = fragment_profile()
    }
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
//        return super.onCreateView(inflater, container, savedInstanceState)
        return inflater!!.inflate(R.layout.profile, container, false)
    }
}