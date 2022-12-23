package s20;

import android.graphics.PointF;
import c00.C13720d;
import c00.C13722f;
import ce0.C21100e;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.Polyline;
import com.google.android.gms.maps.model.PolylineOptions;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.map.C16273d;
import com.moovit.map.LineStyle;
import java.util.List;
import o20.C18694a;
import o20.C18696b;
import o20.C18715u;
import s20.C19429s;

/* renamed from: s20.r */
public final class C19425r extends C19418m<C19425r, C19426a, LineStyle, C18715u, C19429s, C19429s.C19430a> {

    /* renamed from: d */
    public final C18696b<C18694a> f49428d;

    /* renamed from: s20.r$a */
    public interface C19426a {
        /* renamed from: a */
        void mo51841a(Object obj);

        void remove();
    }

    /* renamed from: s20.r$b */
    public static class C19427b implements C19426a {

        /* renamed from: d */
        public static final PointF f49429d = new PointF(0.5f, 0.5f);

        /* renamed from: a */
        public final List<Object> f49430a;

        /* renamed from: b */
        public final C18696b<C18694a> f49431b;

        /* renamed from: c */
        public Object f49432c;

        /* JADX WARNING: Code restructure failed: missing block: B:29:0x017c, code lost:
            if (r9 <= 1.0d) goto L_0x018d;
         */
        /* JADX WARNING: Removed duplicated region for block: B:38:0x01b1  */
        /* JADX WARNING: Removed duplicated region for block: B:45:0x018f A[EDGE_INSN: B:45:0x018f->B:37:0x018f ?: BREAK  , SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C19427b(o20.C18696b r42, o20.C18715u r43, com.moovit.map.LineStyle r44) {
            /*
                r41 = this;
                r0 = r41
                r1 = r42
                r2 = r43
                r3 = r44
                r41.<init>()
                r0.f49431b = r1
                android.graphics.Bitmap r4 = r3.f42331g
                if (r4 == 0) goto L_0x0205
                com.moovit.map.b r5 = new com.moovit.map.b
                v10.a r6 = new v10.a
                android.graphics.PointF r7 = f49429d
                r6.<init>(r4, r7)
                r5.<init>(r6)
                java.util.ArrayList r6 = new java.util.ArrayList
                r6.<init>()
                T r7 = r2.f47613b
                com.moovit.commons.geo.Polyline r7 = (com.moovit.commons.geo.Polyline) r7
                int r8 = r7.mo24338U0()
                r9 = 100
                o20.e<MEZS> r10 = r2.f47614c
                int r10 = r10.f47603b
                int r9 = java.lang.Math.max(r9, r10)
                o20.e<MEZS> r10 = r2.f47614c
                int r10 = r10.f47604c
                r11 = 2200(0x898, float:3.083E-42)
                int r10 = java.lang.Math.min(r11, r10)
            L_0x003e:
                if (r9 >= r10) goto L_0x0200
                r12 = 0
                com.moovit.commons.geo.LatLonE6 r13 = r7.mo24347y(r12)
                int r14 = r4.getWidth()
                float r14 = (float) r14
                float r15 = (float) r9
                r16 = 1120403456(0x42c80000, float:100.0)
                float r15 = r15 / r16
                float r13 = m46817b(r13, r14, r15)
                com.moovit.commons.geo.LatLonE6 r14 = r7.mo24347y(r12)
                int r12 = r4.getHeight()
                float r12 = (float) r12
                float r12 = m46817b(r14, r12, r15)
                r14 = 1065353216(0x3f800000, float:1.0)
                float r15 = r3.f42332h
                float r15 = r15 + r14
                float r15 = r15 * r13
                int r14 = r9 + 50
                if (r14 != r11) goto L_0x0070
                int r17 = r14 + 1
                r11 = r17
                goto L_0x0071
            L_0x0070:
                r11 = r14
            L_0x0071:
                r3 = 0
                r16 = 0
            L_0x0074:
                r18 = r4
                int r4 = r8 + -1
                if (r3 >= r4) goto L_0x01ed
                com.moovit.commons.geo.LatLonE6 r4 = r7.mo24347y(r3)
                int r3 = r3 + 1
                r19 = r8
                com.moovit.commons.geo.LatLonE6 r8 = r7.mo24347y(r3)
                r20 = r3
                r3 = r16
            L_0x008a:
                if (r3 != 0) goto L_0x00a2
                r3 = r4
                r26 = r5
                r16 = r6
                r21 = r7
                r1 = r8
                r25 = r9
                r22 = r10
                r27 = r11
                r28 = r12
                r23 = r14
                r24 = r15
                goto L_0x01b2
            L_0x00a2:
                r16 = r6
                r21 = r7
                double r6 = (double) r15
                r22 = 4621246712864831534(0x4021f766a3bff82e, double:8.983204953368922)
                double r6 = r6 * r22
                r22 = r10
                int r10 = r4.f40981c
                r23 = r14
                int r14 = r3.f40981c
                int r10 = r10 - r14
                double r0 = (double) r10
                int r10 = r4.f40980b
                r24 = r15
                int r15 = r3.f40980b
                int r10 = r10 - r15
                r25 = r9
                double r9 = (double) r10
                r26 = r5
                int r5 = r8.f40981c
                int r5 = r5 - r14
                r27 = r11
                r14 = r12
                double r11 = (double) r5
                int r5 = r8.f40980b
                int r5 = r5 - r15
                r28 = r14
                double r14 = (double) r5
                double r29 = r11 * r11
                double r31 = r14 * r14
                double r31 = r31 + r29
                double r29 = r6 * r6
                int r5 = (r31 > r29 ? 1 : (r31 == r29 ? 0 : -1))
                if (r5 >= 0) goto L_0x00de
                goto L_0x00ea
            L_0x00de:
                double r11 = r11 - r0
                double r14 = r14 - r9
                r31 = 0
                int r5 = (r11 > r31 ? 1 : (r11 == r31 ? 0 : -1))
                if (r5 != 0) goto L_0x00ec
                int r5 = (r14 > r31 ? 1 : (r14 == r31 ? 0 : -1))
                if (r5 != 0) goto L_0x00ec
            L_0x00ea:
                r5 = r3
                goto L_0x012c
            L_0x00ec:
                double r33 = r3.mo46924m()
                double r33 = java.lang.Math.cos(r33)
                double r6 = r6 / r33
                double r6 = r6 * r6
                double r33 = r11 * r11
                double r35 = r14 * r14
                double r33 = r33 / r6
                double r35 = r35 / r29
                double r35 = r35 + r33
                r33 = 4611686018427387904(0x4000000000000000, double:2.0)
                double r37 = r0 * r33
                double r37 = r37 * r11
                double r37 = r37 / r6
                double r39 = r9 * r33
                double r39 = r39 * r14
                double r39 = r39 / r29
                r5 = r3
                double r2 = r39 + r37
                double r0 = r0 * r0
                double r0 = r0 / r6
                double r9 = r9 * r9
                double r9 = r9 / r29
                double r9 = r9 + r0
                r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
                double r9 = r9 - r0
                double r6 = r2 * r2
                r29 = 4616189618054758400(0x4010000000000000, double:4.0)
                double r29 = r29 * r35
                double r29 = r29 * r9
                double r6 = r6 - r29
                int r9 = (r6 > r31 ? 1 : (r6 == r31 ? 0 : -1))
                if (r9 >= 0) goto L_0x012e
            L_0x012c:
                r1 = r8
                goto L_0x018c
            L_0x012e:
                double r6 = java.lang.Math.sqrt(r6)
                double r2 = -r2
                double r9 = r2 + r6
                double r35 = r35 * r33
                double r9 = r9 / r35
                double r2 = r2 - r6
                double r2 = r2 / r35
                com.moovit.commons.geo.LatLonE6 r6 = new com.moovit.commons.geo.LatLonE6
                int r7 = r4.f40980b
                double r0 = (double) r7
                double r33 = r14 * r9
                double r0 = r33 + r0
                int r0 = (int) r0
                int r1 = r4.f40981c
                r33 = r8
                double r7 = (double) r1
                double r34 = r11 * r9
                double r7 = r34 + r7
                int r1 = (int) r7
                r6.<init>(r0, r1)
                com.moovit.commons.geo.LatLonE6 r0 = new com.moovit.commons.geo.LatLonE6
                int r1 = r4.f40980b
                double r7 = (double) r1
                double r14 = r14 * r2
                double r14 = r14 + r7
                int r1 = (int) r14
                int r7 = r4.f40981c
                double r7 = (double) r7
                double r11 = r11 * r2
                double r11 = r11 + r7
                int r7 = (int) r11
                r0.<init>(r1, r7)
                r1 = r33
                float r7 = com.moovit.commons.geo.LatLonE6.m40180t(r1, r6)
                float r8 = com.moovit.commons.geo.LatLonE6.m40180t(r1, r0)
                int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
                if (r7 >= 0) goto L_0x017f
                int r0 = (r9 > r31 ? 1 : (r9 == r31 ? 0 : -1))
                if (r0 < 0) goto L_0x018c
                r7 = 4607182418800017408(0x3ff0000000000000, double:1.0)
                int r0 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
                if (r0 <= 0) goto L_0x018d
                goto L_0x018c
            L_0x017f:
                r7 = 4607182418800017408(0x3ff0000000000000, double:1.0)
                int r6 = (r2 > r31 ? 1 : (r2 == r31 ? 0 : -1))
                if (r6 < 0) goto L_0x018c
                int r6 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
                if (r6 <= 0) goto L_0x018a
                goto L_0x018c
            L_0x018a:
                r6 = r0
                goto L_0x018d
            L_0x018c:
                r6 = 0
            L_0x018d:
                if (r6 != 0) goto L_0x01b1
                r0 = r41
                r1 = r42
                r2 = r43
                r6 = r16
                r4 = r18
                r8 = r19
                r3 = r20
                r7 = r21
                r10 = r22
                r14 = r23
                r15 = r24
                r9 = r25
                r11 = r27
                r12 = r28
                r16 = r5
                r5 = r26
                goto L_0x0074
            L_0x01b1:
                r3 = r6
            L_0x01b2:
                o20.a$a r0 = new o20.a$a
                r2 = r28
                r0.<init>(r3, r13, r2)
                o20.a r5 = new o20.a
                r6 = r43
                java.lang.Object r7 = r6.f47612a
                o20.e r8 = new o20.e
                r10 = r25
                r9 = r26
                r14 = r27
                r11 = 0
                r8.<init>(r9, r10, r14, r11)
                r5.<init>(r7, r0, r8)
                r0 = r42
                java.lang.Object r5 = r0.mo51066d(r5)
                r7 = r16
                r7.add(r5)
                r8 = r1
                r12 = r2
                r2 = r6
                r6 = r7
                r5 = r9
                r9 = r10
                r11 = r14
                r7 = r21
                r10 = r22
                r14 = r23
                r15 = r24
                r1 = r0
                r0 = r41
                goto L_0x008a
            L_0x01ed:
                r21 = r7
                r23 = r14
                r7 = r6
                r0 = r41
                r3 = r44
                r4 = r18
                r7 = r21
                r9 = r23
                r11 = 2200(0x898, float:3.083E-42)
                goto L_0x003e
            L_0x0200:
                r1 = r0
                r7 = r6
                r1.f49430a = r7
                goto L_0x020c
            L_0x0205:
                r1 = r0
                java.util.List r0 = java.util.Collections.emptyList()
                r1.f49430a = r0
            L_0x020c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: s20.C19425r.C19427b.<init>(o20.b, o20.u, com.moovit.map.LineStyle):void");
        }

        /* renamed from: b */
        public static float m46817b(LatLonE6 latLonE6, float f, float f2) {
            return (float) (((Math.cos(latLonE6.mo46924m()) * 4.0075017E7d) / Math.pow(2.0d, (double) f2)) * ((double) (f / 256.0f)));
        }

