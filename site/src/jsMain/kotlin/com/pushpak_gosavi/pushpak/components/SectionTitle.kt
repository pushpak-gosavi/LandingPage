package com.pushpak_gosavi.pushpak.components

import androidx.compose.runtime.*
import com.pushpak_gosavi.pushpak.models.Section
import com.pushpak_gosavi.pushpak.models.Theme
import com.pushpak_gosavi.pushpak.utils.Constants.FONT_FAMILY
import com.pushpak_gosavi.pushpak.utils.observeViewPortEntered
import com.varabyte.kobweb.compose.css.CSSTransition
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment.*
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.toAttrs
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import org.jetbrains.compose.web.css.ms
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Text

@Composable
fun sectionTitle(
    section: Section,
    modifier: Modifier = Modifier,
    alignment: Horizontal = Start
) {
    val scope = rememberCoroutineScope()
    var titleMargin by remember { mutableStateOf(50.px) }
    var subtitleMargin by remember { mutableStateOf(50.px) }

    observeViewPortEntered(
        sectionId = section.id,
        distanceFromTop = 500.0,
        onViewPortEntered = {
            scope.launch {
                subtitleMargin = 0.px
                if (alignment == Start) {
                    delay(25)
                }
                titleMargin = 0.px
            }
        }
    )
    Column(
        modifier = modifier,
        horizontalAlignment = alignment
    ) {
        P(
            attrs = Modifier
                .fontFamily(FONT_FAMILY)
                .fontSize(24.px)
                .color(Theme.Primary.rgb)
                .fontWeight(FontWeight.Normal)
                .textAlign(
                    when (alignment) {
                        CenterHorizontally -> TextAlign.Center
                        End -> TextAlign.End
                        else -> TextAlign.Start
                    }
                )
                .margin(
                    left = titleMargin,
                    top = 0.px,
                    bottom = 0.px
                )
                .transition(CSSTransition(property = "margin", duration = 500.ms))
                .toAttrs()
        ) {
            Text(section.title)
        }

        P(
            attrs = Modifier
                .fontFamily(FONT_FAMILY)
                .fontWeight(FontWeight.Bold)
                .fontSize(40.px)
                .color(Theme.Secondary.rgb)
                .textAlign(
                    when (alignment) {
                        CenterHorizontally -> TextAlign.Center
                        End -> TextAlign.End
                        else -> TextAlign.Start
                    }
                )
                .margin(
                    left = if (alignment == Start) subtitleMargin else 0.px,
                    right = if (alignment == CenterHorizontally) subtitleMargin else 0.px,
                    bottom = 10.px,
                    top = 0.px
                )
                .transition(CSSTransition(property = "margin", duration = 300.ms))
                .toAttrs()
        ) {
            Text(section.subtitle)
        }

        Box(
            modifier = Modifier
                .height(4.px)
                .width(80.px)
                .maxWidth(80.px)
                .backgroundColor(Theme.Primary.rgb)
                .borderRadius(50.px)
        )
    }
}