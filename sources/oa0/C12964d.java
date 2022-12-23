package oa0;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.nutiteq.components.Envelope;
import com.nutiteq.components.MapPos;
import oa0.C12958a;
import oa0.C12974i;
import qa0.C13044b;
import ua0.C13148d;
import ua0.C13155h;
import v20.C20082a;
import xa0.C13250f;

/* renamed from: oa0.d */
public final class C12964d extends C12958a {

    /* renamed from: i */
    public int f32110i;

    /* renamed from: oa0.d$a */
    public static class C12965a extends C12958a.C12959a {
        public C12965a(MapPos mapPos, float f, Envelope envelope) {
            super(mapPos, f, envelope);
        }

        /* renamed from: a */
        public final float mo39844a() {
            C13148d dVar = (C13148d) this.f32128b;
            if (dVar != null) {
                return dVar.f32685f.f32063e;
            }
            return BitmapDescriptorFactory.HUE_RED;
        }

        /* renamed from: b */
        public final float mo39845b() {
            C13148d dVar = (C13148d) this.f32128b;
            if (dVar != null) {
                return dVar.f32685f.f32062d;
            }
            return BitmapDescriptorFactory.HUE_RED;
        }
    }

    public C12964d(MapPos mapPos, C13148d dVar) {
        super(mapPos, new C13155h(dVar), (C13250f) null, (C20082a.C20088f) null);
    }

    /* renamed from: a */
    public final MapPos mo39839a(MapPos mapPos) {
        C12965a aVar = (C12965a) this.f32125e;
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
        mo39842h(new C12965a(c, this.f32097h, new Envelope(c.f24175b, c.f24176c)));
    }

    /* renamed from: c */
    public final C12974i.C12975a mo39840c() {
        return (C12965a) this.f32125e;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0029, code lost:
        return;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo39848d(int r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            oa0.i$a r0 = r2.f32125e     // Catch:{ all -> 0x002a }
            oa0.d$a r0 = (oa0.C12964d.C12965a) r0     // Catch:{ all -> 0x002a }
            if (r0 != 0) goto L_0x0009
            monitor-exit(r2)
            return
        L_0x0009:
            boolean r1 = r2.f32122b     // Catch:{ all -> 0x002a }
            if (r1 == 0) goto L_0x0016
            ua0.h<?> r1 = r2.f32124d     // Catch:{ all -> 0x002a }
            ua0.g r1 = r1.mo40047a(r3)     // Catch:{ all -> 0x002a }
            ua0.d r1 = (ua0.C13148d) r1     // Catch:{ all -> 0x002a }
            goto L_0x0017
        L_0x0016:
            r1 = 0
        L_0x0017:
            r0.f32127a = r3     // Catch:{ all -> 0x002a }
            r0.f32128b = r1     // Catch:{ all -> 0x002a }
            if (r1 != 0) goto L_0x0021
            r3 = 0
            r0.f32100f = r3     // Catch:{ all -> 0x002a }
            goto L_0x0028
        L_0x0021:
            boolean r3 = r1.f32644d     // Catch:{ all -> 0x002a }
            if (r3 == 0) goto L_0x0028
            r3 = 1
            r0.f32100f = r3     // Catch:{ all -> 0x002a }
        L_0x0028:
            monitor-exit(r2)
            return
        L_0x002a:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: oa0.C12964d.mo39848d(int):void");
    }

    /* renamed from: g */
    public final C12958a.C12959a mo39841g() {
        return (C12965a) this.f32125e;
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
            oa0.d$a r1 = new oa0.d$a     // Catch:{ all -> 0x0036 }
            r1.<init>(r6, r7, r0)     // Catch:{ all -> 0x0036 }
            r5.mo39842h(r1)     // Catch:{ all -> 0x0036 }
        L_0x0034:
            monitor-exit(r5)
            return
        L_0x0036:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: oa0.C12964d.mo39843i(com.nutiteq.components.MapPos, float):void");
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("Marker [mapPos=");
        k.append(this.f32096g);
        k.append("]");
        return k.toString();
    }

    public C12964d(MapPos mapPos, C13155h hVar, C13250f fVar, C20082a.C20088f fVar2) {
        super(mapPos, hVar, fVar, fVar2);
    }
}
