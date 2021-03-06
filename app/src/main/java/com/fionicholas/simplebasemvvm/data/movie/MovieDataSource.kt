package com.fionicholas.simplebasemvvm.data.movie

import com.fionicholas.simplebasemvvm.data.movie.remote.response.MovieResponse
import io.reactivex.Observable

interface MovieDataSource {

    fun getPopularMovie(): Observable<MovieResponse>

}