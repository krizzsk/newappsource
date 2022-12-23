package com.moovit.request;

import ce0.C21100e;
import com.moovit.commons.request.ServerException;
import p977zz.C20964s0;

public class UserRequestError extends ServerException {
    private final int errorCode;
    private final String longDescription;
    private final String shortDescription;

    public UserRequestError(int i, String str, String str2) {
        super(str);
        this.errorCode = i;
        C21100e.m49373x(str, "shortDescription");
        this.shortDescription = str;
        C21100e.m49373x(str2, "longDescription");
        this.longDescription = str2;
    }

    /* renamed from: a */
    public final String mo49159a() {
        if (C20964s0.m49090h(this.shortDescription)) {
            return this.longDescription;
        }
        if (C20964s0.m49090h(this.longDescription)) {
            return this.shortDescription;
        }
        return C20964s0.m49102t(" ", this.shortDescription, this.longDescription);
    }

    /* renamed from: b */
    public final int mo49160b() {
        return this.errorCode;
    }

    /* renamed from: c */
    public final String mo49161c() {
        return this.longDescription;
    }

    /* renamed from: d */
    public final String mo49162d() {
        return this.shortDescription;
    }
}
