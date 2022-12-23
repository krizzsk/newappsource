package mj0;

import java.util.Currency;

/* renamed from: mj0.l */
public final class C24406l implements C24415u {

    /* renamed from: a */
    public final /* synthetic */ int f61766a;

    public /* synthetic */ C24406l(int i) {
        this.f61766a = i;
    }

    /* renamed from: a */
    public final Object mo60538a(String str) {
        switch (this.f61766a) {
            case 0:
                return Currency.getInstance(str);
            default:
                return Long.valueOf(str);
        }
    }
}
