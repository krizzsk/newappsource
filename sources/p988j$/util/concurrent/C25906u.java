package p988j$.util.concurrent;

import p988j$.util.function.BiConsumer;
import p988j$.util.function.BiFunction;
import p988j$.util.function.Consumer;
import p988j$.util.function.Function;

/* renamed from: j$.util.concurrent.u */
public final /* synthetic */ class C25906u implements BiConsumer, BiFunction, Consumer {

    /* renamed from: a */
    public final /* synthetic */ int f64583a;

    /* renamed from: b */
    public final /* synthetic */ Object f64584b;

    /* renamed from: c */
    public final /* synthetic */ Object f64585c;

    public /* synthetic */ C25906u(int i, Object obj, Object obj2) {
        this.f64583a = i;
        this.f64584b = obj;
        this.f64585c = obj2;
    }

    public /* synthetic */ C25906u(BiFunction biFunction, Function function) {
        this.f64583a = 2;
        this.f64585c = biFunction;
        this.f64584b = function;
    }

    public final void accept(Object obj) {
        ((Consumer) this.f64584b).accept(obj);
        ((Consumer) this.f64585c).accept(obj);
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x000e A[LOOP:0: B:3:0x000e->B:6:0x001c, LOOP_START, PHI: r5 
      PHI: (r5v1 java.lang.Object) = (r5v0 java.lang.Object), (r5v3 java.lang.Object) binds: [B:2:0x0006, B:6:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void accept(java.lang.Object r4, java.lang.Object r5) {
        /*
            r3 = this;
            int r0 = r3.f64583a
            switch(r0) {
                case 0: goto L_0x0006;
                default: goto L_0x0005;
            }
        L_0x0005:
            goto L_0x001f
        L_0x0006:
            java.lang.Object r0 = r3.f64584b
            java.util.concurrent.ConcurrentMap r0 = (java.util.concurrent.ConcurrentMap) r0
            java.lang.Object r1 = r3.f64585c
            j$.util.function.BiFunction r1 = (p988j$.util.function.BiFunction) r1
        L_0x000e:
            java.lang.Object r2 = r1.apply(r4, r5)
            boolean r5 = r0.replace(r4, r5, r2)
            if (r5 != 0) goto L_0x001e
            java.lang.Object r5 = r0.get(r4)
            if (r5 != 0) goto L_0x000e
        L_0x001e:
            return
        L_0x001f:
            java.lang.Object r0 = r3.f64584b
            j$.util.function.BiConsumer r0 = (p988j$.util.function.BiConsumer) r0
            java.lang.Object r1 = r3.f64585c
            j$.util.function.BiConsumer r1 = (p988j$.util.function.BiConsumer) r1
            r0.accept(r4, r5)
            r1.accept(r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p988j$.util.concurrent.C25906u.accept(java.lang.Object, java.lang.Object):void");
    }

    public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        switch (this.f64583a) {
            case 0:
                return BiConsumer.CC.$default$andThen(this, biConsumer);
            default:
                return BiConsumer.CC.$default$andThen(this, biConsumer);
        }
    }

    public final BiFunction andThen(Function function) {
        function.getClass();
        return new C25906u(this, function);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }

    public final Object apply(Object obj, Object obj2) {
        return ((Function) this.f64584b).apply(((BiFunction) this.f64585c).apply(obj, obj2));
    }
}
