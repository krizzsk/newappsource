package p167m3;

import android.content.Context;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import p081f3.C4656h;
import p143k3.C5462a;
import p218q3.C6165a;

/* renamed from: m3.d */
public abstract class C5671d<T> {

    /* renamed from: f */
    public static final /* synthetic */ int f18438f = 0;

    /* renamed from: a */
    public final C6165a f18439a;

    /* renamed from: b */
    public final Context f18440b;

    /* renamed from: c */
    public final Object f18441c = new Object();

    /* renamed from: d */
    public final LinkedHashSet f18442d = new LinkedHashSet();

    /* renamed from: e */
    public T f18443e;

    /* renamed from: m3.d$a */
    public class C5672a implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ List f18444b;

        public C5672a(ArrayList arrayList) {
            this.f18444b = arrayList;
        }

        public final void run() {
            for (C5462a a : this.f18444b) {
                a.mo21349a(C5671d.this.f18443e);
            }
        }
    }

    static {
        C4656h.m11961e("ConstraintTracker");
    }

    public C5671d(Context context, C6165a aVar) {
        this.f18440b = context.getApplicationContext();
        this.f18439a = aVar;
    }

    /* renamed from: a */
    public abstract T mo21514a();

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002a, code lost:
        return;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo21520b(T r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f18441c
            monitor-enter(r0)
            T r1 = r3.f18443e     // Catch:{ all -> 0x002b }
            if (r1 == r4) goto L_0x0029
            if (r1 == 0) goto L_0x0010
            boolean r1 = r1.equals(r4)     // Catch:{ all -> 0x002b }
            if (r1 == 0) goto L_0x0010
            goto L_0x0029
        L_0x0010:
            r3.f18443e = r4     // Catch:{ all -> 0x002b }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x002b }
            java.util.LinkedHashSet r1 = r3.f18442d     // Catch:{ all -> 0x002b }
            r4.<init>(r1)     // Catch:{ all -> 0x002b }
            q3.a r1 = r3.f18439a     // Catch:{ all -> 0x002b }
            q3.b r1 = (p218q3.C6166b) r1     // Catch:{ all -> 0x002b }
            q3.b$a r1 = r1.f19551c     // Catch:{ all -> 0x002b }
            m3.d$a r2 = new m3.d$a     // Catch:{ all -> 0x002b }
            r2.<init>(r4)     // Catch:{ all -> 0x002b }
            r1.execute(r2)     // Catch:{ all -> 0x002b }
            monitor-exit(r0)     // Catch:{ all -> 0x002b }
            return
        L_0x0029:
            monitor-exit(r0)     // Catch:{ all -> 0x002b }
            return
        L_0x002b:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002b }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p167m3.C5671d.mo21520b(java.lang.Object):void");
    }

    /* renamed from: c */
    public abstract void mo21517c();

    /* renamed from: d */
    public abstract void mo21518d();
}
