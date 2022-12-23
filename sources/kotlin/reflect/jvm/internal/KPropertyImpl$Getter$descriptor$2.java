package kotlin.reflect.jvm.internal;

import ag0.C20989e;
import cg0.C21167e0;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.KPropertyImpl;
import lf0.C24225a;
import xg0.C25258b;
import zf0.C25429a0;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001\"\u0006\b\u0000\u0010\u0000 \u0001\"\u0006\b\u0001\u0010\u0000 \u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo59060d2 = {"V", "Lzf0/a0;", "kotlin.jvm.PlatformType", "invoke", "()Lzf0/a0;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 6, 0})
public final class KPropertyImpl$Getter$descriptor$2 extends Lambda implements C24225a<C25429a0> {
    public final /* synthetic */ KPropertyImpl.Getter<V> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KPropertyImpl$Getter$descriptor$2(KPropertyImpl.Getter<? extends V> getter) {
        super(0);
        this.this$0 = getter;
    }

    public final Object invoke() {
        C21167e0 getter = this.this$0.mo59327h().mo59298d().getGetter();
        return getter == null ? C25258b.m63376b(this.this$0.mo59327h().mo59298d(), C20989e.C20990a.f52739a) : getter;
    }
}
