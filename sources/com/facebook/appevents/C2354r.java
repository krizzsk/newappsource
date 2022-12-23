package com.facebook.appevents;

import android.content.SharedPreferences;
import java.util.HashSet;
import mf0.C24362h;
import p184n8.C5876g;
import p262t8.C6606a;

/* renamed from: com.facebook.appevents.r */
public final /* synthetic */ class C2354r implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f8573b;

    /* renamed from: c */
    public final /* synthetic */ String f8574c;

    /* renamed from: d */
    public final /* synthetic */ String f8575d;

    public /* synthetic */ C2354r(String str, String str2, int i) {
        this.f8573b = i;
        this.f8574c = str;
        this.f8575d = str2;
    }

    public final void run() {
        switch (this.f8573b) {
            case 0:
                String str = this.f8574c;
                String str2 = this.f8575d;
                Class<C2355s> cls = C2355s.class;
                if (!C6606a.m15601b(cls)) {
                    try {
                        C24362h.m61211f(str, "$key");
                        C24362h.m61211f(str2, "$value");
                        if (!C2355s.f8578c.get()) {
                            C2355s.f8576a.mo12517b();
                        }
                        SharedPreferences sharedPreferences = C2355s.f8577b;
                        if (sharedPreferences != null) {
                            sharedPreferences.edit().putString(str, str2).apply();
                            return;
                        } else {
                            C24362h.m61217l("sharedPreferences");
                            throw null;
                        }
                    } catch (Throwable th) {
                        C6606a.m15600a(cls, th);
                        return;
                    }
                } else {
                    return;
                }
            default:
                String str3 = this.f8574c;
                String str4 = this.f8575d;
                C24362h.m61211f(str3, "$queriedEvent");
                C24362h.m61211f(str4, "$buttonText");
                HashSet hashSet = C5876g.f18881f;
                C5876g.C5877a.m14332c(str3, str4, new float[0]);
                return;
        }
    }
}
