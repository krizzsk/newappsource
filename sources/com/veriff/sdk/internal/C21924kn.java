package com.veriff.sdk.internal;

import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf0.C24362h;

@Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0004\u0004\u0005\u0006\u0007B\u0007\b\u0002¢\u0006\u0002\u0010\u0003\u0001\u0004\b\t\n\u000b¨\u0006\f"}, mo59060d2 = {"Lcom/veriff/sdk/internal/network/ApiResult;", "T", "", "()V", "NetworkFailure", "RequestFailure", "Success", "UnknownFailure", "Lcom/veriff/sdk/internal/network/ApiResult$Success;", "Lcom/veriff/sdk/internal/network/ApiResult$RequestFailure;", "Lcom/veriff/sdk/internal/network/ApiResult$NetworkFailure;", "Lcom/veriff/sdk/internal/network/ApiResult$UnknownFailure;", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.kn */
public abstract class C21924kn<T> {

    @Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\t\u0010\b\u001a\u00020\u0004HÆ\u0003J\u0019\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, mo59060d2 = {"Lcom/veriff/sdk/internal/network/ApiResult$NetworkFailure;", "T", "Lcom/veriff/sdk/internal/network/ApiResult;", "throwable", "Ljava/io/IOException;", "(Ljava/io/IOException;)V", "getThrowable", "()Ljava/io/IOException;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.kn$a */
    public static final class C21925a<T> extends C21924kn<T> {

        /* renamed from: a */
        private final IOException f55421a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C21925a(IOException iOException) {
            super((DefaultConstructorMarker) null);
            C24362h.m61211f(iOException, "throwable");
            this.f55421a = iOException;
        }

        /* renamed from: a */
        public final IOException mo55705a() {
            return this.f55421a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof C21925a) && C24362h.m61206a(this.f55421a, ((C21925a) obj).f55421a);
            }
            return true;
        }

        public int hashCode() {
            IOException iOException = this.f55421a;
            if (iOException != null) {
                return iOException.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder k = C13555b.m33972k("NetworkFailure(throwable=");
            k.append(this.f55421a);
            k.append(")");
            return k.toString();
        }
    }

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\b\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B!\u0012\u0006\u0010\u0010\u001a\u00020\u0005\u0012\u0006\u0010\u0011\u001a\u00020\f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u001d\u0010\u001eJ\t\u0010\u0004\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0006\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\u000b\u001a\u00020\u0005HÆ\u0003J\t\u0010\r\u001a\u00020\fHÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÆ\u0003J/\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000eHÆ\u0001R\u0017\u0010\u0010\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0011\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, mo59060d2 = {"Lcom/veriff/sdk/internal/network/ApiResult$RequestFailure;", "T", "Lcom/veriff/sdk/internal/network/ApiResult;", "", "toString", "", "hashCode", "", "other", "", "equals", "component1", "Lhi0/q;", "component2", "Lmobi/lab/veriff/data/api/request/response/ErrorResponse;", "component3", "code", "headers", "errorBody", "copy", "I", "getCode", "()I", "Lmobi/lab/veriff/data/api/request/response/ErrorResponse;", "getErrorBody", "()Lmobi/lab/veriff/data/api/request/response/ErrorResponse;", "Lhi0/q;", "getHeaders", "()Lhi0/q;", "<init>", "(ILhi0/q;Lmobi/lab/veriff/data/api/request/response/ErrorResponse;)V", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.kn$b */
    public static final class C21926b<T> extends C21924kn<T> {

        /* renamed from: a */
        private final int f55422a;

        /* renamed from: b */
        private final C22736yk f55423b;

        /* renamed from: c */
        private final C22559to f55424c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C21926b(int i, C22736yk ykVar, C22559to toVar) {
            super((DefaultConstructorMarker) null);
            C24362h.m61211f(ykVar, "headers");
            this.f55422a = i;
            this.f55423b = ykVar;
            this.f55424c = toVar;
        }

        /* renamed from: a */
        public final int mo55709a() {
            return this.f55422a;
        }

        /* renamed from: b */
        public final C22736yk mo55710b() {
            return this.f55423b;
        }

        /* renamed from: c */
        public final C22559to mo55711c() {
            return this.f55424c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C21926b)) {
                return false;
            }
            C21926b bVar = (C21926b) obj;
            return this.f55422a == bVar.f55422a && C24362h.m61206a(this.f55423b, bVar.f55423b) && C24362h.m61206a(this.f55424c, bVar.f55424c);
        }

