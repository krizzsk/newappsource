package w60;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import c70.C13751d;
import com.moovit.commons.utils.UiUtils;
import com.moovit.image.model.Image;
import com.moovit.marketing.MarketingEventImpressionBinder;
import com.moovit.payment.registration.steps.terms.TermsOfUseInstructions;
import com.moovit.request.UserRequestError;
import h60.C17363v0;
import h60.C17366w0;
import i60.C17559a;
import k60.C17999a;
import p242s1.C6333d0;
import p453dw.C16740o;
import p583jk.C17884p;
import p906wz.C20431c;
import p906wz.C20436g;
import p906wz.C20438i;
import p977zz.C20964s0;
import v40.C25750e;
import v40.C25751f;
import v40.C25754i;
import z20.C20806a;

/* renamed from: w60.b */
public class C20287b extends C17999a {

    /* renamed from: t */
    public static final /* synthetic */ int f51450t = 0;

    /* renamed from: r */
    public final C20288a f51451r = new C20288a();

    /* renamed from: s */
    public TermsOfUseInstructions f51452s;

    /* renamed from: w60.b$a */
    public class C20288a extends C20438i<C17363v0, C17366w0> {
        public C20288a() {
        }

        /* renamed from: a */
        public final void mo313a(C20431c cVar, boolean z) {
            C17363v0 v0Var = (C17363v0) cVar;
            C20287b bVar = C20287b.this;
            int i = C20287b.f51450t;
            bVar.mo50501r2();
        }

        /* renamed from: k */
        public final void mo21408k(C20431c cVar, C20436g gVar) {
            C17363v0 v0Var = (C17363v0) cVar;
            C17366w0 w0Var = (C17366w0) gVar;
            C20287b bVar = C20287b.this;
            int i = C20287b.f51450t;
            bVar.mo50504u2((C17559a) null);
        }

        /* renamed from: w */
        public final boolean mo21415w(C20431c cVar, Exception exc) {
            C17363v0 v0Var = (C17363v0) cVar;
            if (exc instanceof UserRequestError) {
                C20287b bVar = C20287b.this;
                bVar.mo46795h2(C13751d.m34341b(bVar.requireContext(), (String) null, exc));
                return true;
            }
            C20287b bVar2 = C20287b.this;
            bVar2.mo46795h2(C13751d.m34342c(bVar2.requireContext(), (String) null, (Exception) null).mo47684m((CharSequence) null).mo47678g(C25754i.general_error_title).mo47673b());
            return true;
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        TermsOfUseInstructions termsOfUseInstructions = mo50500p2().f42762f;
        this.f51452s = termsOfUseInstructions;
        if (termsOfUseInstructions != null) {
            C20806a.C20807a aVar = new C20806a.C20807a("terms_of_use_screen_view");
            aVar.mo52934b(mo50500p2().f42758b, "payment_context");
            MarketingEventImpressionBinder.m41586a(this, aVar.mo52933a());
            return;
        }
        throw new IllegalStateException("Missing TOU instructions");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(C25751f.payment_registration_step_terms_of_service_fragment, viewGroup, false);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        ImageView imageView = (ImageView) view.findViewById(C25750e.image);
        Image image = this.f51452s.f42876b;
        if (image != null) {
            imageView.setVisibility(0);
            C17884p.m44354Y(imageView).mo51642v(image).mo51628o0(image).mo22729l().mo10850T(imageView);
        } else {
            imageView.setVisibility(8);
        }
        TextView textView = (TextView) view.findViewById(C25750e.title);
        C6333d0.m15030r(textView, true);
        UiUtils.m40234B(textView, this.f51452s.f42877c);
        UiUtils.m40234B((TextView) view.findViewById(C25750e.subtitle), this.f51452s.f42878d);
        C20964s0.m49103u((TextView) view.findViewById(C25750e.legal), this.f51452s.f42879e, new C20286a(this, view));
        Button button = (Button) view.findViewById(C25750e.button);
        button.setOnClickListener(new C16740o(this, 20));
        button.setEnabled(true);
    }

    /* renamed from: q2 */
    public final String mo49058q2() {
        return "step_terms_of_use";
    }

    /* renamed from: s2 */
    public final boolean mo50502s2() {
        return false;
    }
}
