package kotlin.reflect.jvm.internal;

import bf0.C21049c;
import cf0.C21136j;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import kotlin.C23812a;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KVariance;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import lf0.C24225a;
import lh0.C24281l0;
import lh0.C24307v;
import mf0.C24362h;
import p583jk.C17875h;
import sf0.C24869m;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo59060d2 = {"", "Lsf0/m;", "kotlin.jvm.PlatformType", "invoke", "()Ljava/util/List;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 6, 0})
public final class KTypeImpl$arguments$2 extends Lambda implements C24225a<List<? extends C24869m>> {
    public final /* synthetic */ C24225a<Type> $computeJavaType;
    public final /* synthetic */ KTypeImpl this$0;

    /* renamed from: kotlin.reflect.jvm.internal.KTypeImpl$arguments$2$a */
    public /* synthetic */ class C23850a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f60273a;

        static {
            int[] iArr = new int[Variance.values().length];
            iArr[Variance.INVARIANT.ordinal()] = 1;
            iArr[Variance.IN_VARIANCE.ordinal()] = 2;
            iArr[Variance.OUT_VARIANCE.ordinal()] = 3;
            f60273a = iArr;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KTypeImpl$arguments$2(KTypeImpl kTypeImpl, C24225a<? extends Type> aVar) {
        super(0);
        this.this$0 = kTypeImpl;
        this.$computeJavaType = aVar;
    }

    public final Object invoke() {
        C24869m mVar;
        List<C24281l0> N0 = this.this$0.f60270a.mo60410N0();
        if (N0.isEmpty()) {
            return EmptyList.f60173b;
        }
        C21049c a = C23812a.m58431a(LazyThreadSafetyMode.PUBLICATION, new KTypeImpl$arguments$2$parameterizedTypeArguments$2(this.this$0));
        C24225a<Type> aVar = this.$computeJavaType;
        KTypeImpl kTypeImpl = this.this$0;
        ArrayList arrayList = new ArrayList(C21136j.m49436X(N0, 10));
        int i = 0;
        for (T next : N0) {
            int i2 = i + 1;
            KTypeImpl$arguments$2$1$type$1 kTypeImpl$arguments$2$1$type$1 = null;
            if (i >= 0) {
                C24281l0 l0Var = (C24281l0) next;
                if (l0Var.mo60240a()) {
                    mVar = C24869m.f62860c;
                } else {
                    C24307v type = l0Var.getType();
                    C24362h.m61210e(type, "typeProjection.type");
                    if (aVar != null) {
                        kTypeImpl$arguments$2$1$type$1 = new KTypeImpl$arguments$2$1$type$1(kTypeImpl, i, a);
                    }
                    KTypeImpl kTypeImpl2 = new KTypeImpl(type, kTypeImpl$arguments$2$1$type$1);
                    int i3 = C23850a.f60273a[l0Var.mo60241b().ordinal()];
                    if (i3 == 1) {
                        mVar = new C24869m(KVariance.INVARIANT, kTypeImpl2);
                    } else if (i3 == 2) {
                        mVar = new C24869m(KVariance.IN, kTypeImpl2);
                    } else if (i3 == 3) {
                        mVar = new C24869m(KVariance.OUT, kTypeImpl2);
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                arrayList.add(mVar);
                i = i2;
            } else {
                C17875h.m44294U();
                throw null;
            }
        }
        return arrayList;
    }
}
