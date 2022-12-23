package com.veriff.sdk.internal;

import kotlin.Metadata;

@Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, mo59060d2 = {"Lmobi/lab/veriff/data/api/request/payload/VideoContext;", "", "serverName", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getServerName", "()Ljava/lang/String;", "GENERIC", "FACE", "DOCUMENT_FRONT", "DOCUMENT_BACK", "DOCUMENT_AND_FACE", "DOCUMENT_BACK_BARCODE", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.tg */
public enum C22549tg {
    GENERIC("selfid_video"),
    FACE("face-pre-video"),
    DOCUMENT_FRONT("document-front-pre-video"),
    DOCUMENT_BACK("document-back-pre-video"),
    DOCUMENT_AND_FACE("document-and-face-pre-video"),
    DOCUMENT_BACK_BARCODE("document-back-barcode-pre-video");
    

    /* renamed from: h */
    private final String f56903h;

    private C22549tg(String str) {
        this.f56903h = str;
    }

    /* renamed from: a */
    public final String mo56703a() {
        return this.f56903h;
    }
}
