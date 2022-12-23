package com.veriff.sdk.internal;

import androidx.recyclerview.widget.RecyclerView;
import com.appboy.support.AppboyFileUtils;
import com.appsflyer.ServerParameters;
import com.usebutton.sdk.internal.api.AppActionRequest;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf0.C24362h;
import p001a0.C0016g;

@Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\b\u0018\u00002\u00020\u0001B7\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fBk\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\b\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0012J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\bHÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\bHÆ\u0003J\t\u0010'\u001a\u00020\bHÆ\u0003J\t\u0010(\u001a\u00020\bHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u000bHÆ\u0003J}\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\b2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010-\u001a\u00020\b2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010/\u001a\u000200HÖ\u0001J\t\u00101\u001a\u00020\u0003HÖ\u0001J\u0006\u00102\u001a\u000203J\u000e\u00104\u001a\u0002052\u0006\u00106\u001a\u000207R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\r\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017R\u0011\u0010\u0010\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0017R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0014R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0014R\u0011\u0010\u000e\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0017R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0014¨\u00068"}, mo59060d2 = {"Lcom/veriff/sdk/internal/upload/Media;", "", "verificationId", "", "file", "Ljava/io/File;", "context", "encrypted", "", "language", "metadata", "Lmobi/lab/veriff/data/api/request/payload/UploadData;", "(Ljava/lang/String;Ljava/io/File;Ljava/lang/String;ZLjava/lang/String;Lmobi/lab/veriff/data/api/request/payload/UploadData;)V", "inflow", "mrz", "documentType", "isPoa", "mimeType", "(Ljava/lang/String;Ljava/io/File;Ljava/lang/String;ZZZLjava/lang/String;Ljava/lang/String;Lmobi/lab/veriff/data/api/request/payload/UploadData;ZLjava/lang/String;)V", "getContext", "()Ljava/lang/String;", "getDocumentType", "getEncrypted", "()Z", "getFile", "()Ljava/io/File;", "getInflow", "getLanguage", "getMetadata", "()Lmobi/lab/veriff/data/api/request/payload/UploadData;", "getMimeType", "getMrz", "getVerificationId", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "toUploadKey", "Lcom/veriff/sdk/internal/upload/UploadKey;", "withStatus", "Lcom/veriff/sdk/internal/upload/MediaWithStatus;", "status", "Lcom/veriff/sdk/internal/upload/MediaUploadStatus;", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.na */
public final class C22046na {

    /* renamed from: a */
    private final String f55609a;

    /* renamed from: b */
    private final File f55610b;

    /* renamed from: c */
    private final String f55611c;

    /* renamed from: d */
    private final boolean f55612d;

    /* renamed from: e */
    private final boolean f55613e;

    /* renamed from: f */
    private final boolean f55614f;

    /* renamed from: g */
    private final String f55615g;

    /* renamed from: h */
    private final String f55616h;

    /* renamed from: i */
    private final C22547te f55617i;

    /* renamed from: j */
    private final boolean f55618j;

    /* renamed from: k */
    private final String f55619k;

    public C22046na(String str, File file, String str2, boolean z, boolean z2, boolean z3, String str3, String str4) {
        this(str, file, str2, z, z2, z3, str3, str4, (C22547te) null, false, (String) null, 1792, (DefaultConstructorMarker) null);
    }

    public C22046na(String str, File file, String str2, boolean z, boolean z2, boolean z3, String str3, String str4, C22547te teVar, boolean z4, String str5) {
        C24362h.m61211f(str, "verificationId");
        C24362h.m61211f(file, AppboyFileUtils.FILE_SCHEME);
        C24362h.m61211f(str2, AppActionRequest.KEY_CONTEXT);
        C24362h.m61211f(str4, "language");
        this.f55609a = str;
        this.f55610b = file;
        this.f55611c = str2;
        this.f55612d = z;
        this.f55613e = z2;
        this.f55614f = z3;
        this.f55615g = str3;
        this.f55616h = str4;
        this.f55617i = teVar;
        this.f55618j = z4;
        this.f55619k = str5;
    }

