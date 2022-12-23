package com.fyber.inneractive.sdk.player.exoplayer2.extractor;

import com.fyber.inneractive.sdk.player.exoplayer2.extractor.flv.C3082b;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.C3126a;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.C3130d;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3.C3137b;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3150d;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C3154f;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.C3166c;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.p049ts.C3181a;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.p049ts.C3183c;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.p049ts.C3185e;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.p049ts.C3201p;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.p049ts.C3207u;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.wav.C3215a;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C3403r;
import java.lang.reflect.Constructor;
import java.util.Collections;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.c */
public final class C3073c implements C3119i {

    /* renamed from: a */
    public static final Constructor<? extends C3080f> f10552a;

    static {
        Constructor<? extends U> constructor;
        try {
            constructor = Class.forName("com.fyber.inneractive.sdk.player.exoplayer2.ext.flac.FlacExtractor").asSubclass(C3080f.class).getConstructor(new Class[0]);
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            constructor = null;
        }
        f10552a = constructor;
    }

    /* renamed from: a */
    public synchronized C3080f[] mo14090a() {
        int i;
        C3080f[] fVarArr;
        Constructor<? extends C3080f> constructor = f10552a;
        if (constructor == null) {
            i = 11;
        } else {
            i = 12;
        }
        fVarArr = new C3080f[i];
        fVarArr[0] = new C3130d(new C3126a(), 0);
        fVarArr[1] = new C3150d(0, (C3403r) null);
        fVarArr[2] = new C3154f();
        fVarArr[3] = new C3137b(0, -9223372036854775807L);
        fVarArr[4] = new C3183c(0);
        fVarArr[5] = new C3181a(0);
        fVarArr[6] = new C3207u(1, new C3403r(0), new C3185e(0, Collections.emptyList()));
        fVarArr[7] = new C3082b();
        fVarArr[8] = new C3166c();
        fVarArr[9] = new C3201p(new C3403r(0));
        fVarArr[10] = new C3215a();
        if (constructor != null) {
            try {
                fVarArr[11] = (C3080f) constructor.newInstance(new Object[0]);
            } catch (Exception e) {
                throw new IllegalStateException("Unexpected error creating FLAC extractor", e);
            }
        }
        return fVarArr;
    }
}
