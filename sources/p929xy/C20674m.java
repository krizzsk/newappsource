package p929xy;

import aa0.C7538j;
import android.content.Context;
import c70.C13752e;
import com.moovit.commons.appdata.AppDataPartLoadFailedException;
import com.moovit.commons.request.ServerException;
import com.moovit.network.model.ServerId;
import j80.C12786g;
import java.io.IOException;
import java.util.HashSet;
import java.util.Objects;
import k80.C12808c;
import k80.C12809d;
import l80.C12849a;
import p435de.C16596f;
import p646lz.C18299a;
import p669mz.C18482c;
import p824tp.C19728f;
import p824tp.C19731i;
import q00.C19047a;
import q00.C19053d;
import u00.C19857s;

/* renamed from: xy.m */
public final class C20674m extends C20663f<C12786g> {
    /* renamed from: b */
    public final HashSet mo20294b(Context context) {
        HashSet b = super.mo20294b(context);
        b.add("CONFIGURATION");
        b.add("SEARCH_LINE_FTS");
        return b;
    }

    /* renamed from: f */
    public final Object mo6591f(Context context, C18299a aVar, String str) throws IOException, AppDataPartLoadFailedException, ServerException {
        try {
            return (C12786g) super.mo6591f(context, aVar, str);
        } catch (Exception e) {
            C16596f.m42113a().mo49364c(e);
            return C12786g.m32590a();
        }
    }

    /* renamed from: n */
    public final Object mo6592n(Context context, C18299a aVar, ServerId serverId, long j) throws IOException, AppDataPartLoadFailedException, ServerException {
        boolean z;
        C19047a aVar2 = (C19047a) aVar.mo50690c("CONFIGURATION");
        if (aVar2 != null) {
            boolean z2 = true;
            if (C12849a.m32653a(context, aVar2, "mock") != null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (((Integer) aVar2.mo51505b(C19053d.f48485x)).intValue() == 0) {
                    z2 = false;
                }
                if (!z2) {
                    return C12786g.m32590a();
                }
                C7538j<C12786g> h = ((C19857s) C19731i.m47197a(context).mo52084b(serverId, j).mo51794a(C19857s.class)).mo52157h(context);
                h.mo51499b();
                C18482c<T> cVar = h.f48432b;
                if (cVar.isEmpty()) {
                    return null;
                }
                return (C12786g) cVar.get(0);
            }
        }
        return C12786g.m32590a();
    }

    /* renamed from: o */
    public final Object mo6593o(C13752e eVar, C18299a aVar, ServerId serverId, long j) throws IOException, AppDataPartLoadFailedException, ServerException {
        C12786g gVar = ((C12809d) new C12808c(eVar, (C19728f) aVar.mo50690c("METRO_CONTEXT")).mo52626J()).f31674m;
        Context context = eVar.f33852a;
        C19857s sVar = (C19857s) C19731i.m47197a(context).mo52084b(serverId, j).mo51794a(C19857s.class);
        Objects.toString(sVar.mo52107d());
        sVar.mo52109f();
        C7538j<C12786g> h = sVar.mo52157h(context);
        h.mo51499b();
        C18482c<T> cVar = h.f48432b;
        cVar.clear();
        cVar.add(gVar);
        h.mo51500c();
        return gVar;
    }
}
