package com.pushpak_gosavi.pushpak.models

import com.pushpak_gosavi.pushpak.utils.Constants.CORWIN_MINDS
import com.pushpak_gosavi.pushpak.utils.Constants.EVONIX_TECHNOLOGY
import com.pushpak_gosavi.pushpak.utils.Constants.LOREM_IPSUM
import com.pushpak_gosavi.pushpak.utils.Constants.NCSI

enum class Experience(
    val number: String,
    val jobPosition: String,
    val description: String,
    val company: String,
    val from: String,
    val to: String
) {
    First(
        number = "01",
        jobPosition = "Associate Engineer (Mobile)",
        description = NCSI,
        company = "NCSI Technologies Pvt. Ltd.",
        from = "April 2022",
        to = "NOW",
    ),
    Second(
        number = "02",
        jobPosition = "Android Developer",
        description = EVONIX_TECHNOLOGY,
        company = "Evonix Technology",
        from = "February 2021",
        to = "April 2022",
    ),
    Third(
        number = "03",
        jobPosition = "Junior Android Developer",
        description = CORWIN_MINDS,
        company = "Corwin Minds",
        from = "May 2019",
        to = "August 2020",
    )
}