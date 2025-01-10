package com.pushpak_gosavi.pushpak.models

import com.pushpak_gosavi.pushpak.utils.Constants.CORWIN_MINDS
import com.pushpak_gosavi.pushpak.utils.Constants.CORWIN_MINDS_WEBSITE
import com.pushpak_gosavi.pushpak.utils.Constants.EVONIX_TECHNOLOGY
import com.pushpak_gosavi.pushpak.utils.Constants.EVONIX_WEBSITE
import com.pushpak_gosavi.pushpak.utils.Constants.NCSI
import com.pushpak_gosavi.pushpak.utils.Constants.NCSI_WEBSITE
import com.pushpak_gosavi.pushpak.utils.Constants.SYNECHRON
import com.pushpak_gosavi.pushpak.utils.Constants.SYNECHRON_WEBSITE

enum class Experience(
    val number: String,
    val jobPosition: String,
    val description: String,
    val company: String,
    val companyWebsite:String,
    val from: String,
    val to: String
) {
    First(
        number = "01",
        jobPosition = "Senior Associate Technology",
        description = SYNECHRON,
        company = "Synechron",
        companyWebsite = SYNECHRON_WEBSITE,
        from = "June 2024",
        to = "Jan 2025",
    ),
    Second(
        number = "02",
        jobPosition = "Associate Engineer (Mobile)",
        description = NCSI,
        company = "NCSI Technologies Pvt. Ltd.",
        companyWebsite = NCSI_WEBSITE,
        from = "April 2022",
        to = "Jan 2024",
    ),
    Third(
        number = "03",
        jobPosition = "Android Developer",
        description = EVONIX_TECHNOLOGY,
        company = "Evonix Technology",
        companyWebsite = EVONIX_WEBSITE,
        from = "February 2021",
        to = "April 2022",
    ),
    Fourth(
        number = "04",
        jobPosition = "Junior Android Developer",
        description = CORWIN_MINDS,
        company = "Corwin Minds",
        companyWebsite = CORWIN_MINDS_WEBSITE,
        from = "May 2019",
        to = "August 2020",
    )
}