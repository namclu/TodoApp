package com.namlu.todo_app

import android.view.View
import android.widget.FrameLayout
import android.widget.ProgressBar
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout

/*
* BaseActivity includes all things needed by other activities,
* such as a progress bar.
* */
abstract class BaseActivity : AppCompatActivity () {
    private lateinit var progressBar: ProgressBar

    override fun setContentView(layoutResID: Int) {

        val constrainLayout: ConstraintLayout =
            layoutInflater.inflate(R.layout.activity_base, null) as ConstraintLayout
        val frameLayout: FrameLayout =
            constrainLayout.findViewById(R.id.activity_content)

        progressBar = constrainLayout.findViewById(R.id.progress_bar)
        layoutInflater.inflate(layoutResID, frameLayout, true)

        super.setContentView(constrainLayout)
    }

    fun showProgressBar(isVisible: Boolean) {
        if (isVisible) {
            progressBar.visibility = View.VISIBLE
        } else {
            progressBar.visibility = View.INVISIBLE
        }
    }
}