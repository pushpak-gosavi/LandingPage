package com.pushpak_gosavi.pushpak.components

import androidx.compose.runtime.Composable
import com.pushpak_gosavi.pushpak.models.Experience
import com.pushpak_gosavi.pushpak.models.Theme
import com.pushpak_gosavi.pushpak.utils.Constants.FONT_FAMILY
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.silk.components.layout.SimpleGrid
import com.varabyte.kobweb.silk.components.layout.numColumns
import com.varabyte.kobweb.silk.components.style.breakpoint.Breakpoint
import org.jetbrains.compose.web.css.Color
import org.jetbrains.compose.web.css.LineStyle
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Text

@Composable
fun experienceCard(
    active: Boolean = false,
    experience: Experience,
    breakpoint: Breakpoint
) {

    SimpleGrid(
        numColumns = numColumns(base = 1, md = 2),
        modifier = Modifier
            .fillMaxWidth()
            .maxWidth(
                if (breakpoint >= Breakpoint.MD) 60.percent
                else 90.percent
            )
    ) {
        experienceDescription(
            active = active,
            experience = experience
        )
        experienceDetails(
            active = active,
            experience = experience,
            breakpoint = breakpoint
        )
    }
}

@Composable
fun experienceDescription(
    active: Boolean,
    experience: Experience
) {
    Box(
        modifier = Modifier
            .margin(topBottom = 14.px)
            .padding(14.px)
            .fillMaxWidth()
            .backgroundColor(
                if (active) Theme.Primary.rgb else Theme.LighterGray.rgb
            )
    ) {
        P(
            attrs = Modifier
                .fontFamily(FONT_FAMILY)
                .fontWeight(FontWeight.Normal)
                .lineHeight(1.6)
                .margin(topBottom = 0.px)
                .fontSize(14.px)
                .color(if (active) Color.white else Theme.Secondary.rgb)
                .toAttrs()
        ) {
            Text(experience.description)
        }
    }
}

@Composable
fun experienceDetails(
    active: Boolean,
    experience: Experience,
    breakpoint: Breakpoint
) {
    Row(
        modifier = Modifier.fillMaxWidth()
            .margin(
                left = if (breakpoint >= Breakpoint.MD) 14.px else 0.px
            ),
        verticalAlignment = Alignment.CenterVertically
    ) {
        if (breakpoint >= Breakpoint.MD) {
            experienceNumber(
                experience = experience,
                active = active
            )
        }

        Column(
            modifier = Modifier
                .fillMaxSize()
                .margin(left = if (breakpoint >= Breakpoint.SM) 0.px else 14.px),
            verticalArrangement = Arrangement.Center
        ) {
            P(
                attrs = Modifier
                    .fontFamily(FONT_FAMILY)
                    .fontWeight(FontWeight.Bold)
                    .color(Theme.Secondary.rgb)
                    .fontSize(20.px)
                    .margin(0.px)
                    .toAttrs()
            ) {
                Text(experience.jobPosition)
            }

            P(
                attrs = Modifier
                    .fontFamily(FONT_FAMILY)
                    .fontWeight(FontWeight.Normal)
                    .color(Theme.Secondary.rgb)
                    .fontSize(14.px)
                    .margin(topBottom = 0.px)
                    .toAttrs()
            ) {
                Text("${experience.from} - ${experience.to}")
            }
            P(
                attrs = Modifier
                    .fontFamily(FONT_FAMILY)
                    .fontWeight(FontWeight.Normal)
                    .color(Theme.Primary.rgb)
                    .fontSize(14.px)
                    .margin(topBottom = 0.px)
                    .toAttrs()
            ) {
                Text(experience.company)
            }
        }
    }
}

@Composable
fun experienceNumber(
    active: Boolean,
    experience: Experience
) {
    Box(
        modifier = Modifier
            .margin(right = 14.px)
            .fillMaxHeight(),
        contentAlignment = Alignment.Center
    ) {
        Box(
            modifier = Modifier
                .fillMaxHeight()
                .width(3.px)
                .backgroundColor(Theme.Primary.rgb)
        )
        Box(
            modifier = Modifier
                .size(40.px)
                .border(
                    width = 3.px,
                    style = LineStyle.Solid,
                    color = Theme.Primary.rgb
                )
                .backgroundColor(if (active) Theme.Primary.rgb else Colors.White)
                .borderRadius(50.percent),
            contentAlignment = Alignment.Center
        ) {
            P(
                attrs = Modifier
                    .margin(topBottom = 0.px)
                    .fontFamily(FONT_FAMILY)
                    .fontSize(16.px)
                    .fontWeight(FontWeight.Bold)
                    .color(if (active) Colors.White else Theme.Primary.rgb)
                    .toAttrs()
            ) {
                Text(experience.number)
            }
        }
    }
}