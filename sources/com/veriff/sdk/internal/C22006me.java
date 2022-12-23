package com.veriff.sdk.internal;

import android.app.Activity;
import android.content.Intent;
import com.veriff.sdk.views.sessionstart.SessionStartActivity;
import java.util.UUID;
import mobi.lab.veriff.data.C24426d;
import mobi.lab.veriff.util.C24450d;
import p358af.C13437d;

/* renamed from: com.veriff.sdk.internal.me */
public class C22006me {
    /* renamed from: a */
    public static Intent m53661a(Activity activity, C24426d dVar) {
        return SessionStartActivity.m56812a(activity, C24426d.m61425a(dVar, m53662a(dVar.mo60597b())));
    }

    /* renamed from: b */
    public static void m53663b(Activity activity, C24426d dVar) {
        SessionStartActivity.m56814b(activity, new C24426d(UUID.randomUUID().toString(), dVar.mo60597b(), dVar.mo60598c(), dVar.mo60599d(), dVar.mo60601e(), C24450d.m61495a(), dVar.mo60604g(), dVar.mo60605h(), dVar.mo60607i(), dVar.mo60608j()));
    }

    /* renamed from: a */
    public static String m53662a(String str) {
        C22738yl e = C22738yl.m55583e(str);
        if (e != null) {
            if (e.mo57298k().contains("v1")) {
                new IllegalArgumentException("Using incorrect Veriff baseUrl containing '/v1'. This may break in the future.");
            }
            return e.mo57304q().mo57317e("/").mo57318f((String) null).mo57315c().toString();
        }
        throw new IllegalArgumentException(C13437d.m33706k("Malformed URL '", str, "'"));
    }
}
