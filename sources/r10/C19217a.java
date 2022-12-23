package r10;

import android.content.res.Configuration;
import java.nio.ByteBuffer;
import p977zz.C20943i;

/* renamed from: r10.a */
public final class C19217a {

    /* renamed from: b */
    public static final C19217a f48815b = new C19217a();

    /* renamed from: a */
    public volatile byte[] f48816a = {1};

    /* renamed from: a */
    public final void mo51619a(Configuration configuration) {
        int i;
        byte b = 0;
        if (C20943i.m49051d(17)) {
            if (configuration.getLayoutDirection() == 1) {
                b = 1;
            }
            i = configuration.densityDpi;
        } else {
            i = 0;
        }
        this.f48816a = ByteBuffer.allocate(14).put((byte) 1).put(b).putFloat(configuration.fontScale).putInt(i).putInt(configuration.uiMode).array();
    }
}
