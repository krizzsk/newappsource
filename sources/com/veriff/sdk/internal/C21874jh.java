package com.veriff.sdk.internal;

import com.appboy.models.InAppMessageBase;
import com.appsflyer.ServerParameters;
import com.veriff.sdk.internal.C21430ba;
import com.veriff.sdk.internal.C21887jt;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.Metadata;
import mf0.C24362h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001a\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R \u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0011R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0011R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0011¨\u0006\u001d"}, mo59060d2 = {"Lcom/veriff/sdk/internal/data/KotshiSentryReportJsonAdapter;", "Lse/ansman/kotshi/NamedJsonAdapter;", "Lcom/veriff/sdk/internal/data/SentryReport;", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "Lnb0/k;", "writer", "value", "Lbf0/d;", "toJson", "Lcom/squareup/moshi/JsonReader$a;", "options", "Lcom/squareup/moshi/JsonReader$a;", "Lcom/squareup/moshi/k;", "Lcom/veriff/sdk/internal/data/SentryReport$Device;", "sentryReportDeviceAdapter", "Lcom/squareup/moshi/k;", "", "Lcom/veriff/sdk/internal/data/SentryReport$Exception;", "sentryReportExceptionListAdapter", "Lcom/veriff/sdk/internal/data/SentryReport$Os;", "sentryReportOsAdapter", "Lcom/veriff/sdk/internal/data/SentryReport$Severity;", "sentryReportSeverityAdapter", "Lcom/squareup/moshi/o;", "moshi", "<init>", "(Lcom/squareup/moshi/o;)V", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.jh */
public final class C21874jh extends aed<C21887jt> {

    /* renamed from: a */
    private final C21420av<C21887jt.C21891d> f55292a;

    /* renamed from: b */
    private final C21420av<C21887jt.C21888a> f55293b;

    /* renamed from: c */
    private final C21420av<C21887jt.C21890c> f55294c;

    /* renamed from: d */
    private final C21420av<List<C21887jt.C21889b>> f55295d;

    /* renamed from: e */
    private final C21430ba.C21431a f55296e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21874jh(C21450bi biVar) {
        super("KotshiJsonAdapter(SentryReport)");
        C24362h.m61211f(biVar, "moshi");
        C21420av<C21887jt.C21891d> a = biVar.mo54334a(C21887jt.C21891d.class);
        C24362h.m61210e(a, "moshi.adapter(SentryRepo…ty::class.javaObjectType)");
        this.f55292a = a;
        C21420av<C21887jt.C21888a> a2 = biVar.mo54334a(C21887jt.C21888a.class);
        C24362h.m61210e(a2, "moshi.adapter(SentryRepo…ce::class.javaObjectType)");
        this.f55293b = a2;
        C21420av<C21887jt.C21890c> a3 = biVar.mo54334a(C21887jt.C21890c.class);
        C24362h.m61210e(a3, "moshi.adapter(SentryRepo…Os::class.javaObjectType)");
        this.f55294c = a3;
        C21420av<List<C21887jt.C21889b>> a4 = biVar.mo54335a((Type) C21468bk.m51261a((Type) List.class, C21887jt.C21889b.class));
        C24362h.m61210e(a4, "moshi.adapter(Types.newP…n::class.javaObjectType))");
        this.f55295d = a4;
        C21430ba.C21431a a5 = C21430ba.C21431a.m51080a(InAppMessageBase.MESSAGE, "severity", ServerParameters.DEVICE_KEY, "os", "exceptions");
        C24362h.m61210e(a5, "JsonReader.Options.of(\n …\",\n      \"exceptions\"\n  )");
        this.f55296e = a5;
    }

    /* renamed from: b */
    public C21887jt mo54204a(C21430ba baVar) throws IOException {
        StringBuilder sb;
        C24362h.m61211f(baVar, "reader");
        if (baVar.mo54249h() == C21430ba.C21432b.NULL) {
            return (C21887jt) baVar.mo54253l();
        }
        baVar.mo54246e();
        String str = null;
        C21887jt.C21891d dVar = null;
        C21887jt.C21888a aVar = null;
        C21887jt.C21890c cVar = null;
        List list = null;
        while (baVar.mo54248g()) {
            int a = baVar.mo54236a(this.f55296e);
            if (a == -1) {
                baVar.mo54250i();
                baVar.mo54257p();
            } else if (a != 0) {
                if (a == 1) {
                    dVar = this.f55292a.mo54204a(baVar);
                } else if (a == 2) {
                    aVar = this.f55293b.mo54204a(baVar);
                } else if (a == 3) {
                    cVar = this.f55294c.mo54204a(baVar);
                } else if (a == 4) {
                    list = this.f55295d.mo54204a(baVar);
                }
            } else if (baVar.mo54249h() == C21430ba.C21432b.NULL) {
                baVar.mo54257p();
            } else {
                str = baVar.mo54251j();
            }
        }
        baVar.mo54247f();
        if (str == null) {
            sb = aec.m50903a((StringBuilder) null, InAppMessageBase.MESSAGE, (String) null, 2, (Object) null);
        } else {
            sb = null;
        }
        if (dVar == null) {
            sb = aec.m50903a(sb, "severity", (String) null, 2, (Object) null);
        }
        if (aVar == null) {
            sb = aec.m50903a(sb, ServerParameters.DEVICE_KEY, (String) null, 2, (Object) null);
        }
        if (cVar == null) {
            sb = aec.m50903a(sb, "os", (String) null, 2, (Object) null);
        }
        if (list == null) {
            sb = aec.m50903a(sb, "exceptions", (String) null, 2, (Object) null);
        }
        if (sb == null) {
            C24362h.m61208c(str);
            C24362h.m61208c(dVar);
            C24362h.m61208c(aVar);
            C24362h.m61208c(cVar);
            C24362h.m61208c(list);
            return new C21887jt(str, dVar, aVar, cVar, list);
        }
        sb.append(" (at path ");
        sb.append(baVar.mo54259r());
        sb.append(')');
        throw new C21426ax(sb.toString());
    }

    /* renamed from: a */
    public void mo54205a(C21437bf bfVar, C21887jt jtVar) throws IOException {
        C24362h.m61211f(bfVar, "writer");
        if (jtVar == null) {
            bfVar.mo54276e();
            return;
        }
        bfVar.mo54273c();
        bfVar.mo54269a(InAppMessageBase.MESSAGE);
        bfVar.mo54272b(jtVar.mo55604a());
        bfVar.mo54269a("severity");
        this.f55292a.mo54205a(bfVar, jtVar.mo55605b());
        bfVar.mo54269a(ServerParameters.DEVICE_KEY);
        this.f55293b.mo54205a(bfVar, jtVar.mo55606c());
        bfVar.mo54269a("os");
        this.f55294c.mo54205a(bfVar, jtVar.mo55607d());
        bfVar.mo54269a("exceptions");
        this.f55295d.mo54205a(bfVar, jtVar.mo55608e());
        bfVar.mo54275d();
    }
}
