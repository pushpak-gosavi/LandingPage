package com.pushpak_gosavi.pushpak.models

import com.pushpak_gosavi.pushpak.utils.Res

enum class Achievement(
    val icon: String,
    val number: Int,
    val description: String
) {
    Completed(
        icon = Res.Icon.checkMarkIcon,
        number = 120,
        description = "Completed Projects"
    ),
    Active(
        icon = Res.Icon.shieldIcon,
        number = 12,
        description = "Active Projects"
    ),
    Satisfied(
        icon = Res.Icon.happyIcon,
        number = 42,
        description = "Satisfied Clients"
    ),
    Team(
        icon = Res.Icon.userIcon,
        number = 10,
        description = "Team Members"
    )
}