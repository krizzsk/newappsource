package kotlin.reflect.jvm.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import lf0.C24225a;

@Metadata(mo59059d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo59060d2 = {"<anonymous>", "T", "", "invoke", "()Ljava/lang/Object;"}, mo59061k = 3, mo59062mv = {1, 6, 0}, mo59064xi = 48)
public final class KClassImpl$Data$objectInstance$2 extends Lambda implements C24225a<T> {
    public final /* synthetic */ KClassImpl<T>.Data this$0;
    public final /* synthetic */ KClassImpl<T> this$1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KClassImpl$Data$objectInstance$2(KClassImpl<T>.Data data, KClassImpl<T> kClassImpl) {
        super(0);
        this.this$0 = data;
        this.this$1 = kClassImpl;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0043 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0044  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final T invoke() {
        /*
            r4 = this;
            kotlin.reflect.jvm.internal.KClassImpl<T>$Data r0 = r4.this$0
            zf0.c r0 = r0.mo59315a()
            kotlin.reflect.jvm.internal.impl.descriptors.ClassKind r1 = r0.mo53513p()
            kotlin.reflect.jvm.internal.impl.descriptors.ClassKind r2 = kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.OBJECT
            r3 = 0
            if (r1 == r2) goto L_0x0010
            return r3
        L_0x0010:
            boolean r1 = r0.mo53509d0()
            if (r1 == 0) goto L_0x0033
            java.util.LinkedHashSet r1 = wf0.C25138b.f63413a
            boolean r1 = mf0.C24361g.m61152V(r0)
            if (r1 != 0) goto L_0x0033
            kotlin.reflect.jvm.internal.KClassImpl<T> r1 = r4.this$1
            java.lang.Class<T> r1 = r1.f60209c
            java.lang.Class r1 = r1.getEnclosingClass()
            ug0.e r0 = r0.getName()
            java.lang.String r0 = r0.mo61604f()
            java.lang.reflect.Field r0 = r1.getDeclaredField(r0)
            goto L_0x003d
        L_0x0033:
            kotlin.reflect.jvm.internal.KClassImpl<T> r0 = r4.this$1
            java.lang.Class<T> r0 = r0.f60209c
            java.lang.String r1 = "INSTANCE"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r1)
        L_0x003d:
            java.lang.Object r0 = r0.get(r3)
            if (r0 == 0) goto L_0x0044
            return r0
        L_0x0044:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "null cannot be cast to non-null type T of kotlin.reflect.jvm.internal.KClassImpl"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.KClassImpl$Data$objectInstance$2.invoke():java.lang.Object");
    }
}
