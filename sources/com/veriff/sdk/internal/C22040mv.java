package com.veriff.sdk.internal;

import com.appsflyer.ServerParameters;
import com.veriff.sdk.internal.C21430ba;
import com.veriff.sdk.internal.C22048nc;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf0.C24362h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001a\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0010"}, mo59060d2 = {"Lcom/veriff/sdk/internal/upload/KotshiMediaUploadStatus_FailedJsonAdapter;", "Lse/ansman/kotshi/NamedJsonAdapter;", "Lcom/veriff/sdk/internal/upload/MediaUploadStatus$Failed;", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "Lnb0/k;", "writer", "value", "Lbf0/d;", "toJson", "Lcom/squareup/moshi/JsonReader$a;", "options", "Lcom/squareup/moshi/JsonReader$a;", "<init>", "()V", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.mv */
public final class C22040mv extends aed<C22048nc.C22051c> {

    /* renamed from: a */
    private final C21430ba.C21431a f55598a;

    public C22040mv() {
        super("KotshiJsonAdapter(MediaUploadStatus.Failed)");
        C21430ba.C21431a a = C21430ba.C21431a.m51080a("canRetry", ServerParameters.STATUS);
        C24362h.m61210e(a, "JsonReader.Options.of(\n …etry\",\n      \"status\"\n  )");
        this.f55598a = a;
    }

    /* renamed from: b */
    public C22048nc.C22051c mo54204a(C21430ba baVar) throws IOException {
        StringBuilder sb;
        C24362h.m61211f(baVar, "reader");
        if (baVar.mo54249h() == C21430ba.C21432b.NULL) {
            return (C22048nc.C22051c) baVar.mo54253l();
        }
        baVar.mo54246e();
        String str = null;
        boolean z = false;
        boolean z2 = false;
        while (baVar.mo54248g()) {
            int a = baVar.mo54236a(this.f55598a);
            if (a == -1) {
                baVar.mo54250i();
                baVar.mo54257p();
            } else if (a != 0) {
                if (a == 1) {
                    if (baVar.mo54249h() == C21430ba.C21432b.NULL) {
                        baVar.mo54257p();
                    } else {
                        str = baVar.mo54251j();
                    }
                }
            } else if (baVar.mo54249h() == C21430ba.C21432b.NULL) {
                baVar.mo54257p();
            } else {
                z2 = baVar.mo54252k();
                z = true;
            }
        }
        baVar.mo54247f();
        if (!z) {
            sb = aec.m50903a((StringBuilder) null, "canRetry", (String) null, 2, (Object) null);
        } else {
            sb = null;
        }
        if (sb == null) {
            C22048nc.C22051c cVar = new C22048nc.C22051c(z2, (String) null, 2, (DefaultConstructorMarker) null);
            if (str == null) {
                str = cVar.mo55910b();
            }
            return C22048nc.C22051c.m53775a(cVar, false, str, 1, (Object) null);
        }
        sb.append(" (at path ");
        sb.append(baVar.mo54259r());
        sb.append(')');
        throw new C21426ax(sb.toString());
    }

    /* renamed from: a */
    public void mo54205a(C21437bf bfVar, C22048nc.C22051c cVar) throws IOException {
        C24362h.m61211f(bfVar, "writer");
        if (cVar == null) {
            bfVar.mo54276e();
            return;
        }
        bfVar.mo54273c();
        bfVar.mo54269a("canRetry");
        bfVar.mo54270a(cVar.mo55909a());
        bfVar.mo54269a(ServerParameters.STATUS);
        bfVar.mo54272b(cVar.mo55910b());
        bfVar.mo54275d();
    }
}
