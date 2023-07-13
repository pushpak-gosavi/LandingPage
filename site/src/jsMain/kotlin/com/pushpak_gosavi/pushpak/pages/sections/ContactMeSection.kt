package com.pushpak_gosavi.pushpak.pages.sections

import androidx.compose.runtime.Composable
import com.pushpak_gosavi.pushpak.components.sectionTitle
import com.pushpak_gosavi.pushpak.models.Section
import com.pushpak_gosavi.pushpak.utils.Constants.SECTION_WIDTH
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px

@Composable
fun contactMeSection(){

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

@Composable
fun contactMeContent(){
    val breakpoint = rememberBreakpoint()
    Column (
        modifier = Modifier
            .fillMaxWidth(
                if(breakpoint >=Breakpoint.MD) 100.percent
                else 90.percent
            ),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        sectionTitle(
            section = Section.Contact,
            modifier = Modifier.margin(topBottom = 20.px),
            alignment = Alignment.CenterHorizontally
        )
    }

}