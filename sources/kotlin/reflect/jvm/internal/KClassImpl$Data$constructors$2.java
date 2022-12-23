package kotlin.reflect.jvm.internal;

import cf0.C21136j;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.C23899b;
import lf0.C24225a;
import sf0.C24858e;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003 \u0004*\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0018\u00010\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, mo59060d2 = {"", "T", "", "Lsf0/e;", "kotlin.jvm.PlatformType", "invoke", "()Ljava/util/List;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 6, 0})
public final class KClassImpl$Data$constructors$2 extends Lambda implements C24225a<List<? extends C24858e<? extends T>>> {
    public final /* synthetic */ KClassImpl<T> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KClassImpl$Data$constructors$2(KClassImpl<T> kClassImpl) {
        super(0);
        this.this$0 = kClassImpl;
    }

    public final Object invoke() {
        Collection<C23899b> f = this.this$0.mo59305f();
        KClassImpl<T> kClassImpl = this.this$0;
        ArrayList arrayList = new ArrayList(C21136j.m49436X(f, 10));
        for (C23899b kFunctionImpl : f) {
            arrayList.add(new KFunctionImpl(kClassImpl, kFunctionImpl));
        }
        return arrayList;
    }
}
