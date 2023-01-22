/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.laba.data

import com.example.laba.R
import com.example.laba.data.model.Kitten

object DataProvider {

    val kittenList = listOf(
        kitten,
        Kitten(
            id = 1,
            title = "Марсик",
            sex = "Male",
            age = 6,
            description = "Марсик любить гратися з тапками.",
            kittenImageId = R.drawable.k1
        ),    
        Kitten(
            id = 2,
            title = "Кузя",
            sex = "Female",
            age = 4,
            description = "Кузя спить на шафі.",
            kittenImageId = R.drawable.k2
        ),
        Kitten(
            id = 3,
            title = "Пушок",
            sex = "Male",
            age = 3,
            description = "Пушок любить молоко.",
            kittenImageId = R.drawable.k3
        ),
        Kitten(
            id = 4,
            title = "Мотя",
            sex = "Male",
            age = 3,
            description = "Мотя розмотує клубки з нитками.",
            kittenImageId = R.drawable.k4
        ),
        Kitten(
            id = 5,
            title = "Мурзик",
            sex = "Male",
            age = 7,
            description = "Мурзик мурчить як трактор.",
            kittenImageId = R.drawable.k5
        ),
        Kitten(
            id = 6,
            title = "Батон",
            sex = "Male",
            age = 8,
            description = "Батон страшний ненажера.",
            kittenImageId = R.drawable.k6
        ),
        Kitten(
            id = 7,
            title = "Мурка",
            sex = "Female",
            age = 3,
            description = "Мурка любить пеститись.",
            kittenImageId = R.drawable.k7
        ),
        Kitten(
            id = 8,
            title = "Сніжок",
            sex = "Male",
            age = 4,
            description = "Сніжок білий як сніг.",
            kittenImageId = R.drawable.k8
        ),
        Kitten(
            id = 9,
            title = "Маркіз",
            sex = "Male",
            age = 4,
            description = "Маркіз дуже лінивий.",
            kittenImageId = R.drawable.k9
        ),
        Kitten(
            id = 10,
            title = "Буся",
            sex = "Female",
            age = 4,
            description = "Буся любить вмиватися.",
            kittenImageId = R.drawable.k10
        ),
        Kitten(
            id = 11,
            title = "Барон",
            sex = "Male",
            age = 3,
            description = "Барон любить печиво.",
            kittenImageId = R.drawable.k11
        ),
        Kitten(
            id = 12,
            title = "Барсик",
            sex = "Male",
            age = 4,
            description = "Барсик ловить мишей.",
            kittenImageId = R.drawable.k12
        ),
    )
}