        public int hashCode() {
            int i = this.f55422a * 31;
            C22736yk ykVar = this.f55423b;
            int i2 = 0;
            int hashCode = (i + (ykVar != null ? ykVar.hashCode() : 0)) * 31;
            C22559to toVar = this.f55424c;
            if (toVar != null) {
                i2 = toVar.hashCode();
            }
            return hashCode + i2;
        }

        public String toString() {
            StringBuilder k = C13555b.m33972k("RequestFailure(code=");
            k.append(this.f55422a);
            k.append(", headers=");
            k.append(this.f55423b);
            k.append(", errorBody=");
            k.append(this.f55424c);
            k.append(")");
            return k.toString();
        }
    }

    @Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00028\u0001¢\u0006\u0002\u0010\u0004J\u000e\u0010\b\u001a\u00028\u0001HÆ\u0003¢\u0006\u0002\u0010\u0006J\u001e\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00028\u0001HÆ\u0001¢\u0006\u0002\u0010\nJ\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0013\u0010\u0003\u001a\u00028\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0013"}, mo59060d2 = {"Lcom/veriff/sdk/internal/network/ApiResult$Success;", "T", "Lcom/veriff/sdk/internal/network/ApiResult;", "body", "(Ljava/lang/Object;)V", "getBody", "()Ljava/lang/Object;", "Ljava/lang/Object;", "component1", "copy", "(Ljava/lang/Object;)Lcom/veriff/sdk/internal/network/ApiResult$Success;", "equals", "", "other", "", "hashCode", "", "toString", "", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.kn$c */
    public static final class C21927c<T> extends C21924kn<T> {

        /* renamed from: a */
        private final T f55425a;

        public C21927c(T t) {
            super((DefaultConstructorMarker) null);
            this.f55425a = t;
        }

        /* renamed from: a */
        public final T mo55715a() {
            return this.f55425a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof C21927c) && C24362h.m61206a(this.f55425a, ((C21927c) obj).f55425a);
            }
            return true;
        }

        public int hashCode() {
            T t = this.f55425a;
            if (t != null) {
                return t.hashCode();
            }
            return 0;
        }

        public String toString() {
            return C16530d.m42015h(C13555b.m33972k("Success(body="), this.f55425a, ")");
        }
    }

    @Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\t\u0010\b\u001a\u00020\u0004HÆ\u0003J\u0019\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, mo59060d2 = {"Lcom/veriff/sdk/internal/network/ApiResult$UnknownFailure;", "T", "Lcom/veriff/sdk/internal/network/ApiResult;", "throwable", "", "(Ljava/lang/Throwable;)V", "getThrowable", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.kn$d */
    public static final class C21928d<T> extends C21924kn<T> {

        /* renamed from: a */
        private final Throwable f55426a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C21928d(Throwable th) {
            super((DefaultConstructorMarker) null);
            C24362h.m61211f(th, "throwable");
            this.f55426a = th;
        }

        /* renamed from: a */
        public final Throwable mo55719a() {
            return this.f55426a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof C21928d) && C24362h.m61206a(this.f55426a, ((C21928d) obj).f55426a);
            }
            return true;
        }

        public int hashCode() {
            Throwable th = this.f55426a;
            if (th != null) {
                return th.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder k = C13555b.m33972k("UnknownFailure(throwable=");
            k.append(this.f55426a);
            k.append(")");
            return k.toString();
        }
    }

    private C21924kn() {
    }

    public /* synthetic */ C21924kn(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
