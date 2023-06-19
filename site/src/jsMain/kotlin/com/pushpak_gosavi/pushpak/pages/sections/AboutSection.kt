package com.pushpak_gosavi.pushpak.pages.sections

import androidx.compose.runtime.Composable
import com.pushpak_gosavi.pushpak.components.sectionTitle
import com.pushpak_gosavi.pushpak.components.skillBar
import com.pushpak_gosavi.pushpak.models.Section
import com.pushpak_gosavi.pushpak.utils.Constants
import com.pushpak_gosavi.pushpak.utils.Constants.SECTION_WIDTH
import com.varabyte.kobweb.compose.css.margin
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.Section

@Composable
fun aboutSection(){
    Box (
        modifier = Modifier
            .fillMaxSize()
            .id(Section.About.id)
            .maxSize(SECTION_WIDTH)
            .padding(topBottom = 150.px),
        contentAlignment = Alignment.Center,
    ){
//        skillBar(
//            name = "Creative"
//        )
        sectionTitle(
            Section.About,
            alignment = Alignment.Start
        )

    }
}