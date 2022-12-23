package com.facebook;

import kotlin.Metadata;
import mf0.C24362h;
import p001a0.C0016g;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, mo59060d2 = {"Lcom/facebook/FacebookServiceException;", "Lcom/facebook/FacebookException;", "Lcom/facebook/FacebookRequestError;", "requestError", "Lcom/facebook/FacebookRequestError;", "a", "()Lcom/facebook/FacebookRequestError;", "facebook-core_release"}, mo59061k = 1, mo59062mv = {1, 5, 1})
public final class FacebookServiceException extends FacebookException {
    private static final long serialVersionUID = 1;
    private final FacebookRequestError requestError;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FacebookServiceException(FacebookRequestError facebookRequestError, String str) {
        super(str);
        C24362h.m61211f(facebookRequestError, "requestError");
        this.requestError = facebookRequestError;
    }

    /* renamed from: a */
    public final FacebookRequestError mo11900a() {
        return this.requestError;
    }

    public final String toString() {
        StringBuilder t = C0016g.m36t("{FacebookServiceException: ", "httpResponseCode: ");
        t.append(this.requestError.f8416b);
        t.append(", facebookErrorCode: ");
        t.append(this.requestError.f8417c);
        t.append(", facebookErrorType: ");
        t.append(this.requestError.f8419e);
        t.append(", message: ");
        t.append(this.requestError.mo11894b());
        t.append("}");
        String sb = t.toString();
        C24362h.m61210e(sb, "StringBuilder()\n        .append(\"{FacebookServiceException: \")\n        .append(\"httpResponseCode: \")\n        .append(requestError.requestStatusCode)\n        .append(\", facebookErrorCode: \")\n        .append(requestError.errorCode)\n        .append(\", facebookErrorType: \")\n        .append(requestError.errorType)\n        .append(\", message: \")\n        .append(requestError.errorMessage)\n        .append(\"}\")\n        .toString()");
        return sb;
    }
}
