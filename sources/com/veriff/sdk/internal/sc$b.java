package com.veriff.sdk.internal;

import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf0.C24362h;
import p358af.C13437d;

@Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0007\bB\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0001\u0002\t\n¨\u0006\u000b"}, mo59060d2 = {"Lcom/veriff/sdk/views/nfc/ScanMrtdMvl$Output;", "", "()V", "terminal", "", "getTerminal", "()Z", "Effect", "ViewState", "Lcom/veriff/sdk/views/nfc/ScanMrtdMvl$Output$Effect;", "Lcom/veriff/sdk/views/nfc/ScanMrtdMvl$Output$ViewState;", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
public abstract class sc$b {

    @Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0007B\u0007\b\u0002¢\u0006\u0002\u0010\u0002\u0001\u0005\b\t\n\u000b\f¨\u0006\r"}, mo59060d2 = {"Lcom/veriff/sdk/views/nfc/ScanMrtdMvl$Output$Effect;", "Lcom/veriff/sdk/views/nfc/ScanMrtdMvl$Output;", "()V", "Close", "ScanSuccess", "ShowError", "Skip", "StoreMrzInfo", "Lcom/veriff/sdk/views/nfc/ScanMrtdMvl$Output$Effect$StoreMrzInfo;", "Lcom/veriff/sdk/views/nfc/ScanMrtdMvl$Output$Effect$Close;", "Lcom/veriff/sdk/views/nfc/ScanMrtdMvl$Output$Effect$ShowError;", "Lcom/veriff/sdk/views/nfc/ScanMrtdMvl$Output$Effect$Skip;", "Lcom/veriff/sdk/views/nfc/ScanMrtdMvl$Output$Effect$ScanSuccess;", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.sc$b$a */
    public static abstract class C22488a extends sc$b {

