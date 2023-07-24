package com.pushpak_gosavi.pushpak.pages.sections

import androidx.compose.runtime.*
import com.pushpak_gosavi.pushpak.components.contactMeForm
import com.pushpak_gosavi.pushpak.components.sectionTitle
import com.pushpak_gosavi.pushpak.models.Section
import com.pushpak_gosavi.pushpak.utils.Constants.SECTION_WIDTH
import com.pushpak_gosavi.pushpak.utils.observeViewPortEntered
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import org.jetbrains.compose.web.ExperimentalComposeWebApi
import org.jetbrains.compose.web.css.deg
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px

@Composable
fun contactMeSection() {

    Box(
        modifier = Modifier
            .padding(topBottom = 100.px)
            .id(Section.Contact.id)
            .maxWidth(SECTION_WIDTH)
            .fillMaxWidth(),
        contentAlignment = Alignment.Center
    ) {
        contactMeContent()
    }

}

@OptIn(ExperimentalComposeWebApi::class)
@Composable
fun contactMeContent() {
    val breakpoint = rememberBreakpoint()
    val scope = rememberCoroutineScope()
    var animationRotationAngle by remember { mutableStateOf(0.deg) }

    observeViewPortEntered(
        sectionId = Section.Contact.id,
        distanceFromTop = 500.0,
        onViewPortEntered = {
            animationRotationAngle = 10.deg
            scope.launch {
                delay(500)
                animationRotationAngle = 0.deg
            }
        }
    )
    Column(
        modifier = Modifier
            .fillMaxWidth(
                if (breakpoint >= Breakpoint.MD) 100.percent
                else 90.percent
            ),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        sectionTitle(
            section = Section.Contact,
            modifier = Modifier
                .margin(bottom = 25.px)
                .transform {
                    rotate(animationRotationAngle)
                },
            alignment = Alignment.CenterHorizontally
        )
        contactMeForm(
            breakpoint = breakpoint
        )
    }

}