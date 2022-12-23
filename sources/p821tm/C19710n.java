package p821tm;

import java.math.BigDecimal;
import java.util.Collections;
import p702ok.C18777c;
import p772rl.C19287b;

/* renamed from: tm.n */
public final class C19710n {

    /* renamed from: a */
    public final C19287b f50055a;

    public C19710n(C19287b bVar) {
        this.f50055a = bVar;
    }

    /* renamed from: a */
    public final C18777c mo52060a(Integer num) {
        C18777c cVar = (C18777c) this.f50055a.mo51698a(num).f33365a;
        if (cVar != null) {
            return cVar;
        }
        Boolean bool = Boolean.TRUE;
        return new C18777c(num, "", "", "", "", "", (BigDecimal) null, (BigDecimal) null, bool.equals((Object) null), bool.equals((Object) null), Collections.emptyMap());
    }
}
