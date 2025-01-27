/*
 * Copyright (c) 2022-present StellarSand
 *
 *  This file is part of IYPS.
 *
 *  IYPS is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  IYPS is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with IYPS.  If not, see <https://www.gnu.org/licenses/>.
 */

package com.iyps.preferences

import android.content.Context

class PreferenceManager(context: Context) {

    companion object {
        // Shared pref keys
        const val THEME_PREF = "theme"
        const val BLOCK_SS = "block_ss"
        const val INCOG_KEYBOARD = "incog_keyboard"
        const val PASS_LENGTH = "pass_length"
        const val UPPERCASE = "uppercase"
        const val LOWERCASE = "lowercase"
        const val NUMBERS = "numbers"
        const val SPEC_CHARS = "spec_chars"
        const val AMB_CHARS = "amb_chars"
        const val SPACES = "spaces"
    }
    
    private val sharedPreferences =
        context.getSharedPreferences("com.iyps_preferences", Context.MODE_PRIVATE)

    fun getInt(key: String): Int {
        return sharedPreferences.getInt(key, 0)
    }

    fun setInt(key: String, integer: Int) {
        val editor = sharedPreferences.edit()
        editor.putInt(key, integer)
        editor.apply()
    }
    
    fun getFloat(key: String): Float {
        return sharedPreferences.getFloat(key, 20f)
    }
    
    fun setFloat(key: String, float: Float) {
        val editor = sharedPreferences.edit()
        editor.putFloat(key, float)
        editor.apply()
    }
    
    fun getBoolean(key: String): Boolean {
        return sharedPreferences.getBoolean(key, true)
    }
    
    fun getBooleanDefValFalse(key: String): Boolean {
        return sharedPreferences.getBoolean(key, false)
    }
    
    fun setBoolean(key: String, boolean: Boolean) {
        val editor = sharedPreferences.edit()
        editor.putBoolean(key, boolean)
        editor.apply()
    }

}