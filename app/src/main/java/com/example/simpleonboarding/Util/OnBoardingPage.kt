package com.example.simpleonboarding.Util

import androidx.annotation.DrawableRes
import com.example.simpleonboarding.R

sealed class OnBoardingPage(
    @DrawableRes
    val image: Int,
    val title: String,
    val description: String
){
    object First: OnBoardingPage(
        image = R.drawable.ic_launcher_foreground,
        title = "Meeting",
        description = "Lorem ipsum dolor sit amet, "
    )

    object Second: OnBoardingPage(
        image = R.drawable.ic_launcher_background,
        title = "Coordination",
        description = "Lorem ipsum dolor sit amet, "
    )

    object Third: OnBoardingPage(
        image = R.drawable.ic_launcher_foreground,
        title = "Dialogue",
        description = "Lorem ipsum dolor sit amet, "
    )
}