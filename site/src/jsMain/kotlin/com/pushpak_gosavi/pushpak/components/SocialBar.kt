package com.pushpak_gosavi.pushpak.components

import androidx.compose.runtime.Composable
import com.pushpak_gosavi.pushpak.style.SocialLinksStyle
import com.pushpak_gosavi.pushpak.utils.Constants.GIT_HUB_WEBSITE
import com.pushpak_gosavi.pushpak.utils.Constants.LINKEDIN_WEBSITE
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.navigation.OpenLinkStrategy
import com.varabyte.kobweb.silk.components.icons.fa.*
import com.varabyte.kobweb.silk.components.navigation.Link
import com.varabyte.kobweb.silk.components.style.toModifier
import org.jetbrains.compose.web.css.Color
import org.jetbrains.compose.web.css.px

@Composable
fun socialBar(){
    Column (
        modifier = Modifier
            .borderRadius(20.px)
            .backgroundColor(Color.white)
            .margin(right = 25.px)
            .minWidth(40.px),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,

    ){
        socialLinks()
    }
}

@Composable
private  fun socialLinks(){
    Link(
        modifier = Modifier.margin(bottom = 40.px),
        path = "",
        openExternalLinksStrategy = OpenLinkStrategy.IN_NEW_TAB
    ) {
        FaFacebook(
            modifier = SocialLinksStyle
                .toModifier()
                .padding(25.px),
            size = IconSize.LG,
        )
    }
    Link(
        modifier = Modifier.margin(bottom = 40.px),
        path = "",
        openExternalLinksStrategy = OpenLinkStrategy.IN_NEW_TAB
    ) {
        FaInstagram(
            modifier = SocialLinksStyle
                .toModifier()
                .padding(25.px),
            size = IconSize.LG,
        )
    }
    Link(
        modifier = Modifier.margin(bottom = 40.px),
        path = LINKEDIN_WEBSITE,
        openExternalLinksStrategy = OpenLinkStrategy.IN_NEW_TAB
    ) {
        FaLinkedin(
            modifier = SocialLinksStyle
                .toModifier()
                .padding(25.px),
            size = IconSize.LG,
        )
    }
    Link(
        modifier = Modifier.margin(bottom = 40.px),
        path = GIT_HUB_WEBSITE,
        openExternalLinksStrategy = OpenLinkStrategy.IN_NEW_TAB
    ) {
        FaGithub(
            modifier = SocialLinksStyle
                .toModifier()
                .padding(25.px),
            size = IconSize.LG,
        )
    }
}