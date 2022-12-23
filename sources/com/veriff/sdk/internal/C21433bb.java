package com.veriff.sdk.internal;

/* renamed from: com.veriff.sdk.internal.bb */
final class C21433bb {
    /* renamed from: a */
    public static String m51081a(int i, int[] iArr, String[] strArr, int[] iArr2) {
        StringBuilder q = C25541a.m63886q('$');
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = iArr[i2];
            if (i3 == 1 || i3 == 2) {
                q.append('[');
                q.append(iArr2[i2]);
                q.append(']');
            } else if (i3 == 3 || i3 == 4 || i3 == 5) {
                q.append('.');
                String str = strArr[i2];
                if (str != null) {
                    q.append(str);
                }
            }
        }
        return q.toString();
    }
}
