package com.facebook.login;

import com.usebutton.sdk.context.Identifiers;
import kotlin.Metadata;
import mf0.C24362h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0001\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005j\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, mo59060d2 = {"Lcom/facebook/login/LoginTargetApp;", "", "", "toString", "targetApp", "Ljava/lang/String;", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Companion", "a", "FACEBOOK", "INSTAGRAM", "facebook-core_release"}, mo59061k = 1, mo59062mv = {1, 5, 1})
public enum LoginTargetApp {
    FACEBOOK(Identifiers.IDENTIFIER_FACEBOOK),
    INSTAGRAM("instagram");
    
    public static final C2464a Companion = null;
    private final String targetApp;

    /* renamed from: com.facebook.login.LoginTargetApp$a */
    public static final class C2464a {
    }

    /* access modifiers changed from: public */
    static {
        Companion = new C2464a();
    }

    private LoginTargetApp(String str) {
        this.targetApp = str;
    }

    public static final LoginTargetApp fromString(String str) {
        Companion.getClass();
        LoginTargetApp[] values = values();
        int length = values.length;
        int i = 0;
        while (i < length) {
            LoginTargetApp loginTargetApp = values[i];
            i++;
            if (C24362h.m61206a(loginTargetApp.toString(), str)) {
                return loginTargetApp;
            }
        }
        return FACEBOOK;
    }

    public String toString() {
        return this.targetApp;
    }
}
