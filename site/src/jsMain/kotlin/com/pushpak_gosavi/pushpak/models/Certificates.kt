package com.pushpak_gosavi.pushpak.models

import com.pushpak_gosavi.pushpak.utils.Res

enum class Certificates(
    val imagePath: String,
    val title: String
) {
    SIX_SKILL(
        imagePath = Res.Image.six_skill_certificate,
        title = "The Six Skills of Proactive Professionals"
    ),
    CiCd_Pipeline(
        imagePath = Res.Image.ci_cd_certificate,
        title = "CI CD Certificate"
    ),
    JetpackCompose(
        imagePath = Res.Image.jetpack_compose_certificate,
        title = "Jetpack Compose Crash Course"
    ),
    KMP_Certificate(
        imagePath = Res.Image.kmp_game_certificate,
        title = "Full Stack Game development using Kotlin and Compose Multiplatform"
    ),
    GoogleCloud(
        imagePath = Res.Image.gcp,
        title = "Google Cloud Certificate"
    ),
    GenerativeAI(
        imagePath = Res.Image.generative_ai,
        title = "Generative AI - Google"
    ),
    KotlinFundamental(
        imagePath = Res.Image.kotlin_fundamental,
        title = "Kotlin Fundamentals"
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
        imagePath = Res.Image.firebase,
        title = "Firebase From Udemy"
    )
}