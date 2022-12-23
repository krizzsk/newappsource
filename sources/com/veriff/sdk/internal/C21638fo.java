package com.veriff.sdk.internal;

import kotlin.Metadata;
import mf0.C24362h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, mo59060d2 = {"Lcom/veriff/sdk/internal/SerializingSubAdapter;", "", "T", "Lcom/squareup/moshi/k;", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;", "Lnb0/k;", "writer", "value", "Lbf0/d;", "toJson", "(Lnb0/k;Ljava/lang/Object;)V", "Lcom/squareup/moshi/o;", "moshi", "Lcom/squareup/moshi/o;", "<init>", "(Lcom/squareup/moshi/o;)V", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.fo */
public final class C21638fo<T> extends C21420av<T> {

    /* renamed from: a */
    private final C21450bi f54644a;

    public C21638fo(C21450bi biVar) {
        C24362h.m61211f(biVar, "moshi");
        this.f54644a = biVar;
    }

    /* renamed from: a */
    public T mo54204a(C21430ba baVar) {
        C24362h.m61211f(baVar, "reader");
        throw new IllegalStateException("SerializingSubAdapter can only be used for serialization");
    }

    /* renamed from: a */
    public void mo54205a(C21437bf bfVar, T t) {
        C24362h.m61211f(bfVar, "writer");
        if (t == null) {
            bfVar.mo54276e();
            return;
        }
        C21420av<?> a = this.f54644a.mo54334a(t.getClass());
        if (a != null) {
            a.mo54205a(bfVar, t);
            return;
        }
        StringBuilder k = C13555b.m33972k("Cannot serialize ");
        k.append(t.getClass());
        throw new IllegalArgumentException(k.toString());
    }
}
