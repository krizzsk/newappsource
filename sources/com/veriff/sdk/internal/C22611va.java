package com.veriff.sdk.internal;

import java.util.EnumSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C23825c;
import mf0.C24362h;

@Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t\"2\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u0001X\u0004¢\u0006\u0002\n\u0000\"2\u0010\u0004\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u0001X\u0004¢\u0006\u0002\n\u0000\"2\u0010\u0005\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u0001X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, mo59060d2 = {"DECIDED_STATUSES", "Ljava/util/EnumSet;", "Lmobi/lab/veriff/data/api/request/response/VerificationStatus;", "kotlin.jvm.PlatformType", "EXPIRED_STATUSES", "SUBMITTED_STATUSES", "getResubmittedSession", "Lmobi/lab/veriff/data/api/request/response/ResubmittedSession;", "startSessionResponse", "Lmobi/lab/veriff/data/api/request/response/StartSessionResponse;", "veriff-library_dist"}, mo59061k = 2, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.va */
public final class C22611va {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final EnumSet<C22621vh> f57032a = EnumSet.of(C22621vh.approved, C22621vh.declined, C22621vh.review);
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final EnumSet<C22621vh> f57033b = EnumSet.of(C22621vh.abandoned, C22621vh.expired);
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final EnumSet<C22621vh> f57034c = EnumSet.of(C22621vh.submitted, C22621vh.preprocessed, C22621vh.verification_tool_checks_dispatched);

    /* renamed from: a */
    public static final C22607uy m55124a(C22609uz uzVar) {
        C24362h.m61211f(uzVar, "startSessionResponse");
        List<C22619vg> f = uzVar.mo56909f();
        String str = null;
        if (f == null || f.isEmpty()) {
            return null;
        }
        String a = ((C22619vg) C23825c.m58513j0(uzVar.mo56909f())).mo56957a();
        C22617vf d = ((C22619vg) C23825c.m58513j0(uzVar.mo56909f())).mo56960d();
        String b = d != null ? d.mo56946b() : null;
        C22617vf d2 = ((C22619vg) C23825c.m58513j0(uzVar.mo56909f())).mo56960d();
        Integer a2 = d2 != null ? d2.mo56945a() : null;
        C22556tm c = ((C22619vg) C23825c.m58513j0(uzVar.mo56909f())).mo56959c();
        if (c != null) {
            str = c.mo56741b();
        }
        return new C22607uy(a, b, a2, str);
    }
}
