package y20;

import android.app.Application;
import android.text.TextUtils;
import c00.C13720d;
import com.appsflyer.AFInAppEventParameterName;
import com.appsflyer.AFInAppEventType;
import com.appsflyer.AppsFlyerLib;
import com.google.android.gms.analytics.ecommerce.ProductAction;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p009a8.C0111k;
import p977zz.C20930c;
import y20.C20699e;
import z20.C20806a;
import z20.C20808b;

/* renamed from: y20.a */
public final class C20691a extends C20699e {

    /* renamed from: b */
    public final AppsFlyerLib f52263b = AppsFlyerLib.getInstance();

    /* renamed from: c */
    public final C20701f f52264c = C20702g.m48679b(ProductAction.ACTION_PURCHASE, AFInAppEventType.PURCHASE, "registration_completed_se", AFInAppEventType.COMPLETE_REGISTRATION, "payment_method_tap", AFInAppEventType.ADD_PAYMENT_INFO);

    /* renamed from: d */
    public final C20701f f52265d = C20702g.m48679b("feature", AFInAppEventParameterName.CONTENT_TYPE, "item_id", AFInAppEventParameterName.CONTENT_ID, "item_name", AFInAppEventParameterName.DESCRIPTION, "number_of_items", AFInAppEventParameterName.QUANTITY, InAppPurchaseMetaData.KEY_CURRENCY, AFInAppEventParameterName.CURRENCY, InAppPurchaseMetaData.KEY_PRICE, AFInAppEventParameterName.PRICE, "revenue", AFInAppEventParameterName.REVENUE, "origin_address", AFInAppEventParameterName.DESTINATION_A, "destination_address", AFInAppEventParameterName.DESTINATION_B);

    /* renamed from: y20.a$a */
    public static class C20692a implements C20699e.C20700a<C20691a> {
        /* renamed from: a */
        public final boolean mo52845a(Application application) {
            return !TextUtils.isEmpty(C20930c.m49021c(application).getString("com.appsflyer.AppKey"));
        }

        /* renamed from: b */
        public final C20699e mo52846b(Application application) {
            return new C20691a(application);
        }
    }

    public C20691a(Application application) {
        super(application);
    }

    /* renamed from: a */
    public final void mo52843a(C20806a aVar) {
        String str = aVar.f52518a;
        Map<String, Object> map = aVar.f52519b.f52527a;
        C20701f fVar = this.f52265d;
        C0111k kVar = C13720d.f33796a;
        HashMap hashMap = new HashMap(map.size());
        C13720d.m34275e(map, hashMap, fVar, kVar);
        this.f52263b.logEvent(this.f52274a, (String) this.f52264c.convert(str), hashMap);
    }

    /* renamed from: b */
    public final void mo52844b(C20806a aVar) {
        double d;
        String str = aVar.f52518a;
        C20808b bVar = aVar.f52519b;
        String str2 = (String) this.f52264c.convert(str);
        Map<String, Object> map = bVar.f52527a;
        C20701f fVar = this.f52265d;
        C0111k kVar = C13720d.f33796a;
        HashMap hashMap = new HashMap(map.size());
        C13720d.m34275e(map, hashMap, fVar, kVar);
        List<C20808b> list = aVar.f52520c;
        if (!list.isEmpty()) {
            int size = list.size();
            String[] strArr = new String[size];
            int[] iArr = new int[size];
            double[] dArr = new double[size];
            for (int i = 0; i < size; i++) {
                C20808b bVar2 = list.get(i);
                strArr[i] = bVar2.mo52941c("single_item_name");
                iArr[i] = bVar2.mo52940b("item_quantity", 0);
                Double d2 = (Double) bVar2.mo52939a("single_item_price", Double.class);
                if (d2 != null) {
                    d = d2.doubleValue();
                } else {
                    d = 0.0d;
                }
                dArr[i] = d;
            }
            hashMap.put(AFInAppEventParameterName.DESCRIPTION, strArr);
            hashMap.put(AFInAppEventParameterName.QUANTITY, iArr);
            hashMap.put(AFInAppEventParameterName.PRICE, dArr);
        }
        this.f52263b.logEvent(this.f52274a, str2, hashMap);
    }
}
