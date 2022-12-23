package com.facebook;

import kotlin.Metadata;
import mf0.C24362h;
import p009a8.C0124u;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, mo59060d2 = {"Lcom/facebook/FacebookGraphResponseException;", "Lcom/facebook/FacebookException;", "La8/u;", "graphResponse", "La8/u;", "getGraphResponse", "()La8/u;", "facebook-core_release"}, mo59061k = 1, mo59062mv = {1, 5, 1})
public final class FacebookGraphResponseException extends FacebookException {
    private final C0124u graphResponse;

    public FacebookGraphResponseException(C0124u uVar, String str) {
        super(str);
        this.graphResponse = uVar;
    }

    public final String toString() {
        FacebookRequestError facebookRequestError;
        C0124u uVar = this.graphResponse;
        if (uVar == null) {
            facebookRequestError = null;
        } else {
            facebookRequestError = uVar.f366c;
        }
        StringBuilder k = C13555b.m33972k("{FacebookGraphResponseException: ");
        String message = getMessage();
        if (message != null) {
            k.append(message);
            k.append(" ");
        }
        if (facebookRequestError != null) {
            k.append("httpResponseCode: ");
            k.append(facebookRequestError.f8416b);
            k.append(", facebookErrorCode: ");
            k.append(facebookRequestError.f8417c);
            k.append(", facebookErrorType: ");
            k.append(facebookRequestError.f8419e);
            k.append(", message: ");
            k.append(facebookRequestError.mo11894b());
            k.append("}");
        }
        String sb = k.toString();
        C24362h.m61210e(sb, "errorStringBuilder.toString()");
        return sb;
    }
}
