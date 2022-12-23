package rf0;

import cf0.C21135i;
import java.util.NoSuchElementException;
import mf0.C24362h;

/* renamed from: rf0.b */
public final class C24800b extends C21135i {

    /* renamed from: b */
    public final int f62724b;

    /* renamed from: c */
    public final int f62725c;

    /* renamed from: d */
    public boolean f62726d;

    /* renamed from: e */
    public int f62727e;

    public C24800b(char c, char c2, int i) {
        this.f62724b = i;
        this.f62725c = c2;
        boolean z = true;
        if (i <= 0 ? C24362h.m61213h(c, c2) < 0 : C24362h.m61213h(c, c2) > 0) {
            z = false;
        }
        this.f62726d = z;
        this.f62727e = !z ? c2 : c;
    }

    /* renamed from: b */
    public final char mo53374b() {
        int i = this.f62727e;
        if (i != this.f62725c) {
            this.f62727e = this.f62724b + i;
        } else if (this.f62726d) {
            this.f62726d = false;
        } else {
            throw new NoSuchElementException();
        }
        return (char) i;
    }

    public final boolean hasNext() {
        return this.f62726d;
    }
}
