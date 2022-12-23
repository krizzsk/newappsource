package a80;

import android.content.Context;
import c00.C13720d;
import c00.C13722f;
import c70.C13752e;
import c70.C13772m;
import c70.C13779s;
import com.moovit.commons.appdata.AppDataPartLoadFailedException;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import com.tranzmate.moovit.protocol.search.MVMetroPopularLocationsResponse;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import org.apache.thrift.TBase;
import p009a8.C0112l;
import p435de.C16596f;
import p646lz.C18299a;
import p824tp.C19722a0;
import p824tp.C19728f;
import p824tp.C19746x;
import p929xy.C20664g;

/* renamed from: a80.b */
public final class C7514b extends C20664g<C7513a> {

    /* renamed from: a80.b$a */
    public static class C7515a extends C13779s<C7515a, MVMetroPopularLocationsResponse, C7513a> {
        public C7515a() {
            super(MVMetroPopularLocationsResponse.class);
        }

        /* renamed from: e */
        public final Object mo23773e(TBase tBase) throws BadResponseException {
            List list;
            List<String> list2;
            MVMetroPopularLocationsResponse mVMetroPopularLocationsResponse = (MVMetroPopularLocationsResponse) tBase;
            if (mVMetroPopularLocationsResponse.mo31451f()) {
                list = C13720d.m34273c(mVMetroPopularLocationsResponse.popularLocations, (C13722f) null, new C0112l(18));
            } else {
                list = Collections.emptyList();
            }
            if (mVMetroPopularLocationsResponse.mo31452g()) {
                list2 = mVMetroPopularLocationsResponse.searchCaptions;
            } else {
                list2 = Collections.emptyList();
            }
            return new C7513a(list, list2);
        }
    }

    /* renamed from: f */
    public final Object mo6591f(Context context, C18299a aVar, String str) throws IOException, AppDataPartLoadFailedException, ServerException {
        try {
            return (C7513a) super.mo6591f(context, aVar, str);
        } catch (Exception e) {
            C16596f.m42113a().mo49364c(e);
            return new C7513a(Collections.emptyList(), Collections.emptyList());
        }
    }

    /* renamed from: j */
    public final Object mo23772j(C18299a aVar, C13752e eVar) throws IOException, AppDataPartLoadFailedException, ServerException {
        return (C7513a) ((C7515a) new C13772m(eVar, C13772m.m34411L(eVar.f33852a, C19746x.server_path_cdn_server_url, C19746x.api_path_get_popular_locations, "", (C19722a0) aVar.mo50690c("USER_CONTEXT"), (C19728f) null), C7515a.class).mo52626J()).f33924g;
    }
}
