package com.usebutton.sdk.internal.secure;

import android.content.Context;
import android.content.SharedPreferences;

class SecureSharedPrefs {
    private static final String PREFS_NAME = "btn_secure_prefs";
    private final SharedPreferences preferences;

    public SecureSharedPrefs(Context context) {
        this.preferences = context.getSharedPreferences(PREFS_NAME, 0);
    }

    public void clear() {
        this.preferences.edit().clear().apply();
    }

    public void deleteString(String str) {
        this.preferences.edit().remove(str).apply();
    }

    public String getString(String str) {
        return this.preferences.getString(str, (String) null);
    }

    public boolean hasString(String str) {
        return this.preferences.contains(str);
    }

    public void saveString(String str, String str2) {
        this.preferences.edit().putString(str, str2).apply();
    }
}
