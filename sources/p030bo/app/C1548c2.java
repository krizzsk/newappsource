package p030bo.app;

import android.content.Context;
import com.appboy.support.AppboyLogger;
import com.braze.Braze;

/* renamed from: bo.app.c2 */
public class C1548c2 implements C1524a2 {

    /* renamed from: b */
    public static final String f5578b = AppboyLogger.getBrazeLogTag(C1548c2.class);

    /* renamed from: a */
    public final Context f5579a;

    public C1548c2(Context context) {
        this.f5579a = context;
    }

    /* renamed from: a */
    public void mo5864a() {
        AppboyLogger.m5448d(f5578b, "Content cards enabled in server config. Requesting Content Cards refresh.");
        Braze.getInstance(this.f5579a).requestContentCardsRefresh(false);
    }
}
