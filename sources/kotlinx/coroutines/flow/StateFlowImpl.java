package kotlinx.coroutines.flow;

import ai0.C20997a;
import bf0.C21050d;
import ff0.C23349c;
import zh0.C25522c;
import zh0.C25527h;
import zh0.C25532m;

public final class StateFlowImpl<T> extends C20997a<C25532m> implements C25527h<T>, C25522c {
    private volatile /* synthetic */ Object _state;

    /* renamed from: e */
    public int f61473e;

    public StateFlowImpl(Object obj) {
        this._state = obj;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v17, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v10, resolved type: zh0.m} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v17, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v7, resolved type: kotlinx.coroutines.flow.StateFlowImpl} */
    /* JADX WARNING: type inference failed for: r2v14, types: [kotlin.coroutines.CoroutineContext$a] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00eb A[Catch:{ all -> 0x00f7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0106 A[Catch:{ all -> 0x00f7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0108 A[Catch:{ all -> 0x00f7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x011b A[Catch:{ all -> 0x00f7 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x011c A[Catch:{ all -> 0x00f7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x012f A[Catch:{ all -> 0x00f7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0131 A[Catch:{ all -> 0x00f7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0134 A[Catch:{ all -> 0x00f7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object collect(zh0.C25523d<? super T> r17, ff0.C23349c<?> r18) {
        /*
            r16 = this;
            r1 = r16
            r0 = r17
            r2 = r18
            boolean r3 = r2 instanceof kotlinx.coroutines.flow.StateFlowImpl$collect$1
            if (r3 == 0) goto L_0x0019
            r3 = r2
            kotlinx.coroutines.flow.StateFlowImpl$collect$1 r3 = (kotlinx.coroutines.flow.StateFlowImpl$collect$1) r3
            int r4 = r3.label
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0019
            int r4 = r4 - r5
            r3.label = r4
            goto L_0x001e
        L_0x0019:
            kotlinx.coroutines.flow.StateFlowImpl$collect$1 r3 = new kotlinx.coroutines.flow.StateFlowImpl$collect$1
            r3.<init>(r1, r2)
        L_0x001e:
            java.lang.Object r2 = r3.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r4 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r5 = r3.label
            r6 = 3
            r7 = 0
            r8 = 2
            r9 = 0
            r10 = 1
            if (r5 == 0) goto L_0x0079
            if (r5 == r10) goto L_0x0067
            if (r5 == r8) goto L_0x0050
            if (r5 != r6) goto L_0x0048
            java.lang.Object r0 = r3.L$4
            java.lang.Object r5 = r3.L$3
            wh0.y0 r5 = (wh0.C25232y0) r5
            java.lang.Object r11 = r3.L$2
            zh0.m r11 = (zh0.C25532m) r11
            java.lang.Object r12 = r3.L$1
            zh0.d r12 = (zh0.C25523d) r12
            java.lang.Object r13 = r3.L$0
            kotlinx.coroutines.flow.StateFlowImpl r13 = (kotlinx.coroutines.flow.StateFlowImpl) r13
            p584jl.C17885a.m44475z0(r2)     // Catch:{ all -> 0x00f7 }
            goto L_0x00e7
        L_0x0048:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x0050:
            java.lang.Object r0 = r3.L$4
            java.lang.Object r5 = r3.L$3
            wh0.y0 r5 = (wh0.C25232y0) r5
            java.lang.Object r11 = r3.L$2
            zh0.m r11 = (zh0.C25532m) r11
            java.lang.Object r12 = r3.L$1
            zh0.d r12 = (zh0.C25523d) r12
            java.lang.Object r13 = r3.L$0
            kotlinx.coroutines.flow.StateFlowImpl r13 = (kotlinx.coroutines.flow.StateFlowImpl) r13
            p584jl.C17885a.m44475z0(r2)     // Catch:{ all -> 0x00f7 }
            goto L_0x011d
        L_0x0067:
            java.lang.Object r0 = r3.L$2
            r11 = r0
            zh0.m r11 = (zh0.C25532m) r11
            java.lang.Object r0 = r3.L$1
            zh0.d r0 = (zh0.C25523d) r0
            java.lang.Object r5 = r3.L$0
            r13 = r5
            kotlinx.coroutines.flow.StateFlowImpl r13 = (kotlinx.coroutines.flow.StateFlowImpl) r13
            p584jl.C17885a.m44475z0(r2)     // Catch:{ all -> 0x00f7 }
            goto L_0x00d8
        L_0x0079:
            p584jl.C17885a.m44475z0(r2)
            monitor-enter(r16)
            S[] r2 = r1.f52744b     // Catch:{ all -> 0x0187 }
            if (r2 != 0) goto L_0x0086
            zh0.m[] r2 = new zh0.C25532m[r8]     // Catch:{ all -> 0x0187 }
            r1.f52744b = r2     // Catch:{ all -> 0x0187 }
            goto L_0x009e
        L_0x0086:
            int r5 = r1.f52745c     // Catch:{ all -> 0x0187 }
            int r11 = r2.length     // Catch:{ all -> 0x0187 }
            if (r5 < r11) goto L_0x009e
            int r5 = r2.length     // Catch:{ all -> 0x0187 }
            int r5 = r5 * 2
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r5)     // Catch:{ all -> 0x0187 }
            java.lang.String r5 = "copyOf(this, newSize)"
            mf0.C24362h.m61210e(r2, r5)     // Catch:{ all -> 0x0187 }
            r5 = r2
            ai0.b[] r5 = (ai0.C20998b[]) r5     // Catch:{ all -> 0x0187 }
            r1.f52744b = r5     // Catch:{ all -> 0x0187 }
            ai0.b[] r2 = (ai0.C20998b[]) r2     // Catch:{ all -> 0x0187 }
        L_0x009e:
            int r5 = r1.f52746d     // Catch:{ all -> 0x0187 }
        L_0x00a0:
            r11 = r2[r5]     // Catch:{ all -> 0x0187 }
            if (r11 != 0) goto L_0x00ab
            zh0.m r11 = new zh0.m     // Catch:{ all -> 0x0187 }
            r11.<init>()     // Catch:{ all -> 0x0187 }
            r2[r5] = r11     // Catch:{ all -> 0x0187 }
        L_0x00ab:
            int r5 = r5 + 1
            int r12 = r2.length     // Catch:{ all -> 0x0187 }
            if (r5 < r12) goto L_0x00b1
            r5 = 0
        L_0x00b1:
            boolean r12 = r11.mo53078a(r1)     // Catch:{ all -> 0x0187 }
            if (r12 == 0) goto L_0x00a0
            r1.f52746d = r5     // Catch:{ all -> 0x0187 }
            int r2 = r1.f52745c     // Catch:{ all -> 0x0187 }
            int r2 = r2 + r10
            r1.f52745c = r2     // Catch:{ all -> 0x0187 }
            monitor-exit(r16)
            zh0.m r11 = (zh0.C25532m) r11
            boolean r2 = r0 instanceof kotlinx.coroutines.flow.C24209e     // Catch:{ all -> 0x0173 }
            if (r2 == 0) goto L_0x00d7
            r2 = r0
            kotlinx.coroutines.flow.e r2 = (kotlinx.coroutines.flow.C24209e) r2     // Catch:{ all -> 0x0173 }
            r3.L$0 = r1     // Catch:{ all -> 0x0173 }
            r3.L$1 = r0     // Catch:{ all -> 0x0173 }
            r3.L$2 = r11     // Catch:{ all -> 0x0173 }
            r3.label = r10     // Catch:{ all -> 0x0173 }
            bf0.d r2 = r2.mo60360a(r3)     // Catch:{ all -> 0x0173 }
            if (r2 != r4) goto L_0x00d7
            return r4
        L_0x00d7:
            r13 = r1
        L_0x00d8:
            kotlin.coroutines.CoroutineContext r2 = r3.getContext()     // Catch:{ all -> 0x00f7 }
            wh0.y0$b r5 = wh0.C25232y0.C25234b.f63506b     // Catch:{ all -> 0x00f7 }
            kotlin.coroutines.CoroutineContext$a r2 = r2.mo53081c(r5)     // Catch:{ all -> 0x00f7 }
            r5 = r2
            wh0.y0 r5 = (wh0.C25232y0) r5     // Catch:{ all -> 0x00f7 }
            r12 = r0
            r0 = r7
        L_0x00e7:
            java.lang.Object r2 = r13._state     // Catch:{ all -> 0x00f7 }
            if (r5 == 0) goto L_0x00fa
            boolean r14 = r5.isActive()     // Catch:{ all -> 0x00f7 }
            if (r14 == 0) goto L_0x00f2
            goto L_0x00fa
        L_0x00f2:
            java.util.concurrent.CancellationException r0 = r5.mo61782i()     // Catch:{ all -> 0x00f7 }
            throw r0     // Catch:{ all -> 0x00f7 }
        L_0x00f7:
            r0 = move-exception
            goto L_0x0175
        L_0x00fa:
            if (r0 == 0) goto L_0x0102
            boolean r14 = mf0.C24362h.m61206a(r0, r2)     // Catch:{ all -> 0x00f7 }
            if (r14 != 0) goto L_0x011d
        L_0x0102:
            bi0.q r0 = mf0.C24361g.f61673b     // Catch:{ all -> 0x00f7 }
            if (r2 != r0) goto L_0x0108
            r0 = r7
            goto L_0x0109
        L_0x0108:
            r0 = r2
        L_0x0109:
            r3.L$0 = r13     // Catch:{ all -> 0x00f7 }
            r3.L$1 = r12     // Catch:{ all -> 0x00f7 }
            r3.L$2 = r11     // Catch:{ all -> 0x00f7 }
            r3.L$3 = r5     // Catch:{ all -> 0x00f7 }
            r3.L$4 = r2     // Catch:{ all -> 0x00f7 }
            r3.label = r8     // Catch:{ all -> 0x00f7 }
            java.lang.Object r0 = r12.emit(r0, r3)     // Catch:{ all -> 0x00f7 }
            if (r0 != r4) goto L_0x011c
            return r4
        L_0x011c:
            r0 = r2
        L_0x011d:
            r11.getClass()     // Catch:{ all -> 0x00f7 }
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = zh0.C25532m.f63789a     // Catch:{ all -> 0x00f7 }
            bi0.q r14 = mf0.C24368m.f61703o     // Catch:{ all -> 0x00f7 }
            java.lang.Object r15 = r2.getAndSet(r11, r14)     // Catch:{ all -> 0x00f7 }
            mf0.C24362h.m61208c(r15)     // Catch:{ all -> 0x00f7 }
            bi0.q r8 = mf0.C24368m.f61704p     // Catch:{ all -> 0x00f7 }
            if (r15 != r8) goto L_0x0131
            r8 = 1
            goto L_0x0132
        L_0x0131:
            r8 = 0
        L_0x0132:
            if (r8 != 0) goto L_0x0170
            r3.L$0 = r13     // Catch:{ all -> 0x00f7 }
            r3.L$1 = r12     // Catch:{ all -> 0x00f7 }
            r3.L$2 = r11     // Catch:{ all -> 0x00f7 }
            r3.L$3 = r5     // Catch:{ all -> 0x00f7 }
            r3.L$4 = r0     // Catch:{ all -> 0x00f7 }
            r3.label = r6     // Catch:{ all -> 0x00f7 }
            wh0.l r8 = new wh0.l     // Catch:{ all -> 0x00f7 }
            ff0.c r15 = ce0.C21100e.m49351l0(r3)     // Catch:{ all -> 0x00f7 }
            r8.<init>(r10, r15)     // Catch:{ all -> 0x00f7 }
            r8.mo61835t()     // Catch:{ all -> 0x00f7 }
        L_0x014c:
            boolean r15 = r2.compareAndSet(r11, r14, r8)     // Catch:{ all -> 0x00f7 }
            if (r15 == 0) goto L_0x0154
            r2 = 1
            goto L_0x015b
        L_0x0154:
            java.lang.Object r15 = r2.get(r11)     // Catch:{ all -> 0x00f7 }
            if (r15 == r14) goto L_0x014c
            r2 = 0
        L_0x015b:
            if (r2 != 0) goto L_0x0162
            bf0.d r2 = bf0.C21050d.f52856a     // Catch:{ all -> 0x00f7 }
            r8.resumeWith(r2)     // Catch:{ all -> 0x00f7 }
        L_0x0162:
            java.lang.Object r2 = r8.mo61834s()     // Catch:{ all -> 0x00f7 }
            kotlin.coroutines.intrinsics.CoroutineSingletons r8 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED     // Catch:{ all -> 0x00f7 }
            if (r2 != r8) goto L_0x016b
            goto L_0x016d
        L_0x016b:
            bf0.d r2 = bf0.C21050d.f52856a     // Catch:{ all -> 0x00f7 }
        L_0x016d:
            if (r2 != r4) goto L_0x0170
            return r4
        L_0x0170:
            r8 = 2
            goto L_0x00e7
        L_0x0173:
            r0 = move-exception
            r13 = r1
        L_0x0175:
            monitor-enter(r13)
            int r2 = r13.f52745c     // Catch:{ all -> 0x0184 }
            int r2 = r2 + -1
            r13.f52745c = r2     // Catch:{ all -> 0x0184 }
            if (r2 != 0) goto L_0x0180
            r13.f52746d = r9     // Catch:{ all -> 0x0184 }
        L_0x0180:
            r11._state = r7     // Catch:{ all -> 0x0184 }
            monitor-exit(r13)
            throw r0
        L_0x0184:
            r0 = move-exception
            monitor-exit(r13)
            throw r0
        L_0x0187:
            r0 = move-exception
            monitor-exit(r16)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.StateFlowImpl.collect(zh0.d, ff0.c):java.lang.Object");
    }

    public final Object emit(T t, C23349c<? super C21050d> cVar) {
        setValue(t);
        return C21050d.f52856a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0021, code lost:
        r1 = (zh0.C25532m[]) r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0023, code lost:
        if (r1 == null) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0025, code lost:
        r2 = r1.length;
        r4 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0028, code lost:
        if (r4 >= r2) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002a, code lost:
        r5 = r1[r4];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002c, code lost:
        if (r5 == null) goto L_0x006a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002e, code lost:
        r6 = r5._state;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0030, code lost:
        if (r6 != null) goto L_0x0033;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0033, code lost:
        r7 = mf0.C24368m.f61704p;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0035, code lost:
        if (r6 != r7) goto L_0x0038;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0038, code lost:
        r8 = mf0.C24368m.f61703o;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003a, code lost:
        if (r6 != r8) goto L_0x0050;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003c, code lost:
        r9 = zh0.C25532m.f63789a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0042, code lost:
        if (r9.compareAndSet(r5, r6, r7) == false) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0044, code lost:
        r6 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x004a, code lost:
        if (r9.get(r5) == r6) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x004c, code lost:
        r6 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x004d, code lost:
        if (r6 == false) goto L_0x002e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0050, code lost:
        r7 = zh0.C25532m.f63789a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0056, code lost:
        if (r7.compareAndSet(r5, r6, r8) == false) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0058, code lost:
        r7 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x005e, code lost:
        if (r7.get(r5) == r6) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0060, code lost:
        r7 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0061, code lost:
        if (r7 == false) goto L_0x002e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0063, code lost:
        ((wh0.C25192l) r6).resumeWith(bf0.C21050d.f52856a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x006a, code lost:
        r4 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x006d, code lost:
        monitor-enter(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
        r1 = r11.f61473e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0070, code lost:
        if (r1 != r12) goto L_0x0077;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0072, code lost:
        r11.f61473e = r12 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0075, code lost:
        monitor-exit(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
        r12 = r11.f52744b;
        r2 = bf0.C21050d.f52856a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x007b, code lost:
        monitor-exit(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x007c, code lost:
        r10 = r1;
        r1 = r12;
        r12 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setValue(T r12) {
        /*
            r11 = this;
            if (r12 != 0) goto L_0x0004
            bi0.q r12 = mf0.C24361g.f61673b
        L_0x0004:
            monitor-enter(r11)
            java.lang.Object r0 = r11._state     // Catch:{ all -> 0x0089 }
            boolean r0 = mf0.C24362h.m61206a(r0, r12)     // Catch:{ all -> 0x0089 }
            if (r0 == 0) goto L_0x0010
            monitor-exit(r11)
            goto L_0x0088
        L_0x0010:
            r11._state = r12     // Catch:{ all -> 0x0089 }
            int r12 = r11.f61473e     // Catch:{ all -> 0x0089 }
            r0 = r12 & 1
            if (r0 != 0) goto L_0x0083
            r0 = 1
            int r12 = r12 + r0
            r11.f61473e = r12     // Catch:{ all -> 0x0089 }
            S[] r1 = r11.f52744b     // Catch:{ all -> 0x0089 }
            bf0.d r2 = bf0.C21050d.f52856a     // Catch:{ all -> 0x0089 }
            monitor-exit(r11)
        L_0x0021:
            zh0.m[] r1 = (zh0.C25532m[]) r1
            if (r1 == 0) goto L_0x006d
            int r2 = r1.length
            r3 = 0
            r4 = 0
        L_0x0028:
            if (r4 >= r2) goto L_0x006d
            r5 = r1[r4]
            if (r5 == 0) goto L_0x006a
        L_0x002e:
            java.lang.Object r6 = r5._state
            if (r6 != 0) goto L_0x0033
            goto L_0x006a
        L_0x0033:
            bi0.q r7 = mf0.C24368m.f61704p
            if (r6 != r7) goto L_0x0038
            goto L_0x006a
        L_0x0038:
            bi0.q r8 = mf0.C24368m.f61703o
            if (r6 != r8) goto L_0x0050
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r9 = zh0.C25532m.f63789a
        L_0x003e:
            boolean r8 = r9.compareAndSet(r5, r6, r7)
            if (r8 == 0) goto L_0x0046
            r6 = 1
            goto L_0x004d
        L_0x0046:
            java.lang.Object r8 = r9.get(r5)
            if (r8 == r6) goto L_0x003e
            r6 = 0
        L_0x004d:
            if (r6 == 0) goto L_0x002e
            goto L_0x006a
        L_0x0050:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = zh0.C25532m.f63789a
        L_0x0052:
            boolean r9 = r7.compareAndSet(r5, r6, r8)
            if (r9 == 0) goto L_0x005a
            r7 = 1
            goto L_0x0061
        L_0x005a:
            java.lang.Object r9 = r7.get(r5)
            if (r9 == r6) goto L_0x0052
            r7 = 0
        L_0x0061:
            if (r7 == 0) goto L_0x002e
            wh0.l r6 = (wh0.C25192l) r6
            bf0.d r5 = bf0.C21050d.f52856a
            r6.resumeWith(r5)
        L_0x006a:
            int r4 = r4 + 1
            goto L_0x0028
        L_0x006d:
            monitor-enter(r11)
            int r1 = r11.f61473e     // Catch:{ all -> 0x0080 }
            if (r1 != r12) goto L_0x0077
            int r12 = r12 + r0
            r11.f61473e = r12     // Catch:{ all -> 0x0080 }
            monitor-exit(r11)
            goto L_0x0088
        L_0x0077:
            S[] r12 = r11.f52744b     // Catch:{ all -> 0x0080 }
            bf0.d r2 = bf0.C21050d.f52856a     // Catch:{ all -> 0x0080 }
            monitor-exit(r11)
            r10 = r1
            r1 = r12
            r12 = r10
            goto L_0x0021
        L_0x0080:
            r12 = move-exception
            monitor-exit(r11)
            throw r12
        L_0x0083:
            int r12 = r12 + 2
            r11.f61473e = r12     // Catch:{ all -> 0x0089 }
            monitor-exit(r11)
        L_0x0088:
            return
        L_0x0089:
            r12 = move-exception
            monitor-exit(r11)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.StateFlowImpl.setValue(java.lang.Object):void");
    }
}
