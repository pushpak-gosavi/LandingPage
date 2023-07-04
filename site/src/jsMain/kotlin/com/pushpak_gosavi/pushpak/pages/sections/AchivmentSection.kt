package com.pushpak_gosavi.pushpak.pages.sections

import androidx.compose.runtime.*
import com.pushpak_gosavi.pushpak.components.achievementCard
import com.pushpak_gosavi.pushpak.models.Achievement
import com.pushpak_gosavi.pushpak.models.Portfolio
import com.pushpak_gosavi.pushpak.models.Section
import com.pushpak_gosavi.pushpak.models.Theme
import com.pushpak_gosavi.pushpak.utils.Constants.SECTION_WIDTH
import com.pushpak_gosavi.pushpak.utils.animateNumbers
import com.pushpak_gosavi.pushpak.utils.observeViewPortEntered
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.layout.SimpleGrid
import com.varabyte.kobweb.silk.components.layout.numColumns
import com.varabyte.kobweb.silk.components.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch
import org.jetbrains.compose.web.css.px

@Composable
fun achievementSection() {
    val breakpoint = rememberBreakpoint()
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .id(Section.Achievements.id)
            .maxWidth(SECTION_WIDTH)
            .padding(topBottom = 100.px)
            .backgroundColor(Theme.LighterGray.rgb),
        contentAlignment = Alignment.Center,
    ) {
        achievementContent(breakpoint = breakpoint)
    }
}

@Composable
fun achievementContent(breakpoint: Breakpoint) {
    val scope = rememberCoroutineScope()
    var viewPortEntered by remember { mutableStateOf(false) }
    val animatedNumber = remember { mutableStateListOf(0, 0, 0, 0) }

    observeViewPortEntered(
        sectionId = Section.Achievements.id,
        distanceFromTop = 700.0,
        onViewPortEntered = {
            viewPortEntered = true
            Achievement.values().forEach { achievement ->
                scope.launch {
                    animateNumbers(
                        number = achievement.number,
                        onUpdate = {
                            animatedNumber[achievement.ordinal] = it
                        }
                    )
                }
            }

        }

    )
    SimpleGrid(
        numColumns = numColumns(base = 1, md = 2, lg = 4)
    ) {
        Achievement.values().forEach { achievement ->
            achievementCard(
                modifier = Modifier.margin(
                    right =
                    if (achievement == Achievement.Team) 0.px
                    else {
                        if (breakpoint == Breakpoint.SM) 40.px else 0.px
                    },
                    bottom = if (breakpoint > Breakpoint.MD) 0.px else 40.px
                ),

                animatedNumber = if (viewPortEntered) animatedNumber[achievement.ordinal] else 0,
                achievement = achievement
            )
        }
    }
}