package com.veriff.sdk.internal;

import android.content.Context;
import com.veriff.sdk.internal.C21512ci;
import com.veriff.sdk.internal.C21529cn;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.veriff.sdk.internal.bv */
class C21489bv extends C21529cn {

    /* renamed from: a */
    public final Context f54055a;

    public C21489bv(Context context) {
        this.f54055a = context;
    }

    /* renamed from: a */
    public boolean mo54408a(C21525cl clVar) {
        return "content".equals(clVar.f54153d.getScheme());
    }

    /* renamed from: b */
    public InputStream mo54439b(C21525cl clVar) throws FileNotFoundException {
        return this.f54055a.getContentResolver().openInputStream(clVar.f54153d);
    }

    /* renamed from: a */
    public C21529cn.C21530a mo54407a(C21525cl clVar, int i) throws IOException {
        return new C21529cn.C21530a(abr.m50514a(mo54439b(clVar)), C21512ci.C21518d.DISK);
    }
}
