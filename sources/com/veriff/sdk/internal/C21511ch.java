package com.veriff.sdk.internal;

import android.content.Context;
import com.veriff.sdk.internal.C22713xw;
import com.veriff.sdk.internal.C22746yp;
import java.io.File;
import java.io.IOException;

/* renamed from: com.veriff.sdk.internal.ch */
public final class C21511ch implements C21496by {

    /* renamed from: a */
    public final C22713xw.C22714a f54108a;

    public C21511ch(Context context) {
        this(C21537cs.m51496a(context));
    }

    /* renamed from: a */
    public C22757yu mo54466a(C22752ys ysVar) throws IOException {
        return this.f54108a.mo57191a(ysVar).mo57188b();
    }

    public C21511ch(File file) {
        this(file, C21537cs.m51494a(file));
    }

    public C21511ch(File file, long j) {
        this(new C22746yp.C22748a().mo57375a(new C22704xu(file, j)).mo57378a());
    }

    public C21511ch(C22746yp ypVar) {
        this.f54108a = ypVar;
        ypVar.mo57349i();
    }
}
