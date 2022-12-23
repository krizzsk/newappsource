package com.zendesk.service;

import com.appboy.support.StringUtils;
import fe0.C23341a;
import p019b0.C1425b;

public class ZendeskException extends Exception {
    private final C23341a errorResponse;

    public ZendeskException() {
        super("Error retrieving Zendesk sdk providers instance.");
        this.errorResponse = new C1425b(getMessage());
    }

    public final String toString() {
        String str;
        C23341a aVar = this.errorResponse;
        String str2 = StringUtils.NULL_USER_ID_SUBSTITUTE_STRING;
        if (aVar == null) {
            str = str2;
        } else {
            str = aVar.mo2080b();
        }
        Object[] objArr = new Object[3];
        objArr[0] = super.toString();
        objArr[1] = str;
        Throwable cause = getCause();
        if (cause != null) {
            str2 = cause.toString();
        }
        objArr[2] = str2;
        return String.format("ZendeskException{details=%s,errorResponse=%s,cause=%s}", objArr);
    }

    public ZendeskException(C23341a aVar) {
        super(aVar.mo2080b());
        this.errorResponse = aVar;
    }
}
