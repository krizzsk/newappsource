package com.veriff.sdk.internal;

import com.appboy.models.InAppMessageBase;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf0.C24362h;

@Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, mo59060d2 = {"Lcom/veriff/sdk/internal/nfc/NfcTagLostDuringAuth;", "Lcom/veriff/sdk/internal/nfc/NfcException;", "message", "", "cause", "", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.ll */
public final class C21969ll extends C21967lj {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21969ll(String str, Throwable th) {
        super(str, th, (DefaultConstructorMarker) null);
        C24362h.m61211f(str, InAppMessageBase.MESSAGE);
        C24362h.m61211f(th, "cause");
    }
}
