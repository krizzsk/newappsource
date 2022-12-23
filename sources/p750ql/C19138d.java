package p750ql;

import android.content.res.Resources;
import ce0.C21100e;
import com.moovit.util.CurrencyAmount;
import java.util.ArrayList;
import java.util.Date;
import p019b0.C1426c;

/* renamed from: ql.d */
public final class C19138d {

    /* renamed from: a */
    public final Object f48656a;

    /* renamed from: b */
    public final Object f48657b;

    /* renamed from: c */
    public final Object f48658c;

    public /* synthetic */ C19138d(Object obj, Object obj2, Object obj3) {
        this.f48656a = obj;
        this.f48658c = obj3;
        this.f48657b = obj2;
    }

    public /* synthetic */ C19138d(ArrayList arrayList, Date date, Resources resources) {
        this.f48656a = arrayList;
        this.f48657b = date;
        this.f48658c = resources;
    }

    public /* synthetic */ C19138d(String str, CurrencyAmount currencyAmount, C1426c cVar) {
        C21100e.m49373x(str, "cartContextId");
        this.f48656a = str;
        this.f48657b = currencyAmount;
        this.f48658c = cVar;
    }
}
