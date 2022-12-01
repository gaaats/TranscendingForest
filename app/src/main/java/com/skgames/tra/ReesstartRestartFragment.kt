package com.skgames.tra

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.google.android.material.snackbar.Snackbar
import com.skgames.tra.databinding.FragmentReesstartRestartBinding

class ReesstartRestartFragment : Fragment() {
    private var dddd: FragmentReesstartRestartBinding? = null
    private val yyyyy
        get() = dddd ?: throw RuntimeException("FragmentReesstartRestartBinding = null")


    private fun eeeeeeee() {
        Snackbar.make(
            yyyyy.root,
            "Error, error, error",
            Snackbar.LENGTH_LONG
        ).show()
        requireActivity().onBackPressed()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        dddd = FragmentReesstartRestartBinding.inflate(inflater, container, false)
        return yyyyy.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        try {

            yyyyy.root.background.alpha = 220
            yyyyy.btnExit.setOnClickListener {
                aaaaaaaaa()
            }
            yyyyy.btnTryAgain.setOnClickListener {
                findNavController().navigate(R.id.action_reesstartRestartFragment_to_playGaaammeeFragment)
            }

        } catch (e: Exception) {
            eeeeeeee()
        }


        super.onViewCreated(view, savedInstanceState)
    }

    override fun onDestroy() {
        dddd = null
        super.onDestroy()
    }

    private fun aaaaaaaaa() {
        AlertDialog.Builder(requireContext())
            .setTitle("CLOSE")
            .setMessage("Please, do not close me, CLOSE?")
            .setPositiveButton("Yes, CLOSE") { _, _ ->
                requireActivity().finish()
            }
            .setNegativeButton("No") { _, _ ->
            }
            .setCancelable(true)
            .create()
            .show()
    }




}