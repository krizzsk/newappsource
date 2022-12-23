package com.veriff.sdk.internal;

import com.veriff.sdk.internal.C21430ba;
import java.io.IOException;
import java.util.Date;

/* renamed from: com.veriff.sdk.internal.bm */
public final class C21470bm extends C21420av<Date> {
    /* renamed from: b */
    public synchronized Date mo54204a(C21430ba baVar) throws IOException {
        if (baVar.mo54249h() == C21430ba.C21432b.NULL) {
            return (Date) baVar.mo54253l();
        }
        return C21469bl.m51274a(baVar.mo54251j());
    }

    /* renamed from: a */
    public synchronized void mo54205a(C21437bf bfVar, Date date) throws IOException {
        if (date == null) {
            bfVar.mo54276e();
        } else {
            bfVar.mo54272b(C21469bl.m51273a(date));
        }
    }
}
