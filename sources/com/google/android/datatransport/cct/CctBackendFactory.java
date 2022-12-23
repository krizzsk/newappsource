package com.google.android.datatransport.cct;

import androidx.annotation.Keep;
import p250s9.C6490c;
import p288v9.C6876c;
import p288v9.C6879f;
import p288v9.C6885k;

@Keep
public class CctBackendFactory implements C6876c {
    public C6885k create(C6879f fVar) {
        return new C6490c(fVar.mo23130a(), fVar.mo23133d(), fVar.mo23132c());
    }
}
