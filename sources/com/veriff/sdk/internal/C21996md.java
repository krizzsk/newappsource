package com.veriff.sdk.internal;

import android.app.ActivityManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Process;
import cf0.C21137k;
import com.appboy.support.ValidationUtils;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.C23816b;
import kotlin.collections.C23825c;
import kotlin.jvm.internal.Lambda;
import kotlin.sequences.C24177b;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.text.C24179b;
import lf0.C24236l;
import mf0.C24362h;
import th0.C25003h;
import uh0.C25081h;

@Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000(\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\u001a\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u0002\u001a\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u0002\u001a\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0002\u001a\b\u0010\f\u001a\u00020\u0003H\u0002\u001a\u0012\u0010\r\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u000e\u001a\u00020\u0003H\u0002\u001a\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0011H\u0002\u001a\b\u0010\u0012\u001a\u00020\u0003H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0003XT¢\u0006\u0002\n\u0000¨\u0006\u0013"}, mo59060d2 = {"COLLECTOR_TIMEOUT", "", "COLLECTOR_URL", "", "TAG", "appGUID", "context", "Landroid/content/Context;", "getCurrentProcessName", "getIPAddress", "useIPv4", "", "getMACAddress", "getNameFromIp", "ip", "intToIp", "addr", "", "isRooted", "veriff-library_dist"}, mo59061k = 2, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.md */
public final class C21996md {

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo59060d2 = {"Ljava/net/NetworkInterface;", "kotlin.jvm.PlatformType", "it", "", "invoke", "(Ljava/net/NetworkInterface;)Z", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.md$a */
    public static final class C21997a extends Lambda implements C24236l<NetworkInterface, Boolean> {

        /* renamed from: a */
        public static final C21997a f55518a = new C21997a();

        public C21997a() {
            super(1);
        }

        /* renamed from: a */
        public final boolean mo55817a(NetworkInterface networkInterface) {
            C24362h.m61210e(networkInterface, "it");
            return C25081h.m62830A(networkInterface.getName(), "wlan0", true);
        }

        public /* synthetic */ Object invoke(Object obj) {
            return Boolean.valueOf(mo55817a((NetworkInterface) obj));
        }
    }

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u0010\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00040\u00040\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, mo59060d2 = {"Ljava/net/NetworkInterface;", "kotlin.jvm.PlatformType", "it", "Lth0/h;", "Ljava/net/InetAddress;", "invoke", "(Ljava/net/NetworkInterface;)Lth0/h;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.md$b */
    public static final class C21998b extends Lambda implements C24236l<NetworkInterface, C25003h<? extends InetAddress>> {

        /* renamed from: a */
        public static final C21998b f55519a = new C21998b();

        public C21998b() {
            super(1);
        }

        /* renamed from: a */
        public final C25003h<InetAddress> invoke(NetworkInterface networkInterface) {
            C24362h.m61210e(networkInterface, "it");
            Enumeration<InetAddress> inetAddresses = networkInterface.getInetAddresses();
            C24362h.m61210e(inetAddresses, "it.inetAddresses");
            return SequencesKt__SequencesKt.m60537X(new C21137k(inetAddresses));
        }
    }

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo59060d2 = {"Ljava/net/InetAddress;", "kotlin.jvm.PlatformType", "it", "", "invoke", "(Ljava/net/InetAddress;)Z", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.md$c */
    public static final class C21999c extends Lambda implements C24236l<InetAddress, Boolean> {

        /* renamed from: a */
        public static final C21999c f55520a = new C21999c();

        public C21999c() {
            super(1);
        }

        /* renamed from: a */
        public final boolean mo55819a(InetAddress inetAddress) {
            C24362h.m61210e(inetAddress, "it");
            return !inetAddress.isLoopbackAddress();
        }

        public /* synthetic */ Object invoke(Object obj) {
            return Boolean.valueOf(mo55819a((InetAddress) obj));
        }
    }

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo59060d2 = {"Ljava/net/InetAddress;", "kotlin.jvm.PlatformType", "it", "", "invoke", "(Ljava/net/InetAddress;)Z", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.md$d */
    public static final class C22000d extends Lambda implements C24236l<InetAddress, Boolean> {

        /* renamed from: a */
        public final /* synthetic */ boolean f55521a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22000d(boolean z) {
            super(1);
            this.f55521a = z;
        }

        /* renamed from: a */
        public final boolean mo55820a(InetAddress inetAddress) {
            boolean z = this.f55521a;
            return (z && (inetAddress instanceof Inet4Address)) || (!z && (inetAddress instanceof Inet6Address));
        }

        public /* synthetic */ Object invoke(Object obj) {
            return Boolean.valueOf(mo55820a((InetAddress) obj));
        }
    }

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo59060d2 = {"Ljava/net/InetAddress;", "kotlin.jvm.PlatformType", "it", "", "invoke", "(Ljava/net/InetAddress;)Ljava/lang/String;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.md$e */
    public static final class C22001e extends Lambda implements C24236l<InetAddress, String> {

        /* renamed from: a */
        public static final C22001e f55522a = new C22001e();

        public C22001e() {
            super(1);
        }

        /* renamed from: a */
        public final String invoke(InetAddress inetAddress) {
            C24362h.m61210e(inetAddress, "it");
            String hostAddress = inetAddress.getHostAddress();
            C24362h.m61210e(hostAddress, "it.hostAddress");
            Locale locale = Locale.US;
            C24362h.m61210e(locale, "Locale.US");
            String upperCase = hostAddress.toUpperCase(locale);
            C24362h.m61210e(upperCase, "(this as java.lang.String).toUpperCase(locale)");
            return (String) C23825c.m58513j0(C24179b.m60577Y(upperCase, new String[]{"%"}, 2, 2));
        }
    }

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo59060d2 = {"Ljava/net/NetworkInterface;", "kotlin.jvm.PlatformType", "it", "", "invoke", "(Ljava/net/NetworkInterface;)Z", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.md$f */
    public static final class C22002f extends Lambda implements C24236l<NetworkInterface, Boolean> {

        /* renamed from: a */
        public static final C22002f f55523a = new C22002f();

        public C22002f() {
            super(1);
        }

        /* renamed from: a */
        public final boolean mo55822a(NetworkInterface networkInterface) {
            C24362h.m61210e(networkInterface, "it");
            return C25081h.m62830A(networkInterface.getName(), "wlan0", true);
        }

        public /* synthetic */ Object invoke(Object obj) {
            return Boolean.valueOf(mo55822a((NetworkInterface) obj));
        }
    }

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo59060d2 = {"Ljava/net/NetworkInterface;", "kotlin.jvm.PlatformType", "it", "", "invoke", "(Ljava/net/NetworkInterface;)Z", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.md$g */
    public static final class C22003g extends Lambda implements C24236l<NetworkInterface, Boolean> {

        /* renamed from: a */
        public static final C22003g f55524a = new C22003g();

        public C22003g() {
            super(1);
        }

        /* renamed from: a */
        public final boolean mo55823a(NetworkInterface networkInterface) {
            C24362h.m61210e(networkInterface, "it");
            return networkInterface.getHardwareAddress() != null;
        }

        public /* synthetic */ Object invoke(Object obj) {
            return Boolean.valueOf(mo55823a((NetworkInterface) obj));
        }
    }

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo59060d2 = {"Ljava/net/NetworkInterface;", "kotlin.jvm.PlatformType", "it", "", "invoke", "(Ljava/net/NetworkInterface;)Ljava/lang/String;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.md$h */
    public static final class C22004h extends Lambda implements C24236l<NetworkInterface, String> {

        /* renamed from: a */
        public static final C22004h f55525a = new C22004h();

        public C22004h() {
            super(1);
        }

        /* renamed from: a */
        public final String invoke(NetworkInterface networkInterface) {
            C24362h.m61210e(networkInterface, "it");
            byte[] hardwareAddress = networkInterface.getHardwareAddress();
            C24362h.m61210e(hardwareAddress, "it.hardwareAddress");
            return C23816b.m58443Y0(hardwareAddress, ":", C220051.f55526a);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static final synchronized String m53649c(Context context) {
        String string;
        synchronized (C21996md.class) {
            SharedPreferences sharedPreferences = context.getSharedPreferences("io.probity.sdk.appDetails", 0);
            string = sharedPreferences.getString("appGUID", (String) null);
            if (string == null) {
                string = "PROBITY-" + UUID.randomUUID().toString();
                sharedPreferences.edit().putString("appGUID", string).apply();
            }
        }
        return string;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static final String m53651d(Context context) {
        T t;
        String str;
        boolean z;
        Object systemService = context.getSystemService("activity");
        if (systemService != null) {
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) systemService).getRunningAppProcesses();
            if (runningAppProcesses == null) {
                return "";
            }
            Iterator<T> it = runningAppProcesses.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                if (((ActivityManager.RunningAppProcessInfo) t).pid == Process.myPid()) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    break;
                }
            }
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) t;
            if (runningAppProcessInfo == null || (str = runningAppProcessInfo.processName) == null) {
                return "";
            }
            return str;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.app.ActivityManager");
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final String m53644b(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(i & ValidationUtils.APPBOY_STRING_MAX_LENGTH);
        sb.append('.');
        sb.append((i >>> 8) & ValidationUtils.APPBOY_STRING_MAX_LENGTH);
        sb.append('.');
        sb.append((i >>> 16) & ValidationUtils.APPBOY_STRING_MAX_LENGTH);
        sb.append('.');
        sb.append((i >>> 24) & ValidationUtils.APPBOY_STRING_MAX_LENGTH);
        return sb.toString();
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static final String m53648c() {
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            C24362h.m61210e(networkInterfaces, "NetworkInterface.getNetworkInterfaces()");
            String str = (String) C24177b.m60546g0(C24177b.m60549j0(C24177b.m60543d0(C24177b.m60543d0(SequencesKt__SequencesKt.m60537X(new C21137k(networkInterfaces)), C22002f.f55523a), C22003g.f55524a), C22004h.f55525a));
            return str != null ? str : "";
        } catch (SocketException unused) {
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0060, code lost:
        if (0 == 0) goto L_0x0063;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String m53650d() {
        /*
            java.lang.String r0 = "/system/app/Superuser.apk"
            java.lang.String r1 = "/sbin/su"
            java.lang.String r2 = "/system/bin/su"
            java.lang.String r3 = "/system/xbin/su"
            java.lang.String r4 = "/data/local/xbin/su"
            java.lang.String r5 = "/data/local/bin/su"
            java.lang.String r6 = "/system/sd/xbin/su"
            java.lang.String r7 = "/system/bin/failsafe/su"
            java.lang.String r8 = "/data/local/su"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1, r2, r3, r4, r5, r6, r7, r8}
            r1 = 0
            r2 = 0
            r3 = 0
        L_0x0019:
            r4 = 9
            if (r2 >= r4) goto L_0x002f
            r4 = r0[r2]
            java.io.File r5 = new java.io.File
            r5.<init>(r4)
            boolean r4 = r5.exists()
            if (r4 == 0) goto L_0x002c
            int r3 = r3 + 1
        L_0x002c:
            int r2 = r2 + 1
            goto L_0x0019
        L_0x002f:
            r0 = 0
            java.lang.Runtime r2 = java.lang.Runtime.getRuntime()     // Catch:{ all -> 0x005f }
            java.lang.String r4 = "/system/xbin/which"
            java.lang.String r5 = "su"
            java.lang.String[] r4 = new java.lang.String[]{r4, r5}     // Catch:{ all -> 0x005f }
            java.lang.Process r0 = r2.exec(r4)     // Catch:{ all -> 0x005f }
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ all -> 0x005f }
            java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch:{ all -> 0x005f }
            java.lang.String r5 = "process"
            mf0.C24362h.m61210e(r0, r5)     // Catch:{ all -> 0x005f }
            java.io.InputStream r5 = r0.getInputStream()     // Catch:{ all -> 0x005f }
            r4.<init>(r5)     // Catch:{ all -> 0x005f }
            r2.<init>(r4)     // Catch:{ all -> 0x005f }
            java.lang.String r2 = r2.readLine()     // Catch:{ all -> 0x005f }
            if (r2 == 0) goto L_0x005b
            int r3 = r3 + 1
        L_0x005b:
            r0.destroy()
            goto L_0x0063
        L_0x005f:
            if (r0 == 0) goto L_0x0063
            goto L_0x005b
        L_0x0063:
            r0 = 1
            java.lang.String[] r0 = new java.lang.String[r0]
            java.lang.String r2 = java.lang.String.valueOf(r3)
            r0[r1] = r2
            java.util.ArrayList r0 = p583jk.C17875h.m44299h(r0)
            java.lang.String r1 = ","
            java.lang.String r0 = android.text.TextUtils.join(r1, r0)
            java.lang.String r1 = "TextUtils.join(\",\", arra…stOf(suFound.toString()))"
            mf0.C24362h.m61210e(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.veriff.sdk.internal.C21996md.m53650d():java.lang.String");
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final String m53647b(boolean z) {
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            C24362h.m61210e(networkInterfaces, "NetworkInterface.getNetworkInterfaces()");
            String str = (String) C24177b.m60546g0(C24177b.m60549j0(C24177b.m60543d0(C24177b.m60543d0(C24177b.m60547h0(C24177b.m60543d0(SequencesKt__SequencesKt.m60537X(new C21137k(networkInterfaces)), C21997a.f55518a), C21998b.f55519a), C21999c.f55520a), new C22000d(z)), C22001e.f55522a));
            return str != null ? str : "";
        } catch (SocketException unused) {
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final String m53646b(String str) {
        try {
            InetAddress byName = InetAddress.getByName(str);
            C24362h.m61210e(byName, "InetAddress.getByName(ip)");
            return byName.getHostName();
        } catch (Exception unused) {
            return str;
        }
    }
}
