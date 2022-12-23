package y20;

import android.app.Application;
import c00.C13720d;
import com.braze.Braze;
import com.braze.models.outgoing.BrazeProperties;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Currency;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import p009a8.C0111k;
import p451du.C16721r;
import p528gz.C17269d;
import y20.C20699e;
import z20.C20806a;
import z20.C20808b;

/* renamed from: y20.b */
public final class C20693b extends C20699e {

    /* renamed from: b */
    public final HashSet f52266b = new HashSet(Arrays.asList(new String[]{"feature", InAppPurchaseMetaData.KEY_CURRENCY, InAppPurchaseMetaData.KEY_PRICE, "number_of_items"}));

    /* renamed from: y20.b$a */
    public static class C20694a implements C20699e.C20700a<C20693b> {
        /* renamed from: a */
        public final boolean mo52845a(Application application) {
            return C17269d.m43283a().f44638b;
        }

        /* renamed from: b */
        public final C20699e mo52846b(Application application) {
            return new C20693b(application);
        }
    }

    public C20693b(Application application) {
        super(application);
    }

    /* renamed from: c */
    public static BrazeProperties m48661c(C20808b bVar, C16721r rVar) throws Exception, Exception {
        C0111k kVar = C13720d.f33796a;
        BrazeProperties brazeProperties = new BrazeProperties();
        for (Map.Entry next : bVar.f52527a.entrySet()) {
            String str = (String) next.getKey();
            Object value = next.getValue();
            if (value != null && (rVar == null || rVar.mo19661o(str))) {
                String str2 = (String) kVar.convert(str);
                Object convert = kVar.convert(value);
                if (convert instanceof Integer) {
                    brazeProperties.addProperty(str2, ((Number) convert).intValue());
                } else if (convert instanceof String) {
                    brazeProperties.addProperty(str2, convert.toString());
                } else if (convert instanceof Double) {
                    brazeProperties.addProperty(str2, ((Number) convert).doubleValue());
                } else if (convert instanceof Short) {
                    brazeProperties.addProperty(str2, (int) ((Number) convert).shortValue());
                } else if (convert instanceof Float) {
                    brazeProperties.addProperty(str2, (double) ((Number) convert).floatValue());
                } else if (convert instanceof Long) {
                    brazeProperties.addProperty(str2, ((Number) convert).longValue());
                } else if (convert instanceof Boolean) {
                    brazeProperties.addProperty(str2, ((Boolean) convert).booleanValue());
                } else {
                    StringBuilder k = C13555b.m33972k("Unsupported value: ");
                    k.append(convert.getClass());
                    throw new IllegalStateException(k.toString());
                }
            }
        }
        return brazeProperties;
    }

    /* renamed from: a */
    public final void mo52843a(C20806a aVar) {
        Braze.getInstance(this.f52274a).logCustomEvent(aVar.f52518a, m48661c(aVar.f52519b, (C16721r) null));
    }

    /* renamed from: b */
    public final void mo52844b(C20806a aVar) {
        String str;
        double d;
        C20808b bVar = aVar.f52519b;
        String c = bVar.mo52941c("feature");
        if (bVar.mo52941c(InAppPurchaseMetaData.KEY_CURRENCY) != null) {
            str = bVar.mo52941c(InAppPurchaseMetaData.KEY_CURRENCY);
        } else {
            str = Currency.getInstance(Locale.getDefault()).getCurrencyCode();
        }
        String str2 = str;
        Double d2 = (Double) bVar.mo52939a(InAppPurchaseMetaData.KEY_PRICE, Double.class);
        if (d2 != null) {
            d = d2.doubleValue();
        } else {
            d = 0.0d;
        }
        Braze.getInstance(this.f52274a).logPurchase(c, str2, BigDecimal.valueOf(d), bVar.mo52940b("number_of_items", 1), m48661c(bVar, new C16721r(this, 4)));
    }
}
