package com.veriff.sdk.internal;

import com.veriff.sdk.internal.C21430ba;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf0.C24362h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001a\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0016"}, mo59060d2 = {"Lmobi/lab/veriff/data/api/request/response/KotshiInitDataJsonAdapter;", "Lse/ansman/kotshi/NamedJsonAdapter;", "Lmobi/lab/veriff/data/api/request/response/InitData;", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "Lnb0/k;", "writer", "value", "Lbf0/d;", "toJson", "Lcom/squareup/moshi/k;", "Lmobi/lab/veriff/data/api/request/response/Document;", "documentAdapter", "Lcom/squareup/moshi/k;", "Lcom/squareup/moshi/JsonReader$a;", "options", "Lcom/squareup/moshi/JsonReader$a;", "Lcom/squareup/moshi/o;", "moshi", "<init>", "(Lcom/squareup/moshi/o;)V", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.un */
public final class C22596un extends aed<C22574ts> {

    /* renamed from: a */
    private final C21420av<C22556tm> f56993a;

    /* renamed from: b */
    private final C21430ba.C21431a f56994b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22596un(C21450bi biVar) {
        super("KotshiJsonAdapter(InitData)");
        C24362h.m61211f(biVar, "moshi");
        C21420av<C22556tm> a = biVar.mo54334a(C22556tm.class);
        C24362h.m61210e(a, "moshi.adapter(Document::class.javaObjectType)");
        this.f56993a = a;
        C21430ba.C21431a a2 = C21430ba.C21431a.m51080a("language", WidgetMessageParser.KEY_CALLBACK, "preselectedDocument");
        C24362h.m61210e(a2, "JsonReader.Options.of(\n …\"preselectedDocument\"\n  )");
        this.f56994b = a2;
    }

    /* renamed from: b */
    public C22574ts mo54204a(C21430ba baVar) throws IOException {
        C24362h.m61211f(baVar, "reader");
        if (baVar.mo54249h() == C21430ba.C21432b.NULL) {
            return (C22574ts) baVar.mo54253l();
        }
        baVar.mo54246e();
        boolean z = false;
        String str = null;
        String str2 = null;
        C22556tm tmVar = null;
        boolean z2 = false;
        boolean z3 = false;
        while (baVar.mo54248g()) {
            int a = baVar.mo54236a(this.f56994b);
            if (a == -1) {
                baVar.mo54250i();
                baVar.mo54257p();
            } else if (a == 0) {
                if (baVar.mo54249h() == C21430ba.C21432b.NULL) {
                    baVar.mo54257p();
                } else {
                    str = baVar.mo54251j();
                }
                z = true;
            } else if (a == 1) {
                if (baVar.mo54249h() == C21430ba.C21432b.NULL) {
                    baVar.mo54257p();
                } else {
                    str2 = baVar.mo54251j();
                }
                z2 = true;
            } else if (a == 2) {
                tmVar = this.f56993a.mo54204a(baVar);
                z3 = true;
            }
        }
        baVar.mo54247f();
        C22574ts tsVar = new C22574ts((String) null, (String) null, (C22556tm) null, 7, (DefaultConstructorMarker) null);
        if (!z) {
            str = tsVar.mo56820a();
        }
        if (!z2) {
            str2 = tsVar.mo56821b();
        }
        if (!z3) {
            tmVar = tsVar.mo56822c();
        }
        return tsVar.mo56819a(str, str2, tmVar);
    }

    /* renamed from: a */
    public void mo54205a(C21437bf bfVar, C22574ts tsVar) throws IOException {
        C24362h.m61211f(bfVar, "writer");
        if (tsVar == null) {
            bfVar.mo54276e();
            return;
        }
        bfVar.mo54273c();
        bfVar.mo54269a("language");
        bfVar.mo54272b(tsVar.mo56820a());
        bfVar.mo54269a(WidgetMessageParser.KEY_CALLBACK);
        bfVar.mo54272b(tsVar.mo56821b());
        bfVar.mo54269a("preselectedDocument");
        this.f56993a.mo54205a(bfVar, tsVar.mo56822c());
        bfVar.mo54275d();
    }
}
