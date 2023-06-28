package com.pushpak_gosavi.pushpak.pages.sections

import androidx.compose.runtime.Composable
import com.pushpak_gosavi.pushpak.components.portfolioCard
import com.pushpak_gosavi.pushpak.components.sectionTitle
import com.pushpak_gosavi.pushpak.models.Portfolio
import com.pushpak_gosavi.pushpak.models.Section
import com.pushpak_gosavi.pushpak.utils.Constants.SECTION_WIDTH
import com.varabyte.kobweb.compose.css.Overflow
import com.varabyte.kobweb.compose.css.ScrollBehavior
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px

@Composable
fun portfolioSection() {
    Box(
        modifier = Modifier
            .id(Section.Portfolio.id)
            .maxWidth(SECTION_WIDTH)
            .padding(topBottom = 100.px),
        contentAlignment = Alignment.Center,
    ) {
        portfolioContent()
    }
}

@Composable
fun portfolioContent() {
    val breakpoint = rememberBreakpoint()
    Column(
        modifier = Modifier
            .maxWidth(950.px)
            .fillMaxWidth(
                if (breakpoint >= Breakpoint.MD) 100.percent
                else 90.percent
            ),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        sectionTitle(
            section = Section.Portfolio,
            modifier = Modifier.fillMaxWidth().margin(bottom = 25.px),
        )
        portfolioCards(breakpoint = breakpoint)
    }
}

@Composable
fun portfolioCards(breakpoint: Breakpoint) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .margin(bottom = 25.px)
            .maxWidth(
                if (breakpoint > Breakpoint.MD) 950.px
                else if (breakpoint > Breakpoint.SM) 625.px
                else 300.px
            )
            .overflow(Overflow.Hidden)
            .scrollBehavior(ScrollBehavior.Smooth)

    ) {
        Portfolio.values().forEach { portfolio: Portfolio ->
            portfolioCard(
                modifier = Modifier.margin(right = if (portfolio != Portfolio.TODO) 25.px else 0.px),
                portfolio = portfolio
            )
        }
    }
}