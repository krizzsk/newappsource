package ta0;

import com.nutiteq.components.MapPos;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.microedition.khronos.opengles.GL10;
import na0.C12923b;
import na0.C12935l;
import oa0.C12972h;
import oa0.C12974i;
import sa0.C13100i;
import ua0.C13157i;
import ya0.C13277d;
import za0.C13359e;

/* renamed from: ta0.f */
public final class C13130f implements C13131g {

    /* renamed from: a */
    public final C13359e f32620a;

    /* renamed from: b */
    public ArrayList f32621b = new ArrayList();

    /* renamed from: c */
    public Map<C12935l, Integer> f32622c = new HashMap();

    /* renamed from: d */
    public Map<C12935l, Integer> f32623d = new HashMap();

    /* renamed from: e */
    public boolean f32624e = false;

    public C13130f(C13359e eVar) {
        this.f32620a = eVar;
    }

    /* renamed from: a */
    public final boolean mo40029a() {
        return this.f32624e;
    }

    /* renamed from: b */
    public final boolean mo40030b() {
        return this.f32620a.f33139g;
    }

    /* renamed from: c */
    public final void mo40031c(GL10 gl10) {
        ArrayList<C12972h> arrayList;
        C12935l lVar;
        int i;
        C13359e eVar = this.f32620a;
        if (eVar.f32171b) {
            arrayList = eVar.f33149f;
        } else {
            arrayList = null;
        }
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        Map<C12935l, Integer> map = this.f32623d;
        this.f32623d = this.f32622c;
        this.f32622c = map;
        this.f32624e = true;
        System.currentTimeMillis();
        this.f32620a.getClass();
        int i2 = 0;
        for (C12972h hVar : arrayList) {
            if (((C12972h.C12973a) hVar.f32125e).f32128b != null && ((C12972h.C12973a) hVar.f32125e).f32100f) {
                C12972h.C12973a aVar = (C12972h.C12973a) hVar.f32125e;
                synchronized (aVar) {
                    C13157i iVar = (C13157i) aVar.f32128b;
                    if (iVar == null) {
                        lVar = null;
                    } else {
                        lVar = aVar.f32120j;
                        if (lVar == null) {
                            lVar = C12972h.m32830j(aVar.f32117g, iVar);
                            aVar.f32120j = lVar;
                        }
                    }
                }
                Integer num = this.f32623d.get(lVar);
                if (num != null) {
                    i = num.intValue();
                } else if (i2 >= 4) {
                    this.f32624e = false;
                } else {
                    synchronized (lVar) {
                        i = C13277d.m33403a(gl10, lVar.f32059a);
                    }
                    gl10.glTexParameterx(3553, 10242, 33071);
                    gl10.glTexParameterx(3553, 10243, 33071);
                    i2++;
                }
                this.f32622c.put(lVar, Integer.valueOf(i));
            }
        }
        for (Map.Entry next : this.f32623d.entrySet()) {
            int intValue = ((Integer) next.getValue()).intValue();
            if (!this.f32622c.containsKey((C12935l) next.getKey())) {
                C13277d.m33406d(gl10, intValue);
            }
        }
        this.f32623d.clear();
        this.f32621b = arrayList;
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0102  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo40032d(javax.microedition.khronos.opengles.GL10 r17, na0.C12923b r18) {
        /*
            r16 = this;
            r1 = r16
            r0 = r17
            r2 = r18
            r3 = 1065353216(0x3f800000, float:1.0)
            r0.glColor4f(r3, r3, r3, r3)
            r4 = 3553(0xde1, float:4.979E-42)
            r0.glEnable(r4)
            r5 = 32888(0x8078, float:4.6086E-41)
            r0.glEnableClientState(r5)
            com.nutiteq.components.MapPos r6 = r2.f31988a
            java.lang.System.currentTimeMillis()
            za0.e r7 = r1.f32620a
            r7.getClass()
            java.util.ArrayList r7 = r1.f32621b
            java.util.Iterator r7 = r7.iterator()
        L_0x0026:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x014f
            java.lang.Object r8 = r7.next()
            oa0.h r8 = (oa0.C12972h) r8
            oa0.i$a r9 = r8.f32125e
            oa0.h$a r9 = (oa0.C12972h.C12973a) r9
            ua0.g r9 = r9.f32128b
            ua0.i r9 = (ua0.C13157i) r9
            if (r9 != 0) goto L_0x003d
            goto L_0x0026
        L_0x003d:
            oa0.i$a r10 = r8.f32125e
            oa0.h$a r10 = (oa0.C12972h.C12973a) r10
            monitor-enter(r10)
            ua0.g r11 = r10.f32128b     // Catch:{ all -> 0x014c }
            ua0.i r11 = (ua0.C13157i) r11     // Catch:{ all -> 0x014c }
            if (r11 != 0) goto L_0x004b
            r11 = 0
            monitor-exit(r10)
            goto L_0x005a
        L_0x004b:
            na0.l r12 = r10.f32120j     // Catch:{ all -> 0x014c }
            if (r12 != 0) goto L_0x0058
            java.lang.String r12 = r10.f32117g     // Catch:{ all -> 0x014c }
            na0.l r11 = oa0.C12972h.m32830j(r12, r11)     // Catch:{ all -> 0x014c }
            r10.f32120j = r11     // Catch:{ all -> 0x014c }
            goto L_0x0059
        L_0x0058:
            r11 = r12
        L_0x0059:
            monitor-exit(r10)
        L_0x005a:
            if (r11 != 0) goto L_0x005d
            goto L_0x0026
        L_0x005d:
            java.util.Map<na0.l, java.lang.Integer> r10 = r1.f32622c
            java.lang.Object r10 = r10.get(r11)
            java.lang.Integer r10 = (java.lang.Integer) r10
            if (r10 != 0) goto L_0x0068
            goto L_0x0026
        L_0x0068:
            oa0.i$a r12 = r8.f32125e
            oa0.h$a r12 = (oa0.C12972h.C12973a) r12
            com.nutiteq.components.MapPos r12 = r12.f32098d
            float r13 = r2.f31994g
            oa0.i$a r14 = r8.f32125e
            oa0.h$a r14 = (oa0.C12972h.C12973a) r14
            float r14 = r14.f32099e
            float r13 = r13 - r14
            r14 = 1135869952(0x43b40000, float:360.0)
            float r13 = r13 + r14
            float r13 = r13 % r14
            r17.glPushMatrix()
            double r14 = r12.f24175b
            double r4 = r6.f24175b
            double r14 = r14 - r4
            float r4 = (float) r14
            double r14 = r12.f24176c
            r12 = r4
            double r3 = r6.f24176c
            double r14 = r14 - r3
            float r3 = (float) r14
            r4 = 0
            double r14 = (double) r4
            double r4 = r6.f24177d
            double r14 = r14 - r4
            float r4 = (float) r14
            r0.glTranslatef(r12, r3, r4)
            int r3 = r9.f32645e
            r4 = 2
            r12 = 0
            if (r3 == 0) goto L_0x00d9
            r5 = 1
            if (r3 == r5) goto L_0x00c9
            if (r3 == r4) goto L_0x00a1
            r3 = 0
            goto L_0x00ed
        L_0x00a1:
            r3 = 1119092736(0x42b40000, float:90.0)
            int r3 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r3 <= 0) goto L_0x00ae
            r3 = 1132920832(0x43870000, float:270.0)
            int r3 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r3 >= 0) goto L_0x00ae
            goto L_0x00af
        L_0x00ae:
            r5 = 0
        L_0x00af:
            if (r5 == 0) goto L_0x00bb
            r3 = 1127481344(0x43340000, float:180.0)
            oa0.i$a r8 = r8.f32125e
            oa0.h$a r8 = (oa0.C12972h.C12973a) r8
            float r8 = r8.f32099e
            float r8 = r8 + r3
            goto L_0x00c1
        L_0x00bb:
            oa0.i$a r3 = r8.f32125e
            oa0.h$a r3 = (oa0.C12972h.C12973a) r3
            float r8 = r3.f32099e
        L_0x00c1:
            r3 = 0
            r13 = 1065353216(0x3f800000, float:1.0)
            r0.glRotatef(r8, r3, r3, r13)
            r8 = r5
            goto L_0x00ee
        L_0x00c9:
            r3 = 0
            r13 = 1065353216(0x3f800000, float:1.0)
            oa0.i$a r5 = r8.f32125e
            oa0.h$a r5 = (oa0.C12972h.C12973a) r5
            float r5 = r5.f32099e
            float r8 = r2.f31994g
            float r5 = r5 + r8
            r0.glRotatef(r5, r3, r3, r13)
            goto L_0x00ed
        L_0x00d9:
            r3 = 0
            r13 = 1065353216(0x3f800000, float:1.0)
            oa0.i$a r5 = r8.f32125e
            oa0.h$a r5 = (oa0.C12972h.C12973a) r5
            float r5 = r5.f32099e
            float r8 = r2.f31994g
            float r5 = r5 + r8
            r0.glRotatef(r5, r3, r3, r13)
            float r5 = r2.f31995h
            r0.glRotatef(r5, r13, r3, r3)
        L_0x00ed:
            r8 = 0
        L_0x00ee:
            float r13 = r9.f32642b
            float r14 = r11.f32062d
            float r13 = r13 * r14
            r14 = 1056964608(0x3f000000, float:0.5)
            float r13 = r13 * r14
            float r13 = r13 + r3
            float r3 = r2.f31997j
            float r13 = r13 / r3
            if (r8 == 0) goto L_0x0102
            float r8 = r9.f32643c
            float r8 = -r8
            goto L_0x0104
        L_0x0102:
            float r8 = r9.f32643c
        L_0x0104:
            float r9 = r11.f32063e
            float r8 = r8 * r9
            float r8 = r8 * r14
            r9 = 0
            float r8 = r8 + r9
            float r8 = r8 / r3
            r0.glTranslatef(r13, r8, r9)
            float r3 = r11.f32062d
            float r8 = r2.f31997j
            float r3 = r3 / r8
            float r9 = r11.f32063e
            float r9 = r9 / r8
            r5 = 1065353216(0x3f800000, float:1.0)
            r0.glScalef(r3, r9, r5)
            int r3 = r10.intValue()
            r8 = 3553(0xde1, float:4.979E-42)
            r0.glBindTexture(r8, r3)
            java.nio.FloatBuffer r3 = r11.f32061c
            r9 = 5126(0x1406, float:7.183E-42)
            r0.glTexCoordPointer(r4, r9, r12, r3)
            java.nio.FloatBuffer r3 = ya0.C13277d.f32942a
            r3 = 32884(0x8074, float:4.608E-41)
            r0.glEnableClientState(r3)
            java.nio.FloatBuffer r3 = ya0.C13277d.f32942a
            r4 = 3
            r0.glVertexPointer(r4, r9, r12, r3)
            r3 = 5
            r4 = 4
            r0.glDrawArrays(r3, r12, r4)
            r17.glPopMatrix()
            r3 = 1065353216(0x3f800000, float:1.0)
            r4 = 3553(0xde1, float:4.979E-42)
            r5 = 32888(0x8078, float:4.6086E-41)
            goto L_0x0026
        L_0x014c:
            r0 = move-exception
            monitor-exit(r10)
            throw r0
        L_0x014f:
            r2 = 1065353216(0x3f800000, float:1.0)
            r0.glColor4f(r2, r2, r2, r2)
            r2 = 32888(0x8078, float:4.6086E-41)
            r0.glDisableClientState(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ta0.C13130f.mo40032d(javax.microedition.khronos.opengles.GL10, na0.b):void");
    }

    /* renamed from: e */
    public final void mo40033e(GL10 gl10) {
        for (Integer intValue : this.f32622c.values()) {
            C13277d.m33406d(gl10, intValue.intValue());
        }
        this.f32622c.clear();
        this.f32621b = new ArrayList();
    }

    /* renamed from: f */
    public final void mo40034f(GL10 gl10, C12923b bVar, C13100i iVar) {
    }

    /* renamed from: g */
    public final MapPos mo40035g(C12974i iVar, C12923b bVar, MapPos mapPos) {
        if (iVar instanceof C12972h) {
            return ((C12972h.C12973a) ((C12972h) iVar).f32125e).f32098d;
        }
        return mapPos;
    }
}
