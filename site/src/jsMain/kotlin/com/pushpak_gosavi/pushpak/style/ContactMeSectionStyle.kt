package com.pushpak_gosavi.pushpak.style

import com.pushpak_gosavi.pushpak.models.Theme
import com.varabyte.kobweb.compose.css.CSSTransition
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.border
import com.varabyte.kobweb.compose.ui.modifiers.borderColor
import com.varabyte.kobweb.compose.ui.modifiers.transition
import com.varabyte.kobweb.silk.components.style.ComponentStyle
import com.varabyte.kobweb.silk.components.style.focus
import com.varabyte.kobweb.silk.components.style.hover
import org.jetbrains.compose.web.css.LineStyle
import org.jetbrains.compose.web.css.ms
import org.jetbrains.compose.web.css.px

val InputTypeStyle by ComponentStyle {
    base {
        Modifier
            .border(
                color = Theme.LightGray.rgb,
                width = 2.px,
                style = LineStyle.Solid
            )
            .transition(
                CSSTransition(
                    property = "border", duration = 200.ms
                )
            )
    }
    focus {
        Modifier
            .border(
                color = Theme.Primary.rgb,
                width = 2.px,
                style = LineStyle.Solid
            )
    }
    hover {
        Modifier.border(
            color = Theme.Primary.rgb,
            width = 2.px,
            style = LineStyle.Solid,
        )
    }
}