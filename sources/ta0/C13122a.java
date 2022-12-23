package ta0;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.nutiteq.cache.TextureInfoCache;
import com.nutiteq.components.MapPos;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.microedition.khronos.opengles.GL10;
import mf0.C24361g;
import na0.C12923b;
import oa0.C12960b;
import oa0.C12961c;
import oa0.C12966e;
import oa0.C12968f;
import oa0.C12974i;
import p988j$.util.Iterator;
import p988j$.util.function.Consumer;
import sa0.C13100i;
import ua0.C13146c;
import ua0.C13150e;
import ua0.C13153g;
import ya0.C13274a;
import ya0.C13276c;
import ya0.C13277d;
import za0.C13355b;

/* renamed from: ta0.a */
public final class C13122a implements C13131g {

    /* renamed from: a */
    public final C13355b f32579a;

    /* renamed from: b */
    public final TextureInfoCache f32580b;

    /* renamed from: c */
    public HashMap f32581c = new HashMap();

    /* renamed from: d */
    public C13276c f32582d = new C13276c();

    /* renamed from: e */
    public C13276c f32583e = new C13276c();

    /* renamed from: f */
    public byte[] f32584f = new byte[4];

    /* renamed from: g */
    public double[] f32585g = new double[3];

    /* renamed from: h */
    public double[] f32586h = new double[3];

    /* renamed from: ta0.a$a */
    public static class C13123a {

        /* renamed from: a */
        public ArrayList<C12960b> f32587a = new ArrayList<>();

        /* renamed from: b */
        public C13276c f32588b = new C13276c();

        /* renamed from: c */
        public C13276c f32589c = new C13276c();

        /* renamed from: d */
        public C13276c f32590d = new C13276c();

        /* renamed from: e */
        public C13276c f32591e = new C13276c();

        /* renamed from: f */
        public C13276c f32592f = new C13276c();

        /* renamed from: g */
        public C13276c f32593g = new C13276c();

        /* renamed from: h */
        public C13274a f32594h = new C13274a();
    }

    /* renamed from: ta0.a$b */
    public static class C13124b implements Iterator<ArrayList<C12961c.C12962a>>, p988j$.util.Iterator {

        /* renamed from: b */
        public Iterator<C12960b> f32595b;

        public C13124b(ArrayList arrayList) {
            this.f32595b = arrayList.iterator();
        }

