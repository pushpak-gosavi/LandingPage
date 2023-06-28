package com.pushpak_gosavi.pushpak.style

import com.pushpak_gosavi.pushpak.models.Theme
import com.varabyte.kobweb.compose.css.CSSTransition
import com.varabyte.kobweb.compose.css.Visibility
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Color
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.style.ComponentStyle
import com.varabyte.kobweb.silk.components.style.visited
import org.jetbrains.compose.web.css.ms
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px

val PortfolioSectionStyle by ComponentStyle {
    cssRule(" > #parentColumn > #parentBox > #greenOverly") {
        Modifier.width(0.px)
            .transition(CSSTransition(property = "width", duration = 500.ms))
    }

    cssRule(":hover > #parentColumn > #parentBox > #greenOverly") {
        Modifier.width(300.px)
            .backgroundColor(Color.argb(a = 0.5f, r = 0, g = 167, b = 142))
            .transition(CSSTransition(property = "width", duration = 500.ms))
    }

    cssRule(" > #parentColumn > #parentBox > #greenOverly > #linkIcon") {
        Modifier.visibility(Visibility.Hidden)
            .transition(CSSTransition(property = "width", duration = 500.ms))
    }

    cssRule(":hover > #parentColumn > #parentBox > #greenOverly > #linkIcon") {
        Modifier.visibility(Visibility.Visible)
            .transition(CSSTransition(property = "width", duration = 500.ms))
    }

    cssRule(" > #parentColumn > #portfolioTitle"){
        Modifier
            .color(Theme.Secondary.rgb)
            .translateX(0.percent)
            .transition(CSSTransition(property = "color", duration = 200.ms))
            .transition(CSSTransition(property = "translate", duration = 200.ms))
    }

    cssRule(":hover > #parentColumn > #portfolioTitle"){
        Modifier
            .color(Theme.Primary.rgb)
            .translateX(tx = 5.percent)
            .transition(CSSTransition(property = "color", duration = 200.ms))
            .transition(CSSTransition(property = "translate", duration = 200.ms))
    }

    cssRule(" > #parentColumn > #portfolioDesc"){
        Modifier
            .translateX(tx = 0.percent)
            .transition(CSSTransition(property = "translate", duration = 200.ms))
    }
    cssRule(":hover > #parentColumn > #portfolioDesc"){
        Modifier
            .translateX(tx = 5.percent)
            .transition(CSSTransition(property = "translate", duration = 200.ms))
    }
}