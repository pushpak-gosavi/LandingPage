package com.pushpak_gosavi.pushpak.models

import com.pushpak_gosavi.pushpak.utils.Res

enum class Portfolio(
    val image: String,
    val title: String,
    val description: String,
    val apkLink: String
) {
    FamilyContact(
        image = Res.Image.portfolio_family_contact,
        title = "Family Contact",
        description = "Family Contact Android Application",
        apkLink = "https://play.google.com/store/apps/details?id=com.contact.mycontact&hl=es_419&gl=US"
    ),
    RavishingRecipes(
        image = Res.Image.portfolio_ravishing_recipes,
        title = "Ravishing Recipes",
        description = "Ravishing Recipes Android Application",
        apkLink = "https://play.google.com/store/apps/details?id=com.foody.foodyapplication&hl=es_419&gl=US"
    ),
    BMI(
        image = Res.Image.portfolio_bmi_cal,
        title = "BMI",
        description = "Body Mass Index Calculator Flutter Application",
        apkLink = "https://play.google.com/store/apps/details?id=com.bmi.bmicalulator&hl=es_419&gl=US"
    ),
    TODO(
        image = Res.Image.portfolio_todo,
        title = "To DO",
        description = "To Do List Android Application",
        apkLink = "https://play.google.com/store/apps/details?id=com.jetpack.to_docompose&hl=es_419&gl=US"
    )
}