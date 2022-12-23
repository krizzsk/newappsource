package cf0;

import java.util.Iterator;
import mf0.C24355a;
import mf0.C24362h;
import th0.C25003h;

/* renamed from: cf0.h */
public final class C21134h implements C25003h<Character> {

    /* renamed from: a */
    public final /* synthetic */ char[] f52997a;

    public C21134h(char[] cArr) {
        this.f52997a = cArr;
    }

    public final Iterator<Character> iterator() {
        char[] cArr = this.f52997a;
        C24362h.m61211f(cArr, "array");
        return new C24355a(cArr);
    }
}
