package kotlin.reflect.jvm.internal;

import ag0.C20989e;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.KPropertyImpl;
import lf0.C24225a;
import xg0.C25258b;
import zf0.C25431b0;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001\"\u0004\b\u0000\u0010\u0000\"\u0006\b\u0001\u0010\u0000 \u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo59060d2 = {"V", "Lzf0/b0;", "kotlin.jvm.PlatformType", "invoke", "()Lzf0/b0;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 6, 0})
public final class KPropertyImpl$Setter$descriptor$2 extends Lambda implements C24225a<C25431b0> {
    public final /* synthetic */ KPropertyImpl.Setter<V> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KPropertyImpl$Setter$descriptor$2(KPropertyImpl.Setter<V> setter) {
        super(0);
        this.this$0 = setter;
    }

    public final Object invoke() {
        C25431b0 setter = this.this$0.mo59327h().mo59298d().getSetter();
        return setter == null ? C25258b.m63377c(this.this$0.mo59327h().mo59298d(), C20989e.C20990a.f52739a) : setter;
    }
}
