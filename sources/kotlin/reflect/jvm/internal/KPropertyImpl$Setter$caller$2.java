package kotlin.reflect.jvm.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.KPropertyImpl;
import lf0.C24225a;
import mf0.C24361g;
import uf0.C25032b;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u0012\u0012\u0002\b\u0003 \u0002*\b\u0012\u0002\b\u0003\u0018\u00010\u00010\u0001\"\u0004\b\u0000\u0010\u0000\"\u0006\b\u0001\u0010\u0000 \u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo59060d2 = {"V", "Luf0/b;", "kotlin.jvm.PlatformType", "invoke", "()Luf0/b;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 6, 0})
public final class KPropertyImpl$Setter$caller$2 extends Lambda implements C24225a<C25032b<?>> {
    public final /* synthetic */ KPropertyImpl.Setter<V> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KPropertyImpl$Setter$caller$2(KPropertyImpl.Setter<V> setter) {
        super(0);
        this.this$0 = setter;
    }

    public final Object invoke() {
        return C24361g.m61166i(this.this$0, false);
    }
}
