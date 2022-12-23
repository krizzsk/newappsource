package rf0;

import cf0.C21147u;
import java.util.NoSuchElementException;

/* renamed from: rf0.g */
public final class C24805g extends C21147u {

    /* renamed from: b */
    public final int f62731b;

    /* renamed from: c */
    public final int f62732c;

    /* renamed from: d */
    public boolean f62733d;

    /* renamed from: e */
    public int f62734e;

    public C24805g(int i, int i2, int i3) {
        this.f62731b = i3;
        this.f62732c = i2;
        boolean z = true;
        if (i3 <= 0 ? i < i2 : i > i2) {
            z = false;
        }
        this.f62733d = z;
        this.f62734e = !z ? i2 : i;
    }

    public final boolean hasNext() {
        return this.f62733d;
    }

    public final int nextInt() {
        int i = this.f62734e;
        if (i != this.f62732c) {
            this.f62734e = this.f62731b + i;
        } else if (this.f62733d) {
            this.f62733d = false;
        } else {
            throw new NoSuchElementException();
        }
        return i;
    }
}
