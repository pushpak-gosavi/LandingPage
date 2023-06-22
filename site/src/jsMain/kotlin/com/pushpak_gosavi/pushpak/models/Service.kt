package com.pushpak_gosavi.pushpak.models

import com.pushpak_gosavi.pushpak.utils.Constants.LOREM_IPSUM_SHORT
import com.pushpak_gosavi.pushpak.utils.Res

enum class Service(
    image: String, imageDescription: String, title: String, description: String
) {
    Android(
        image = Res.Icon.android,
        imageDescription = "Android Icon",
        title = "Android Developmemt",
        description = LOREM_IPSUM_SHORT
    ),
    Flutter(
        image = Res.Icon.flutter,
        imageDescription = "Flutter Icon",
        title = "Flutter Development",
        description = LOREM_IPSUM_SHORT
    ),
    Web(
        image = Res.Icon.web, imageDescription = "Web Icon", title = "Web Development", description = LOREM_IPSUM_SHORT
    ),
    AdobeXD(
        image = Res.Icon.adobeXD,
        imageDescription = "Adobe XD Icon",
        title = "UI Designer",
        description = LOREM_IPSUM_SHORT
    ),
    SQL(
        image = Res.Icon.sql,
        imageDescription = "SQL Icon",
        title = "Backend Developer",
        description = LOREM_IPSUM_SHORT
    ),
    Cloud(
        image = Res.Icon.gcp,
        imageDescription = "Cloud  Icon",
        title = "Cloud Engineer",
        description = LOREM_IPSUM_SHORT
    )
}