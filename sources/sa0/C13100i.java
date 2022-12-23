package sa0;

import java.util.ArrayList;
import javax.microedition.khronos.opengles.GL10;
import oa0.C12974i;
import ya0.C13279f;

/* renamed from: sa0.i */
public final class C13100i {

    /* renamed from: a */
    public int f32494a = 1;

    /* renamed from: b */
    public ArrayList f32495b = new ArrayList();

    /* renamed from: c */
    public C13279f<Object> f32496c = new C13279f<>();

    /* renamed from: a */
    public final int mo39991a(C12974i iVar) {
        this.f32495b.add(iVar);
        int i = this.f32494a;
        this.f32494a = i + 1;
        return i;
    }

    /* renamed from: b */
    public final void mo39992b(GL10 gl10) {
        gl10.glClearColor(1.0f, 1.0f, 1.0f, 1.0f);
        gl10.glClear(16640);
        this.f32494a = 0;
        this.f32495b.clear();
        C13279f<Object> fVar = this.f32496c;
        synchronized (fVar) {
            C13279f.C13280a<V>[] aVarArr = fVar.f32948a;
            int length = aVarArr.length;
            while (true) {
                length--;
                if (length >= 0) {
                    aVarArr[length] = null;
                }
            }
        }
    }
}
