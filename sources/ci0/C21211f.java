package ci0;

import android.graphics.Typeface;
import android.view.ViewGroup;
import androidx.transition.Transition;
import com.google.android.play.core.appupdate.C14226d;
import com.moovit.commons.request.ServerException;
import java.io.IOException;
import je0.C23711d;
import p330z2.C7441q;
import p906wz.C20431c;
import p906wz.C20437h;
import rj0.C24838e;
import ve0.C25088a;

/* renamed from: ci0.f */
public abstract class C21211f implements C24838e, C20437h {
    /* renamed from: a */
    public void mo313a(C20431c cVar, boolean z) {
    }

    /* renamed from: c */
    public boolean mo315c(C20431c cVar, ServerException serverException) {
        return false;
    }

    /* renamed from: d */
    public boolean mo316d(C20431c cVar, IOException iOException) {
        return false;
    }

    /* renamed from: f */
    public abstract void mo23707f(C7441q qVar);

    /* renamed from: h */
    public String mo43443h() {
        return null;
    }

    /* renamed from: i */
    public boolean mo319i(C20431c cVar, IOException iOException) {
        return false;
    }

    /* renamed from: l */
    public String mo50416l() {
        return null;
    }

    /* renamed from: m */
    public boolean mo19840m() {
        return false;
    }

    /* renamed from: n */
    public abstract void mo23708n();

    /* renamed from: o */
    public boolean mo19841o() {
        return true;
    }

    /* renamed from: p */
    public String mo43444p() {
        return null;
    }

    /* renamed from: q */
    public abstract long mo23645q(ViewGroup viewGroup, Transition transition, C7441q qVar, C7441q qVar2);

    /* renamed from: r */
    public boolean mo19842r() {
        return true;
    }

    /* renamed from: s */
    public abstract void mo41361s(int i);

    /* renamed from: t */
    public abstract void mo41362t(Typeface typeface, boolean z);

    /* renamed from: u */
    public void mo53555u(C23711d dVar) {
        try {
            mo53556v(dVar);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            C14226d.m35340G0(th);
            C25088a.m62857b(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    /* renamed from: v */
    public abstract void mo53556v(C23711d dVar);
}
