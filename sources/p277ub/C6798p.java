package p277ub;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.telephony.PhoneStateListener;
import android.telephony.ServiceState;
import android.telephony.TelephonyDisplayInfo;
import java.lang.ref.WeakReference;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: ub.p */
public final class C6798p {

    /* renamed from: e */
    public static C6798p f21027e;

    /* renamed from: a */
    public final Handler f21028a = new Handler(Looper.getMainLooper());

    /* renamed from: b */
    public final CopyOnWriteArrayList<WeakReference<C6799a>> f21029b = new CopyOnWriteArrayList<>();

    /* renamed from: c */
    public final Object f21030c = new Object();

    /* renamed from: d */
    public int f21031d = 0;

    /* renamed from: ub.p$a */
    public interface C6799a {
        /* renamed from: a */
        void mo22833a(int i);
    }

    /* renamed from: ub.p$b */
    public final class C6800b extends BroadcastReceiver {
        public C6800b() {
        }

        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* JADX WARNING: Removed duplicated region for block: B:35:0x006c A[Catch:{ RuntimeException -> 0x0079 }] */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x0070 A[Catch:{ RuntimeException -> 0x0079 }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onReceive(android.content.Context r9, android.content.Intent r10) {
            /*
                r8 = this;
                java.lang.String r10 = "connectivity"
                java.lang.Object r10 = r9.getSystemService(r10)
                android.net.ConnectivityManager r10 = (android.net.ConnectivityManager) r10
                r0 = 5
                r1 = 1
                r2 = 0
                r3 = 4
                r4 = 6
                r5 = 29
                r6 = 9
                if (r10 != 0) goto L_0x0014
                goto L_0x004f
            L_0x0014:
                android.net.NetworkInfo r10 = r10.getActiveNetworkInfo()     // Catch:{ SecurityException -> 0x004e }
                if (r10 == 0) goto L_0x004c
                boolean r7 = r10.isConnected()
                if (r7 != 0) goto L_0x0021
                goto L_0x004c
            L_0x0021:
                int r7 = r10.getType()
                if (r7 == 0) goto L_0x0036
                if (r7 == r1) goto L_0x0046
                if (r7 == r3) goto L_0x0036
                if (r7 == r0) goto L_0x0036
                if (r7 == r4) goto L_0x0048
                if (r7 == r6) goto L_0x0034
                r3 = 8
                goto L_0x0050
            L_0x0034:
                r3 = 7
                goto L_0x0050
            L_0x0036:
                int r10 = r10.getSubtype()
                switch(r10) {
                    case 1: goto L_0x004a;
                    case 2: goto L_0x004a;
                    case 3: goto L_0x0050;
                    case 4: goto L_0x0050;
                    case 5: goto L_0x0050;
                    case 6: goto L_0x0050;
                    case 7: goto L_0x0050;
                    case 8: goto L_0x0050;
                    case 9: goto L_0x0050;
                    case 10: goto L_0x0050;
                    case 11: goto L_0x0050;
                    case 12: goto L_0x0050;
                    case 13: goto L_0x0048;
                    case 14: goto L_0x0050;
                    case 15: goto L_0x0050;
                    case 16: goto L_0x003d;
                    case 17: goto L_0x0050;
                    case 18: goto L_0x0046;
                    case 19: goto L_0x003d;
                    case 20: goto L_0x003f;
                    default: goto L_0x003d;
                }
            L_0x003d:
                r3 = 6
                goto L_0x0050
            L_0x003f:
                int r10 = p277ub.C6774a0.f20959a
                if (r10 < r5) goto L_0x004f
                r3 = 9
                goto L_0x0050
            L_0x0046:
                r3 = 2
                goto L_0x0050
            L_0x0048:
                r3 = 5
                goto L_0x0050
            L_0x004a:
                r3 = 3
                goto L_0x0050
            L_0x004c:
                r3 = 1
                goto L_0x0050
            L_0x004e:
            L_0x004f:
                r3 = 0
            L_0x0050:
                if (r3 != r0) goto L_0x0079
                int r10 = p277ub.C6774a0.f20959a
                if (r10 < r5) goto L_0x0079
                java.lang.String r0 = "phone"
                java.lang.Object r9 = r9.getSystemService(r0)     // Catch:{ RuntimeException -> 0x0079 }
                android.telephony.TelephonyManager r9 = (android.telephony.TelephonyManager) r9     // Catch:{ RuntimeException -> 0x0079 }
                r9.getClass()     // Catch:{ RuntimeException -> 0x0079 }
                ub.p$c r0 = new ub.p$c     // Catch:{ RuntimeException -> 0x0079 }
                ub.p r4 = p277ub.C6798p.this     // Catch:{ RuntimeException -> 0x0079 }
                r0.<init>()     // Catch:{ RuntimeException -> 0x0079 }
                r4 = 31
                if (r10 >= r4) goto L_0x0070
                r9.listen(r0, r1)     // Catch:{ RuntimeException -> 0x0079 }
                goto L_0x0075
            L_0x0070:
                r10 = 1048576(0x100000, float:1.469368E-39)
                r9.listen(r0, r10)     // Catch:{ RuntimeException -> 0x0079 }
            L_0x0075:
                r9.listen(r0, r2)     // Catch:{ RuntimeException -> 0x0079 }
                return
            L_0x0079:
                ub.p r9 = p277ub.C6798p.this
                p277ub.C6798p.m16003a(r9, r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p277ub.C6798p.C6800b.onReceive(android.content.Context, android.content.Intent):void");
        }
    }

    /* renamed from: ub.p$c */
    public class C6801c extends PhoneStateListener {
        public C6801c() {
        }

        public final void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
            boolean z;
            int i;
            int overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
            if (overrideNetworkType == 3 || overrideNetworkType == 4) {
                z = true;
            } else {
                z = false;
            }
            C6798p pVar = C6798p.this;
            if (z) {
                i = 10;
            } else {
                i = 5;
            }
            C6798p.m16003a(pVar, i);
        }

        public final void onServiceStateChanged(ServiceState serviceState) {
            String str;
            boolean z;
            int i;
            if (serviceState == null) {
                str = "";
            } else {
                str = serviceState.toString();
            }
            if (str.contains("nrState=CONNECTED") || str.contains("nrState=NOT_RESTRICTED")) {
                z = true;
            } else {
                z = false;
            }
            C6798p pVar = C6798p.this;
            if (z) {
                i = 10;
            } else {
                i = 5;
            }
            C6798p.m16003a(pVar, i);
        }
    }

    public C6798p(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(new C6800b(), intentFilter);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0016, code lost:
        if (r0.hasNext() == false) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0018, code lost:
        r1 = r0.next();
        r2 = (p277ub.C6798p.C6799a) r1.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0024, code lost:
        if (r2 == null) goto L_0x002a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0026, code lost:
        r2.mo22833a(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002a, code lost:
        r3.f21029b.remove(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x000c, code lost:
        r0 = r3.f21029b.iterator();
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m16003a(p277ub.C6798p r3, int r4) {
        /*
            java.lang.Object r0 = r3.f21030c
            monitor-enter(r0)
            int r1 = r3.f21031d     // Catch:{ all -> 0x0031 }
            if (r1 != r4) goto L_0x0009
            monitor-exit(r0)     // Catch:{ all -> 0x0031 }
            goto L_0x0030
        L_0x0009:
            r3.f21031d = r4     // Catch:{ all -> 0x0031 }
            monitor-exit(r0)     // Catch:{ all -> 0x0031 }
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<ub.p$a>> r0 = r3.f21029b
            java.util.Iterator r0 = r0.iterator()
        L_0x0012:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0030
            java.lang.Object r1 = r0.next()
            java.lang.ref.WeakReference r1 = (java.lang.ref.WeakReference) r1
            java.lang.Object r2 = r1.get()
            ub.p$a r2 = (p277ub.C6798p.C6799a) r2
            if (r2 == 0) goto L_0x002a
            r2.mo22833a(r4)
            goto L_0x0012
        L_0x002a:
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<ub.p$a>> r2 = r3.f21029b
            r2.remove(r1)
            goto L_0x0012
        L_0x0030:
            return
        L_0x0031:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0031 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p277ub.C6798p.m16003a(ub.p, int):void");
    }
}
