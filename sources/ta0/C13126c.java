package ta0;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.nutiteq.cache.TextureInfoCache;
import com.nutiteq.components.MapPos;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import javax.microedition.khronos.opengles.GL10;
import mf0.C24361g;
import na0.C12923b;
import na0.C12924c;
import na0.C12934k;
import na0.C12935l;
import na0.C12936m;
import oa0.C12964d;
import oa0.C12974i;
import sa0.C13100i;
import ua0.C13148d;
import ya0.C13274a;
import ya0.C13276c;
import ya0.C13277d;
import za0.C13356c;

/* renamed from: ta0.c */
public final class C13126c implements C13131g {

    /* renamed from: a */
    public final C13356c f32596a;

    /* renamed from: b */
    public final TextureInfoCache f32597b;

    /* renamed from: c */
    public final C13127a f32598c = new C13127a();

    /* renamed from: d */
    public C12964d[] f32599d = new C12964d[0];

    /* renamed from: e */
    public ArrayList<C12964d> f32600e = new ArrayList<>();

    /* renamed from: f */
    public C13276c f32601f = new C13276c();

    /* renamed from: g */
    public C13276c f32602g = new C13276c();

    /* renamed from: h */
    public C13274a f32603h = new C13274a();

    /* renamed from: i */
    public byte[] f32604i = new byte[4];

    /* renamed from: j */
    public float[] f32605j = new float[4];

    /* renamed from: k */
    public int[] f32606k = new int[0];

    /* renamed from: ta0.c$a */
    public static class C13127a implements Comparator<C12964d> {

        /* renamed from: b */
        public C12923b f32607b;

        public final int compare(Object obj, Object obj2) {
            int i;
            C12964d dVar = (C12964d) obj;
            C12964d dVar2 = (C12964d) obj2;
            int i2 = dVar.f32110i;
            int i3 = dVar2.f32110i;
            if (i2 < i3) {
                i = -1;
            } else if (i3 < i2) {
                i = 1;
            } else {
                double[] dArr = this.f32607b.f31993f;
                MapPos mapPos = ((C12964d.C12965a) dVar.f32125e).f32098d;
                MapPos mapPos2 = ((C12964d.C12965a) dVar2.f32125e).f32098d;
                double d = mapPos.f24175b;
                double d2 = dArr[3];
                double d3 = mapPos.f24176c;
                double d4 = dArr[7];
                double d5 = (d3 * d4) + (d * d2);
                double d6 = mapPos.f24177d;
                double d7 = dArr[11];
                double d8 = (d6 * d7) + d5;
                double d9 = dArr[15];
                double d11 = mapPos2.f24175b * d2;
                double d12 = -((d8 + d9) - (((mapPos2.f24177d * d7) + ((mapPos2.f24176c * d4) + d11)) + d9));
                if (d12 == 0.0d) {
                    return 0;
                }
                if (d12 < 0.0d) {
                    return -1;
                }
                return 1;
            }
            return i;
        }
    }

    public C13126c(C13356c cVar, TextureInfoCache textureInfoCache) {
        this.f32596a = cVar;
        this.f32597b = textureInfoCache;
    }

    /* renamed from: a */
    public final boolean mo40029a() {
        return true;
    }

    /* renamed from: b */
    public final boolean mo40030b() {
        return this.f32596a.f33139g;
    }

    /* renamed from: c */
    public final void mo40031c(GL10 gl10) {
    }

