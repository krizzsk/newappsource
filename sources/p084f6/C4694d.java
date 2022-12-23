package p084f6;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.Objects;
import p025b6.C1487b;
import p333z5.C7479a;
import p333z5.C7487c;

/* renamed from: f6.d */
public final class C4694d implements C4687a {

    /* renamed from: b */
    public final C4703j f15961b;

    /* renamed from: c */
    public final File f15962c;

    /* renamed from: d */
    public final long f15963d;

    /* renamed from: e */
    public final C4689b f15964e = new C4689b();

    /* renamed from: f */
    public C7479a f15965f;

    @Deprecated
    public C4694d(File file, long j) {
        this.f15962c = file;
        this.f15963d = j;
        this.f15961b = new C4703j();
    }

    /* renamed from: a */
    public final synchronized C7479a mo20211a() throws IOException {
        if (this.f15965f == null) {
            this.f15965f = C7479a.m17177j(this.f15962c, this.f15963d);
        }
        return this.f15965f;
    }

    /* renamed from: b */
    public final synchronized void mo20212b() {
        this.f15965f = null;
    }

    /* renamed from: c */
    public final File mo20207c(C1487b bVar) {
        String a = this.f15961b.mo20215a(bVar);
        if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
            Objects.toString(bVar);
        }
        try {
            C7479a.C7484e h = mo20211a().mo23746h(a);
            if (h != null) {
                return h.f22960a[0];
            }
            return null;
        } catch (IOException unused) {
            return null;
        }
    }

    public final synchronized void clear() {
        try {
            C7479a a = mo20211a();
            a.close();
            C7487c.m17191a(a.f22934b);
        } catch (IOException unused) {
        } catch (Throwable th) {
            mo20212b();
            throw th;
        }
        mo20212b();
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:48:0x0086 */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo20209e(p025b6.C1487b r6, p060d6.C4383d r7) {
        /*
            r5 = this;
            f6.j r0 = r5.f15961b
            java.lang.String r0 = r0.mo20215a(r6)
            f6.b r1 = r5.f15964e
            monitor-enter(r1)
            java.util.HashMap r2 = r1.f15954a     // Catch:{ all -> 0x00a5 }
            java.lang.Object r2 = r2.get(r0)     // Catch:{ all -> 0x00a5 }
            f6.b$a r2 = (p084f6.C4689b.C4690a) r2     // Catch:{ all -> 0x00a5 }
            if (r2 != 0) goto L_0x0031
            f6.b$b r2 = r1.f15955b     // Catch:{ all -> 0x00a5 }
            java.util.ArrayDeque r3 = r2.f15958a     // Catch:{ all -> 0x00a5 }
            monitor-enter(r3)     // Catch:{ all -> 0x00a5 }
            java.util.ArrayDeque r2 = r2.f15958a     // Catch:{ all -> 0x002e }
            java.lang.Object r2 = r2.poll()     // Catch:{ all -> 0x002e }
            f6.b$a r2 = (p084f6.C4689b.C4690a) r2     // Catch:{ all -> 0x002e }
            monitor-exit(r3)     // Catch:{ all -> 0x002e }
            if (r2 != 0) goto L_0x0028
            f6.b$a r2 = new f6.b$a     // Catch:{ all -> 0x00a5 }
            r2.<init>()     // Catch:{ all -> 0x00a5 }
        L_0x0028:
            java.util.HashMap r3 = r1.f15954a     // Catch:{ all -> 0x00a5 }
            r3.put(r0, r2)     // Catch:{ all -> 0x00a5 }
            goto L_0x0031
        L_0x002e:
            r6 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x002e }
            throw r6     // Catch:{ all -> 0x00a5 }
        L_0x0031:
            int r3 = r2.f15957b     // Catch:{ all -> 0x00a5 }
            r4 = 1
            int r3 = r3 + r4
            r2.f15957b = r3     // Catch:{ all -> 0x00a5 }
            monitor-exit(r1)     // Catch:{ all -> 0x00a5 }
            java.util.concurrent.locks.ReentrantLock r1 = r2.f15956a
            r1.lock()
            java.lang.String r1 = "DiskLruCacheWrapper"
            r2 = 2
            boolean r1 = android.util.Log.isLoggable(r1, r2)     // Catch:{ all -> 0x009e }
            if (r1 == 0) goto L_0x0049
            java.util.Objects.toString(r6)     // Catch:{ all -> 0x009e }
        L_0x0049:
            z5.a r6 = r5.mo20211a()     // Catch:{ IOException -> 0x0053 }
            z5.a$e r1 = r6.mo23746h(r0)     // Catch:{ IOException -> 0x0053 }
            if (r1 == 0) goto L_0x0059
        L_0x0053:
            f6.b r6 = r5.f15964e
            r6.mo20210a(r0)
            return
        L_0x0059:
            z5.a$c r6 = r6.mo23745f(r0)     // Catch:{ IOException -> 0x0053 }
            if (r6 == 0) goto L_0x0087
            java.io.File r1 = r6.mo23756b()     // Catch:{ all -> 0x007e }
            b6.a<DataType> r2 = r7.f15412a     // Catch:{ all -> 0x007e }
            DataType r3 = r7.f15413b     // Catch:{ all -> 0x007e }
            b6.e r7 = r7.f15414c     // Catch:{ all -> 0x007e }
            boolean r7 = r2.mo979n(r3, r1, r7)     // Catch:{ all -> 0x007e }
            if (r7 == 0) goto L_0x0076
            z5.a r7 = p333z5.C7479a.this     // Catch:{ all -> 0x007e }
            p333z5.C7479a.m17173a(r7, r6, r4)     // Catch:{ all -> 0x007e }
            r6.f22951c = r4     // Catch:{ all -> 0x007e }
        L_0x0076:
            boolean r7 = r6.f22951c     // Catch:{ IOException -> 0x0053 }
            if (r7 != 0) goto L_0x0053
            r6.mo23755a()     // Catch:{ IOException -> 0x0053 }
            goto L_0x0053
        L_0x007e:
            r7 = move-exception
            boolean r1 = r6.f22951c     // Catch:{ IOException -> 0x0053 }
            if (r1 != 0) goto L_0x0086
            r6.mo23755a()     // Catch:{ IOException -> 0x0086 }
        L_0x0086:
            throw r7     // Catch:{ IOException -> 0x0053 }
        L_0x0087:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException     // Catch:{ IOException -> 0x0053 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0053 }
            r7.<init>()     // Catch:{ IOException -> 0x0053 }
            java.lang.String r1 = "Had two simultaneous puts for: "
            r7.append(r1)     // Catch:{ IOException -> 0x0053 }
            r7.append(r0)     // Catch:{ IOException -> 0x0053 }
            java.lang.String r7 = r7.toString()     // Catch:{ IOException -> 0x0053 }
            r6.<init>(r7)     // Catch:{ IOException -> 0x0053 }
            throw r6     // Catch:{ IOException -> 0x0053 }
        L_0x009e:
            r6 = move-exception
            f6.b r7 = r5.f15964e
            r7.mo20210a(r0)
            throw r6
        L_0x00a5:
            r6 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00a5 }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p084f6.C4694d.mo20209e(b6.b, d6.d):void");
    }
}
