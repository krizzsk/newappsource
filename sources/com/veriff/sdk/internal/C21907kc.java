package com.veriff.sdk.internal;

import com.veriff.sdk.internal.C21667gf;
import com.veriff.sdk.internal.C21887jt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

@Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0002¨\u0006\u0003"}, mo59060d2 = {"toSentrySeverity", "Lcom/veriff/sdk/internal/data/SentryReport$Severity;", "Lcom/veriff/sdk/internal/analytics/Event$ErrorReportSeverity;", "veriff-library_dist"}, mo59061k = 2, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.kc */
public final class C21907kc {
    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final C21887jt.C21891d m53466b(C21667gf.C21710c cVar) {
        int i = C21908kd.f55386a[cVar.ordinal()];
        if (i == 1) {
            return C21887jt.C21891d.fatal;
        }
        if (i == 2) {
            return C21887jt.C21891d.error;
        }
        if (i == 3) {
            return C21887jt.C21891d.warning;
        }
        throw new NoWhenBranchMatchedException();
    }
}
