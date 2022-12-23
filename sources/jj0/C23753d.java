package jj0;

import java.util.HashMap;
import java.util.Stack;

/* renamed from: jj0.d */
public final class C23753d implements C23751b {

    /* renamed from: a */
    public Stack f60011a;

    public C23753d(HashMap hashMap) {
        Stack stack = new Stack();
        this.f60011a = stack;
        stack.push(new C23750a());
        this.f60011a.push(new C23754e());
        this.f60011a.push(new C23752c(hashMap));
    }

    /* renamed from: a */
    public final String mo58847a(String str) {
        String a;
        int size = this.f60011a.size();
        do {
            size--;
            if (size < 0) {
                return null;
            }
            a = ((C23751b) this.f60011a.get(size)).mo58847a(str);
        } while (a == null);
        return a;
    }
}
