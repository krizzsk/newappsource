package p070e4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import p090g1.C4745d;
import p258t4.C6589c;
import p271u4.C6695f;
import p271u4.C6696g;
import p296w4.C6988f;

/* renamed from: e4.d */
public class C4549d implements C6695f, C6696g {

    /* renamed from: b */
    public long f15674b = System.currentTimeMillis();

    /* renamed from: c */
    public String f15675c;

    /* renamed from: d */
    public C4548c f15676d = new C4548c();

    /* renamed from: e */
    public HashMap f15677e = new HashMap();

    /* renamed from: f */
    public HashMap f15678f = new HashMap();

    /* renamed from: g */
    public C6589c f15679g = new C6589c();

    /* renamed from: h */
    public ScheduledThreadPoolExecutor f15680h;

    /* renamed from: i */
    public ArrayList f15681i = new ArrayList(1);

    /* renamed from: j */
    public C4745d f15682j;

    /* renamed from: k */
    public boolean f15683k;

    public C4549d() {
        mo20060c(new HashMap(), "FA_FILENAME_COLLISION_MAP");
        mo20060c(new HashMap(), "RFA_FILENAME_PATTERN_COLLISION_MAP");
    }

    /* renamed from: b */
    public final Object mo20059b(String str) {
        return this.f15678f.get(str);
    }

    /* renamed from: c */
    public final void mo20060c(Object obj, String str) {
        this.f15678f.put(str, obj);
    }

    /* renamed from: e */
    public void mo20061e(String str, String str2) {
        this.f15677e.put(str, str2);
    }

    public final String getProperty(String str) {
        if ("CONTEXT_NAME".equals(str)) {
            return this.f15675c;
        }
        return (String) this.f15677e.get(str);
    }

    /* renamed from: h */
    public void mo20063h(String str) throws IllegalStateException {
        if (str == null || !str.equals(this.f15675c)) {
            String str2 = this.f15675c;
            if (str2 == null || "default".equals(str2)) {
                this.f15675c = str;
                return;
            }
            throw new IllegalStateException("Context has been already given a name");
        }
    }

    public final boolean isStarted() {
        return this.f15683k;
    }

    public void stop() {
        synchronized (this) {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.f15680h;
            if (scheduledThreadPoolExecutor != null) {
                C6988f.C6989a aVar = C6988f.f21758a;
                scheduledThreadPoolExecutor.shutdownNow();
                this.f15680h = null;
            }
        }
        this.f15683k = false;
    }
}
