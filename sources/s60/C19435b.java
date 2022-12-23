package s60;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.C0909a;
import androidx.fragment.app.FragmentManager;
import c00.C13717b;
import c00.C13723g;
import c70.C13751d;
import ce0.C21100e;
import com.google.android.gms.common.Scopes;
import com.moovit.C15682c;
import com.moovit.commons.utils.Color;
import com.moovit.payment.registration.steps.profile.PaymentProfile;
import com.moovit.payment.registration.steps.profile.ProfilesInstructions;
import com.moovit.payment.registration.steps.profile.ProfilesStepManager;
import com.moovit.payment.registration.steps.profile.certificate.ProfileCertificateData;
import com.moovit.request.RequestOptions;
import h60.C17330k1;
import h60.C17333l1;
import i60.C17559a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import k60.C17999a;
import p001a0.C0017h;
import p241s0.C6302b;
import p644lx.C18292g;
import p906wz.C20431c;
import p906wz.C20436g;
import p906wz.C20438i;
import s60.C19433a;
import s60.C19438d;
import t60.C19630a;
import v40.C25747b;
import v40.C25750e;
import v40.C25751f;

/* renamed from: s60.b */
public class C19435b extends C17999a implements C19438d.C19439a, C19433a.C19434a, C19630a.C19631a {

    /* renamed from: u */
    public static final /* synthetic */ int f49435u = 0;

    /* renamed from: r */
    public final C19436a f49436r = new C19436a();

    /* renamed from: s */
    public ProfilesStepManager f49437s;

    /* renamed from: t */
    public List<PaymentProfile> f49438t = new ArrayList();

    /* renamed from: s60.b$a */
    public class C19436a extends C20438i<C17330k1, C17333l1> {
        public C19436a() {
        }

        /* renamed from: a */
        public final void mo313a(C20431c cVar, boolean z) {
            C17330k1 k1Var = (C17330k1) cVar;
            C19435b bVar = C19435b.this;
            int i = C19435b.f49435u;
            C15682c cVar2 = (C15682c) bVar.getChildFragmentManager().mo3983z(C25750e.fragment_container);
            if (cVar2 instanceof C19438d) {
                C19438d dVar = (C19438d) cVar2;
                dVar.f49445q.setClickable(true);
                dVar.f49445q.setTextColor(dVar.f49446r);
                dVar.f49451w.setVisibility(4);
            } else if (cVar2 instanceof C19630a) {
                C19630a aVar = (C19630a) cVar2;
                aVar.f49810p.setClickable(true);
                aVar.f49810p.setTextColor(aVar.f49811q);
                aVar.f49813s.setVisibility(4);
            }
        }

        /* renamed from: k */
        public final void mo21408k(C20431c cVar, C20436g gVar) {
            C17330k1 k1Var = (C17330k1) cVar;
            C17333l1 l1Var = (C17333l1) gVar;
            C19435b bVar = C19435b.this;
            int i = C19435b.f49435u;
            bVar.mo50504u2((C17559a) null);
        }

        /* renamed from: w */
        public final boolean mo21415w(C20431c cVar, Exception exc) {
            C17330k1 k1Var = (C17330k1) cVar;
            C19435b bVar = C19435b.this;
            bVar.mo46795h2(C13751d.m34341b(bVar.requireContext(), (String) null, exc));
            return true;
        }
    }

    /* renamed from: R0 */
    public final void mo51843R0() {
        this.f49438t.clear();
        this.f49437s = null;
    }

    /* renamed from: Z */
    public final void mo51844Z() {
        this.f49437s.f42839b = true;
        mo51850z2();
    }

    /* renamed from: l */
    public final void mo51845l(List<ProfileCertificateData> list) {
        boolean z;
        ProfilesStepManager profilesStepManager = this.f49437s;
        profilesStepManager.f42843f.put(profilesStepManager.f42842e.get(profilesStepManager.f42841d).f42828b, list);
        if (profilesStepManager.f42841d + 1 < profilesStepManager.f42842e.size()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            profilesStepManager.f42841d++;
        } else {
            profilesStepManager.f42840c = true;
        }
        mo51850z2();
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f49437s = (ProfilesStepManager) bundle.getParcelable("information");
            ArrayList parcelableArrayList = bundle.getParcelableArrayList("profiles_selected");
            if (parcelableArrayList != null) {
                this.f49438t = parcelableArrayList;
            }
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(C25751f.payment_registration_step_profiles_fragment, viewGroup, false);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("information", this.f49437s);
        bundle.putParcelableArrayList("profiles_selected", C13717b.m34264k(this.f49438t));
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        mo51850z2();
    }

    /* renamed from: p0 */
    public final void mo51846p0(List<ProfileCertificateData> list) {
        boolean z;
        ProfilesStepManager profilesStepManager = this.f49437s;
        profilesStepManager.f42843f.put(profilesStepManager.f42842e.get(profilesStepManager.f42841d).f42828b, list);
        if (profilesStepManager.f42841d + 1 < profilesStepManager.f42842e.size()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            profilesStepManager.f42841d++;
        } else {
            profilesStepManager.f42840c = true;
        }
        mo51850z2();
    }

