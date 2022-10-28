package com.example.firstcloneapplication.src.main.movie

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.firstcloneapplication.R
import com.example.firstcloneapplication.config.BaseFragment
import com.example.firstcloneapplication.databinding.FragmentMovieBinding
import com.example.firstcloneapplication.src.main.movie.models.MovieResults
import com.example.firstcloneapplication.src.main.movie.models.NowPlayingMovieResponse

class MovieFragment: BaseFragment<FragmentMovieBinding>(FragmentMovieBinding::bind, R.layout.fragment_movie),
        MovieFragmentInterface {
    private var API_KEY = "e5087ab93f20b1503305b3b20beb97b2"
    private lateinit var rvAdapter: RvAdapterMovieChart

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        showCustomToast("영화 페이지 입니다.")
        showLoadingDialog(requireContext())
        MovieService(this, API_KEY, "ko-KR").tryGetNowPlayingMovie()
    }

    override fun onGetNowPlayingMovieSuccess(response: NowPlayingMovieResponse) {
        dismissLoadingDialog()
        showCustomToast("Success Get NowPlaying MOVIE!!")
        val mList = mutableListOf<MovieResults>()
        for(movie in response.results) {
            Log.d("Movie", "${movie.title}, ${movie.poster_path}")
            mList.add(movie)
        }

        rvAdapter = RvAdapterMovieChart(this, mList)
        binding.movieRecyclerView.layoutManager = LinearLayoutManager(activity, LinearLayoutManager.HORIZONTAL, false)
        binding.movieRecyclerView.adapter = rvAdapter
    }

    override fun onGetNowPlayingMovieFailure(message: String) {
        dismissLoadingDialog()
        showCustomToast("오류 : $message")
    }


}