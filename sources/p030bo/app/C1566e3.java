package p030bo.app;

import androidx.activity.C0194b;
import androidx.appcompat.widget.C0441n1;
import com.appboy.events.BrazeNetworkFailureEvent;
import com.appboy.events.ContentCardsUpdatedEvent;
import com.appboy.events.FeedUpdatedEvent;
import com.appboy.models.IInAppMessage;
import com.appboy.support.AppboyLogger;
import com.appboy.support.HandlerUtils;
import java.net.URI;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* renamed from: bo.app.e3 */
public class C1566e3 implements Runnable {

    /* renamed from: k */
    public static final String f5656k = AppboyLogger.getBrazeLogTag(C1566e3.class);

    /* renamed from: a */
    public final C1620k3 f5657a;

    /* renamed from: b */
    public final C1600i0 f5658b;

    /* renamed from: c */
    public final C1600i0 f5659c;

    /* renamed from: d */
    public final Map<String, String> f5660d;

    /* renamed from: e */
    public final C1658p f5661e;

    /* renamed from: f */
    public final C1744z3 f5662f;

    /* renamed from: g */
    public final C1558d4 f5663g;

    /* renamed from: h */
    public final C1702u3 f5664h;

    /* renamed from: i */
    public final C1707v1 f5665i;

    /* renamed from: j */
    public final Executor f5666j;

