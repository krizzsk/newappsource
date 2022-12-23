package com.facebook.appevents;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.util.Patterns;
import com.facebook.internal.C2397f0;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.text.Regex;
import mf0.C24362h;
import p009a8.C0115o;
import p040c8.C1804c;
import p262t8.C6606a;
import p988j$.util.concurrent.ConcurrentHashMap;

/* renamed from: com.facebook.appevents.s */
public final class C2355s {

    /* renamed from: a */
    public static final C2355s f8576a = new C2355s();

    /* renamed from: b */
    public static SharedPreferences f8577b;

    /* renamed from: c */
    public static final AtomicBoolean f8578c = new AtomicBoolean(false);

    /* renamed from: d */
    public static final ConcurrentHashMap<String, String> f8579d = new ConcurrentHashMap<>();

    /* renamed from: e */
    public static final ConcurrentHashMap<String, String> f8580e = new ConcurrentHashMap<>();

    /* renamed from: a */
    public final HashMap mo12516a() {
        if (C6606a.m15601b(this)) {
            return null;
        }
        try {
            HashMap hashMap = new HashMap();
            CopyOnWriteArraySet copyOnWriteArraySet = C1804c.f6294d;
            HashSet hashSet = new HashSet();
            Iterator it = C1804c.m5115a().iterator();
            while (it.hasNext()) {
                hashSet.add(((C1804c) it.next()).mo6618b());
            }
            for (String next : f8580e.keySet()) {
                if (hashSet.contains(next)) {
                    hashMap.put(next, f8580e.get(next));
                }
            }
            return hashMap;
        } catch (Throwable th) {
            C6606a.m15600a(this, th);
            return null;
        }
    }

    /* renamed from: b */
    public final synchronized void mo12517b() {
        if (!C6606a.m15601b(this)) {
            try {
                AtomicBoolean atomicBoolean = f8578c;
                if (!atomicBoolean.get()) {
                    SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(C0115o.m210a());
                    C24362h.m61210e(defaultSharedPreferences, "getDefaultSharedPreferences(FacebookSdk.getApplicationContext())");
                    f8577b = defaultSharedPreferences;
                    String string = defaultSharedPreferences.getString("com.facebook.appevents.UserDataStore.userData", "");
                    if (string == null) {
                        string = "";
                    }
                    SharedPreferences sharedPreferences = f8577b;
                    if (sharedPreferences != null) {
                        String string2 = sharedPreferences.getString("com.facebook.appevents.UserDataStore.internalUserData", "");
                        if (string2 == null) {
                            string2 = "";
                        }
                        f8579d.putAll(C2397f0.m6295D(string));
                        f8580e.putAll(C2397f0.m6295D(string2));
                        atomicBoolean.set(true);
                        return;
                    }
                    C24362h.m61217l("sharedPreferences");
                    throw null;
                }
            } catch (Throwable th) {
                C6606a.m15600a(this, th);
            }
        }
    }

    /* renamed from: c */
    public final String mo12518c(String str, String str2) {
        boolean z;
        String str3;
        int i;
        boolean z2;
        if (C6606a.m15601b(this)) {
            return null;
        }
        try {
            int length = str2.length() - 1;
            int i2 = 0;
            boolean z3 = false;
            while (true) {
                if (i2 > length) {
                    break;
                }
                if (!z3) {
                    i = i2;
                } else {
                    i = length;
                }
                if (C24362h.m61213h(str2.charAt(i), 32) <= 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z3) {
                    if (!z2) {
                        z3 = true;
                    } else {
                        i2++;
                    }
                } else if (!z2) {
                    break;
                } else {
                    length--;
                }
            }
            String obj = str2.subSequence(i2, length + 1).toString();
            if (obj != null) {
                String lowerCase = obj.toLowerCase();
                C24362h.m61210e(lowerCase, "(this as java.lang.String).toLowerCase()");
                if (C24362h.m61206a("em", str)) {
                    if (Patterns.EMAIL_ADDRESS.matcher(lowerCase).matches()) {
                        return lowerCase;
                    }
                    return "";
                } else if (C24362h.m61206a("ph", str)) {
                    return new Regex("[^0-9]").mo60284c(lowerCase, "");
                } else {
                    if (!C24362h.m61206a("ge", str)) {
                        return lowerCase;
                    }
                    if (lowerCase.length() > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        str3 = lowerCase.substring(0, 1);
                        C24362h.m61210e(str3, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    } else {
                        str3 = "";
                    }
                    if (C24362h.m61206a(InneractiveMediationDefs.GENDER_FEMALE, str3) || C24362h.m61206a(InneractiveMediationDefs.GENDER_MALE, str3)) {
                        return str3;
                    }
                    return "";
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
        } catch (Throwable th) {
            C6606a.m15600a(this, th);
            return null;
        }
    }
}