    /* renamed from: a */
    public static /* synthetic */ C22046na m53752a(C22046na naVar, String str, File file, String str2, boolean z, boolean z2, boolean z3, String str3, String str4, C22547te teVar, boolean z4, String str5, int i, Object obj) {
        C22046na naVar2 = naVar;
        int i2 = i;
        return naVar.mo55884a((i2 & 1) != 0 ? naVar2.f55609a : str, (i2 & 2) != 0 ? naVar2.f55610b : file, (i2 & 4) != 0 ? naVar2.f55611c : str2, (i2 & 8) != 0 ? naVar2.f55612d : z, (i2 & 16) != 0 ? naVar2.f55613e : z2, (i2 & 32) != 0 ? naVar2.f55614f : z3, (i2 & 64) != 0 ? naVar2.f55615g : str3, (i2 & RecyclerView.C1119a0.FLAG_IGNORE) != 0 ? naVar2.f55616h : str4, (i2 & 256) != 0 ? naVar2.f55617i : teVar, (i2 & 512) != 0 ? naVar2.f55618j : z4, (i2 & 1024) != 0 ? naVar2.f55619k : str5);
    }

    /* renamed from: a */
    public final C22046na mo55884a(String str, File file, String str2, boolean z, boolean z2, boolean z3, String str3, String str4, C22547te teVar, boolean z4, String str5) {
        C24362h.m61211f(str, "verificationId");
        C24362h.m61211f(file, AppboyFileUtils.FILE_SCHEME);
        String str6 = str2;
        C24362h.m61211f(str6, AppActionRequest.KEY_CONTEXT);
        String str7 = str4;
        C24362h.m61211f(str7, "language");
        return new C22046na(str, file, str6, z, z2, z3, str3, str7, teVar, z4, str5);
    }

    /* renamed from: a */
    public final C22063nj mo55886a() {
        String str = this.f55609a;
        String absolutePath = this.f55610b.getAbsolutePath();
        C24362h.m61210e(absolutePath, "file.absolutePath");
        return new C22063nj(str, absolutePath, this.f55611c, this.f55617i);
    }

    /* renamed from: b */
    public final String mo55887b() {
        return this.f55609a;
    }

    /* renamed from: c */
    public final File mo55888c() {
        return this.f55610b;
    }

    /* renamed from: d */
    public final String mo55889d() {
        return this.f55611c;
    }

