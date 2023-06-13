package com.pushpak_gosavi.pushpak.style

import com.pushpak_gosavi.pushpak.models.Theme
import com.varabyte.kobweb.compose.css.CSSTransition
import com.varabyte.kobweb.compose.css.filter
import com.varabyte.kobweb.compose.css.functions.grayscale
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.color
import com.varabyte.kobweb.compose.ui.modifiers.transform
import com.varabyte.kobweb.compose.ui.modifiers.transition
import com.varabyte.kobweb.compose.ui.modifiers.width
import com.varabyte.kobweb.compose.ui.styleModifier
import com.varabyte.kobweb.silk.components.style.ComponentStyle
import com.varabyte.kobweb.silk.components.style.anyLink
import com.varabyte.kobweb.silk.components.style.hover
import org.jetbrains.compose.web.ExperimentalComposeWebApi
import org.jetbrains.compose.web.css.deg
import org.jetbrains.compose.web.css.ms
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px

val NavigationItemStyle by ComponentStyle {
    base {
        Modifier
            .color(Theme.Secondary.rgb)
            .transition(CSSTransition(property = "color", duration = 200.ms))
    }
    anyLink{
        Modifier
            .color(Theme.Secondary.rgb)
    }

    hover {
        Modifier
            .color(Theme.Primary.rgb)
            .transition(CSSTransition(property = "color", duration = 200.ms))
    }
}

@OptIn(ExperimentalComposeWebApi::class)
val LogoStyle by ComponentStyle {
    base {
        Modifier
            .transform {rotate(0.deg) }
            .transition(CSSTransition(property = "transform", duration = 200.ms))
    }
    hover{
        Modifier
            .transform {
                rotate((-10).deg)
            }
            .transition(CSSTransition(property = "transform", duration = 200.ms))
    }
}

val SocialLinksStyle by ComponentStyle {
    base {
        Modifier
            .color(Theme.Gray.rgb)
            .transition(CSSTransition(property = "color", duration = 200.ms))
    }
    hover{
        Modifier
            .color(Theme.Primary.rgb)
            .transition(CSSTransition(property = "Color", duration = 200.ms))
    }
}

val MainButtonStyle by ComponentStyle {
    base {
        Modifier
            .width(100.px)
            .transition(CSSTransition(property = "width", duration = 200.ms))
    }
    hover{
        Modifier
            .width(120.px)
            .transition(CSSTransition(property = "width", duration = 200.ms))
    }
}

val MainImageStyle by ComponentStyle {
    base {
        Modifier
            .styleModifier {
                filter(grayscale(100.percent))
            }
            .transition(CSSTransition(property = "filter", duration = 200.ms))
    }

    hover{
        Modifier
            .styleModifier {
                filter(grayscale(0.percent))
            }
            .transition(CSSTransition(property = "filter", duration = 200.ms))
    }
}
