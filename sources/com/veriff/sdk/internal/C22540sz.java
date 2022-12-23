package com.veriff.sdk.internal;

import com.veriff.sdk.internal.C21430ba;
import java.io.IOException;
import kotlin.Metadata;
import mf0.C24362h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001a\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0016"}, mo59060d2 = {"Lmobi/lab/veriff/data/api/request/payload/KotshiVideoDataJsonAdapter;", "Lse/ansman/kotshi/NamedJsonAdapter;", "Lmobi/lab/veriff/data/api/request/payload/VideoData;", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "Lnb0/k;", "writer", "value", "Lbf0/d;", "toJson", "Lcom/squareup/moshi/JsonReader$a;", "options", "Lcom/squareup/moshi/JsonReader$a;", "Lcom/squareup/moshi/k;", "Lmobi/lab/veriff/data/api/request/payload/VideoMetadata;", "videoMetadataAdapter", "Lcom/squareup/moshi/k;", "Lcom/squareup/moshi/o;", "moshi", "<init>", "(Lcom/squareup/moshi/o;)V", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.sz */
public final class C22540sz extends aed<C22550th> {

    /* renamed from: a */
    private final C21420av<C22551ti> f56852a;

    /* renamed from: b */
    private final C21430ba.C21431a f56853b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22540sz(C21450bi biVar) {
        super("KotshiJsonAdapter(VideoData)");
        C24362h.m61211f(biVar, "moshi");
        C21420av<C22551ti> a = biVar.mo54334a(C22551ti.class);
        C24362h.m61210e(a, "moshi.adapter(VideoMetadata::class.javaObjectType)");
        this.f56852a = a;
        C21430ba.C21431a a2 = C21430ba.C21431a.m51080a("metadata");
        C24362h.m61210e(a2, "JsonReader.Options.of(\"metadata\")");
        this.f56853b = a2;
    }

    /* renamed from: b */
    public C22550th mo54204a(C21430ba baVar) throws IOException {
        C24362h.m61211f(baVar, "reader");
        if (baVar.mo54249h() == C21430ba.C21432b.NULL) {
            return (C22550th) baVar.mo54253l();
        }
        baVar.mo54246e();
        StringBuilder sb = null;
        C22551ti tiVar = null;
        while (baVar.mo54248g()) {
            int a = baVar.mo54236a(this.f56853b);
            if (a == -1) {
                baVar.mo54250i();
                baVar.mo54257p();
            } else if (a == 0) {
                tiVar = this.f56852a.mo54204a(baVar);
            }
        }
        baVar.mo54247f();
        if (tiVar == null) {
            sb = aec.m50903a((StringBuilder) null, "metadata", (String) null, 2, (Object) null);
        }
        if (sb == null) {
            C24362h.m61208c(tiVar);
            return new C22550th(tiVar);
        }
        sb.append(" (at path ");
        sb.append(baVar.mo54259r());
        sb.append(')');
        throw new C21426ax(sb.toString());
    }

    /* renamed from: a */
    public void mo54205a(C21437bf bfVar, C22550th thVar) throws IOException {
        C24362h.m61211f(bfVar, "writer");
        if (thVar == null) {
            bfVar.mo54276e();
            return;
        }
        bfVar.mo54273c();
        bfVar.mo54269a("kind").mo54272b("videos");
        bfVar.mo54269a("metadata");
        this.f56852a.mo54205a(bfVar, thVar.mo56689c());
        bfVar.mo54275d();
    }
}
