package com.google.android.gms.internal.p985authapi;

import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.auth.api.credentials.CredentialRequestResult;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.internal.auth-api.zbe */
public final class zbe implements CredentialRequestResult {
    private final Status zba;
    private final Credential zbb;

    public zbe(Status status, Credential credential) {
        this.zba = status;
        this.zbb = credential;
    }

    public final Credential getCredential() {
        return this.zbb;
    }

    public final Status getStatus() {
        return this.zba;
    }
}
