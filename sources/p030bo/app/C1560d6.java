package p030bo.app;

import android.util.Base64;
import com.appboy.support.AppboyLogger;
import com.appboy.support.DateTimeUtils;
import com.appboy.support.StringUtils;

/* renamed from: bo.app.d6 */
public abstract class C1560d6 implements C1721w5 {

    /* renamed from: d */
    public static final String f5620d = AppboyLogger.getBrazeLogTag(C1560d6.class);

    /* renamed from: a */
    public final long f5621a;

    /* renamed from: b */
    public final long f5622b;

    /* renamed from: c */
    public C1594h2 f5623c;

    public C1560d6() {
        long nowInMilliseconds = DateTimeUtils.nowInMilliseconds();
        this.f5622b = nowInMilliseconds;
        this.f5621a = nowInMilliseconds / 1000;
    }

    /* renamed from: a */
    public C1594h2 mo6019a() {
        return this.f5623c;
    }

    /* renamed from: c */
    public long mo6021c() {
        return this.f5621a;
    }

    /* renamed from: e */
    public long mo6022e() {
        return this.f5622b;
    }

    /* renamed from: a */
    public String mo6020a(String str) {
        if (StringUtils.isNullOrBlank(str)) {
            return null;
        }
        try {
            return new String(Base64.decode(str, 0)).split("_")[0];
        } catch (Exception e) {
            String str2 = f5620d;
            AppboyLogger.m5452e(str2, "Unexpected error decoding Base64 encoded campaign Id " + str, e);
            return null;
        }
    }

    public C1560d6(C1594h2 h2Var) {
        this();
        this.f5623c = h2Var;
    }
}
