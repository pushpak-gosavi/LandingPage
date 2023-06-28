package com.pushpak_gosavi.pushpak.components

import androidx.compose.runtime.Composable
import com.pushpak_gosavi.pushpak.models.Portfolio
import com.pushpak_gosavi.pushpak.models.Theme
import com.pushpak_gosavi.pushpak.style.PortfolioSectionStyle
import com.pushpak_gosavi.pushpak.utils.Constants.FONT_FAMILY
import com.pushpak_gosavi.pushpak.utils.Res
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.css.ObjectFit
import com.varabyte.kobweb.compose.css.TextDecorationLine
import com.varabyte.kobweb.compose.css.functions.grayscale
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Color.Companion.argb
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.navigation.OpenLinkStrategy
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.icons.fa.FaFill
import com.varabyte.kobweb.silk.components.navigation.Link
import com.varabyte.kobweb.silk.components.style.toModifier
import org.jetbrains.compose.web.css.Color
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Text

@Composable
fun portfolioCard(
    modifier: Modifier = Modifier,
    portfolio: Portfolio
) {
    Link(
        modifier = PortfolioSectionStyle.toModifier().textDecorationLine(TextDecorationLine.None),
        path = portfolio.apkLink,
        openExternalLinksStrategy = OpenLinkStrategy.IN_NEW_TAB
    ) {
        Column(
            modifier = modifier
                .id("parentColumn")
        ) {
            Box(
                modifier = Modifier
                    .id("parentBox")
                    .maxWidth(300.px)
                    .size(300.px)
                    .margin(bottom = 20.px)
            ) {
                Image(
                    modifier = Modifier
                        .size(300.px)
                        .objectFit(ObjectFit.Cover),
                    src = portfolio.image,
                    desc = "Portfolio ${portfolio.title}"
                )

                Box(
                    modifier = Modifier
                        .id("greenOverly")
                        .margin(bottom = 20.px)
                        .fillMaxHeight(),
                    contentAlignment = Alignment.Center
                ) {
                    Image(
                        src = Res.Icon.link_icon,
                        modifier = Modifier
                            .id("linkIcon")
                            .size(24.px)
                            .filter(grayscale(100.percent))
                    )
                }
            }

            P(
                attrs = Modifier
                    .fillMaxWidth()
                    .id("portfolioTitle")
                    .fontFamily(FONT_FAMILY)
                    .fontSize(18.px)
                    .margin(topBottom = 0.px)
                    .fontWeight(FontWeight.Bold)
                    .toAttrs()
            ) {
                Text(portfolio.title)
            }

            P(
                attrs = Modifier
                    .fillMaxWidth()
                    .id("portfolioDesc")
                    .fontFamily(FONT_FAMILY)
                    .fontSize(14.px)
                    .margin(topBottom = 0.px)
                    .fontWeight(FontWeight.Normal)
                    .opacity(50.percent)
                    .color(Theme.Secondary.rgb)
                    .toAttrs()
            ) {
                Text(portfolio.description)
            }
        }
    }
}