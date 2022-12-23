package y20;

import android.app.Application;
import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.appevents.C2338j;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Currency;
import java.util.HashSet;
import java.util.List;
import p009a8.C0115o;
import p135j8.C5399e;
import p262t8.C6606a;
import p359ag.C13447d;
import p359ag.C13452i;
import p589jq.C17916h;
import p977zz.C20930c;
import y20.C20699e;
import z20.C20806a;
import z20.C20808b;

/* renamed from: y20.c */
public final class C20695c extends C20699e {

    /* renamed from: b */
    public final AppEventsLogger f52267b;

    /* renamed from: c */
    public final C20701f f52268c = C20702g.m48679b("registration_completed_se", "fb_mobile_complete_registration", "payment_method_tap", "fb_mobile_add_payment_info");

    /* renamed from: d */
    public final C20701f f52269d = C20702g.m48679b("feature", "fb_content_type", "item_id", "fb_content_id", "item_name", "fb_description", "number_of_items", "fb_num_items", InAppPurchaseMetaData.KEY_CURRENCY, "fb_currency");

    /* renamed from: e */
    public final HashSet f52270e = new HashSet(Arrays.asList(new String[]{"revenue", InAppPurchaseMetaData.KEY_CURRENCY}));

    /* renamed from: y20.c$a */
    public static class C20696a implements C20699e.C20700a<C20695c> {
        /* renamed from: a */
        public final boolean mo52845a(Application application) {
            if (TextUtils.isEmpty(C20930c.m49021c(application).getString("com.facebook.sdk.ApplicationId")) || !C0115o.m217h()) {
                return false;
            }
            return true;
        }

        /* renamed from: b */
        public final C20699e mo52846b(Application application) {
            return new C20695c(application);
        }
    }

    public C20695c(Application application) {
        super(application);
        this.f52267b = new AppEventsLogger(application);
    }

    /* renamed from: a */
    public final void mo52843a(C20806a aVar) {
        Bundle a = C20702g.m48678a(aVar.f52519b, (C17916h) null, this.f52269d);
        this.f52267b.f8485a.mo12484d(a, (String) this.f52268c.convert(aVar.f52518a));
    }

    /* renamed from: b */
    public final void mo52844b(C20806a aVar) {
        BigDecimal bigDecimal;
        double d;
        Class cls = Double.class;
        C20808b bVar = aVar.f52519b;
        Currency currency = null;
        if (bVar.f52527a.containsKey("revenue")) {
            bigDecimal = BigDecimal.valueOf(((Double) bVar.mo52939a("revenue", cls)).doubleValue());
        } else {
            bigDecimal = null;
        }
        if (bVar.f52527a.containsKey(InAppPurchaseMetaData.KEY_CURRENCY)) {
            String c = bVar.mo52941c(InAppPurchaseMetaData.KEY_CURRENCY);
            c.getClass();
            if (!c.equals("M:K")) {
                currency = Currency.getInstance(c);
            }
        }
        Bundle a = C20702g.m48678a(bVar, new C17916h(this, 3), this.f52269d);
        if (!aVar.f52520c.isEmpty()) {
            List<C20808b> list = aVar.f52520c;
            C13447d dVar = new C13447d();
            for (C20808b next : list) {
                C13452i iVar = new C13452i();
                iVar.mo40349F("id", next.mo52941c("single_item_name"));
                iVar.mo40348E("quantity", Integer.valueOf(next.mo52940b("item_quantity", 0)));
                Double d2 = (Double) next.mo52939a("single_item_price", cls);
                if (d2 != null) {
                    d = d2.doubleValue();
                } else {
                    d = 0.0d;
                }
                iVar.mo40348E("item_price", Double.valueOf(d));
                dVar.mo40327C(iVar);
            }
            a.putString("fb_content", dVar.toString());
        }
        C2338j jVar = this.f52267b.f8485a;
        jVar.getClass();
        if (!C6606a.m15601b(jVar)) {
            try {
                C5399e.m13503a();
                jVar.mo12487g(bigDecimal, currency, a, false);
            } catch (Throwable th) {
                C6606a.m15600a(jVar, th);
            }
        }
    }
}
