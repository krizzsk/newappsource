package com.veriff.sdk.internal;

import com.veriff.sdk.internal.C21430ba;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf0.C24362h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001a\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0016"}, mo59060d2 = {"Lcom/veriff/sdk/internal/data/KotshiVideoConfigJsonAdapter;", "Lse/ansman/kotshi/NamedJsonAdapter;", "Lcom/veriff/sdk/internal/data/VideoConfig;", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "Lnb0/k;", "writer", "value", "Lbf0/d;", "toJson", "Lcom/squareup/moshi/JsonReader$a;", "options", "Lcom/squareup/moshi/JsonReader$a;", "Lcom/squareup/moshi/k;", "Lcom/veriff/sdk/internal/data/Resolution;", "resolutionAdapter", "Lcom/squareup/moshi/k;", "Lcom/squareup/moshi/o;", "moshi", "<init>", "(Lcom/squareup/moshi/o;)V", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.jo */
public final class C21881jo extends aed<C21903ka> {

    /* renamed from: a */
    private final C21420av<C21886js> f55304a;

    /* renamed from: b */
    private final C21430ba.C21431a f55305b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21881jo(C21450bi biVar) {
        super("KotshiJsonAdapter(VideoConfig)");
        C24362h.m61211f(biVar, "moshi");
        C21420av<C21886js> a = biVar.mo54334a(C21886js.class);
        C24362h.m61210e(a, "moshi.adapter(Resolution::class.javaObjectType)");
        this.f55304a = a;
        C21430ba.C21431a a2 = C21430ba.C21431a.m51080a("resolution", "frame_rate", "bit_rate", "video_iframe_interval", "max_file_size");
        C24362h.m61210e(a2, "JsonReader.Options.of(\n …      \"max_file_size\"\n  )");
        this.f55305b = a2;
    }

    /* renamed from: b */
    public C21903ka mo54204a(C21430ba baVar) throws IOException {
        C21430ba baVar2 = baVar;
        C24362h.m61211f(baVar2, "reader");
        if (baVar.mo54249h() == C21430ba.C21432b.NULL) {
            return (C21903ka) baVar.mo54253l();
        }
        C21886js jsVar = null;
        long j = 0;
        baVar.mo54246e();
        boolean z = false;
        int i = 0;
        boolean z2 = false;
        int i2 = 0;
        boolean z3 = false;
        int i3 = 0;
        boolean z4 = false;
        while (baVar.mo54248g()) {
            int a = baVar2.mo54236a(this.f55305b);
            if (a == -1) {
                baVar.mo54250i();
                baVar.mo54257p();
            } else if (a == 0) {
                jsVar = this.f55304a.mo54204a(baVar2);
            } else if (a != 1) {
                if (a != 2) {
                    if (a != 3) {
                        if (a == 4) {
                            if (baVar.mo54249h() == C21430ba.C21432b.NULL) {
                                baVar.mo54257p();
                            } else {
                                j = baVar.mo54255n();
                                z4 = true;
                            }
                        }
                    } else if (baVar.mo54249h() == C21430ba.C21432b.NULL) {
                        baVar.mo54257p();
                    } else {
                        i3 = baVar.mo54256o();
                        z3 = true;
                    }
                } else if (baVar.mo54249h() == C21430ba.C21432b.NULL) {
                    baVar.mo54257p();
                } else {
                    i2 = baVar.mo54256o();
                    z2 = true;
                }
            } else if (baVar.mo54249h() == C21430ba.C21432b.NULL) {
                baVar.mo54257p();
            } else {
                i = baVar.mo54256o();
                z = true;
            }
        }
        baVar.mo54247f();
        C21903ka kaVar = new C21903ka((C21886js) null, 0, 0, 0, 0, 31, (DefaultConstructorMarker) null);
        if (jsVar == null) {
            jsVar = kaVar.mo55674a();
        }
        C21886js jsVar2 = jsVar;
        if (!z) {
            i = kaVar.mo55676b();
        }
        int i4 = i;
        if (!z2) {
            i2 = kaVar.mo55677c();
        }
        int i5 = i2;
        if (!z3) {
            i3 = kaVar.mo55678d();
        }
        int i6 = i3;
        if (!z4) {
            j = kaVar.mo55680e();
        }
        return kaVar.mo55675a(jsVar2, i4, i5, i6, j);
    }

    /* renamed from: a */
    public void mo54205a(C21437bf bfVar, C21903ka kaVar) throws IOException {
        C24362h.m61211f(bfVar, "writer");
        if (kaVar == null) {
            bfVar.mo54276e();
            return;
        }
        bfVar.mo54273c();
        bfVar.mo54269a("resolution");
        this.f55304a.mo54205a(bfVar, kaVar.mo55674a());
        bfVar.mo54269a("frame_rate");
        bfVar.mo54268a((Number) Integer.valueOf(kaVar.mo55676b()));
        bfVar.mo54269a("bit_rate");
        bfVar.mo54268a((Number) Integer.valueOf(kaVar.mo55677c()));
        bfVar.mo54269a("video_iframe_interval");
        bfVar.mo54268a((Number) Integer.valueOf(kaVar.mo55678d()));
        bfVar.mo54269a("max_file_size");
        bfVar.mo54266a(kaVar.mo55680e());
        bfVar.mo54275d();
    }
}
