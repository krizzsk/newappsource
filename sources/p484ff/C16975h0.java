package p484ff;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import java.util.concurrent.TimeUnit;

/* renamed from: ff.h0 */
public final class C16975h0 implements Runnable {

    /* renamed from: g */
    public static final Object f44064g = new Object();

    /* renamed from: h */
    public static Boolean f44065h;

    /* renamed from: i */
    public static Boolean f44066i;

    /* renamed from: b */
    public final Context f44067b;

    /* renamed from: c */
    public final C16990s f44068c;

    /* renamed from: d */
    public final PowerManager.WakeLock f44069d;

    /* renamed from: e */
    public final C16973g0 f44070e;

    /* renamed from: f */
    public final long f44071f;

    /* renamed from: ff.h0$a */
    public class C16976a extends BroadcastReceiver {

        /* renamed from: a */
        public C16975h0 f44072a;

        public C16976a(C16975h0 h0Var, C16975h0 h0Var2) {
            this.f44072a = h0Var2;
        }

        public final synchronized void onReceive(Context context, Intent intent) {
            C16975h0 h0Var = this.f44072a;
            if (h0Var != null) {
                if (h0Var.mo49606c()) {
                    Object obj = C16975h0.f44064g;
                    C16975h0 h0Var2 = this.f44072a;
                    h0Var2.f44070e.f44060f.schedule(h0Var2, 0, TimeUnit.SECONDS);
                    context.unregisterReceiver(this);
                    this.f44072a = null;
                }
            }
        }
    }

    public C16975h0(C16973g0 g0Var, Context context, C16990s sVar, long j) {
        this.f44070e = g0Var;
        this.f44067b = context;
        this.f44071f = j;
        this.f44068c = sVar;
        this.f44069d = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }

    /* renamed from: a */
    public static boolean m42815a(Context context) {
        boolean z;
        boolean booleanValue;
        synchronized (f44064g) {
            Boolean bool = f44066i;
            if (bool != null) {
                z = bool.booleanValue();
            } else if (bool != null) {
                z = bool.booleanValue();
            } else if (context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0) {
                z = true;
            } else {
                z = false;
            }
            Boolean valueOf = Boolean.valueOf(z);
            f44066i = valueOf;
            booleanValue = valueOf.booleanValue();
        }
        return booleanValue;
    }

    /* renamed from: b */
    public static boolean m42816b(Context context) {
        boolean z;
        boolean booleanValue;
        synchronized (f44064g) {
            Boolean bool = f44065h;
            if (bool != null) {
                z = bool.booleanValue();
            } else if (bool != null) {
                z = bool.booleanValue();
            } else if (context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0) {
                z = true;
            } else {
                z = false;
            }
            Boolean valueOf = Boolean.valueOf(z);
            f44065h = valueOf;
            booleanValue = valueOf.booleanValue();
        }
        return booleanValue;
    }

