package p716oy;

import android.app.Activity;
import com.moovit.app.intro.onboarding.OnboardingPage;
import com.moovit.app.intro.onboarding.OnboardingType;
import com.moovit.network.model.ServerId;
import com.moovit.payment.account.PaymentAccountActivity;
import com.moovit.tripplanner.TripPlannerAlgorithmType;
import java.util.Collections;
import java.util.List;
import p779rs.C19324a;
import p924xt.C20589d;
import y60.C20706b;

/* renamed from: oy.a */
public final class C18860a {

    /* renamed from: t */
    public static volatile C18860a f48012t;

    /* renamed from: a */
    public final ServerId f48013a = null;

    /* renamed from: b */
    public final boolean f48014b = true;

    /* renamed from: c */
    public final boolean f48015c = true;

    /* renamed from: d */
    public final List<C19324a> f48016d = null;

    /* renamed from: e */
    public final boolean f48017e = true;

    /* renamed from: f */
    public final boolean f48018f = true;

    /* renamed from: g */
    public final boolean f48019g = true;

    /* renamed from: h */
    public final boolean f48020h = false;

    /* renamed from: i */
    public final boolean f48021i = false;

    /* renamed from: j */
    public final boolean f48022j = true;

    /* renamed from: k */
    public final Class<? extends Activity> f48023k = PaymentAccountActivity.class;

    /* renamed from: l */
    public final C20706b f48024l = null;

    /* renamed from: m */
    public final List<C20589d> f48025m = null;

    /* renamed from: n */
    public final OnboardingType f48026n;

    /* renamed from: o */
    public final List<OnboardingPage> f48027o;

    /* renamed from: p */
    public final TripPlannerAlgorithmType f48028p;

    /* renamed from: q */
    public final boolean f48029q;

    /* renamed from: r */
    public final boolean f48030r;

    /* renamed from: s */
    public final boolean f48031s;

    public C18860a(OnboardingType onboardingType, List list, TripPlannerAlgorithmType tripPlannerAlgorithmType) {
        this.f48026n = onboardingType;
        this.f48027o = list;
        this.f48028p = tripPlannerAlgorithmType;
        this.f48029q = false;
        this.f48030r = false;
        this.f48031s = false;
    }

    /* renamed from: a */
    public static C18860a m45884a() {
        if (f48012t == null) {
            synchronized (C18860a.class) {
                if (f48012t == null) {
                    f48012t = new C18860a(OnboardingType.OPT_IN, Collections.emptyList(), TripPlannerAlgorithmType.PREFERRED);
                }
            }
        }
        return f48012t;
    }
}
