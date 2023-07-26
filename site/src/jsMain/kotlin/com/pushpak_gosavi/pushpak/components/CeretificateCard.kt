package com.pushpak_gosavi.pushpak.components

import androidx.compose.runtime.Composable
import com.pushpak_gosavi.pushpak.models.Certificates
import com.pushpak_gosavi.pushpak.models.Theme
import com.varabyte.kobweb.compose.css.ObjectFit
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.components.style.toModifier
import org.jetbrains.compose.web.css.Color
import org.jetbrains.compose.web.css.LineStyle
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.Th

@Composable
fun certificateCard(
    certificates: Certificates,
    breakpoint: Breakpoint,
    modifier: Modifier = Modifier
) {
//    Image(
//        modifier = modifier
//            .size(
//                if (breakpoint > Breakpoint.SM) 610.px
//                else 300.px
//            )
//            .height(if (breakpoint >= Breakpoint.MD) 500.px else 250.px)
//            .border(
//                style = LineStyle.Solid,
//                width = 2.px,
//                color = Theme.Primary.rgb
//            )
//            .borderRadius(20.px)
//            .fillMaxWidth()
//            .maxWidth(
//                if (breakpoint > Breakpoint.SM) 610.px
//                else 300.px
//            )
//            .objectFit(ObjectFit.Fill),
//        src = certificates.imagePath,
//        desc = "Certificate"
//    )

    Column(
        modifier = modifier
            .id("CertificateParentColumn")
    ) {
        Box(
            modifier = Modifier
                .id("CertificateParentBox")
                .maxWidth(600.px)
                //.maxHeight(if (breakpoint >= Breakpoint.MD) 500.px else 250.px)
                //.size(600.px)
                .height(if (breakpoint >= Breakpoint.MD) 500.px else 250.px)
                .width(if (breakpoint >= Breakpoint.MD) 600.px else 300.px)
                .margin(bottom = 20.px)
                .border(
                    style = LineStyle.Solid,
                    width = 2.px,
                    color = Theme.Primary.rgb
                )
                .borderRadius(10.px)
        ) {
            Image(
                modifier = Modifier
//                    .height(if (breakpoint >= Breakpoint.MD) 500.px else 250.px)
//                    .width(if (breakpoint >= Breakpoint.MD) 600.px else 300.px)
                    .fillMaxSize()
                    .padding(5.px)
                .objectFit(ObjectFit.Fill),
                src = certificates.imagePath,
                desc = certificates.title
            )
        }
    }
}