    /* JADX WARNING: type inference failed for: r4v6, types: [ua0.g] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo40032d(javax.microedition.khronos.opengles.GL10 r12, na0.C12923b r13) {
        /*
            r11 = this;
            za0.c r0 = r11.f32596a
            java.util.ArrayList r0 = r0.f33149f
            if (r0 != 0) goto L_0x0007
            return
        L_0x0007:
            r11.mo40039i(r0, r13)     // Catch:{ all -> 0x000b }
            goto L_0x000f
        L_0x000b:
            r0 = move-exception
            r0.printStackTrace()
        L_0x000f:
            r0 = 0
            oa0.d[] r1 = r11.f32599d
            int r2 = r1.length
            r3 = 0
            r7 = r0
        L_0x0015:
            if (r3 >= r2) goto L_0x0049
            r0 = r1[r3]
            oa0.i$a r4 = r0.f32125e
            oa0.d$a r4 = (oa0.C12964d.C12965a) r4
            boolean r4 = r4.f32100f
            if (r4 != 0) goto L_0x0022
            goto L_0x0046
        L_0x0022:
            oa0.i$a r4 = r0.f32125e
            oa0.d$a r4 = (oa0.C12964d.C12965a) r4
            ua0.g r4 = r4.f32128b
            r10 = r4
            ua0.d r10 = (ua0.C13148d) r10
            if (r10 != 0) goto L_0x002e
            goto L_0x0046
        L_0x002e:
            if (r7 == r10) goto L_0x0040
            if (r7 == 0) goto L_0x0040
            java.util.ArrayList<oa0.d> r6 = r11.f32600e
            r9 = 0
            r4 = r11
            r5 = r12
            r8 = r13
            r4.mo40038h(r5, r6, r7, r8, r9)
            java.util.ArrayList<oa0.d> r4 = r11.f32600e
            r4.clear()
        L_0x0040:
            java.util.ArrayList<oa0.d> r4 = r11.f32600e
            r4.add(r0)
            r7 = r10
        L_0x0046:
            int r3 = r3 + 1
            goto L_0x0015
        L_0x0049:
            if (r7 == 0) goto L_0x0059
            java.util.ArrayList<oa0.d> r6 = r11.f32600e
            r9 = 0
            r4 = r11
            r5 = r12
            r8 = r13
            r4.mo40038h(r5, r6, r7, r8, r9)
            java.util.ArrayList<oa0.d> r13 = r11.f32600e
            r13.clear()
        L_0x0059:
            r13 = 1065353216(0x3f800000, float:1.0)
            r12.glColor4f(r13, r13, r13, r13)
            r13 = 32888(0x8078, float:4.6086E-41)
            r12.glDisableClientState(r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ta0.C13126c.mo40032d(javax.microedition.khronos.opengles.GL10, na0.b):void");
    }

    /* renamed from: e */
    public final void mo40033e(GL10 gl10) {
    }

    /* JADX WARNING: type inference failed for: r4v6, types: [ua0.g] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo40034f(javax.microedition.khronos.opengles.GL10 r12, na0.C12923b r13, sa0.C13100i r14) {
        /*
            r11 = this;
            za0.c r0 = r11.f32596a
            java.util.ArrayList r0 = r0.f33149f
            if (r0 != 0) goto L_0x0007
            return
        L_0x0007:
            r11.mo40039i(r0, r13)
            r0 = 0
            oa0.d[] r1 = r11.f32599d
            int r2 = r1.length
            r3 = 0
            r7 = r0
        L_0x0010:
            if (r3 >= r2) goto L_0x0044
            r0 = r1[r3]
            oa0.i$a r4 = r0.f32125e
            oa0.d$a r4 = (oa0.C12964d.C12965a) r4
            boolean r4 = r4.f32100f
            if (r4 != 0) goto L_0x001d
            goto L_0x0041
        L_0x001d:
            oa0.i$a r4 = r0.f32125e
            oa0.d$a r4 = (oa0.C12964d.C12965a) r4
            ua0.g r4 = r4.f32128b
            r10 = r4
            ua0.d r10 = (ua0.C13148d) r10
            if (r10 != 0) goto L_0x0029
            goto L_0x0041
        L_0x0029:
            if (r7 == r10) goto L_0x003b
            if (r7 == 0) goto L_0x003b
            java.util.ArrayList<oa0.d> r6 = r11.f32600e
            r4 = r11
            r5 = r12
            r8 = r13
            r9 = r14
            r4.mo40038h(r5, r6, r7, r8, r9)
            java.util.ArrayList<oa0.d> r4 = r11.f32600e
            r4.clear()
        L_0x003b:
            java.util.ArrayList<oa0.d> r4 = r11.f32600e
            r4.add(r0)
            r7 = r10
        L_0x0041:
            int r3 = r3 + 1
            goto L_0x0010
        L_0x0044:
            if (r7 == 0) goto L_0x0054
            java.util.ArrayList<oa0.d> r6 = r11.f32600e
            r4 = r11
            r5 = r12
            r8 = r13
            r9 = r14
            r4.mo40038h(r5, r6, r7, r8, r9)
            java.util.ArrayList<oa0.d> r13 = r11.f32600e
            r13.clear()
        L_0x0054:
            r13 = 1065353216(0x3f800000, float:1.0)
            r12.glColor4f(r13, r13, r13, r13)
            r13 = 32888(0x8078, float:4.6086E-41)
            r12.glDisableClientState(r13)
            r13 = 32886(0x8076, float:4.6083E-41)
            r12.glDisableClientState(r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ta0.C13126c.mo40034f(javax.microedition.khronos.opengles.GL10, na0.b, sa0.i):void");
    }

    /* renamed from: g */
    public final MapPos mo40035g(C12974i iVar, C12923b bVar, MapPos mapPos) {
        C12974i iVar2 = iVar;
        C12923b bVar2 = bVar;
        if (iVar2 instanceof C12964d) {
            C12964d dVar = (C12964d) iVar2;
            C13148d dVar2 = (C13148d) ((C12964d.C12965a) dVar.f32125e).f32128b;
            if (dVar2 != null) {
                float f = dVar2.f32685f.f32063e / bVar2.f31997j;
                MapPos mapPos2 = ((C12964d.C12965a) dVar.f32125e).f32098d;
                double d = mapPos2.f24175b;
                C12936m mVar = bVar2.f31989b;
                double cos = (double) (((float) Math.cos((double) (bVar2.f31995h * 0.017453292f))) * f);
                return new MapPos((mVar.f32066a * cos) + d, (mVar.f32067b * cos) + mapPos2.f24176c, (Math.sin((double) (bVar2.f31995h * 0.017453292f)) * ((double) f)) + ((double) BitmapDescriptorFactory.HUE_RED));
            }
        }
        return mapPos;
    }

