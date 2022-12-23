package com.veriff.sdk.internal;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.veriff.sdk.internal.C21430ba;
import com.veriff.sdk.internal.C21667gf;
import java.io.IOException;
import kotlin.Metadata;
import mf0.C24362h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001a\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0016"}, mo59060d2 = {"Lcom/veriff/sdk/internal/analytics/KotshiEventJsonAdapter;", "Lse/ansman/kotshi/NamedJsonAdapter;", "Lcom/veriff/sdk/internal/analytics/Event;", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "Lnb0/k;", "writer", "value", "Lbf0/d;", "toJson", "Lcom/squareup/moshi/k;", "Lcom/veriff/sdk/internal/analytics/Event$Additional;", "eventAdditionalAdapter", "Lcom/squareup/moshi/k;", "Lcom/squareup/moshi/JsonReader$a;", "options", "Lcom/squareup/moshi/JsonReader$a;", "Lcom/squareup/moshi/o;", "moshi", "<init>", "(Lcom/squareup/moshi/o;)V", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.go */
public final class C21725go extends aed<C21667gf> {

    /* renamed from: a */
    private final C21420av<C21667gf.C21668a> f54973a;

    /* renamed from: b */
    private final C21430ba.C21431a f54974b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21725go(C21450bi biVar) {
        super("KotshiJsonAdapter(Event)");
        C24362h.m61211f(biVar, "moshi");
        C21420av<C21667gf.C21668a> a = biVar.mo54334a(C21667gf.C21668a.class);
        C24362h.m61210e(a, "moshi.adapter(Event.Addi…al::class.javaObjectType)");
        this.f54973a = a;
        C21430ba.C21431a a2 = C21430ba.C21431a.m51080a("app", AppMeasurementSdk.ConditionalUserProperty.ORIGIN, "name", "feature", "additional_data", "type", "timestamp");
        C24362h.m61210e(a2, "JsonReader.Options.of(\n …e\",\n      \"timestamp\"\n  )");
        this.f54974b = a2;
    }

    /* renamed from: b */
    public C21667gf mo54204a(C21430ba baVar) throws IOException {
        StringBuilder sb;
        C24362h.m61211f(baVar, "reader");
        if (baVar.mo54249h() == C21430ba.C21432b.NULL) {
            return (C21667gf) baVar.mo54253l();
        }
        boolean z = false;
        baVar.mo54246e();
        long j = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        C21667gf.C21668a aVar = null;
        String str5 = null;
        while (baVar.mo54248g()) {
            switch (baVar.mo54236a(this.f54974b)) {
                case -1:
                    baVar.mo54250i();
                    baVar.mo54257p();
                    break;
                case 0:
                    if (baVar.mo54249h() != C21430ba.C21432b.NULL) {
                        str = baVar.mo54251j();
                        break;
                    } else {
                        baVar.mo54257p();
                        break;
                    }
                case 1:
                    if (baVar.mo54249h() != C21430ba.C21432b.NULL) {
                        str2 = baVar.mo54251j();
                        break;
                    } else {
                        baVar.mo54257p();
                        break;
                    }
                case 2:
                    if (baVar.mo54249h() != C21430ba.C21432b.NULL) {
                        str3 = baVar.mo54251j();
                        break;
                    } else {
                        baVar.mo54257p();
                        break;
                    }
                case 3:
                    if (baVar.mo54249h() != C21430ba.C21432b.NULL) {
                        str4 = baVar.mo54251j();
                        break;
                    } else {
                        baVar.mo54257p();
                        break;
                    }
                case 4:
                    aVar = this.f54973a.mo54204a(baVar);
                    break;
                case 5:
                    if (baVar.mo54249h() != C21430ba.C21432b.NULL) {
                        str5 = baVar.mo54251j();
                        break;
                    } else {
                        baVar.mo54257p();
                        break;
                    }
                case 6:
                    if (baVar.mo54249h() != C21430ba.C21432b.NULL) {
                        z = true;
                        j = baVar.mo54255n();
                        break;
                    } else {
                        baVar.mo54257p();
                        break;
                    }
            }
        }
        baVar.mo54247f();
        if (str == null) {
            sb = aec.m50903a((StringBuilder) null, "app", (String) null, 2, (Object) null);
        } else {
            sb = null;
        }
        if (str2 == null) {
            sb = aec.m50903a(sb, AppMeasurementSdk.ConditionalUserProperty.ORIGIN, (String) null, 2, (Object) null);
        }
        if (str3 == null) {
            sb = aec.m50903a(sb, "name", (String) null, 2, (Object) null);
        }
        if (!z) {
            sb = aec.m50903a(sb, "timestamp", (String) null, 2, (Object) null);
        }
        if (sb == null) {
            C24362h.m61208c(str);
            C24362h.m61208c(str2);
            C24362h.m61208c(str3);
            return new C21667gf(str, str2, str3, str4, aVar, str5, j);
        }
        sb.append(" (at path ");
        sb.append(baVar.mo54259r());
        sb.append(')');
        throw new C21426ax(sb.toString());
    }

    /* renamed from: a */
    public void mo54205a(C21437bf bfVar, C21667gf gfVar) throws IOException {
        C24362h.m61211f(bfVar, "writer");
        if (gfVar == null) {
            bfVar.mo54276e();
            return;
        }
        bfVar.mo54273c();
        bfVar.mo54269a("app");
        bfVar.mo54272b(gfVar.mo54968a());
        bfVar.mo54269a(AppMeasurementSdk.ConditionalUserProperty.ORIGIN);
        bfVar.mo54272b(gfVar.mo54969b());
        bfVar.mo54269a("name");
        bfVar.mo54272b(gfVar.mo54970c());
        bfVar.mo54269a("feature");
        bfVar.mo54272b(gfVar.mo54971d());
        bfVar.mo54269a("additional_data");
        this.f54973a.mo54205a(bfVar, gfVar.mo54972e());
        bfVar.mo54269a("type");
        bfVar.mo54272b(gfVar.mo54974f());
        bfVar.mo54269a("timestamp");
        bfVar.mo54266a(gfVar.mo54975g());
        bfVar.mo54275d();
    }
}
