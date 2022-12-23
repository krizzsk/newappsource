package mj0;

import java.io.File;
import p988j$.util.DesugarTimeZone;

/* renamed from: mj0.g */
public final class C24401g implements C24415u {

    /* renamed from: a */
    public final /* synthetic */ int f61761a;

    public /* synthetic */ C24401g(int i) {
        this.f61761a = i;
    }

    /* renamed from: a */
    public final Object mo60538a(String str) {
        switch (this.f61761a) {
            case 0:
                return Boolean.valueOf(str);
            case 1:
                return new File(str);
            default:
                return DesugarTimeZone.getTimeZone(str);
        }
    }
}
