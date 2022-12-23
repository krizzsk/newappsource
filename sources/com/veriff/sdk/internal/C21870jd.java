package com.veriff.sdk.internal;

import com.veriff.sdk.internal.C21430ba;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf0.C24362h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001a\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0010"}, mo59060d2 = {"Lcom/veriff/sdk/internal/data/KotshiAudioConfigJsonAdapter;", "Lse/ansman/kotshi/NamedJsonAdapter;", "Lcom/veriff/sdk/internal/data/AudioConfig;", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "Lnb0/k;", "writer", "value", "Lbf0/d;", "toJson", "Lcom/squareup/moshi/JsonReader$a;", "options", "Lcom/squareup/moshi/JsonReader$a;", "<init>", "()V", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.jd */
public final class C21870jd extends aed<C21787iw> {

    /* renamed from: a */
    private final C21430ba.C21431a f55284a;

    public C21870jd() {
        super("KotshiJsonAdapter(AudioConfig)");
        C21430ba.C21431a a = C21430ba.C21431a.m51080a("audio_channels", "min_sample_rate", "bit_rate");
        C24362h.m61210e(a, "JsonReader.Options.of(\n …te\",\n      \"bit_rate\"\n  )");
        this.f55284a = a;
    }

    /* renamed from: b */
    public C21787iw mo54204a(C21430ba baVar) throws IOException {
        C24362h.m61211f(baVar, "reader");
        if (baVar.mo54249h() == C21430ba.C21432b.NULL) {
            return (C21787iw) baVar.mo54253l();
        }
        baVar.mo54246e();
        boolean z = false;
        int i = 0;
        boolean z2 = false;
        int i2 = 0;
        boolean z3 = false;
        int i3 = 0;
        while (baVar.mo54248g()) {
            int a = baVar.mo54236a(this.f55284a);
            if (a == -1) {
                baVar.mo54250i();
                baVar.mo54257p();
            } else if (a != 0) {
                if (a != 1) {
                    if (a == 2) {
                        if (baVar.mo54249h() == C21430ba.C21432b.NULL) {
                            baVar.mo54257p();
                        } else {
                            i3 = baVar.mo54256o();
                            z3 = true;
                        }
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
        C21787iw iwVar = new C21787iw(0, 0, 0, 7, (DefaultConstructorMarker) null);
        if (!z) {
            i = iwVar.mo55411a();
        }
        if (!z2) {
            i2 = iwVar.mo55413b();
        }
        if (!z3) {
            i3 = iwVar.mo55414c();
        }
        return iwVar.mo55412a(i, i2, i3);
    }

    /* renamed from: a */
    public void mo54205a(C21437bf bfVar, C21787iw iwVar) throws IOException {
        C24362h.m61211f(bfVar, "writer");
        if (iwVar == null) {
            bfVar.mo54276e();
            return;
        }
        bfVar.mo54273c();
        bfVar.mo54269a("audio_channels");
        bfVar.mo54268a((Number) Integer.valueOf(iwVar.mo55411a()));
        bfVar.mo54269a("min_sample_rate");
        bfVar.mo54268a((Number) Integer.valueOf(iwVar.mo55413b()));
        bfVar.mo54269a("bit_rate");
        bfVar.mo54268a((Number) Integer.valueOf(iwVar.mo55414c()));
        bfVar.mo54275d();
    }
}
