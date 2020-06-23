package com.slavetny.cryptocurrencyrate.presentation.base

import androidx.lifecycle.ViewModel
import org.junit.runner.notification.Failure

open class BaseViewModel : ViewModel() {

    open fun onCreate() {}

    open fun onViewCreated() {}

    open fun onDestroyView() {}

    open fun onDestroy() {}
}