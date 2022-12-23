package d80;

import android.text.style.StyleSpan;
import c00.C13717b;
import c00.C13720d;
import c00.C13722f;
import com.appboy.models.outgoing.FacebookUser;
import com.appsflyer.ServerParameters;
import com.appsflyer.internal.referrer.Payload;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.commons.request.BadResponseException;
import com.moovit.image.model.Image;
import com.moovit.network.model.ServerId;
import com.moovit.transit.LocationDescriptor;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import k40.C5478b;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p900wt.C20415e;
import p906wz.C20431c;
import p977zz.C20964s0;
import x00.C20440a;
import z70.C13321a;
import z70.C13329g;

/* renamed from: d80.i */
public final class C12606i extends C5478b<C12605h, C12606i> {

    /* renamed from: f */
    public LocationDescriptor f31153f = null;

    /* renamed from: d */
    public final void mo21363d(C20431c cVar, JSONObject jSONObject) throws JSONException, IOException, BadResponseException {
        JSONObject jSONObject2;
        ArrayList arrayList;
        JSONObject jSONObject3 = jSONObject;
        C12605h hVar = (C12605h) cVar;
        String optString = jSONObject3.optString(ServerParameters.STATUS, "unknown");
        optString.getClass();
        LocationDescriptor locationDescriptor = null;
        if (optString.equals("ZERO_RESULTS")) {
            this.f31153f = null;
        } else if (optString.equals(Payload.RESPONSE_OK)) {
            C13321a aVar = hVar.f31152u;
            JSONArray optJSONArray = jSONObject3.optJSONArray("results");
            if (!(optJSONArray == null || optJSONArray.length() == 0 || (jSONObject2 = optJSONArray.getJSONObject(0)) == null)) {
                String string = jSONObject2.getString("place_id");
                String C = C20964s0.m49082C(aVar.f33073e);
                List<C20440a> list = aVar.f33074f;
                StyleSpan styleSpan = C13329g.f33089a;
                if (C13717b.m34258e(list)) {
                    arrayList = list;
                } else {
                    C20415e eVar = new C20415e(15);
                    ArrayList arrayList2 = new ArrayList(list.size());
                    C13720d.m34276f(list, (C13722f) null, eVar, arrayList2);
                    arrayList = arrayList2;
                }
                Image image = aVar.f33072d;
                JSONObject jSONObject4 = jSONObject2.getJSONObject("geometry").getJSONObject(FacebookUser.LOCATION_OUTER_OBJECT_KEY);
                locationDescriptor = new LocationDescriptor(LocationDescriptor.LocationType.COORDINATE, LocationDescriptor.SourceType.EXTERNAL, (ServerId) null, string, C, arrayList, LatLonE6.m40176g(jSONObject4.getDouble(ServerParameters.LAT_KEY), jSONObject4.getDouble("lng")), (LatLonE6) null, image, (Image) null);
            }
            this.f31153f = locationDescriptor;
        } else {
            throw new IOException(optString);
        }
    }
}
