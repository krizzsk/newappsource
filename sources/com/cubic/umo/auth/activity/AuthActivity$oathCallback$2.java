package com.cubic.umo.auth.activity;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import lf0.C24225a;
import mf0.C24362h;
import p196o7.C6009a;

@Metadata(mo59059d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo59060d2 = {"<anonymous>", "", "invoke"}, mo59061k = 3, mo59062mv = {1, 6, 0}, mo59064xi = 48)
public final class AuthActivity$oathCallback$2 extends Lambda implements C24225a<String> {
    public final /* synthetic */ AuthActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AuthActivity$oathCallback$2(AuthActivity authActivity) {
        super(0);
        this.this$0 = authActivity;
    }

    public final Object invoke() {
        AuthActivity authActivity = this.this$0;
        int i = AuthActivity.f7728C;
        return C24362h.m61216k("://oauth2callback", ((C6009a) authActivity.f7729A.getValue()).f19205d);
    }
}
