package com.veriff.sdk.internal;

import com.appsflyer.ServerParameters;
import com.veriff.sdk.internal.C21430ba;
import com.veriff.sdk.internal.C22048nc;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf0.C24362h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001a\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0010"}, mo59060d2 = {"Lcom/veriff/sdk/internal/upload/KotshiMediaUploadStatus_UploadingJsonAdapter;", "Lse/ansman/kotshi/NamedJsonAdapter;", "Lcom/veriff/sdk/internal/upload/MediaUploadStatus$Uploading;", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "Lnb0/k;", "writer", "value", "Lbf0/d;", "toJson", "Lcom/squareup/moshi/JsonReader$a;", "options", "Lcom/squareup/moshi/JsonReader$a;", "<init>", "()V", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.mx */
public final class C22042mx extends aed<C22048nc.C22053e> {

    /* renamed from: a */
    private final C21430ba.C21431a f55600a;

    public C22042mx() {
        super("KotshiJsonAdapter(MediaUploadStatus.Uploading)");
        C21430ba.C21431a a = C21430ba.C21431a.m51080a(ServerParameters.STATUS);
        C24362h.m61210e(a, "JsonReader.Options.of(\"status\")");
        this.f55600a = a;
    }

    /* renamed from: b */
    public C22048nc.C22053e mo54204a(C21430ba baVar) throws IOException {
        C24362h.m61211f(baVar, "reader");
        if (baVar.mo54249h() == C21430ba.C21432b.NULL) {
            return (C22048nc.C22053e) baVar.mo54253l();
        }
        baVar.mo54246e();
        String str = null;
        while (baVar.mo54248g()) {
            int a = baVar.mo54236a(this.f55600a);
            if (a == -1) {
                baVar.mo54250i();
                baVar.mo54257p();
            } else if (a == 0) {
                if (baVar.mo54249h() == C21430ba.C21432b.NULL) {
                    baVar.mo54257p();
                } else {
                    str = baVar.mo54251j();
                }
            }
        }
        baVar.mo54247f();
        C22048nc.C22053e eVar = new C22048nc.C22053e((String) null, 1, (DefaultConstructorMarker) null);
        if (str == null) {
            str = eVar.mo55920a();
        }
        return eVar.mo55919a(str);
    }

    /* renamed from: a */
    public void mo54205a(C21437bf bfVar, C22048nc.C22053e eVar) throws IOException {
        C24362h.m61211f(bfVar, "writer");
        if (eVar == null) {
            bfVar.mo54276e();
            return;
        }
        bfVar.mo54273c();
        bfVar.mo54269a(ServerParameters.STATUS);
        bfVar.mo54272b(eVar.mo55920a());
        bfVar.mo54275d();
    }
}
