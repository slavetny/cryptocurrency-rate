package com.slavetny.cryptocurrencyrate.presentation.navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.NavHostFragment
import com.slavetny.cryptocurrencyrate.R

object Navigator {

    fun toAbout(component: Fragment) {
        navigateTo(component, R.id.action_cryptocurrencyFragment_to_aboutFragment)
    }

    private fun navigateTo(component: Fragment, action: Int, bundle: Bundle? = null) {
        val controller = NavHostFragment.findNavController(component)
        controller.navigate(action, bundle)
    }
}