package p988j$.util.stream;

import p988j$.util.function.BiConsumer;
import p988j$.util.function.BiFunction;
import p988j$.util.function.C25916A0;
import p988j$.util.function.C25922D0;
import p988j$.util.function.C25967f;
import p988j$.util.function.C26004x0;
import p988j$.util.function.Supplier;

/* renamed from: j$.util.stream.w1 */
final class C26245w1 extends C26239v0 {

    /* renamed from: h */
    public final /* synthetic */ int f65049h;

    /* renamed from: i */
    final /* synthetic */ Object f65050i;

    /* renamed from: j */
    final /* synthetic */ Object f65051j;

    /* renamed from: k */
    final /* synthetic */ Object f65052k;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C26245w1(int i, Object obj, Object obj2, Object obj3, int i2) {
        super(i);
        this.f65049h = i2;
        this.f65050i = obj;
        this.f65052k = obj2;
        this.f65051j = obj3;
    }

    /* renamed from: f1 */
    public final C26092P1 mo84140f1() {
        switch (this.f65049h) {
            case 0:
                return new C26250x1((Supplier) this.f65051j, (C25922D0) this.f65052k, (C25967f) this.f65050i);
            case 1:
                return new C26034C1((Supplier) this.f65051j, (C26004x0) this.f65052k, (C25967f) this.f65050i);
            case 2:
                return new C26039D1(this.f65051j, (BiFunction) this.f65052k, (C25967f) this.f65050i);
            case 3:
                return new C26059H1((Supplier) this.f65051j, (BiConsumer) this.f65052k, (BiConsumer) this.f65050i);
            default:
                return new C26076L1((Supplier) this.f65051j, (C25916A0) this.f65052k, (C25967f) this.f65050i);
        }
    }
}
