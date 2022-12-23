package ij0;

import androidx.appcompat.app.C0262r;
import com.google.android.play.core.assetpacks.C14248b1;
import java.lang.reflect.Modifier;
import kj0.C23808c;
import kj0.C23810e;
import kj0.C23811f;
import lj0.C24331h;
import lj0.C24334k;
import org.simpleframework.xml.core.C24664u;
import org.simpleframework.xml.core.InstantiationException;
import org.simpleframework.xml.core.PersistenceException;
import p069e3.C4544g;

/* renamed from: ij0.n0 */
public abstract class C23653n0 {

    /* renamed from: a */
    public C23639i1 f59804a;

    /* renamed from: b */
    public C24664u f59805b;

    /* renamed from: c */
    public Class f59806c = null;

    /* renamed from: d */
    public C23810e f59807d;

    public C23653n0(C23639i1 i1Var, C4544g gVar) {
        this.f59805b = (C24664u) i1Var.f59777c;
        this.f59804a = i1Var;
        this.f59807d = gVar;
    }

    /* renamed from: c */
    public static boolean m58000c(Class cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isAbstract(modifiers)) {
            return false;
        }
        return !Modifier.isInterface(modifiers);
    }

    /* renamed from: a */
    public final C23811f mo58824a(C24331h hVar) throws Exception {
        C23639i1 i1Var = this.f59804a;
        C23810e eVar = this.f59807d;
        i1Var.getClass();
        C24334k<C24331h> attributes = hVar.getAttributes();
        if (attributes != null) {
            C23811f a = ((C23808c) i1Var.f59776b).mo59056a(eVar, attributes, (C23654n1) i1Var.f59778d);
            if (!(a == null || this.f59806c == null)) {
                Class type = a.getType();
                Class<?> cls = this.f59806c;
                if (cls.isArray()) {
                    cls = cls.getComponentType();
                }
                if (!cls.isAssignableFrom(type)) {
                    a = new C14248b1(a, this.f59806c);
                }
            }
            if (a != null) {
                C0262r position = hVar.getPosition();
                Class type2 = a.getType();
                Class<?> b = mo58825b();
                if (b.isArray()) {
                    b = b.getComponentType();
                }
                if (!b.isAssignableFrom(type2)) {
                    throw new InstantiationException("Incompatible %s for %s at %s", type2, this.f59807d, position);
                }
            }
            return a;
        }
        throw new PersistenceException("No attributes for %s", hVar);
    }

    /* renamed from: b */
    public final Class mo58825b() {
        Class cls = this.f59806c;
        if (cls != null) {
            return cls;
        }
        return this.f59807d.getType();
    }
}
