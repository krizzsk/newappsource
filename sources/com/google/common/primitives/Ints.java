package com.google.common.primitives;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.RandomAccess;
import p057d3.C4339c;
import p389bl.C13641g;
import p583jk.C17884p;
import p988j$.lang.Iterable;
import p988j$.util.Collection;
import p988j$.util.List;
import p988j$.util.Spliterator;
import p988j$.util.Spliterators;
import p988j$.util.function.Consumer;
import p988j$.util.function.IntFunction;
import p988j$.util.function.Predicate;
import p988j$.util.function.UnaryOperator;

public final class Ints extends C4339c {

    public static class IntArrayAsList extends AbstractList<Integer> implements RandomAccess, Serializable, List {
        private static final long serialVersionUID = 0;
        public final int[] array;
        public final int end;
        public final int start;

        public IntArrayAsList(int[] iArr, int i, int i2) {
            this.array = iArr;
            this.start = i;
            this.end = i2;
        }

        public final boolean contains(Object obj) {
            if (obj instanceof Integer) {
                int[] iArr = this.array;
                int intValue = ((Integer) obj).intValue();
                int i = this.start;
                int i2 = this.end;
                while (true) {
                    if (i >= i2) {
                        i = -1;
                        break;
                    } else if (iArr[i] == intValue) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (i != -1) {
                    return true;
                }
            }
            return false;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof IntArrayAsList)) {
                return super.equals(obj);
            }
            IntArrayAsList intArrayAsList = (IntArrayAsList) obj;
            int size = size();
            if (intArrayAsList.size() != size) {
                return false;
            }
            for (int i = 0; i < size; i++) {
                if (this.array[this.start + i] != intArrayAsList.array[intArrayAsList.start + i]) {
                    return false;
                }
            }
            return true;
        }

        public final /* synthetic */ void forEach(Consumer consumer) {
            Iterable.CC.$default$forEach(this, consumer);
        }

        public final /* synthetic */ void forEach(java.util.function.Consumer consumer) {
            forEach(Consumer.VivifiedWrapper.convert(consumer));
        }

        public final Object get(int i) {
            C17884p.m44371j(i, size());
            return Integer.valueOf(this.array[this.start + i]);
        }

        public final int hashCode() {
            int i = 1;
            for (int i2 = this.start; i2 < this.end; i2++) {
                i = (i * 31) + this.array[i2];
            }
            return i;
        }

        public final int indexOf(Object obj) {
            if (obj instanceof Integer) {
                int[] iArr = this.array;
                int intValue = ((Integer) obj).intValue();
                int i = this.start;
                int i2 = this.end;
                while (true) {
                    if (i >= i2) {
                        i = -1;
                        break;
                    } else if (iArr[i] == intValue) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (i >= 0) {
                    return i - this.start;
                }
            }
            return -1;
        }

        public final boolean isEmpty() {
            return false;
        }

        public final int lastIndexOf(Object obj) {
            if (obj instanceof Integer) {
                int[] iArr = this.array;
                int intValue = ((Integer) obj).intValue();
                int i = this.start;
                int i2 = this.end - 1;
                while (true) {
                    if (i2 < i) {
                        i2 = -1;
                        break;
                    } else if (iArr[i2] == intValue) {
                        break;
                    } else {
                        i2--;
                    }
                }
                if (i2 >= 0) {
                    return i2 - this.start;
                }
            }
            return -1;
        }

        public final /* synthetic */ boolean removeIf(Predicate predicate) {
            return Collection.CC.$default$removeIf(this, predicate);
        }

        public final /* synthetic */ boolean removeIf(java.util.function.Predicate predicate) {
            return removeIf(Predicate.VivifiedWrapper.convert(predicate));
        }

        public final /* synthetic */ void replaceAll(UnaryOperator unaryOperator) {
            List.CC.$default$replaceAll(this, unaryOperator);
        }

        public final /* synthetic */ void replaceAll(java.util.function.UnaryOperator unaryOperator) {
            replaceAll(UnaryOperator.VivifiedWrapper.convert(unaryOperator));
        }

        public final Object set(int i, Object obj) {
            Integer num = (Integer) obj;
            C17884p.m44371j(i, size());
            int[] iArr = this.array;
            int i2 = this.start + i;
            int i3 = iArr[i2];
            num.getClass();
            iArr[i2] = num.intValue();
            return Integer.valueOf(i3);
        }

        public final int size() {
            return this.end - this.start;
        }

        public final /* synthetic */ void sort(Comparator comparator) {
            List.CC.$default$sort(this, comparator);
        }

        public final Spliterator spliterator() {
            return Spliterators.spliterator(this.array, this.start, this.end, 0);
        }

        public final java.util.List<Integer> subList(int i, int i2) {
            C17884p.m44375o(i, i2, size());
            if (i == i2) {
                return Collections.emptyList();
            }
            int[] iArr = this.array;
            int i3 = this.start;
            return new IntArrayAsList(iArr, i + i3, i3 + i2);
        }

        public final /* synthetic */ Object[] toArray(IntFunction intFunction) {
            return Collection.CC.$default$toArray(this, intFunction);
        }

        public final /* synthetic */ Object[] toArray(java.util.function.IntFunction intFunction) {
            return toArray(IntFunction.VivifiedWrapper.convert(intFunction));
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder(size() * 5);
            sb.append('[');
            sb.append(this.array[this.start]);
            int i = this.start;
            while (true) {
                i++;
                if (i < this.end) {
                    sb.append(", ");
                    sb.append(this.array[i]);
                } else {
                    sb.append(']');
                    return sb.toString();
                }
            }
        }
    }

    /* renamed from: v */
    public static int m35900v(long j) {
        int i = (int) j;
        if (((long) i) == j) {
            return i;
        }
        throw new IllegalArgumentException(C13641g.m34132u("Out of range: %s", Long.valueOf(j)));
    }

    /* renamed from: w */
    public static int[] m35901w(java.util.List list) {
        if (list instanceof IntArrayAsList) {
            IntArrayAsList intArrayAsList = (IntArrayAsList) list;
            return Arrays.copyOfRange(intArrayAsList.array, intArrayAsList.start, intArrayAsList.end);
        }
        Object[] array = list.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            Object obj = array[i];
            obj.getClass();
            iArr[i] = ((Number) obj).intValue();
        }
        return iArr;
    }
}
