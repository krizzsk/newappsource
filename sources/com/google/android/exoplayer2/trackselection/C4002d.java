package com.google.android.exoplayer2.trackselection;

import p252sb.C6504d;
import p252sb.C6505e;
import p277ub.C6792n;

/* renamed from: com.google.android.exoplayer2.trackselection.d */
public final class C4002d {
    /* renamed from: a */
    public static boolean m10699a(C6505e eVar) {
        for (int i = 0; i < eVar.f20294a; i++) {
            C6504d dVar = eVar.f20295b[i];
            if (dVar != null) {
                for (int i2 = 0; i2 < dVar.length(); i2++) {
                    if (C6792n.m15994g(dVar.mo22603b(i2).f13418m) == 2) {
                        return true;
                    }
                }
                continue;
            }
        }
        return false;
    }
}
