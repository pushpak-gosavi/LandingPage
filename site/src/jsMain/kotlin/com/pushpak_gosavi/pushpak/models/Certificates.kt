package com.pushpak_gosavi.pushpak.models

import com.pushpak_gosavi.pushpak.utils.Res

enum class Certificates(
    val imagePath: String,
    val title: String
) {

    KotlinFundamental(
        imagePath = Res.Image.kotlin_fundamental,
        title = "Kotlin Fundamentals"
    ),
    GoogleCloud(
        imagePath = Res.Image.gcp,
        title = "Google Cloud Certificate"
    ),
    GenerativeAI(
        imagePath = Res.Image.generative_ai,
        title = "Generative AI - Google"
    ),
    Azure(
        imagePath = Res.Image.azure,
        title = "Azure Cloud Certificate"
    ),
    KobWebUdemy(
        imagePath = Res.Image.website_certificate,
        title = "KobWeb Certificate"
    ),
    ToDo(
        imagePath = Res.Image.to_do,
        title = "TO Do Application"
    ),
    ModernFood(
        imagePath = Res.Image.modern_food,
        title = "Android Udemy"
    ),
    FireBase(
        imagePath=Res.Image.firebase,
        title = "Firebase From Udemy"
    )
}