package com.pushpak_gosavi.pushpak.pages.sections

import androidx.compose.runtime.Composable
import com.pushpak_gosavi.pushpak.components.certificateCard
import com.pushpak_gosavi.pushpak.components.portfolioCard
import com.pushpak_gosavi.pushpak.components.sectionTitle
import com.pushpak_gosavi.pushpak.models.Certificates
import com.pushpak_gosavi.pushpak.models.Portfolio
import com.pushpak_gosavi.pushpak.models.Section
import com.pushpak_gosavi.pushpak.models.Theme
import com.pushpak_gosavi.pushpak.style.ArrowStyle
import com.pushpak_gosavi.pushpak.style.CertificateLeftArrowStyle
import com.pushpak_gosavi.pushpak.style.CertificateRightArrowStyle
import com.pushpak_gosavi.pushpak.utils.Constants.SECTION_WIDTH
import com.varabyte.kobweb.compose.css.Cursor
import com.varabyte.kobweb.compose.css.Overflow
import com.varabyte.kobweb.compose.css.ScrollBehavior
import com.varabyte.kobweb.compose.css.Visibility
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.icons.fa.FaArrowLeft
import com.varabyte.kobweb.silk.components.icons.fa.FaArrowRight
import com.varabyte.kobweb.silk.components.icons.fa.IconSize
import com.varabyte.kobweb.silk.components.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.components.style.toModifier
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
import kotlinx.browser.document
import org.jetbrains.compose.web.css.Color
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.Section

/*
@Composable
fun certificateSection() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(topBottom = 100.px)
            .id(Section.Certification.id)
            .maxWidth(SECTION_WIDTH),
        contentAlignment = Alignment.Center
    ) {
        certificationContent()
    }
}

@Composable
fun certificationContent() {
    val breakpoint = rememberBreakpoint()
    Column(
        modifier = Modifier
            .maxWidth(950.px)
            .fillMaxWidth(
                if (breakpoint >= Breakpoint.MD) 100.percent
                else 90.percent
            ),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        sectionTitle(
            section = Section.Certification,
            modifier = Modifier.margin(bottom = 25.px),
            alignment = Alignment.CenterHorizontally
        )
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {

            Box(
                modifier = CertificateLeftArrowStyle.toModifier().size(50.px).margin(right = 10.px)
                    .visibility(if (breakpoint > Breakpoint.SM) Visibility.Visible else Visibility.Hidden)
            ) {
                Box(
                    modifier = Modifier
                        .id("leftBox")
                        .fillMaxSize()
                        .padding(5.px)
                        .onClick {
                            document.getElementById("certificateRow")
                                ?.scrollBy(
                                     if (breakpoint > Breakpoint.SM) -615.0
                                    else -305.0, y = 0.0
                                )
                        }
                        .borderRadius(30.px)
                        .cursor(Cursor.Pointer),
                    contentAlignment = Alignment.Center
                ) {
                    FaArrowLeft(
                        modifier = Modifier
                            .id("leftArrow"),
                        size = IconSize.LG
                    )
                }
            }

            certificateCards(breakpoint = breakpoint)
            Box(
                modifier = CertificateRightArrowStyle.toModifier().margin(left = 10.px).size(50.px)
                    .visibility(if (breakpoint > Breakpoint.SM) Visibility.Visible else Visibility.Hidden)
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .id("rightBox")
                        .padding(5.px)
                        .borderRadius(30.px)
                        .onClick {
                            document.getElementById("certificateRow")
                                ?.scrollBy(
                                    x = if (breakpoint > Breakpoint.SM) 615.0
                                    else 305.0, y = 0.0
                                )
                        }
                        .cursor(Cursor.Pointer),
                    contentAlignment = Alignment.Center
                ) {
                    FaArrowRight(
                        modifier = Modifier.id("rightArrow"),
                        size = IconSize.LG,
                    )
                }
            }
        }

        certificatesArrow(modifier = Modifier.visibility(if (breakpoint > Breakpoint.SM) Visibility.Hidden else Visibility.Visible))
    }
}

@Composable
fun certificateCards(breakpoint: Breakpoint) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .id("certificateRow")
            .margin(bottom = 25.px)
            .maxWidth(
                 if (breakpoint > Breakpoint.SM) 610.px
                else 305.px
            )
            .overflow(Overflow.Hidden)
            .scrollBehavior(ScrollBehavior.Smooth),
    ) {
        Certificates.values().forEach { certificate: Certificates ->
            certificateCard(
                certificates = certificate,
                breakpoint = breakpoint,
                modifier = Modifier
                    .margin(right = if (certificate != Certificates.FireBase) 5.px else 0.px)
            )
        }
    }
}

@Composable
private fun certificatesArrow(modifier: Modifier) {
    Row(
        modifier = modifier
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.Center
    ) {
        FaArrowLeft(
            modifier = ArrowStyle.toModifier()
                .margin(leftRight = 10.px)
                .cursor(Cursor.Pointer)
                .onClick {
                    document.getElementById("certificateRow")
                        ?.scrollBy(x = -305.0, y = 0.0)
                },
            size = IconSize.LG,
        )
        FaArrowRight(
            modifier = ArrowStyle.toModifier()
                .margin(leftRight = 10.px)
                .cursor(Cursor.Pointer)
                .onClick {
                    document.getElementById("certificateRow")
                        ?.scrollBy(x = 305.0, y = 0.0)
                },
            size = IconSize.LG,
        )

    }
}*/

