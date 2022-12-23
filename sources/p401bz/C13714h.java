package p401bz;

import android.content.Context;
import java.io.OutputStream;
import org.apache.thrift.TBase;
import org.apache.thrift.TException;
import vi0.C25111a;
import xi0.C25276a;

/* renamed from: bz.h */
public abstract class C13714h<TO extends TBase<?, ?>> implements C13710d {

    /* renamed from: b */
    public final Context f33791b;

    public C13714h(Context context) {
        this.f33791b = context.getApplicationContext();
    }

    /* renamed from: a */
    public abstract TO mo21426a();

    /* renamed from: b */
    public void mo40581b(TO to) {
    }

    /* renamed from: h */
    public final void mo40579h(OutputStream outputStream) {
        try {
            TBase a = mo21426a();
            if (a != null) {
                C25276a aVar = new C25276a(outputStream);
                a.mo25202X0(new C25111a(aVar));
                aVar.mo61877a();
                mo40581b(a);
            }
        } catch (TException unused) {
        }
    }

    /* renamed from: i */
    public /* bridge */ /* synthetic */ boolean mo40580i() {
        return false;
    }
}
