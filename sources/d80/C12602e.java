package d80;

import com.appboy.models.outgoing.FacebookUser;
import com.appsflyer.ServerParameters;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.commons.request.BadResponseException;
import java.io.IOException;
import k40.C5478b;
import org.json.JSONException;
import org.json.JSONObject;
import p906wz.C20431c;

/* renamed from: d80.e */
public final class C12602e extends C5478b<C12601d, C12602e> {

    /* renamed from: f */
    public LatLonE6 f31150f = null;

    /* renamed from: d */
    public final void mo21363d(C20431c cVar, JSONObject jSONObject) throws JSONException, IOException, BadResponseException {
        C12601d dVar = (C12601d) cVar;
        JSONObject optJSONObject = jSONObject.optJSONObject(FacebookUser.LOCATION_OUTER_OBJECT_KEY);
        if (optJSONObject != null) {
            this.f31150f = LatLonE6.m40176g(optJSONObject.getDouble(ServerParameters.LAT_KEY), optJSONObject.getDouble("lng"));
        }
    }
}
