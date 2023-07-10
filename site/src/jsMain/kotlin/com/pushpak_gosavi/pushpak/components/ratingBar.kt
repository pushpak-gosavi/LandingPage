package com.pushpak_gosavi.pushpak.components

import androidx.compose.runtime.Composable
import com.pushpak_gosavi.pushpak.utils.Res
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.margin
import com.varabyte.kobweb.compose.ui.modifiers.size
import com.varabyte.kobweb.silk.components.graphics.Image
import org.jetbrains.compose.web.css.px

@Composable
fun ratingBar(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier
    ) {
        repeat(times = 5) {
            Image(
                modifier = Modifier
                    .margin(right = if (it != 4) 2.px else 0.px)
                    .size(16.px),
                src = Res.Icon.starIcon,
                desc = "Star Icon"
            )
        }
    }
}