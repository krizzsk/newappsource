package kotlin.reflect.jvm.internal;

import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import lf0.C24225a;
import lh0.C24307v;
import mf0.C24362h;

@Metadata(mo59059d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001\"\u0006\b\u0000\u0010\u0003 \u0001H\n¢\u0006\u0002\b\u0004"}, mo59060d2 = {"<anonymous>", "Lkotlin/reflect/jvm/internal/KTypeImpl;", "kotlin.jvm.PlatformType", "R", "invoke"}, mo59061k = 3, mo59062mv = {1, 6, 0}, mo59064xi = 48)
public final class KCallableImpl$_returnType$1 extends Lambda implements C24225a<KTypeImpl> {
    public final /* synthetic */ KCallableImpl<R> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KCallableImpl$_returnType$1(KCallableImpl<? extends R> kCallableImpl) {
        super(0);
        this.this$0 = kCallableImpl;
    }

    public final Object invoke() {
        C24307v i = this.this$0.mo59298d().mo53443i();
        C24362h.m61208c(i);
        final KCallableImpl<R> kCallableImpl = this.this$0;
        return new KTypeImpl(i, new C24225a<Type>() {
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: java.lang.Object} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: java.lang.reflect.Type} */
            /* JADX WARNING: Multi-variable type inference failed */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object invoke() {
                /*
                    r5 = this;
                    kotlin.reflect.jvm.internal.KCallableImpl<java.lang.Object> r0 = r3
                    kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r1 = r0.mo59298d()
                    boolean r2 = r1 instanceof kotlin.reflect.jvm.internal.impl.descriptors.C23900c
                    r3 = 0
                    if (r2 == 0) goto L_0x000e
                    kotlin.reflect.jvm.internal.impl.descriptors.c r1 = (kotlin.reflect.jvm.internal.impl.descriptors.C23900c) r1
                    goto L_0x000f
                L_0x000e:
                    r1 = r3
                L_0x000f:
                    r2 = 0
                    r4 = 1
                    if (r1 != 0) goto L_0x0014
                    goto L_0x001b
                L_0x0014:
                    boolean r1 = r1.mo53424V()
                    if (r1 != r4) goto L_0x001b
                    r2 = 1
                L_0x001b:
                    if (r2 == 0) goto L_0x0067
                    uf0.b r0 = r0.mo59296b()
                    java.util.List r0 = r0.mo59359b()
                    java.lang.Object r0 = kotlin.collections.C23825c.m58523t0(r0)
                    boolean r1 = r0 instanceof java.lang.reflect.ParameterizedType
                    if (r1 == 0) goto L_0x0030
                    java.lang.reflect.ParameterizedType r0 = (java.lang.reflect.ParameterizedType) r0
                    goto L_0x0031
                L_0x0030:
                    r0 = r3
                L_0x0031:
                    if (r0 != 0) goto L_0x0035
                    r1 = r3
                    goto L_0x0039
                L_0x0035:
                    java.lang.reflect.Type r1 = r0.getRawType()
                L_0x0039:
                    java.lang.Class<ff0.c> r2 = ff0.C23349c.class
                    boolean r1 = mf0.C24362h.m61206a(r1, r2)
                    if (r1 == 0) goto L_0x0067
                    java.lang.reflect.Type[] r0 = r0.getActualTypeArguments()
                    java.lang.String r1 = "continuationType.actualTypeArguments"
                    mf0.C24362h.m61210e(r0, r1)
                    java.lang.Object r0 = kotlin.collections.C23816b.m58447c1(r0)
                    boolean r1 = r0 instanceof java.lang.reflect.WildcardType
                    if (r1 == 0) goto L_0x0055
                    java.lang.reflect.WildcardType r0 = (java.lang.reflect.WildcardType) r0
                    goto L_0x0056
                L_0x0055:
                    r0 = r3
                L_0x0056:
                    if (r0 != 0) goto L_0x0059
                    goto L_0x0067
                L_0x0059:
                    java.lang.reflect.Type[] r0 = r0.getLowerBounds()
                    if (r0 != 0) goto L_0x0060
                    goto L_0x0067
                L_0x0060:
                    java.lang.Object r0 = kotlin.collections.C23816b.m58439U0(r0)
                    r3 = r0
                    java.lang.reflect.Type r3 = (java.lang.reflect.Type) r3
                L_0x0067:
                    if (r3 != 0) goto L_0x0073
                    kotlin.reflect.jvm.internal.KCallableImpl<java.lang.Object> r0 = r3
                    uf0.b r0 = r0.mo59296b()
                    java.lang.reflect.Type r3 = r0.mo59361i()
                L_0x0073:
                    return r3
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.KCallableImpl$_returnType$1.C238421.invoke():java.lang.Object");
            }
        });
    }
}
