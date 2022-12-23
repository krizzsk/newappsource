package com.veriff.sdk.internal;

import kotlin.Metadata;
import mf0.C24362h;

@Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, mo59060d2 = {"Lcom/veriff/util/SdkConfigException;", "Ljava/lang/IllegalStateException;", "msg", "", "(Ljava/lang/String;)V", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.sn */
public final class C22527sn extends IllegalStateException {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22527sn(String str) {
        super("This is an SDK config error!!, this should never happen in real valid flow \n\n " + str);
        C24362h.m61211f(str, "msg");
    }
}
