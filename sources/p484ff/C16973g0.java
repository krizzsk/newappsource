package p484ff;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.appcompat.widget.C0416i1;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessaging;
import com.usebutton.sdk.internal.util.DiskLruCache;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p241s0.C6302b;

/* renamed from: ff.g0 */
public final class C16973g0 {

    /* renamed from: i */
    public static final long f44053i = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: j */
    public static final /* synthetic */ int f44054j = 0;

    /* renamed from: a */
    public final Context f44055a;

    /* renamed from: b */
    public final C16990s f44056b;

    /* renamed from: c */
    public final C16987p f44057c;

    /* renamed from: d */
    public final FirebaseMessaging f44058d;

    /* renamed from: e */
    public final C6302b f44059e = new C6302b();

    /* renamed from: f */
    public final ScheduledExecutorService f44060f;

    /* renamed from: g */
    public boolean f44061g = false;

    /* renamed from: h */
    public final C16969e0 f44062h;

    public C16973g0(FirebaseMessaging firebaseMessaging, C16990s sVar, C16969e0 e0Var, C16987p pVar, Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f44058d = firebaseMessaging;
        this.f44056b = sVar;
        this.f44062h = e0Var;
        this.f44057c = pVar;
        this.f44055a = context;
        this.f44060f = scheduledExecutorService;
    }