        @Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, mo59060d2 = {"Lcom/veriff/sdk/views/nfc/ScanMrtdMvl$Output$Effect$Close;", "Lcom/veriff/sdk/views/nfc/ScanMrtdMvl$Output$Effect;", "()V", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
        /* renamed from: com.veriff.sdk.internal.sc$b$a$a */
        public static final class C22489a extends C22488a {

            /* renamed from: a */
            public static final C22489a f56751a = new C22489a();

            private C22489a() {
                super((DefaultConstructorMarker) null);
            }
        }

        @Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\bXD¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, mo59060d2 = {"Lcom/veriff/sdk/views/nfc/ScanMrtdMvl$Output$Effect$ScanSuccess;", "Lcom/veriff/sdk/views/nfc/ScanMrtdMvl$Output$Effect;", "data", "Ljava/io/File;", "(Ljava/io/File;)V", "getData", "()Ljava/io/File;", "terminal", "", "getTerminal", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
        /* renamed from: com.veriff.sdk.internal.sc$b$a$b */
        public static final class C22490b extends C22488a {

            /* renamed from: a */
            private final boolean f56752a = true;

            /* renamed from: b */
            private final File f56753b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C22490b(File file) {
                super((DefaultConstructorMarker) null);
                C24362h.m61211f(file, "data");
                this.f56753b = file;
            }

            /* renamed from: a */
            public boolean mo56611a() {
                return this.f56752a;
            }

            /* renamed from: b */
            public final File mo56612b() {
                return this.f56753b;
            }

            public boolean equals(Object obj) {
                if (this != obj) {
                    return (obj instanceof C22490b) && C24362h.m61206a(this.f56753b, ((C22490b) obj).f56753b);
                }
                return true;
            }

            public int hashCode() {
                File file = this.f56753b;
                if (file != null) {
                    return file.hashCode();
                }
                return 0;
            }

            public String toString() {
                StringBuilder k = C13555b.m33972k("ScanSuccess(data=");
                k.append(this.f56753b);
                k.append(")");
                return k.toString();
            }
        }

        @Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\bXD¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, mo59060d2 = {"Lcom/veriff/sdk/views/nfc/ScanMrtdMvl$Output$Effect$ShowError;", "Lcom/veriff/sdk/views/nfc/ScanMrtdMvl$Output$Effect;", "error", "", "(I)V", "getError", "()I", "terminal", "", "getTerminal", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "toString", "", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
        /* renamed from: com.veriff.sdk.internal.sc$b$a$c */
        public static final class C22491c extends C22488a {

            /* renamed from: a */
            private final boolean f56754a = true;

            /* renamed from: b */
            private final int f56755b;

            public C22491c(int i) {
                super((DefaultConstructorMarker) null);
                this.f56755b = i;
            }

            /* renamed from: a */
            public boolean mo56611a() {
                return this.f56754a;
            }

            /* renamed from: b */
            public final int mo56616b() {
                return this.f56755b;
            }

            public boolean equals(Object obj) {
                if (this != obj) {
                    return (obj instanceof C22491c) && this.f56755b == ((C22491c) obj).f56755b;
                }
                return true;
            }

            public int hashCode() {
                return this.f56755b;
            }

            public String toString() {
                return C13437d.m33707l(C13555b.m33972k("ShowError(error="), this.f56755b, ")");
            }
        }

        @Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, mo59060d2 = {"Lcom/veriff/sdk/views/nfc/ScanMrtdMvl$Output$Effect$Skip;", "Lcom/veriff/sdk/views/nfc/ScanMrtdMvl$Output$Effect;", "()V", "terminal", "", "getTerminal", "()Z", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
        /* renamed from: com.veriff.sdk.internal.sc$b$a$d */
        public static final class C22492d extends C22488a {

            /* renamed from: a */
            public static final C22492d f56756a = new C22492d();

            /* renamed from: b */
            private static final boolean f56757b = true;

            private C22492d() {
                super((DefaultConstructorMarker) null);
            }

            /* renamed from: a */
            public boolean mo56611a() {
                return f56757b;
            }
        }

        @Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, mo59060d2 = {"Lcom/veriff/sdk/views/nfc/ScanMrtdMvl$Output$Effect$StoreMrzInfo;", "Lcom/veriff/sdk/views/nfc/ScanMrtdMvl$Output$Effect;", "mrzInfo", "Lcom/veriff/sdk/views/nfc/PendingMrzInfo;", "(Lcom/veriff/sdk/views/nfc/PendingMrzInfo;)V", "getMrzInfo", "()Lcom/veriff/sdk/views/nfc/PendingMrzInfo;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
        /* renamed from: com.veriff.sdk.internal.sc$b$a$e */
        public static final class C22493e extends C22488a {

            /* renamed from: a */
            private final C22466rz f56758a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C22493e(C22466rz rzVar) {
                super((DefaultConstructorMarker) null);
                C24362h.m61211f(rzVar, "mrzInfo");
                this.f56758a = rzVar;
            }

            /* renamed from: b */
            public final C22466rz mo56620b() {
                return this.f56758a;
            }

            public boolean equals(Object obj) {
                if (this != obj) {
                    return (obj instanceof C22493e) && C24362h.m61206a(this.f56758a, ((C22493e) obj).f56758a);
                }
                return true;
            }

            public int hashCode() {
                C22466rz rzVar = this.f56758a;
                if (rzVar != null) {
                    return rzVar.hashCode();
                }
                return 0;
            }

            public String toString() {
                StringBuilder k = C13555b.m33972k("StoreMrzInfo(mrzInfo=");
                k.append(this.f56758a);
                k.append(")");
                return k.toString();
            }
        }

        private C22488a() {
            super((DefaultConstructorMarker) null);
        }

        public /* synthetic */ C22488a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0007\b\u0002¢\u0006\u0002\u0010\u0002\u0001\u0004\u0007\b\t\n¨\u0006\u000b"}, mo59060d2 = {"Lcom/veriff/sdk/views/nfc/ScanMrtdMvl$Output$ViewState;", "Lcom/veriff/sdk/views/nfc/ScanMrtdMvl$Output;", "()V", "Instructions", "Loading", "MrzReview", "Scanning", "Lcom/veriff/sdk/views/nfc/ScanMrtdMvl$Output$ViewState$Loading;", "Lcom/veriff/sdk/views/nfc/ScanMrtdMvl$Output$ViewState$Instructions;", "Lcom/veriff/sdk/views/nfc/ScanMrtdMvl$Output$ViewState$MrzReview;", "Lcom/veriff/sdk/views/nfc/ScanMrtdMvl$Output$ViewState$Scanning;", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.sc$b$b */
    public static abstract class C22494b extends sc$b {

        @Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, mo59060d2 = {"Lcom/veriff/sdk/views/nfc/ScanMrtdMvl$Output$ViewState$Instructions;", "Lcom/veriff/sdk/views/nfc/ScanMrtdMvl$Output$ViewState;", "()V", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
        /* renamed from: com.veriff.sdk.internal.sc$b$b$a */
        public static final class C22495a extends C22494b {

            /* renamed from: a */
            public static final C22495a f56759a = new C22495a();

            private C22495a() {
                super((DefaultConstructorMarker) null);
            }
        }

        @Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, mo59060d2 = {"Lcom/veriff/sdk/views/nfc/ScanMrtdMvl$Output$ViewState$Loading;", "Lcom/veriff/sdk/views/nfc/ScanMrtdMvl$Output$ViewState;", "()V", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
        /* renamed from: com.veriff.sdk.internal.sc$b$b$b */
        public static final class C22496b extends C22494b {

            /* renamed from: a */
            public static final C22496b f56760a = new C22496b();

            private C22496b() {
                super((DefaultConstructorMarker) null);
            }
        }

        @Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, mo59060d2 = {"Lcom/veriff/sdk/views/nfc/ScanMrtdMvl$Output$ViewState$MrzReview;", "Lcom/veriff/sdk/views/nfc/ScanMrtdMvl$Output$ViewState;", "mrz", "Lcom/veriff/sdk/views/nfc/PendingMrzInfo;", "skippable", "", "(Lcom/veriff/sdk/views/nfc/PendingMrzInfo;Z)V", "getMrz", "()Lcom/veriff/sdk/views/nfc/PendingMrzInfo;", "getSkippable", "()Z", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
        /* renamed from: com.veriff.sdk.internal.sc$b$b$c */
        public static final class C22497c extends C22494b {

            /* renamed from: a */
            private final C22466rz f56761a;

            /* renamed from: b */
            private final boolean f56762b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C22497c(C22466rz rzVar, boolean z) {
                super((DefaultConstructorMarker) null);
                C24362h.m61211f(rzVar, "mrz");
                this.f56761a = rzVar;
                this.f56762b = z;
            }

            /* renamed from: b */
            public final C22466rz mo56624b() {
                return this.f56761a;
            }

            /* renamed from: c */
            public final boolean mo56625c() {
                return this.f56762b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C22497c)) {
                    return false;
                }
                C22497c cVar = (C22497c) obj;
                return C24362h.m61206a(this.f56761a, cVar.f56761a) && this.f56762b == cVar.f56762b;
            }

            public int hashCode() {
                C22466rz rzVar = this.f56761a;
                int hashCode = (rzVar != null ? rzVar.hashCode() : 0) * 31;
                boolean z = this.f56762b;
                if (z) {
                    z = true;
                }
                return hashCode + (z ? 1 : 0);
            }

            public String toString() {
                StringBuilder k = C13555b.m33972k("MrzReview(mrz=");
                k.append(this.f56761a);
                k.append(", skippable=");
                return C25541a.m63885p(k, this.f56762b, ")");
            }
        }

        @Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, mo59060d2 = {"Lcom/veriff/sdk/views/nfc/ScanMrtdMvl$Output$ViewState$Scanning;", "Lcom/veriff/sdk/views/nfc/ScanMrtdMvl$Output$ViewState;", "mrz", "Lcom/veriff/sdk/internal/nfc/MrzInfo;", "(Lcom/veriff/sdk/internal/nfc/MrzInfo;)V", "getMrz", "()Lcom/veriff/sdk/internal/nfc/MrzInfo;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
        /* renamed from: com.veriff.sdk.internal.sc$b$b$d */
        public static final class C22498d extends C22494b {

            /* renamed from: a */
            private final C21960lf f56763a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C22498d(C21960lf lfVar) {
                super((DefaultConstructorMarker) null);
                C24362h.m61211f(lfVar, "mrz");
                this.f56763a = lfVar;
            }

            /* renamed from: b */
            public final C21960lf mo56629b() {
                return this.f56763a;
            }

            public boolean equals(Object obj) {
                if (this != obj) {
                    return (obj instanceof C22498d) && C24362h.m61206a(this.f56763a, ((C22498d) obj).f56763a);
                }
                return true;
            }

            public int hashCode() {
                C21960lf lfVar = this.f56763a;
                if (lfVar != null) {
                    return lfVar.hashCode();
                }
                return 0;
            }

            public String toString() {
                StringBuilder k = C13555b.m33972k("Scanning(mrz=");
                k.append(this.f56763a);
                k.append(")");
                return k.toString();
            }
        }

        private C22494b() {
            super((DefaultConstructorMarker) null);
        }

        public /* synthetic */ C22494b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private sc$b() {
    }

    public /* synthetic */ sc$b(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* renamed from: a */
    public boolean mo56611a() {
        return false;
    }
}
