package com.pushpak_gosavi.pushpak.components

import androidx.compose.runtime.Composable
import com.pushpak_gosavi.pushpak.models.Section
import com.pushpak_gosavi.pushpak.models.Theme
import com.pushpak_gosavi.pushpak.style.LogoStyle
import com.pushpak_gosavi.pushpak.style.NavigationItemStyle
import com.pushpak_gosavi.pushpak.utils.Constants.FONT_FAMILY
import com.pushpak_gosavi.pushpak.utils.Res.Image.logo
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.css.ObjectFit
import com.varabyte.kobweb.compose.css.TextDecorationLine
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.icons.fa.FaBars
import com.varabyte.kobweb.silk.components.icons.fa.IconSize
import com.varabyte.kobweb.silk.components.navigation.Link
import com.varabyte.kobweb.silk.components.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.components.style.toModifier
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px

@Composable
fun header(onMenuClicked: () -> Unit) {
    val breakpoint = rememberBreakpoint()
    Row(
        modifier = Modifier.fillMaxWidth(if (breakpoint <= Breakpoint.MD) 80.percent else 90.percent)
            .id(Section.Home.id).margin(topBottom = 50.px),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        leftSide(breakpoint, onMenuClicked = onMenuClicked)
        if (breakpoint > Breakpoint.MD) {
            rightSide()
        }
    }
}

@Composable
fun leftSide(
    breakpoint: Breakpoint,
    onMenuClicked: () -> Unit
) {
    Row(
        verticalAlignment = Alignment.CenterVertically
    ) {
        if (breakpoint <= Breakpoint.MD) {
            FaBars(
                modifier = Modifier.margin(right = 15.px)
                    .onClick {
                        onMenuClicked()
                    },
                size = IconSize.XL
            )
        }
        Image(
            modifier = LogoStyle.toModifier(),
            src = logo,
            desc = "Logo"
        )
    }
}

@Composable
fun rightSide() {
    Row(
        modifier = Modifier
            .fillMaxWidth(80.percent)
            .padding(20.px)
            .borderRadius(50.px)
            .backgroundColor(Theme.LighterGray.rgb),
        horizontalArrangement = Arrangement.End
    ) {
        Section.values().take(7).forEach { section ->
            Link(
                modifier = NavigationItemStyle.toModifier()
                    .padding(right = 20.px)
                    .fontFamily(FONT_FAMILY)
                    .fontSize(16.px)
                    .fontWeight(FontWeight.Normal)
                    .textDecorationLine(TextDecorationLine.None),
                path = section.path,
                text = section.title
            )
        }
    }
}