    /* renamed from: c */
    public final synchronized boolean mo49606c() {
        NetworkInfo networkInfo;
        boolean z;
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f44067b.getSystemService("connectivity");
        if (connectivityManager != null) {
            networkInfo = connectivityManager.getActiveNetworkInfo();
        } else {
            networkInfo = null;
        }
        if (networkInfo == null || !networkInfo.isConnected()) {
            z = false;
        } else {
            z = true;
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0036, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0038, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:?, code lost:
        r1.getMessage();
        r1 = r5.f44070e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0091, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:?, code lost:
        r1.f44061g = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x009b, code lost:
        if (m42816b(r5.f44067b) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x00ac, code lost:
        if (m42816b(r5.f44067b) != false) goto L_0x00ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:?, code lost:
        r5.f44069d.release();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x00b3, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:?, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    @android.annotation.SuppressLint({"Wakelock"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r5 = this;
            android.content.Context r0 = r5.f44067b
            boolean r0 = m42816b(r0)
            if (r0 == 0) goto L_0x000f
            android.os.PowerManager$WakeLock r0 = r5.f44069d
            long r1 = p484ff.C16970f.f44044a
            r0.acquire(r1)
        L_0x000f:
            r0 = 0
            ff.g0 r1 = r5.f44070e     // Catch:{ IOException -> 0x0038 }
            r2 = 1
            monitor-enter(r1)     // Catch:{ IOException -> 0x0038 }
            r1.f44061g = r2     // Catch:{ all -> 0x0089 }
            monitor-exit(r1)     // Catch:{ IOException -> 0x0038 }
            ff.s r1 = r5.f44068c     // Catch:{ IOException -> 0x0038 }
            boolean r1 = r1.mo49624b()     // Catch:{ IOException -> 0x0038 }
            if (r1 != 0) goto L_0x003a
            ff.g0 r1 = r5.f44070e     // Catch:{ IOException -> 0x0038 }
            monitor-enter(r1)     // Catch:{ IOException -> 0x0038 }
            r1.f44061g = r0     // Catch:{ all -> 0x0033 }
            monitor-exit(r1)     // Catch:{ IOException -> 0x0038 }
            android.content.Context r0 = r5.f44067b
            boolean r0 = m42816b(r0)
            if (r0 == 0) goto L_0x0032
            android.os.PowerManager$WakeLock r0 = r5.f44069d     // Catch:{ RuntimeException -> 0x0032 }
            r0.release()     // Catch:{ RuntimeException -> 0x0032 }
        L_0x0032:
            return
        L_0x0033:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ IOException -> 0x0038 }
            throw r2     // Catch:{ IOException -> 0x0038 }
        L_0x0036:
            r0 = move-exception
            goto L_0x00a6
        L_0x0038:
            r1 = move-exception
            goto L_0x008c
        L_0x003a:
            android.content.Context r1 = r5.f44067b     // Catch:{ IOException -> 0x0038 }
            boolean r1 = m42815a(r1)     // Catch:{ IOException -> 0x0038 }
            if (r1 == 0) goto L_0x0067
            boolean r1 = r5.mo49606c()     // Catch:{ IOException -> 0x0038 }
            if (r1 != 0) goto L_0x0067
            ff.h0$a r1 = new ff.h0$a     // Catch:{ IOException -> 0x0038 }
            r1.<init>(r5, r5)     // Catch:{ IOException -> 0x0038 }
            android.content.Context r2 = r5.f44067b     // Catch:{ IOException -> 0x0038 }
            android.content.IntentFilter r3 = new android.content.IntentFilter     // Catch:{ IOException -> 0x0038 }
            java.lang.String r4 = "android.net.conn.CONNECTIVITY_CHANGE"
            r3.<init>(r4)     // Catch:{ IOException -> 0x0038 }
            r2.registerReceiver(r1, r3)     // Catch:{ IOException -> 0x0038 }
            android.content.Context r0 = r5.f44067b
            boolean r0 = m42816b(r0)
            if (r0 == 0) goto L_0x0066
            android.os.PowerManager$WakeLock r0 = r5.f44069d     // Catch:{ RuntimeException -> 0x0066 }
            r0.release()     // Catch:{ RuntimeException -> 0x0066 }
        L_0x0066:
            return
        L_0x0067:
            ff.g0 r1 = r5.f44070e     // Catch:{ IOException -> 0x0038 }
            boolean r1 = r1.mo49603f()     // Catch:{ IOException -> 0x0038 }
            if (r1 == 0) goto L_0x0079
            ff.g0 r1 = r5.f44070e     // Catch:{ IOException -> 0x0038 }
            monitor-enter(r1)     // Catch:{ IOException -> 0x0038 }
            r1.f44061g = r0     // Catch:{ all -> 0x0076 }
            monitor-exit(r1)     // Catch:{ IOException -> 0x0038 }
            goto L_0x0080
        L_0x0076:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ IOException -> 0x0038 }
            throw r2     // Catch:{ IOException -> 0x0038 }
        L_0x0079:
            ff.g0 r1 = r5.f44070e     // Catch:{ IOException -> 0x0038 }
            long r2 = r5.f44071f     // Catch:{ IOException -> 0x0038 }
            r1.mo49604g(r2)     // Catch:{ IOException -> 0x0038 }
        L_0x0080:
            android.content.Context r0 = r5.f44067b
            boolean r0 = m42816b(r0)
            if (r0 == 0) goto L_0x00a2
            goto L_0x009d
        L_0x0089:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ IOException -> 0x0038 }
            throw r2     // Catch:{ IOException -> 0x0038 }
        L_0x008c:
            r1.getMessage()     // Catch:{ all -> 0x0036 }
            ff.g0 r1 = r5.f44070e     // Catch:{ all -> 0x0036 }
            monitor-enter(r1)     // Catch:{ all -> 0x0036 }
            r1.f44061g = r0     // Catch:{ all -> 0x00a3 }
            monitor-exit(r1)     // Catch:{ all -> 0x0036 }
            android.content.Context r0 = r5.f44067b
            boolean r0 = m42816b(r0)
            if (r0 == 0) goto L_0x00a2
        L_0x009d:
            android.os.PowerManager$WakeLock r0 = r5.f44069d     // Catch:{ RuntimeException -> 0x00a2 }
            r0.release()     // Catch:{ RuntimeException -> 0x00a2 }
        L_0x00a2:
            return
        L_0x00a3:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0036 }
            throw r0     // Catch:{ all -> 0x0036 }
        L_0x00a6:
            android.content.Context r1 = r5.f44067b
            boolean r1 = m42816b(r1)
            if (r1 == 0) goto L_0x00b3
            android.os.PowerManager$WakeLock r1 = r5.f44069d     // Catch:{ RuntimeException -> 0x00b3 }
            r1.release()     // Catch:{ RuntimeException -> 0x00b3 }
        L_0x00b3:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p484ff.C16975h0.run():void");
    }
}
