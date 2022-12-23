package mj0;

import java.math.BigDecimal;

/* renamed from: mj0.e */
public final class C24399e implements C24415u {

    /* renamed from: a */
    public final /* synthetic */ int f61759a;

    public /* synthetic */ C24399e(int i) {
        this.f61759a = i;
    }

    /* renamed from: a */
    public final Object mo60538a(String str) {
        switch (this.f61759a) {
            case 0:
                return new BigDecimal(str);
            default:
                return Double.valueOf(str);
        }
    }
}
