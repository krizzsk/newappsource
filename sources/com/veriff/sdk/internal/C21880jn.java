package com.veriff.sdk.internal;

import com.veriff.sdk.internal.C21430ba;
import com.veriff.sdk.internal.C21887jt;
import java.io.IOException;
import kotlin.Metadata;
import mf0.C24362h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001a\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0010"}, mo59060d2 = {"Lcom/veriff/sdk/internal/data/KotshiSentryReport_StackFrameJsonAdapter;", "Lse/ansman/kotshi/NamedJsonAdapter;", "Lcom/veriff/sdk/internal/data/SentryReport$StackFrame;", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "Lnb0/k;", "writer", "value", "Lbf0/d;", "toJson", "Lcom/squareup/moshi/JsonReader$a;", "options", "Lcom/squareup/moshi/JsonReader$a;", "<init>", "()V", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.jn */
public final class C21880jn extends aed<C21887jt.C21892e> {

    /* renamed from: a */
    private final C21430ba.C21431a f55303a;

    public C21880jn() {
        super("KotshiJsonAdapter(SentryReport.StackFrame)");
        C21430ba.C21431a a = C21430ba.C21431a.m51080a("function", "module", "filename", "line");
        C24362h.m61210e(a, "JsonReader.Options.of(\n …lename\",\n      \"line\"\n  )");
        this.f55303a = a;
    }

    /* renamed from: b */
    public C21887jt.C21892e mo54204a(C21430ba baVar) throws IOException {
        StringBuilder sb;
        C24362h.m61211f(baVar, "reader");
        if (baVar.mo54249h() == C21430ba.C21432b.NULL) {
            return (C21887jt.C21892e) baVar.mo54253l();
        }
        baVar.mo54246e();
        boolean z = false;
        String str = null;
        String str2 = null;
        String str3 = null;
        int i = 0;
        while (baVar.mo54248g()) {
            int a = baVar.mo54236a(this.f55303a);
            if (a == -1) {
                baVar.mo54250i();
                baVar.mo54257p();
            } else if (a != 0) {
                if (a != 1) {
                    if (a != 2) {
                        if (a == 3) {
                            if (baVar.mo54249h() == C21430ba.C21432b.NULL) {
                                baVar.mo54257p();
                            } else {
                                i = baVar.mo54256o();
                                z = true;
                            }
                        }
                    } else if (baVar.mo54249h() == C21430ba.C21432b.NULL) {
                        baVar.mo54257p();
                    } else {
                        str3 = baVar.mo54251j();
                    }
                } else if (baVar.mo54249h() == C21430ba.C21432b.NULL) {
                    baVar.mo54257p();
                } else {
                    str2 = baVar.mo54251j();
                }
            } else if (baVar.mo54249h() == C21430ba.C21432b.NULL) {
                baVar.mo54257p();
            } else {
                str = baVar.mo54251j();
            }
        }
        baVar.mo54247f();
        if (str == null) {
            sb = aec.m50903a((StringBuilder) null, "function", (String) null, 2, (Object) null);
        } else {
            sb = null;
        }
        if (str2 == null) {
            sb = aec.m50903a(sb, "module", (String) null, 2, (Object) null);
        }
        if (!z) {
            sb = aec.m50903a(sb, "line", (String) null, 2, (Object) null);
        }
        if (sb == null) {
            C24362h.m61208c(str);
            C24362h.m61208c(str2);
            return new C21887jt.C21892e(str, str2, str3, i);
        }
        sb.append(" (at path ");
        sb.append(baVar.mo54259r());
        sb.append(')');
        throw new C21426ax(sb.toString());
    }

    /* renamed from: a */
    public void mo54205a(C21437bf bfVar, C21887jt.C21892e eVar) throws IOException {
        C24362h.m61211f(bfVar, "writer");
        if (eVar == null) {
            bfVar.mo54276e();
            return;
        }
        bfVar.mo54273c();
        bfVar.mo54269a("function");
        bfVar.mo54272b(eVar.mo55630a());
        bfVar.mo54269a("module");
        bfVar.mo54272b(eVar.mo55631b());
        bfVar.mo54269a("filename");
        bfVar.mo54272b(eVar.mo55632c());
        bfVar.mo54269a("line");
        bfVar.mo54268a((Number) Integer.valueOf(eVar.mo55633d()));
        bfVar.mo54275d();
    }
}
