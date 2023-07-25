package com.pushpak_gosavi.pushpak.models

import com.pushpak_gosavi.pushpak.utils.Constants.ADOBEXD_SERVICE
import com.pushpak_gosavi.pushpak.utils.Constants.ANDROID_SERVICE
import com.pushpak_gosavi.pushpak.utils.Constants.FLUTTER_SERVIC
import com.pushpak_gosavi.pushpak.utils.Constants.GOOGLE_SERVICE
import com.pushpak_gosavi.pushpak.utils.Constants.LOREM_IPSUM_SHORT
import com.pushpak_gosavi.pushpak.utils.Constants.SQL_SERVICE
import com.pushpak_gosavi.pushpak.utils.Constants.WEB_SERVICE
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
        description = ANDROID_SERVICE
    ),
    Flutter(
        icon = Res.Icon.flutter,
        iconDesription = "Flutter Icon",
        title = "Flutter Development",
        description = FLUTTER_SERVIC
    ),
    Web(
        icon = Res.Icon.web, iconDesription = "Web Icon", title = "Web Development", description = WEB_SERVICE
    ),
    AdobeXD(
        icon = Res.Icon.adobeXD,
        iconDesription = "Adobe XD Icon",
        title = "UI Designer",
        description = ADOBEXD_SERVICE
    ),
    SQL(
        icon = Res.Icon.sql,
        iconDesription = "SQL Icon",
        title = "Backend Developer",
        description = SQL_SERVICE
    ),
    Cloud(
        icon = Res.Icon.gcp,
        iconDesription = "Cloud  Icon",
        title = "Cloud Engineer",
        description = GOOGLE_SERVICE
    )
}