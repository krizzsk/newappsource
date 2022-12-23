package com.cubic.umo.pass.prefs;

import android.content.SharedPreferences;
import kotlin.Metadata;
import kotlin.UninitializedPropertyAccessException;
import kotlin.jvm.internal.Lambda;
import lf0.C24225a;
import mf0.C24362h;
import p008a7.C0088a;

@Metadata(mo59059d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, mo59060d2 = {"<anonymous>", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "invoke"}, mo59061k = 3, mo59062mv = {1, 6, 0}, mo59064xi = 48)
public final class Cache$prefs$2 extends Lambda implements C24225a<SharedPreferences> {

    /* renamed from: f */
    public static final Cache$prefs$2 f8331f = new Cache$prefs$2();

    public Cache$prefs$2() {
        super(0);
    }

    public final Object invoke() {
        boolean z;
        C0088a aVar = C0088a.f265d;
        if (aVar != null) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            throw new UninitializedPropertyAccessException();
        } else if (aVar != null) {
            return aVar.f266a.getSharedPreferences("cache", 0);
        } else {
            C24362h.m61217l("instance");
            throw null;
        }
    }
}
