package com.moovit.app.taxi.providers;

import aa0.C7543n;
import android.content.Context;
import android.content.res.Configuration;
import c00.C13717b;
import c00.C13720d;
import c00.C13722f;
import c70.C13752e;
import c70.C13772m;
import c70.C13779s;
import ce0.C21100e;
import com.moovit.MoovitExecutors;
import com.moovit.commons.appdata.AppDataPartLoadFailedException;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import com.moovit.commons.utils.ApplicationBugException;
import com.moovit.network.model.ServerId;
import com.tranzmate.R;
import com.tranzmate.moovit.protocol.taxi.MVTaxiMetroConfiguration;
import com.tranzmate.moovit.protocol.taxi.MVTaxiMetroConfigurationResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import org.apache.thrift.TBase;
import p066e0.C4454r0;
import p145k5.C5485d;
import p435de.C16596f;
import p567iq.C17635b;
import p646lz.C18299a;
import p824tp.C19722a0;
import p824tp.C19728f;
import p855uw.C20004a;
import p929xy.C20664g;
import p977zz.C20943i;
import q00.C19047a;
import q00.C19053d;

/* renamed from: com.moovit.app.taxi.providers.a */
public final class C15445a extends C20664g<TaxiProvidersManager> {

    /* renamed from: com.moovit.app.taxi.providers.a$a */
    public static /* synthetic */ class C15446a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f39994a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f39995b;

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|(2:1|2)|3|(2:5|6)|7|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0038 */
        static {
            /*
                com.tranzmate.moovit.protocol.taxi.MVTaxiPolygonsVisibiltyAffect[] r0 = com.tranzmate.moovit.protocol.taxi.MVTaxiPolygonsVisibiltyAffect.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f39995b = r0
                r1 = 1
                com.tranzmate.moovit.protocol.taxi.MVTaxiPolygonsVisibiltyAffect r2 = com.tranzmate.moovit.protocol.taxi.MVTaxiPolygonsVisibiltyAffect.NONE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f39995b     // Catch:{ NoSuchFieldError -> 0x001d }
                com.tranzmate.moovit.protocol.taxi.MVTaxiPolygonsVisibiltyAffect r3 = com.tranzmate.moovit.protocol.taxi.MVTaxiPolygonsVisibiltyAffect.VISIBLE_INSIDE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                com.tranzmate.moovit.protocol.taxi.MVTaxiVisibility[] r2 = com.tranzmate.moovit.protocol.taxi.MVTaxiVisibility.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                f39994a = r2
                com.tranzmate.moovit.protocol.taxi.MVTaxiVisibility r3 = com.tranzmate.moovit.protocol.taxi.MVTaxiVisibility.ALWAYS     // Catch:{ NoSuchFieldError -> 0x002e }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                int[] r1 = f39994a     // Catch:{ NoSuchFieldError -> 0x0038 }
                com.tranzmate.moovit.protocol.taxi.MVTaxiVisibility r2 = com.tranzmate.moovit.protocol.taxi.MVTaxiVisibility.NOT_INSTALLED     // Catch:{ NoSuchFieldError -> 0x0038 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0038 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0038 }
            L_0x0038:
                int[] r0 = f39994a     // Catch:{ NoSuchFieldError -> 0x0043 }
                com.tranzmate.moovit.protocol.taxi.MVTaxiVisibility r1 = com.tranzmate.moovit.protocol.taxi.MVTaxiVisibility.PAYMENT_ACCOUNT_CONNECTED     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moovit.app.taxi.providers.C15445a.C15446a.<clinit>():void");
        }
    }

    /* renamed from: com.moovit.app.taxi.providers.a$b */
    public static class C15447b extends C13779s<C15447b, MVTaxiMetroConfigurationResponse, TaxiProvidersManager> {
        public C15447b() {
            super(MVTaxiMetroConfigurationResponse.class);
        }

        /* renamed from: e */
        public final Object mo23773e(TBase tBase) throws BadResponseException {
            List list;
            int i;
            MVTaxiMetroConfigurationResponse mVTaxiMetroConfigurationResponse = (MVTaxiMetroConfigurationResponse) tBase;
            if (C13717b.m34258e(mVTaxiMetroConfigurationResponse.configurations)) {
                list = Collections.emptyList();
            } else {
                List<MVTaxiMetroConfiguration> list2 = mVTaxiMetroConfigurationResponse.configurations;
                C4454r0 r0Var = new C4454r0(7);
                List<MVTaxiMetroConfiguration> list3 = mVTaxiMetroConfigurationResponse.configurations;
                if (list3 == null) {
                    i = 0;
                } else {
                    i = list3.size();
                }
                ArrayList arrayList = new ArrayList(i);
                C13720d.m34276f(list2, (C13722f) null, r0Var, arrayList);
                list = arrayList;
            }
            return new TaxiProvidersManager(list);
        }
    }

    /* renamed from: k */
    public static TaxiProvidersManager m39504k(C13752e eVar) throws IOException, ServerException {
        Context context = eVar.f33852a;
        C19722a0 a0Var = eVar.f33853b;
        ServerId serverId = a0Var.f50160a.f32927c;
        TaxiProvidersManager taxiProvidersManager = (TaxiProvidersManager) ((C15447b) new C13772m(eVar, C13772m.m34411L(context, R.string.server_path_cdn_server_url, R.string.api_path_taxi_provider_configuration, "", a0Var, (C19728f) null), C15447b.class).mo52626J()).f33924g;
        if (taxiProvidersManager == null) {
            taxiProvidersManager = new TaxiProvidersManager(Collections.emptyList());
        }
        ((C20004a) C17635b.m43779f(context).f50175e.mo51794a(C20004a.class)).getClass();
        C21100e.m49355o();
        C7543n<TaxiProvidersManager> d = C20004a.m47494d(context);
        if (d != null) {
            d.put(serverId.mo19751c(), taxiProvidersManager);
        }
        return taxiProvidersManager;
    }

    /* renamed from: a */
    public final Object mo46174a(Context context, Configuration configuration, C18299a aVar) {
        return C20943i.m49050c(configuration);
    }

    /* renamed from: b */
    public final HashSet mo20294b(Context context) {
        HashSet b = super.mo20294b(context);
        b.add("CONFIGURATION");
        return b;
    }

    /* renamed from: d */
    public final Object mo22058d(Context context, C18299a aVar) throws IOException, AppDataPartLoadFailedException, ServerException {
        TaxiProvidersManager taxiProvidersManager;
        if (!((Boolean) ((C19047a) aVar.mo50690c("CONFIGURATION")).mo51505b(C19053d.f48486y)).booleanValue()) {
            return new TaxiProvidersManager(Collections.emptyList());
        }
        ServerId serverId = ((C19722a0) aVar.mo50690c("USER_CONTEXT")).f50160a.f32927c;
        ((C20004a) C17635b.m43779f(context).f50175e.mo51794a(C20004a.class)).getClass();
        C21100e.m49355o();
        C7543n<TaxiProvidersManager> d = C20004a.m47494d(context);
        if (d == null) {
            taxiProvidersManager = null;
        } else {
            taxiProvidersManager = d.get(serverId.mo19751c());
        }
        if (taxiProvidersManager != null) {
            MoovitExecutors.f37327IO.execute(new C5485d(4, this, C20664g.m48584i(context, aVar), aVar));
        }
        return taxiProvidersManager;
    }

    /* renamed from: f */
    public final Object mo6591f(Context context, C18299a aVar, String str) throws IOException, AppDataPartLoadFailedException, ServerException {
        TaxiProvidersManager taxiProvidersManager;
        try {
            taxiProvidersManager = (TaxiProvidersManager) super.mo6591f(context, aVar, str);
        } catch (Exception e) {
            C16596f.m42113a().mo49364c(new ApplicationBugException("Failed to load taxi providers!", e));
            taxiProvidersManager = new TaxiProvidersManager(Collections.emptyList());
        }
        if (taxiProvidersManager != null) {
            List<TaxiProvider> list = taxiProvidersManager.f39985b;
            Context applicationContext = context.getApplicationContext();
            for (TaxiProvider taxiProvider : list) {
                taxiProvider.f39976k.mo46102b().mo52437a(applicationContext);
            }
        }
        return taxiProvidersManager;
    }

    /* renamed from: j */
    public final /* bridge */ /* synthetic */ Object mo23772j(C18299a aVar, C13752e eVar) throws IOException, AppDataPartLoadFailedException, ServerException {
        return m39504k(eVar);
    }
}
