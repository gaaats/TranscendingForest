package com.skgames.tra

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.google.android.material.snackbar.Snackbar
import com.skgames.tra.databinding.FragmentEnterGameBinding


class EnterGameFragment : Fragment() {


    private fun bbgbggbbg() {
        Snackbar.make(
            bgbgbg.root,
            "Some error...",
            Snackbar.LENGTH_LONG
        ).show()
        requireActivity().onBackPressed()
    }

    private var klllkkl: FragmentEnterGameBinding? = null
    private val bgbgbg get() = klllkkl ?: throw RuntimeException("FragmentEnterGameBinding = null")

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        klllkkl = FragmentEnterGameBinding.inflate(inflater, container, false)
        return bgbgbg.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        try {

            bgbgbg.btnPlayGame.setOnClickListener {
                findNavController().navigate(R.id.action_enterGameFragment_to_playGaaammeeFragment)
            }

        } catch (e: Exception) {
            bbgbggbbg()
        }


        super.onViewCreated(view, savedInstanceState)
    }

    override fun onDestroy() {
        klllkkl = null
        super.onDestroy()
    }

}