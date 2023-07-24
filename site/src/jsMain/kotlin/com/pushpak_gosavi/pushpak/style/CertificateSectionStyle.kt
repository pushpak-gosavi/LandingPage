package com.pushpak_gosavi.pushpak.style

import com.pushpak_gosavi.pushpak.models.Theme
import com.varabyte.kobweb.compose.css.CSSTransition
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.style.ComponentStyle
import org.jetbrains.compose.web.css.ms

val CertificateLeftArrowStyle by ComponentStyle {

    cssRule(" > #leftBox") {
        Modifier
            .backgroundColor(Theme.LightGray.rgb)
            .transition(CSSTransition(property = "background", duration = 200.ms))
    }
    cssRule(":hover > #leftBox") {
        Modifier
            .backgroundColor(Theme.Primary.rgb)
    }

    cssRule(" > #leftBox > #leftArrow") {
        Modifier
            .color(Theme.Primary.rgb)
            .transition(CSSTransition(property = "color", duration = 200.ms))
    }
    cssRule(":hover > #leftBox > #leftArrow") {
        Modifier
            .color(Colors.White)
    }
}

val CertificateRightArrowStyle by ComponentStyle {

    cssRule(" > #rightBox") {
        Modifier
            .backgroundColor(Theme.LightGray.rgb)
            .transition(CSSTransition(property = "background", duration = 200.ms))
    }
    cssRule(":hover > #rightBox") {
        Modifier
            .backgroundColor(Theme.Primary.rgb)
    }

    cssRule(" > #rightBox > #rightArrow") {
        Modifier
            .color(Theme.Primary.rgb)
            .transition(CSSTransition(property = "color", duration = 200.ms))
    }
    cssRule(":hover > #rightBox > #rightArrow") {
        Modifier
            .color(Colors.White)
    }
}