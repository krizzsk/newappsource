package com.veriff.sdk.views.upload;

import com.appsflyer.ServerParameters;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf0.C24362h;

@Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, mo59060d2 = {"Lcom/veriff/sdk/views/upload/UploadDecision;", "", "title", "", "status", "Lcom/veriff/sdk/views/upload/DecisionStatus;", "(Ljava/lang/CharSequence;Lcom/veriff/sdk/views/upload/DecisionStatus;)V", "getStatus", "()Lcom/veriff/sdk/views/upload/DecisionStatus;", "getTitle", "()Ljava/lang/CharSequence;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.views.upload.e */
public final class C23032e {

    /* renamed from: a */
    private final CharSequence f58409a;

    /* renamed from: b */
    private final C23029b f58410b;

    public C23032e(CharSequence charSequence, C23029b bVar) {
        C24362h.m61211f(charSequence, "title");
        C24362h.m61211f(bVar, ServerParameters.STATUS);
        this.f58409a = charSequence;
        this.f58410b = bVar;
    }

    /* renamed from: a */
    public static /* synthetic */ C23032e m56897a(C23032e eVar, CharSequence charSequence, C23029b bVar, int i, Object obj) {
        if ((i & 1) != 0) {
            charSequence = eVar.f58409a;
        }
        if ((i & 2) != 0) {
            bVar = eVar.f58410b;
        }
        return eVar.mo57973a(charSequence, bVar);
    }

    /* renamed from: a */
    public final C23032e mo57973a(CharSequence charSequence, C23029b bVar) {
        C24362h.m61211f(charSequence, "title");
        C24362h.m61211f(bVar, ServerParameters.STATUS);
        return new C23032e(charSequence, bVar);
    }

    /* renamed from: a */
    public final CharSequence mo57974a() {
        return this.f58409a;
    }

    /* renamed from: b */
    public final C23029b mo57975b() {
        return this.f58410b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C23032e)) {
            return false;
        }
        C23032e eVar = (C23032e) obj;
        return C24362h.m61206a(this.f58409a, eVar.f58409a) && C24362h.m61206a(this.f58410b, eVar.f58410b);
    }

    public int hashCode() {
        CharSequence charSequence = this.f58409a;
        int i = 0;
        int hashCode = (charSequence != null ? charSequence.hashCode() : 0) * 31;
        C23029b bVar = this.f58410b;
        if (bVar != null) {
            i = bVar.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder k = C13555b.m33972k("UploadDecision(title=");
        k.append(this.f58409a);
        k.append(", status=");
        k.append(this.f58410b);
        k.append(")");
        return k.toString();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C23032e(CharSequence charSequence, C23029b bVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(charSequence, (i & 2) != 0 ? C23029b.NOT_STARTED : bVar);
    }
}
