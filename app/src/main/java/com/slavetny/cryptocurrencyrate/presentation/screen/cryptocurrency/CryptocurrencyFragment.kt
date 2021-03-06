package com.slavetny.cryptocurrencyrate.presentation.screen.cryptocurrency

import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import com.slavetny.cryptocurrencyrate.R
import com.slavetny.cryptocurrencyrate.data.extension.observeNotNull
import com.slavetny.cryptocurrencyrate.presentation.adapter.CryptocurrencyAdapter
import com.slavetny.cryptocurrencyrate.presentation.base.BaseFragment
import kotlinx.android.synthetic.main.fragment_cryptocurrency.*
import org.koin.androidx.viewmodel.ext.android.viewModel

class CryptocurrencyFragment : BaseFragment<CryptocurrencyViewModel>(R.layout.fragment_cryptocurrency) {

    override val viewModel: CryptocurrencyViewModel by viewModel()
    private lateinit var adapter: CryptocurrencyAdapter

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel.coinList.observeNotNull(this) {
            adapter = CryptocurrencyAdapter(it)
            initRecyclerView()
        }
    }

    private fun initRecyclerView() {
        frg_recycler_view.layoutManager =
            LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)

        frg_recycler_view.adapter = adapter
    }
}