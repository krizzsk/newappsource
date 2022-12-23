package com.moovit.map;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import ce0.C21100e;
import com.moovit.map.MapFragment;
import java.util.ArrayList;
import p451du.C16714k;

/* renamed from: com.moovit.map.g */
public final class C16277g {

    /* renamed from: a */
    public final float f42534a;

    /* renamed from: b */
    public final C16278a f42535b;

    /* renamed from: c */
    public final C16714k f42536c;

    /* renamed from: d */
    public final MapFragment f42537d;

    /* renamed from: e */
    public final View f42538e;

    /* renamed from: f */
    public MapFragment.MapFollowMode f42539f;

    /* renamed from: g */
    public final ArrayList f42540g;

    /* renamed from: com.moovit.map.g$a */
    public class C16278a extends MapFragment.C16236q {
        public C16278a() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:17:0x0057  */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo48515c(int r8) {
            /*
                r7 = this;
                com.moovit.map.g r0 = com.moovit.map.C16277g.this
                com.moovit.map.MapFragment$MapFollowMode r0 = r0.f42539f
                boolean r0 = r0.isFollowLocation()
                if (r0 == 0) goto L_0x000b
                return
            L_0x000b:
                boolean r8 = com.moovit.map.MapFragment.C16236q.m41430b(r8)
                if (r8 != 0) goto L_0x005c
                com.moovit.map.g r0 = com.moovit.map.C16277g.this
                android.view.View r1 = r0.f42538e
                com.moovit.map.MapFragment r2 = r0.f42537d
                com.moovit.commons.geo.LatLonE6 r2 = r2.mo48615L2()
                com.moovit.map.MapFragment r3 = r0.f42537d
                com.moovit.commons.geo.LatLonE6 r3 = r3.mo48620Q2()
                r4 = 0
                if (r3 == 0) goto L_0x0032
                r2.getClass()
                float r3 = com.moovit.commons.geo.LatLonE6.m40174c(r2, r3)
                float r5 = r0.f42534a
                int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r3 >= 0) goto L_0x0032
                goto L_0x0051
            L_0x0032:
                java.util.ArrayList r3 = r0.f42540g
                java.util.Iterator r3 = r3.iterator()
            L_0x0038:
                boolean r5 = r3.hasNext()
                if (r5 == 0) goto L_0x0053
                java.lang.Object r5 = r3.next()
                qz.b r5 = (p762qz.C19206b) r5
                r2.getClass()
                float r5 = com.moovit.commons.geo.LatLonE6.m40174c(r2, r5)
                float r6 = r0.f42534a
                int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
                if (r5 >= 0) goto L_0x0038
            L_0x0051:
                r0 = 0
                goto L_0x0054
            L_0x0053:
                r0 = 1
            L_0x0054:
                if (r0 == 0) goto L_0x0057
                goto L_0x0059
            L_0x0057:
                r4 = 8
            L_0x0059:
                r1.setVisibility(r4)
            L_0x005c:
                com.moovit.map.g r0 = com.moovit.map.C16277g.this
                android.view.View r0 = r0.f42538e
                int r0 = r0.getVisibility()
                if (r0 != 0) goto L_0x0074
                com.moovit.map.g r0 = com.moovit.map.C16277g.this
                android.view.View r0 = r0.f42538e
                if (r8 == 0) goto L_0x006f
                r8 = 1056964608(0x3f000000, float:0.5)
                goto L_0x0071
            L_0x006f:
                r8 = 1065353216(0x3f800000, float:1.0)
            L_0x0071:
                r0.setAlpha(r8)
            L_0x0074:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moovit.map.C16277g.C16278a.mo48515c(int):void");
        }
    }

    public C16277g(Context context, MapFragment mapFragment, int i) {
        this(context, mapFragment, i, 100.0f);
    }

    /* renamed from: a */
    public final void mo48762a() {
        if (this.f42538e.getParent() == null) {
            this.f42537d.f42386w.addView(this.f42538e);
        }
        this.f42537d.mo48654s2(this.f42535b);
        MapFragment mapFragment = this.f42537d;
        mapFragment.f42350I.add(this.f42536c);
        MapFragment.MapFollowMode mapFollowMode = this.f42537d.f42356O;
        this.f42539f = mapFollowMode;
        if (mapFollowMode != null && mapFollowMode.isFollowLocation()) {
            this.f42538e.setVisibility(8);
        }
    }

    /* renamed from: b */
    public final void mo48763b(boolean z) {
        if (z) {
            this.f42537d.f42386w.removeView(this.f42538e);
        }
        this.f42537d.mo48635f3(this.f42535b);
        MapFragment mapFragment = this.f42537d;
        mapFragment.f42350I.remove(this.f42536c);
    }

    public C16277g(Context context, MapFragment mapFragment, int i, float f) {
        this.f42535b = new C16278a();
        this.f42536c = new C16714k(this, 1);
        this.f42540g = new ArrayList();
        C21100e.m49373x(mapFragment, "mapFragment");
        this.f42537d = mapFragment;
        this.f42534a = f;
        View inflate = LayoutInflater.from(context).inflate(i, mapFragment.f42386w, false);
        this.f42538e = inflate;
        inflate.setVisibility(8);
    }
}
