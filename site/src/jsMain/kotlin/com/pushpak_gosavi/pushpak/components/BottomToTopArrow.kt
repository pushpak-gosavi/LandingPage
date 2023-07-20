package com.pushpak_gosavi.pushpak.components

import androidx.compose.runtime.*
import com.pushpak_gosavi.pushpak.models.Theme
import com.pushpak_gosavi.pushpak.style.BackToTopStyle
import com.varabyte.kobweb.compose.css.Cursor
import com.varabyte.kobweb.compose.css.PointerEvents
import com.varabyte.kobweb.compose.css.Visibility
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.styleModifier
import com.varabyte.kobweb.silk.components.icons.fa.FaArrowUp
import com.varabyte.kobweb.silk.components.icons.fa.IconSize
import com.varabyte.kobweb.silk.components.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.components.style.toModifier
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
import kotlinx.browser.document
import kotlinx.browser.window
import org.jetbrains.compose.web.css.AlignContent
import org.jetbrains.compose.web.css.Position
import org.jetbrains.compose.web.css.px
import org.w3c.dom.events.EventListener

@Composable
fun bottomToTopArrow() {
    val breakpoint = rememberBreakpoint()
    var scroll: Double? by remember { mutableStateOf(null) }
    LaunchedEffect(Unit) {
        window.addEventListener(type = "scroll", callback = {
            scroll = document.documentElement?.scrollTop
        })
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .zIndex(1)
            .position(position = Position.Fixed)
            .styleModifier {
                           property("pointer-events", "none")
            },
        horizontalAlignment = Alignment.End,
        verticalArrangement = Arrangement.Bottom
    ) {
        Box(
            modifier = BackToTopStyle.toModifier()
                .visibility(
                    if (scroll != null && scroll!! > 400.0) Visibility.Visible
                    else Visibility.Hidden
                )
                .size(
                    if (breakpoint >= Breakpoint.MD) 50.px else 30.px
                ).margin(bottom = 20.px, right = 20.px)
                .borderRadius(if (breakpoint >= Breakpoint.MD) 20.px else 15.px)
                .backgroundColor(Theme.Primary.rgb)
                .onClick {
                    document.documentElement?.scroll(x = 0.0, y = 0.0)
                }
                .cursor(Cursor.Pointer)
                .styleModifier {
                               property("pointer-events", "auto")
                },
            contentAlignment = Alignment.Center,

            ) {
            FaArrowUp(
                modifier = Modifier
                    .color(Colors.White),
                size = if (breakpoint >= Breakpoint.MD) IconSize.LG else IconSize.SM
            )
        }
    }
}