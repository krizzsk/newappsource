package com.veriff.sdk.internal;

import com.appsflyer.ServerParameters;
import com.veriff.sdk.internal.C21924kn;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf0.C24362h;

@Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00072\u00020\u0001:\u0005\u0007\b\t\n\u000bB\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0012\u0010\u0003\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0001\u0004\f\r\u000e\u000f¨\u0006\u0010"}, mo59060d2 = {"Lcom/veriff/sdk/internal/upload/MediaUploadStatus;", "", "()V", "status", "", "getStatus", "()Ljava/lang/String;", "Companion", "Completed", "Failed", "Queued", "Uploading", "Lcom/veriff/sdk/internal/upload/MediaUploadStatus$Queued;", "Lcom/veriff/sdk/internal/upload/MediaUploadStatus$Uploading;", "Lcom/veriff/sdk/internal/upload/MediaUploadStatus$Completed;", "Lcom/veriff/sdk/internal/upload/MediaUploadStatus$Failed;", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.nc */
public abstract class C22048nc {

    /* renamed from: a */
    public static final C22049a f55620a = new C22049a((DefaultConstructorMarker) null);

    @Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¨\u0006\b"}, mo59060d2 = {"Lcom/veriff/sdk/internal/upload/MediaUploadStatus$Companion;", "", "()V", "fromApiResult", "Lcom/veriff/sdk/internal/upload/MediaUploadStatus;", "result", "Lcom/veriff/sdk/internal/network/ApiResult;", "Lmobi/lab/veriff/data/api/request/response/InflowResponse;", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.nc$a */
    public static final class C22049a {
        private C22049a() {
        }

