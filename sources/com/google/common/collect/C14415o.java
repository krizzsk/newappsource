package com.google.common.collect;

import java.util.Comparator;
import p009a8.C0112l;
import p988j$.util.Spliterator;
import p988j$.util.function.Consumer;
import p988j$.util.function.Function;
import p988j$.util.function.IntFunction;
import p988j$.util.stream.IntStream;

/* renamed from: com.google.common.collect.o */
public final class C14415o {

    /* renamed from: com.google.common.collect.o$a */
    public static abstract class C14416a<InElementT, OutElementT, OutSpliteratorT extends Spliterator<OutElementT>> implements Spliterator<OutElementT> {

        /* renamed from: a */
        public OutSpliteratorT f36303a;

        /* renamed from: b */
        public final Spliterator<InElementT> f36304b;

        /* renamed from: c */
        public final Function<? super InElementT, OutSpliteratorT> f36305c;

        /* renamed from: d */
        public final C14417a<InElementT, OutSpliteratorT> f36306d;

        /* renamed from: e */
        public int f36307e;

        /* renamed from: f */
        public long f36308f;

        @FunctionalInterface
        /* renamed from: com.google.common.collect.o$a$a */
        public interface C14417a<InElementT, OutSpliteratorT extends Spliterator<?>> {
        }

        public C14416a(Spliterator spliterator, Spliterator spliterator2, Function function, C0112l lVar, int i, long j) {
            this.f36303a = spliterator;
            this.f36304b = spliterator2;
            this.f36305c = function;
            this.f36306d = lVar;
            this.f36307e = i;
            this.f36308f = j;
        }

        public final int characteristics() {
            return this.f36307e;
        }

        public final long estimateSize() {
            OutSpliteratorT outspliteratort = this.f36303a;
            if (outspliteratort != null) {
                this.f36308f = Math.max(this.f36308f, outspliteratort.estimateSize());
            }
            return Math.max(this.f36308f, 0);
        }

        public final void forEachRemaining(Consumer<? super OutElementT> consumer) {
            OutSpliteratorT outspliteratort = this.f36303a;
            if (outspliteratort != null) {
                outspliteratort.forEachRemaining(consumer);
                this.f36303a = null;
            }
            this.f36304b.forEachRemaining(new C14411m(this, consumer, 0));
            this.f36308f = 0;
        }

        public final /* synthetic */ Comparator getComparator() {
            return Spliterator.CC.$default$getComparator(this);
        }

        public final /* synthetic */ long getExactSizeIfKnown() {
            return Spliterator.CC.$default$getExactSizeIfKnown(this);
        }

        public final /* synthetic */ boolean hasCharacteristics(int i) {
            return Spliterator.CC.$default$hasCharacteristics(this, i);
        }

        public final boolean tryAdvance(Consumer<? super OutElementT> consumer) {
            do {
                OutSpliteratorT outspliteratort = this.f36303a;
                if (outspliteratort == null || !outspliteratort.tryAdvance(consumer)) {
                    this.f36303a = null;
                } else {
                    long j = this.f36308f;
                    if (j == Long.MAX_VALUE) {
                        return true;
                    }
                    this.f36308f = j - 1;
                    return true;
                }
            } while (this.f36304b.tryAdvance(new C14413n(this)));
            return false;
        }

        public final OutSpliteratorT trySplit() {
            Spliterator<InElementT> trySplit = this.f36304b.trySplit();
            if (trySplit != null) {
                int i = this.f36307e & -65;
                long estimateSize = estimateSize();
                if (estimateSize < Long.MAX_VALUE) {
                    estimateSize /= 2;
                    this.f36308f -= estimateSize;
                    this.f36307e = i;
                }
                long j = estimateSize;
                C14417a<InElementT, OutSpliteratorT> aVar = this.f36306d;
                OutSpliteratorT outspliteratort = this.f36303a;
                Function<? super InElementT, OutSpliteratorT> function = this.f36305c;
                ((C0112l) aVar).getClass();
                C14418b bVar = new C14418b(outspliteratort, trySplit, function, i, j);
                this.f36303a = null;
                return bVar;
            }
            OutSpliteratorT outspliteratort2 = this.f36303a;
            if (outspliteratort2 == null) {
                return null;
            }
            this.f36303a = null;
            return outspliteratort2;
        }
    }

    /* renamed from: com.google.common.collect.o$b */
    public static final class C14418b<InElementT, OutElementT> extends C14416a<InElementT, OutElementT, Spliterator<OutElementT>> {
        public C14418b(Spliterator<OutElementT> spliterator, Spliterator<InElementT> spliterator2, Function<? super InElementT, Spliterator<OutElementT>> function, int i, long j) {
            super(spliterator, spliterator2, function, new C0112l(8), i, j);
        }
    }

    /* renamed from: a */
    public static C14418b m35875a(Spliterator spliterator, C14384b bVar, long j) {
        spliterator.getClass();
        return new C14418b((Spliterator) null, spliterator, bVar, 64, j);
    }

    /* renamed from: b */
    public static C14409l m35876b(int i, int i2, IntFunction intFunction) {
        return new C14409l(IntStream.CC.range(0, i).spliterator(), intFunction, i2, (Comparator) null);
    }

    /* renamed from: c */
    public static C14403i m35877c(Spliterator spliterator, Function function) {
        spliterator.getClass();
        function.getClass();
        return new C14403i(spliterator, function);
    }
}
