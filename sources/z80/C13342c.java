package z80;

import ce0.C21100e;
import com.moovit.util.CurrencyAmount;
import com.moovit.view.p340cc.C7959a;

/* renamed from: z80.c */
public final class C13342c {

    /* renamed from: a */
    public final C7959a f33131a;

    /* renamed from: b */
    public final CurrencyAmount f33132b;

    /* renamed from: c */
    public final C7959a f33133c;

    /* renamed from: d */
    public final CurrencyAmount f33134d;

    public C13342c(C7959a aVar, CurrencyAmount currencyAmount, C7959a aVar2, CurrencyAmount currencyAmount2) {
        C21100e.m49373x(aVar, "primaryCreditCard");
        this.f33131a = aVar;
        C21100e.m49373x(currencyAmount, "primaryCreditCardCAmount");
        this.f33132b = currencyAmount;
        C21100e.m49373x(aVar2, "secondaryCreditCard");
        this.f33133c = aVar2;
        C21100e.m49373x(currencyAmount2, "secondaryCCAmount");
        this.f33134d = currencyAmount2;
    }
}