        /* renamed from: a */
        public final void mo51841a(Object obj) {
            this.f49432c = obj;
        }

        public final void remove() {
            this.f49431b.mo51063b(this.f49430a);
        }
    }

    /* renamed from: s20.r$c */
    public static class C19428c implements C19426a {

        /* renamed from: a */
        public final Polyline f49433a;

        public C19428c(GoogleMap googleMap, C18715u uVar, LineStyle lineStyle, int i) {
            PolylineOptions polylineOptions = new PolylineOptions();
            polylineOptions.addAll(C13720d.m34273c((com.moovit.commons.geo.Polyline) uVar.f47613b, (C13722f) null, C19408h.f49368N));
            polylineOptions.color(lineStyle.f42326b.f41007b);
            polylineOptions.width(lineStyle.f42327c);
            polylineOptions.zIndex((float) i);
            polylineOptions.geodesic(false);
            this.f49433a = googleMap.addPolyline(polylineOptions);
        }

        /* renamed from: a */
        public final void mo51841a(Object obj) {
            this.f49433a.setTag(obj);
        }

        public final void remove() {
            this.f49433a.remove();
        }
    }

    public C19425r(C19406f fVar) {
        C21100e.m49373x(fVar, "groundOverlayItemLayer");
        this.f49428d = fVar;
    }

    /* renamed from: a */
    public final Object mo51808a(GoogleMap googleMap, C19417l lVar, C16273d dVar, int i) {
        C19429s.C19430a aVar = (C19429s.C19430a) lVar;
        LineStyle lineStyle = (LineStyle) dVar;
        if (lineStyle.f42331g == null && lineStyle.f42330f == null) {
            return new C19428c(googleMap, (C18715u) aVar.f49422a, lineStyle, i);
        }
        return new C19427b(this.f49428d, (C18715u) aVar.f49422a, lineStyle);
    }

    /* renamed from: b */
    public final C19406f mo51809b(int i) {
        return new C19429s(this, i);
    }

    /* renamed from: e */
    public final void mo51810e(Object obj) {
        ((C19426a) obj).remove();
    }

    /* renamed from: g */
    public final void mo51811g(Object obj, C19417l lVar) {
        ((C19426a) obj).mo51841a((C19429s.C19430a) lVar);
    }
}
