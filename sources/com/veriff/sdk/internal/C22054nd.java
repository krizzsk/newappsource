package com.veriff.sdk.internal;

import ff0.C23349c;
import gf0.C23413c;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import mf0.C24362h;
import mobi.lab.veriff.data.C24426d;
import mobi.lab.veriff.util.C24450d;
import mobi.lab.veriff.util.C24468m;
import p001a0.C0016g;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001(B\u0019\b\u0007\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b&\u0010'JC\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0002H@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u000b2\u0006\u0010\u0010\u001a\u00020\u000fH@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u000b2\u0006\u0010\u0010\u001a\u00020\u000fH@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0013J;\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00110\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\bH@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00110\u000b2\u0006\u0010\u0010\u001a\u00020\u000fH@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0013J/\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00110\u000b2\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018H@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0004¢\u0006\u0006\n\u0004\b \u0010!R\"\u0010$\u001a\u0010\u0012\u0004\u0012\u00020#\u0012\u0006\u0012\u0004\u0018\u00010\u00110\"8\u0002X\u0004¢\u0006\u0006\n\u0004\b$\u0010%\u0002\u0004\n\u0002\b\u0019¨\u0006)"}, mo59060d2 = {"Lcom/veriff/sdk/internal/upload/MediaUploader;", "", "", "verificationId", "Ljava/io/File;", "file", "Lmobi/lab/veriff/util/Encryption;", "encryption", "Lmobi/lab/veriff/data/api/request/payload/UploadData;", "data", "mimeType", "Lcom/veriff/sdk/internal/network/ApiResult;", "Lmobi/lab/veriff/data/api/request/response/EmptyResponse;", "performPOAUpload", "(Ljava/lang/String;Ljava/io/File;Lmobi/lab/veriff/util/Encryption;Lmobi/lab/veriff/data/api/request/payload/UploadData;Ljava/lang/String;Lff0/c;)Ljava/lang/Object;", "Lcom/veriff/sdk/internal/upload/Media;", "media", "Lmobi/lab/veriff/data/api/request/response/InflowResponse;", "performUpload", "(Lcom/veriff/sdk/internal/upload/Media;Lff0/c;)Ljava/lang/Object;", "performUploadV1", "performUploadV2", "(Ljava/lang/String;Ljava/io/File;Lmobi/lab/veriff/util/Encryption;Lmobi/lab/veriff/data/api/request/payload/UploadData;Lff0/c;)Ljava/lang/Object;", "upload", "", "", "retries", "(Lcom/veriff/sdk/internal/upload/Media;Ljava/util/List;Lff0/c;)Ljava/lang/Object;", "Lmobi/lab/veriff/network/VeriffApi$ApiService;", "apiService", "Lmobi/lab/veriff/network/VeriffApi$ApiService;", "Lmobi/lab/veriff/data/SessionArguments;", "sessionArguments", "Lmobi/lab/veriff/data/SessionArguments;", "", "Lcom/veriff/sdk/internal/upload/MediaUploader$FileRecord;", "uploadedFiles", "Ljava/util/Map;", "<init>", "(Lmobi/lab/veriff/network/VeriffApi$ApiService;Lmobi/lab/veriff/data/SessionArguments;)V", "FileRecord", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.nd */
public final class C22054nd {

    /* renamed from: a */
    private final Map<C22055a, C22561tq> f55627a = new LinkedHashMap();

    /* renamed from: b */
    private final xb$a f55628b;

    /* renamed from: c */
    private final C24426d f55629c;

    @Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, mo59060d2 = {"Lcom/veriff/sdk/internal/upload/MediaUploader$FileRecord;", "", "photoContext", "", "path", "(Ljava/lang/String;Ljava/lang/String;)V", "getPath", "()Ljava/lang/String;", "getPhotoContext", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.nd$a */
    public static final class C22055a {

        /* renamed from: a */
        private final String f55630a;

        /* renamed from: b */
        private final String f55631b;

        public C22055a(String str, String str2) {
            C24362h.m61211f(str, "photoContext");
            C24362h.m61211f(str2, "path");
            this.f55630a = str;
            this.f55631b = str2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C22055a)) {
                return false;
            }
            C22055a aVar = (C22055a) obj;
            return C24362h.m61206a(this.f55630a, aVar.f55630a) && C24362h.m61206a(this.f55631b, aVar.f55631b);
        }

        public int hashCode() {
            String str = this.f55630a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.f55631b;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder k = C13555b.m33972k("FileRecord(photoContext=");
            k.append(this.f55630a);
            k.append(", path=");
            return C0016g.m31o(k, this.f55631b, ")");
        }
    }

    @C23413c(mo58554c = "com.veriff.sdk.internal.upload.MediaUploader", mo58555f = "MediaUploader.kt", mo58556l = {108, 115, 120}, mo58557m = "performUpload")
    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H@"}, mo59060d2 = {"Lcom/veriff/sdk/internal/upload/Media;", "media", "Lff0/c;", "Lcom/veriff/sdk/internal/network/ApiResult;", "Lmobi/lab/veriff/data/api/request/response/InflowResponse;", "continuation", "", "performUpload"}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.nd$b */
    public static final class C22056b extends ContinuationImpl {

        /* renamed from: a */
        public /* synthetic */ Object f55632a;

        /* renamed from: b */
        public int f55633b;

        /* renamed from: c */
        public final /* synthetic */ C22054nd f55634c;

        /* renamed from: d */
        public Object f55635d;

        /* renamed from: e */
        public Object f55636e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22056b(C22054nd ndVar, C23349c cVar) {
            super(cVar);
            this.f55634c = ndVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f55632a = obj;
            this.f55633b |= Integer.MIN_VALUE;
            return this.f55634c.mo55928b((C22046na) null, this);
        }
    }

    @C23413c(mo58554c = "com.veriff.sdk.internal.upload.MediaUploader", mo58555f = "MediaUploader.kt", mo58556l = {56, 82, 86}, mo58557m = "upload")
    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005H@"}, mo59060d2 = {"Lcom/veriff/sdk/internal/upload/Media;", "media", "", "", "retries", "Lff0/c;", "Lcom/veriff/sdk/internal/network/ApiResult;", "Lmobi/lab/veriff/data/api/request/response/InflowResponse;", "continuation", "", "upload"}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.nd$c */
    public static final class C22057c extends ContinuationImpl {

        /* renamed from: a */
        public /* synthetic */ Object f55637a;

        /* renamed from: b */
        public int f55638b;

        /* renamed from: c */
        public final /* synthetic */ C22054nd f55639c;

        /* renamed from: d */
        public Object f55640d;

        /* renamed from: e */
        public Object f55641e;

        /* renamed from: f */
        public Object f55642f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22057c(C22054nd ndVar, C23349c cVar) {
            super(cVar);
            this.f55639c = ndVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f55637a = obj;
            this.f55638b |= Integer.MIN_VALUE;
            return this.f55639c.mo55925a((C22046na) null, (List<Long>) null, this);
        }
    }

    public C22054nd(xb$a xb_a, C24426d dVar) {
        C24362h.m61211f(xb_a, "apiService");
        C24362h.m61211f(dVar, "sessionArguments");
        this.f55628b = xb_a;
        this.f55629c = dVar;
    }

    /* renamed from: a */
    public final Object mo55924a(C22046na naVar, C23349c<? super C21924kn<C22561tq>> cVar) {
        List list;
        if (naVar.mo55892f()) {
            list = EmptyList.f60173b;
        } else {
            list = C22058ne.f55644b;
        }
        return mo55925a(naVar, list, cVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0140  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo55928b(com.veriff.sdk.internal.C22046na r11, ff0.C23349c<? super com.veriff.sdk.internal.C21924kn<com.veriff.sdk.internal.C22561tq>> r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof com.veriff.sdk.internal.C22054nd.C22056b
            if (r0 == 0) goto L_0x0013
            r0 = r12
            com.veriff.sdk.internal.nd$b r0 = (com.veriff.sdk.internal.C22054nd.C22056b) r0
            int r1 = r0.f55633b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f55633b = r1
            goto L_0x0018
        L_0x0013:
            com.veriff.sdk.internal.nd$b r0 = new com.veriff.sdk.internal.nd$b
            r0.<init>(r10, r12)
        L_0x0018:
            java.lang.Object r12 = r0.f55632a
            kotlin.coroutines.intrinsics.CoroutineSingletons r8 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r0.f55633b
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L_0x004c
            if (r1 == r4) goto L_0x003f
            if (r1 == r3) goto L_0x0032
            if (r1 != r2) goto L_0x002a
            goto L_0x0032
        L_0x002a:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x0032:
            java.lang.Object r11 = r0.f55636e
            com.veriff.sdk.internal.nd$a r11 = (com.veriff.sdk.internal.C22054nd.C22055a) r11
            java.lang.Object r0 = r0.f55635d
            com.veriff.sdk.internal.nd r0 = (com.veriff.sdk.internal.C22054nd) r0
            p584jl.C17885a.m44475z0(r12)
            goto L_0x013a
        L_0x003f:
            java.lang.Object r11 = r0.f55636e
            com.veriff.sdk.internal.nd$a r11 = (com.veriff.sdk.internal.C22054nd.C22055a) r11
            java.lang.Object r0 = r0.f55635d
            com.veriff.sdk.internal.nd r0 = (com.veriff.sdk.internal.C22054nd) r0
            p584jl.C17885a.m44475z0(r12)
            goto L_0x00e4
        L_0x004c:
            p584jl.C17885a.m44475z0(r12)
            com.veriff.sdk.internal.nd$a r12 = new com.veriff.sdk.internal.nd$a
            java.lang.String r1 = r11.mo55889d()
            java.io.File r5 = r11.mo55888c()
            java.lang.String r5 = r5.getAbsolutePath()
            java.lang.String r6 = "media.file.absolutePath"
            mf0.C24362h.m61210e(r5, r6)
            r12.<init>(r1, r5)
            java.util.Map<com.veriff.sdk.internal.nd$a, com.veriff.sdk.internal.tq> r1 = r10.f55627a
            java.lang.Object r1 = r1.get(r12)
            com.veriff.sdk.internal.tq r1 = (com.veriff.sdk.internal.C22561tq) r1
            if (r1 == 0) goto L_0x0092
            mobi.lab.veriff.util.j r12 = com.veriff.sdk.internal.C22058ne.f55643a
            java.lang.String r0 = "Upload context="
            java.lang.StringBuilder r0 = p379.C13555b.m33972k(r0)
            java.lang.String r11 = r11.mo55889d()
            r0.append(r11)
            java.lang.String r11 = " already uploaded once, returning from cache"
            r0.append(r11)
            java.lang.String r11 = r0.toString()
            r12.mo60705d(r11)
            com.veriff.sdk.internal.kn$c r11 = new com.veriff.sdk.internal.kn$c
            r11.<init>(r1)
            return r11
        L_0x0092:
            com.veriff.sdk.internal.te r1 = r11.mo55897j()
            if (r1 == 0) goto L_0x0129
            boolean r1 = r11.mo55898k()
            r2 = 0
            if (r1 == 0) goto L_0x00f3
            java.lang.String r1 = r11.mo55899l()
            if (r1 == 0) goto L_0x00eb
            java.lang.String r3 = r11.mo55887b()
            java.io.File r5 = r11.mo55888c()
            mobi.lab.veriff.data.d r1 = r10.f55629c
            mobi.lab.veriff.util.d r1 = r1.mo60603f()
            boolean r6 = r11.mo55890e()
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L_0x00c3
            r6 = r1
            goto L_0x00c4
        L_0x00c3:
            r6 = r2
        L_0x00c4:
            com.veriff.sdk.internal.te r7 = r11.mo55897j()
            java.lang.String r11 = r11.mo55899l()
            r0.f55635d = r10
            r0.f55636e = r12
            r0.f55633b = r4
            r1 = r10
            r2 = r3
            r3 = r5
            r4 = r6
            r5 = r7
            r6 = r11
            r7 = r0
            java.lang.Object r11 = r1.mo55927a(r2, r3, r4, r5, r6, r7)
            if (r11 != r8) goto L_0x00e0
            return r8
        L_0x00e0:
            r0 = r10
            r9 = r12
            r12 = r11
            r11 = r9
        L_0x00e4:
            com.veriff.sdk.internal.kn r12 = (com.veriff.sdk.internal.C21924kn) r12
            com.veriff.sdk.internal.kn r12 = com.veriff.sdk.internal.C22058ne.m53791b(r12)
            goto L_0x013c
        L_0x00eb:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "Mime type cannot be null for proof of address upload"
            r11.<init>(r12)
            throw r11
        L_0x00f3:
            java.lang.String r4 = r11.mo55887b()
            java.io.File r5 = r11.mo55888c()
            mobi.lab.veriff.data.d r1 = r10.f55629c
            mobi.lab.veriff.util.d r1 = r1.mo60603f()
            boolean r6 = r11.mo55890e()
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L_0x0111
            r6 = r1
            goto L_0x0112
        L_0x0111:
            r6 = r2
        L_0x0112:
            com.veriff.sdk.internal.te r11 = r11.mo55897j()
            r0.f55635d = r10
            r0.f55636e = r12
            r0.f55633b = r3
            r1 = r10
            r2 = r4
            r3 = r5
            r4 = r6
            r5 = r11
            r6 = r0
            java.lang.Object r11 = r1.mo55926a(r2, r3, r4, r5, r6)
            if (r11 != r8) goto L_0x0136
            return r8
        L_0x0129:
            r0.f55635d = r10
            r0.f55636e = r12
            r0.f55633b = r2
            java.lang.Object r11 = r10.mo55929c(r11, r0)
            if (r11 != r8) goto L_0x0136
            return r8
        L_0x0136:
            r0 = r10
            r9 = r12
            r12 = r11
            r11 = r9
        L_0x013a:
            com.veriff.sdk.internal.kn r12 = (com.veriff.sdk.internal.C21924kn) r12
        L_0x013c:
            boolean r1 = r12 instanceof com.veriff.sdk.internal.C21924kn.C21927c
            if (r1 == 0) goto L_0x014c
            java.util.Map<com.veriff.sdk.internal.nd$a, com.veriff.sdk.internal.tq> r0 = r0.f55627a
            r1 = r12
            com.veriff.sdk.internal.kn$c r1 = (com.veriff.sdk.internal.C21924kn.C21927c) r1
            java.lang.Object r1 = r1.mo55715a()
            r0.put(r11, r1)
        L_0x014c:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.veriff.sdk.internal.C22054nd.mo55928b(com.veriff.sdk.internal.na, ff0.c):java.lang.Object");
    }

    /* renamed from: c */
    public final /* synthetic */ Object mo55929c(C22046na naVar, C23349c<? super C21924kn<C22561tq>> cVar) {
        C22754yt ytVar;
        C22742yn b = C22742yn.m55640b("multipart/form-data");
        C22754yt a = C22754yt.m55735a(b, naVar.mo55889d());
        String h = naVar.mo55894h();
        if (h != null) {
            ytVar = C22754yt.m55735a(b, h);
        } else {
            ytVar = null;
        }
        C22754yt ytVar2 = ytVar;
        C22754yt a2 = C22754yt.m55735a(b, naVar.mo55896i());
        C24468m mVar = new C24468m(naVar.mo55888c(), this.f55629c.mo60603f(), "image/gif");
        xb$a xb_a = this.f55628b;
        String c = this.f55629c.mo60598c();
        C24362h.m61210e(a, "requestContext");
        return xb_a.mo57058a(c, a, naVar.mo55892f(), naVar.mo55893g(), ytVar2, a2, mVar, cVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x016c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x016d A[PHI: r14 
      PHI: (r14v2 java.lang.Object) = (r14v12 java.lang.Object), (r14v1 java.lang.Object) binds: [B:46:0x016a, B:11:0x0029] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo55925a(com.veriff.sdk.internal.C22046na r12, java.util.List<java.lang.Long> r13, ff0.C23349c<? super com.veriff.sdk.internal.C21924kn<com.veriff.sdk.internal.C22561tq>> r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof com.veriff.sdk.internal.C22054nd.C22057c
            if (r0 == 0) goto L_0x0013
            r0 = r14
            com.veriff.sdk.internal.nd$c r0 = (com.veriff.sdk.internal.C22054nd.C22057c) r0
            int r1 = r0.f55638b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f55638b = r1
            goto L_0x0018
        L_0x0013:
            com.veriff.sdk.internal.nd$c r0 = new com.veriff.sdk.internal.nd$c
            r0.<init>(r11, r14)
        L_0x0018:
            java.lang.Object r14 = r0.f55637a
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f55638b
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0059
            if (r2 == r5) goto L_0x0049
            if (r2 == r4) goto L_0x0036
            if (r2 != r3) goto L_0x002e
            p584jl.C17885a.m44475z0(r14)
            goto L_0x016d
        L_0x002e:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x0036:
            java.lang.Object r12 = r0.f55642f
            java.util.ArrayDeque r12 = (java.util.ArrayDeque) r12
            java.lang.Object r13 = r0.f55641e
            com.veriff.sdk.internal.na r13 = (com.veriff.sdk.internal.C22046na) r13
            java.lang.Object r2 = r0.f55640d
            com.veriff.sdk.internal.nd r2 = (com.veriff.sdk.internal.C22054nd) r2
            p584jl.C17885a.m44475z0(r14)
        L_0x0045:
            r14 = r12
            r12 = r13
            r13 = r2
            goto L_0x0082
        L_0x0049:
            java.lang.Object r12 = r0.f55642f
            java.util.ArrayDeque r12 = (java.util.ArrayDeque) r12
            java.lang.Object r13 = r0.f55641e
            com.veriff.sdk.internal.na r13 = (com.veriff.sdk.internal.C22046na) r13
            java.lang.Object r2 = r0.f55640d
            com.veriff.sdk.internal.nd r2 = (com.veriff.sdk.internal.C22054nd) r2
            p584jl.C17885a.m44475z0(r14)
            goto L_0x009d
        L_0x0059:
            p584jl.C17885a.m44475z0(r14)
            mobi.lab.veriff.util.j r14 = com.veriff.sdk.internal.C22058ne.f55643a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r6 = "Upload media="
            r2.append(r6)
            r2.append(r12)
            java.lang.String r6 = " retries="
            r2.append(r6)
            r2.append(r13)
            java.lang.String r2 = r2.toString()
            r14.mo60705d(r2)
            java.util.ArrayDeque r14 = new java.util.ArrayDeque
            r14.<init>(r13)
            r13 = r11
        L_0x0082:
            boolean r2 = r14.isEmpty()
            r2 = r2 ^ r5
            if (r2 == 0) goto L_0x015d
            r0.f55640d = r13
            r0.f55641e = r12
            r0.f55642f = r14
            r0.f55638b = r5
            java.lang.Object r2 = r13.mo55928b(r12, r0)
            if (r2 != r1) goto L_0x0098
            return r1
        L_0x0098:
            r10 = r13
            r13 = r12
            r12 = r14
            r14 = r2
            r2 = r10
        L_0x009d:
            com.veriff.sdk.internal.kn r14 = (com.veriff.sdk.internal.C21924kn) r14
            boolean r6 = r14 instanceof com.veriff.sdk.internal.C21924kn.C21927c
            java.lang.String r7 = "Upload context="
            if (r6 == 0) goto L_0x00cd
            mobi.lab.veriff.util.j r12 = com.veriff.sdk.internal.C22058ne.f55643a
            java.lang.StringBuilder r0 = p379.C13555b.m33972k(r7)
            java.lang.String r13 = r13.mo55889d()
            r0.append(r13)
            java.lang.String r13 = " success "
            r0.append(r13)
            r13 = r14
            com.veriff.sdk.internal.kn$c r13 = (com.veriff.sdk.internal.C21924kn.C21927c) r13
            java.lang.Object r13 = r13.mo55715a()
            com.veriff.sdk.internal.tq r13 = (com.veriff.sdk.internal.C22561tq) r13
            r0.append(r13)
            java.lang.String r13 = r0.toString()
            r12.mo60705d(r13)
            return r14
        L_0x00cd:
            boolean r6 = r14 instanceof com.veriff.sdk.internal.C21924kn.C21926b
            if (r6 == 0) goto L_0x0116
            mobi.lab.veriff.util.j r6 = com.veriff.sdk.internal.C22058ne.f55643a
            java.lang.StringBuilder r7 = p379.C13555b.m33972k(r7)
            java.lang.String r8 = r13.mo55889d()
            r7.append(r8)
            java.lang.String r8 = " failed with status code "
            r7.append(r8)
            r8 = r14
            com.veriff.sdk.internal.kn$b r8 = (com.veriff.sdk.internal.C21924kn.C21926b) r8
            int r9 = r8.mo55709a()
            r7.append(r9)
            java.lang.String r7 = r7.toString()
            r6.mo60705d(r7)
            com.veriff.sdk.internal.yk r6 = r8.mo55710b()
            java.lang.String r7 = "X-Veriff-No-Retry-Upload"
            java.util.List r6 = r6.mo57270b((java.lang.String) r7)
            java.lang.String r7 = "result.headers.values(\"X-Veriff-No-Retry-Upload\")"
            mf0.C24362h.m61210e(r6, r7)
            boolean r6 = r6.isEmpty()
            r6 = r6 ^ r5
            if (r6 == 0) goto L_0x010d
            return r14
        L_0x010d:
            int r6 = r8.mo55709a()
            r7 = 500(0x1f4, float:7.0E-43)
            if (r6 >= r7) goto L_0x0141
            return r14
        L_0x0116:
            boolean r6 = r14 instanceof com.veriff.sdk.internal.C21924kn.C21925a
            if (r6 == 0) goto L_0x013c
            mobi.lab.veriff.util.j r6 = com.veriff.sdk.internal.C22058ne.f55643a
            java.lang.StringBuilder r7 = p379.C13555b.m33972k(r7)
            java.lang.String r8 = r13.mo55889d()
            r7.append(r8)
            java.lang.String r8 = " failed with network error"
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            com.veriff.sdk.internal.kn$a r14 = (com.veriff.sdk.internal.C21924kn.C21925a) r14
            java.io.IOException r14 = r14.mo55705a()
            r6.mo60706d(r7, r14)
            goto L_0x0141
        L_0x013c:
            boolean r6 = r14 instanceof com.veriff.sdk.internal.C21924kn.C21928d
            if (r6 == 0) goto L_0x0141
            return r14
        L_0x0141:
            java.lang.Object r14 = r12.poll()
            mf0.C24362h.m61208c(r14)
            java.lang.Number r14 = (java.lang.Number) r14
            long r6 = r14.longValue()
            r0.f55640d = r2
            r0.f55641e = r13
            r0.f55642f = r12
            r0.f55638b = r4
            java.lang.Object r14 = p845um.C19958a.m47431e(r6, r0)
            if (r14 != r1) goto L_0x0045
            return r1
        L_0x015d:
            r14 = 0
            r0.f55640d = r14
            r0.f55641e = r14
            r0.f55642f = r14
            r0.f55638b = r3
            java.lang.Object r14 = r13.mo55928b(r12, r0)
            if (r14 != r1) goto L_0x016d
            return r1
        L_0x016d:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.veriff.sdk.internal.C22054nd.mo55925a(com.veriff.sdk.internal.na, java.util.List, ff0.c):java.lang.Object");
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo55926a(String str, File file, C24450d dVar, C22547te teVar, C23349c<? super C21924kn<C22561tq>> cVar) {
        return this.f55628b.mo57060a(str, teVar.mo56687a(), new C24468m(file, dVar, "application/octet-stream"), teVar.mo56689c(), cVar);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo55927a(String str, File file, C24450d dVar, C22547te teVar, String str2, C23349c<? super C21924kn<C22558tn>> cVar) {
        return this.f55628b.mo57057a(str, new C24468m(file, dVar, str2), teVar.mo56689c(), cVar);
    }
}
