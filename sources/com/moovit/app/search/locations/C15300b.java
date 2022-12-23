package com.moovit.app.search.locations;

import c00.C13720d;
import c00.C13722f;
import c70.C13746a;
import c70.C13780t;
import com.facebook.appevents.C2342l;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import com.tranzmate.moovit.protocol.search.MVSearchResponse;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import org.apache.thrift.TBase;
import p878vv.C20237d;
import p878vv.C20238e;

/* renamed from: com.moovit.app.search.locations.b */
public final class C15300b extends C13780t<C20237d, C15300b, MVSearchResponse> {

    /* renamed from: m */
    public List<SearchLocationItem> f39535m = Collections.emptyList();

    /* renamed from: n */
    public C20238e f39536n = null;

    /* renamed from: com.moovit.app.search.locations.b$a */
    public static /* synthetic */ class C15301a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f39537a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f39538b;

        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|(2:1|2)|3|(2:5|6)|7|9|10|11|12|13|14|15|16|17|18|20) */
        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|1|2|3|5|6|7|9|10|11|12|13|14|15|16|17|18|20) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0038 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0043 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x004e */
        static {
            /*
                com.tranzmate.moovit.protocol.common.MVSiteSource[] r0 = com.tranzmate.moovit.protocol.common.MVSiteSource.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f39538b = r0
                r1 = 1
                com.tranzmate.moovit.protocol.common.MVSiteSource r2 = com.tranzmate.moovit.protocol.common.MVSiteSource.UNDEFINED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f39538b     // Catch:{ NoSuchFieldError -> 0x001d }
                com.tranzmate.moovit.protocol.common.MVSiteSource r3 = com.tranzmate.moovit.protocol.common.MVSiteSource.EVENT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                com.tranzmate.moovit.protocol.search.MVSearchResultType[] r2 = com.tranzmate.moovit.protocol.search.MVSearchResultType.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                f39537a = r2
                com.tranzmate.moovit.protocol.search.MVSearchResultType r3 = com.tranzmate.moovit.protocol.search.MVSearchResultType.STOP     // Catch:{ NoSuchFieldError -> 0x002e }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                int[] r1 = f39537a     // Catch:{ NoSuchFieldError -> 0x0038 }
                com.tranzmate.moovit.protocol.search.MVSearchResultType r2 = com.tranzmate.moovit.protocol.search.MVSearchResultType.CITY     // Catch:{ NoSuchFieldError -> 0x0038 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0038 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0038 }
            L_0x0038:
                int[] r0 = f39537a     // Catch:{ NoSuchFieldError -> 0x0043 }
                com.tranzmate.moovit.protocol.search.MVSearchResultType r1 = com.tranzmate.moovit.protocol.search.MVSearchResultType.STREET     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                int[] r0 = f39537a     // Catch:{ NoSuchFieldError -> 0x004e }
                com.tranzmate.moovit.protocol.search.MVSearchResultType r1 = com.tranzmate.moovit.protocol.search.MVSearchResultType.SITE     // Catch:{ NoSuchFieldError -> 0x004e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                int[] r0 = f39537a     // Catch:{ NoSuchFieldError -> 0x0059 }
                com.tranzmate.moovit.protocol.search.MVSearchResultType r1 = com.tranzmate.moovit.protocol.search.MVSearchResultType.GEOCODE     // Catch:{ NoSuchFieldError -> 0x0059 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0059 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0059 }
            L_0x0059:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moovit.app.search.locations.C15300b.C15301a.<clinit>():void");
        }
    }

    public C15300b() {
        super(MVSearchResponse.class);
    }

    /* renamed from: m */
    public final void mo5816m(C13746a aVar, TBase tBase) throws IOException, BadResponseException, ServerException {
        boolean z;
        C20237d dVar = (C20237d) aVar;
        MVSearchResponse mVSearchResponse = (MVSearchResponse) tBase;
        if (mVSearchResponse != null) {
            this.f39535m = C13720d.m34273c(mVSearchResponse.results, (C13722f) null, new C2342l(6));
            C20238e eVar = dVar.f51342w;
            C20238e eVar2 = new C20238e(eVar.f51344a, mVSearchResponse.endIndex);
            short s = eVar2.f51345b;
            boolean z2 = true;
            if (s == -1) {
                z = true;
            } else {
                z = false;
            }
            if (z || s <= eVar.f51345b) {
                z2 = false;
            }
            if (z2) {
                this.f39536n = eVar2;
            }
        }
    }
}
