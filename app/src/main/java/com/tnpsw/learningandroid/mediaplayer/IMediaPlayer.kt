package com.tnpsw.learningandroid.mediaplayer

/**
 * Created by tnphi on 10/3/2023.
 */
interface IMediaPlayer {
    fun play()
    fun pause()
    fun resume()
    val isPlaying: Boolean
}