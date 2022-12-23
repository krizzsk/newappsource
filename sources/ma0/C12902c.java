package ma0;

import android.graphics.Bitmap;
import java.util.LinkedList;
import java.util.ListIterator;
import ya0.C13281g;
import ya0.C13283h;

/* renamed from: ma0.c */
public final class C12902c {

    /* renamed from: a */
    public int f31924a;

    /* renamed from: b */
    public int f31925b;

    /* renamed from: c */
    public int f31926c = 0;

    /* renamed from: d */
    public C12903a f31927d = new C12903a();

    /* renamed from: e */
    public C12904b f31928e = new C12904b();

    /* renamed from: f */
    public LinkedList f31929f = new LinkedList();

    /* renamed from: g */
    public final C12906d f31930g = C12906d.f31937f;

    /* renamed from: ma0.c$a */
    public class C12903a extends C13281g<C12905c> {
        public C12903a() {
        }

        /* renamed from: f */
        public final boolean mo39760f(long j, Object obj) {
            C12905c cVar = (C12905c) obj;
            C12902c cVar2 = C12902c.this;
            int i = cVar2.f31925b;
            if (i <= cVar2.f31924a) {
                return false;
            }
            cVar2.f31925b = i - cVar.f31935d;
            cVar2.f31928e.mo39771c(j, cVar);
            return true;
        }

        public final String toString() {
            String str = "";
            for (C13281g.C13282a aVar = this.f32950b; aVar != null; aVar = aVar.f32953a) {
                str = C25541a.m63884o(C13555b.m33972k(str), ((C12905c) aVar.f32956d).f31932a, "; ");
            }
            return str;
        }
    }

    /* renamed from: ma0.c$b */
    public class C12904b extends C13283h<C12905c> {
        /* renamed from: c */
        public final Object mo39771c(long j, Object obj) {
            C12905c cVar = (C12905c) obj;
            if (cVar.f31934c == null) {
                return (C12905c) super.mo39771c(j, cVar);
            }
            throw new IllegalStateException("Textures with non-null bitmaps should not be put into eviction cache");
        }
    }

    /* renamed from: ma0.c$c */
    public class C12905c {

        /* renamed from: a */
        public final long f31932a;

        /* renamed from: b */
        public int f31933b;

        /* renamed from: c */
        public Bitmap f31934c;

        /* renamed from: d */
        public final int f31935d;

        /* renamed from: e */
        public int f31936e;

        public C12905c(long j, Bitmap bitmap) {
            this.f31932a = j;
            this.f31934c = bitmap;
            this.f31935d = (int) (((float) (bitmap.getHeight() * bitmap.getRowBytes())) * 1.33f);
        }
    }

    /* renamed from: a */
    public final C12905c mo39767a(long j, Bitmap bitmap) {
        C12906d dVar = this.f31930g;
        synchronized (dVar) {
            if (bitmap != C12906d.f31938g) {
                dVar.mo39776e(bitmap, dVar.mo39774c(bitmap) + 1);
            }
        }
        C12905c cVar = new C12905c(j, bitmap);
        ListIterator listIterator = this.f31929f.listIterator();
        while (listIterator.hasNext()) {
            C12905c cVar2 = (C12905c) listIterator.next();
            if (cVar2.f31932a == j) {
                this.f31930g.mo39775d(cVar2.f31934c);
                listIterator.set(cVar);
                return cVar;
            }
        }
        this.f31929f.add(cVar);
        return cVar;
    }

    /* renamed from: b */
    public final synchronized boolean mo39768b(long j, byte[] bArr) {
        Bitmap a = this.f31930g.mo39772a(j, bArr);
        if (a == null) {
            return false;
        }
        mo39767a(j, a);
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: ma0.c$c} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized int mo39769c(long r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            ma0.c$a r0 = r1.f31927d     // Catch:{ all -> 0x002b }
            ya0.h<ya0.g<V>$a<V>> r0 = r0.f32949a     // Catch:{ all -> 0x002b }
            java.lang.Object r0 = r0.mo40149a(r2)     // Catch:{ all -> 0x002b }
            ya0.g$a r0 = (ya0.C13281g.C13282a) r0     // Catch:{ all -> 0x002b }
            if (r0 == 0) goto L_0x0010
            K r0 = r0.f32956d     // Catch:{ all -> 0x002b }
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            ma0.c$c r0 = (ma0.C12902c.C12905c) r0     // Catch:{ all -> 0x002b }
            if (r0 != 0) goto L_0x0023
            ma0.c$b r0 = r1.f31928e     // Catch:{ all -> 0x002b }
            java.lang.Object r2 = r0.mo40149a(r2)     // Catch:{ all -> 0x002b }
            r0 = r2
            ma0.c$c r0 = (ma0.C12902c.C12905c) r0     // Catch:{ all -> 0x002b }
            if (r0 != 0) goto L_0x0023
            r2 = 0
            monitor-exit(r1)
            return r2
        L_0x0023:
            int r2 = r1.f31926c     // Catch:{ all -> 0x002b }
            r0.f31936e = r2     // Catch:{ all -> 0x002b }
            int r2 = r0.f31933b     // Catch:{ all -> 0x002b }
            monitor-exit(r1)
            return r2
        L_0x002b:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ma0.C12902c.mo39769c(long):int");
    }
}
