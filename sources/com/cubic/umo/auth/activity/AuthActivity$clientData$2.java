package com.cubic.umo.auth.activity;

import kotlin.Metadata;
import kotlin.UninitializedPropertyAccessException;
import kotlin.jvm.internal.Lambda;
import lf0.C24225a;
import mf0.C24362h;
import p008a7.C0088a;
import p196o7.C6009a;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo59060d2 = {"Lo7/a;", "invoke", "()Lo7/a;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 6, 0})
public final class AuthActivity$clientData$2 extends Lambda implements C24225a<C6009a> {

    /* renamed from: f */
    public static final AuthActivity$clientData$2 f7735f = new AuthActivity$clientData$2();

    public AuthActivity$clientData$2() {
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
            return aVar.f268c;
        } else {
            C24362h.m61217l("instance");
            throw null;
        }
    }
}
