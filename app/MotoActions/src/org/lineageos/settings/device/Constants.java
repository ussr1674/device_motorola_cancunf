/*
 * Copyright (C) 2015 The CyanogenMod Project
 * Copyright (C) 2017 The LineageOS Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.lineageos.settings.device;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.UserHandle;
import android.provider.Settings;

import android.media.AudioManager;

public class Constants {

    // Broadcast action for settings update
    public static final String UPDATE_PREFS_ACTION = "org.lineageos.settings.device.UPDATE_SETTINGS";

    // Shared preferences
    private static final String DE_PREF_FILE_NAME = "device_settings";

    // Screen off Gesture actions
    public static final int ACTION_FLASHLIGHT = 1;
    public static final int ACTION_CAMERA = 2;
    public static final int ACTION_BROWSER = 3;
    public static final int ACTION_DIALER = 4;
    public static final int ACTION_EMAIL = 5;
    public static final int ACTION_MESSAGES = 6;
    public static final int ACTION_PLAY_PAUSE_MUSIC = 7;
    public static final int ACTION_PREVIOUS_TRACK = 8;
    public static final int ACTION_NEXT_TRACK = 9;
    public static final int ACTION_VOLUME_DOWN = 10;
    public static final int ACTION_VOLUME_UP = 11;
    public static final int ACTION_AMBIENT_DISPLAY = 12;
    public static final int ACTION_WAKE_DEVICE = 13;

    // Broadcast extra: keycode mapping (int[]: key = gesture ID, value = keycode)
    public static final String UPDATE_EXTRA_KEYCODE_MAPPING = "keycode_mappings";
    // Broadcast extra: assigned actions (int[]: key = gesture ID, value = action)
    public static final String UPDATE_EXTRA_ACTION_MAPPING = "action_mappings";

    public static SharedPreferences getDESharedPrefs(Context context) {
        return context.createDeviceProtectedStorageContext()
                .getSharedPreferences(DE_PREF_FILE_NAME, Context.MODE_PRIVATE);
    }
}