@Composable
fun certificateSection() {
    Box(
        modifier = Modifier
            .id(Section.Certification.id)
            .maxWidth(SECTION_WIDTH)
            .padding(topBottom = 100.px),
        contentAlignment = Alignment.Center,
    ) {
        certificateContent()
    }
}

@Composable
fun certificateContent() {
    val breakpoint = rememberBreakpoint()
    Column(
        modifier = Modifier
            .maxWidth(950.px)
            .fillMaxWidth(
//                if (breakpoint >= Breakpoint.MD) 100.percent
//                else 90.percent
            ),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        sectionTitle(
            section = Section.Certification,
            modifier = Modifier.fillMaxWidth().margin(bottom = 25.px),
            alignment = Alignment.CenterHorizontally
        )
        Row(
            modifier = Modifier
                .fillMaxWidth()
            //.maxWidth(660.px),
            , verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            leftRoundArrow(
                breakpoint = breakpoint,
                modifier = Modifier.visibility(if (breakpoint > Breakpoint.SM) Visibility.Visible else Visibility.Hidden)
            )
            certificatesCards(breakpoint = breakpoint)
            rightRoundArrow(
                breakpoint = breakpoint,
                modifier = Modifier.visibility(if (breakpoint > Breakpoint.SM) Visibility.Visible else Visibility.Hidden)
            )
        }
        certificateArrows(
            breakpoint = breakpoint,
            modifier = Modifier.visibility(if (breakpoint <= Breakpoint.SM) Visibility.Visible else Visibility.Hidden)
        )
    }
}

@Composable
fun leftRoundArrow(modifier: Modifier, breakpoint: Breakpoint) {
    Box(modifier = modifier) {
        Box(
            modifier = CertificateLeftArrowStyle.toModifier().size(50.px).margin(right = 10.px)
                .visibility(if (breakpoint > Breakpoint.SM) Visibility.Visible else Visibility.Hidden)
        ) {
            Box(
                modifier = Modifier
                    .id("leftBox")
                    .fillMaxSize()
                    .padding(5.px)
                    .onClick {
                        document.getElementById("certificateContainer")
                            ?.scrollBy(
                                x = if (breakpoint > Breakpoint.SM) -625.0
                                else -325.0, y = 0.0
                            )
                    }
                    .borderRadius(30.px)
                    .cursor(Cursor.Pointer),
                contentAlignment = Alignment.Center
            ) {
                FaArrowLeft(
                    modifier = Modifier
                        .id("leftArrow"),
                    size = IconSize.LG
                )
            }
        }
    }

}

@Composable
fun rightRoundArrow(modifier: Modifier, breakpoint: Breakpoint) {
    Box(modifier = modifier) {
        Box(
            modifier = CertificateRightArrowStyle.toModifier().size(50.px).margin(left = 10.px)
                .visibility(if (breakpoint > Breakpoint.SM) Visibility.Visible else Visibility.Hidden)
        ) {
            Box(
                modifier = Modifier
                    .id("rightBox")
                    .fillMaxSize()
                    .padding(5.px)
                    .onClick {
                        document.getElementById("certificateContainer")
                            ?.scrollBy(
                                x = if (breakpoint > Breakpoint.SM) 625.0
                                else 325.0, y = 0.0
                            )
                    }
                    .borderRadius(30.px)
                    .cursor(Cursor.Pointer),
                contentAlignment = Alignment.Center
            ) {
                FaArrowRight(
                    modifier = Modifier
                        .id("rightArrow"),
                    size = IconSize.LG
                )
            }
        }
    }
}

@Composable
fun certificatesCards(breakpoint: Breakpoint) {
    Row(
        modifier = Modifier
            .id("certificateContainer")
            .fillMaxWidth()
            .margin(bottom = 10.px)
            .maxWidth(
                if (breakpoint > Breakpoint.SM) 600.px
                else 300.px
            )
            .overflow(Overflow.Hidden)
            .scrollBehavior(ScrollBehavior.Smooth)

    ) {
        Certificates.values().forEach { certificate: Certificates ->
            certificateCard(
                modifier = Modifier.margin(right = if (certificate != Certificates.FireBase) 25.px else 0.px),
                certificates = certificate,
                breakpoint = breakpoint
            )
        }
    }
}

@Composable
fun certificateArrows(breakpoint: Breakpoint, modifier: Modifier) {
    Row(
        modifier = modifier
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.Center
    ) {
        FaArrowLeft(
            modifier = ArrowStyle.toModifier()
                .margin(leftRight = 10.px)
                .cursor(Cursor.Pointer)
                .onClick {
                    document.getElementById("certificateContainer")
                        ?.scrollBy(
                            x = if (breakpoint > Breakpoint.SM) -625.0
                            else -325.0, y = 0.0
                        )
                },
            size = IconSize.LG,
        )
        FaArrowRight(
            modifier = ArrowStyle.toModifier()
                .margin(leftRight = 10.px)
                .cursor(Cursor.Pointer)
                .onClick {
                    document.getElementById("certificateContainer")
                        ?.scrollBy(
                            x = if (breakpoint > Breakpoint.SM) 625.0
                            else 325.0, y = 0.0
                        )
                },
            size = IconSize.LG,
        )

    }
}