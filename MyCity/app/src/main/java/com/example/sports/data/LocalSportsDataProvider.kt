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
import com.example.sports.model.Sport

/**
 * Sports data
 */
object LocalSportsDataProvider{
    val defaultSport = getSportsData()[0]

    fun getSportsData(): List<Sport> {
        return listOf(
            Sport(
                id = 1,
                titleResourceId = R.string.ruta1,
                subtitleResourceId = R.string.ruta1sub,
                playerCount = 1,
                olympic = true,
                imageResourceId = R.drawable.ruta1,
                sportsImageBanner = R.drawable.ruta1,
                sportDetails = R.string.ruta1msg
            ),Sport(
                id = 2,
                titleResourceId = R.string.ruta2,
                subtitleResourceId = R.string.ruta2sub,
                playerCount = 1,
                olympic = true,
                imageResourceId = R.drawable.ruta2,
                sportsImageBanner = R.drawable.ruta2,
                sportDetails = R.string.ruta2msg
            ),Sport(
                id = 3,
                titleResourceId = R.string.ruta3,
                subtitleResourceId = R.string.ruta3sub,
                playerCount = 1,
                olympic = true,
                imageResourceId = R.drawable.ruta3,
                sportsImageBanner = R.drawable.ruta3,
                sportDetails = R.string.ruta3msg
            ),Sport(
                id = 4,
                titleResourceId = R.string.ruta4,
                subtitleResourceId = R.string.ruta4sub,
                playerCount = 1,
                olympic = true,
                imageResourceId = R.drawable.ruta4,
                sportsImageBanner = R.drawable.ruta4,
                sportDetails = R.string.ruta4msg
            ),Sport(
                id = 5,
                titleResourceId = R.string.ruta5,
                subtitleResourceId = R.string.ruta5sub,
                playerCount = 1,
                olympic = true,
                imageResourceId = R.drawable.ruta5,
                sportsImageBanner = R.drawable.ruta5,
                sportDetails = R.string.ruta5msg
            ),Sport(
                id = 6,
                titleResourceId = R.string.ruta6,
                subtitleResourceId = R.string.ruta6sub,
                playerCount = 1,
                olympic = true,
                imageResourceId = R.drawable.ruta6,
                sportsImageBanner = R.drawable.ruta6,
                sportDetails = R.string.ruta6msg
            ),Sport(
                id = 7,
                titleResourceId = R.string.ruta7,
                subtitleResourceId = R.string.ruta7sub,
                playerCount = 1,
                olympic = true,
                imageResourceId = R.drawable.ruta7,
                sportsImageBanner = R.drawable.ruta7,
                sportDetails = R.string.ruta7msg
            ),Sport(
                id = 8,
                titleResourceId = R.string.ruta8,
                subtitleResourceId = R.string.ruta8sub,
                playerCount = 1,
                olympic = true,
                imageResourceId = R.drawable.ruta8,
                sportsImageBanner = R.drawable.ruta8,
                sportDetails = R.string.ruta8msg
            ),Sport(
                id = 9,
                titleResourceId = R.string.ruta9,
                subtitleResourceId = R.string.ruta9sub,
                playerCount = 1,
                olympic = true,
                imageResourceId = R.drawable.ruta9,
                sportsImageBanner = R.drawable.ruta9,
                sportDetails = R.string.ruta9msg
            ),Sport(
                id = 10,
                titleResourceId = R.string.ruta10,
                subtitleResourceId = R.string.ruta10sub,
                playerCount = 1,
                olympic = true,
                imageResourceId = R.drawable.ruta10,
                sportsImageBanner = R.drawable.ruta10,
                sportDetails = R.string.ruta10msg
            )

        )
    }
}
