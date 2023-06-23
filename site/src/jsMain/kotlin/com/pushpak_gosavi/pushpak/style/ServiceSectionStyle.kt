package com.pushpak_gosavi.pushpak.style

import com.pushpak_gosavi.pushpak.models.Theme
import com.varabyte.kobweb.compose.css.CSSTransition
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.style.ComponentStyle
import com.varabyte.kobweb.silk.components.style.hover
import org.jetbrains.compose.web.css.*

val ServiceCardStyle by ComponentStyle {
    base {
        Modifier.border(
            width = 2.px,
            style = LineStyle.Solid,
            color = Theme.LighterGray.rgb
        )
            .backgroundColor(color = Color.white)
            .transition(CSSTransition(property = "border", duration = 200.ms))
    }
    hover {
        Modifier
            .border(
                width = 2.px,
                style = LineStyle.Solid,
                color = Theme.Primary.rgb
            )
            .backgroundColor(color = Theme.Primary.rgb)
    }

    cssRule(" > #boxIcon") {
        Modifier
            .backgroundColor(Colors.Transparent)
            .transition(CSSTransition(property = "background", duration = 200.ms))
    }
    cssRule(":hover > #boxIcon") {
        Modifier.backgroundColor(Colors.White)
    }
    cssRule(" > p") {
        Modifier
            .color(Theme.Secondary.rgb)
            .transition(CSSTransition(property = "color", duration = 200.ms))
    }
    cssRule(":hover > p") {
        Modifier.color(Colors.White)
    }
}