package com.veriff.sdk.internal;

import kotlin.Metadata;
import mf0.C24362h;

@Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\" \u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00028@X\u0004¢\u0006\f\u0012\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, mo59060d2 = {"flowStep", "Lcom/veriff/sdk/internal/data/FlowStep;", "Lcom/veriff/sdk/internal/upload/Media;", "getFlowStep$annotations", "(Lcom/veriff/sdk/internal/upload/Media;)V", "getFlowStep", "(Lcom/veriff/sdk/internal/upload/Media;)Lcom/veriff/sdk/internal/data/FlowStep;", "veriff-library_dist"}, mo59061k = 2, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.ql */
public final class C22329ql {
    /* renamed from: a */
    public static final C21791iy m54416a(C22046na naVar) {
        C21882jp jpVar;
        String h;
        boolean z;
        C24362h.m61211f(naVar, "$this$flowStep");
        C21882jp[] values = C21882jp.values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                jpVar = null;
                break;
            }
            jpVar = values[i];
            if (C24362h.m61206a(jpVar.mo55595a(), naVar.mo55889d()) || C24362h.m61206a(jpVar.mo55596b(), naVar.mo55889d())) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                break;
            }
            i++;
        }
        if (jpVar == null) {
            return null;
        }
        int i2 = C22330qm.f56331a[jpVar.ordinal()];
        if (i2 == 1) {
            return C21791iy.TAKE_PORTRAIT;
        }
        if (i2 == 2) {
            String h2 = naVar.mo55894h();
            if (h2 != null) {
                return C21791iy.f55198q.mo55541b(h2);
            }
            return null;
        } else if (i2 == 3) {
            String h3 = naVar.mo55894h();
            if (h3 != null) {
                return C21791iy.f55198q.mo55542c(h3);
            }
            return null;
        } else if (i2 == 4 && (h = naVar.mo55894h()) != null) {
            return C21791iy.f55198q.mo55538a(h);
        } else {
            return null;
        }
    }
}
