package com.example.fetchingdata.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.example.fetchingdata.R
import com.example.fetchingdata.utils.Resource
import com.example.fetchingdata.view_model.NewsViewModel
import org.koin.android.ext.android.get

class MainActivity : AppCompatActivity() {

    private val viewModel = get<NewsViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        getData()

    }

    private fun getData(){
        viewModel.breakingNews.observe(lifecycleScope) {
            when (it) {
                is Resource.Success -> {
                    it.data?.let { newsResponse ->
                        // display data
                    }
                }
                is Resource.Error -> {
                    it.massage?.let { massage ->
                        // show error message
                    }
                }
                is Resource.Loading -> {
                    // show progress bar
                }
            }
        }
    }
}