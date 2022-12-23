package p030bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import com.appboy.support.AppboyLogger;
import com.appboy.support.DateTimeUtils;

/* renamed from: bo.app.o1 */
public class C1650o1 {

    /* renamed from: e */
    public static final String f5872e = AppboyLogger.getBrazeLogTag(C1650o1.class);

    /* renamed from: a */
    public final SharedPreferences f5873a;

    /* renamed from: b */
    public final C1558d4 f5874b;

    /* renamed from: c */
    public final C1600i0 f5875c;

    /* renamed from: d */
    public boolean f5876d = false;

    public C1650o1(Context context, C1600i0 i0Var, C1558d4 d4Var) {
        this.f5875c = i0Var;
        this.f5874b = d4Var;
        this.f5873a = context.getSharedPreferences("com.appboy.storage.sessions.messaging_session", 0);
    }

    /* renamed from: a */
    public boolean mo6261a() {
        long i = this.f5874b.mo6013i();
        if (i == -1 || this.f5876d) {
            return false;
        }
        long j = this.f5873a.getLong("messaging_session_timestamp", -1);
        long nowInSeconds = DateTimeUtils.nowInSeconds();
        String str = f5872e;
        StringBuilder g = C16759e.m42351g("Messaging session timeout: ", i, ", current diff: ");
        g.append(nowInSeconds - j);
        AppboyLogger.m5448d(str, g.toString());
        if (j + i < nowInSeconds) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public void mo6262b() {
        if (mo6261a()) {
            AppboyLogger.m5448d(f5872e, "Publishing new messaging session event.");
            this.f5875c.mo6134a(C1641n0.f5839a, C1641n0.class);
            this.f5876d = true;
            return;
        }
        AppboyLogger.m5448d(f5872e, "Messaging session not started.");
    }

    /* renamed from: c */
    public void mo6263c() {
        long nowInSeconds = DateTimeUtils.nowInSeconds();
        String str = f5872e;
        AppboyLogger.m5448d(str, "Messaging session stopped. Adding new messaging session timestamp: " + nowInSeconds);
        this.f5873a.edit().putLong("messaging_session_timestamp", nowInSeconds).apply();
        this.f5876d = false;
    }
}
