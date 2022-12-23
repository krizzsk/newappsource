package p988j$.util.function;

import p988j$.util.function.Function;

/* renamed from: j$.util.function.C */
public final /* synthetic */ class C25919C implements Function {

    /* renamed from: a */
    public final /* synthetic */ int f64603a;

    /* renamed from: b */
    public final /* synthetic */ Function f64604b;

    /* renamed from: c */
    public final /* synthetic */ Function f64605c;

    public /* synthetic */ C25919C(Function function, Function function2, int i) {
        this.f64603a = i;
        this.f64604b = function;
        this.f64605c = function2;
    }

    public final /* synthetic */ Function andThen(Function function) {
        switch (this.f64603a) {
            case 0:
                return Function.CC.$default$andThen(this, function);
            default:
                return Function.CC.$default$andThen(this, function);
        }
    }

    public final Object apply(Object obj) {
        switch (this.f64603a) {
            case 0:
                return this.f64605c.apply(this.f64604b.apply(obj));
            default:
                return this.f64604b.apply(this.f64605c.apply(obj));
        }
    }

    public final /* synthetic */ Function compose(Function function) {
        switch (this.f64603a) {
            case 0:
                return Function.CC.$default$compose(this, function);
            default:
                return Function.CC.$default$compose(this, function);
        }
    }
}
