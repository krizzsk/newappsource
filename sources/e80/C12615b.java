package e80;

import c70.C13749c;
import c70.C13752e;
import c70.C13778r;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.user.LocaleInfo;
import com.tranzmate.moovit.protocol.search.MVSearchRequest;
import com.tranzmate.moovit.protocol.search.MVSearchResultType;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.concurrent.Callable;
import p824tp.C19746x;

/* renamed from: e80.b */
public final class C12615b extends C13778r<C12615b, C12616c, MVSearchRequest> implements Callable<C12616c> {

    /* renamed from: w */
    public static ArrayList f31176w = new ArrayList(EnumSet.complementOf(EnumSet.of(MVSearchResultType.STOP)));

    public C12615b(C13752e eVar, String str, LatLonE6 latLonE6) {
        super(eVar, C19746x.server_path_search_server_url, C19746x.api_path_search_locations_request_path, C12616c.class);
        RO mVSearchRequest = new MVSearchRequest(str, eVar.f33853b.f50160a.f32927c.f15142b, 0);
        mVSearchRequest.requiredResults = f31176w;
        if (latLonE6 != null) {
            mVSearchRequest.userLocation = C13749c.m34332r(latLonE6);
        }
        LocaleInfo b = LocaleInfo.m17919b(eVar.f33852a);
        if (b != null) {
            mVSearchRequest.locale = C13749c.m34333s(b);
        }
        this.f33922v = mVSearchRequest;
    }

    public final Object call() throws Exception {
        return (C12616c) mo52626J();
    }

    /* renamed from: t */
    public final void mo20116t(HttpURLConnection httpURLConnection) throws IOException {
        super.mo20116t(httpURLConnection);
        httpURLConnection.setReadTimeout(2500);
    }
}
