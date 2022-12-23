package d80;

import android.content.Context;
import android.net.Uri;
import ce0.C21100e;
import com.moovit.commons.geo.BoxE6;
import com.moovit.commons.geo.LatLonE6;
import java.util.Locale;
import p824tp.C19728f;
import p977zz.C20964s0;
import q00.C19047a;
import q00.C19053d;

/* renamed from: d80.b */
public final class C12599b extends C12598a<C12599b, C12600c> {

    /* renamed from: u */
    public final C19728f f31148u;

    public C12599b(Context context, C19047a aVar, C19728f fVar, String str) {
        super(context, Uri.parse("https://maps.googleapis.com/maps/api/geocode/json"), false, C12600c.class);
        C21100e.m49373x(fVar, "metroContext");
        this.f31148u = fVar;
        mo52629r("address", str);
        BoxE6 bounds = fVar.f50165a.f16132g.getBounds();
        Object[] objArr = {Double.valueOf(LatLonE6.m40179s(bounds.f40964b)), Double.valueOf(LatLonE6.m40179s(bounds.f40966d)), Double.valueOf(LatLonE6.m40179s(bounds.f40965c)), Double.valueOf(LatLonE6.m40179s(bounds.f40967e))};
        String str2 = C20964s0.f52718a;
        mo52629r("bounds", String.format((Locale) null, "%f,%f|%f,%f", objArr));
        String str3 = (String) aVar.mo51505b(C19053d.f48456H);
        if (str3 == null) {
            StringBuilder k = C13555b.m33972k("country:");
            k.append(fVar.f50165a.f16142q);
            str3 = k.toString();
        }
        if (!C20964s0.m49090h(str3)) {
            mo52629r("components", str3);
        }
        Locale locale = Locale.getDefault();
        if (locale != null && !C20964s0.m49090h(locale.getLanguage())) {
            mo52629r("language", locale.getLanguage());
        }
    }
}
