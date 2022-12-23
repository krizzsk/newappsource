package com.veriff.sdk.internal;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.veriff.sdk.internal.C21512ci;
import com.veriff.sdk.internal.C21529cn;
import java.io.IOException;

/* renamed from: com.veriff.sdk.internal.co */
class C21531co extends C21529cn {

    /* renamed from: a */
    private final Context f54187a;

    public C21531co(Context context) {
        this.f54187a = context;
    }

    /* renamed from: a */
    public boolean mo54408a(C21525cl clVar) {
        if (clVar.f54154e != 0) {
            return true;
        }
        return "android.resource".equals(clVar.f54153d.getScheme());
    }

    /* renamed from: a */
    public C21529cn.C21530a mo54407a(C21525cl clVar, int i) throws IOException {
        Resources a = C21537cs.m51495a(this.f54187a, clVar);
        return new C21529cn.C21530a(m51473a(a, C21537cs.m51492a(a, clVar), clVar), C21512ci.C21518d.DISK);
    }

    /* renamed from: a */
    private static Bitmap m51473a(Resources resources, int i, C21525cl clVar) {
        BitmapFactory.Options c = C21529cn.m51463c(clVar);
        if (C21529cn.m51462a(c)) {
            BitmapFactory.decodeResource(resources, i, c);
            C21529cn.m51461a(clVar.f54157h, clVar.f54158i, c, clVar);
        }
        return BitmapFactory.decodeResource(resources, i, c);
    }
}
