package com.veriff.sdk.internal;

import com.veriff.sdk.internal.C21430ba;
import com.veriff.sdk.internal.C22561tq;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf0.C24362h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001a\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016R \u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0017"}, mo59060d2 = {"Lmobi/lab/veriff/data/api/request/response/KotshiInflowResponse_FeedbackJsonAdapter;", "Lse/ansman/kotshi/NamedJsonAdapter;", "Lmobi/lab/veriff/data/api/request/response/InflowResponse$Feedback;", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "Lnb0/k;", "writer", "value", "Lbf0/d;", "toJson", "Lcom/squareup/moshi/k;", "", "Lmobi/lab/veriff/data/api/request/response/InflowResponse$Feedback$Image;", "inflowResponseFeedbackImageListAdapter", "Lcom/squareup/moshi/k;", "Lcom/squareup/moshi/JsonReader$a;", "options", "Lcom/squareup/moshi/JsonReader$a;", "Lcom/squareup/moshi/o;", "moshi", "<init>", "(Lcom/squareup/moshi/o;)V", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.uc */
public final class C22585uc extends aed<C22561tq.C22563b> {

    /* renamed from: a */
    private final C21420av<List<C22561tq.C22563b.C22564a>> f56974a;

    /* renamed from: b */
    private final C21430ba.C21431a f56975b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22585uc(C21450bi biVar) {
        super("KotshiJsonAdapter(InflowResponse.Feedback)");
        C24362h.m61211f(biVar, "moshi");
        C21420av<List<C22561tq.C22563b.C22564a>> a = biVar.mo54335a((Type) C21468bk.m51261a((Type) List.class, C22561tq.C22563b.C22564a.class));
        C24362h.m61210e(a, "moshi.adapter(Types.newP…e::class.javaObjectType))");
        this.f56974a = a;
        C21430ba.C21431a a2 = C21430ba.C21431a.m51080a("title", "question", "sentence", "images");
        C24362h.m61210e(a2, "JsonReader.Options.of(\n …ence\",\n      \"images\"\n  )");
        this.f56975b = a2;
    }

    /* renamed from: b */
    public C22561tq.C22563b mo54204a(C21430ba baVar) throws IOException {
        C21430ba baVar2 = baVar;
        C24362h.m61211f(baVar2, "reader");
        if (baVar.mo54249h() == C21430ba.C21432b.NULL) {
            return (C22561tq.C22563b) baVar.mo54253l();
        }
        baVar.mo54246e();
        boolean z = false;
        String str = null;
        String str2 = null;
        String str3 = null;
        List<C22561tq.C22563b.C22564a> list = null;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        while (baVar.mo54248g()) {
            int a = baVar2.mo54236a(this.f56975b);
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
                    str2 = baVar.mo54251j();
                }
                z2 = true;
            } else if (a == 2) {
                if (baVar.mo54249h() == C21430ba.C21432b.NULL) {
                    baVar.mo54257p();
                } else {
                    str3 = baVar.mo54251j();
                }
                z3 = true;
            } else if (a == 3) {
                list = this.f56974a.mo54204a(baVar2);
                z4 = true;
            }
        }
        baVar.mo54247f();
        C22561tq.C22563b bVar = new C22561tq.C22563b((String) null, (String) null, (String) null, (List) null, 15, (DefaultConstructorMarker) null);
        if (!z) {
            str = bVar.mo56771a();
        }
        if (!z2) {
            str2 = bVar.mo56772b();
        }
        if (!z3) {
            str3 = bVar.mo56773c();
        }
        if (!z4) {
            list = bVar.mo56774d();
        }
        return bVar.mo56770a(str, str2, str3, list);
    }

    /* renamed from: a */
    public void mo54205a(C21437bf bfVar, C22561tq.C22563b bVar) throws IOException {
        C24362h.m61211f(bfVar, "writer");
        if (bVar == null) {
            bfVar.mo54276e();
            return;
        }
        bfVar.mo54273c();
        bfVar.mo54269a("title");
        bfVar.mo54272b(bVar.mo56771a());
        bfVar.mo54269a("question");
        bfVar.mo54272b(bVar.mo56772b());
        bfVar.mo54269a("sentence");
        bfVar.mo54272b(bVar.mo56773c());
        bfVar.mo54269a("images");
        this.f56974a.mo54205a(bfVar, bVar.mo56774d());
        bfVar.mo54275d();
    }
}
