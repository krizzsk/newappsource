package d80;

import android.content.Context;
import com.appboy.models.outgoing.FacebookUser;
import com.appsflyer.ServerParameters;
import com.appsflyer.internal.referrer.Payload;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.commons.geo.Polygon;
import com.moovit.commons.request.BadResponseException;
import com.moovit.image.model.Image;
import com.moovit.image.model.ResourceImage;
import com.moovit.network.model.ServerId;
import com.moovit.transit.LocationDescriptor;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import k40.C5478b;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p824tp.C19746x;
import p906wz.C20431c;
import x00.C20440a;
import z70.C13335l;

/* renamed from: d80.c */
public final class C12600c extends C5478b<C12599b, C12600c> {

    /* renamed from: f */
    public List<LocationDescriptor> f31149f = null;

    /* renamed from: d */
    public final void mo21363d(C20431c cVar, JSONObject jSONObject) throws JSONException, IOException, BadResponseException {
        JSONObject jSONObject2 = jSONObject;
        C12599b bVar = (C12599b) cVar;
        String optString = jSONObject2.optString(ServerParameters.STATUS, "unknown");
        optString.getClass();
        if (optString.equals("ZERO_RESULTS")) {
            this.f31149f = Collections.emptyList();
        } else if (optString.equals(Payload.RESPONSE_OK)) {
            Polygon polygon = bVar.f31148u.f50165a.f16132g;
            Context context = this.f51773b.f51759b;
            JSONArray jSONArray = jSONObject2.getJSONArray("results");
            int length = jSONArray.length();
            ArrayList arrayList = new ArrayList(length);
            int i = 0;
            while (true) {
                List list = null;
                if (i >= length) {
                    break;
                }
                JSONObject jSONObject3 = jSONArray.getJSONObject(i);
                JSONObject jSONObject4 = jSONObject3.getJSONObject("geometry").getJSONObject(FacebookUser.LOCATION_OUTER_OBJECT_KEY);
                LatLonE6 g = LatLonE6.m40176g(jSONObject4.getDouble(ServerParameters.LAT_KEY), jSONObject4.getDouble("lng"));
                if (polygon.mo46935h(g)) {
                    String string = jSONObject3.getString("place_id");
                    String optString2 = jSONObject3.optString("formatted_address", context.getString(C19746x.unknown_address));
                    ResourceImage c = C13335l.m33607c(jSONObject3.optJSONArray("types"));
                    LocationDescriptor.LocationType locationType = LocationDescriptor.LocationType.COORDINATE;
                    LocationDescriptor.SourceType sourceType = LocationDescriptor.SourceType.EXTERNAL;
                    if (optString2 != null) {
                        list = Collections.singletonList(new C20440a((CharSequence) optString2, (String) null));
                    }
                    arrayList.add(new LocationDescriptor(locationType, sourceType, (ServerId) null, string, (String) null, list, g, (LatLonE6) null, c, (Image) null));
                }
                i++;
            }
            if (arrayList.isEmpty()) {
                arrayList = null;
            }
            this.f31149f = arrayList;
        } else {
            throw new IOException(optString);
        }
    }
}
