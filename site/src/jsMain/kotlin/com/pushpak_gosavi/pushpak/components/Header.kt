package com.pushpak_gosavi.pushpak.components

import androidx.compose.runtime.Composable
import com.pushpak_gosavi.pushpak.models.Section
import com.pushpak_gosavi.pushpak.models.Theme
import com.pushpak_gosavi.pushpak.style.LogoStyle
import com.pushpak_gosavi.pushpak.style.NavigationItemStyle
import com.pushpak_gosavi.pushpak.utils.Constants.FONT_FAMILY
import com.pushpak_gosavi.pushpak.utils.Res.Image.logo
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.css.ObjectFit
import com.varabyte.kobweb.compose.css.TextDecorationLine
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.navigation.Link
import com.varabyte.kobweb.silk.components.style.toModifier
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
        modifier = LogoStyle.toModifier(),
        src = logo,
        desc = "Logo"
    )
}

@Composable
fun rightSide(){
    Row (
        modifier = Modifier
            .fillMaxWidth(80.percent)
            .padding(20.px),
        horizontalArrangement = Arrangement.End
    ){
        Section.values().take(6).forEach { section ->
            Link(
                modifier = NavigationItemStyle.toModifier()
                    .padding(right = 30.px)
                    .fontFamily(FONT_FAMILY)
                    .fontSize(18.px)
                    .fontWeight(FontWeight.Normal)
                    .textDecorationLine(TextDecorationLine.None),
                path = section.path,
                text = section.title
            )
        }
    }
}