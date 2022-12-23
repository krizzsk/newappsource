package h80;

import android.content.Context;
import c00.C13720d;
import c00.C13722f;
import c70.C13749c;
import c70.C13752e;
import c70.C13778r;
import ce0.C21100e;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.commons.request.ServerException;
import com.moovit.commons.utils.ApplicationBugException;
import com.moovit.database.DatabaseHelper;
import com.moovit.database.sqlite.SQLiteDatabase;
import com.moovit.transit.LocationDescriptor;
import com.moovit.user.LocaleInfo;
import com.tranzmate.moovit.protocol.search.MVSearchRequest;
import com.tranzmate.moovit.protocol.search.MVSearchResultType;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import p241s0.C6302b;
import p435de.C16596f;
import p638lr.C18262i;
import p824tp.C19728f;
import p824tp.C19731i;
import p824tp.C19746x;
import p977zz.C20975x0;
import s00.C19391d;
import u00.C19838j;

/* renamed from: h80.b */
public final class C12736b extends C13778r<C12736b, C12738c, MVSearchRequest> implements Callable<C12738c> {

    /* renamed from: z */
    public static List<MVSearchResultType> f31460z = Collections.singletonList(MVSearchResultType.STOP);

    /* renamed from: w */
    public final C19728f f31461w;

    /* renamed from: x */
    public final String f31462x;

    /* renamed from: y */
    public final LatLonE6 f31463y;

    /* renamed from: h80.b$a */
    public static class C12737a implements Comparator<LocationDescriptor> {

        /* renamed from: b */
        public final Map<LocationDescriptor, Integer> f31464b;

        public C12737a(C6302b bVar) {
            this.f31464b = bVar;
        }

        public final int compare(Object obj, Object obj2) {
            int i;
            LocationDescriptor locationDescriptor = (LocationDescriptor) obj;
            LocationDescriptor locationDescriptor2 = (LocationDescriptor) obj2;
            Map<LocationDescriptor, Integer> map = this.f31464b;
            if (map == null) {
                i = 0;
            } else {
                i = C20975x0.m49116c(map.get(locationDescriptor), this.f31464b.get(locationDescriptor2));
            }
            if (i != 0) {
                return i;
            }
            return C20975x0.m49116c(locationDescriptor.f23651f, locationDescriptor2.f23651f);
        }
    }

    public C12736b(C13752e eVar, C19728f fVar, String str, LatLonE6 latLonE6) {
        super(eVar, C19746x.server_path_search_server_url, C19746x.api_path_search_stations_request_path, C12738c.class);
        C21100e.m49373x(fVar, "metroContext");
        this.f31461w = fVar;
        this.f31462x = str;
        this.f31463y = latLonE6;
        RO mVSearchRequest = new MVSearchRequest(str, eVar.f33853b.f50160a.f32927c.f15142b, 0);
        mVSearchRequest.requiredResults = f31460z;
        mVSearchRequest.useGeoCoder = false;
        mVSearchRequest.mo31494u();
        if (latLonE6 != null) {
            mVSearchRequest.userLocation = C13749c.m34332r(latLonE6);
        }
        LocaleInfo b = LocaleInfo.m17919b(eVar.f33852a);
        if (b != null) {
            mVSearchRequest.locale = C13749c.m34333s(b);
        }
        this.f33922v = mVSearchRequest;
    }

    /* renamed from: E */
    public final List<C12738c> mo21059E() throws IOException, ServerException {
        C6302b bVar;
        C12738c cVar = null;
        try {
            Context context = this.f51759b;
            SQLiteDatabase readableDatabase = DatabaseHelper.get(context).getReadableDatabase();
            C19391d c = C19731i.m47197a(context).mo52085c(this.f31461w.f50165a);
            C19838j jVar = (C19838j) c.mo51794a(C19838j.class);
            if (jVar.mo52139i(context, readableDatabase)) {
                ArrayList<O> c2 = C13720d.m34273c(c.mo51806h().mo52153i(context, new HashSet(jVar.mo52140k(context, readableDatabase, this.f31462x, this.f31463y))), (C13722f) null, new C18262i(22));
                if (this.f31463y != null) {
                    bVar = new C6302b(c2.size());
                    for (O next : c2) {
                        LatLonE6 latLonE6 = this.f31463y;
                        latLonE6.getClass();
                        bVar.put((LocationDescriptor) next, Integer.valueOf(Math.round(LatLonE6.m40174c(latLonE6, (LocationDescriptor) next))));
                    }
                } else {
                    bVar = null;
                }
                Collections.sort(c2, new C12737a(bVar));
                cVar = new C12738c(c2, bVar);
            }
        } catch (Throwable th) {
            C16596f a = C16596f.m42113a();
            StringBuilder k = C13555b.m33972k("Location:");
            k.append(this.f31463y);
            a.mo49363b(k.toString());
            a.mo49363b("Query:" + this.f31462x);
            a.mo49364c(new ApplicationBugException("Failed to perform local stop search", th));
        }
        if (cVar == null) {
            return Collections.emptyList();
        }
        this.f51765h = true;
        return Collections.singletonList(cVar);
    }

    public final Object call() throws Exception {
        return (C12738c) mo52626J();
    }

    /* renamed from: t */
    public final void mo20116t(HttpURLConnection httpURLConnection) throws IOException {
        super.mo20116t(httpURLConnection);
        httpURLConnection.setReadTimeout(2500);
    }
}
