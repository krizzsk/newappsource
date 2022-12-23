package mobi.lab.veriff.util;

import com.veriff.sdk.internal.C21616ex;
import com.veriff.sdk.internal.C21789ix;
import com.veriff.sdk.internal.C22696xo;
import ie0.C23588c;
import ye0.C25292a;

/* renamed from: mobi.lab.veriff.util.o */
public final class C24471o implements C23588c<C24469n> {

    /* renamed from: a */
    private final C25292a<C22696xo> f61936a;

    /* renamed from: b */
    private final C25292a<C21616ex> f61937b;

    /* renamed from: c */
    private final C25292a<C21789ix> f61938c;

    public C24471o(C25292a<C22696xo> aVar, C25292a<C21616ex> aVar2, C25292a<C21789ix> aVar3) {
        this.f61936a = aVar;
        this.f61937b = aVar2;
        this.f61938c = aVar3;
    }

    /* renamed from: a */
    public C24469n get() {
        return m61571a(this.f61936a.get(), this.f61937b.get(), this.f61938c.get());
    }

    /* renamed from: a */
    public static C24471o m61572a(C25292a<C22696xo> aVar, C25292a<C21616ex> aVar2, C25292a<C21789ix> aVar3) {
        return new C24471o(aVar, aVar2, aVar3);
    }

    /* renamed from: a */
    public static C24469n m61571a(C22696xo xoVar, C21616ex exVar, C21789ix ixVar) {
        return new C24469n(xoVar, exVar, ixVar);
    }
}
