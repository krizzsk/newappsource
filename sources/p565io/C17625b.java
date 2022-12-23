package p565io;

import android.os.Bundle;
import androidx.fragment.app.C0942l;
import com.masabi.justride.sdk.exception.MissingArgumentException;
import mf0.C24362h;
import p247s6.C6478c;
import p469eo.C16846b;
import p565io.C17625b;
import p587jo.C17901a;
import p605ki.C18047b;

/* renamed from: io.b */
public abstract class C17625b<F extends C17625b<F, P>, P extends C17901a<F>> extends C0942l {

    /* renamed from: d */
    public static final /* synthetic */ int f45308d = 0;

    /* renamed from: b */
    public P f45309b;

    /* renamed from: c */
    public final Class<? extends C17901a.C17902a<F, P>> f45310c;

    public C17625b(Class<? extends C17901a.C17902a<F, P>> cls) {
        this.f45310c = cls;
    }

    /* renamed from: H1 */
    public final P mo50082H1() {
        P p = this.f45309b;
        if (p != null) {
            return p;
        }
        C24362h.m61217l("presenter");
        throw null;
    }

    public void onCreate(Bundle bundle) throws MissingArgumentException {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            String string = arguments.getString("KEY_SDK_INSTANCE_IDENTIFIER");
            if (string != null) {
                C18047b.f46173p.getClass();
                C6478c cVar = C18047b.C18048a.m44717a(string).f46180j;
                cVar.getClass();
                P a = ((C17901a.C17902a) ((C16846b) cVar.f20215b).mo49505a(this.f45310c, (String) null)).mo50454a(this);
                C24362h.m61210e(a, "presenterFactory.create(…entedDialogFragment as F)");
                this.f45309b = a;
                return;
            }
            throw new MissingArgumentException("Cannot load DialogFragment without a Justride SDK instance identifier");
        }
        throw new MissingArgumentException("Cannot load DialogFragment with null arguments");
    }
}
