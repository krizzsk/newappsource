package com.fyber.inneractive.sdk.mraid;

/* renamed from: com.fyber.inneractive.sdk.mraid.t */
public abstract class C2879t {
    /* renamed from: a */
    public abstract String mo13660a();

    public String toString() {
        String a = mo13660a();
        if (a != null) {
            return a.replaceAll("[^a-zA-Z0-9_,:\\s\\{\\}\\'\\\"]", "");
        }
        return "";
    }
}
