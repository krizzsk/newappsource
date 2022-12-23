package p030bo.app;

import com.appboy.models.outgoing.AppboyProperties;
import com.google.android.gms.analytics.ecommerce.ProductAction;

/* renamed from: bo.app.a6 */
public class C1528a6 extends C1570e6 {

    /* renamed from: f */
    public final String f5487f;

    public C1528a6(String str, AppboyProperties appboyProperties, C1594h2 h2Var) {
        super(appboyProperties, h2Var);
        this.f5487f = str;
    }

    /* renamed from: d */
    public String mo5901d() {
        return ProductAction.ACTION_PURCHASE;
    }

    /* renamed from: f */
    public String mo5902f() {
        return this.f5487f;
    }
}
