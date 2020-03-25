package com.example.navigationcomponent

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import kotlinx.android.synthetic.main.fragment_two.*


class TwoFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_two, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btnBack.setOnClickListener {
            Navigation.findNavController(activity!!, R.id.nav_host_fragment).popBackStack()
        }

        //           pass arguments

        // 1
       /* val bundle = bundleOf("amount" to 11)
        btnNext.setOnClickListener(
            Navigation.createNavigateOnClickListener(
                R.id.threeFragment,
                bundle
            )
        )*/

        // 2
         btnNext.setOnClickListener { v ->
             //val action = TwoFragmentDirections.actionTwoFragmentToThreeFragment(argName = 17)

             val bundle = bundleOf("amount" to 17)
             v.findNavController().navigate(R.id.threeFragment, bundle)

         }
    }
}
