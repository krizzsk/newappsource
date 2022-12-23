package oa0;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import com.nutiteq.components.Envelope;
import com.nutiteq.components.MapPos;
import na0.C12935l;
import oa0.C12958a;
import oa0.C12974i;
import qa0.C13044b;
import ua0.C13157i;
import ya0.C13288j;

/* renamed from: oa0.h */
public final class C12972h extends C12958a {

    /* renamed from: oa0.h$a */
    public static class C12973a extends C12958a.C12959a {

        /* renamed from: g */
        public String f32117g = null;

        /* renamed from: h */
        public float f32118h;

        /* renamed from: i */
        public float f32119i;

        /* renamed from: j */
        public volatile C12935l f32120j;

        public C12973a(MapPos mapPos, float f, Envelope envelope) {
            super(mapPos, f, envelope);
        }

        /* renamed from: a */
        public final float mo39844a() {
            return this.f32119i;
        }

        /* renamed from: b */
        public final float mo39845b() {
            return this.f32118h;
        }
    }

    /* renamed from: j */
    public static C12935l m32830j(String str, C13157i iVar) {
        Paint paint = new Paint(1);
        paint.setTextAlign(Paint.Align.LEFT);
        paint.setTypeface((Typeface) null);
        paint.setTextSize((float) 0);
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        float measureText = paint.measureText(str) + 4.0f;
        float f = (-fontMetrics.ascent) + fontMetrics.descent + 4.0f;
        int c = C13288j.m33428c((int) measureText);
        int c2 = C13288j.m33428c((int) f);
        float f2 = measureText / ((float) c);
        float f3 = f / ((float) c2);
        float[] fArr = {0.0f, f3, f2, f3, 0.0f, 0.0f, f2, 0.0f};
        Bitmap createBitmap = Bitmap.createBitmap(c, c2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(4.0f);
        canvas.drawText(str, 2.0f, (-fontMetrics.ascent) + 2.0f, paint);
        paint.setColor(iVar.f32693a.f32002e);
        paint.setStyle(Paint.Style.FILL);
        canvas.drawText(str, 2.0f, (-fontMetrics.ascent) + 2.0f, paint);
        return new C12935l(createBitmap, fArr, measureText * 0.006f * 500000.0f, f * 0.006f * 500000.0f);
    }

    /* renamed from: a */
    public final MapPos mo39839a(MapPos mapPos) {
        C12973a aVar = (C12973a) this.f32125e;
        if (aVar != null) {
            return aVar.f32098d;
        }
        return null;
    }

    /* renamed from: b */
    public final void mo39846b() {
        C13044b bVar = this.f32123c.f32170a;
        MapPos mapPos = this.f32096g;
        MapPos c = bVar.mo39930c(mapPos.f24175b, mapPos.f24176c);
        mo39853k(new C12973a(c, this.f32097h, new Envelope(c.f24175b, c.f24176c)));
    }

    /* renamed from: c */
    public final C12974i.C12975a mo39840c() {
        return (C12973a) this.f32125e;
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: d */
    public final synchronized void mo39848d(int r9) {
        /*
            r8 = this;
            monitor-enter(r8)
            oa0.i$a r0 = r8.f32125e     // Catch:{ all -> 0x00b2 }
            oa0.h$a r0 = (oa0.C12972h.C12973a) r0     // Catch:{ all -> 0x00b2 }
            if (r0 != 0) goto L_0x0009
            monitor-exit(r8)
            return
        L_0x0009:
            ua0.g r1 = r0.f32128b     // Catch:{ all -> 0x00b2 }
            ua0.i r1 = (ua0.C13157i) r1     // Catch:{ all -> 0x00b2 }
            boolean r2 = r8.f32122b     // Catch:{ all -> 0x00b2 }
            r3 = 0
            if (r2 == 0) goto L_0x001b
            ua0.h<?> r2 = r8.f32124d     // Catch:{ all -> 0x00b2 }
            ua0.g r2 = r2.mo40047a(r9)     // Catch:{ all -> 0x00b2 }
            ua0.i r2 = (ua0.C13157i) r2     // Catch:{ all -> 0x00b2 }
            goto L_0x001c
        L_0x001b:
            r2 = r3
        L_0x001c:
            r4 = 0
            if (r2 != 0) goto L_0x004a
            monitor-enter(r8)     // Catch:{ all -> 0x00b2 }
            oa0.i$a r9 = r8.f32125e     // Catch:{ all -> 0x0047 }
            oa0.h$a r9 = (oa0.C12972h.C12973a) r9     // Catch:{ all -> 0x0047 }
            if (r9 != 0) goto L_0x0029
            monitor-exit(r8)     // Catch:{ all -> 0x00b2 }
            goto L_0x00ad
        L_0x0029:
            monitor-enter(r9)     // Catch:{ all -> 0x0047 }
            na0.l r0 = r9.f32120j     // Catch:{ all -> 0x0044 }
            if (r0 == 0) goto L_0x003b
            r9.f32120j = r3     // Catch:{ all -> 0x0044 }
            monitor-enter(r0)     // Catch:{ all -> 0x0044 }
            android.graphics.Bitmap r1 = r0.f32059a     // Catch:{ all -> 0x0038 }
            r1.recycle()     // Catch:{ all -> 0x0038 }
            monitor-exit(r0)     // Catch:{ all -> 0x0038 }
            goto L_0x003b
        L_0x0038:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0038 }
            throw r1     // Catch:{ all -> 0x0044 }
        L_0x003b:
            monitor-exit(r9)     // Catch:{ all -> 0x0047 }
            r9.f32127a = r4     // Catch:{ all -> 0x0047 }
            r9.f32128b = r3     // Catch:{ all -> 0x0047 }
            r9.f32100f = r4     // Catch:{ all -> 0x0047 }
            monitor-exit(r8)     // Catch:{ all -> 0x00b2 }
            goto L_0x00ad
        L_0x0044:
            r0 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x0047 }
            throw r0     // Catch:{ all -> 0x0047 }
        L_0x0047:
            r9 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x00b2 }
            throw r9     // Catch:{ all -> 0x00b2 }
        L_0x004a:
            if (r1 == 0) goto L_0x0058
            na0.c r5 = r2.f32693a     // Catch:{ all -> 0x00b2 }
            na0.c r1 = r1.f32693a     // Catch:{ all -> 0x00b2 }
            boolean r1 = r5.equals(r1)     // Catch:{ all -> 0x00b2 }
            if (r1 != 0) goto L_0x0057
            goto L_0x0058
        L_0x0057:
            throw r3     // Catch:{ all -> 0x00b2 }
        L_0x0058:
            android.graphics.Paint r1 = new android.graphics.Paint     // Catch:{ all -> 0x00b2 }
            r5 = 1
            r1.<init>(r5)     // Catch:{ all -> 0x00b2 }
            android.graphics.Paint$Align r6 = android.graphics.Paint.Align.LEFT     // Catch:{ all -> 0x00b2 }
            r1.setTextAlign(r6)     // Catch:{ all -> 0x00b2 }
            r1.setTypeface(r3)     // Catch:{ all -> 0x00b2 }
            float r4 = (float) r4     // Catch:{ all -> 0x00b2 }
            r1.setTextSize(r4)     // Catch:{ all -> 0x00b2 }
            android.graphics.Paint$FontMetrics r4 = r1.getFontMetrics()     // Catch:{ all -> 0x00b2 }
            float r1 = r1.measureText(r3)     // Catch:{ all -> 0x00b2 }
            r6 = 1082130432(0x40800000, float:4.0)
            float r1 = r1 + r6
            float r7 = r4.ascent     // Catch:{ all -> 0x00b2 }
            float r7 = -r7
            float r4 = r4.descent     // Catch:{ all -> 0x00b2 }
            float r7 = r7 + r4
            float r7 = r7 + r6
            r0.f32117g = r3     // Catch:{ all -> 0x00b2 }
            r4 = 1002740646(0x3bc49ba6, float:0.006)
            float r1 = r1 * r4
            r6 = 1223959552(0x48f42400, float:500000.0)
            float r1 = r1 * r6
            r0.f32118h = r1     // Catch:{ all -> 0x00b2 }
            float r7 = r7 * r4
            float r7 = r7 * r6
            r0.f32119i = r7     // Catch:{ all -> 0x00b2 }
            monitor-enter(r0)     // Catch:{ all -> 0x00b2 }
            na0.l r1 = r0.f32120j     // Catch:{ all -> 0x00af }
            if (r1 == 0) goto L_0x00a2
            r0.f32120j = r3     // Catch:{ all -> 0x00af }
            monitor-enter(r1)     // Catch:{ all -> 0x00af }
            android.graphics.Bitmap r3 = r1.f32059a     // Catch:{ all -> 0x009f }
            r3.recycle()     // Catch:{ all -> 0x009f }
            monitor-exit(r1)     // Catch:{ all -> 0x009f }
            goto L_0x00a2
        L_0x009f:
            r9 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x009f }
            throw r9     // Catch:{ all -> 0x00af }
        L_0x00a2:
            monitor-exit(r0)     // Catch:{ all -> 0x00b2 }
            r0.f32127a = r9     // Catch:{ all -> 0x00b2 }
            r0.f32128b = r2     // Catch:{ all -> 0x00b2 }
            boolean r9 = r2.f32644d     // Catch:{ all -> 0x00b2 }
            if (r9 == 0) goto L_0x00ad
            r0.f32100f = r5     // Catch:{ all -> 0x00b2 }
        L_0x00ad:
            monitor-exit(r8)
            return
        L_0x00af:
            r9 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00b2 }
            throw r9     // Catch:{ all -> 0x00b2 }
        L_0x00b2:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: oa0.C12972h.mo39848d(int):void");
    }

    /* renamed from: g */
    public final C12958a.C12959a mo39841g() {
        return (C12973a) this.f32125e;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0035, code lost:
        return;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo39843i(com.nutiteq.components.MapPos r6, float r7) {
        /*
            r5 = this;
            monitor-enter(r5)
            za0.f<?> r0 = r5.f32123c     // Catch:{ all -> 0x0036 }
            if (r0 != 0) goto L_0x0007
            monitor-exit(r5)
            return
        L_0x0007:
            qa0.b r0 = r0.f32170a     // Catch:{ all -> 0x0036 }
            double r1 = r6.f24175b     // Catch:{ all -> 0x0036 }
            double r3 = r6.f24176c     // Catch:{ all -> 0x0036 }
            com.nutiteq.components.MapPos r0 = r0.mo39928a(r1, r3)     // Catch:{ all -> 0x0036 }
            com.nutiteq.components.MapPos r1 = r5.f32096g     // Catch:{ all -> 0x0036 }
            boolean r1 = r0.equals(r1)     // Catch:{ all -> 0x0036 }
            if (r1 == 0) goto L_0x001f
            float r1 = r5.f32097h     // Catch:{ all -> 0x0036 }
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 == 0) goto L_0x0034
        L_0x001f:
            r5.f32096g = r0     // Catch:{ all -> 0x0036 }
            r5.f32097h = r7     // Catch:{ all -> 0x0036 }
            com.nutiteq.components.Envelope r0 = new com.nutiteq.components.Envelope     // Catch:{ all -> 0x0036 }
            double r1 = r6.f24175b     // Catch:{ all -> 0x0036 }
            double r3 = r6.f24176c     // Catch:{ all -> 0x0036 }
            r0.<init>(r1, r3)     // Catch:{ all -> 0x0036 }
            oa0.h$a r1 = new oa0.h$a     // Catch:{ all -> 0x0036 }
            r1.<init>(r6, r7, r0)     // Catch:{ all -> 0x0036 }
            r5.mo39853k(r1)     // Catch:{ all -> 0x0036 }
        L_0x0034:
            monitor-exit(r5)
            return
        L_0x0036:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: oa0.C12972h.mo39843i(com.nutiteq.components.MapPos, float):void");
    }

    /* renamed from: k */
    public final void mo39853k(C12973a aVar) {
        C12973a aVar2 = (C12973a) this.f32125e;
        if (aVar2 != null) {
            String str = aVar.f32117g;
            if (str == null) {
                str = aVar2.f32117g;
            }
            aVar.f32117g = str;
            aVar.f32118h = aVar2.f32118h;
            aVar.f32119i = aVar2.f32119i;
            aVar.f32120j = aVar2.f32120j;
        }
        mo39842h(aVar);
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("Text [mapPos=");
        k.append(this.f32096g);
        k.append(", \"");
        k.append((String) null);
        k.append("\"]");
        return k.toString();
    }
}
