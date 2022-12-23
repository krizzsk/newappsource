package kotlin.reflect.jvm.internal;

import eg0.C23293d;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.KPackageImpl;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Package;
import lf0.C24225a;
import sf0.C24866j;
import tf0.C24973i;
import tg0.C24988e;
import tg0.C24989f;
import tg0.C24991g;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo59060d2 = {"Lkotlin/Triple;", "Ltg0/f;", "Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Package;", "Ltg0/e;", "invoke", "()Lkotlin/Triple;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 6, 0})
public final class KPackageImpl$Data$metadata$2 extends Lambda implements C24225a<Triple<? extends C24989f, ? extends ProtoBuf$Package, ? extends C24988e>> {
    public final /* synthetic */ KPackageImpl.Data this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KPackageImpl$Data$metadata$2(KPackageImpl.Data data) {
        super(0);
        this.this$0 = data;
    }

    public final Object invoke() {
        C24973i.C24974a aVar = this.this$0.f60242c;
        C24866j<Object> jVar = KPackageImpl.Data.f60241g[0];
        C23293d dVar = (C23293d) aVar.invoke();
        if (dVar == null) {
            return null;
        }
        KotlinClassHeader kotlinClassHeader = dVar.f59075b;
        String[] strArr = kotlinClassHeader.f60766c;
        String[] strArr2 = kotlinClassHeader.f60768e;
        if (strArr == null || strArr2 == null) {
            return null;
        }
        Pair<C24989f, ProtoBuf$Package> h = C24991g.m62705h(strArr, strArr2);
        return new Triple(h.mo59066a(), h.mo59067b(), kotlinClassHeader.f60765b);
    }
}
