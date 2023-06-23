package com.pushpak_gosavi.pushpak.models

import com.pushpak_gosavi.pushpak.utils.Constants.LOREM_IPSUM_SHORT
import com.pushpak_gosavi.pushpak.utils.Res

enum class Service(
   var icon: String,
   var iconDesription: String,
   var title: String,
   var description: String
) {
    Android(
        icon = Res.Icon.android,
        iconDesription = "Android Icon",
        title = "Android Developmemt",
        description = LOREM_IPSUM_SHORT
    ),
    Flutter(
        icon = Res.Icon.flutter,
        iconDesription = "Flutter Icon",
        title = "Flutter Development",
        description = LOREM_IPSUM_SHORT
    ),
    Web(
        icon = Res.Icon.web, iconDesription = "Web Icon", title = "Web Development", description = LOREM_IPSUM_SHORT
    ),
    AdobeXD(
        icon = Res.Icon.adobeXD,
        iconDesription = "Adobe XD Icon",
        title = "UI Designer",
        description = LOREM_IPSUM_SHORT
    ),
    SQL(
        icon = Res.Icon.sql,
        iconDesription = "SQL Icon",
        title = "Backend Developer",
        description = LOREM_IPSUM_SHORT
    ),
    Cloud(
        icon = Res.Icon.gcp,
        iconDesription = "Cloud  Icon",
        title = "Cloud Engineer",
        description = LOREM_IPSUM_SHORT
    )
}