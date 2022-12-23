package p910xf;

import android.app.Activity;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCanceledListener;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.Executor;
import p066e0.C4454r0;
import p102h0.C5021e;
import p115i0.C5227c;
import p304x.C7038d0;
import p304x.C7071l0;
import p373au.C13533e;
import p910xf.C20482k.C20483a;

/* renamed from: xf.k */
public abstract class C20482k<ResultT extends C20483a> extends C20472a<ResultT> {

    /* renamed from: j */
    public static final HashMap<Integer, HashSet<Integer>> f51856j;

    /* renamed from: a */
    public final Object f51857a = new Object();

    /* renamed from: b */
    public final C20488n<OnSuccessListener<? super ResultT>, ResultT> f51858b = new C20488n<>(this, RecyclerView.C1119a0.FLAG_IGNORE, new C7071l0(this, 4));

    /* renamed from: c */
    public final C20488n<OnFailureListener, ResultT> f51859c = new C20488n<>(this, 64, new C13533e(this, 6));

    /* renamed from: d */
    public final C20488n<OnCompleteListener<ResultT>, ResultT> f51860d = new C20488n<>(this, 448, new C7038d0(this, 5));

    /* renamed from: e */
    public final C20488n<OnCanceledListener, ResultT> f51861e = new C20488n<>(this, 256, new C5021e(this, 5));

    /* renamed from: f */
    public final C20488n<C20475d<? super ResultT>, ResultT> f51862f = new C20488n<>(this, -465, new C4454r0(9));

    /* renamed from: g */
    public final C20488n<C20474c<? super ResultT>, ResultT> f51863g = new C20488n<>(this, 16, new C5227c(12));

    /* renamed from: h */
    public volatile int f51864h = 1;

    /* renamed from: i */
    public ResultT f51865i;

    /* renamed from: xf.k$a */
    public interface C20483a {
        /* renamed from: a */
        Exception mo52680a();
    }

    /* renamed from: xf.k$b */
    public class C20484b implements C20483a {
    }

    static {
        HashMap hashMap = new HashMap();
        HashMap<Integer, HashSet<Integer>> hashMap2 = new HashMap<>();
        f51856j = hashMap2;
        hashMap.put(1, new HashSet(Arrays.asList(new Integer[]{16, 256})));
        hashMap.put(2, new HashSet(Arrays.asList(new Integer[]{8, 32})));
        hashMap.put(4, new HashSet(Arrays.asList(new Integer[]{8, 32})));
        hashMap.put(16, new HashSet(Arrays.asList(new Integer[]{2, 256})));
        hashMap.put(64, new HashSet(Arrays.asList(new Integer[]{2, 256})));
        hashMap2.put(1, new HashSet(Arrays.asList(new Integer[]{2, 64})));
        Integer valueOf = Integer.valueOf(RecyclerView.C1119a0.FLAG_IGNORE);
        hashMap2.put(2, new HashSet(Arrays.asList(new Integer[]{4, 64, valueOf})));
        hashMap2.put(4, new HashSet(Arrays.asList(new Integer[]{4, 64, valueOf})));
        hashMap2.put(8, new HashSet(Arrays.asList(new Integer[]{16, 64, valueOf})));
        hashMap2.put(32, new HashSet(Arrays.asList(new Integer[]{256, 64, valueOf})));
    }

    /* renamed from: a */
    public final <ContinuationResultT> Task<ContinuationResultT> mo52671a(Executor executor, Continuation<ResultT, Task<ContinuationResultT>> continuation) {
        CancellationTokenSource cancellationTokenSource = new CancellationTokenSource();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource(cancellationTokenSource.getToken());
        this.f51860d.mo52683a((Activity) null, executor, new C20478g(this, continuation, taskCompletionSource, cancellationTokenSource));
        return taskCompletionSource.getTask();
    }

    public final Task addOnCanceledListener(OnCanceledListener onCanceledListener) {
        Preconditions.checkNotNull(onCanceledListener);
        this.f51861e.mo52683a((Activity) null, (Executor) null, onCanceledListener);
        return this;
    }

    public final Task addOnCompleteListener(OnCompleteListener onCompleteListener) {
        Preconditions.checkNotNull(onCompleteListener);
        this.f51860d.mo52683a((Activity) null, (Executor) null, onCompleteListener);
        return this;
    }

    public final Task addOnFailureListener(OnFailureListener onFailureListener) {
        Preconditions.checkNotNull(onFailureListener);
        this.f51859c.mo52683a((Activity) null, (Executor) null, onFailureListener);
        return this;
    }

