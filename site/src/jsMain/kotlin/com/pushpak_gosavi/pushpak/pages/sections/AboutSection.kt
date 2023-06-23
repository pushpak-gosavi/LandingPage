package com.pushpak_gosavi.pushpak.pages.sections

import androidx.compose.runtime.*
import com.pushpak_gosavi.pushpak.components.sectionTitle
import com.pushpak_gosavi.pushpak.components.skillBar
import com.pushpak_gosavi.pushpak.models.Section
import com.pushpak_gosavi.pushpak.models.Skill
import com.pushpak_gosavi.pushpak.models.Theme
import com.pushpak_gosavi.pushpak.style.AboutImageStyle
import com.pushpak_gosavi.pushpak.style.AboutSectionText
import com.pushpak_gosavi.pushpak.utils.Constants.FONT_FAMILY
import com.pushpak_gosavi.pushpak.utils.Constants.LOREM_IPSUM_SHORT
import com.pushpak_gosavi.pushpak.utils.Constants.SECTION_WIDTH
import com.pushpak_gosavi.pushpak.utils.Res
import com.pushpak_gosavi.pushpak.utils.animateNumbers
import com.pushpak_gosavi.pushpak.utils.observeViewPortEntered
import com.varabyte.kobweb.compose.css.FontStyle
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.layout.SimpleGrid
import com.varabyte.kobweb.silk.components.layout.numColumns
import com.varabyte.kobweb.silk.components.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.components.style.toModifier
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
import kotlinx.coroutines.launch
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Text

@Composable
fun aboutSection() {
    val breakpoint = rememberBreakpoint()
    Box(
        modifier = Modifier
            .fillMaxSize()
            .id(Section.About.id)
            .maxSize(SECTION_WIDTH)
            .padding(topBottom = 100.px),
        contentAlignment = Alignment.Center,
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth(
                    if (breakpoint >= Breakpoint.MD) 100.percent
                    else 90.percent
                )
                .maxWidth(1200.px),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            SimpleGrid(
                modifier = Modifier
                    .fillMaxWidth(
                        if (breakpoint >= Breakpoint.MD) 90.percent
                        else 100.percent
                    ),
                numColumns = numColumns(base = 1, md = 2)
            ) {
                if (breakpoint >= Breakpoint.MD) {
                    aboutImageSection()
                }
                aboutMeInfo()
            }
        }
    }
}

@Composable
fun aboutImageSection() {
    Box(
        modifier = Modifier.fillMaxWidth(),
        contentAlignment = Alignment.Center
    ) {
        Image(
            modifier = AboutImageStyle.toModifier()
                .fillMaxWidth(80.percent),
            src = Res.Image.about_image,
            desc = "about me Image"
        )
    }
}

@Composable
fun aboutMeInfo() {
    val scope = rememberCoroutineScope()
    var viewportEntered by remember { mutableStateOf(false) }
    val animatedPercentage = remember { mutableStateListOf(0, 0, 0, 0, 0) }
    observeViewPortEntered(
        sectionId = Section.About.id,
        distanceFromTop = 300.0,
        onViewPortEntered = {
            viewportEntered = true
            Skill.values().forEach { skill ->
                scope.launch {
                    animateNumbers(
                        number = skill.percentage.value.toInt(),
                        onUpdate = {
                            animatedPercentage[skill.ordinal] = it
                        }
                    )
                }
            }

        }
    )
    Column(
        modifier = Modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.Center
    ) {
        sectionTitle(section = Section.About)
        P(
            attrs = AboutSectionText.toModifier()
                .margin(topBottom = 25.px)
                .fontFamily(FONT_FAMILY)
                .maxWidth(500.px)
                .fontWeight(FontWeight.Normal)
                .fontStyle(FontStyle.Italic)
                .fontSize(18.px)
                .color(Theme.Secondary.rgb)
                .toAttrs()
        )
        {
            Text(LOREM_IPSUM_SHORT)
        }

        Skill.values().forEach { skill ->
            skillBar(
                title = skill.title,
                index = skill.ordinal,
                percentage = if (viewportEntered) skill.percentage else 0.percent,
                animatedPercentage = if (viewportEntered) animatedPercentage[skill.ordinal] else 0
            )
        }
    }
}
