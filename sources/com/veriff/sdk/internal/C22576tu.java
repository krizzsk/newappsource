package com.veriff.sdk.internal;

import com.usebutton.sdk.internal.models.Browser;
import com.veriff.sdk.internal.C21430ba;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf0.C24362h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001a\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0010"}, mo59060d2 = {"Lmobi/lab/veriff/data/api/request/response/KotshiConfigurationResponseJsonAdapter;", "Lse/ansman/kotshi/NamedJsonAdapter;", "Lmobi/lab/veriff/data/api/request/response/ConfigurationResponse;", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "Lnb0/k;", "writer", "value", "Lbf0/d;", "toJson", "Lcom/squareup/moshi/JsonReader$a;", "options", "Lcom/squareup/moshi/JsonReader$a;", "<init>", "()V", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.tu */
public final class C22576tu extends aed<C22553tk> {

    /* renamed from: a */
    private final C21430ba.C21431a f56957a;

    public C22576tu() {
        super("KotshiJsonAdapter(ConfigurationResponse)");
        C21430ba.C21431a a = C21430ba.C21431a.m51080a(Browser.TARGET_BROWSER, "isMobileDevice", "geoIpCountry", "geoIpState", "geoIpCity");
        C24362h.m61210e(a, "JsonReader.Options.of(\n …e\",\n      \"geoIpCity\"\n  )");
        this.f56957a = a;
    }

    /* renamed from: b */
    public C22553tk mo54204a(C21430ba baVar) throws IOException {
        C21430ba baVar2 = baVar;
        C24362h.m61211f(baVar2, "reader");
        if (baVar.mo54249h() == C21430ba.C21432b.NULL) {
            return (C22553tk) baVar.mo54253l();
        }
        baVar.mo54246e();
        boolean z = false;
        String str = null;
        Boolean bool = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        while (baVar.mo54248g()) {
            int a = baVar2.mo54236a(this.f56957a);
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
                    bool = Boolean.valueOf(baVar.mo54252k());
                }
                z2 = true;
            } else if (a == 2) {
                if (baVar.mo54249h() == C21430ba.C21432b.NULL) {
                    baVar.mo54257p();
                } else {
                    str2 = baVar.mo54251j();
                }
                z3 = true;
            } else if (a == 3) {
                if (baVar.mo54249h() == C21430ba.C21432b.NULL) {
                    baVar.mo54257p();
                } else {
                    str3 = baVar.mo54251j();
                }
                z4 = true;
            } else if (a == 4) {
                if (baVar.mo54249h() == C21430ba.C21432b.NULL) {
                    baVar.mo54257p();
                } else {
                    str4 = baVar.mo54251j();
                }
                z5 = true;
            }
        }
        baVar.mo54247f();
        C22553tk tkVar = new C22553tk((String) null, (Boolean) null, (String) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null);
        if (!z) {
            str = tkVar.mo56719a();
        }
        String str5 = str;
        if (!z2) {
            bool = tkVar.mo56720b();
        }
        Boolean bool2 = bool;
        if (!z3) {
            str2 = tkVar.mo56721c();
        }
        String str6 = str2;
        if (!z4) {
            str3 = tkVar.mo56722d();
        }
        String str7 = str3;
        if (!z5) {
            str4 = tkVar.mo56723e();
        }
        return tkVar.mo56718a(str5, bool2, str6, str7, str4);
    }

    /* renamed from: a */
    public void mo54205a(C21437bf bfVar, C22553tk tkVar) throws IOException {
        C24362h.m61211f(bfVar, "writer");
        if (tkVar == null) {
            bfVar.mo54276e();
            return;
        }
        bfVar.mo54273c();
        bfVar.mo54269a(Browser.TARGET_BROWSER);
        bfVar.mo54272b(tkVar.mo56719a());
        bfVar.mo54269a("isMobileDevice");
        bfVar.mo54267a(tkVar.mo56720b());
        bfVar.mo54269a("geoIpCountry");
        bfVar.mo54272b(tkVar.mo56721c());
        bfVar.mo54269a("geoIpState");
        bfVar.mo54272b(tkVar.mo56722d());
        bfVar.mo54269a("geoIpCity");
        bfVar.mo54272b(tkVar.mo56723e());
        bfVar.mo54275d();
    }
}
