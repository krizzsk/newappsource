package com.veriff.sdk.internal;

import android.net.Uri;
import com.veriff.sdk.internal.C22561tq;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import mf0.C24362h;

@Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0014\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, mo59060d2 = {"validatedImages", "Lmobi/lab/veriff/data/api/request/response/FeedbackImages;", "Lmobi/lab/veriff/data/api/request/response/InflowResponse$Feedback;", "baseUrl", "", "veriff-library_dist"}, mo59061k = 2, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.tr */
public final class C22573tr {
    /* renamed from: a */
    public static final C22560tp m54981a(C22561tq.C22563b bVar, String str) {
        T t;
        String a;
        T t2;
        String a2;
        boolean z;
        boolean z2;
        C24362h.m61211f(bVar, "$this$validatedImages");
        C24362h.m61211f(str, "baseUrl");
        List<C22561tq.C22563b.C22564a> d = bVar.mo56774d();
        if (d == null) {
            return null;
        }
        Iterator<T> it = d.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (((C22561tq.C22563b.C22564a) t).mo56779b() == C22561tq.C22563b.C22564a.C22565a.NOK) {
                z2 = true;
                continue;
            } else {
                z2 = false;
                continue;
            }
            if (z2) {
                break;
            }
        }
        C22561tq.C22563b.C22564a aVar = (C22561tq.C22563b.C22564a) t;
        if (aVar == null || (a = aVar.mo56778a()) == null) {
            return null;
        }
        Iterator<T> it2 = d.iterator();
        while (true) {
            if (!it2.hasNext()) {
                t2 = null;
                break;
            }
            t2 = it2.next();
            if (((C22561tq.C22563b.C22564a) t2).mo56779b() == C22561tq.C22563b.C22564a.C22565a.f56937a) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                break;
            }
        }
        C22561tq.C22563b.C22564a aVar2 = (C22561tq.C22563b.C22564a) t2;
        if (aVar2 == null || (a2 = aVar2.mo56778a()) == null) {
            return null;
        }
        try {
            C22738yl f = C22738yl.m55584f(str);
            Uri parse = Uri.parse(f.mo57304q().mo57317e(a).mo57315c().toString());
            C24362h.m61210e(parse, "Uri.parse(url.newBuilder…Path).build().toString())");
            Uri parse2 = Uri.parse(f.mo57304q().mo57317e(a2).mo57315c().toString());
            C24362h.m61210e(parse2, "Uri.parse(url.newBuilder…Path).build().toString())");
            return new C22560tp(parse, parse2);
        } catch (Exception unused) {
            return null;
        }
    }
}
