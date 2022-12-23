package com.masabi.justride.sdk.p415ui.features.universalticket.main.exceptions;

import com.appboy.models.InAppMessageBase;
import kotlin.Metadata;
import mf0.C24362h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, mo59060d2 = {"Lcom/masabi/justride/sdk/ui/features/universalticket/main/exceptions/UnknownLayoutPresetException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "Android_release"}, mo59061k = 1, mo59062mv = {1, 4, 1})
/* renamed from: com.masabi.justride.sdk.ui.features.universalticket.main.exceptions.UnknownLayoutPresetException */
public final class UnknownLayoutPresetException extends Exception {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UnknownLayoutPresetException(String str) {
        super(str);
        C24362h.m61211f(str, InAppMessageBase.MESSAGE);
    }
}