        public /* synthetic */ C22049a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C22048nc mo55901a(C21924kn<C22561tq> knVar) {
            C24362h.m61211f(knVar, "result");
            if (knVar instanceof C21924kn.C21927c) {
                return new C22050b((C22561tq) ((C21924kn.C21927c) knVar).mo55715a(), (String) null, 2, (DefaultConstructorMarker) null);
            }
            boolean z = false;
            if (knVar instanceof C21924kn.C21926b) {
                if (((C21924kn.C21926b) knVar).mo55709a() >= 500) {
                    z = true;
                }
                return new C22051c(z, (String) null, 2, (DefaultConstructorMarker) null);
            } else if (knVar instanceof C21924kn.C21925a) {
                return new C22051c(true, (String) null, 2, (DefaultConstructorMarker) null);
            } else {
                if (knVar instanceof C21924kn.C21928d) {
                    return new C22051c(false, (String) null, 2, (DefaultConstructorMarker) null);
                }
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    @Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, mo59060d2 = {"Lcom/veriff/sdk/internal/upload/MediaUploadStatus$Completed;", "Lcom/veriff/sdk/internal/upload/MediaUploadStatus;", "result", "Lmobi/lab/veriff/data/api/request/response/InflowResponse;", "status", "", "(Lmobi/lab/veriff/data/api/request/response/InflowResponse;Ljava/lang/String;)V", "getResult", "()Lmobi/lab/veriff/data/api/request/response/InflowResponse;", "getStatus", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.nc$b */
    public static final class C22050b extends C22048nc {

        /* renamed from: b */
        private final C22561tq f55621b;

        /* renamed from: c */
        private final String f55622c;

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C22050b(C22561tq tqVar, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(tqVar, (i & 2) != 0 ? "completed" : str);
        }

        /* renamed from: a */
        public static /* synthetic */ C22050b m53771a(C22050b bVar, C22561tq tqVar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                tqVar = bVar.f55621b;
            }
            if ((i & 2) != 0) {
                str = bVar.mo55904b();
            }
            return bVar.mo55902a(tqVar, str);
        }

        /* renamed from: a */
        public final C22050b mo55902a(C22561tq tqVar, String str) {
            C24362h.m61211f(tqVar, "result");
            C24362h.m61211f(str, ServerParameters.STATUS);
            return new C22050b(tqVar, str);
        }

        /* renamed from: a */
        public final C22561tq mo55903a() {
            return this.f55621b;
        }

        /* renamed from: b */
        public String mo55904b() {
            return this.f55622c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C22050b)) {
                return false;
            }
            C22050b bVar = (C22050b) obj;
            return C24362h.m61206a(this.f55621b, bVar.f55621b) && C24362h.m61206a(mo55904b(), bVar.mo55904b());
        }

        public int hashCode() {
            C22561tq tqVar = this.f55621b;
            int i = 0;
            int hashCode = (tqVar != null ? tqVar.hashCode() : 0) * 31;
            String b = mo55904b();
            if (b != null) {
                i = b.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder k = C13555b.m33972k("Completed(result=");
            k.append(this.f55621b);
            k.append(", status=");
            k.append(mo55904b());
            k.append(")");
            return k.toString();
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22050b(C22561tq tqVar, String str) {
            super((DefaultConstructorMarker) null);
            C24362h.m61211f(tqVar, "result");
            C24362h.m61211f(str, ServerParameters.STATUS);
            this.f55621b = tqVar;
            this.f55622c = str;
        }
    }

    @Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, mo59060d2 = {"Lcom/veriff/sdk/internal/upload/MediaUploadStatus$Failed;", "Lcom/veriff/sdk/internal/upload/MediaUploadStatus;", "canRetry", "", "status", "", "(ZLjava/lang/String;)V", "getCanRetry", "()Z", "getStatus", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.nc$c */
    public static final class C22051c extends C22048nc {

        /* renamed from: b */
        private final boolean f55623b;

        /* renamed from: c */
        private final String f55624c;

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C22051c(boolean z, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(z, (i & 2) != 0 ? "failed" : str);
        }

        /* renamed from: a */
        public static /* synthetic */ C22051c m53775a(C22051c cVar, boolean z, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                z = cVar.f55623b;
            }
            if ((i & 2) != 0) {
                str = cVar.mo55910b();
            }
            return cVar.mo55908a(z, str);
        }

        /* renamed from: a */
        public final C22051c mo55908a(boolean z, String str) {
            C24362h.m61211f(str, ServerParameters.STATUS);
            return new C22051c(z, str);
        }

        /* renamed from: a */
        public final boolean mo55909a() {
            return this.f55623b;
        }

        /* renamed from: b */
        public String mo55910b() {
            return this.f55624c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C22051c)) {
                return false;
            }
            C22051c cVar = (C22051c) obj;
            return this.f55623b == cVar.f55623b && C24362h.m61206a(mo55910b(), cVar.mo55910b());
        }

        public int hashCode() {
            boolean z = this.f55623b;
            if (z) {
                z = true;
            }
            int i = (z ? 1 : 0) * true;
            String b = mo55910b();
            return i + (b != null ? b.hashCode() : 0);
        }

        public String toString() {
            StringBuilder k = C13555b.m33972k("Failed(canRetry=");
            k.append(this.f55623b);
            k.append(", status=");
            k.append(mo55910b());
            k.append(")");
            return k.toString();
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22051c(boolean z, String str) {
            super((DefaultConstructorMarker) null);
            C24362h.m61211f(str, ServerParameters.STATUS);
            this.f55623b = z;
            this.f55624c = str;
        }
    }

    @Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, mo59060d2 = {"Lcom/veriff/sdk/internal/upload/MediaUploadStatus$Queued;", "Lcom/veriff/sdk/internal/upload/MediaUploadStatus;", "status", "", "(Ljava/lang/String;)V", "getStatus", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.nc$d */
    public static final class C22052d extends C22048nc {

        /* renamed from: b */
        private final String f55625b;

        public C22052d() {
            this((String) null, 1, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22052d(String str) {
            super((DefaultConstructorMarker) null);
            C24362h.m61211f(str, ServerParameters.STATUS);
            this.f55625b = str;
        }

        /* renamed from: a */
        public final C22052d mo55914a(String str) {
            C24362h.m61211f(str, ServerParameters.STATUS);
            return new C22052d(str);
        }

        /* renamed from: a */
        public String mo55915a() {
            return this.f55625b;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof C22052d) && C24362h.m61206a(mo55915a(), ((C22052d) obj).mo55915a());
            }
            return true;
        }

        public int hashCode() {
            String a = mo55915a();
            if (a != null) {
                return a.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder k = C13555b.m33972k("Queued(status=");
            k.append(mo55915a());
            k.append(")");
            return k.toString();
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C22052d(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "queued" : str);
        }
    }

    @Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, mo59060d2 = {"Lcom/veriff/sdk/internal/upload/MediaUploadStatus$Uploading;", "Lcom/veriff/sdk/internal/upload/MediaUploadStatus;", "status", "", "(Ljava/lang/String;)V", "getStatus", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.nc$e */
    public static final class C22053e extends C22048nc {

        /* renamed from: b */
        private final String f55626b;

        public C22053e() {
            this((String) null, 1, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22053e(String str) {
            super((DefaultConstructorMarker) null);
            C24362h.m61211f(str, ServerParameters.STATUS);
            this.f55626b = str;
        }

        /* renamed from: a */
        public final C22053e mo55919a(String str) {
            C24362h.m61211f(str, ServerParameters.STATUS);
            return new C22053e(str);
        }

        /* renamed from: a */
        public String mo55920a() {
            return this.f55626b;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof C22053e) && C24362h.m61206a(mo55920a(), ((C22053e) obj).mo55920a());
            }
            return true;
        }

        public int hashCode() {
            String a = mo55920a();
            if (a != null) {
                return a.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder k = C13555b.m33972k("Uploading(status=");
            k.append(mo55920a());
            k.append(")");
            return k.toString();
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C22053e(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "uploading" : str);
        }
    }

    private C22048nc() {
    }

    public /* synthetic */ C22048nc(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
