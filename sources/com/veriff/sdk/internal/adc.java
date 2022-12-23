package com.veriff.sdk.internal;

import com.veriff.sdk.internal.C21430ba;
import java.io.IOException;

final class adc<T> implements aci<C22759yv, T> {

    /* renamed from: a */
    private static final abl f53815a = abl.m50464c("EFBBBF");

    /* renamed from: b */
    private final C21420av<T> f53816b;

    public adc(C21420av<T> avVar) {
        this.f53816b = avVar;
    }

    /* renamed from: a */
    public T mo53996a(C22759yv yvVar) throws IOException {
        abk c = yvVar.mo54033c();
        try {
            abl abl = f53815a;
            if (c.mo53862a(0, abl)) {
                c.mo53900i((long) abl.mo53946h());
            }
            C21430ba a = C21430ba.m51054a(c);
            T a2 = this.f53816b.mo54204a(a);
            if (a.mo54249h() == C21430ba.C21432b.END_DOCUMENT) {
                return a2;
            }
            throw new C21426ax("JSON document was not fully consumed.");
        } finally {
            yvVar.close();
        }
    }
}
