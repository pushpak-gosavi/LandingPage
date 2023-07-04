package com.pushpak_gosavi.pushpak.components

import androidx.compose.runtime.Composable
import com.pushpak_gosavi.pushpak.models.Achievement
import com.pushpak_gosavi.pushpak.models.Theme
import com.pushpak_gosavi.pushpak.utils.Constants.FONT_FAMILY
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.css.ObjectFit
import com.varabyte.kobweb.compose.css.VerticalAlign
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.silk.components.graphics.Image
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Text
import org.jetbrains.compose.web.dom.Thead

@Composable
fun achievementCard(
    modifier: Modifier = Modifier,
    achievement: Achievement
) {
    Row(
        modifier = modifier,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            src = achievement.icon,
            desc = "Achievement",
            modifier = Modifier.size(70.px).margin(right = 20.px)
        )

        Column {
            P(
                attrs = Modifier
                    .fillMaxWidth()
                    .fontSize(30.px)
                    .fontFamily(FONT_FAMILY)
                    .fontWeight(FontWeight.Bolder)
                    .margin(topBottom = 0.px)
                    .color(Theme.Primary.rgb)
                    .toAttrs()
            ) {
                Text(
                    if (achievement == Achievement.Completed) "${achievement.number}+"
                    else "${achievement.number}"
                )
            }
            P(
                attrs = Modifier
                    .fillMaxWidth()
                    .fontSize(16.px)
                    .fontFamily(FONT_FAMILY)
                    .fontWeight(FontWeight.Normal)
                    .color(Theme.Secondary.rgb)
                    .opacity(50.percent)
                    .margin(topBottom = 0.px)
                    .toAttrs()
            ) {
                Text(achievement.description)
            }

        }
    }
}