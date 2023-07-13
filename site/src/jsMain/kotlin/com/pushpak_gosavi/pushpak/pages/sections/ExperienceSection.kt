package com.pushpak_gosavi.pushpak.pages.sections

import androidx.compose.runtime.*
import com.pushpak_gosavi.pushpak.components.experienceCard
import com.pushpak_gosavi.pushpak.components.sectionTitle
import com.pushpak_gosavi.pushpak.models.Experience
import com.pushpak_gosavi.pushpak.utils.Constants.SECTION_WIDTH
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.ui.Modifier
import org.jetbrains.compose.web.css.px
import com.pushpak_gosavi.pushpak.models.Section
import com.pushpak_gosavi.pushpak.utils.observeViewPortEntered
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
import org.jetbrains.compose.web.css.AlignContent
import org.jetbrains.compose.web.css.percent

@Composable
fun experienceSection() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .maxWidth(SECTION_WIDTH)
            .padding(topBottom = 100.px)
            .id(Section.Experience.id),
        contentAlignment = Alignment.Center
    ) {
        experienceContent()
    }
}

@Composable
fun experienceContent() {
    val breakpoint = rememberBreakpoint()
    var animatedMargin by remember { mutableStateOf(200.px) }

    observeViewPortEntered(
        sectionId = Section.Experience.id,
        distanceFromTop = 500.0,
        onViewPortEntered = {
            animatedMargin = 50.px
        }
    )
    Column(
        modifier = Modifier
            .fillMaxWidth(
                if (breakpoint >= Breakpoint.MD) 100.percent
                else 90.percent
            ),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        sectionTitle(
            section = Section.Experience,
            modifier = Modifier
                .margin(bottom = 25.px)
                .fillMaxWidth(
                    if (breakpoint >= Breakpoint.MD) 60.percent
                    else 90.percent
                )
        )
        Experience.values().forEach { experience ->
            experienceCard(
                experience = experience,
                active = experience == Experience.First,
                breakpoint = breakpoint,
                animatedMargin = animatedMargin
            )
        }
    }
}