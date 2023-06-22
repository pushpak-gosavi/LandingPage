package com.pushpak_gosavi.pushpak.pages.sections

import androidx.compose.runtime.Composable
import com.pushpak_gosavi.pushpak.models.Section
import com.pushpak_gosavi.pushpak.utils.Constants.SECTION_WIDTH
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.id
import com.varabyte.kobweb.compose.ui.modifiers.margin
import com.varabyte.kobweb.compose.ui.modifiers.maxWidth
import com.varabyte.kobweb.compose.ui.modifiers.padding
import com.varabyte.kobweb.silk.components.layout.SimpleGrid
import com.varabyte.kobweb.silk.components.layout.numColumns
import org.jetbrains.compose.web.css.px

@Composable
fun serviceSection() {
    Box(
        modifier = Modifier
            .id(Section.Service.id)
            .padding(topBottom = 100.px)
            .maxWidth(SECTION_WIDTH),
        contentAlignment = Alignment.Center
    ) {
        serviceComponent()
    }
}

@Composable
fun serviceComponent() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

    }
}