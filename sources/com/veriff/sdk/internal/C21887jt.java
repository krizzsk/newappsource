package com.veriff.sdk.internal;

import com.appboy.models.InAppMessageBase;
import com.appsflyer.ServerParameters;
import java.util.List;
import kotlin.Metadata;
import mf0.C24362h;
import p001a0.C0016g;
import p358af.C13437d;

@Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001:\u0005$%&'(B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0002\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\tHÆ\u0003J\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003JA\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006)"}, mo59060d2 = {"Lcom/veriff/sdk/internal/data/SentryReport;", "", "message", "", "severity", "Lcom/veriff/sdk/internal/data/SentryReport$Severity;", "device", "Lcom/veriff/sdk/internal/data/SentryReport$Device;", "os", "Lcom/veriff/sdk/internal/data/SentryReport$Os;", "exceptions", "", "Lcom/veriff/sdk/internal/data/SentryReport$Exception;", "(Ljava/lang/String;Lcom/veriff/sdk/internal/data/SentryReport$Severity;Lcom/veriff/sdk/internal/data/SentryReport$Device;Lcom/veriff/sdk/internal/data/SentryReport$Os;Ljava/util/List;)V", "getDevice", "()Lcom/veriff/sdk/internal/data/SentryReport$Device;", "getExceptions", "()Ljava/util/List;", "getMessage", "()Ljava/lang/String;", "getOs", "()Lcom/veriff/sdk/internal/data/SentryReport$Os;", "getSeverity", "()Lcom/veriff/sdk/internal/data/SentryReport$Severity;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "Device", "Exception", "Os", "Severity", "StackFrame", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.jt */
public final class C21887jt {

    /* renamed from: a */
    private final String f55336a;

    /* renamed from: b */
    private final C21891d f55337b;

    /* renamed from: c */
    private final C21888a f55338c;

    /* renamed from: d */
    private final C21890c f55339d;

    /* renamed from: e */
    private final List<C21889b> f55340e;

    @Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, mo59060d2 = {"Lcom/veriff/sdk/internal/data/SentryReport$Device;", "", "name", "", "brand", "model", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBrand", "()Ljava/lang/String;", "getModel", "getName", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.jt$a */
    public static final class C21888a {

        /* renamed from: a */
        private final String f55341a;

        /* renamed from: b */
        private final String f55342b;

        /* renamed from: c */
        private final String f55343c;

        public C21888a(String str, String str2, String str3) {
            this.f55341a = str;
            this.f55342b = str2;
            this.f55343c = str3;
        }

        /* renamed from: a */
        public final String mo55612a() {
            return this.f55341a;
        }

        /* renamed from: b */
        public final String mo55613b() {
            return this.f55342b;
        }

        /* renamed from: c */
        public final String mo55614c() {
            return this.f55343c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C21888a)) {
                return false;
            }
            C21888a aVar = (C21888a) obj;
            return C24362h.m61206a(this.f55341a, aVar.f55341a) && C24362h.m61206a(this.f55342b, aVar.f55342b) && C24362h.m61206a(this.f55343c, aVar.f55343c);
        }

        public int hashCode() {
            String str = this.f55341a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.f55342b;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f55343c;
            if (str3 != null) {
                i = str3.hashCode();
            }
            return hashCode2 + i;
        }

