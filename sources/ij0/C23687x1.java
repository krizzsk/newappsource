package ij0;

import androidx.appcompat.app.C0262r;
import java.lang.annotation.Annotation;
import kj0.C23810e;
import lj0.C24331h;
import org.simpleframework.xml.core.PersistenceException;
import p247s6.C6478c;

/* renamed from: ij0.x1 */
public final class C23687x1 implements C23673t0 {

    /* renamed from: a */
    public final Object f59863a;

    /* renamed from: b */
    public final C23673t0 f59864b;

    /* renamed from: ij0.x1$a */
    public static class C23688a implements C23642j1 {

        /* renamed from: a */
        public final C23662q f59865a;

        /* renamed from: b */
        public final Object f59866b;

        /* renamed from: c */
        public final C23673t0 f59867c;

        public C23688a(C23662q qVar, C23673t0 t0Var, Object obj) {
            this.f59865a = qVar;
            this.f59866b = obj;
            this.f59867c = t0Var;
        }

        /* renamed from: a */
        public final Object mo58815a(C24331h hVar, Object obj) throws Exception {
            C0262r position = hVar.getPosition();
            String name = hVar.getName();
            C23662q qVar = this.f59865a;
            if (qVar instanceof C23642j1) {
                return ((C23642j1) qVar).mo58815a(hVar, obj);
            }
            throw new PersistenceException("Element '%s' is already used with %s at %s", name, this.f59867c, position);
        }

        /* renamed from: b */
        public final Object mo58816b(C24331h hVar) throws Exception {
            return mo58815a(hVar, this.f59866b);
        }
    }

    public C23687x1(C23673t0 t0Var, Object obj) {
        this.f59864b = t0Var;
        this.f59863a = obj;
    }

    /* renamed from: A */
    public final Object mo58753A(C23639i1 i1Var) throws Exception {
        return this.f59864b.mo58753A(i1Var);
    }

    /* renamed from: B */
    public final C23662q mo58754B(C23639i1 i1Var) throws Exception {
        C23662q B = this.f59864b.mo58754B(i1Var);
        if (B instanceof C23688a) {
            return B;
        }
        return new C23688a(B, this.f59864b, this.f59863a);
    }

    /* renamed from: C */
    public final C23659p mo58755C() {
        return this.f59864b.mo58755C();
    }

    /* renamed from: D */
    public final String mo58756D() throws Exception {
        return this.f59864b.mo58756D();
    }

    /* renamed from: E */
    public final boolean mo58803E() {
        return this.f59864b.mo58803E();
    }

    /* renamed from: F */
    public final String[] mo58757F() throws Exception {
        return this.f59864b.mo58757F();
    }

    /* renamed from: G */
    public final boolean mo58758G() {
        return this.f59864b.mo58758G();
    }

    /* renamed from: H */
    public final String[] mo58759H() throws Exception {
        return this.f59864b.mo58759H();
    }

    /* renamed from: I */
    public final boolean mo58760I() {
        return this.f59864b.mo58760I();
    }

    /* renamed from: a */
    public final Annotation mo58761a() {
        return this.f59864b.mo58761a();
    }

    /* renamed from: c */
    public final boolean mo58762c() {
        return this.f59864b.mo58762c();
    }

    public final Object getKey() throws Exception {
        return this.f59864b.getKey();
    }

    public final String getName() throws Exception {
        return this.f59864b.getName();
    }

    public final Class getType() {
        return this.f59864b.getType();
    }

    /* renamed from: l */
    public final String mo58765l() {
        return this.f59864b.mo58765l();
    }

    /* renamed from: q */
    public final String mo58766q() throws Exception {
        return this.f59864b.mo58766q();
    }

    /* renamed from: r */
    public final C23647l0 mo58767r() throws Exception {
        return this.f59864b.mo58767r();
    }

    /* renamed from: t */
    public final boolean mo58806t() {
        return this.f59864b.mo58806t();
    }

    public final String toString() {
        return this.f59864b.toString();
    }

    /* renamed from: v */
    public final boolean mo58808v() {
        return this.f59864b.mo58808v();
    }

    /* renamed from: w */
    public final boolean mo58769w() {
        return this.f59864b.mo58769w();
    }

    /* renamed from: x */
    public final C23810e mo58770x() throws Exception {
        return this.f59864b.mo58770x();
    }

    /* renamed from: y */
    public final C6478c mo58771y() throws Exception {
        return this.f59864b.mo58771y();
    }

    /* renamed from: z */
    public final boolean mo58772z() {
        return this.f59864b.mo58772z();
    }
}
