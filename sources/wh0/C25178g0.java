package wh0;

import ci0.C21212g;
import ff0.C23349c;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.CoroutinesInternalError;
import mf0.C24362h;
import p389bl.C13637c;
import p626lf.C18201b;

/* renamed from: wh0.g0 */
public abstract class C25178g0<T> extends C21212g {

    /* renamed from: d */
    public int f63457d;

    public C25178g0(int i) {
        this.f63457d = i;
    }

    /* renamed from: a */
    public void mo53193a(Object obj, CancellationException cancellationException) {
    }

    /* renamed from: c */
    public abstract C23349c<T> mo53194c();

    /* renamed from: e */
    public Throwable mo61807e(Object obj) {
        C25219u uVar = obj instanceof C25219u ? (C25219u) obj : null;
        if (uVar != null) {
            return uVar.f63493a;
        }
        return null;
    }

    /* renamed from: h */
    public <T> T mo61808h(Object obj) {
        return obj;
    }

    /* renamed from: i */
    public final void mo61809i(Throwable th, Throwable th2) {
        if (th != null || th2 != null) {
            if (!(th == null || th2 == null)) {
                C18201b.m44913j(th, th2);
            }
            if (th == null) {
                th = th2;
            }
            C24362h.m61208c(th);
            C13637c.m34080w(mo53194c().getContext(), new CoroutinesInternalError("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
        }
    }

    /* renamed from: j */
    public abstract Object mo53196j();

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0075, code lost:
        if (r4.mo61859w0() != false) goto L_0x0077;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0093, code lost:
        if (r4.mo61859w0() != false) goto L_0x0095;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x004b A[Catch:{ all -> 0x005a, all -> 0x0099 }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x005c A[Catch:{ all -> 0x005a, all -> 0x0099 }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0071 A[SYNTHETIC, Splitter:B:29:0x0071] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r12 = this;
            ci0.h r0 = r12.f53146c
            ff0.c r1 = r12.mo53194c()     // Catch:{ all -> 0x0099 }
            bi0.e r1 = (bi0.C21066e) r1     // Catch:{ all -> 0x0099 }
            ff0.c<T> r2 = r1.f52873f     // Catch:{ all -> 0x0099 }
            java.lang.Object r1 = r1.f52875h     // Catch:{ all -> 0x0099 }
            kotlin.coroutines.CoroutineContext r3 = r2.getContext()     // Catch:{ all -> 0x0099 }
            java.lang.Object r1 = kotlinx.coroutines.internal.ThreadContextKt.m60696b(r3, r1)     // Catch:{ all -> 0x0099 }
            bi0.q r4 = kotlinx.coroutines.internal.ThreadContextKt.f61492a     // Catch:{ all -> 0x0099 }
            r5 = 0
            if (r1 == r4) goto L_0x001e
            wh0.t1 r4 = kotlinx.coroutines.CoroutineContextKt.m60589d(r2, r3, r1)     // Catch:{ all -> 0x0099 }
            goto L_0x001f
        L_0x001e:
            r4 = r5
        L_0x001f:
            kotlin.coroutines.CoroutineContext r6 = r2.getContext()     // Catch:{ all -> 0x005a }
            java.lang.Object r7 = r12.mo53196j()     // Catch:{ all -> 0x005a }
            java.lang.Throwable r8 = r12.mo61807e(r7)     // Catch:{ all -> 0x005a }
            if (r8 != 0) goto L_0x0042
            int r9 = r12.f63457d     // Catch:{ all -> 0x005a }
            r10 = 1
            if (r9 == r10) goto L_0x0037
            r11 = 2
            if (r9 != r11) goto L_0x0036
            goto L_0x0037
        L_0x0036:
            r10 = 0
        L_0x0037:
            if (r10 == 0) goto L_0x0042
            wh0.y0$b r9 = wh0.C25232y0.C25234b.f63506b     // Catch:{ all -> 0x005a }
            kotlin.coroutines.CoroutineContext$a r6 = r6.mo53081c(r9)     // Catch:{ all -> 0x005a }
            wh0.y0 r6 = (wh0.C25232y0) r6     // Catch:{ all -> 0x005a }
            goto L_0x0043
        L_0x0042:
            r6 = r5
        L_0x0043:
            if (r6 == 0) goto L_0x005c
            boolean r9 = r6.isActive()     // Catch:{ all -> 0x005a }
            if (r9 != 0) goto L_0x005c
            java.util.concurrent.CancellationException r6 = r6.mo61782i()     // Catch:{ all -> 0x005a }
            r12.mo53193a(r7, r6)     // Catch:{ all -> 0x005a }
            kotlin.Result$Failure r6 = p584jl.C17885a.m44400G(r6)     // Catch:{ all -> 0x005a }
            r2.resumeWith(r6)     // Catch:{ all -> 0x005a }
            goto L_0x006d
        L_0x005a:
            r2 = move-exception
            goto L_0x008d
        L_0x005c:
            if (r8 == 0) goto L_0x0066
            kotlin.Result$Failure r6 = p584jl.C17885a.m44400G(r8)     // Catch:{ all -> 0x005a }
            r2.resumeWith(r6)     // Catch:{ all -> 0x005a }
            goto L_0x006d
        L_0x0066:
            java.lang.Object r6 = r12.mo61808h(r7)     // Catch:{ all -> 0x005a }
            r2.resumeWith(r6)     // Catch:{ all -> 0x005a }
        L_0x006d:
            bf0.d r2 = bf0.C21050d.f52856a     // Catch:{ all -> 0x005a }
            if (r4 == 0) goto L_0x0077
            boolean r2 = r4.mo61859w0()     // Catch:{ all -> 0x0099 }
            if (r2 == 0) goto L_0x007a
        L_0x0077:
            kotlinx.coroutines.internal.ThreadContextKt.m60695a(r3, r1)     // Catch:{ all -> 0x0099 }
        L_0x007a:
            r0.mo53557a()     // Catch:{ all -> 0x0080 }
            bf0.d r0 = bf0.C21050d.f52856a     // Catch:{ all -> 0x0080 }
            goto L_0x0085
        L_0x0080:
            r0 = move-exception
            kotlin.Result$Failure r0 = p584jl.C17885a.m44400G(r0)
        L_0x0085:
            java.lang.Throwable r0 = kotlin.Result.m58423a(r0)
            r12.mo61809i(r5, r0)
            goto L_0x00ac
        L_0x008d:
            if (r4 == 0) goto L_0x0095
            boolean r4 = r4.mo61859w0()     // Catch:{ all -> 0x0099 }
            if (r4 == 0) goto L_0x0098
        L_0x0095:
            kotlinx.coroutines.internal.ThreadContextKt.m60695a(r3, r1)     // Catch:{ all -> 0x0099 }
        L_0x0098:
            throw r2     // Catch:{ all -> 0x0099 }
        L_0x0099:
            r1 = move-exception
            r0.mo53557a()     // Catch:{ all -> 0x00a0 }
            bf0.d r0 = bf0.C21050d.f52856a     // Catch:{ all -> 0x00a0 }
            goto L_0x00a5
        L_0x00a0:
            r0 = move-exception
            kotlin.Result$Failure r0 = p584jl.C17885a.m44400G(r0)
        L_0x00a5:
            java.lang.Throwable r0 = kotlin.Result.m58423a(r0)
            r12.mo61809i(r1, r0)
        L_0x00ac:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: wh0.C25178g0.run():void");
    }
}
