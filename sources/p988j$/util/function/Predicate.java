package p988j$.util.function;

/* renamed from: j$.util.function.Predicate */
public interface Predicate<T> {

    /* renamed from: j$.util.function.Predicate$-CC  reason: invalid class name */
    public final /* synthetic */ class CC<T> {
        public static Predicate $default$and(Predicate predicate, Predicate predicate2) {
            predicate2.getClass();
            return new C25924E0(predicate, predicate2, 0);
        }

        public static Predicate $default$negate(Predicate predicate) {
            return new C25961c(2, predicate);
        }

        public static Predicate $default$or(Predicate predicate, Predicate predicate2) {
            predicate2.getClass();
            return new C25924E0(predicate, predicate2, 1);
        }
    }

    /* renamed from: j$.util.function.Predicate$VivifiedWrapper */
    public final /* synthetic */ class VivifiedWrapper implements Predicate {

        /* renamed from: a */
        final /* synthetic */ java.util.function.Predicate f64635a;

        private /* synthetic */ VivifiedWrapper(java.util.function.Predicate predicate) {
            this.f64635a = predicate;
        }

        public static /* synthetic */ Predicate convert(java.util.function.Predicate predicate) {
            if (predicate == null) {
                return null;
            }
            return predicate instanceof C25926F0 ? ((C25926F0) predicate).f64615a : new VivifiedWrapper(predicate);
        }

        public final /* synthetic */ Predicate and(Predicate predicate) {
            return convert(this.f64635a.and(C25926F0.m64769a(predicate)));
        }

        public final /* synthetic */ Predicate negate() {
            return convert(this.f64635a.negate());
        }

        /* renamed from: or */
        public final /* synthetic */ Predicate mo43234or(Predicate predicate) {
            return convert(this.f64635a.or(C25926F0.m64769a(predicate)));
        }

        public final /* synthetic */ boolean test(Object obj) {
            return this.f64635a.test(obj);
        }
    }

    Predicate<T> and(Predicate<? super T> predicate);

    Predicate<T> negate();

    /* renamed from: or */
    Predicate<T> mo43234or(Predicate<? super T> predicate);

    boolean test(T t);
}