    /* renamed from: a */
    public static <T> void m42808a(Task<T> task) throws IOException {
        try {
            Tasks.await(task, 30, TimeUnit.SECONDS);
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            } else if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else {
                throw new IOException(e);
            }
        } catch (InterruptedException | TimeoutException e2) {
            throw new IOException("SERVICE_NOT_AVAILABLE", e2);
        }
    }

    /* renamed from: b */
    public final void mo49599b(String str) throws IOException {
        C16987p pVar = this.f44057c;
        String blockingGetToken = this.f44058d.blockingGetToken();
        pVar.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str);
        m42808a(pVar.mo49619a(pVar.mo49621c(bundle, blockingGetToken, "/topics/" + str)));
    }

    /* renamed from: c */
    public final void mo49600c(String str) throws IOException {
        C16987p pVar = this.f44057c;
        String blockingGetToken = this.f44058d.blockingGetToken();
        pVar.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str);
        bundle.putString("delete", DiskLruCache.VERSION_1);
        m42808a(pVar.mo49619a(pVar.mo49621c(bundle, blockingGetToken, "/topics/" + str)));
    }

    /* renamed from: d */
    public final Task<Void> mo49601d(C16966d0 d0Var) {
        ArrayDeque arrayDeque;
        C16969e0 e0Var = this.f44062h;
        synchronized (e0Var) {
            C16960b0 b0Var = e0Var.f44042a;
            String str = d0Var.f44037c;
            b0Var.getClass();
            if (!TextUtils.isEmpty(str)) {
                if (!str.contains(b0Var.f44023c)) {
                    synchronized (b0Var.f44024d) {
                        if (b0Var.f44024d.add(str)) {
                            b0Var.f44025e.execute(new C0416i1(b0Var, 9));
                        }
                    }
                }
            }
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        synchronized (this.f44059e) {
            try {
                String str2 = d0Var.f44037c;
                if (this.f44059e.containsKey(str2)) {
                    arrayDeque = (ArrayDeque) this.f44059e.getOrDefault(str2, null);
                } else {
                    ArrayDeque arrayDeque2 = new ArrayDeque();
                    this.f44059e.put(str2, arrayDeque2);
                    arrayDeque = arrayDeque2;
                }
                arrayDeque.add(taskCompletionSource);
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        return taskCompletionSource.getTask();
    }

    /* renamed from: e */
    public final void mo49602e() {
        boolean z;
        boolean z2;
        if (this.f44062h.mo49596a() != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            synchronized (this) {
                z2 = this.f44061g;
            }
            if (!z2) {
                mo49604g(0);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0017, code lost:
        if (r5 == 83) goto L_0x0028;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001b, code lost:
        if (r5 == 85) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0024, code lost:
        if (r3.equals("U") == false) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0026, code lost:
        r4 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002e, code lost:
        if (r3.equals("S") == false) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0030, code lost:
        r4 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0031, code lost:
        if (r4 == 0) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0033, code lost:
        if (r4 == 1) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0036, code lost:
        mo49600c(r0.f44035a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003c, code lost:
        mo49599b(r0.f44035a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0042, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x004d, code lost:
        if ("SERVICE_NOT_AVAILABLE".equals(r1.getMessage()) != false) goto L_0x0064;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0060, code lost:
        if (r1.getMessage() != null) goto L_0x0063;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0063, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0064, code lost:
        r1.getMessage();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0067, code lost:
        r1 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
        r3 = r0.f44036b;
        r4 = 65535;
        r5 = r3.hashCode();
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo49603f() throws java.io.IOException {
        /*
            r7 = this;
        L_0x0000:
            monitor-enter(r7)
            ff.e0 r0 = r7.f44062h     // Catch:{ all -> 0x00c8 }
            ff.d0 r0 = r0.mo49596a()     // Catch:{ all -> 0x00c8 }
            r1 = 1
            if (r0 != 0) goto L_0x000c
            monitor-exit(r7)     // Catch:{ all -> 0x00c8 }
            return r1
        L_0x000c:
            monitor-exit(r7)     // Catch:{ all -> 0x00c8 }
            r2 = 0
            java.lang.String r3 = r0.f44036b     // Catch:{ IOException -> 0x0042 }
            r4 = -1
            int r5 = r3.hashCode()     // Catch:{ IOException -> 0x0042 }
            r6 = 83
            if (r5 == r6) goto L_0x0028
            r6 = 85
            if (r5 == r6) goto L_0x001e
            goto L_0x0031
        L_0x001e:
            java.lang.String r5 = "U"
            boolean r3 = r3.equals(r5)     // Catch:{ IOException -> 0x0042 }
            if (r3 == 0) goto L_0x0031
            r4 = 1
            goto L_0x0031
        L_0x0028:
            java.lang.String r5 = "S"
            boolean r3 = r3.equals(r5)     // Catch:{ IOException -> 0x0042 }
            if (r3 == 0) goto L_0x0031
            r4 = 0
        L_0x0031:
            if (r4 == 0) goto L_0x003c
            if (r4 == r1) goto L_0x0036
            goto L_0x0068
        L_0x0036:
            java.lang.String r3 = r0.f44035a     // Catch:{ IOException -> 0x0042 }
            r7.mo49600c(r3)     // Catch:{ IOException -> 0x0042 }
            goto L_0x0068
        L_0x003c:
            java.lang.String r3 = r0.f44035a     // Catch:{ IOException -> 0x0042 }
            r7.mo49599b(r3)     // Catch:{ IOException -> 0x0042 }
            goto L_0x0068
        L_0x0042:
            r1 = move-exception
            java.lang.String r3 = r1.getMessage()
            java.lang.String r4 = "SERVICE_NOT_AVAILABLE"
            boolean r3 = r4.equals(r3)
            if (r3 != 0) goto L_0x0064
            java.lang.String r3 = r1.getMessage()
            java.lang.String r4 = "INTERNAL_SERVER_ERROR"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x005c
            goto L_0x0064
        L_0x005c:
            java.lang.String r3 = r1.getMessage()
            if (r3 != 0) goto L_0x0063
            goto L_0x0067
        L_0x0063:
            throw r1
        L_0x0064:
            r1.getMessage()
        L_0x0067:
            r1 = 0
        L_0x0068:
            if (r1 != 0) goto L_0x006b
            return r2
        L_0x006b:
            ff.e0 r1 = r7.f44062h
            monitor-enter(r1)
            ff.b0 r2 = r1.f44042a     // Catch:{ all -> 0x00c5 }
            java.lang.String r3 = r0.f44037c     // Catch:{ all -> 0x00c5 }
            java.util.ArrayDeque<java.lang.String> r4 = r2.f44024d     // Catch:{ all -> 0x00c5 }
            monitor-enter(r4)     // Catch:{ all -> 0x00c5 }
            java.util.ArrayDeque<java.lang.String> r5 = r2.f44024d     // Catch:{ all -> 0x008a }
            boolean r3 = r5.remove(r3)     // Catch:{ all -> 0x008a }
            if (r3 == 0) goto L_0x008c
            java.util.concurrent.Executor r3 = r2.f44025e     // Catch:{ all -> 0x008a }
            androidx.appcompat.widget.i1 r5 = new androidx.appcompat.widget.i1     // Catch:{ all -> 0x008a }
            r6 = 9
            r5.<init>(r2, r6)     // Catch:{ all -> 0x008a }
            r3.execute(r5)     // Catch:{ all -> 0x008a }
            goto L_0x008c
        L_0x008a:
            r0 = move-exception
            goto L_0x00c3
        L_0x008c:
            monitor-exit(r4)     // Catch:{ all -> 0x008a }
            monitor-exit(r1)
            s0.b r2 = r7.f44059e
            monitor-enter(r2)
            java.lang.String r0 = r0.f44037c     // Catch:{ all -> 0x00c0 }
            s0.b r1 = r7.f44059e     // Catch:{ all -> 0x00c0 }
            boolean r1 = r1.containsKey(r0)     // Catch:{ all -> 0x00c0 }
            if (r1 != 0) goto L_0x009e
            monitor-exit(r2)     // Catch:{ all -> 0x00c0 }
            goto L_0x0000
        L_0x009e:
            s0.b r1 = r7.f44059e     // Catch:{ all -> 0x00c0 }
            r3 = 0
            java.lang.Object r1 = r1.getOrDefault(r0, r3)     // Catch:{ all -> 0x00c0 }
            java.util.ArrayDeque r1 = (java.util.ArrayDeque) r1     // Catch:{ all -> 0x00c0 }
            java.lang.Object r4 = r1.poll()     // Catch:{ all -> 0x00c0 }
            com.google.android.gms.tasks.TaskCompletionSource r4 = (com.google.android.gms.tasks.TaskCompletionSource) r4     // Catch:{ all -> 0x00c0 }
            if (r4 == 0) goto L_0x00b2
            r4.setResult(r3)     // Catch:{ all -> 0x00c0 }
        L_0x00b2:
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x00c0 }
            if (r1 == 0) goto L_0x00bd
            s0.b r1 = r7.f44059e     // Catch:{ all -> 0x00c0 }
            r1.remove(r0)     // Catch:{ all -> 0x00c0 }
        L_0x00bd:
            monitor-exit(r2)     // Catch:{ all -> 0x00c0 }
            goto L_0x0000
        L_0x00c0:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x00c0 }
            throw r0
        L_0x00c3:
            monitor-exit(r4)     // Catch:{ all -> 0x008a }
            throw r0     // Catch:{ all -> 0x00c5 }
        L_0x00c5:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x00c8:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x00c8 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p484ff.C16973g0.mo49603f():boolean");
    }

    /* renamed from: g */
    public final void mo49604g(long j) {
        this.f44060f.schedule(new C16975h0(this, this.f44055a, this.f44056b, Math.min(Math.max(30, 2 * j), f44053i)), j, TimeUnit.SECONDS);
        synchronized (this) {
            this.f44061g = true;
        }
    }
}
