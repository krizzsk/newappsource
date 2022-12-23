package com.moovit.app.topup;

import c00.C13720d;
import c00.C13722f;
import c70.C13746a;
import c70.C13780t;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import com.tranzmate.moovit.protocol.transitcardalert.MVTopUpStateResponse;
import java.io.IOException;
import java.util.ArrayList;
import org.apache.thrift.TBase;
import p543hq.C17478e;
import p760qx.C19200d;

/* renamed from: com.moovit.app.topup.a */
public final class C15574a extends C13780t<C19200d, C15574a, MVTopUpStateResponse> {

    /* renamed from: m */
    public String f40502m = null;

    /* renamed from: n */
    public ArrayList f40503n = null;

    /* renamed from: com.moovit.app.topup.a$a */
    public static /* synthetic */ class C15575a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f40504a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.tranzmate.moovit.protocol.transitcardalert.MVCardPresentationType[] r0 = com.tranzmate.moovit.protocol.transitcardalert.MVCardPresentationType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f40504a = r0
                com.tranzmate.moovit.protocol.transitcardalert.MVCardPresentationType r1 = com.tranzmate.moovit.protocol.transitcardalert.MVCardPresentationType.REGULAR     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f40504a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.tranzmate.moovit.protocol.transitcardalert.MVCardPresentationType r1 = com.tranzmate.moovit.protocol.transitcardalert.MVCardPresentationType.BALANCE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moovit.app.topup.C15574a.C15575a.<clinit>():void");
        }
    }

    public C15574a() {
        super(MVTopUpStateResponse.class);
    }

    /* renamed from: m */
    public final void mo5816m(C13746a aVar, TBase tBase) throws IOException, BadResponseException, ServerException {
        C19200d dVar = (C19200d) aVar;
        MVTopUpStateResponse mVTopUpStateResponse = (MVTopUpStateResponse) tBase;
        this.f40502m = mVTopUpStateResponse.defaultURI;
        ArrayList<O> arrayList = null;
        if (mVTopUpStateResponse.mo34133f()) {
            arrayList = C13720d.m34273c(mVTopUpStateResponse.cardsInformation.cards, (C13722f) null, new C17478e(6));
        }
        this.f40503n = arrayList;
    }
}
