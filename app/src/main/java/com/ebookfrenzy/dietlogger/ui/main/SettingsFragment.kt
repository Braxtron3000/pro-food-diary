package com.ebookfrenzy.dietlogger.ui.main

import android.os.Bundle
import androidx.preference.PreferenceFragmentCompat
import com.ebookfrenzy.dietlogger.R

class SettingsFragment : PreferenceFragmentCompat() {

    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        setPreferencesFromResource(R.xml.root_preferences, rootKey)
    }
}