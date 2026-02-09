package org.wikipedia.lesson03.homework

import android.widget.LinearLayout
import android.widget.ScrollView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.button.MaterialButton
import org.wikipedia.R
import org.wikipedia.onboarding.OnboardingPageView

val skipButton = listOf(
    MaterialButton::class.java,
    R.id.fragment_onboarding_skip_button
)
val fragmentPager = listOf(
    ViewPager2::class.java,
    R.id.fragment_pager
)
val onboardingPageView = listOf(
    OnboardingPageView::class.java,
    R.id.scrollView,
    R.id.bottomOffset
)
val scrollView = listOf(
    ScrollView::class.java,
    R.id.scrollViewContainer
)
val scrollViewContainer = listOf(
    LinearLayout::class.java,
    R.id.imageViewCentered,
    R.id.primaryTextView,
    R.id.secondaryTextView,
    R.id.tertiaryTextView
)
val languageListContainer = listOf(
    LinearLayout::class.java,
    R.id.languagesList,
    R.id.addLanguageButton
)
val languagesList = listOf(
    RecyclerView::class.java,
    R.id.option_label
)
val patrollerTasksThanks = listOf(
    ConstraintLayout::class.java,
    R.id.thankImage,
    R.id.thankTitle,
    R.id.thankContent
)
val patrollerTasksWatch = listOf(
    ConstraintLayout::class.java,
    R.id.watchImage,
    R.id.watchTitle,
    R.id.watchContent
)
val patrollerTasksTalk = listOf(
    ConstraintLayout::class.java,
    R.id.talkImage,
    R.id.talkTitle,
    R.id.talkContent
)