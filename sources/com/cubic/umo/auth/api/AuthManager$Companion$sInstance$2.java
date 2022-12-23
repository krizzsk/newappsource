package com.cubic.umo.auth.api;

import kotlin.Metadata;
import kotlin.UninitializedPropertyAccessException;
import kotlin.jvm.internal.Lambda;
import lf0.C24225a;
import mf0.C24362h;
import p008a7.C0088a;

@Metadata(mo59059d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo59060d2 = {"<anonymous>", "Lcom/cubic/umo/auth/api/AuthManager;", "invoke"}, mo59061k = 3, mo59062mv = {1, 6, 0}, mo59064xi = 48)
public final class AuthManager$Companion$sInstance$2 extends Lambda implements C24225a<AuthManager> {

    /* renamed from: f */
    public static final AuthManager$Companion$sInstance$2 f7750f = new AuthManager$Companion$sInstance$2();

    public AuthManager$Companion$sInstance$2() {
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
            return new AuthManager(aVar.f268c, aVar.f267b);
        } else {
            C24362h.m61217l("instance");
            throw null;
        }
    }
}
