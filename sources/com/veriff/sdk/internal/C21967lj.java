package com.veriff.sdk.internal;

import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\u000f\b\u0012\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0017\b\u0012\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007\u0001\u0005\b\t\n\u000b\f¨\u0006\r"}, mo59060d2 = {"Lcom/veriff/sdk/internal/nfc/NfcException;", "Ljava/io/IOException;", "message", "", "(Ljava/lang/String;)V", "cause", "", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "Lcom/veriff/sdk/internal/nfc/NfcChecksumMismatch;", "Lcom/veriff/sdk/internal/nfc/NfcTagNotMrtdDocument;", "Lcom/veriff/sdk/internal/nfc/NfcOperationFailed;", "Lcom/veriff/sdk/internal/nfc/NfcTagLostDuringAuth;", "Lcom/veriff/sdk/internal/nfc/NfcAuthFailed;", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.lj */
public abstract class C21967lj extends IOException {
    public /* synthetic */ C21967lj(String str, Throwable th, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, th);
    }

    public /* synthetic */ C21967lj(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    private C21967lj(String str) {
        super(str);
    }

    private C21967lj(String str, Throwable th) {
        super(str, th);
    }
}
