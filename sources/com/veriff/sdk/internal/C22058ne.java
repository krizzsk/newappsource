package com.veriff.sdk.internal;

import com.veriff.sdk.internal.C21924kn;
import com.veriff.sdk.internal.C22561tq;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mobi.lab.veriff.util.C24465j;
import p583jk.C17875h;

@Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000*\n\u0000\n\u0002\u0010 \n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b*\b\u0012\u0004\u0012\u00020\r0\u000bH\u0002\"\u001a\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0003\u0010\u0004\"\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000\"\u0016\u0010\u0007\u001a\n \t*\u0004\u0018\u00010\b0\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, mo59060d2 = {"RETRIES", "", "", "getRETRIES$annotations", "()V", "TYPE_STREAM", "", "log", "Lmobi/lab/veriff/util/Log;", "kotlin.jvm.PlatformType", "toInflowResponse", "Lcom/veriff/sdk/internal/network/ApiResult;", "Lmobi/lab/veriff/data/api/request/response/InflowResponse;", "Lmobi/lab/veriff/data/api/request/response/EmptyResponse;", "veriff-library_dist"}, mo59061k = 2, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.ne */
public final class C22058ne {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final C24465j f55643a = C24465j.m61536a(C22054nd.class);
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final List<Long> f55644b = C17875h.m44281E(3000L, Long.valueOf(InstallSheetPresenter.LOADING_TIMER_DELAY_IN_MILLIS), 8000L);

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final C21924kn<C22561tq> m53791b(C21924kn<C22558tn> knVar) {
        if (knVar instanceof C21924kn.C21925a) {
            return new C21924kn.C21925a(((C21924kn.C21925a) knVar).mo55705a());
        }
        if (knVar instanceof C21924kn.C21926b) {
            C21924kn.C21926b bVar = (C21924kn.C21926b) knVar;
            return new C21924kn.C21926b(bVar.mo55709a(), bVar.mo55710b(), bVar.mo55711c());
        } else if (knVar instanceof C21924kn.C21927c) {
            return new C21924kn.C21927c(new C22561tq(true, (List) null, (C22561tq.C22563b) null, (C22561tq.C22566c) null, 14, (DefaultConstructorMarker) null));
        } else {
            if (knVar instanceof C21924kn.C21928d) {
                return new C21924kn.C21928d(((C21924kn.C21928d) knVar).mo55719a());
            }
            throw new NoWhenBranchMatchedException();
        }
    }
}