    /* renamed from: e */
    public final boolean mo55890e() {
        return this.f55612d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C22046na)) {
            return false;
        }
        C22046na naVar = (C22046na) obj;
        return C24362h.m61206a(this.f55609a, naVar.f55609a) && C24362h.m61206a(this.f55610b, naVar.f55610b) && C24362h.m61206a(this.f55611c, naVar.f55611c) && this.f55612d == naVar.f55612d && this.f55613e == naVar.f55613e && this.f55614f == naVar.f55614f && C24362h.m61206a(this.f55615g, naVar.f55615g) && C24362h.m61206a(this.f55616h, naVar.f55616h) && C24362h.m61206a(this.f55617i, naVar.f55617i) && this.f55618j == naVar.f55618j && C24362h.m61206a(this.f55619k, naVar.f55619k);
    }

    /* renamed from: f */
    public final boolean mo55892f() {
        return this.f55613e;
    }

    /* renamed from: g */
    public final boolean mo55893g() {
        return this.f55614f;
    }

    /* renamed from: h */
    public final String mo55894h() {
        return this.f55615g;
    }

    public int hashCode() {
        String str = this.f55609a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        File file = this.f55610b;
        int hashCode2 = (hashCode + (file != null ? file.hashCode() : 0)) * 31;
        String str2 = this.f55611c;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        boolean z = this.f55612d;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i2 = (hashCode3 + (z ? 1 : 0)) * 31;
        boolean z3 = this.f55613e;
        if (z3) {
            z3 = true;
        }
        int i3 = (i2 + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.f55614f;
        if (z4) {
            z4 = true;
        }
        int i4 = (i3 + (z4 ? 1 : 0)) * 31;
        String str3 = this.f55615g;
        int hashCode4 = (i4 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f55616h;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        C22547te teVar = this.f55617i;
        int hashCode6 = (hashCode5 + (teVar != null ? teVar.hashCode() : 0)) * 31;
        boolean z5 = this.f55618j;
        if (!z5) {
            z2 = z5;
        }
        int i5 = (hashCode6 + (z2 ? 1 : 0)) * 31;
        String str5 = this.f55619k;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return i5 + i;
    }

    /* renamed from: i */
    public final String mo55896i() {
        return this.f55616h;
    }

    /* renamed from: j */
    public final C22547te mo55897j() {
        return this.f55617i;
    }

    /* renamed from: k */
    public final boolean mo55898k() {
        return this.f55618j;
    }

    /* renamed from: l */
    public final String mo55899l() {
        return this.f55619k;
    }

    public String toString() {
        StringBuilder k = C13555b.m33972k("Media(verificationId=");
        k.append(this.f55609a);
        k.append(", file=");
        k.append(this.f55610b);
        k.append(", context=");
        k.append(this.f55611c);
        k.append(", encrypted=");
        k.append(this.f55612d);
        k.append(", inflow=");
        k.append(this.f55613e);
        k.append(", mrz=");
        k.append(this.f55614f);
        k.append(", documentType=");
        k.append(this.f55615g);
        k.append(", language=");
        k.append(this.f55616h);
        k.append(", metadata=");
        k.append(this.f55617i);
        k.append(", isPoa=");
        k.append(this.f55618j);
        k.append(", mimeType=");
        return C0016g.m31o(k, this.f55619k, ")");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C22046na(java.lang.String r16, java.io.File r17, java.lang.String r18, boolean r19, boolean r20, boolean r21, java.lang.String r22, java.lang.String r23, com.veriff.sdk.internal.C22547te r24, boolean r25, java.lang.String r26, int r27, kotlin.jvm.internal.DefaultConstructorMarker r28) {
        /*
            r15 = this;
            r0 = r27
            r1 = r0 & 256(0x100, float:3.59E-43)
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r12 = r2
            goto L_0x000b
        L_0x0009:
            r12 = r24
        L_0x000b:
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x0012
            r1 = 0
            r13 = 0
            goto L_0x0014
        L_0x0012:
            r13 = r25
        L_0x0014:
            r0 = r0 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x001a
            r14 = r2
            goto L_0x001c
        L_0x001a:
            r14 = r26
        L_0x001c:
            r3 = r15
            r4 = r16
            r5 = r17
            r6 = r18
            r7 = r19
            r8 = r20
            r9 = r21
            r10 = r22
            r11 = r23
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.veriff.sdk.internal.C22046na.<init>(java.lang.String, java.io.File, java.lang.String, boolean, boolean, boolean, java.lang.String, java.lang.String, com.veriff.sdk.internal.te, boolean, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* renamed from: a */
    public final C22060ng mo55885a(C22048nc ncVar) {
        C24362h.m61211f(ncVar, ServerParameters.STATUS);
        return new C22060ng(this, ncVar);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C22046na(java.lang.String r16, java.io.File r17, java.lang.String r18, boolean r19, java.lang.String r20, com.veriff.sdk.internal.C22547te r21) {
        /*
            r15 = this;
            java.lang.String r0 = "verificationId"
            r2 = r16
            mf0.C24362h.m61211f(r2, r0)
            java.lang.String r0 = "file"
            r3 = r17
            mf0.C24362h.m61211f(r3, r0)
            java.lang.String r0 = "context"
            r4 = r18
            mf0.C24362h.m61211f(r4, r0)
            java.lang.String r0 = "language"
            r9 = r20
            mf0.C24362h.m61211f(r9, r0)
            java.lang.String r0 = "metadata"
            r10 = r21
            mf0.C24362h.m61211f(r10, r0)
            r6 = 0
            r7 = 0
            r8 = 0
            r11 = 0
            r12 = 0
            r13 = 1536(0x600, float:2.152E-42)
            r14 = 0
            r1 = r15
            r5 = r19
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.veriff.sdk.internal.C22046na.<init>(java.lang.String, java.io.File, java.lang.String, boolean, java.lang.String, com.veriff.sdk.internal.te):void");
    }
}
