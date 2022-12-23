package kotlin;

import com.appboy.models.InAppMessageBase;
import mf0.C24362h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, mo59060d2 = {"Lkotlin/NotImplementedError;", "Ljava/lang/Error;", "Lkotlin/Error;", "kotlin-stdlib"}, mo59061k = 1, mo59062mv = {1, 7, 1})
public final class NotImplementedError extends Error {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NotImplementedError(String str) {
        super(str);
        C24362h.m61211f(str, InAppMessageBase.MESSAGE);
    }
}
