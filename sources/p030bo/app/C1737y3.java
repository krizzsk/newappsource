package p030bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import com.appboy.support.AppboyLogger;
import com.appboy.support.DateTimeUtils;
import com.appboy.support.StringUtils;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: bo.app.y3 */
public class C1737y3 {

    /* renamed from: b */
    public static final String f6105b = AppboyLogger.getBrazeLogTag(C1737y3.class);

    /* renamed from: c */
    public static final long f6106c = TimeUnit.DAYS.toMillis(7);

    /* renamed from: a */
    public final SharedPreferences f6107a;

    public C1737y3(Context context, String str, String str2) {
        StringBuilder k = C13555b.m33972k("com.appboy.storage.event_data_validator");
        k.append(StringUtils.getCacheFileSuffix(context, str, str2));
        this.f6107a = context.getSharedPreferences(k.toString(), 0);
        mo6476a();
    }

    /* renamed from: a */
    public final void mo6478a(String str) {
        this.f6107a.edit().remove(str).apply();
    }

    /* renamed from: b */
    public boolean mo6479b(C1594h2 h2Var) {
        if (h2Var.mo6142j() != C1530b0.PUSH_CLICKED) {
            return true;
        }
        mo6476a();
        String a = m4943a(h2Var);
        if (a == null) {
            String str = f6105b;
            AppboyLogger.m5448d(str, "Failed to generate cache key for event: " + h2Var);
            return true;
        } else if (mo6480b(a)) {
            String str2 = f6105b;
            AppboyLogger.m5448d(str2, "Event already seen in cache. Ignoring duplicate: " + h2Var);
            return false;
        } else {
            mo6477a(DateTimeUtils.nowInMilliseconds() + f6106c, a);
            return true;
        }
    }

    /* renamed from: a */
    public void mo6477a(long j, String str) {
        this.f6107a.edit().putLong(str, j).apply();
    }

    /* renamed from: a */
    public void mo6476a() {
        long nowInMilliseconds = DateTimeUtils.nowInMilliseconds();
        for (Map.Entry next : this.f6107a.getAll().entrySet()) {
            try {
                if (nowInMilliseconds >= ((Long) next.getValue()).longValue()) {
                    mo6478a((String) next.getKey());
                }
            } catch (Exception unused) {
                String str = f6105b;
                AppboyLogger.m5448d(str, "Failed to get expiration time. Deleting entry: " + next);
                mo6478a((String) next.getKey());
            }
        }
    }

    /* renamed from: b */
    public final boolean mo6480b(String str) {
        return this.f6107a.contains(str);
    }

    /* renamed from: a */
    public static String m4943a(C1594h2 h2Var) {
        String a = C1701u2.m4771a(h2Var);
        if (a == null) {
            return null;
        }
        return h2Var.mo6142j() + a;
    }
}
