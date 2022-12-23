package p443dm;

import ce0.C21100e;
import com.moovit.util.CurrencyAmount;
import com.moovit.view.p340cc.C7959a;

/* renamed from: dm.f */
public final class C16681f {

    /* renamed from: a */
    public final Object f43450a;

    /* renamed from: b */
    public final Object f43451b;

    /* renamed from: c */
    public final Object f43452c;

    /* renamed from: d */
    public final Object f43453d;

    public /* synthetic */ C16681f(Object obj, Object obj2, Object obj3, Object obj4) {
        this.f43450a = obj;
        this.f43451b = obj2;
        this.f43452c = obj3;
        this.f43453d = obj4;
    }

    public /* synthetic */ C16681f(C7959a aVar, CurrencyAmount currencyAmount, C7959a aVar2, CurrencyAmount currencyAmount2) {
        C21100e.m49373x(aVar, "primaryCreditCard");
        this.f43450a = aVar;
        C21100e.m49373x(currencyAmount, "primaryCCAmount");
        this.f43451b = currencyAmount;
        C21100e.m49373x(aVar2, "secondaryCreditCard");
        this.f43452c = aVar2;
        C21100e.m49373x(currencyAmount2, "secondaryCCAmount");
        this.f43453d = currencyAmount2;
    }
}