        public final /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, Consumer.VivifiedWrapper.convert(consumer));
        }

        public final boolean hasNext() {
            return this.f32595b.hasNext();
        }

        public final Object next() {
            C12960b next = this.f32595b.next();
            if (next instanceof C12961c) {
                return ((C12961c.C12963b) ((C12961c) next).f32125e).f32109f;
            }
            if (next instanceof C12968f) {
                return ((C12968f.C12969a) ((C12968f) next).f32125e).f32116g;
            }
            return null;
        }

        public final void remove() {
        }
    }

    public C13122a(C13355b bVar, TextureInfoCache textureInfoCache) {
        this.f32579a = bVar;
        this.f32580b = textureInfoCache;
    }

    /* renamed from: a */
    public final boolean mo40029a() {
        return true;
    }

    /* renamed from: b */
    public final boolean mo40030b() {
        return false;
    }

    /* renamed from: c */
    public final void mo40031c(GL10 gl10) {
        ArrayList<C12960b> arrayList;
        C13355b bVar = this.f32579a;
        if (bVar.f32171b) {
            arrayList = bVar.f33149f;
        } else {
            arrayList = null;
        }
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        if (arrayList.isEmpty() && !this.f32581c.isEmpty()) {
            this.f32581c.clear();
        }
        for (C13123a aVar : this.f32581c.values()) {
            aVar.f32587a.clear();
        }
        for (C12960b bVar2 : arrayList) {
            C13153g gVar = bVar2.mo39840c().f32128b;
            if (gVar != null) {
                C13123a aVar2 = (C13123a) this.f32581c.get(gVar);
                if (aVar2 == null) {
                    aVar2 = new C13123a();
                    this.f32581c.put(gVar, aVar2);
                }
                aVar2.f32587a.add(bVar2);
            }
        }
        java.util.Iterator it = this.f32581c.entrySet().iterator();
        while (it.hasNext()) {
            if (((C13123a) ((Map.Entry) it.next()).getValue()).f32587a.isEmpty()) {
                it.remove();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x01c9  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0223 A[SYNTHETIC] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo40032d(javax.microedition.khronos.opengles.GL10 r22, na0.C12923b r23) {
        /*
            r21 = this;
            r0 = r21
            r1 = r22
            r2 = r23
            java.nio.FloatBuffer r3 = ya0.C13277d.f32942a
            java.util.HashMap r3 = r0.f32581c
            java.util.Set r3 = r3.entrySet()
            java.util.Iterator r3 = r3.iterator()
        L_0x0012:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x023a
            java.lang.Object r4 = r3.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r7 = r4.getKey()
            ua0.g r7 = (ua0.C13153g) r7
            java.lang.Object r4 = r4.getValue()
            ta0.a$a r4 = (ta0.C13122a.C13123a) r4
            boolean r8 = r7 instanceof ua0.C13150e
            if (r8 != 0) goto L_0x0227
            boolean r8 = r7 instanceof ua0.C13146c
            r11 = 0
            if (r8 == 0) goto L_0x0042
            r8 = r7
            ua0.c r8 = (ua0.C13146c) r8
            ta0.a$b r13 = new ta0.a$b
            java.util.ArrayList<oa0.b> r14 = r4.f32587a
            r13.<init>(r14)
            r0.mo40036h(r4, r13, r8, r2)
            goto L_0x00ba
        L_0x0042:
            boolean r8 = r7 instanceof ua0.C13151f
            if (r8 == 0) goto L_0x00ba
            r8 = r7
            ua0.f r8 = (ua0.C13151f) r8
            java.util.ArrayList<oa0.b> r13 = r4.f32587a
            java.util.Iterator r13 = r13.iterator()
            com.nutiteq.components.MapPos r14 = r2.f31988a
            ya0.c r15 = r4.f32592f
            r15.f32938a = r11
        L_0x0055:
            boolean r15 = r13.hasNext()
            if (r15 == 0) goto L_0x00a9
            java.lang.Object r15 = r13.next()
            oa0.f r15 = (oa0.C12968f) r15
            oa0.i$a r15 = r15.f32125e
            oa0.f$a r15 = (oa0.C12968f.C12969a) r15
            double r5 = r15.f32113d
            double r9 = r14.f24175b
            double r5 = r5 - r9
            float r5 = (float) r5
            double r9 = r15.f32114e
            double r11 = r14.f24176c
            double r9 = r9 - r11
            float r9 = (float) r9
            double r10 = r14.f24177d
            double r10 = -r10
            float r10 = (float) r10
            float[] r11 = r15.f32115f
            int r12 = r11.length
            r15 = 3
            int r12 = r12 / r15
            r15 = 0
        L_0x007b:
            if (r15 >= r12) goto L_0x00a7
            ya0.c r6 = r4.f32592f
            int r17 = r15 * 3
            int r18 = r17 + 0
            r18 = r11[r18]
            r19 = r3
            float r3 = r18 + r5
            int r18 = r17 + 1
            r18 = r11[r18]
            r20 = r5
            float r5 = r18 + r9
            r16 = 2
            int r17 = r17 + 2
            r17 = r11[r17]
            r18 = r9
            float r9 = r17 + r10
            r6.mo40141b(r3, r5, r9)
            int r15 = r15 + 1
            r9 = r18
            r3 = r19
            r5 = r20
            goto L_0x007b
        L_0x00a7:
            r11 = 0
            goto L_0x0055
        L_0x00a9:
            r19 = r3
            ua0.c r3 = r8.f32691b
            if (r3 == 0) goto L_0x00bc
            ta0.a$b r5 = new ta0.a$b
            java.util.ArrayList<oa0.b> r6 = r4.f32587a
            r5.<init>(r6)
            r0.mo40036h(r4, r5, r3, r2)
            goto L_0x00bc
        L_0x00ba:
            r19 = r3
        L_0x00bc:
            boolean r3 = r7 instanceof ua0.C13151f
            r5 = 4
            r8 = 32884(0x8074, float:4.608E-41)
            r9 = 5126(0x1406, float:7.183E-42)
            r10 = 3553(0xde1, float:4.979E-42)
            r11 = 65535(0xffff, float:9.1834E-41)
            if (r3 == 0) goto L_0x010f
            ua0.f r7 = (ua0.C13151f) r7
            na0.c r3 = r7.f32693a
            float r6 = r3.f31998a
            float r12 = r3.f32001d
            float r6 = r6 * r12
            float r13 = r3.f31999b
            float r13 = r13 * r12
            float r3 = r3.f32000c
            float r3 = r3 * r12
            r1.glColor4f(r6, r13, r3, r12)
            r1.glDisable(r10)
            r3 = 0
        L_0x00e4:
            ya0.c r6 = r4.f32592f
            int r6 = r6.f32938a
            r12 = 3
            int r6 = r6 / r12
            if (r3 >= r6) goto L_0x010d
            int r6 = r6 - r3
            int r6 = java.lang.Math.min(r11, r6)
            ya0.c r13 = r4.f32592f
            int r14 = r3 * 3
            int r15 = r6 * 3
            java.nio.FloatBuffer r13 = r13.mo40142c(r14, r15)
            r14 = 0
            r1.glVertexPointer(r12, r9, r14, r13)
            r1.glEnableClientState(r8)
            r12 = 32888(0x8078, float:4.6086E-41)
            r1.glDisableClientState(r12)
            r1.glDrawArrays(r5, r14, r6)
            int r3 = r3 + r11
            goto L_0x00e4
        L_0x010d:
            ua0.c r7 = r7.f32691b
        L_0x010f:
            boolean r3 = r7 instanceof ua0.C13146c
            if (r3 == 0) goto L_0x01c5
            r3 = r7
            ua0.c r3 = (ua0.C13146c) r3
            boolean r12 = r3.f32675e
            if (r12 == 0) goto L_0x016b
            na0.l r3 = r3.f32672b
            r12 = 1065353216(0x3f800000, float:1.0)
            r1.glColor4f(r12, r12, r12, r12)
            r1.glEnable(r10)
            com.nutiteq.cache.TextureInfoCache r12 = r0.f32580b
            int r3 = r12.mo24910a(r1, r3)
            r1.glBindTexture(r10, r3)
            r3 = 0
        L_0x012e:
            ya0.c r12 = r0.f32582d
            int r12 = r12.f32938a
            r13 = 3
            int r12 = r12 / r13
            if (r3 >= r12) goto L_0x01c5
            int r12 = r12 - r3
            int r12 = java.lang.Math.min(r11, r12)
            ya0.c r14 = r0.f32582d
            int r15 = r3 * 3
            int r6 = r12 * 3
            java.nio.FloatBuffer r6 = r14.mo40142c(r15, r6)
            r14 = 0
            r1.glVertexPointer(r13, r9, r14, r6)
            r1.glEnableClientState(r8)
            ya0.c r6 = r0.f32583e
            int r13 = r3 * 2
            int r15 = r12 * 2
            java.nio.FloatBuffer r6 = r6.mo40142c(r13, r15)
            r13 = 2
            r1.glTexCoordPointer(r13, r9, r14, r6)
            r6 = 32888(0x8078, float:4.6086E-41)
            r1.glEnableClientState(r6)
            r6 = 32886(0x8076, float:4.6083E-41)
            r1.glDisableClientState(r6)
            r1.glDrawArrays(r5, r14, r12)
            int r3 = r3 + r11
            goto L_0x012e
        L_0x016b:
            na0.c r7 = r3.f32693a
            float r12 = r7.f31998a
            float r13 = r7.f32001d
            float r12 = r12 * r13
            float r14 = r7.f31999b
            float r14 = r14 * r13
            float r7 = r7.f32000c
            float r7 = r7 * r13
            r1.glColor4f(r12, r14, r7, r13)
            r1.glEnable(r10)
            com.nutiteq.cache.TextureInfoCache r7 = r0.f32580b
            na0.l r3 = r3.f32672b
            int r3 = r7.mo24910a(r1, r3)
            r1.glBindTexture(r10, r3)
            r3 = 0
        L_0x018d:
            ya0.c r7 = r4.f32590d
            int r7 = r7.f32938a
            r12 = 3
            int r7 = r7 / r12
            if (r3 >= r7) goto L_0x01c4
            int r7 = r7 - r3
            int r7 = java.lang.Math.min(r11, r7)
            ya0.c r13 = r4.f32590d
            int r14 = r3 * 3
            int r15 = r7 * 3
            java.nio.FloatBuffer r13 = r13.mo40142c(r14, r15)
            r6 = 0
            r1.glVertexPointer(r12, r9, r6, r13)
            r1.glEnableClientState(r8)
            ya0.c r12 = r4.f32591e
            int r13 = r3 * 2
            int r14 = r7 * 2
            java.nio.FloatBuffer r12 = r12.mo40142c(r13, r14)
            r13 = 2
            r1.glTexCoordPointer(r13, r9, r6, r12)
            r12 = 32888(0x8078, float:4.6086E-41)
            r1.glEnableClientState(r12)
            r1.glDrawArrays(r5, r6, r7)
            int r3 = r3 + r11
            goto L_0x018d
        L_0x01c4:
            r7 = 0
        L_0x01c5:
            boolean r3 = r7 instanceof ua0.C13150e
            if (r3 == 0) goto L_0x0223
            ua0.e r7 = (ua0.C13150e) r7
            na0.c r3 = r7.f32693a
            float r7 = r3.f31998a
            float r12 = r3.f32001d
            float r7 = r7 * r12
            float r13 = r3.f31999b
            float r13 = r13 * r12
            float r3 = r3.f32000c
            float r3 = r3 * r12
            r1.glColor4f(r7, r13, r3, r12)
            r1.glEnable(r10)
            com.nutiteq.cache.TextureInfoCache r3 = r0.f32580b
            r7 = 0
            int r3 = r3.mo24910a(r1, r7)
            r1.glBindTexture(r10, r3)
            r3 = 0
        L_0x01ec:
            ya0.c r7 = r4.f32588b
            int r7 = r7.f32938a
            r10 = 3
            int r7 = r7 / r10
            if (r3 >= r7) goto L_0x0223
            int r7 = r7 - r3
            int r7 = java.lang.Math.min(r11, r7)
            ya0.c r12 = r4.f32588b
            int r13 = r3 * 3
            int r14 = r7 * 3
            java.nio.FloatBuffer r12 = r12.mo40142c(r13, r14)
            r6 = 0
            r1.glVertexPointer(r10, r9, r6, r12)
            r1.glEnableClientState(r8)
            ya0.c r12 = r4.f32589c
            int r13 = r3 * 2
            int r14 = r7 * 2
            java.nio.FloatBuffer r12 = r12.mo40142c(r13, r14)
            r13 = 2
            r1.glTexCoordPointer(r13, r9, r6, r12)
            r12 = 32888(0x8078, float:4.6086E-41)
            r1.glEnableClientState(r12)
            r1.glDrawArrays(r5, r6, r7)
            int r3 = r3 + r11
            goto L_0x01ec
        L_0x0223:
            r3 = r19
            goto L_0x0012
        L_0x0227:
            ua0.e r7 = (ua0.C13150e) r7
            java.util.ArrayList<oa0.b> r1 = r4.f32587a
            na0.h r3 = new na0.h
            r3.<init>()
            r1.iterator()
            com.nutiteq.components.MapPos r1 = r2.f31988a
            r7.getClass()
            r1 = 0
            throw r1
        L_0x023a:
            r2 = 1065353216(0x3f800000, float:1.0)
            r1.glColor4f(r2, r2, r2, r2)
            r2 = 32888(0x8078, float:4.6086E-41)
            r1.glDisableClientState(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ta0.C13122a.mo40032d(javax.microedition.khronos.opengles.GL10, na0.b):void");
    }

    /* renamed from: e */
    public final void mo40033e(GL10 gl10) {
        this.f32581c.clear();
    }

    /* renamed from: f */
    public final void mo40034f(GL10 gl10, C12923b bVar, C13100i iVar) {
        java.util.Iterator<C12960b> it;
        C13153g gVar;
        java.util.Iterator it2;
        int i;
        MapPos mapPos;
        C12960b bVar2;
        C13100i iVar2;
        C13122a aVar = this;
        GL10 gl102 = gl10;
        C12923b bVar3 = bVar;
        gl102.glDisable(3553);
        gl102.glDisableClientState(32888);
        FloatBuffer floatBuffer = C13277d.f32942a;
        java.util.Iterator it3 = aVar.f32581c.entrySet().iterator();
        while (it3.hasNext()) {
            Map.Entry entry = (Map.Entry) it3.next();
            C13153g gVar2 = (C13153g) entry.getKey();
            C13123a aVar2 = (C13123a) entry.getValue();
            java.util.Iterator<C12960b> it4 = aVar2.f32587a.iterator();
            MapPos mapPos2 = bVar3.f31988a;
            aVar2.f32593g.f32938a = 0;
            aVar2.f32594h.f32930a = 0;
            while (it4.hasNext()) {
                C12960b next = it4.next();
                if (next.f32122b) {
                    if (next instanceof C12966e) {
                        ((C13150e) gVar2).getClass();
                        float f = BitmapDescriptorFactory.HUE_RED / bVar3.f31997j;
                        ((C12966e.C12967a) ((C12966e) next).f32125e).getClass();
                        float f2 = (float) (0.0d - mapPos2.f24175b);
                        float f3 = (float) (0.0d - mapPos2.f24176c);
                        C13153g gVar3 = gVar2;
                        float f4 = (float) (-mapPos2.f24177d);
                        float f5 = -f;
                        float f6 = f5 + f2;
                        float f7 = f5 + f3;
                        float f8 = f3 + f;
                        float f9 = f + f2;
                        aVar2.f32593g.mo40141b(f6, f7, f4);
                        aVar2.f32593g.mo40141b(f9, f7, f4);
                        aVar2.f32593g.mo40141b(f6, f8, f4);
                        aVar2.f32593g.mo40141b(f9, f7, f4);
                        aVar2.f32593g.mo40141b(f9, f8, f4);
                        aVar2.f32593g.mo40141b(f6, f8, f4);
                        iVar2 = iVar;
                        it2 = it3;
                        it = it4;
                        mapPos = mapPos2;
                        bVar2 = next;
                        gVar = gVar3;
                        i = 6;
                    } else {
                        C13153g gVar4 = gVar2;
                        if (next instanceof C12961c) {
                            C12961c cVar = (C12961c) next;
                            float f11 = (((C13146c) gVar4).f32673c * 0.5f) / bVar3.f31997j;
                            java.util.Iterator<C12961c.C12962a> it5 = ((C12961c.C12963b) cVar.f32125e).f32109f.iterator();
                            while (it5.hasNext()) {
                                C12961c.C12962a next2 = it5.next();
                                double d = next2.f32102a;
                                C13153g gVar5 = gVar4;
                                double d2 = mapPos2.f24175b;
                                float f12 = (float) (d - d2);
                                java.util.Iterator it6 = it3;
                                double d3 = next2.f32103b;
                                double d4 = mapPos2.f24176c;
                                float f13 = (float) (d3 - d4);
                                C12960b bVar4 = next;
                                java.util.Iterator<C12961c.C12962a> it7 = it5;
                                float f14 = (float) (-mapPos2.f24177d);
                                java.util.Iterator<C12960b> it8 = it4;
                                MapPos mapPos3 = mapPos2;
                                float f15 = (float) (next2.f32104c - d2);
                                float f16 = (float) (next2.f32105d - d4);
                                float cos = (float) Math.cos((double) (next2.f32106e * 0.017453292f));
                                float sin = (float) Math.sin((double) (next2.f32106e * 0.017453292f));
                                float f17 = -f11;
                                float f18 = f17 * cos;
                                float f19 = f18 + f12;
                                float f21 = f17 * sin;
                                java.util.Iterator<C12960b> it9 = it8;
                                float f22 = f21 + f13;
                                float f23 = cos * f11;
                                float f24 = f12 + f23;
                                float f25 = sin * f11;
                                float f26 = f13 + f25;
                                float f27 = f18 + f15;
                                float f28 = f21 + f16;
                                float f29 = f25 + f16;
                                aVar2.f32593g.mo40141b(f19, f22, f14);
                                aVar2.f32593g.mo40141b(f24, f26, f14);
                                aVar2.f32593g.mo40141b(f27, f28, f14);
                                aVar2.f32593g.mo40141b(f24, f26, f14);
                                aVar2.f32593g.mo40141b(f23 + f15, f29, f14);
                                aVar2.f32593g.mo40141b(f27, f28, f14);
                                GL10 gl103 = gl10;
                                C12923b bVar5 = bVar;
                                next = bVar4;
                                it3 = it6;
                                gVar4 = gVar5;
                                it5 = it7;
                                mapPos2 = mapPos3;
                                it4 = it9;
                            }
                            it2 = it3;
                            it = it4;
                            bVar2 = next;
                            gVar = gVar4;
                            i = ((C12961c.C12963b) cVar.f32125e).f32109f.size() * 6;
                            mapPos = mapPos2;
                        } else {
                            it2 = it3;
                            it = it4;
                            MapPos mapPos4 = mapPos2;
                            bVar2 = next;
                            gVar = gVar4;
                            if (bVar2 instanceof C12968f) {
                                C12968f.C12969a aVar3 = (C12968f.C12969a) ((C12968f) bVar2).f32125e;
                                mapPos = mapPos4;
                                float f31 = (float) (aVar3.f32113d - mapPos.f24175b);
                                float f32 = (float) (aVar3.f32114e - mapPos.f24176c);
                                float f33 = (float) (-mapPos.f24177d);
                                float[] fArr = aVar3.f32115f;
                                int length = fArr.length / 3;
                                for (int i2 = 0; i2 < length; i2++) {
                                    int i3 = i2 * 3;
                                    aVar2.f32593g.mo40141b(fArr[i3 + 0] + f31, fArr[i3 + 1] + f32, fArr[i3 + 2] + f33);
                                }
                                i = length;
                            } else {
                                mapPos = mapPos4;
                                iVar2 = iVar;
                                i = 0;
                            }
                        }
                        iVar2 = iVar;
                    }
                    C24361g.m61136F(iVar2.mo39991a(bVar2), this.f32584f);
                    for (int i4 = 0; i4 < i; i4++) {
                        C13274a aVar4 = aVar2.f32594h;
                        byte[] bArr = this.f32584f;
                        aVar4.mo40138a(bArr[0], bArr[1], bArr[2], bArr[3]);
                    }
                    GL10 gl104 = gl10;
                    aVar = this;
                    mapPos2 = mapPos;
                    it3 = it2;
                    gVar2 = gVar;
                    it4 = it;
                    bVar3 = bVar;
                }
            }
            C13122a aVar5 = aVar;
            java.util.Iterator it10 = it3;
            int i5 = 3;
            C13100i iVar3 = iVar;
            int i6 = 0;
            while (true) {
                int i7 = aVar2.f32593g.f32938a / i5;
                if (i6 >= i7) {
                    break;
                }
                int min = Math.min(65535, i7 - i6);
                GL10 gl105 = gl10;
                gl105.glVertexPointer(3, 5126, 0, aVar2.f32593g.mo40142c(i6 * 3, min * 3));
                gl105.glEnableClientState(32884);
                gl105.glColorPointer(4, 5121, 0, aVar2.f32594h.mo40139b(i6 * 4, min * 4));
                gl105.glEnableClientState(32886);
                gl105.glDrawArrays(4, 0, min);
                i6 += 65535;
                i5 = 3;
            }
            gl102 = gl10;
            aVar = aVar5;
            it3 = it10;
            bVar3 = bVar;
        }
        C13122a aVar6 = aVar;
        gl102.glDisableClientState(32886);
    }

    /* renamed from: g */
    public final MapPos mo40035g(C12974i iVar, C12923b bVar, MapPos mapPos) {
        return mapPos;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x011a, code lost:
        r0 = r0 + 1;
        r4 = r55;
        r5 = r31;
        r9 = r32;
        r8 = r33;
        r7 = r34;
        r6 = r35;
     */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x012b  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0151  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo40036h(ta0.C13122a.C13123a r53, ta0.C13122a.C13124b r54, ua0.C13146c r55, na0.C12923b r56) {
        /*
            r52 = this;
            r0 = r52
            r1 = r53
            r2 = r55
            r3 = r56
            boolean r4 = r2.f32675e
            r5 = 3
            r6 = 6
            r7 = 2
            r8 = 0
            r9 = 1
            r10 = 1056964608(0x3f000000, float:0.5)
            if (r4 == 0) goto L_0x0399
            ya0.c r1 = r0.f32582d
            r1.f32938a = r8
            ya0.c r1 = r0.f32583e
            r1.f32938a = r8
            com.nutiteq.components.MapPos r1 = r3.f31988a
            na0.l r4 = r2.f32672b
            float r11 = r4.f32062d
            float r11 = r11 * r10
            float r12 = r11 * r10
            float r13 = r3.f31997j
            float r12 = r12 / r13
            float r14 = r4.f32063e
            float r14 = r14 * r10
            float r10 = r10 * r14
            float r10 = r10 / r13
            float r11 = r11 / r13
            float r14 = r14 / r13
            float[] r13 = r4.f32060b
            r8 = r13[r8]
            r9 = r13[r9]
            r7 = r13[r7]
            r5 = r13[r5]
            r15 = 4
            r15 = r13[r15]
            r16 = 5
            r53 = r15
            r15 = r13[r16]
            r6 = r13[r6]
            r16 = 7
            r13 = r13[r16]
            r16 = r6
            float r6 = r3.f31995h
            float r6 = -r6
            r17 = 1016003125(0x3c8efa35, float:0.017453292)
            float r6 = r6 * r17
            r18 = r5
            double r5 = (double) r6
            double r5 = java.lang.Math.cos(r5)
            float r5 = (float) r5
            float r6 = r3.f31995h
            float r6 = -r6
            float r6 = r6 * r17
            r19 = r7
            double r6 = (double) r6
            double r6 = java.lang.Math.sin(r6)
            float r6 = (float) r6
            float r7 = r3.f31994g
            float r7 = -r7
            float r7 = r7 * r17
            r20 = r8
            double r7 = (double) r7
            double r7 = java.lang.Math.cos(r7)
            float r7 = (float) r7
            float r8 = r3.f31994g
            float r8 = -r8
            float r8 = r8 * r17
            r17 = r9
            double r8 = (double) r8
            double r8 = java.lang.Math.sin(r8)
            float r8 = (float) r8
            float r9 = r5 * r8
            float r8 = -r8
            float r5 = r5 * r7
            float r6 = -r6
            r21 = r13
            ya0.c r13 = r0.f32582d
            r22 = r15
            ya0.c r15 = r0.f32583e
            r23 = 1065353216(0x3f800000, float:1.0)
            float r2 = r2.f32676f
            float r2 = r2 + r23
            float r4 = r4.f32062d
            float r2 = r2 * r4
            float r3 = r3.f31997j
            float r2 = r2 / r3
            r3 = 2
            double[] r3 = new double[r3]
            r23 = 0
            r4 = 0
            r25 = r23
            r27 = r25
        L_0x00a8:
            boolean r29 = r54.hasNext()
            if (r29 == 0) goto L_0x06e5
            java.lang.Object r29 = r54.next()
            r55 = r4
            r4 = r29
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            r29 = 0
            r30 = r15
            r28 = r27
            r0 = 0
            r26 = r25
            r25 = r55
        L_0x00c3:
            int r15 = r4.size()
            if (r0 >= r15) goto L_0x0389
            java.lang.Object r15 = r4.get(r0)
            oa0.c$a r15 = (oa0.C12961c.C12962a) r15
            r55 = r4
            r31 = r5
            double r4 = r15.f32104c
            r33 = r8
            r32 = r9
            double r8 = r15.f32102a
            double r4 = r4 - r8
            double r8 = r15.f32105d
            r35 = r6
            r34 = r7
            double r6 = r15.f32103b
            double r8 = r8 - r6
            double r4 = java.lang.Math.hypot(r4, r8)
            float r4 = (float) r4
            double r4 = (double) r4
            double r6 = (double) r2
            double r8 = r4 / r6
            double r8 = java.lang.Math.floor(r8)
            int r8 = (int) r8
            r36 = r6
            double r6 = (double) r8
            double r4 = r4 / r6
            if (r8 != 0) goto L_0x0110
            double r6 = r15.f32102a
            double r6 = r26 - r6
            r38 = r4
            double r4 = r15.f32103b
            double r4 = r28 - r4
            double r4 = java.lang.Math.hypot(r6, r4)
            float r4 = (float) r4
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 < 0) goto L_0x0112
            r8 = 1
            r6 = r36
            goto L_0x0114
        L_0x0110:
            r38 = r4
        L_0x0112:
            r6 = r38
        L_0x0114:
            r4 = 0
        L_0x0115:
            if (r25 == 0) goto L_0x0129
            if (r4 >= r8) goto L_0x011a
            goto L_0x0129
        L_0x011a:
            int r0 = r0 + 1
            r4 = r55
            r5 = r31
            r9 = r32
            r8 = r33
            r7 = r34
            r6 = r35
            goto L_0x00c3
        L_0x0129:
            if (r25 != 0) goto L_0x0151
            r5 = r8
            double r8 = r15.f32102a
            r25 = r8
            double r8 = r15.f32103b
            int r4 = r4 + -1
            r27 = 1
            r46 = r0
            r0 = r1
            r41 = r2
            r42 = r3
            r56 = r5
            r43 = r6
            r28 = r8
            r39 = r10
            r40 = r11
            r38 = r13
            r37 = r14
            r26 = r25
            r25 = 1
            goto L_0x0298
        L_0x0151:
            r5 = r8
            if (r4 != 0) goto L_0x0187
            double r8 = r15.f32102a
            double r8 = r26 - r8
            r36 = r4
            r56 = r5
            double r4 = r15.f32103b
            double r4 = r28 - r4
            double r4 = java.lang.Math.hypot(r8, r4)
            float r4 = (float) r4
            double r4 = (double) r4
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 < 0) goto L_0x018b
            double r4 = r15.f32102a
            double r8 = r15.f32103b
            r46 = r0
            r0 = r1
            r41 = r2
            r42 = r3
            r26 = r4
            r43 = r6
            r28 = r8
            r39 = r10
            r40 = r11
            r38 = r13
            r37 = r14
            r4 = r36
            goto L_0x0298
        L_0x0187:
            r36 = r4
            r56 = r5
        L_0x018b:
            double r4 = r15.f32102a
            double r4 = r4 - r26
            double r8 = r15.f32103b
            double r8 = r8 - r28
            r38 = r13
            r37 = r14
            double r13 = r15.f32104c
            double r13 = r13 - r26
            r39 = r10
            r40 = r11
            double r10 = r15.f32105d
            double r10 = r10 - r28
            double r41 = r6 * r6
            double r43 = r4 * r4
            double r45 = r8 * r8
            double r45 = r45 + r43
            double r43 = r13 * r13
            double r47 = r10 * r10
            double r47 = r47 + r43
            int r43 = (r45 > r41 ? 1 : (r45 == r41 ? 0 : -1))
            if (r43 >= 0) goto L_0x01c8
            int r43 = (r47 > r41 ? 1 : (r47 == r41 ? 0 : -1))
            if (r43 >= 0) goto L_0x01c8
            r4 = 0
            r5 = 1
            r8 = 0
            r46 = r0
            r45 = r1
            r41 = r2
            r42 = r3
            r43 = r6
            goto L_0x028a
        L_0x01c8:
            r43 = r6
            double r6 = r13 - r4
            r46 = r0
            r45 = r1
            double r0 = r10 - r8
            double r47 = java.lang.Math.hypot(r6, r0)
            double r4 = r4 * r10
            double r13 = r13 * r8
            double r4 = r4 - r13
            int r8 = (r47 > r23 ? 1 : (r47 == r23 ? 0 : -1))
            if (r8 == 0) goto L_0x0381
            double r41 = r41 * r47
            double r41 = r41 * r47
            double r8 = r4 * r4
            double r41 = r41 - r8
            int r8 = (r41 > r23 ? 1 : (r41 == r23 ? 0 : -1))
            if (r8 >= 0) goto L_0x01ff
            double r0 = r15.f32102a
            r4 = 0
            r3[r4] = r0
            double r0 = r15.f32103b
            r4 = 1
            r3[r4] = r0
            r0 = 0
            r1 = 1
            r41 = r2
            r42 = r3
        L_0x01fb:
            r4 = 0
            r5 = 1
            goto L_0x0289
        L_0x01ff:
            double r8 = java.lang.Math.sqrt(r41)
            double r10 = r4 * r0
            int r13 = (r0 > r23 ? 1 : (r0 == r23 ? 0 : -1))
            if (r13 >= 0) goto L_0x020b
            r14 = -1
            goto L_0x020c
        L_0x020b:
            r14 = 1
        L_0x020c:
            r41 = r2
            r42 = r3
            double r2 = (double) r14
            double r2 = r2 * r6
            double r2 = r2 * r8
            double r2 = r2 + r10
            double r47 = r47 * r47
            double r2 = r2 / r47
            double r4 = -r4
            double r4 = r4 * r6
            double r49 = java.lang.Math.abs(r0)
            double r49 = r49 * r8
            double r49 = r49 + r4
            double r49 = r49 / r47
            if (r13 >= 0) goto L_0x022b
            r13 = -1
            goto L_0x022c
        L_0x022b:
            r13 = 1
        L_0x022c:
            double r13 = (double) r13
            double r13 = r13 * r6
            double r13 = r13 * r8
            double r10 = r10 - r13
            double r10 = r10 / r47
            double r0 = java.lang.Math.abs(r0)
            double r0 = r0 * r8
            double r4 = r4 - r0
            double r4 = r4 / r47
            boolean r0 = java.lang.Double.isNaN(r2)
            if (r0 != 0) goto L_0x0379
            boolean r0 = java.lang.Double.isNaN(r49)
            if (r0 != 0) goto L_0x0379
            boolean r0 = java.lang.Double.isNaN(r10)
            if (r0 != 0) goto L_0x0379
            boolean r0 = java.lang.Double.isNaN(r4)
            if (r0 != 0) goto L_0x0379
            double r2 = r2 + r26
            double r49 = r49 + r28
            double r10 = r10 + r26
            double r4 = r4 + r28
            double r0 = r15.f32104c
            double r0 = r0 - r2
            double r6 = r15.f32105d
            double r6 = r6 - r49
            double r0 = java.lang.Math.hypot(r0, r6)
            float r0 = (float) r0
            double r0 = (double) r0
            double r6 = r15.f32104c
            double r6 = r6 - r10
            double r8 = r15.f32105d
            double r8 = r8 - r4
            double r6 = java.lang.Math.hypot(r6, r8)
            float r6 = (float) r6
            double r6 = (double) r6
            int r8 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            r0 = 0
            if (r8 >= 0) goto L_0x0282
            r42[r0] = r2
            r1 = 1
            r42[r1] = r49
            goto L_0x01fb
        L_0x0282:
            r1 = 1
            r42[r0] = r10
            r42[r1] = r4
            goto L_0x01fb
        L_0x0289:
            r8 = 1
        L_0x028a:
            if (r8 == 0) goto L_0x033b
            r0 = r42[r4]
            r2 = r42[r5]
            r26 = r0
            r28 = r2
            r4 = r36
            r0 = r45
        L_0x0298:
            double r1 = r0.f24175b
            double r1 = r26 - r1
            float r1 = (float) r1
            double r2 = r0.f24176c
            double r2 = r28 - r2
            float r2 = (float) r2
            double r5 = r0.f24177d
            double r5 = -r5
            float r3 = (float) r5
            r11 = r40
            float r5 = -r11
            float r5 = r5 + r12
            r14 = r37
            float r6 = -r14
            float r6 = r6 + r39
            float r7 = r5 * r34
            float r9 = r6 * r32
            float r8 = r7 + r9
            float r8 = r8 + r1
            float r10 = r5 * r33
            float r13 = r6 * r31
            float r36 = r10 + r13
            r45 = r0
            float r0 = r36 + r2
            r36 = 0
            float r5 = r5 * r36
            float r6 = r6 * r35
            float r37 = r5 + r6
            r40 = r4
            float r4 = r37 + r3
            float r37 = r11 + r12
            float r47 = r37 * r34
            float r9 = r47 + r9
            float r9 = r9 + r1
            float r48 = r37 * r33
            float r13 = r48 + r13
            float r13 = r13 + r2
            float r37 = r37 * r36
            float r6 = r37 + r6
            float r6 = r6 + r3
            float r36 = r14 + r39
            float r49 = r36 * r32
            float r7 = r7 + r49
            float r7 = r7 + r1
            float r50 = r36 * r31
            float r10 = r10 + r50
            float r10 = r10 + r2
            float r36 = r36 * r35
            float r5 = r5 + r36
            float r5 = r5 + r3
            float r47 = r47 + r49
            float r1 = r47 + r1
            float r48 = r48 + r50
            float r2 = r48 + r2
            float r37 = r37 + r36
            float r3 = r37 + r3
            r37 = r11
            r11 = r38
            r11.mo40141b(r8, r0, r4)
            r4 = r17
            r0 = r20
            r8 = r30
            r8.mo40140a(r0, r4)
            r11.mo40141b(r9, r13, r6)
            r4 = r18
            r0 = r19
            r8.mo40140a(r0, r4)
            r11.mo40141b(r7, r10, r5)
            r18 = r12
            r19 = r14
            r14 = r22
            r12 = r53
            r8.mo40140a(r12, r14)
            r11.mo40141b(r9, r13, r6)
            r8.mo40140a(r0, r4)
            r11.mo40141b(r1, r2, r3)
            r1 = r16
            r2 = r21
            r8.mo40140a(r1, r2)
            r11.mo40141b(r7, r10, r5)
            r8.mo40140a(r12, r14)
            r36 = r40
            goto L_0x0351
        L_0x033b:
            r1 = r16
            r4 = r18
            r0 = r19
            r2 = r21
            r14 = r22
            r8 = r30
            r19 = r37
            r11 = r38
            r37 = r40
            r18 = r12
            r12 = r53
        L_0x0351:
            int r3 = r36 + 1
            r16 = r1
            r21 = r2
            r30 = r8
            r13 = r11
            r53 = r12
            r22 = r14
            r12 = r18
            r14 = r19
            r11 = r37
            r10 = r39
            r2 = r41
            r6 = r43
            r1 = r45
            r8 = r56
            r19 = r0
            r18 = r4
            r0 = r46
            r4 = r3
            r3 = r42
            goto L_0x0115
        L_0x0379:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "NaN result"
            r0.<init>(r1)
            throw r0
        L_0x0381:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "l1 and l2 may not be the same point"
            r0.<init>(r1)
            throw r0
        L_0x0389:
            r4 = r18
            r0 = r19
            r4 = r25
            r25 = r26
            r27 = r28
            r15 = r30
            r0 = r52
            goto L_0x00a8
        L_0x0399:
            com.nutiteq.components.MapPos r0 = r3.f31988a
            na0.l r4 = r2.f32672b
            float[] r5 = r4.f32060b
            float r6 = r4.f32062d
            float r6 = r6 * r10
            float r7 = r3.f31997j
            float r6 = r6 / r7
            r7 = 7
            r7 = r5[r7]
            r8 = 1
            r9 = r5[r8]
            float r7 = r7 - r9
            android.graphics.Bitmap r4 = r4.f32059a
            int r4 = r4.getHeight()
            if (r4 <= r8) goto L_0x03b7
            r4 = 1
            goto L_0x03b8
        L_0x03b7:
            r4 = 0
        L_0x03b8:
            ya0.c r8 = r1.f32590d
            r9 = 0
            r8.f32938a = r9
            ya0.c r8 = r1.f32591e
            r8.f32938a = r9
        L_0x03c1:
            boolean r8 = r54.hasNext()
            if (r8 == 0) goto L_0x06e5
            java.lang.Object r8 = r54.next()
            java.util.ArrayList r8 = (java.util.ArrayList) r8
            r9 = 0
            r10 = 0
            r11 = 0
        L_0x03d0:
            int r12 = r8.size()
            if (r9 >= r12) goto L_0x06df
            java.lang.Object r12 = r8.get(r9)
            oa0.c$a r12 = (oa0.C12961c.C12962a) r12
            double r13 = r12.f32102a
            r15 = r8
            r16 = r9
            double r8 = r0.f24175b
            double r1 = r13 - r8
            float r1 = (float) r1
            r17 = r1
            double r1 = r12.f32103b
            r18 = r6
            r19 = r7
            double r6 = r0.f24176c
            r20 = r10
            r21 = r11
            double r10 = r1 - r6
            float r10 = (float) r10
            r22 = r10
            double r10 = r0.f24177d
            double r10 = -r10
            float r10 = (float) r10
            r23 = r10
            double r10 = r12.f32104c
            double r8 = r10 - r8
            float r8 = (float) r8
            r24 = r8
            double r8 = r12.f32105d
            double r6 = r8 - r6
            float r6 = (float) r6
            r7 = 0
            r7 = r5[r7]
            r25 = 1
            r26 = r5[r25]
            r27 = 6
            r28 = r6
            r6 = r5[r27]
            r27 = 7
            r27 = r5[r27]
            r29 = 1073741824(0x40000000, float:2.0)
            if (r4 == 0) goto L_0x052c
            r30 = r4
            r31 = r5
            r4 = r52
            double[] r5 = r4.f32585g
            r32 = r15
            double[] r15 = r4.f32586h
            r17 = 0
            r5[r17] = r13
            r5[r25] = r1
            r15[r17] = r10
            r15[r25] = r8
            double r10 = r10 - r13
            double r8 = r8 - r1
            double r1 = java.lang.Math.hypot(r10, r8)
            float r1 = (float) r1
            float r10 = r20 + r1
            e0.j0 r1 = r3.f31990c
            r2 = 0
        L_0x0442:
            java.lang.Object r8 = r1.f15501b
            double[][] r8 = (double[][]) r8
            int r9 = r8.length
            if (r2 >= r9) goto L_0x04bc
            r8 = r8[r2]
            r9 = 3
            r13 = r8[r9]
            r8 = 0
            r24 = r13
        L_0x0451:
            if (r8 >= r9) goto L_0x046b
            java.lang.Object r9 = r1.f15501b
            double[][] r9 = (double[][]) r9
            r9 = r9[r2]
            r26 = r9[r8]
            r33 = r5[r8]
            double r33 = r33 * r26
            double r13 = r33 + r13
            r33 = r15[r8]
            double r26 = r26 * r33
            double r24 = r26 + r24
            int r8 = r8 + 1
            r9 = 3
            goto L_0x0451
        L_0x046b:
            r8 = r18
            float r9 = -r8
            double r3 = (double) r9
            int r9 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r9 > 0) goto L_0x0479
            int r11 = (r24 > r3 ? 1 : (r24 == r3 ? 0 : -1))
            if (r11 > 0) goto L_0x0479
            r1 = 0
            goto L_0x04bf
        L_0x0479:
            if (r9 >= 0) goto L_0x0495
            double r3 = r3 - r13
            double r24 = r24 - r13
            double r3 = r3 / r24
            r9 = 0
        L_0x0481:
            r11 = 3
            if (r9 >= r11) goto L_0x04b3
            r39 = r5[r9]
            r33 = r15[r9]
            r35 = r39
            r37 = r3
            double r13 = p379.C16530d.m42010c(r33, r35, r37, r39)
            r5[r9] = r13
            int r9 = r9 + 1
            goto L_0x0481
        L_0x0495:
            int r9 = (r24 > r3 ? 1 : (r24 == r3 ? 0 : -1))
            if (r9 >= 0) goto L_0x04b3
            double r3 = r3 - r24
            double r13 = r13 - r24
            double r3 = r3 / r13
            r9 = 0
            r11 = 3
        L_0x04a0:
            if (r9 >= r11) goto L_0x04b3
            r39 = r15[r9]
            r33 = r5[r9]
            r35 = r39
            r37 = r3
            double r13 = p379.C16530d.m42010c(r33, r35, r37, r39)
            r15[r9] = r13
            int r9 = r9 + 1
            goto L_0x04a0
        L_0x04b3:
            int r2 = r2 + 1
            r4 = r52
            r3 = r56
            r18 = r8
            goto L_0x0442
        L_0x04bc:
            r8 = r18
            r1 = 1
        L_0x04bf:
            if (r1 != 0) goto L_0x04cb
            r9 = r53
            r17 = r0
            r20 = r8
            r0 = r55
            goto L_0x05d0
        L_0x04cb:
            r1 = 0
            r1 = r5[r1]
            double r3 = r0.f24175b
            double r13 = r1 - r3
            float r9 = (float) r13
            r11 = 1
            r13 = r5[r11]
            r11 = r6
            double r5 = r0.f24176c
            r18 = r7
            r25 = r8
            double r7 = r13 - r5
            float r7 = (float) r7
            r8 = 0
            r26 = r15[r8]
            double r3 = r26 - r3
            float r8 = (float) r3
            r3 = 1
            r3 = r15[r3]
            double r3 = r3 - r5
            float r6 = (float) r3
            double r3 = r12.f32102a
            double r1 = r1 - r3
            double r3 = r12.f32103b
            double r13 = r13 - r3
            double r1 = java.lang.Math.hypot(r1, r13)
            float r1 = (float) r1
            float r1 = r1 + r10
            float r1 = r1 * r19
            float r1 = r1 / r25
            float r1 = r1 / r29
            r2 = 0
            r2 = r15[r2]
            double r4 = r12.f32102a
            double r2 = r2 - r4
            r4 = 1
            r4 = r15[r4]
            double r13 = r12.f32103b
            double r4 = r4 - r13
            double r2 = java.lang.Math.hypot(r2, r4)
            float r2 = (float) r2
            float r2 = r2 + r10
            float r2 = r2 * r19
            float r2 = r2 / r25
            float r2 = r2 / r29
            double r3 = (double) r1
            double r13 = java.lang.Math.floor(r3)
            float r5 = (float) r13
            float r27 = r2 - r5
            double r2 = java.lang.Math.floor(r3)
            float r2 = (float) r2
            float r26 = r1 - r2
            r22 = r7
            r1 = r9
            r2 = r26
            r3 = r27
            goto L_0x0543
        L_0x052c:
            r30 = r4
            r31 = r5
            r11 = r6
            r32 = r15
            r25 = r18
            r18 = r7
            r1 = r17
            r10 = r20
            r8 = r24
            r2 = r26
            r3 = r27
            r6 = r28
        L_0x0543:
            float r4 = r12.f32106e
            r5 = 1016003125(0x3c8efa35, float:0.017453292)
            float r4 = r4 * r5
            double r4 = (double) r4
            double r4 = java.lang.Math.cos(r4)
            float r4 = (float) r4
            float r5 = r12.f32106e
            r7 = 1016003125(0x3c8efa35, float:0.017453292)
            float r5 = r5 * r7
            double r13 = (double) r5
            double r13 = java.lang.Math.sin(r13)
            float r5 = (float) r13
            r7 = r25
            float r9 = -r7
            float r13 = r9 * r4
            float r14 = r13 + r1
            float r15 = r9 * r5
            r17 = r0
            float r0 = r15 + r22
            float r20 = r7 * r4
            float r1 = r20 + r1
            float r24 = r7 * r5
            r25 = r4
            float r4 = r24 + r22
            float r13 = r13 + r8
            float r15 = r15 + r6
            r22 = r5
            float r5 = r20 + r8
            r20 = r7
            float r7 = r24 + r6
            r24 = r9
            r26 = r10
            r9 = r53
            ya0.c r10 = r9.f32590d
            r27 = r11
            r11 = r23
            r10.mo40141b(r14, r0, r11)
            ya0.c r0 = r9.f32591e
            r10 = r18
            r0.mo40140a(r10, r2)
            ya0.c r0 = r9.f32590d
            r0.mo40141b(r1, r4, r11)
            ya0.c r0 = r9.f32591e
            r14 = r27
            r0.mo40140a(r14, r2)
            ya0.c r0 = r9.f32590d
            r0.mo40141b(r13, r15, r11)
            ya0.c r0 = r9.f32591e
            r0.mo40140a(r10, r3)
            ya0.c r0 = r9.f32590d
            r0.mo40141b(r1, r4, r11)
            ya0.c r0 = r9.f32591e
            r0.mo40140a(r14, r2)
            ya0.c r0 = r9.f32590d
            r0.mo40141b(r5, r7, r11)
            ya0.c r0 = r9.f32591e
            r0.mo40140a(r14, r3)
            ya0.c r0 = r9.f32590d
            r0.mo40141b(r13, r15, r11)
            ya0.c r0 = r9.f32591e
            r0.mo40140a(r10, r3)
            r0 = r55
            int r1 = r0.f32674d
            if (r1 != 0) goto L_0x05d4
            r10 = r26
        L_0x05d0:
            r11 = r21
            goto L_0x06c9
        L_0x05d4:
            if (r21 != 0) goto L_0x05d8
            r1 = r12
            goto L_0x05da
        L_0x05d8:
            r1 = r21
        L_0x05da:
            double r4 = r12.f32104c
            r7 = r3
            double r2 = r1.f32102a
            int r13 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r13 != 0) goto L_0x05ef
            double r2 = r12.f32105d
            double r4 = r1.f32103b
            int r13 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r13 != 0) goto L_0x05ef
            r2 = 0
            r3 = r32
            goto L_0x0604
        L_0x05ef:
            int r2 = r16 + 1
            int r3 = r32.size()
            if (r2 >= r3) goto L_0x06c6
            r3 = r32
            java.lang.Object r2 = r3.get(r2)
            oa0.c$a r2 = (oa0.C12961c.C12962a) r2
            r51 = r2
            r2 = r1
            r1 = r51
        L_0x0604:
            float r4 = r1.f32106e
            float r5 = r12.f32106e
            float r4 = r4 - r5
            r5 = 1135869952(0x43b40000, float:360.0)
            float r4 = r4 + r5
            float r4 = r4 % r5
            r12 = 1127481344(0x43340000, float:180.0)
            int r12 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r12 < 0) goto L_0x0615
            float r4 = r4 - r5
            goto L_0x0617
        L_0x0615:
            r24 = r20
        L_0x0617:
            int r5 = r0.f32674d
            r12 = 2
            if (r5 != r12) goto L_0x0632
            float r5 = java.lang.Math.abs(r4)
            na0.l r12 = r0.f32672b
            float r12 = r12.f32062d
            float r5 = r5 * r12
            r12 = 878100373(0x3456bf95, float:2.0E-7)
            float r5 = r5 * r12
            double r12 = (double) r5
            double r12 = java.lang.Math.ceil(r12)
            int r5 = (int) r12
            goto L_0x063d
        L_0x0632:
            r12 = 1
            if (r5 != r12) goto L_0x063c
            r5 = 0
            int r5 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r5 == 0) goto L_0x063c
            r5 = 1
            goto L_0x063d
        L_0x063c:
            r5 = 0
        L_0x063d:
            r12 = 0
        L_0x063e:
            if (r12 >= r5) goto L_0x06c2
            float r13 = r1.f32106e
            int r15 = r5 + -1
            int r15 = r15 - r12
            float r15 = (float) r15
            float r15 = r15 * r4
            float r0 = (float) r5
            float r15 = r15 / r0
            float r13 = r13 - r15
            r0 = 1016003125(0x3c8efa35, float:0.017453292)
            float r13 = r13 * r0
            r15 = r1
            double r0 = (double) r13
            r13 = r2
            r32 = r3
            double r2 = java.lang.Math.cos(r0)
            float r2 = (float) r2
            double r0 = java.lang.Math.sin(r0)
            float r0 = (float) r0
            float r25 = r25 * r24
            float r1 = r25 + r8
            float r22 = r22 * r24
            float r3 = r22 + r6
            float r18 = r24 * r2
            r21 = r2
            float r2 = r18 + r8
            float r18 = r24 * r0
            r22 = r0
            float r0 = r18 + r6
            r18 = 0
            int r18 = (r24 > r18 ? 1 : (r24 == r18 ? 0 : -1))
            if (r18 <= 0) goto L_0x0690
            r18 = r4
            ya0.c r4 = r9.f32590d
            r4.mo40141b(r1, r3, r11)
            ya0.c r1 = r9.f32591e
            r1.mo40140a(r14, r7)
            ya0.c r1 = r9.f32590d
            r1.mo40141b(r2, r0, r11)
            ya0.c r0 = r9.f32591e
            r0.mo40140a(r14, r7)
            goto L_0x06a6
        L_0x0690:
            r18 = r4
            ya0.c r4 = r9.f32590d
            r4.mo40141b(r2, r0, r11)
            ya0.c r0 = r9.f32591e
            r0.mo40140a(r14, r7)
            ya0.c r0 = r9.f32590d
            r0.mo40141b(r1, r3, r11)
            ya0.c r0 = r9.f32591e
            r0.mo40140a(r14, r7)
        L_0x06a6:
            ya0.c r0 = r9.f32590d
            r0.mo40141b(r8, r6, r11)
            ya0.c r0 = r9.f32591e
            float r1 = r10 + r14
            float r1 = r1 / r29
            r0.mo40140a(r1, r7)
            int r12 = r12 + 1
            r0 = r55
            r2 = r13
            r1 = r15
            r4 = r18
            r25 = r21
            r3 = r32
            goto L_0x063e
        L_0x06c2:
            r13 = r2
            r32 = r3
            r1 = r13
        L_0x06c6:
            r11 = r1
            r10 = r26
        L_0x06c9:
            int r0 = r16 + 1
            r2 = r55
            r3 = r56
            r1 = r9
            r7 = r19
            r6 = r20
            r4 = r30
            r5 = r31
            r8 = r32
            r9 = r0
            r0 = r17
            goto L_0x03d0
        L_0x06df:
            r2 = r55
            r3 = r56
            goto L_0x03c1
        L_0x06e5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ta0.C13122a.mo40036h(ta0.a$a, ta0.a$b, ua0.c, na0.b):void");
    }
}
