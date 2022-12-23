package l60;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import b00.C13556a;
import c70.C13751d;
import com.moovit.view.address.Address;
import com.moovit.view.address.AddressInputView;
import h60.C17369x0;
import h60.C17372y0;
import i60.C17559a;
import k60.C17999a;
import p242s1.C6333d0;
import p572iw.C17662e;
import p906wz.C20431c;
import p906wz.C20436g;
import p906wz.C20438i;
import v40.C25750e;
import v40.C25751f;

/* renamed from: l60.a */
public class C18176a extends C17999a {

    /* renamed from: u */
    public static final /* synthetic */ int f46417u = 0;

    /* renamed from: r */
    public final C18177a f46418r = new C18177a();

    /* renamed from: s */
    public AddressInputView f46419s;

    /* renamed from: t */
    public C13556a f46420t = null;

    /* renamed from: l60.a$a */
    public class C18177a extends C20438i<C17369x0, C17372y0> {
        public C18177a() {
        }

        /* renamed from: a */
        public final void mo313a(C20431c cVar, boolean z) {
            C17369x0 x0Var = (C17369x0) cVar;
            C18176a aVar = C18176a.this;
            aVar.f46420t = null;
            aVar.mo50501r2();
        }

        /* renamed from: k */
        public final void mo21408k(C20431c cVar, C20436g gVar) {
            C17369x0 x0Var = (C17369x0) cVar;
            C17372y0 y0Var = (C17372y0) gVar;
            C18176a aVar = C18176a.this;
            int i = C18176a.f46417u;
            aVar.mo50504u2((C17559a) null);
        }

        /* renamed from: w */
        public final boolean mo21415w(C20431c cVar, Exception exc) {
            C18176a.this.mo46795h2(C13751d.m34341b(((C17369x0) cVar).f51759b, (String) null, exc));
            return true;
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C25751f.payment_registration_step_address_fragment, viewGroup, false);
        C6333d0.m15030r(inflate.findViewById(C25750e.title), true);
        ((Button) inflate.findViewById(C25750e.button)).setOnClickListener(new C17662e(this, 8));
        this.f46419s = (AddressInputView) inflate.findViewById(C25750e.user_address);
        return inflate;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        Address address = mo50499o2().f42757o;
        if (address != null) {
            this.f46419s.setAddress(address);
        }
    }

    /* renamed from: q2 */
    public final String mo49058q2() {
        return "step_address";
    }
}
