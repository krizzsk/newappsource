package cf0;

import java.util.Collection;
import mf0.C24362h;
import p583jk.C17875h;

/* renamed from: cf0.j */
public class C21136j extends C17875h {
    /* renamed from: X */
    public static final <T> int m49436X(Iterable<? extends T> iterable, int i) {
        C24362h.m61211f(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).size() : i;
    }
}
