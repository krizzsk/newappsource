package com.fyber.inneractive.sdk.player.exoplayer2.util;

import java.util.ArrayList;
import java.util.Comparator;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.util.p */
public class C3398p {

    /* renamed from: h */
    public static final Comparator<C3401c> f12129h = new C3399a();

    /* renamed from: i */
    public static final Comparator<C3401c> f12130i = new C3400b();

    /* renamed from: a */
    public final int f12131a;

    /* renamed from: b */
    public final ArrayList<C3401c> f12132b = new ArrayList<>();

    /* renamed from: c */
    public final C3401c[] f12133c = new C3401c[5];

    /* renamed from: d */
    public int f12134d = -1;

    /* renamed from: e */
    public int f12135e;

    /* renamed from: f */
    public int f12136f;

    /* renamed from: g */
    public int f12137g;

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.util.p$a */
    public class C3399a implements Comparator<C3401c> {
        public int compare(Object obj, Object obj2) {
            return ((C3401c) obj).f12138a - ((C3401c) obj2).f12138a;
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.util.p$b */
    public class C3400b implements Comparator<C3401c> {
        public int compare(Object obj, Object obj2) {
            float f = ((C3401c) obj).f12140c;
            float f2 = ((C3401c) obj2).f12140c;
            if (f < f2) {
                return -1;
            }
            if (f2 < f) {
                return 1;
            }
            return 0;
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.util.p$c */
    public static class C3401c {

        /* renamed from: a */
        public int f12138a;

        /* renamed from: b */
        public int f12139b;

        /* renamed from: c */
        public float f12140c;
    }

    public C3398p(int i) {
        this.f12131a = i;
    }
}
