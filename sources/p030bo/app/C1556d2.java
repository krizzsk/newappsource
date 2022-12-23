package p030bo.app;

import com.appboy.support.AppboyLogger;
import com.appboy.support.DateTimeUtils;
import com.appboy.support.StringUtils;
import com.braze.enums.BrazeDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import p001a0.C0016g;
import p358af.C13437d;

/* renamed from: bo.app.d2 */
public class C1556d2 {

    /* renamed from: f */
    public static final String f5595f = AppboyLogger.getBrazeLogTag(C1556d2.class);

    /* renamed from: a */
    public final List<String> f5596a = new ArrayList(32);

    /* renamed from: b */
    public long f5597b;

    /* renamed from: c */
    public boolean f5598c = false;

    /* renamed from: d */
    public final Object f5599d = new Object();

    /* renamed from: e */
    public C1707v1 f5600e;

    /* renamed from: b */
    public static String m4052b(String str, String str2, Throwable th) {
        if (StringUtils.isNullOrBlank(str)) {
            return null;
        }
        if (StringUtils.isNullOrBlank(str2) && (th == null || StringUtils.isNullOrBlank(th.getMessage()))) {
            return null;
        }
        String str3 = m4053c() + " " + str;
        if (str2 != null) {
            str3 = C13437d.m33706k(str3, ": ", str2);
        }
        if (th != null) {
            str3 = C0016g.m32p(th, C0016g.m36t(str3, ": "));
        }
        return str3.substring(0, Math.min(str3.length(), 1000));
    }

    /* renamed from: c */
    public static String m4053c() {
        return DateTimeUtils.formatDate(new Date(), BrazeDateFormat.ANDROID_LOGCAT);
    }

    /* renamed from: a */
    public void mo5966a(String str, String str2, Throwable th) {
        if (this.f5598c) {
            if ((str2 == null || (!str2.contains("device_logs") && !str2.contains("test_user_data"))) && !mo5968a()) {
                synchronized (this.f5599d) {
                    if (this.f5596a.size() >= 32) {
                        mo5969b();
                    }
                    if (this.f5596a.isEmpty() || this.f5597b == 0) {
                        this.f5597b = DateTimeUtils.nowInSeconds();
                    }
                    String b = m4052b(str, str2, th);
                    if (b != null) {
                        this.f5596a.add(b);
                    }
                }
            }
        }
    }

    /* renamed from: d */
    public boolean mo5970d() {
        return this.f5598c;
    }

    /* renamed from: a */
    public void mo5967a(boolean z) {
        synchronized (this.f5599d) {
            if (!z) {
                this.f5596a.clear();
            } else {
                AppboyLogger.m5456i(f5595f, "Test user device logging is enabled.", false);
            }
        }
        this.f5598c = z;
    }

    /* renamed from: a */
    public void mo5965a(C1707v1 v1Var) {
        this.f5600e = v1Var;
    }

    /* renamed from: a */
    public void mo5964a(C1525a3 a3Var) {
        mo5967a(a3Var.mo5892k());
    }

    /* renamed from: a */
    public final boolean mo5968a() {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        if (stackTrace == null || stackTrace.length == 0) {
            return true;
        }
        StackTraceElement stackTraceElement = stackTrace[1];
        String methodName = stackTraceElement.getMethodName();
        String className = stackTraceElement.getClassName();
        int i = 0;
        for (StackTraceElement stackTraceElement2 : stackTrace) {
            if (stackTraceElement2.getClassName().equals(className) && stackTraceElement2.getMethodName().equals(methodName)) {
                i++;
            }
        }
        if (i != 1) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public void mo5969b() {
        synchronized (this.f5599d) {
            if (this.f5600e != null) {
                this.f5600e.mo6239a((List<String>) new ArrayList(this.f5596a), this.f5597b);
            }
            this.f5596a.clear();
            this.f5597b = 0;
        }
    }
}
