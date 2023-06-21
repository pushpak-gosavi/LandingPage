package com.pushpak_gosavi.pushpak.components

import androidx.compose.runtime.Composable
import com.pushpak_gosavi.pushpak.models.Theme
import com.pushpak_gosavi.pushpak.utils.Constants.FONT_FAMILY
import com.varabyte.kobweb.compose.css.CSSTransition
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.toAttrs
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Text

@Composable
fun skillBar(
    title:String,
    index:Int,
    progressBarHeight : CSSSizeValue<CSSUnit.px> = 5.px,
    percentage: CSSSizeValue<CSSUnit.percent> = 50.percent,
    animatedPercentage : Int
){
    Column (
        modifier = Modifier
            .fillMaxWidth()
            .margin(bottom = 10.px)
            .maxWidth(500.px)
            .padding(topBottom = 5.px),
    ){
        Row (
            modifier = Modifier
                .fillMaxWidth()
                .margin(bottom = 5.px),
            horizontalArrangement = Arrangement.SpaceBetween
        ){
            P (
                attrs = Modifier
                    .fontFamily(FONT_FAMILY)
                    .fontSize(18.px)
                    .margin(topBottom = 0.px)
                    .fontWeight(FontWeight.Normal)
                    .color(Theme.Secondary.rgb)
                    .toAttrs()
            ){
                Text(title)
            }
            P (
                attrs = Modifier
                    .margin(topBottom = 0.px)
                    .fontFamily(FONT_FAMILY)
                    .fontSize(18.px)
                    .fontWeight(FontWeight.Normal)
                    .color(Theme.Secondary.rgb)
                    .toAttrs()
            ){
                Text("$animatedPercentage%")
            }
        }
        Box (modifier = Modifier
            .fillMaxWidth()
            .backgroundColor(Theme.LightGray.rgb)
            .height(progressBarHeight)){
            Box (modifier = Modifier
                .fillMaxWidth(percentage)
                .backgroundColor(Theme.Primary.rgb)
                .height(progressBarHeight)
                .transition(
                    CSSTransition(
                        property = "width",
                        duration = 1000.ms,
                        delay = 100.ms * index
                    )
                ))
        }
    }
}