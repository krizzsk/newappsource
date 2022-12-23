package mobi.lab.veriff.util;

import com.veriff.sdk.internal.C21645fu;
import com.veriff.sdk.internal.C21899jy;
import ie0.C23588c;
import ye0.C25292a;

/* renamed from: mobi.lab.veriff.util.i */
public final class C24464i implements C23588c<C24457h> {

    /* renamed from: a */
    private final C25292a<C21899jy> f61924a;

    /* renamed from: b */
    private final C25292a<C21645fu> f61925b;

    public C24464i(C25292a<C21899jy> aVar, C25292a<C21645fu> aVar2) {
        this.f61924a = aVar;
        this.f61925b = aVar2;
    }

    /* renamed from: a */
    public C24457h get() {
        return m61533a(this.f61924a.get(), this.f61925b.get());
    }

    /* renamed from: a */
    public static C24464i m61534a(C25292a<C21899jy> aVar, C25292a<C21645fu> aVar2) {
        return new C24464i(aVar, aVar2);
    }

    /* renamed from: a */
    public static C24457h m61533a(C21899jy jyVar, C21645fu fuVar) {
        return new C24457h(jyVar, fuVar);
    }
}
