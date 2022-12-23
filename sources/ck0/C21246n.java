package ck0;

import java.io.IOException;
import java.lang.reflect.Array;

/* renamed from: ck0.n */
public final class C21246n extends C21247o<Object> {

    /* renamed from: a */
    public final /* synthetic */ C21247o f53197a;

    public C21246n(C21247o oVar) {
        this.f53197a = oVar;
    }

    /* renamed from: a */
    public final void mo53602a(C21265q qVar, Object obj) throws IOException {
        if (obj != null) {
            int length = Array.getLength(obj);
            for (int i = 0; i < length; i++) {
                this.f53197a.mo53602a(qVar, Array.get(obj, i));
            }
        }
    }
}
