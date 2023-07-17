package com.pushpak_gosavi.pushpak.style

import com.pushpak_gosavi.pushpak.models.Theme
import com.varabyte.kobweb.compose.css.CSSTransition
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.border
import com.varabyte.kobweb.compose.ui.modifiers.borderColor
import com.varabyte.kobweb.compose.ui.modifiers.transition
import com.varabyte.kobweb.silk.components.style.ComponentStyle
import com.varabyte.kobweb.silk.components.style.hover
import org.jetbrains.compose.web.css.ms

val InputTypeStyle by ComponentStyle {
    base {
        Modifier
            .borderColor(Theme.LighterGray.rgb)
            .transition(
                CSSTransition(
                    property = "border", duration = 200.ms
                )
            )
    }
    hover {
        Modifier.borderColor(Theme.Primary.rgb)
    }
}