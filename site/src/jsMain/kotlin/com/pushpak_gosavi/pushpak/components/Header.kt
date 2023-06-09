package com.pushpak_gosavi.pushpak.components

import androidx.compose.runtime.Composable
import com.pushpak_gosavi.pushpak.models.Section
import com.pushpak_gosavi.pushpak.models.Theme
import com.pushpak_gosavi.pushpak.utils.Res.Image.logo
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.css.ObjectFit
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.navigation.Link
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px

@Composable
fun header() {
    Row (
        modifier = Modifier.
        fillMaxWidth(80.percent).
        id(Section.Home.id).
        borderRadius(50.px).
        margin(20.px).
        backgroundColor(Theme.LighterGray.rgb),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ){
        leftSide()
        rightSide()
    }
}

@Composable
fun leftSide(){
    Image(
        src = logo,
        desc = "Logo"
    )
}

@Composable
fun rightSide(){
    Row (
        modifier = Modifier
            .fillMaxWidth(80.percent)
            .padding(10.px),
        horizontalArrangement = Arrangement.End
    ){
        Section.values().take(6).forEach { section ->
            Link(
                modifier = Modifier
                    .padding(right = 30.px)
                    .fontFamily("Roboto")
                    .fontSize(18.px)
                    .fontWeight(FontWeight.Normal),
                path = section.path,
                text = section.title
            )
        }
    }
}