    /* renamed from: h */
    public final void mo40038h(GL10 gl10, ArrayList arrayList, C13148d dVar, C12923b bVar, C13100i iVar) {
        float f;
        float f2;
        C12935l lVar;
        float f3;
        int i;
        C13126c cVar;
        int i2;
        float f4;
        float f5;
        C12935l lVar2;
        GL10 gl102;
        int i3;
        C13126c cVar2;
        C13126c cVar3 = this;
        GL10 gl103 = gl10;
        C13148d dVar2 = dVar;
        C12923b bVar2 = bVar;
        C13100i iVar2 = iVar;
        if (dVar2.f32645e == 0) {
            MapPos mapPos = bVar2.f31988a;
            if (iVar2 == null) {
                f5 = dVar2.f32642b;
                f4 = dVar2.f32643c;
            } else {
                C12935l lVar3 = dVar2.f32685f;
                C12935l lVar4 = dVar2.f32686g;
                float f6 = lVar4.f32063e / lVar3.f32063e;
                f5 = dVar2.f32642b / (lVar4.f32062d / lVar3.f32062d);
                f4 = dVar2.f32643c / f6;
            }
            if (iVar2 != null) {
                lVar2 = dVar2.f32686g;
            } else {
                lVar2 = dVar2.f32685f;
            }
            float f7 = lVar2.f32062d;
            float f8 = (f5 * f7 * 0.5f) + BitmapDescriptorFactory.HUE_RED;
            float f9 = bVar2.f31997j;
            float f11 = f8 / f9;
            float f12 = lVar2.f32063e;
            float f13 = (((f4 * f12) * 0.5f) + BitmapDescriptorFactory.HUE_RED) / f9;
            float f14 = (f7 * 0.5f) / f9;
            float f15 = (f12 * 0.5f) / f9;
            float[] fArr = lVar2.f32060b;
            float f16 = fArr[0];
            float f17 = fArr[1];
            float f18 = fArr[2];
            float f19 = fArr[3];
            C12935l lVar5 = lVar2;
            float f21 = fArr[4];
            float f22 = fArr[5];
            float f23 = fArr[6];
            float f24 = fArr[7];
            float f25 = f22;
            float cos = (float) Math.cos((double) ((-bVar2.f31995h) * 0.017453292f));
            float f26 = f18;
            float f27 = f21;
            float sin = (float) Math.sin((double) ((-bVar2.f31995h) * 0.017453292f));
            float cos2 = (float) Math.cos((double) ((-bVar2.f31994g) * 0.017453292f));
            float f28 = f23;
            float sin2 = (float) Math.sin((double) ((-bVar2.f31994g) * 0.017453292f));
            float f29 = cos * sin2;
            float f31 = -sin2;
            float f32 = cos * cos2;
            float f33 = -sin;
            float f34 = f28;
            C13276c cVar4 = cVar3.f32601f;
            float f35 = f24;
            C13276c cVar5 = cVar3.f32602g;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C12964d dVar3 = (C12964d) it.next();
                float f36 = f19;
                MapPos mapPos2 = ((C12964d.C12965a) dVar3.f32125e).f32098d;
                C12964d dVar4 = dVar3;
                float f37 = f32;
                float f38 = f33;
                float f39 = f31;
                float f41 = (float) (mapPos2.f24175b - mapPos.f24175b);
                double d = mapPos2.f24176c;
                float f42 = f29;
                float f43 = (float) (d - mapPos.f24176c);
                float f44 = (float) (((double) BitmapDescriptorFactory.HUE_RED) - mapPos.f24177d);
                float f45 = (-f14) + f11;
                float f46 = (-f15) + f13;
                float f47 = f45 * cos2;
                float f48 = f46 * f42;
                MapPos mapPos3 = mapPos;
                float f49 = f47 + f48 + f41;
                float f51 = f45 * f39;
                float f52 = f46 * f37;
                float f53 = f17;
                float f54 = f51 + f52 + f43;
                float f55 = f45 * BitmapDescriptorFactory.HUE_RED;
                float f56 = f46 * f38;
                float f57 = f16;
                float f58 = f55 + f56 + f44;
                float f59 = f14 + f11;
                float f61 = f59 * cos2;
                float f62 = f11;
                float f63 = f61 + f48 + f41;
                float f64 = f59 * f39;
                float f65 = cos2;
                float f66 = f64 + f52 + f43;
                float f67 = f59 * BitmapDescriptorFactory.HUE_RED;
                float f68 = f67 + f56 + f44;
                float f69 = f15 + f13;
                float f71 = f69 * f42;
                float f72 = f47 + f71 + f41;
                float f73 = f69 * f37;
                float f74 = f42;
                float f75 = f51 + f73 + f43;
                float f76 = f69 * f38;
                float f77 = f55 + f76 + f44;
                float f78 = f15;
                cVar4.mo40141b(f49, f54, f58);
                cVar5.mo40140a(f57, f53);
                cVar4.mo40141b(f63, f66, f68);
                float f79 = f26;
                float f81 = f36;
                cVar5.mo40140a(f79, f81);
                cVar4.mo40141b(f72, f75, f77);
                float f82 = f27;
                float f83 = f25;
                float f84 = f13;
                float f85 = f83;
                cVar5.mo40140a(f82, f85);
                cVar4.mo40141b(f63, f66, f68);
                cVar5.mo40140a(f79, f81);
                cVar4.mo40141b(f61 + f71 + f41, f64 + f73 + f43, f67 + f76 + f44);
                float f86 = f34;
                float f87 = f35;
                cVar5.mo40140a(f86, f87);
                cVar4.mo40141b(f72, f75, f77);
                cVar5.mo40140a(f82, f85);
                float f88 = f86;
                C13100i iVar3 = iVar;
                if (iVar3 != null) {
                    cVar2 = this;
                    C24361g.m61136F(iVar3.mo39991a(dVar4), cVar2.f32604i);
                    int i4 = 0;
                    while (i4 < 6) {
                        C13274a aVar = cVar2.f32603h;
                        byte[] bArr = cVar2.f32604i;
                        aVar.mo40138a(bArr[0], bArr[1], bArr[2], bArr[3]);
                        i4++;
                        f88 = f88;
                        f87 = f87;
                    }
                } else {
                    cVar2 = this;
                }
                f35 = f87;
                f34 = f88;
                cVar3 = cVar2;
                f19 = f81;
                f27 = f82;
                f26 = f79;
                f32 = f37;
                f31 = f39;
                f33 = f38;
                f15 = f78;
                mapPos = mapPos3;
                f17 = f53;
                f16 = f57;
                f11 = f62;
                cos2 = f65;
                f29 = f74;
                float f89 = f84;
                f25 = f85;
                f13 = f89;
            }
            C13126c cVar6 = cVar3;
            C13100i iVar4 = iVar;
            if (iVar4 == null) {
                C12924c cVar7 = dVar.f32693a;
                float f91 = cVar7.f31998a;
                float f92 = cVar7.f32001d;
                gl102 = gl10;
                gl102.glColor4f(f91 * f92, cVar7.f31999b * f92, cVar7.f32000c * f92, f92);
                gl102.glEnable(3553);
                gl102.glBindTexture(3553, cVar6.f32597b.mo24910a(gl102, lVar5));
            } else {
                gl102 = gl10;
                gl102.glEnable(3553);
                gl102.glBindTexture(3553, cVar6.f32597b.mo24910a(gl102, lVar5));
                gl102.glTexParameterx(3553, 10241, 9728);
                gl102.glTexParameterx(3553, 10240, 9728);
            }
            FloatBuffer floatBuffer = C13277d.f32942a;
            int i5 = 0;
            while (true) {
                int i6 = cVar4.f32938a / 3;
                if (i5 < i6) {
                    int min = Math.min(65535, i6 - i5);
                    gl102.glVertexPointer(3, 5126, 0, cVar4.mo40142c(i5 * 3, min * 3));
                    gl102.glEnableClientState(32884);
                    gl102.glTexCoordPointer(2, 5126, 0, cVar5.mo40142c(i5 * 2, min * 2));
                    gl102.glEnableClientState(32888);
                    if (iVar4 != null) {
                        i3 = 4;
                        gl102.glColorPointer(4, 5121, 0, cVar6.f32603h.mo40139b(i5 * 4, min * 4));
                        gl102.glEnableClientState(32886);
                    } else {
                        i3 = 4;
                        gl102.glDisableClientState(32886);
                    }
                    gl102.glDrawArrays(i3, 0, min);
                    i5 += 65535;
                } else {
                    cVar4.f32938a = 0;
                    cVar5.f32938a = 0;
                    cVar6.f32603h.f32930a = 0;
                    return;
                }
            }
        } else {
            GL10 gl104 = gl103;
            C13148d dVar5 = dVar2;
            C13100i iVar5 = iVar2;
            C13126c cVar8 = cVar3;
            C13100i iVar6 = iVar5;
            MapPos mapPos4 = bVar2.f31988a;
            if (iVar6 == null) {
                f2 = dVar5.f32642b;
                f = dVar5.f32643c;
            } else {
                C12935l lVar6 = dVar5.f32685f;
                C12935l lVar7 = dVar5.f32686g;
                float f93 = lVar7.f32063e / lVar6.f32063e;
                f2 = dVar5.f32642b / (lVar7.f32062d / lVar6.f32062d);
                f = dVar5.f32643c / f93;
            }
            if (iVar6 != null) {
                lVar = dVar5.f32686g;
            } else {
                lVar = dVar5.f32685f;
            }
            float f94 = (f2 * lVar.f32062d * 0.5f) + BitmapDescriptorFactory.HUE_RED;
            float f95 = bVar2.f31997j;
            float f96 = f94 / f95;
            float f97 = (((f * lVar.f32063e) * 0.5f) + BitmapDescriptorFactory.HUE_RED) / f95;
            if (iVar6 == null) {
                C12924c cVar9 = dVar5.f32693a;
                float f98 = cVar9.f31998a;
                float f99 = cVar9.f32001d;
                gl104.glColor4f(f98 * f99, cVar9.f31999b * f99, cVar9.f32000c * f99, f99);
                gl104.glEnable(3553);
                gl104.glBindTexture(3553, cVar8.f32597b.mo24910a(gl104, lVar));
            } else {
                gl104.glEnable(3553);
                gl104.glBindTexture(3553, cVar8.f32597b.mo24910a(gl104, lVar));
                gl104.glTexParameterx(3553, 10241, 9728);
                gl104.glTexParameterx(3553, 10240, 9728);
            }
            gl104.glEnableClientState(32888);
            gl104.glDisableClientState(32886);
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                C12964d dVar6 = (C12964d) it2.next();
                MapPos mapPos5 = ((C12964d.C12965a) dVar6.f32125e).f32098d;
                gl10.glPushMatrix();
                double d2 = mapPos5.f24176c;
                C12935l lVar8 = lVar;
                Iterator it3 = it2;
                float f100 = f96;
                gl104.glTranslatef((float) (mapPos5.f24175b - mapPos4.f24175b), (float) (d2 - mapPos4.f24176c), (float) (((double) BitmapDescriptorFactory.HUE_RED) - mapPos4.f24177d));
                int i7 = dVar5.f32645e;
                if (i7 == 0) {
                    f3 = BitmapDescriptorFactory.HUE_RED;
                    gl104.glRotatef(((C12964d.C12965a) dVar6.f32125e).f32099e + bVar2.f31994g, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f);
                    gl104.glRotatef(bVar2.f31995h, 1.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
                } else if (i7 == 1) {
                    f3 = BitmapDescriptorFactory.HUE_RED;
                    gl104.glRotatef(((C12964d.C12965a) dVar6.f32125e).f32099e + bVar2.f31994g, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f);
                } else if (i7 != 2) {
                    f3 = BitmapDescriptorFactory.HUE_RED;
                } else {
                    float f101 = ((C12964d.C12965a) dVar6.f32125e).f32099e;
                    f3 = BitmapDescriptorFactory.HUE_RED;
                    gl104.glRotatef(f101, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f);
                }
                gl104.glTranslatef(f100, f97, f3);
                C12935l lVar9 = lVar8;
                float f102 = lVar9.f32062d;
                float f103 = bVar2.f31997j;
                gl104.glScalef(f102 / f103, lVar9.f32063e / f103, 1.0f);
                if (iVar6 != null) {
                    int a = iVar6.mo39991a(dVar6);
                    cVar = this;
                    float[] fArr2 = cVar.f32605j;
                    fArr2[3] = 1.0f;
                    fArr2[2] = ((float) Math.round(((float) (a & 31)) * 8.225806f)) / 255.0f;
                    fArr2[1] = ((float) Math.round(((float) ((a >> 5) & 63)) * 4.047619f)) / 255.0f;
                    i2 = 0;
                    fArr2[0] = ((float) Math.round(((float) ((a >> 11) & 31)) * 8.225806f)) / 255.0f;
                    float[] fArr3 = cVar.f32605j;
                    i = 2;
                    gl104.glColor4f(fArr3[0], fArr3[1], fArr3[2], fArr3[3]);
                } else {
                    cVar = this;
                    i2 = 0;
                    i = 2;
                }
                gl104.glTexCoordPointer(i, 5126, i2, lVar9.f32061c);
                FloatBuffer floatBuffer2 = C13277d.f32942a;
                gl104.glEnableClientState(32884);
                gl104.glVertexPointer(3, 5126, i2, C13277d.f32942a);
                gl104.glDrawArrays(5, i2, 4);
                gl10.glPopMatrix();
                lVar = lVar9;
                f96 = f100;
                cVar8 = cVar;
                it2 = it3;
            }
            C13126c cVar10 = cVar8;
        }
    }

    /* renamed from: i */
    public final void mo40039i(ArrayList arrayList, C12923b bVar) {
        int size = arrayList.size();
        if (this.f32599d.length != size) {
            this.f32599d = new C12964d[size];
        }
        if (size != 0) {
            C12934k kVar = this.f32596a.f32172c.f32010h.f32017b;
            if (kVar.f32058b - kVar.f32057a == BitmapDescriptorFactory.HUE_RED) {
                if (size > this.f32606k.length) {
                    this.f32606k = new int[size];
                }
                for (int i = 0; i < size; i++) {
                    this.f32606k[i] = ((C12964d) arrayList.get(i)).f32110i;
                }
                Arrays.sort(this.f32606k, 0, size);
                int i2 = 0;
                while (i2 < size) {
                    for (int i3 = 0; i3 < size && i2 < size; i3++) {
                        C12964d dVar = (C12964d) arrayList.get(i3);
                        if (dVar.f32110i == this.f32606k[i2]) {
                            this.f32599d[i2] = dVar;
                            i2++;
                        }
                    }
                }
                return;
            }
            arrayList.toArray(this.f32599d);
            C13127a aVar = this.f32598c;
            aVar.f32607b = bVar;
            Arrays.sort(this.f32599d, aVar);
        }
    }
}
