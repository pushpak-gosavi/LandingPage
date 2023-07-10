package com.pushpak_gosavi.pushpak.pages.sections

import androidx.compose.runtime.Composable
import com.pushpak_gosavi.pushpak.components.sectionTitle
import com.pushpak_gosavi.pushpak.components.testimonialCard
import com.pushpak_gosavi.pushpak.models.Section
import com.pushpak_gosavi.pushpak.models.Testimonial
import com.pushpak_gosavi.pushpak.utils.Constants.SECTION_WIDTH
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px

@Composable
fun testimonialSection() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .maxWidth(SECTION_WIDTH)
            .padding(topBottom = 100.px)
            .id(Section.Testimonial.id),
        contentAlignment = Alignment.Center
    ) {
        testimonialContent()
    }
}

@Composable
fun testimonialContent() {
    val breakpoint = rememberBreakpoint()
    Column(
        modifier = Modifier
            .fillMaxWidth(
                if (breakpoint >= Breakpoint.MD) 100.percent
                else 90.percent
            ),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        sectionTitle(
            section = Section.Testimonial,
            modifier = Modifier.fillMaxWidth().margin(topBottom = 20.px),
            alignment = Alignment.CenterHorizontally
        )
        testimonialCard(
            testimonial = Testimonial.First,
            breakpoint = breakpoint
        )
    }
}