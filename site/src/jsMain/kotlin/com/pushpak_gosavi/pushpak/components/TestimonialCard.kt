package com.pushpak_gosavi.pushpak.components

import androidx.compose.runtime.Composable
import com.pushpak_gosavi.pushpak.models.Testimonial
import com.pushpak_gosavi.pushpak.models.Theme
import com.pushpak_gosavi.pushpak.utils.Constants.FONT_FAMILY
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.css.ObjectFit
import com.varabyte.kobweb.compose.foundation.layout.*
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.style.breakpoint.Breakpoint
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Text
import org.jetbrains.compose.web.dom.Thead

@Composable
fun testimonialCard(
    testimonial: Testimonial,
    modifier: Modifier = Modifier,
    breakpoint: Breakpoint
) {
    Row(
        modifier = Modifier.maxWidth(500.px)
    ) {
        Image(
            modifier = Modifier
                .margin(right = 20.px)
                .maxWidth(if (breakpoint >= Breakpoint.MD) 160.px else 80.px)
                .borderRadius(topLeft = 60.px, topRight = 60.px, bottomLeft = 60.px, bottomRight = 0.px),
            src = testimonial.image,
            desc = "Testimonial Image"
        )

        Column {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .margin(bottom = 10.px),
            ) {
                Column(
                    modifier= Modifier.fillMaxWidth()
                ) {
                    P(
                        attrs = Modifier
                            .fontFamily(FONT_FAMILY)
                            .fontWeight(FontWeight.Bold)
                            .fontSize(18.px)
                            .color(Theme.Secondary.rgb)
                            .margin(topBottom = 0.px)
                            .toAttrs()
                    ) {
                        Text(testimonial.fullName)
                    }

                    P(
                        attrs = Modifier
                            .fontFamily(FONT_FAMILY)
                            .fontWeight(FontWeight.Normal)
                            .fontSize(12.px)
                            .color(Theme.Secondary.rgb)
                            .margin(topBottom = 0.px)
                            .toAttrs()
                    ) {
                        Text(testimonial.profession)
                    }
                    if(breakpoint <= Breakpoint.MD){
                        ratingBar(modifier = Modifier.margin(top = 10.px))
                    }
                }
                    if(breakpoint > Breakpoint.MD) {
                        Spacer()
                        ratingBar()
                    }
            }
            P(
                attrs = Modifier
                    .fontFamily(FONT_FAMILY)
                    .fontSize(12.px)
                    .fontWeight(FontWeight.Normal)
                    .color(Theme.Secondary.rgb)
                    .margin(topBottom = 0.px)
                    .toAttrs()
            ) {
                Text(testimonial.review)
            }
        }
    }
}