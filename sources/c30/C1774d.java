package c30;

import aa0.C7543n;
import android.content.Context;
import c70.C13752e;
import ce0.C21100e;
import com.moovit.commons.appdata.AppDataPartLoadFailedException;
import com.moovit.commons.request.ServerException;
import com.moovit.matrolanguage.MetroLanguage;
import com.moovit.network.model.ServerId;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import p435de.C16596f;
import p646lz.C18299a;
import p824tp.C19731i;
import p929xy.C20663f;

/* renamed from: c30.d */
public final class C1774d extends C20663f<List<MetroLanguage>> {
    /* renamed from: f */
    public final Object mo6591f(Context context, C18299a aVar, String str) throws IOException, AppDataPartLoadFailedException, ServerException {
        try {
            return (List) super.mo6591f(context, aVar, str);
        } catch (Exception e) {
            C16596f.m42113a().mo49364c(new AppDataPartLoadFailedException("Failed to load metro languages!", (String) null, e));
            return Collections.emptyList();
        }
    }

    /* renamed from: n */
    public final Object mo6592n(Context context, C18299a aVar, ServerId serverId, long j) throws IOException, AppDataPartLoadFailedException, ServerException {
        List list;
        C1771a aVar2 = (C1771a) C19731i.m47197a(context).mo52084b(serverId, j).mo51794a(C1771a.class);
        aVar2.getClass();
        C21100e.m49355o();
        C7543n<List<MetroLanguage>> h = C1771a.m5073h(context);
        if (h == null || (list = h.get(aVar2.mo6589i())) == null) {
            return null;
        }
        return Collections.unmodifiableList(list);
    }

    /* renamed from: o */
    public final Object mo6593o(C13752e eVar, C18299a aVar, ServerId serverId, long j) throws IOException, AppDataPartLoadFailedException, ServerException {
        List<MetroLanguage> list = ((C1773c) new C1772b(eVar, serverId, j).mo52626J()).f6244m;
        Context context = eVar.f33852a;
        C1771a aVar2 = (C1771a) C19731i.m47197a(context).mo52084b(serverId, j).mo51794a(C1771a.class);
        aVar2.getClass();
        C21100e.m49355o();
        C7543n<List<MetroLanguage>> h = C1771a.m5073h(context);
        if (h != null) {
            h.put(aVar2.mo6589i(), list);
        }
        return list;
    }
}
