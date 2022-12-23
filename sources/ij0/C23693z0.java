package ij0;

import ij0.C23626e1;
import lj0.C24330g;
import org.simpleframework.xml.core.C24652j;
import org.simpleframework.xml.core.C24664u;
import org.simpleframework.xml.core.PathException;

/* renamed from: ij0.z0 */
public final class C23693z0 {

    /* renamed from: a */
    public final C23650m0 f59870a;

    /* renamed from: b */
    public final C24330g f59871b;

    /* renamed from: c */
    public final C23675u f59872c;

    public C23693z0(C23650m0 m0Var, C23675u uVar, C24664u uVar2) throws Exception {
        this.f59871b = uVar2.f62448h;
        this.f59870a = m0Var;
        this.f59872c = uVar;
    }

    /* renamed from: a */
    public final void mo58885a(C24652j jVar, C23647l0 l0Var) throws Exception {
        String prefix = l0Var.getPrefix();
        String first = l0Var.getFirst();
        int index = l0Var.getIndex();
        if (l0Var.mo58785A0()) {
            C24652j f = jVar.mo61017f(index, first, prefix);
            C23626e1.C23627a q = l0Var.mo58797q();
            if (f != null) {
                mo58885a(f, q);
            } else {
                throw new PathException("Element '%s' does not exist in %s", first, this.f59872c);
            }
        } else {
            String first2 = l0Var.getFirst();
            if (first2 != null) {
                jVar.mo61028j(first2);
            }
        }
    }

    /* renamed from: b */
    public final void mo58886b(C24652j jVar, C23647l0 l0Var) throws Exception {
        String prefix = l0Var.getPrefix();
        String first = l0Var.getFirst();
        int index = l0Var.getIndex();
        if (first != null) {
            C24652j f = jVar.mo61017f(index, first, prefix);
            C23626e1.C23627a q = l0Var.mo58797q();
            if (l0Var.mo58785A0()) {
                mo58886b(f, q);
            }
        }
        String prefix2 = l0Var.getPrefix();
        String first2 = l0Var.getFirst();
        int index2 = l0Var.getIndex();
        if (index2 <= 1 || jVar.mo61030o(index2 - 1, first2) != null) {
            jVar.mo61017f(index2, first2, prefix2);
        } else {
            throw new PathException("Ordered element '%s' in path '%s' is out of sequence for %s", first2, l0Var, this.f59872c);
        }
    }
}
