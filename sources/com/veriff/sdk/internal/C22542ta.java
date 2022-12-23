package com.veriff.sdk.internal;

import com.appboy.models.InAppMessageBase;
import com.usebutton.sdk.internal.api.AppActionRequest;
import com.veriff.sdk.internal.C21430ba;
import java.io.IOException;
import java.util.Date;
import kotlin.Metadata;
import mf0.C24362h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001a\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u000e¨\u0006\u0018"}, mo59060d2 = {"Lmobi/lab/veriff/data/api/request/payload/KotshiVideoMetadataJsonAdapter;", "Lse/ansman/kotshi/NamedJsonAdapter;", "Lmobi/lab/veriff/data/api/request/payload/VideoMetadata;", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "Lnb0/k;", "writer", "value", "Lbf0/d;", "toJson", "Lcom/squareup/moshi/k;", "Ljava/util/Date;", "dateAdapter", "Lcom/squareup/moshi/k;", "Lcom/squareup/moshi/JsonReader$a;", "options", "Lcom/squareup/moshi/JsonReader$a;", "Lmobi/lab/veriff/data/api/request/payload/VideoContext;", "videoContextAdapter", "Lcom/squareup/moshi/o;", "moshi", "<init>", "(Lcom/squareup/moshi/o;)V", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.ta */
public final class C22542ta extends aed<C22551ti> {

    /* renamed from: a */
    private final C21420av<Date> f56886a;

    /* renamed from: b */
    private final C21420av<C22549tg> f56887b;

    /* renamed from: c */
    private final C21430ba.C21431a f56888c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22542ta(C21450bi biVar) {
        super("KotshiJsonAdapter(VideoMetadata)");
        C24362h.m61211f(biVar, "moshi");
        C21420av<Date> a = biVar.mo54334a(Date.class);
        C24362h.m61210e(a, "moshi.adapter(Date::class.javaObjectType)");
        this.f56886a = a;
        C21420av<C22549tg> a2 = biVar.mo54334a(C22549tg.class);
        C24362h.m61210e(a2, "moshi.adapter(VideoContext::class.javaObjectType)");
        this.f56887b = a2;
        C21430ba.C21431a a3 = C21430ba.C21431a.m51080a("timestamp", InAppMessageBase.DURATION, AppActionRequest.KEY_CONTEXT);
        C24362h.m61210e(a3, "JsonReader.Options.of(\n …ion\",\n      \"context\"\n  )");
        this.f56888c = a3;
    }

    /* renamed from: b */
    public C22551ti mo54204a(C21430ba baVar) throws IOException {
        StringBuilder sb;
        C24362h.m61211f(baVar, "reader");
        if (baVar.mo54249h() == C21430ba.C21432b.NULL) {
            return (C22551ti) baVar.mo54253l();
        }
        long j = 0;
        boolean z = false;
        baVar.mo54246e();
        Date date = null;
        C22549tg tgVar = null;
        while (baVar.mo54248g()) {
            int a = baVar.mo54236a(this.f56888c);
            if (a == -1) {
                baVar.mo54250i();
                baVar.mo54257p();
            } else if (a == 0) {
                date = this.f56886a.mo54204a(baVar);
            } else if (a != 1) {
                if (a == 2) {
                    tgVar = this.f56887b.mo54204a(baVar);
                }
            } else if (baVar.mo54249h() == C21430ba.C21432b.NULL) {
                baVar.mo54257p();
            } else {
                j = baVar.mo54255n();
                z = true;
            }
        }
        baVar.mo54247f();
        if (date == null) {
            sb = aec.m50903a((StringBuilder) null, "timestamp", (String) null, 2, (Object) null);
        } else {
            sb = null;
        }
        if (!z) {
            sb = aec.m50903a(sb, InAppMessageBase.DURATION, (String) null, 2, (Object) null);
        }
        if (tgVar == null) {
            sb = aec.m50903a(sb, AppActionRequest.KEY_CONTEXT, (String) null, 2, (Object) null);
        }
        if (sb == null) {
            C24362h.m61208c(date);
            C24362h.m61208c(tgVar);
            return new C22551ti(date, j, tgVar);
        }
        sb.append(" (at path ");
        sb.append(baVar.mo54259r());
        sb.append(')');
        throw new C21426ax(sb.toString());
    }

    /* renamed from: a */
    public void mo54205a(C21437bf bfVar, C22551ti tiVar) throws IOException {
        C24362h.m61211f(bfVar, "writer");
        if (tiVar == null) {
            bfVar.mo54276e();
            return;
        }
        bfVar.mo54273c();
        bfVar.mo54269a("timestamp");
        this.f56886a.mo54205a(bfVar, tiVar.mo56708a());
        bfVar.mo54269a(InAppMessageBase.DURATION);
        bfVar.mo54266a(tiVar.mo56709b());
        bfVar.mo54269a(AppActionRequest.KEY_CONTEXT);
        this.f56887b.mo54205a(bfVar, tiVar.mo56710c());
        bfVar.mo54275d();
    }
}
