package com.pushpak_gosavi.pushpak.components

import androidx.compose.runtime.Composable
import com.pushpak_gosavi.pushpak.models.Theme
import com.pushpak_gosavi.pushpak.style.InputTypeStyle
import com.pushpak_gosavi.pushpak.style.MainButtonStyle
import com.varabyte.kobweb.compose.css.Cursor
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.attrsModifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.silk.components.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.components.style.toModifier
import org.jetbrains.compose.web.attributes.InputType
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.*

@Composable
fun contactMeForm(
    breakpoint: Breakpoint
) {
    Form {
        Label(
            attrs = Modifier
                .classNames("form-label")
                .toAttrs()
        ) {
            Text("Name")
        }
        Input(
            type = InputType.Text,
            attrs = InputTypeStyle.toModifier()
                .classNames("form-control")
                .id("inputName")
                .margin(bottom = 10.px)
                .boxShadow(
                    offsetX = 0.px,
                    offsetY = 0.px,
                    blurRadius = null,
                    spreadRadius = null,
                )
                .width(if (breakpoint >= Breakpoint.MD) 500.px else 250.px)
                .backgroundColor(Theme.LighterGray.rgb)
                .attrsModifier {
                    attr("placeholder", "Full Name")
                    attr("required" ,"true")
                }
                .toAttrs(),
        )

        Label(
            attrs = Modifier
                .classNames("form-label")
                .toAttrs()
        ) {
            Text("Email")
        }

        Input(
            type = InputType.Email,
            attrs = InputTypeStyle.toModifier()
                .width(if (breakpoint >= Breakpoint.MD) 500.px else 250.px)
                .margin(bottom = 10.px)
                .id("inputEmail")
                .boxShadow(
                    offsetX = 0.px,
                    offsetY = 0.px,
                    blurRadius = null,
                    spreadRadius = null,
                )
                .classNames("form-control")
                .backgroundColor(Theme.LighterGray.rgb)
                .attrsModifier {
                    attr("placeholder", "Email Address")
                    attr("required" ,"true")
                }
                .toAttrs()
        )

        Label(
            attrs = Modifier
                .classNames("form-label")
                .toAttrs()
        ) {
            Text("Message")
        }

        TextArea(
            attrs = InputTypeStyle.toModifier()
                .classNames("form-control")
                .id("inputMessage")
                .height(150.px)
                .maxHeight(500.px)
                .margin(bottom = 20.px)
                .boxShadow(
                    offsetX = 0.px,
                    offsetY = 0.px,
                    blurRadius = null,
                    spreadRadius = null,
                )
                .backgroundColor(Theme.LighterGray.rgb)
                .width(if (breakpoint >= Breakpoint.MD) 500.px else 250.px)
                .attrsModifier {
                    attr("placeholder", "Type Message here")
                    attr("required" ,"true")
                }
                .toAttrs()
        )

        Box(
            modifier = Modifier
                .fillMaxWidth(),
            contentAlignment = Alignment.Center
        ) {
            Button(
                attrs = MainButtonStyle
                    .toModifier()
                    .height(40.px)
                    .backgroundColor(Theme.Primary.rgb)
                    .border(0.px)
                    .borderRadius(5.px)
                    .color(Colors.White)
                    .cursor(Cursor.Pointer)
                    .toAttrs()
            ) {
                Text("Submit")
            }
        }
    }

}