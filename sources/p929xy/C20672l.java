package p929xy;

import android.content.Context;
import c00.C13720d;
import c00.C13722f;
import c70.C13752e;
import c70.C13772m;
import c70.C13779s;
import com.bumptech.glide.Priority;
import com.moovit.commons.appdata.AppDataPartLoadFailedException;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import com.moovit.image.glide.data.ImageData;
import com.moovit.metro.selection.Country;
import com.tranzmate.moovit.protocol.users.MVCountriesResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import org.apache.thrift.TBase;
import p583jk.C17884p;
import p638lr.C18262i;
import p638lr.C18267n;
import p646lz.C18299a;
import p824tp.C19722a0;
import p824tp.C19728f;
import p824tp.C19746x;
import p977zz.C20944i0;
import r10.C19220d;

/* renamed from: xy.l */
public final class C20672l extends C20664g<List<Country>> {

    /* renamed from: xy.l$a */
    public static class C20673a extends C13779s<C20673a, MVCountriesResponse, C20944i0<List<Country>, Collection<ImageData>>> {
        public C20673a() {
            super(MVCountriesResponse.class);
        }

        /* renamed from: e */
        public final Object mo23773e(TBase tBase) throws BadResponseException {
            MVCountriesResponse mVCountriesResponse = (MVCountriesResponse) tBase;
            ArrayList<O> arrayList = null;
            ArrayList<O> c = C13720d.m34273c(mVCountriesResponse.countries, (C13722f) null, new C18262i(13));
            if (mVCountriesResponse.mo35021g()) {
                arrayList = C13720d.m34273c(mVCountriesResponse.flags, (C13722f) null, new C18267n(10));
            }
            return new C20944i0(c, arrayList);
        }
    }

    /* renamed from: b */
    public final HashSet mo20294b(Context context) {
        HashSet b = super.mo20294b(context);
        b.remove("USER_CONTEXT");
        return b;
    }

    /* renamed from: j */
    public final Object mo23772j(C18299a aVar, C13752e eVar) throws IOException, AppDataPartLoadFailedException, ServerException {
        boolean z;
        int i;
        Context context = eVar.f33852a;
        C19722a0 a0Var = (C19722a0) aVar.mo50690c("USER_CONTEXT");
        if (a0Var == null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i = C19746x.api_path_supported_metros_with_flags_path;
        } else {
            i = C19746x.api_path_supported_metros_path;
        }
        C20673a aVar2 = (C20673a) new C13772m(eVar, C13772m.m34412M(context, i, "", a0Var, (C19728f) null), C20673a.class).mo52626J();
        C20944i0 i0Var = (C20944i0) aVar2.f33924g;
        if (i0Var != null) {
            Collection<ImageData> collection = (Collection) i0Var.f52693b;
            if (aVar2.mo52635a() && z && collection != null) {
                for (ImageData Y : collection) {
                    ((C19220d) C17884p.m44353X(context).mo51641u().mo10855Y(Y)).mo22740y(Priority.HIGH).mo10862d0();
                }
            }
            return (List) i0Var.f52692a;
        }
        throw new IOException("Failed to load supported metro areas");
    }
}
