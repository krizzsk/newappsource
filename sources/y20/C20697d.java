package y20;

import android.app.Application;
import android.os.Bundle;
import com.google.android.gms.analytics.ecommerce.ProductAction;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.util.List;
import p589jq.C17916h;
import y20.C20699e;
import z20.C20806a;
import z20.C20808b;

/* renamed from: y20.d */
public final class C20697d extends C20699e {

    /* renamed from: b */
    public final FirebaseAnalytics f52271b;

    /* renamed from: c */
    public final C20701f f52272c = C20702g.m48679b(ProductAction.ACTION_PURCHASE, "moovit_purchase", "payment_method_tap", "add_payment_info");

    /* renamed from: d */
    public final C20701f f52273d = C20702g.m48679b("feature", "content_type", "item_id", "item_list_id", "item_name", "item_list_name", "number_of_items", "quantity", InAppPurchaseMetaData.KEY_CURRENCY, InAppPurchaseMetaData.KEY_CURRENCY, InAppPurchaseMetaData.KEY_PRICE, InAppPurchaseMetaData.KEY_PRICE, "revenue", "value");

    /* renamed from: y20.d$a */
    public static class C20698a implements C20699e.C20700a<C20697d> {
        /* renamed from: a */
        public final boolean mo52845a(Application application) {
            return true;
        }

        /* renamed from: b */
        public final C20699e mo52846b(Application application) {
            return new C20697d(application);
        }
    }

    public C20697d(Application application) {
        super(application);
        this.f52271b = FirebaseAnalytics.getInstance(application);
    }

    /* renamed from: a */
    public final void mo52843a(C20806a aVar) {
        Bundle a = C20702g.m48678a(aVar.f52519b, (C17916h) null, this.f52273d);
        this.f52271b.mo43247a(a, (String) this.f52272c.convert(aVar.f52518a));
    }

    /* renamed from: b */
    public final void mo52844b(C20806a aVar) {
        double d;
        String str = (String) this.f52272c.convert(aVar.f52518a);
        Bundle a = C20702g.m48678a(aVar.f52519b, (C17916h) null, this.f52273d);
        List<C20808b> list = aVar.f52520c;
        if (!list.isEmpty()) {
            int size = list.size();
            Bundle[] bundleArr = new Bundle[size];
            for (int i = 0; i < size; i++) {
                C20808b bVar = list.get(i);
                Bundle bundle = new Bundle(3);
                bundle.putString("item_name", bVar.mo52941c("single_item_name"));
                bundle.putInt("quantity", bVar.mo52940b("item_quantity", 0));
                Double d2 = (Double) bVar.mo52939a("single_item_price", Double.class);
                if (d2 != null) {
                    d = d2.doubleValue();
                } else {
                    d = 0.0d;
                }
                bundle.putDouble(InAppPurchaseMetaData.KEY_PRICE, d);
                bundleArr[i] = bundle;
            }
            a.putParcelableArray("items", bundleArr);
        }
        this.f52271b.mo43247a(a, str);
    }
}
