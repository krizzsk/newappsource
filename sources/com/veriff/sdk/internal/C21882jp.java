package com.veriff.sdk.internal;

import kotlin.Metadata;

@Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B+\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0002\u0010\tR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001a¨\u0006\u001b"}, mo59060d2 = {"Lcom/veriff/sdk/internal/data/PhotoContext;", "", "photoContext", "", "videoContext", "Lmobi/lab/veriff/data/api/request/payload/VideoContext;", "useFaceDetection", "", "livenessCheck", "(Ljava/lang/String;ILjava/lang/String;Lmobi/lab/veriff/data/api/request/payload/VideoContext;ZZ)V", "firstPhotoContext", "getFirstPhotoContext", "()Ljava/lang/String;", "getLivenessCheck", "()Z", "secondPhotoContext", "getSecondPhotoContext", "getUseFaceDetection", "getVideoContext", "()Lmobi/lab/veriff/data/api/request/payload/VideoContext;", "FACE", "DOCUMENT_FRONT", "DOCUMENT_BACK", "DOCUMENT_BACK_BARCODE", "DOCUMENT_NFC", "DOCUMENT_AND_FACE", "ADDRESS", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.jp */
public enum C21882jp {
    FACE("face", C22549tg.FACE, true, false, 8, (boolean) null),
    DOCUMENT_FRONT("document-front", C22549tg.DOCUMENT_FRONT, false, false, 12, (boolean) null),
    DOCUMENT_BACK("document-back", C22549tg.DOCUMENT_BACK, false, false, 12, (boolean) null),
    DOCUMENT_BACK_BARCODE("document-back-barcode", C22549tg.DOCUMENT_BACK_BARCODE, false, false, 4, (boolean) null),
    DOCUMENT_NFC("document-nfc", r12, false, false, 4, (boolean) null),
    DOCUMENT_AND_FACE("document-and-face", C22549tg.DOCUMENT_AND_FACE, true, false, 8, (boolean) null),
    ADDRESS("address-front", r12, false, false, 12, (boolean) null);
    

    /* renamed from: i */
    private final String f55314i;

    /* renamed from: j */
    private final String f55315j;

    /* renamed from: k */
    private final C22549tg f55316k;

    /* renamed from: l */
    private final boolean f55317l;

    /* renamed from: m */
    private final boolean f55318m;

    private C21882jp(String str, C22549tg tgVar, boolean z, boolean z2) {
        this.f55316k = tgVar;
        this.f55317l = z;
        this.f55318m = z2;
        this.f55314i = C25541a.m63881k(str, "-pre");
        this.f55315j = str;
    }

    /* renamed from: a */
    public final String mo55595a() {
        return this.f55314i;
    }

    /* renamed from: b */
    public final String mo55596b() {
        return this.f55315j;
    }

    /* renamed from: c */
    public final C22549tg mo55597c() {
        return this.f55316k;
    }

    /* renamed from: d */
    public final boolean mo55598d() {
        return this.f55317l;
    }
}
