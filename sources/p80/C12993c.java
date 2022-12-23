package p80;

import aa0.C7543n;
import android.content.Context;
import c00.C13720d;
import c70.C13752e;
import c70.C13772m;
import c70.C13779s;
import ce0.C21100e;
import com.moovit.MoovitExecutors;
import com.moovit.commons.appdata.AppDataPartLoadFailedException;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import com.moovit.network.model.ServerId;
import com.tranzmate.moovit.protocol.ticketingV2.MVProviderTicketingConfigurationResponse;
import com.tranzmate.moovit.protocol.ticketingV2.MVTicketingAgencyConfig;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import m80.C12873i;
import org.apache.thrift.TBase;
import p066e0.C4419c0;
import p066e0.C4454r0;
import p638lr.C18262i;
import p638lr.C18267n;
import p646lz.C18299a;
import p80.C12991b;
import p810sz.C19617r;
import p824tp.C19722a0;
import p824tp.C19728f;
import p828tt.C19759a;
import p899ws.C20406f;
import p929xy.C20664g;
import q80.C13036y;

/* renamed from: p80.c */
public final class C12993c extends C20664g<C12991b> {

    /* renamed from: c */
    public static final AtomicReference<C7543n<C12991b>> f32164c = new AtomicReference<>((Object) null);

    /* renamed from: p80.c$a */
    public static class C12994a extends C13779s<C12994a, MVProviderTicketingConfigurationResponse, C12991b> {
        public C12994a() {
            super(MVProviderTicketingConfigurationResponse.class);
        }

        /* renamed from: e */
        public final Object mo23773e(TBase tBase) throws BadResponseException {
            MVProviderTicketingConfigurationResponse mVProviderTicketingConfigurationResponse = (MVProviderTicketingConfigurationResponse) tBase;
            C19617r rVar = C13036y.f32248a;
            HashMap h = C13720d.m34278h(mVProviderTicketingConfigurationResponse.agencyConfigs, new C25541a(), new C18262i(25), new C18267n(23), new C4454r0(23));
            List<MVTicketingAgencyConfig> list = mVProviderTicketingConfigurationResponse.agencyConfigs;
            C20406f fVar = new C20406f(8);
            C19759a aVar = new C19759a(18);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            C13720d.m34276f(list, fVar, aVar, linkedHashSet);
            return new C12991b(new ArrayList(linkedHashSet), h);
        }
    }

    /* renamed from: k */
    public static C7543n<C12991b> m32873k(Context context) throws Exception {
        AtomicReference<C7543n<C12991b>> atomicReference = f32164c;
        C7543n<C12991b> nVar = atomicReference.get();
        if (nVar == null) {
            synchronized (atomicReference) {
                nVar = atomicReference.get();
                if (nVar == null) {
                    C12991b.C12992a aVar = C12991b.f32158f;
                    C7543n<C12991b> q = C7543n.m17285q(context, aVar, aVar, "ticketing_config");
                    q.mo51042l();
                    atomicReference.set(q);
                    nVar = q;
                }
            }
        }
        return nVar;
    }

    /* renamed from: l */
    public static C12991b m32874l(C13752e eVar) throws IOException, ServerException {
        C12991b bVar;
        Context context = eVar.f33852a;
        C19722a0 a0Var = eVar.f33853b;
        ServerId serverId = a0Var.f50160a.f32927c;
        C12994a aVar = (C12994a) new C13772m(eVar, C13772m.m34411L(context, C12873i.server_path_cdn_server_url, C12873i.api_path_ticketing_configuration, "", a0Var, (C19728f) null), C12994a.class).mo52626J();
        C12991b bVar2 = (C12991b) aVar.f33924g;
        if (aVar.mo52635a() && bVar2 != null) {
            C21100e.m49355o();
            try {
                m32873k(context).put(serverId.mo19751c(), bVar2);
            } catch (Throwable unused) {
            }
        }
        if (bVar2 != null) {
            return bVar2;
        }
        C21100e.m49355o();
        try {
            bVar = m32873k(context).get(serverId.mo19751c());
        } catch (Throwable unused2) {
            bVar = null;
        }
        return bVar;
    }

    /* renamed from: d */
    public final Object mo22058d(Context context, C18299a aVar) throws IOException, AppDataPartLoadFailedException, ServerException {
        C12991b bVar;
        ServerId serverId = ((C19722a0) aVar.mo50690c("USER_CONTEXT")).f50160a.f32927c;
        C21100e.m49355o();
        try {
            bVar = m32873k(context).get(serverId.mo19751c());
        } catch (Throwable unused) {
            bVar = null;
        }
        if (bVar != null) {
            MoovitExecutors.f37327IO.execute(new C4419c0(4, this, C20664g.m48584i(context, aVar), aVar));
        }
        return bVar;
    }

    /* renamed from: j */
    public final /* bridge */ /* synthetic */ Object mo23772j(C18299a aVar, C13752e eVar) throws IOException, AppDataPartLoadFailedException, ServerException {
        return m32874l(eVar);
    }
}
