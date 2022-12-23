package rh0;

import com.appboy.Constants;
import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import p988j$.util.Iterator;
import p988j$.util.function.Consumer;

/* renamed from: rh0.c */
public final class C24819c<E> extends AbstractList<E> implements RandomAccess {

    /* renamed from: b */
    public int f62759b;

    /* renamed from: c */
    public Object f62760c;

    /* renamed from: rh0.c$a */
    public static class C24820a<T> implements Iterator<T>, p988j$.util.Iterator {

        /* renamed from: b */
        public static final C24820a f62761b = new C24820a();

        public final /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, Consumer.VivifiedWrapper.convert(consumer));
        }

        public final boolean hasNext() {
            return false;
        }

        public final T next() {
            throw new NoSuchElementException();
        }

        public final void remove() {
            throw new IllegalStateException();
        }
    }

    /* renamed from: rh0.c$b */
    public class C24821b extends C24822c<E> implements p988j$.util.Iterator {

        /* renamed from: c */
        public final int f62762c;

        public C24821b() {
            this.f62762c = C24819c.this.modCount;
        }

        /* renamed from: b */
        public final void mo61274b() {
            if (C24819c.this.modCount != this.f62762c) {
                StringBuilder k = C13555b.m33972k("ModCount: ");
                k.append(C24819c.this.modCount);
                k.append("; expected: ");
                k.append(this.f62762c);
                throw new ConcurrentModificationException(k.toString());
            }
        }

        public final /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, Consumer.VivifiedWrapper.convert(consumer));
        }

        public final void remove() {
            mo61274b();
            C24819c.this.clear();
        }
    }

    /* renamed from: rh0.c$c */
    public static abstract class C24822c<T> implements java.util.Iterator<T> {

        /* renamed from: b */
        public boolean f62764b;

        /* renamed from: b */
        public abstract void mo61274b();

        public final boolean hasNext() {
            return !this.f62764b;
        }

        public final T next() {
            if (!this.f62764b) {
                this.f62764b = true;
                mo61274b();
                return C24819c.this.f62760c;
            }
            throw new NoSuchElementException();
        }
    }

    /* renamed from: d */
    public static /* synthetic */ void m62352d(int i) {
        String str = (i == 2 || i == 3 || i == 5 || i == 6 || i == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 2 || i == 3 || i == 5 || i == 6 || i == 7) ? 2 : 3)];
        switch (i) {
            case 2:
            case 3:
            case 5:
            case 6:
            case 7:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/utils/SmartList";
                break;
            case 4:
                objArr[0] = Constants.APPBOY_PUSH_CONTENT_KEY;
                break;
            default:
                objArr[0] = "elements";
                break;
        }
        if (i == 2 || i == 3) {
            objArr[1] = "iterator";
        } else if (i == 5 || i == 6 || i == 7) {
            objArr[1] = "toArray";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/SmartList";
        }
        switch (i) {
            case 2:
            case 3:
            case 5:
            case 6:
            case 7:
                break;
            case 4:
                objArr[2] = "toArray";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        throw ((i == 2 || i == 3 || i == 5 || i == 6 || i == 7) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    public final boolean add(E e) {
        int i = this.f62759b;
        if (i == 0) {
            this.f62760c = e;
        } else if (i == 1) {
            this.f62760c = new Object[]{this.f62760c, e};
        } else {
            Object[] objArr = (Object[]) this.f62760c;
            int length = objArr.length;
            if (i >= length) {
                int b = C13715c.m34237b(length, 3, 2, 1);
                int i2 = i + 1;
                if (b < i2) {
                    b = i2;
                }
                Object[] objArr2 = new Object[b];
                this.f62760c = objArr2;
                System.arraycopy(objArr, 0, objArr2, 0, length);
                objArr = objArr2;
            }
            objArr[this.f62759b] = e;
        }
        this.f62759b++;
        this.modCount++;
        return true;
    }

    public final void clear() {
        this.f62760c = null;
        this.f62759b = 0;
        this.modCount++;
    }

    public final E get(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.f62759b)) {
            StringBuilder r = C25541a.m63887r("Index: ", i, ", Size: ");
            r.append(this.f62759b);
            throw new IndexOutOfBoundsException(r.toString());
        } else if (i2 == 1) {
            return this.f62760c;
        } else {
            return ((Object[]) this.f62760c)[i];
        }
    }

    public final java.util.Iterator<E> iterator() {
        int i = this.f62759b;
        if (i == 0) {
            return C24820a.f62761b;
        }
        if (i == 1) {
            return new C24821b();
        }
        java.util.Iterator<E> it = super.iterator();
        if (it != null) {
            return it;
        }
        m62352d(3);
        throw null;
    }

    public final E remove(int i) {
        int i2;
        E e;
        if (i < 0 || i >= (i2 = this.f62759b)) {
            StringBuilder r = C25541a.m63887r("Index: ", i, ", Size: ");
            r.append(this.f62759b);
            throw new IndexOutOfBoundsException(r.toString());
        }
        if (i2 == 1) {
            e = this.f62760c;
            this.f62760c = null;
        } else {
            E[] eArr = (Object[]) this.f62760c;
            E e2 = eArr[i];
            if (i2 == 2) {
                this.f62760c = eArr[1 - i];
            } else {
                int i3 = (i2 - i) - 1;
                if (i3 > 0) {
                    System.arraycopy(eArr, i + 1, eArr, i, i3);
                }
                eArr[this.f62759b - 1] = null;
            }
            e = e2;
        }
        this.f62759b--;
        this.modCount++;
        return e;
    }

    public final E set(int i, E e) {
        int i2;
        if (i < 0 || i >= (i2 = this.f62759b)) {
            StringBuilder r = C25541a.m63887r("Index: ", i, ", Size: ");
            r.append(this.f62759b);
            throw new IndexOutOfBoundsException(r.toString());
        } else if (i2 == 1) {
            E e2 = this.f62760c;
            this.f62760c = e;
            return e2;
        } else {
            E[] eArr = (Object[]) this.f62760c;
            E e3 = eArr[i];
            eArr[i] = e;
            return e3;
        }
    }

    public final int size() {
        return this.f62759b;
    }

    public final <T> T[] toArray(T[] tArr) {
        if (tArr != null) {
            int length = tArr.length;
            int i = this.f62759b;
            if (i == 1) {
                if (length != 0) {
                    tArr[0] = this.f62760c;
                } else {
                    T[] tArr2 = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), 1);
                    tArr2[0] = this.f62760c;
                    return tArr2;
                }
            } else if (length < i) {
                T[] copyOf = Arrays.copyOf((Object[]) this.f62760c, i, tArr.getClass());
                if (copyOf != null) {
                    return copyOf;
                }
                m62352d(6);
                throw null;
            } else if (i != 0) {
                System.arraycopy(this.f62760c, 0, tArr, 0, i);
            }
            int i2 = this.f62759b;
            if (length > i2) {
                tArr[i2] = null;
            }
            return tArr;
        }
        m62352d(4);
        throw null;
    }

    public final void add(int i, E e) {
        int i2;
        if (i < 0 || i > (i2 = this.f62759b)) {
            StringBuilder r = C25541a.m63887r("Index: ", i, ", Size: ");
            r.append(this.f62759b);
            throw new IndexOutOfBoundsException(r.toString());
        }
        if (i2 == 0) {
            this.f62760c = e;
        } else if (i2 == 1 && i == 0) {
            this.f62760c = new Object[]{e, this.f62760c};
        } else {
            Object[] objArr = new Object[(i2 + 1)];
            if (i2 == 1) {
                objArr[0] = this.f62760c;
            } else {
                Object[] objArr2 = (Object[]) this.f62760c;
                System.arraycopy(objArr2, 0, objArr, 0, i);
                System.arraycopy(objArr2, i, objArr, i + 1, this.f62759b - i);
            }
            objArr[i] = e;
            this.f62760c = objArr;
        }
        this.f62759b++;
        this.modCount++;
    }
}
