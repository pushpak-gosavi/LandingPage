package com.pushpak_gosavi.pushpak.models

import com.pushpak_gosavi.pushpak.utils.Constants.LOREM_IPSUM

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
        description = LOREM_IPSUM,
        company = "NCSI",
        from = "April 2022",
        to = "NOW",
    ),
    Second(
        number = "02",
        jobPosition = "Android Developer",
        description = LOREM_IPSUM,
        company = "Evonix Technology",
        from = "February 2021",
        to = "April 2022",
    ),
    Third(
        number = "03",
        jobPosition = "Junior Developer",
        description = LOREM_IPSUM,
        company = "Corwin Minds",
        from = "May 2019",
        to = "August 2020",
    )
}