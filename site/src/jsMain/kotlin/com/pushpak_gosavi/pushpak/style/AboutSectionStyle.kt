package com.pushpak_gosavi.pushpak.style

import com.pushpak_gosavi.pushpak.models.Theme
import com.varabyte.kobweb.compose.css.CSSTransition
import com.varabyte.kobweb.compose.css.TransitionProperty
import com.varabyte.kobweb.compose.css.filter
import com.varabyte.kobweb.compose.css.functions.grayscale
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.styleModifier
import com.varabyte.kobweb.silk.components.style.ComponentStyle
import com.varabyte.kobweb.silk.components.style.hover
import org.jetbrains.compose.web.css.*

val AboutImageStyle by ComponentStyle {
    base {
        Modifier
            .styleModifier {
                filter(grayscale(100.percent))
            }
            .transition(CSSTransition(property = TransitionProperty.All, duration = 200.ms))
    }
    hover {
        Modifier
            .borderRadius(r=70.px)
            .rotate(10.deg)
            .styleModifier {
                filter(grayscale(0.percent))
            }
            .transition(CSSTransition(property = TransitionProperty.All, duration = 200.ms))
    }
}

val AboutSectionText by ComponentStyle {
    base {
        Modifier
            .opacity(50.percent)
            .transition(CSSTransition(property = "opacity", duration = 200.ms))
    }
    hover{
        Modifier
            .opacity(100.percent)
            .transition(CSSTransition(property = "opacity", duration = 200.ms))
    }
}