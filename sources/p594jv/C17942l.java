package p594jv;

import android.app.Activity;
import android.os.Bundle;
import androidx.fragment.app.C0909a;
import androidx.fragment.app.FragmentManager;
import ci0.C21211f;
import com.google.android.gms.tasks.Tasks;
import com.moovit.C15682c;
import com.moovit.MoovitActivity;
import com.moovit.MoovitExecutors;
import com.moovit.app.reports.service.CreateReportRequestData;
import com.moovit.app.reports.service.ReportEntityType;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.location.C16202a;
import com.moovit.request.RequestOptions;
import com.moovit.transit.LocationDescriptor;
import j20.C17706c;
import j20.C17708e;
import java.io.IOException;
import p500fv.C17090o;
import p567iq.C17635b;
import p824tp.C19728f;
import p906wz.C20431c;
import p906wz.C20436g;
import p946ys.C20763d;

/* renamed from: jv.l */
public class C17942l extends C15682c<MoovitActivity> {

    /* renamed from: p */
    public static final /* synthetic */ int f46005p = 0;

    /* renamed from: n */
    public C17944b f46006n;

    /* renamed from: o */
    public String f46007o;

    /* renamed from: jv.l$a */
    public class C17943a extends C21211f {

        /* renamed from: b */
        public final /* synthetic */ CreateReportRequestData f46008b;

        public C17943a(CreateReportRequestData createReportRequestData) {
            this.f46008b = createReportRequestData;
        }

        /* renamed from: a */
        public final void mo313a(C20431c cVar, boolean z) {
            C17930a aVar = (C17930a) cVar;
            C17942l lVar = C17942l.this;
            int i = C17942l.f46005p;
            FragmentManager fragmentManager = lVar.getFragmentManager();
            fragmentManager.getClass();
            C0909a aVar2 = new C0909a(fragmentManager);
            aVar2.mo4050p(lVar);
            aVar2.mo4040d();
        }

        /* renamed from: d */
        public final boolean mo316d(C20431c cVar, IOException iOException) {
            C17930a aVar = (C17930a) cVar;
            C17944b bVar = C17942l.this.f46006n;
            if (bVar != null) {
                bVar.mo45694l(false);
            }
            C17942l lVar = C17942l.this;
            C17635b.m43779f(lVar.getContext()).f50172b.mo42913b(new C17937g(lVar.getActivity(), this.f46008b, (String) null, (String) null), true);
            return true;
        }

        /* renamed from: i */
        public final boolean mo319i(C20431c cVar, IOException iOException) {
            C17930a aVar = (C17930a) cVar;
            C17944b bVar = C17942l.this.f46006n;
            if (bVar != null) {
                bVar.mo45694l(false);
            }
            C17942l lVar = C17942l.this;
            C17635b.m43779f(lVar.getContext()).f50172b.mo42913b(new C17937g(lVar.getActivity(), this.f46008b, (String) null, (String) null), true);
            return true;
        }

        /* renamed from: k */
        public final void mo21408k(C20431c cVar, C20436g gVar) {
            C17930a aVar = (C17930a) cVar;
            C17931b bVar = (C17931b) gVar;
            C17944b bVar2 = C17942l.this.f46006n;
            if (bVar2 != null) {
                bVar2.mo45694l(true);
            }
        }
    }

    /* renamed from: jv.l$b */
    public interface C17944b {
        /* renamed from: l */
        void mo45694l(boolean z);
    }

    public C17942l() {
        super(MoovitActivity.class);
        setRetainInstance(true);
    }

    /* renamed from: Y1 */
    public final void mo46788Y1(MoovitActivity moovitActivity) {
        if (moovitActivity instanceof C17944b) {
            this.f46006n = (C17944b) moovitActivity;
        }
    }

    /* renamed from: m2 */
    public final void mo50472m2(CreateReportRequestData createReportRequestData) {
        if (C17090o.m43019c().mo49689d(createReportRequestData.f39216f).getType().equals(ReportEntityType.LINE)) {
            createReportRequestData.f39214d = this.f46007o;
        }
        C17930a aVar = new C17930a(this.f40822c.mo44548x1(), createReportRequestData, (String) null, (String) null);
        RequestOptions L1 = mo46777L1();
        L1.f42909f = true;
        mo46793f2("createUserReportRequest", aVar, L1, new C17943a(createReportRequestData));
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        CreateReportRequestData createReportRequestData = (CreateReportRequestData) getArguments().getParcelable("reportRequestDataExtra");
        if (createReportRequestData == null) {
            LatLonE6 j = LatLonE6.m40177j(C16202a.get(getActivity()).getPermissionAwareHighAccuracyFrequentUpdates().mo50014i());
            if (j != null) {
                Tasks.call(MoovitExecutors.f37327IO, new C17708e(getContext(), C19728f.m47195a(getContext()), LocationDescriptor.m17770k(j), true)).continueWith(MoovitExecutors.COMPUTATION, new C17706c()).addOnSuccessListener((Activity) getActivity(), new C20763d(this, 3));
                return;
            }
            return;
        }
        mo50472m2(createReportRequestData);
    }
}
