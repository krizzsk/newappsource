package mf0;

import cf0.C21135i;
import java.util.NoSuchElementException;

/* renamed from: mf0.a */
public final class C24355a extends C21135i {

    /* renamed from: b */
    public final char[] f61665b;

    /* renamed from: c */
    public int f61666c;

    public C24355a(char[] cArr) {
        this.f61665b = cArr;
    }

    /* renamed from: b */
    public final char mo53374b() {
        try {
            char[] cArr = this.f61665b;
            int i = this.f61666c;
            this.f61666c = i + 1;
            return cArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.f61666c--;
            throw new NoSuchElementException(e.getMessage());
        }
    }

    public final boolean hasNext() {
        return this.f61666c < this.f61665b.length;
    }
}
