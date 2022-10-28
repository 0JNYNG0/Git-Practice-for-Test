package com.example.firstcloneapplication.src.main.movie

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.firstcloneapplication.databinding.ItemMovieNowPlayingBinding
import com.example.firstcloneapplication.src.main.movie.models.MovieResults

class RvAdapterMovieChart(private val fragmentActivity: Fragment, private val mList: MutableList<MovieResults>)
    : RecyclerView.Adapter<RvAdapterMovieChart.ViewHolder>() {

    inner class ViewHolder(private val viewBinding: ItemMovieNowPlayingBinding): RecyclerView.ViewHolder(viewBinding.root) {
        fun bind(movieInfo: MovieResults) {
            viewBinding.itemMovieTitle.text = movieInfo.title

            Glide.with(fragmentActivity)
                .load("https://image.tmdb.org/t/p/original" + movieInfo.poster_path)
                .into(viewBinding.itemMoviePoster)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val viewBinding = ItemMovieNowPlayingBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(viewBinding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(mList[position])
    }

    override fun getItemCount(): Int = mList.size
}