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
package com.example.laba

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import com.example.laba.data.model.Kitten
import com.example.laba.ui.theme.MyTheme

class ProfileActivity : AppCompatActivity() {

    private val kitten: Kitten by lazy {
        intent?.getSerializableExtra(KITTEN_ID) as Kitten
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyTheme {
                ProfileScreen(kitten)
            }
        }
    }

    companion object {
        private const val KITTEN_ID = "kitten_id"
        fun newIntent(context: Context, kitten: Kitten) =
            Intent(context, ProfileActivity::class.java).apply {
                putExtra(KITTEN_ID, kitten)
            }
    }
}
