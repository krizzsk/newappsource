package com.veriff.sdk.internal;

import com.appsflyer.ServerParameters;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf0.C24362h;
import p001a0.C0016g;

@Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\b\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, mo59060d2 = {"Lmobi/lab/veriff/data/api/request/payload/StatusPayload;", "", "status", "", "(Ljava/lang/String;)V", "getStatus", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.td */
public final class C22545td {

    /* renamed from: a */
    public static final C22546a f56892a = new C22546a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final C22545td f56893c = new C22545td("submitted");
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final C22545td f56894d = new C22545td("started");

    /* renamed from: b */
    private final String f56895b;

    @Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006¨\u0006\t"}, mo59060d2 = {"Lmobi/lab/veriff/data/api/request/payload/StatusPayload$Companion;", "", "()V", "STARTED", "Lmobi/lab/veriff/data/api/request/payload/StatusPayload;", "getSTARTED", "()Lmobi/lab/veriff/data/api/request/payload/StatusPayload;", "SUBMITTED", "getSUBMITTED", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.td$a */
    public static final class C22546a {
        private C22546a() {
        }

        public /* synthetic */ C22546a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C22545td mo56701a() {
            return C22545td.f56893c;
        }

        /* renamed from: b */
        public final C22545td mo56702b() {
            return C22545td.f56894d;
        }
    }

    public C22545td(String str) {
        C24362h.m61211f(str, ServerParameters.STATUS);
        this.f56895b = str;
    }

    /* renamed from: a */
    public final String mo56697a() {
        return this.f56895b;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C22545td) && C24362h.m61206a(this.f56895b, ((C22545td) obj).f56895b);
        }
        return true;
    }

    public int hashCode() {
        String str = this.f56895b;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        return C0016g.m31o(C13555b.m33972k("StatusPayload(status="), this.f56895b, ")");
    }
}
