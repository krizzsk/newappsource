package d80;

import android.content.Context;
import android.net.Uri;
import ce0.C21100e;
import com.appboy.configuration.AppboyConfigurationProvider;
import com.appboy.models.outgoing.FacebookUser;
import com.braze.models.BrazeGeofence;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.moovit.commons.geo.LatLonE6;
import java.util.Locale;
import p824tp.C19728f;
import p977zz.C20964s0;
import q00.C19047a;
import q00.C19053d;

/* renamed from: d80.f */
public final class C12603f extends C12598a<C12603f, C12604g> {
    public C12603f(Context context, C19047a aVar, C19728f fVar, String str, LatLonE6 latLonE6, LatLonE6 latLonE62) {
        super(context, Uri.parse("https://maps.googleapis.com/maps/api/place/autocomplete/json"), false, C12604g.class);
        C21100e.m49373x(str, "searchQuery");
        mo52629r("input", str);
        String str2 = (String) aVar.mo51505b(C19053d.f48456H);
        if (str2 == null) {
            StringBuilder k = C13555b.m33972k("country:");
            k.append(fVar.f50165a.f16142q);
            str2 = k.toString();
        }
        if (!C20964s0.m49090h(str2)) {
            mo52629r("components", str2);
        }
        if (latLonE6 != null) {
            mo52629r(FacebookUser.LOCATION_OUTER_OBJECT_KEY, latLonE6.mo46922k() + AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR + latLonE6.mo46926o());
            mo52629r(BrazeGeofence.RADIUS_METERS, "10000");
        }
        if (latLonE62 != null) {
            mo52629r(AppMeasurementSdk.ConditionalUserProperty.ORIGIN, latLonE62.mo46922k() + AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR + latLonE62.mo46926o());
        }
        Locale locale = Locale.getDefault();
        if (locale != null && !C20964s0.m49090h(locale.getLanguage())) {
            mo52629r("language", locale.getLanguage());
        }
    }
}
