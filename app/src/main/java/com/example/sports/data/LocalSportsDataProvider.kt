/*
 * Copyright (C) 2023 The Android Open Source Project
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

package com.example.sports.data

import com.example.sports.R
import com.example.sports.model.Place

/**
 * Sports data
 */
object LocalSportsDataProvider{
    val defaultSport = getSportsData()[0]

    fun getSportsData(): List<Place> {
        return listOf(
            Place(
                id = 1,
                titleResourceId = R.string.kawahputih,
                subtitleResourceId = R.string.sub_kawahputih,
                locationId = R.string.loc_kawahputih,
                free = false,
                imageResourceId = R.drawable.kawahputih,
                sportDetails = R.string.desc_kawahputih
            ),
            Place(
                id = 2,
                titleResourceId = R.string.alun_alun,
                subtitleResourceId = R.string.sub_alun,
                locationId = R.string.loc_alun,
                free = true,
                imageResourceId = R.drawable.alunalun,
                sportDetails = R.string.desc_alun
            ),
            Place(
                id = 3,
                titleResourceId = R.string.farmhouse,
                subtitleResourceId = R.string.sub_farmhoyse,
                locationId = R.string.loc_farmhoyse,
                free = false,
                imageResourceId = R.drawable.farmhouse,
                sportDetails = R.string.desc_farmhoyse
            ),
            Place(
                id = 4,
                titleResourceId = R.string.bukitmoko,
                subtitleResourceId = R.string.sub_bukit,
                locationId = R.string.loc_bukit,
                free = true,
                imageResourceId = R.drawable.bukit_moko,
                sportDetails = R.string.desc_lorem
            ),
            Place(
                id = 5,
                titleResourceId = R.string.dusunbambu,
                subtitleResourceId = R.string.sub_dusun,
                locationId = R.string.loc_dusun,
                free = false,
                imageResourceId = R.drawable.dusun_bambu,
                sportDetails = R.string.desc_lorem
            ),
            Place(
                id = 6,
                titleResourceId = R.string.rancaupas,
                subtitleResourceId = R.string.sub_rancaupas,
                locationId = R.string.loc_rancaupas,
                free = false,
                imageResourceId = R.drawable.rancaupas,
                sportDetails = R.string.desc_lorem
            ),
            Place(
                id = 7,
                titleResourceId = R.string.curug,
                subtitleResourceId = R.string.sub_curug,
                locationId = R.string.loc_curug,
                free = true,
                imageResourceId = R.drawable.curug,
                sportDetails = R.string.desc_lorem
            ),
            Place(
                id = 8,
                titleResourceId = R.string.tamanfilm,
                subtitleResourceId = R.string.sub_taman,
                locationId = R.string.loc_taman,
                free = true,
                imageResourceId = R.drawable.tamanfilm,
                sportDetails = R.string.desc_lorem
            )
        )
    }
}