    /* renamed from: bo.app.e3$a */
    public static /* synthetic */ class C1567a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f5667a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                bo.app.d0[] r0 = p030bo.app.C1554d0.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f5667a = r0
                bo.app.d0 r1 = p030bo.app.C1554d0.GET     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f5667a     // Catch:{ NoSuchFieldError -> 0x001d }
                bo.app.d0 r1 = p030bo.app.C1554d0.POST     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p030bo.app.C1566e3.C1567a.<clinit>():void");
        }
    }

    public C1566e3(Executor executor, C1620k3 k3Var, C1658p pVar, C1600i0 i0Var, C1600i0 i0Var2, C1744z3 z3Var, C1707v1 v1Var, C1558d4 d4Var, C1702u3 u3Var) {
        this.f5666j = executor;
        this.f5657a = k3Var;
        this.f5658b = i0Var;
        this.f5659c = i0Var2;
        Map<String, String> a = C1677r.m4665a();
        this.f5660d = a;
        k3Var.mo5981a(a);
        this.f5661e = pVar;
        this.f5662f = z3Var;
        this.f5665i = v1Var;
        this.f5663g = d4Var;
        this.f5664h = u3Var;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m4139c() {
        this.f5666j.execute(new C0194b(this, 4));
    }

    /* renamed from: a */
    public C1717w2 mo6046a() {
        URI a = C1655o4.m4563a(this.f5657a.getUri());
        int i = C1567a.f5667a[this.f5657a.mo6060f().ordinal()];
        if (i == 1) {
            return new C1717w2(this.f5661e.mo6258a(a, this.f5660d), this.f5657a, this.f5665i);
        }
        if (i != 2) {
            String str = f5656k;
            StringBuilder k = C13555b.m33972k("Received a request with an unknown Http verb: [");
            k.append(this.f5657a.mo6060f());
            k.append("]");
            AppboyLogger.m5459w(str, k.toString());
            return null;
        }
        JSONObject k2 = this.f5657a.mo5998k();
        if (k2 != null) {
            return new C1717w2(this.f5661e.mo6259a(a, this.f5660d, k2), this.f5657a, this.f5665i);
        }
        AppboyLogger.m5459w(f5656k, "Could not parse request parameters for put request to [%s], cancelling request.");
        return null;
    }

    /* renamed from: b */
    public void mo6049b(C1717w2 w2Var) {
        String a = this.f5665i.mo6228a();
        String str = f5656k;
        AppboyLogger.m5457v(str, "Processing server response payload for user with id: " + a);
        if (w2Var.mo6440j()) {
            try {
                FeedUpdatedEvent a2 = this.f5662f.mo6499a(w2Var.mo6433c(), a);
                if (a2 != null) {
                    this.f5659c.mo6134a(a2, FeedUpdatedEvent.class);
                }
            } catch (Exception e) {
                AppboyLogger.m5452e(f5656k, "Unable to update/publish News Feed from server update.", e);
            }
        }
        if (w2Var.mo6438h()) {
            try {
                ContentCardsUpdatedEvent a3 = this.f5664h.mo6378a(w2Var.mo6431a(), a);
                if (a3 != null) {
                    this.f5659c.mo6134a(a3, ContentCardsUpdatedEvent.class);
                }
            } catch (Exception e2) {
                AppboyLogger.m5452e(f5656k, "Encountered exception while parsing Content Cards update. Unable to publish Content Cards update event.", e2);
            }
        }
        if (w2Var.mo6442l()) {
            try {
                this.f5663g.mo6004a(w2Var.mo6435e());
                this.f5658b.mo6134a(new C1669q0(w2Var.mo6435e()), C1669q0.class);
            } catch (Exception e3) {
                AppboyLogger.m5452e(f5656k, "Encountered exception while parsing server config response.", e3);
            }
        }
        if (w2Var.mo6444n()) {
            try {
                this.f5658b.mo6134a(new C1523a1(w2Var.mo6437g()), C1523a1.class);
            } catch (Exception e4) {
                AppboyLogger.m5452e(f5656k, "Encountered exception while parsing server triggers response.", e4);
            }
        }
        if (w2Var.mo6443m()) {
            C1620k3 k3Var = this.f5657a;
            if (k3Var instanceof C1664p3) {
                try {
                    C1664p3 p3Var = (C1664p3) k3Var;
                    IInAppMessage f = w2Var.mo6436f();
                    f.setExpirationTimestamp(p3Var.mo6296q());
                    this.f5658b.mo6134a(new C1633m0(p3Var.mo6297r(), f, a), C1633m0.class);
                } catch (Exception e5) {
                    AppboyLogger.m5452e(f5656k, "Encountered exception while parsing server templated in app message response.", e5);
                }
            }
        }
        if (w2Var.mo6441k()) {
            try {
                this.f5658b.mo6134a(new C1625l0(w2Var.mo6434d()), C1625l0.class);
            } catch (Exception e6) {
                AppboyLogger.m5452e(f5656k, "Encountered exception while parsing server geofences response.", e6);
            }
        }
    }

    public void run() {
        try {
            C1717w2 a = mo6046a();
            if (a != null) {
                mo6047a(a);
                this.f5658b.mo6134a(new C1659p0(this.f5657a), C1659p0.class);
                this.f5658b.mo6134a(new C1617k0(this.f5657a), C1617k0.class);
                this.f5657a.mo5974a(this.f5658b);
                return;
            }
            AppboyLogger.m5459w(f5656k, "Api response was null, failing task.");
            this.f5657a.mo5974a(this.f5658b);
            C1743z2 z2Var = new C1743z2("An error occurred during request processing, resulting in no valid response being received. Check the error log for more details.", this.f5657a);
            this.f5657a.mo5975a(this.f5658b, this.f5659c, z2Var);
            this.f5658b.mo6134a(new C1608j0(this.f5657a), C1608j0.class);
            mo6048a((C1736y2) z2Var);
        } catch (Exception e) {
            if (e instanceof C1547c1) {
                String str = f5656k;
                AppboyLogger.m5449d(str, "Experienced network communication exception processing API response. Sending network error event. " + e.getMessage(), (Throwable) e);
                this.f5658b.mo6134a(new C1649o0(this.f5657a), C1649o0.class);
                this.f5659c.mo6134a(new BrazeNetworkFailureEvent(e, this.f5657a), BrazeNetworkFailureEvent.class);
            }
            AppboyLogger.m5460w(f5656k, "Experienced exception processing API response. Failing task.", e);
        } catch (Throwable th) {
            this.f5657a.mo5974a(this.f5658b);
            throw th;
        }
    }

    /* renamed from: a */
    public void mo6047a(C1717w2 w2Var) {
        if (!w2Var.mo6439i()) {
            this.f5657a.mo6059a(this.f5659c, w2Var);
        } else {
            mo6048a(w2Var.mo6432b());
            this.f5657a.mo5975a(this.f5658b, this.f5659c, w2Var.mo6432b());
        }
        mo6049b(w2Var);
    }

    /* renamed from: a */
    public void mo6048a(C1736y2 y2Var) {
        String str = f5656k;
        StringBuilder k = C13555b.m33972k("Received server error from request: ");
        k.append(y2Var.mo6064a());
        AppboyLogger.m5459w(str, k.toString());
        this.f5658b.mo6134a(new C1521a(y2Var), C1521a.class);
        if (this.f5657a.mo5982a(y2Var)) {
            int a = this.f5657a.mo5999l().mo6152a();
            StringBuilder k2 = C13555b.m33972k("Retrying request: ");
            k2.append(this.f5657a);
            k2.append(" after delay of ");
            k2.append(a);
            k2.append(" ms");
            AppboyLogger.m5448d(str, k2.toString());
            HandlerUtils.createHandler().postDelayed(new C0441n1(this, 4), (long) a);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m4137b() {
        String str = f5656k;
        StringBuilder k = C13555b.m33972k("Adding retried request to dispatch: ");
        k.append(this.f5657a);
        AppboyLogger.m5457v(str, k.toString());
        this.f5665i.mo6232a(this.f5657a);
    }
}
