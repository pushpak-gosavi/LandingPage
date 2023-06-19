package com.pushpak_gosavi.pushpak.components

import androidx.compose.runtime.Composable
import com.pushpak_gosavi.pushpak.models.Section
import com.pushpak_gosavi.pushpak.models.Theme
import com.pushpak_gosavi.pushpak.utils.Constants.FONT_FAMILY
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.toAttrs
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Text

@Composable
fun sectionTitle(
    section: Section,
    modifier: Modifier = Modifier,
    alignment: Alignment.Horizontal = Alignment.Start
) {
    Column (
        modifier=modifier,
        horizontalAlignment = alignment
    ){
        P(
            attrs = Modifier
                .fontFamily(FONT_FAMILY)
                .fontSize(24.px)
                .color(Theme.Primary.rgb)
                .fontWeight(FontWeight.Normal)
                .textAlign(
                    when (alignment) {
                        Alignment.CenterHorizontally -> TextAlign.Center
                        Alignment.End -> TextAlign.End
                        else -> TextAlign.Start
                    }
                )
                .margin(topBottom = 0.px)
                .toAttrs()
        ){
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
                        Alignment.CenterHorizontally -> TextAlign.Center
                        Alignment.End -> TextAlign.End
                        else -> TextAlign.Start
                    }
                )
                .margin(bottom = 10.px, top = 0.px)
                .toAttrs()
        ){
            Text(section.subtitle)
        }

        Box (
            modifier= Modifier
                .height(4.px)
                .width(80.px)
                .maxWidth(80.px)
                .backgroundColor(Theme.Primary.rgb)
                .borderRadius(50.px)
        )
    }
}