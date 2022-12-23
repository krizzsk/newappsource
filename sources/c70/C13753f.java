package c70;

import ce0.C21100e;
import com.moovit.request.RequestOptions;
import p906wz.C20431c;

/* renamed from: c70.f */
public final class C13753f<RQ extends C20431c<? extends RQ, ?>> {

    /* renamed from: a */
    public final String f33855a;

    /* renamed from: b */
    public final RQ f33856b;

    /* renamed from: c */
    public final RequestOptions f33857c;

    public C13753f(String str, RQ rq, RequestOptions requestOptions) {
        C21100e.m49373x(str, "requestId");
        this.f33855a = str;
        this.f33856b = rq;
        C21100e.m49373x(requestOptions, "requestOptions");
        this.f33857c = requestOptions;
    }

    public C13753f(String str, C13746a aVar) {
        this(str, aVar, new RequestOptions());
    }
}