    public final Task addOnSuccessListener(OnSuccessListener onSuccessListener) {
        Preconditions.checkNotNull(onSuccessListener);
        this.f51858b.mo52683a((Activity) null, (Executor) null, onSuccessListener);
        return this;
    }

    /* renamed from: b */
    public final void mo52672b() {
        boolean z;
        if (!isComplete()) {
            if ((this.f51864h & 16) != 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z && this.f51864h != 2 && !mo52679i(256)) {
                mo52679i(64);
            }
        }
    }

    /* renamed from: c */
    public final ResultT mo52673c() {
        ResultT g;
        ResultT resultt = this.f51865i;
        if (resultt != null) {
            return resultt;
        }
        if (!isComplete()) {
            return null;
        }
        if (this.f51865i == null) {
            synchronized (this.f51857a) {
                g = mo52677g();
            }
            this.f51865i = g;
        }
        return this.f51865i;
    }

    public final <ContinuationResultT> Task<ContinuationResultT> continueWith(Continuation<ResultT, ContinuationResultT> continuation) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f51860d.mo52683a((Activity) null, (Executor) null, new C20477f(0, this, continuation, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    public final <ContinuationResultT> Task<ContinuationResultT> continueWithTask(Continuation<ResultT, Task<ContinuationResultT>> continuation) {
        return mo52671a((Executor) null, continuation);
    }

    /* renamed from: d */
    public abstract C20476e mo52674d();

    /* renamed from: e */
    public void mo52675e() {
    }

    /* renamed from: f */
    public abstract void mo52676f();

    /* renamed from: g */
    public abstract C20490o mo52677g();

    public final Exception getException() {
        if (mo52673c() == null) {
            return null;
        }
        return mo52673c().mo52680a();
    }

    public final Object getResult() {
        if (mo52673c() != null) {
            Exception a = mo52673c().mo52680a();
            if (a == null) {
                return mo52673c();
            }
            throw new RuntimeExecutionException(a);
        }
        throw new IllegalStateException();
    }

    /* renamed from: h */
    public final <ContinuationResultT> Task<ContinuationResultT> mo52678h(Executor executor, SuccessContinuation<ResultT, ContinuationResultT> successContinuation) {
        CancellationTokenSource cancellationTokenSource = new CancellationTokenSource();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource(cancellationTokenSource.getToken());
        this.f51858b.mo52683a((Activity) null, executor, new C20479h(successContinuation, taskCompletionSource, cancellationTokenSource));
        return taskCompletionSource.getTask();
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo52679i(int r15) {
        /*
            r14 = this;
            r0 = 1
            int[] r1 = new int[r0]
            r2 = 0
            r1[r2] = r15
            java.util.HashMap<java.lang.Integer, java.util.HashSet<java.lang.Integer>> r15 = f51856j
            java.lang.Object r3 = r14.f51857a
            monitor-enter(r3)
            r4 = 0
        L_0x000c:
            r5 = 256(0x100, float:3.59E-43)
            r6 = 128(0x80, float:1.794E-43)
            r7 = 64
            r8 = 16
            r9 = 4
            r10 = 2
            if (r4 >= r0) goto L_0x0086
            r11 = r1[r4]     // Catch:{ all -> 0x00a9 }
            int r12 = r14.f51864h     // Catch:{ all -> 0x00a9 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ all -> 0x00a9 }
            java.lang.Object r12 = r15.get(r12)     // Catch:{ all -> 0x00a9 }
            java.util.HashSet r12 = (java.util.HashSet) r12     // Catch:{ all -> 0x00a9 }
            if (r12 == 0) goto L_0x0083
            java.lang.Integer r13 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x00a9 }
            boolean r12 = r12.contains(r13)     // Catch:{ all -> 0x00a9 }
            if (r12 == 0) goto L_0x0083
            r14.f51864h = r11     // Catch:{ all -> 0x00a9 }
            int r15 = r14.f51864h     // Catch:{ all -> 0x00a9 }
            if (r15 == r10) goto L_0x0047
            if (r15 == r9) goto L_0x005f
            if (r15 == r8) goto L_0x005f
            if (r15 == r7) goto L_0x005f
            if (r15 == r6) goto L_0x005f
            if (r15 == r5) goto L_0x0043
            goto L_0x005f
        L_0x0043:
            r14.mo52675e()     // Catch:{ all -> 0x00a9 }
            goto L_0x005f
        L_0x0047:
            xf.l r15 = p910xf.C20485l.f51866c     // Catch:{ all -> 0x00a9 }
            java.lang.Object r1 = r15.f51868b     // Catch:{ all -> 0x00a9 }
            monitor-enter(r1)     // Catch:{ all -> 0x00a9 }
            java.util.HashMap r15 = r15.f51867a     // Catch:{ all -> 0x0080 }
            xf.e r2 = r14.mo52674d()     // Catch:{ all -> 0x0080 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0080 }
            java.lang.ref.WeakReference r4 = new java.lang.ref.WeakReference     // Catch:{ all -> 0x0080 }
            r4.<init>(r14)     // Catch:{ all -> 0x0080 }
            r15.put(r2, r4)     // Catch:{ all -> 0x0080 }
            monitor-exit(r1)     // Catch:{ all -> 0x0080 }
        L_0x005f:
            xf.n<com.google.android.gms.tasks.OnSuccessListener<? super ResultT>, ResultT> r15 = r14.f51858b     // Catch:{ all -> 0x00a9 }
            r15.mo52684b()     // Catch:{ all -> 0x00a9 }
            xf.n<com.google.android.gms.tasks.OnFailureListener, ResultT> r15 = r14.f51859c     // Catch:{ all -> 0x00a9 }
            r15.mo52684b()     // Catch:{ all -> 0x00a9 }
            xf.n<com.google.android.gms.tasks.OnCanceledListener, ResultT> r15 = r14.f51861e     // Catch:{ all -> 0x00a9 }
            r15.mo52684b()     // Catch:{ all -> 0x00a9 }
            xf.n<com.google.android.gms.tasks.OnCompleteListener<ResultT>, ResultT> r15 = r14.f51860d     // Catch:{ all -> 0x00a9 }
            r15.mo52684b()     // Catch:{ all -> 0x00a9 }
            xf.n<xf.c<? super ResultT>, ResultT> r15 = r14.f51863g     // Catch:{ all -> 0x00a9 }
            r15.mo52684b()     // Catch:{ all -> 0x00a9 }
            xf.n<xf.d<? super ResultT>, ResultT> r15 = r14.f51862f     // Catch:{ all -> 0x00a9 }
            r15.mo52684b()     // Catch:{ all -> 0x00a9 }
            monitor-exit(r3)     // Catch:{ all -> 0x00a9 }
            goto L_0x00db
        L_0x0080:
            r15 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0080 }
            throw r15     // Catch:{ all -> 0x00a9 }
        L_0x0083:
            int r4 = r4 + 1
            goto L_0x000c
        L_0x0086:
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a9 }
            r15.<init>()     // Catch:{ all -> 0x00a9 }
            r4 = 0
        L_0x008c:
            if (r4 >= r0) goto L_0x00d0
            r11 = r1[r4]     // Catch:{ all -> 0x00a9 }
            if (r11 == r0) goto L_0x00c3
            if (r11 == r10) goto L_0x00c0
            if (r11 == r9) goto L_0x00bd
            r12 = 8
            if (r11 == r12) goto L_0x00ba
            if (r11 == r8) goto L_0x00b7
            r12 = 32
            if (r11 == r12) goto L_0x00b4
            if (r11 == r7) goto L_0x00b1
            if (r11 == r6) goto L_0x00ae
            if (r11 == r5) goto L_0x00ab
            java.lang.String r11 = "Unknown Internal State!"
            goto L_0x00c5
        L_0x00a9:
            r15 = move-exception
            goto L_0x00dc
        L_0x00ab:
            java.lang.String r11 = "INTERNAL_STATE_CANCELED"
            goto L_0x00c5
        L_0x00ae:
            java.lang.String r11 = "INTERNAL_STATE_SUCCESS"
            goto L_0x00c5
        L_0x00b1:
            java.lang.String r11 = "INTERNAL_STATE_FAILURE"
            goto L_0x00c5
        L_0x00b4:
            java.lang.String r11 = "INTERNAL_STATE_CANCELING"
            goto L_0x00c5
        L_0x00b7:
            java.lang.String r11 = "INTERNAL_STATE_PAUSED"
            goto L_0x00c5
        L_0x00ba:
            java.lang.String r11 = "INTERNAL_STATE_PAUSING"
            goto L_0x00c5
        L_0x00bd:
            java.lang.String r11 = "INTERNAL_STATE_IN_PROGRESS"
            goto L_0x00c5
        L_0x00c0:
            java.lang.String r11 = "INTERNAL_STATE_QUEUED"
            goto L_0x00c5
        L_0x00c3:
            java.lang.String r11 = "INTERNAL_STATE_NOT_STARTED"
        L_0x00c5:
            r15.append(r11)     // Catch:{ all -> 0x00a9 }
            java.lang.String r11 = ", "
            r15.append(r11)     // Catch:{ all -> 0x00a9 }
            int r4 = r4 + 1
            goto L_0x008c
        L_0x00d0:
            int r0 = r15.length()     // Catch:{ all -> 0x00a9 }
            int r0 = r0 + -2
            r15.substring(r2, r0)     // Catch:{ all -> 0x00a9 }
            monitor-exit(r3)     // Catch:{ all -> 0x00a9 }
            r0 = 0
        L_0x00db:
            return r0
        L_0x00dc:
            monitor-exit(r3)     // Catch:{ all -> 0x00a9 }
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: p910xf.C20482k.mo52679i(int):boolean");
    }

    public final boolean isCanceled() {
        return this.f51864h == 256;
    }

    public final boolean isComplete() {
        return (this.f51864h & 448) != 0;
    }

    public final boolean isSuccessful() {
        return (this.f51864h & RecyclerView.C1119a0.FLAG_IGNORE) != 0;
    }

    public final <ContinuationResultT> Task<ContinuationResultT> onSuccessTask(SuccessContinuation<ResultT, ContinuationResultT> successContinuation) {
        return mo52678h((Executor) null, successContinuation);
    }

    public final <ContinuationResultT> Task<ContinuationResultT> continueWithTask(Executor executor, Continuation<ResultT, Task<ContinuationResultT>> continuation) {
        return mo52671a(executor, continuation);
    }

    public final <ContinuationResultT> Task<ContinuationResultT> onSuccessTask(Executor executor, SuccessContinuation<ResultT, ContinuationResultT> successContinuation) {
        return mo52678h(executor, successContinuation);
    }

    public final Task addOnCanceledListener(Executor executor, OnCanceledListener onCanceledListener) {
        Preconditions.checkNotNull(onCanceledListener);
        Preconditions.checkNotNull(executor);
        this.f51861e.mo52683a((Activity) null, executor, onCanceledListener);
        return this;
    }

    public final Task addOnCompleteListener(Executor executor, OnCompleteListener onCompleteListener) {
        Preconditions.checkNotNull(onCompleteListener);
        Preconditions.checkNotNull(executor);
        this.f51860d.mo52683a((Activity) null, executor, onCompleteListener);
        return this;
    }

    public final Task addOnFailureListener(Executor executor, OnFailureListener onFailureListener) {
        Preconditions.checkNotNull(onFailureListener);
        Preconditions.checkNotNull(executor);
        this.f51859c.mo52683a((Activity) null, executor, onFailureListener);
        return this;
    }

    public final Task addOnSuccessListener(Executor executor, OnSuccessListener onSuccessListener) {
        Preconditions.checkNotNull(executor);
        Preconditions.checkNotNull(onSuccessListener);
        this.f51858b.mo52683a((Activity) null, executor, onSuccessListener);
        return this;
    }

    public final <ContinuationResultT> Task<ContinuationResultT> continueWith(Executor executor, Continuation<ResultT, ContinuationResultT> continuation) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f51860d.mo52683a((Activity) null, executor, new C20477f(0, this, continuation, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    public final Task addOnCanceledListener(Activity activity, OnCanceledListener onCanceledListener) {
        Preconditions.checkNotNull(onCanceledListener);
        Preconditions.checkNotNull(activity);
        this.f51861e.mo52683a(activity, (Executor) null, onCanceledListener);
        return this;
    }

    public final Task addOnCompleteListener(Activity activity, OnCompleteListener onCompleteListener) {
        Preconditions.checkNotNull(onCompleteListener);
        Preconditions.checkNotNull(activity);
        this.f51860d.mo52683a(activity, (Executor) null, onCompleteListener);
        return this;
    }

    public final Task addOnFailureListener(Activity activity, OnFailureListener onFailureListener) {
        Preconditions.checkNotNull(onFailureListener);
        Preconditions.checkNotNull(activity);
        this.f51859c.mo52683a(activity, (Executor) null, onFailureListener);
        return this;
    }

    public final Task addOnSuccessListener(Activity activity, OnSuccessListener onSuccessListener) {
        Preconditions.checkNotNull(activity);
        Preconditions.checkNotNull(onSuccessListener);
        this.f51858b.mo52683a(activity, (Executor) null, onSuccessListener);
        return this;
    }

    public final Object getResult(Class cls) throws Throwable {
        if (mo52673c() == null) {
            throw new IllegalStateException();
        } else if (!cls.isInstance(mo52673c().mo52680a())) {
            Exception a = mo52673c().mo52680a();
            if (a == null) {
                return mo52673c();
            }
            throw new RuntimeExecutionException(a);
        } else {
            throw ((Throwable) cls.cast(mo52673c().mo52680a()));
        }
    }
}
