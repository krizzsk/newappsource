package com.fyber.inneractive.sdk.config;

import android.app.Application;
import android.content.SharedPreferences;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.util.C3707l;
import com.fyber.inneractive.sdk.util.IAlog;

/* renamed from: com.fyber.inneractive.sdk.config.d */
public class C2627d {

    /* renamed from: a */
    public Boolean f9271a = null;

    /* renamed from: b */
    public String f9272b = null;

    /* renamed from: c */
    public InneractiveAdManager.GdprConsentSource f9273c = null;

    /* renamed from: d */
    public String f9274d = null;

    /* renamed from: e */
    public String f9275e = null;

    /* renamed from: f */
    public Boolean f9276f = null;

    /* renamed from: g */
    public SharedPreferences f9277g;

    /* renamed from: a */
    public Boolean mo13205a() {
        if (C3707l.f12893a == null) {
            return null;
        }
        return this.f9271a;
    }

    /* renamed from: b */
    public void mo13208b() {
        Application application = C3707l.f12893a;
        if (this.f9277g == null && application != null) {
            SharedPreferences sharedPreferences = application.getSharedPreferences("IAConfigurationPreferences", 0);
            this.f9277g = sharedPreferences;
            if (sharedPreferences != null) {
                if (sharedPreferences.contains("IAGDPRBool")) {
                    this.f9271a = Boolean.valueOf(sharedPreferences.getBoolean("IAGDPRBool", false));
                }
                if (sharedPreferences.contains("IAGdprConsentData")) {
                    this.f9272b = sharedPreferences.getString("IAGdprConsentData", (String) null);
                }
                if (sharedPreferences.contains("IACCPAConsentData")) {
                    this.f9275e = sharedPreferences.getString("IACCPAConsentData", (String) null);
                }
                if (sharedPreferences.contains("IAGdprSource")) {
                    try {
                        this.f9273c = InneractiveAdManager.GdprConsentSource.valueOf(sharedPreferences.getString("IAGdprSource", InneractiveAdManager.GdprConsentSource.Internal.toString()));
                    } catch (Exception unused) {
                        this.f9273c = InneractiveAdManager.GdprConsentSource.Internal;
                    }
                }
                if (sharedPreferences.contains("IALgpdConsentStatus")) {
                    this.f9276f = Boolean.valueOf(sharedPreferences.getBoolean("IALgpdConsentStatus", false));
                }
                if (sharedPreferences.contains("keyUserID")) {
                    this.f9274d = sharedPreferences.getString("keyUserID", (String) null);
                }
            }
        }
    }

    /* renamed from: a */
    public final boolean mo13207a(String str, boolean z) {
        if (C3707l.f12893a == null) {
            return false;
        }
        mo13208b();
        SharedPreferences sharedPreferences = this.f9277g;
        if (sharedPreferences == null) {
            return false;
        }
        sharedPreferences.edit().putBoolean(str, z).apply();
        return true;
    }

    /* renamed from: a */
    public final boolean mo13206a(String str, String str2) {
        if (C3707l.f12893a == null) {
            return false;
        }
        mo13208b();
        if (this.f9277g == null) {
            return false;
        }
        IAlog.m9902a("Saving %s value = %s to sharedPrefs", str, str2);
        this.f9277g.edit().putString(str, str2).apply();
        return true;
    }
}
