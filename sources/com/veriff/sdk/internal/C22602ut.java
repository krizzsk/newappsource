package com.veriff.sdk.internal;

import com.veriff.sdk.internal.C21430ba;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf0.C24362h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001a\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0016"}, mo59060d2 = {"Lmobi/lab/veriff/data/api/request/response/KotshiVendorIntegrationJsonAdapter;", "Lse/ansman/kotshi/NamedJsonAdapter;", "Lmobi/lab/veriff/data/api/request/response/VendorIntegration;", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "Lnb0/k;", "writer", "value", "Lbf0/d;", "toJson", "Lcom/squareup/moshi/k;", "Lcom/veriff/sdk/internal/data/FeatureFlags;", "featureFlagsAdapter", "Lcom/squareup/moshi/k;", "Lcom/squareup/moshi/JsonReader$a;", "options", "Lcom/squareup/moshi/JsonReader$a;", "Lcom/squareup/moshi/o;", "moshi", "<init>", "(Lcom/squareup/moshi/o;)V", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.ut */
public final class C22602ut extends aed<C22616ve> {

    /* renamed from: a */
    private final C21420av<C21789ix> f57007a;

    /* renamed from: b */
    private final C21430ba.C21431a f57008b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22602ut(C21450bi biVar) {
        super("KotshiJsonAdapter(VendorIntegration)");
        C24362h.m61211f(biVar, "moshi");
        C21420av<C21789ix> a = biVar.mo54334a(C21789ix.class);
        C24362h.m61210e(a, "moshi.adapter(FeatureFlags::class.javaObjectType)");
        this.f57007a = a;
        C21430ba.C21431a a2 = C21430ba.C21431a.m51080a("id", "name", "publicName", WidgetMessageParser.KEY_CALLBACK, "flowLayout", "featureFlags");
        C24362h.m61210e(a2, "JsonReader.Options.of(\n …\n      \"featureFlags\"\n  )");
        this.f57008b = a2;
    }

    /* renamed from: b */
    public C22616ve mo54204a(C21430ba baVar) throws IOException {
        C21430ba baVar2 = baVar;
        C24362h.m61211f(baVar2, "reader");
        if (baVar.mo54249h() == C21430ba.C21432b.NULL) {
            return (C22616ve) baVar.mo54253l();
        }
        baVar.mo54246e();
        boolean z = false;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        C21789ix ixVar = null;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        while (baVar.mo54248g()) {
            switch (baVar2.mo54236a(this.f57008b)) {
                case -1:
                    baVar.mo54250i();
                    baVar.mo54257p();
                    break;
                case 0:
                    if (baVar.mo54249h() == C21430ba.C21432b.NULL) {
                        baVar.mo54257p();
                    } else {
                        str = baVar.mo54251j();
                    }
                    z = true;
                    break;
                case 1:
                    if (baVar.mo54249h() == C21430ba.C21432b.NULL) {
                        baVar.mo54257p();
                    } else {
                        str2 = baVar.mo54251j();
                    }
                    z2 = true;
                    break;
                case 2:
                    if (baVar.mo54249h() == C21430ba.C21432b.NULL) {
                        baVar.mo54257p();
                    } else {
                        str3 = baVar.mo54251j();
                    }
                    z3 = true;
                    break;
                case 3:
                    if (baVar.mo54249h() == C21430ba.C21432b.NULL) {
                        baVar.mo54257p();
                    } else {
                        str4 = baVar.mo54251j();
                    }
                    z4 = true;
                    break;
                case 4:
                    if (baVar.mo54249h() == C21430ba.C21432b.NULL) {
                        baVar.mo54257p();
                    } else {
                        str5 = baVar.mo54251j();
                    }
                    z5 = true;
                    break;
                case 5:
                    ixVar = this.f57007a.mo54204a(baVar2);
                    z6 = true;
                    break;
            }
        }
        baVar.mo54247f();
        C22616ve veVar = new C22616ve((String) null, (String) null, (String) null, (String) null, (String) null, (C21789ix) null, 63, (DefaultConstructorMarker) null);
        if (!z) {
            str = veVar.mo56935a();
        }
        String str6 = str;
        if (!z2) {
            str2 = veVar.mo56936b();
        }
        String str7 = str2;
        if (!z3) {
            str3 = veVar.mo56937c();
        }
        String str8 = str3;
        if (!z4) {
            str4 = veVar.mo56938d();
        }
        String str9 = str4;
        if (!z5) {
            str5 = veVar.mo56939e();
        }
        String str10 = str5;
        if (!z6) {
            ixVar = veVar.mo56941f();
        }
        return veVar.mo56934a(str6, str7, str8, str9, str10, ixVar);
    }

    /* renamed from: a */
    public void mo54205a(C21437bf bfVar, C22616ve veVar) throws IOException {
        C24362h.m61211f(bfVar, "writer");
        if (veVar == null) {
            bfVar.mo54276e();
            return;
        }
        bfVar.mo54273c();
        bfVar.mo54269a("id");
        bfVar.mo54272b(veVar.mo56935a());
        bfVar.mo54269a("name");
        bfVar.mo54272b(veVar.mo56936b());
        bfVar.mo54269a("publicName");
        bfVar.mo54272b(veVar.mo56937c());
        bfVar.mo54269a(WidgetMessageParser.KEY_CALLBACK);
        bfVar.mo54272b(veVar.mo56938d());
        bfVar.mo54269a("flowLayout");
        bfVar.mo54272b(veVar.mo56939e());
        bfVar.mo54269a("featureFlags");
        this.f57007a.mo54205a(bfVar, veVar.mo56941f());
        bfVar.mo54275d();
    }
}
