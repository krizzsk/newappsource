package com.google.android.gms.internal.p986firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzk */
final class zzk extends zzj {
    public zzk(char c) {
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("CharMatcher.is('");
        char[] cArr = {'\\', 'u', 0, 0, 0, 0};
        int i = 46;
        for (int i2 = 0; i2 < 4; i2++) {
            cArr[5 - i2] = "0123456789ABCDEF".charAt(i & 15);
            i >>= 4;
        }
        k.append(String.copyValueOf(cArr));
        k.append("')");
        return k.toString();
    }
}
