package com.pushpak_gosavi.pushpak.pages

import androidx.compose.runtime.*
import com.pushpak_gosavi.pushpak.components.bottomToTopArrow
import com.pushpak_gosavi.pushpak.pages.sections.*
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxSize
import com.varabyte.kobweb.core.Page

@Page
@Composable
fun homePage() {
    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            mainSection()
            aboutSection()
            serviceSection()
            portfolioSection()
            achievementSection()
            testimonialSection()
            experienceSection()
            contactMeSection()
            footerSection()
        }

        bottomToTopArrow()
    }
}