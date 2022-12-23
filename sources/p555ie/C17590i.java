package p555ie;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
import p531he.C17395e;
import p648me.C18365c;

/* renamed from: ie.i */
public final class C17590i {

    /* renamed from: a */
    public final C17583e f45233a;

    /* renamed from: b */
    public final C17395e f45234b;

    /* renamed from: c */
    public final String f45235c;

    /* renamed from: d */
    public final C17591a f45236d = new C17591a(false);

    /* renamed from: e */
    public final C17591a f45237e = new C17591a(true);

    /* renamed from: f */
    public final AtomicMarkableReference<String> f45238f = new AtomicMarkableReference<>((Object) null, false);

    /* renamed from: ie.i$a */
    public class C17591a {

        /* renamed from: a */
        public final AtomicMarkableReference<C17579b> f45239a;

        /* renamed from: b */
        public final AtomicReference<Callable<Void>> f45240b = new AtomicReference<>((Object) null);

        /* renamed from: c */
        public final boolean f45241c;

        public C17591a(boolean z) {
            int i;
            this.f45241c = z;
            if (z) {
                i = 8192;
            } else {
                i = 1024;
            }
            this.f45239a = new AtomicMarkableReference<>(new C17579b(i), false);
        }
    }

    public C17590i(String str, C18365c cVar, C17395e eVar) {
        this.f45235c = str;
        this.f45233a = new C17583e(cVar);
        this.f45234b = eVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002e, code lost:
        if (r1.compareAndSet((java.lang.Object) null, r5) == false) goto L_0x0032;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0030, code lost:
        r6 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0036, code lost:
        if (r1.get() == null) goto L_0x0029;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0038, code lost:
        if (r6 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003a, code lost:
        r0.f45242d.f45234b.mo49869a(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0021, code lost:
        r5 = new p244s3.C6448w(r0, 2);
        r1 = r0.f45240b;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo50053a(java.lang.String r5, java.lang.String r6) {
        /*
            r4 = this;
            ie.i$a r0 = r4.f45236d
            monitor-enter(r0)
            java.util.concurrent.atomic.AtomicMarkableReference<ie.b> r1 = r0.f45239a     // Catch:{ all -> 0x0042 }
            java.lang.Object r1 = r1.getReference()     // Catch:{ all -> 0x0042 }
            ie.b r1 = (p555ie.C17579b) r1     // Catch:{ all -> 0x0042 }
            boolean r5 = r1.mo50033b(r5, r6)     // Catch:{ all -> 0x0042 }
            r6 = 0
            if (r5 != 0) goto L_0x0014
            monitor-exit(r0)     // Catch:{ all -> 0x0042 }
            goto L_0x0041
        L_0x0014:
            java.util.concurrent.atomic.AtomicMarkableReference<ie.b> r5 = r0.f45239a     // Catch:{ all -> 0x0042 }
            java.lang.Object r1 = r5.getReference()     // Catch:{ all -> 0x0042 }
            ie.b r1 = (p555ie.C17579b) r1     // Catch:{ all -> 0x0042 }
            r2 = 1
            r5.set(r1, r2)     // Catch:{ all -> 0x0042 }
            monitor-exit(r0)     // Catch:{ all -> 0x0042 }
            s3.w r5 = new s3.w
            r1 = 2
            r5.<init>(r0, r1)
            java.util.concurrent.atomic.AtomicReference<java.util.concurrent.Callable<java.lang.Void>> r1 = r0.f45240b
        L_0x0029:
            r3 = 0
            boolean r3 = r1.compareAndSet(r3, r5)
            if (r3 == 0) goto L_0x0032
            r6 = 1
            goto L_0x0038
        L_0x0032:
            java.lang.Object r3 = r1.get()
            if (r3 == 0) goto L_0x0029
        L_0x0038:
            if (r6 == 0) goto L_0x0041
            ie.i r6 = p555ie.C17590i.this
            he.e r6 = r6.f45234b
            r6.mo49869a(r5)
        L_0x0041:
            return
        L_0x0042:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0042 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p555ie.C17590i.mo50053a(java.lang.String, java.lang.String):void");
    }
}