    /* renamed from: q2 */
    public final String mo49058q2() {
        return "step_profiles_verification";
    }

    /* renamed from: s2 */
    public final boolean mo50502s2() {
        return false;
    }

    /* renamed from: t */
    public final void mo51847t(List<PaymentProfile> list) {
        this.f49438t = list;
        ArrayList<T> c = C13723g.m34282c(list, new C18292g(1));
        if (c.isEmpty()) {
            this.f49437s = null;
        } else {
            this.f49437s = new ProfilesStepManager(false, false, 0, c, new C6302b(c.size()));
        }
        mo51850z2();
    }

    /* renamed from: w2 */
    public final boolean mo50506w2() {
        return false;
    }

    /* renamed from: y2 */
    public final void mo51848y2(C15682c cVar, String str) {
        FragmentManager childFragmentManager = getChildFragmentManager();
        C0909a K = C0017h.m54K(childFragmentManager, childFragmentManager);
        K.mo4112g(C25747b.slide_fragment_enter, C25747b.slide_fragment_exit, C25747b.slide_fragment_pop_enter, C25747b.slide_fragment_pop_exit);
        int i = C25750e.fragment_container;
        K.mo4111f(i, cVar, str);
        if (childFragmentManager.mo3983z(i) != null) {
            K.mo4110c((String) null);
        }
        K.mo4040d();
    }

    /* renamed from: z1 */
    public final void mo51849z1() {
        ProfilesStepManager profilesStepManager = this.f49437s;
        profilesStepManager.f42843f.remove(profilesStepManager.f42842e.get(profilesStepManager.f42841d).f42828b);
        int i = profilesStepManager.f42841d;
        if (i == 0) {
            profilesStepManager.f42839b = false;
        }
        if (i > 0) {
            profilesStepManager.f42841d = i - 1;
            profilesStepManager.f42840c = false;
        }
    }

    /* renamed from: z2 */
    public final void mo51850z2() {
        if (this.f49438t.isEmpty()) {
            FragmentManager childFragmentManager = getChildFragmentManager();
            String str = C19438d.f49441x;
            if (childFragmentManager.mo3923A(str) == null) {
                ProfilesInstructions profilesInstructions = mo50500p2().f42763g;
                List<PaymentProfile> list = profilesInstructions.f42836b;
                int i = profilesInstructions.f42837c;
                Bundle bundle = new Bundle();
                bundle.putParcelableArrayList("profiles", C13717b.m34264k(list));
                bundle.putInt("maxSelectionNumber", i);
                C19438d dVar = new C19438d();
                dVar.setArguments(bundle);
                mo51848y2(dVar, str);
                return;
            }
            return;
        }
        ProfilesStepManager profilesStepManager = this.f49437s;
        if (profilesStepManager == null || profilesStepManager.f42840c) {
            C15682c cVar = (C15682c) getChildFragmentManager().mo3983z(C25750e.fragment_container);
            if (cVar instanceof C19438d) {
                C19438d dVar2 = (C19438d) cVar;
                dVar2.f49445q.setClickable(false);
                dVar2.f49445q.setTextColor(Color.f41004h.f41007b);
                dVar2.f49451w.setVisibility(0);
            } else if (cVar instanceof C19630a) {
                C19630a aVar = (C19630a) cVar;
                aVar.f49810p.setClickable(false);
                aVar.f49810p.setTextColor(Color.f41004h.f41007b);
                aVar.f49813s.setVisibility(0);
            }
            ArrayList arrayList = new ArrayList(0);
            ProfilesStepManager profilesStepManager2 = this.f49437s;
            if (profilesStepManager2 != null) {
                C13717b.m34255b(Collections.unmodifiableMap(profilesStepManager2.f42843f).values(), arrayList);
            }
            C17330k1 k1Var = new C17330k1(mo46783R1(), this.f49438t, arrayList);
            RequestOptions L1 = mo46777L1();
            L1.f42909f = true;
            mo46793f2("update_profiles_selected", k1Var, L1, this.f49436r);
        } else if (!profilesStepManager.f42839b) {
            List<PaymentProfile> list2 = this.f49438t;
            String str2 = C19433a.f49434n;
            Bundle bundle2 = new Bundle();
            C21100e.m49371w(list2);
            bundle2.putParcelableArrayList("profiles", C13717b.m34264k(list2));
            C19433a aVar2 = new C19433a();
            aVar2.setArguments(bundle2);
            mo51848y2(aVar2, C19433a.f49434n);
        } else {
            PaymentProfile paymentProfile = profilesStepManager.f42842e.get(profilesStepManager.f42841d);
            if (!paymentProfile.f42833g.isEmpty() && getChildFragmentManager().mo3923A(paymentProfile.f42828b.mo19751c()) == null) {
                int i2 = C19630a.f49807u;
                Bundle bundle3 = new Bundle();
                bundle3.putParcelable(Scopes.PROFILE, paymentProfile);
                bundle3.putBoolean("skip", true);
                C19630a aVar3 = new C19630a();
                aVar3.setArguments(bundle3);
                mo51848y2(aVar3, paymentProfile.f42828b.mo19751c());
            }
        }
    }
}
