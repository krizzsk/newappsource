package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.appboy.support.AppboyFileUtils;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C3380a;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C3406u;
import java.io.IOException;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.upstream.m */
public final class C3360m implements C3353g {

    /* renamed from: a */
    public final C3353g f12026a;

    /* renamed from: b */
    public final C3353g f12027b;

    /* renamed from: c */
    public final C3353g f12028c;

    /* renamed from: d */
    public final C3353g f12029d;

    /* renamed from: e */
    public C3353g f12030e;

    public C3360m(Context context, C3327a0<? super C3353g> a0Var, C3353g gVar) {
        this.f12026a = (C3353g) C3380a.m8503a(gVar);
        this.f12027b = new C3364q(a0Var);
        this.f12028c = new C3329c(context, a0Var);
        this.f12029d = new C3349e(context, a0Var);
    }

    /* renamed from: a */
    public long mo13780a(C3357j jVar) throws IOException {
        boolean z = true;
        C3380a.m8507b(this.f12030e == null);
        String scheme = jVar.f12004a.getScheme();
        Uri uri = jVar.f12004a;
        int i = C3406u.f12148a;
        String scheme2 = uri.getScheme();
        if (!TextUtils.isEmpty(scheme2) && !scheme2.equals(AppboyFileUtils.FILE_SCHEME)) {
            z = false;
        }
        if (z) {
            if (jVar.f12004a.getPath().startsWith("/android_asset/")) {
                this.f12030e = this.f12028c;
            } else {
                this.f12030e = this.f12027b;
            }
        } else if ("asset".equals(scheme)) {
            this.f12030e = this.f12028c;
        } else if ("content".equals(scheme)) {
            this.f12030e = this.f12029d;
        } else {
            this.f12030e = this.f12026a;
        }
        return this.f12030e.mo13780a(jVar);
    }

    public void close() throws IOException {
        C3353g gVar = this.f12030e;
        if (gVar != null) {
            try {
                gVar.close();
            } finally {
                this.f12030e = null;
            }
        }
    }

    /* renamed from: a */
    public int mo13779a(byte[] bArr, int i, int i2) throws IOException {
        return this.f12030e.mo13779a(bArr, i, i2);
    }

    /* renamed from: a */
    public Uri mo13781a() {
        C3353g gVar = this.f12030e;
        if (gVar == null) {
            return null;
        }
        return gVar.mo13781a();
    }
}