        public String toString() {
            StringBuilder k = C13555b.m33972k("Device(name=");
            k.append(this.f55341a);
            k.append(", brand=");
            k.append(this.f55342b);
            k.append(", model=");
            return C0016g.m31o(k, this.f55343c, ")");
        }
    }

    @Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J/\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0018"}, mo59060d2 = {"Lcom/veriff/sdk/internal/data/SentryReport$Exception;", "", "type", "", "value", "stacktrace", "", "Lcom/veriff/sdk/internal/data/SentryReport$StackFrame;", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getStacktrace", "()Ljava/util/List;", "getType", "()Ljava/lang/String;", "getValue", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.jt$b */
    public static final class C21889b {

        /* renamed from: a */
        private final String f55344a;

        /* renamed from: b */
        private final String f55345b;

        /* renamed from: c */
        private final List<C21892e> f55346c;

        public C21889b(String str, String str2, List<C21892e> list) {
            C24362h.m61211f(str, "type");
            C24362h.m61211f(list, "stacktrace");
            this.f55344a = str;
            this.f55345b = str2;
            this.f55346c = list;
        }

        /* renamed from: a */
        public final String mo55618a() {
            return this.f55344a;
        }

        /* renamed from: b */
        public final String mo55619b() {
            return this.f55345b;
        }

        /* renamed from: c */
        public final List<C21892e> mo55620c() {
            return this.f55346c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C21889b)) {
                return false;
            }
            C21889b bVar = (C21889b) obj;
            return C24362h.m61206a(this.f55344a, bVar.f55344a) && C24362h.m61206a(this.f55345b, bVar.f55345b) && C24362h.m61206a(this.f55346c, bVar.f55346c);
        }

        public int hashCode() {
            String str = this.f55344a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.f55345b;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            List<C21892e> list = this.f55346c;
            if (list != null) {
                i = list.hashCode();
            }
            return hashCode2 + i;
        }

        public String toString() {
            StringBuilder k = C13555b.m33972k("Exception(type=");
            k.append(this.f55344a);
            k.append(", value=");
            k.append(this.f55345b);
            k.append(", stacktrace=");
            k.append(this.f55346c);
            k.append(")");
            return k.toString();
        }
    }

    @Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J+\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, mo59060d2 = {"Lcom/veriff/sdk/internal/data/SentryReport$Os;", "", "name", "", "version", "build", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBuild", "()Ljava/lang/String;", "getName", "getVersion", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.jt$c */
    public static final class C21890c {

        /* renamed from: a */
        private final String f55347a;

        /* renamed from: b */
        private final String f55348b;

        /* renamed from: c */
        private final String f55349c;

        public C21890c(String str, String str2, String str3) {
            C24362h.m61211f(str, "name");
            this.f55347a = str;
            this.f55348b = str2;
            this.f55349c = str3;
        }

        /* renamed from: a */
        public final String mo55624a() {
            return this.f55347a;
        }

        /* renamed from: b */
        public final String mo55625b() {
            return this.f55348b;
        }

        /* renamed from: c */
        public final String mo55626c() {
            return this.f55349c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C21890c)) {
                return false;
            }
            C21890c cVar = (C21890c) obj;
            return C24362h.m61206a(this.f55347a, cVar.f55347a) && C24362h.m61206a(this.f55348b, cVar.f55348b) && C24362h.m61206a(this.f55349c, cVar.f55349c);
        }

        public int hashCode() {
            String str = this.f55347a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.f55348b;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f55349c;
            if (str3 != null) {
                i = str3.hashCode();
            }
            return hashCode2 + i;
        }

        public String toString() {
            StringBuilder k = C13555b.m33972k("Os(name=");
            k.append(this.f55347a);
            k.append(", version=");
            k.append(this.f55348b);
            k.append(", build=");
            return C0016g.m31o(k, this.f55349c, ")");
        }
    }

    @Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, mo59060d2 = {"Lcom/veriff/sdk/internal/data/SentryReport$Severity;", "", "(Ljava/lang/String;I)V", "fatal", "error", "warning", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.jt$d */
    public enum C21891d {
        fatal,
        error,
        warning
    }

    @Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J3\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u0019"}, mo59060d2 = {"Lcom/veriff/sdk/internal/data/SentryReport$StackFrame;", "", "function", "", "module", "filename", "line", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getFilename", "()Ljava/lang/String;", "getFunction", "getLine", "()I", "getModule", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.jt$e */
    public static final class C21892e {

        /* renamed from: a */
        private final String f55354a;

        /* renamed from: b */
        private final String f55355b;

        /* renamed from: c */
        private final String f55356c;

        /* renamed from: d */
        private final int f55357d;

        public C21892e(String str, String str2, String str3, int i) {
            C24362h.m61211f(str, "function");
            C24362h.m61211f(str2, "module");
            this.f55354a = str;
            this.f55355b = str2;
            this.f55356c = str3;
            this.f55357d = i;
        }

        /* renamed from: a */
        public final String mo55630a() {
            return this.f55354a;
        }

        /* renamed from: b */
        public final String mo55631b() {
            return this.f55355b;
        }

        /* renamed from: c */
        public final String mo55632c() {
            return this.f55356c;
        }

        /* renamed from: d */
        public final int mo55633d() {
            return this.f55357d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C21892e)) {
                return false;
            }
            C21892e eVar = (C21892e) obj;
            return C24362h.m61206a(this.f55354a, eVar.f55354a) && C24362h.m61206a(this.f55355b, eVar.f55355b) && C24362h.m61206a(this.f55356c, eVar.f55356c) && this.f55357d == eVar.f55357d;
        }

        public int hashCode() {
            String str = this.f55354a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.f55355b;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f55356c;
            if (str3 != null) {
                i = str3.hashCode();
            }
            return ((hashCode2 + i) * 31) + this.f55357d;
        }

        public String toString() {
            StringBuilder k = C13555b.m33972k("StackFrame(function=");
            k.append(this.f55354a);
            k.append(", module=");
            k.append(this.f55355b);
            k.append(", filename=");
            k.append(this.f55356c);
            k.append(", line=");
            return C13437d.m33707l(k, this.f55357d, ")");
        }
    }

    public C21887jt(String str, C21891d dVar, C21888a aVar, C21890c cVar, List<C21889b> list) {
        C24362h.m61211f(str, InAppMessageBase.MESSAGE);
        C24362h.m61211f(dVar, "severity");
        C24362h.m61211f(aVar, ServerParameters.DEVICE_KEY);
        C24362h.m61211f(cVar, "os");
        C24362h.m61211f(list, "exceptions");
        this.f55336a = str;
        this.f55337b = dVar;
        this.f55338c = aVar;
        this.f55339d = cVar;
        this.f55340e = list;
    }

    /* renamed from: a */
    public final String mo55604a() {
        return this.f55336a;
    }

    /* renamed from: b */
    public final C21891d mo55605b() {
        return this.f55337b;
    }

    /* renamed from: c */
    public final C21888a mo55606c() {
        return this.f55338c;
    }

    /* renamed from: d */
    public final C21890c mo55607d() {
        return this.f55339d;
    }

    /* renamed from: e */
    public final List<C21889b> mo55608e() {
        return this.f55340e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21887jt)) {
            return false;
        }
        C21887jt jtVar = (C21887jt) obj;
        return C24362h.m61206a(this.f55336a, jtVar.f55336a) && C24362h.m61206a(this.f55337b, jtVar.f55337b) && C24362h.m61206a(this.f55338c, jtVar.f55338c) && C24362h.m61206a(this.f55339d, jtVar.f55339d) && C24362h.m61206a(this.f55340e, jtVar.f55340e);
    }

    public int hashCode() {
        String str = this.f55336a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        C21891d dVar = this.f55337b;
        int hashCode2 = (hashCode + (dVar != null ? dVar.hashCode() : 0)) * 31;
        C21888a aVar = this.f55338c;
        int hashCode3 = (hashCode2 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        C21890c cVar = this.f55339d;
        int hashCode4 = (hashCode3 + (cVar != null ? cVar.hashCode() : 0)) * 31;
        List<C21889b> list = this.f55340e;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode4 + i;
    }

    public String toString() {
        StringBuilder k = C13555b.m33972k("SentryReport(message=");
        k.append(this.f55336a);
        k.append(", severity=");
        k.append(this.f55337b);
        k.append(", device=");
        k.append(this.f55338c);
        k.append(", os=");
        k.append(this.f55339d);
        k.append(", exceptions=");
        k.append(this.f55340e);
        k.append(")");
        return k.toString();
    }
}
