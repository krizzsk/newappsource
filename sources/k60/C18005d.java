package k60;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.C0909a;
import androidx.fragment.app.FragmentManager;
import c70.C13751d;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.design.view.AlertMessageView;
import com.moovit.image.C16017c;
import com.moovit.image.entity.upload.EntityImageUploadWorker;
import com.moovit.request.RequestOptions;
import h60.C17309d1;
import h60.C17312e1;
import i60.C17559a;
import java.io.File;
import p001a0.C0017h;
import p453dw.C16740o;
import p543hq.C17474b;
import p906wz.C20431c;
import p906wz.C20436g;
import p906wz.C20438i;
import v40.C25750e;
import v40.C25751f;

/* renamed from: k60.d */
public class C18005d extends C17999a implements C16017c.C16018a {

    /* renamed from: t */
    public static final /* synthetic */ int f46105t = 0;

    /* renamed from: r */
    public final C18006a f46106r = new C18006a();

    /* renamed from: s */
    public File f46107s;

    /* renamed from: k60.d$a */
    public class C18006a extends C20438i<C17309d1, C17312e1> {
        public C18006a() {
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo313a(C20431c cVar, boolean z) {
            C17309d1 d1Var = (C17309d1) cVar;
        }

        /* renamed from: k */
        public final void mo21408k(C20431c cVar, C20436g gVar) {
            C17309d1 d1Var = (C17309d1) cVar;
            C17312e1 e1Var = (C17312e1) gVar;
            C18005d dVar = C18005d.this;
            EntityImageUploadWorker.m40807a(dVar.requireContext(), EntityImageUploadWorker.EntityImageType.VERIFICATION, dVar.f46107s.getPath(), "0---0", (LatLonE6) null);
            dVar.mo50504u2((C17559a) null);
        }

        /* renamed from: w */
        public final boolean mo21415w(C20431c cVar, Exception exc) {
            C17309d1 d1Var = (C17309d1) cVar;
            C18005d dVar = C18005d.this;
            dVar.mo46795h2(C13751d.m34341b(dVar.requireContext(), (String) null, exc));
            return true;
        }
    }

    static {
        Class<C18005d> cls = C18005d.class;
    }

    /* renamed from: g */
    public final /* synthetic */ void mo21527g(Bundle bundle) {
    }

    /* renamed from: j0 */
    public final /* synthetic */ void mo21528j0(Bundle bundle, Exception exc) {
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f46107s = (File) bundle.getSerializable("id_photo");
        }
        FragmentManager childFragmentManager = getChildFragmentManager();
        C0909a K = C0017h.m54K(childFragmentManager, childFragmentManager);
        K.mo4041e(0, new C16017c(), "image_provider_fragment", 1);
        K.mo4040d();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C25751f.payment_registration_step_id_verification_fragment, viewGroup, false);
        ((AlertMessageView) inflate.findViewById(C25750e.message_view)).setPositiveButtonClickListener(new C16740o(this, 17));
        return inflate;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putSerializable("id_photo", this.f46107s);
    }

    /* renamed from: q2 */
    public final String mo49058q2() {
        return "step_id_verification";
    }

    /* renamed from: s1 */
    public final void mo21532s1(File file, boolean z, Bundle bundle) {
        if (getContext() != null) {
            C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.PHOTO_TAKEN);
            aVar.mo49939g(AnalyticsAttributeKey.ID, "0---0");
            mo46797j2(aVar.mo49933a());
            this.f46107s = file;
            C17309d1 d1Var = new C17309d1(mo46783R1());
            RequestOptions L1 = mo46777L1();
            L1.f42909f = true;
            mo46793f2("set_id_verification", d1Var, L1, this.f46106r);
        }
    }
}
