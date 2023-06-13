package com.pushpak_gosavi.pushpak.pages.sections

import androidx.compose.runtime.Composable
import com.pushpak_gosavi.pushpak.components.header
import com.pushpak_gosavi.pushpak.components.socialBar
import com.pushpak_gosavi.pushpak.models.Section
import com.pushpak_gosavi.pushpak.models.Theme
import com.pushpak_gosavi.pushpak.style.MainButtonStyle
import com.pushpak_gosavi.pushpak.style.MainImageStyle
import com.pushpak_gosavi.pushpak.utils.Constants.FONT_FAMILY
import com.pushpak_gosavi.pushpak.utils.Constants.LOREM_IPSUM
import com.pushpak_gosavi.pushpak.utils.Constants.SECTION_WIDTH
import com.pushpak_gosavi.pushpak.utils.Res
import com.varabyte.kobweb.compose.css.*
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.layout.SimpleGrid
import com.varabyte.kobweb.silk.components.layout.numColumns
import com.varabyte.kobweb.silk.components.navigation.Link
import com.varabyte.kobweb.silk.components.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.components.style.toModifier
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
import org.jetbrains.compose.web.css.Color
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.Button
import org.jetbrains.compose.web.dom.Col
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Text
import kotlin.math.atan

@Composable
fun mainSection(){
    val breakpoint = rememberBreakpoint()
    Box (
        modifier = Modifier.fillMaxSize().maxSize(SECTION_WIDTH),
        contentAlignment = Alignment.TopCenter
    ) {
        mainBackground()
        mainContent(breakpoint)
    }
}

@Composable
fun mainBackground(){
    Image(
        modifier = Modifier.fillMaxSize().objectFit(ObjectFit.Cover),
        src = Res.Image.background,
        desc = "Background Image")

}

@Composable
fun mainContent(breakpoint: Breakpoint){
    Column(
        modifier = Modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        header()
        Column (
            modifier = Modifier
                .fillMaxSize(),
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            SimpleGrid(
                modifier = Modifier.fillMaxWidth(
                    if(breakpoint >= Breakpoint.MD) 80.percent
                    else 90.percent
                ),
                numColumns = numColumns(base = 1, md=2)
            )
            {
                mainText(breakpoint)
                mainImage()
            }
        }
    }
}

@Composable
fun mainText(breakpoint: Breakpoint){
    Row (
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ) {
        if(breakpoint > Breakpoint.MD){
            socialBar()
        }
        Column {
            P(
                attrs = Modifier
                    .fontFamily(FONT_FAMILY)
                    .fontSize(if (breakpoint >= Breakpoint.LG)45.px else 20.px)
                    .fontWeight(FontWeight.Normal)
                    .color(Theme.Primary.rgb)
                    .margin(topBottom = 0.px)
                    .toAttrs()
            ) {
                Text("Hello, I'm ")
            }
            P (
                attrs = Modifier
                    .margin(top = 20.px, bottom = 0.px)
                    .fontFamily(FONT_FAMILY)
                    .fontSize(if (breakpoint >= Breakpoint.LG) 68.px else 40.px)
                    .fontWeight(FontWeight.Bolder)
                    .color(Theme.Secondary.rgb)
                    .toAttrs()
            ){
                Text("Pushpak Gosavi")
            }
            P (
                attrs = Modifier
                    .margin(top = 10.px, bottom = 5.px)
                    .fontWeight(FontWeight.Bold)
                    .fontSize(20.px)
                    .fontFamily(FONT_FAMILY)
                    .color(Theme.Secondary.rgb)
                    .toAttrs()
            ){
                Text("Mobile Application Developer")
            }
            P(
                attrs = Modifier
                    .margin(bottom = 25.px)
                    .maxWidth(400.px)
                    .fontFamily(FONT_FAMILY)
                    .fontWeight(FontWeight.Normal)
                    .fontStyle(FontStyle.Italic)
                    .fontSize(15.px)
                    .color(Theme.Secondary.rgb)
                    .toAttrs()
            ){
                Text(LOREM_IPSUM)
            }

            Button (
                attrs = MainButtonStyle.toModifier()
                    .height(40.px)
                    .borderRadius(r = 5.px)
                    .backgroundColor(Theme.Primary.rgb)
                    .color(Color.white)
                    .border(width = 0.px)
                    .cursor(cursor = Cursor.Pointer)
                    .toAttrs()
            ) {
                Link(
                    modifier = Modifier
                        .textDecorationLine(TextDecorationLine.None)
                        .color(Color.white),
                    path = Section.Contact.path,
                    text = "Hire me"
                )
            }
        }
    }
}

@Composable
fun mainImage(){
    Column(
        modifier = Modifier
            .fillMaxSize(80.percent)
            .fillMaxHeight(),
        verticalArrangement = Arrangement.Bottom
    ) {
        Image(
            modifier = MainImageStyle.toModifier().fillMaxWidth(),
            src = Res.Image.pushpak_image,
            desc = "Main Image"
        )
    }
}