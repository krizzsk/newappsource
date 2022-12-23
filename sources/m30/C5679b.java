package m30;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.fragment.app.C0909a;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import c70.C13751d;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Tasks;
import com.moovit.C15682c;
import com.moovit.MoovitExecutors;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.barcode.Barcode;
import com.moovit.barcode.scan.BarcodeScannerActivity;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.image.C16017c;
import com.moovit.location.C16202a;
import com.moovit.micromobility.MoovitMicroMobilityActivity;
import com.moovit.micromobility.action.MicroMobilityAction;
import com.moovit.micromobility.action.requiredinfo.MicroMobilityRequiredInfo;
import com.moovit.network.model.ServerId;
import com.usebutton.sdk.internal.events.Events;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import l30.C5566a0;
import l30.C5574f;
import l30.C5577i;
import l30.C5589r;
import l30.C5597z;
import mf0.C24362h;
import n30.C5847a;
import n30.C5850c;
import p001a0.C0016g;
import p001a0.C0017h;
import p310x5.C7159d;
import p451du.C16705b;
import p543hq.C17474b;
import p555ie.C17589h;
import p578jf.C17843u;
import p664mu.C18448g;
import p687nt.C18588a;
import p735pt.C18984e;
import p858uz.C20061g;
import p909xe.C20466c;
import p926xv.C20621b;

/* renamed from: m30.b */
public class C5679b extends C15682c<MoovitMicroMobilityActivity> implements C16017c.C16018a, MicroMobilityRequiredInfo.C4143a {

    /* renamed from: q */
    public static final /* synthetic */ int f18460q = 0;

    /* renamed from: n */
    public ServerId f18461n;

    /* renamed from: o */
    public ArrayList f18462o;

    /* renamed from: p */
    public MicroMobilityAction f18463p = null;

    public C5679b() {
        super(MoovitMicroMobilityActivity.class);
    }

    /* renamed from: I1 */
    public final C20061g mo21526I1() {
        return C16202a.get(requireActivity()).getPermissionAwareHighAccuracyFrequentUpdates();
    }

    /* renamed from: g */
    public final /* synthetic */ void mo21527g(Bundle bundle) {
    }

    /* renamed from: j0 */
    public final void mo21528j0(Bundle bundle, Exception exc) {
        mo46795h2(C13751d.m34341b(requireContext(), (String) null, exc));
    }

    /* renamed from: m2 */
    public final void mo21529m2(ServerId serverId, MicroMobilityAction microMobilityAction, C5847a aVar) {
        this.f18463p = null;
        mo46796i2();
        A a = this.f40822c;
        LatLonE6 j = LatLonE6.m40177j(mo46780O1());
        C5577i a2 = C5577i.m13786a();
        String str = microMobilityAction.f14844b;
        ExecutorService executorService = MoovitExecutors.COMPUTATION;
        Tasks.call(executorService, new C20466c(a2, 1)).onSuccessTask(executorService, new C5574f(serverId, str, aVar, j)).addOnFailureListener((Executor) executorService, (OnFailureListener) new C18984e(2)).addOnCompleteListener((Executor) executorService, new C16705b(a2, 2)).addOnSuccessListener((Activity) a, new C20621b(2, this, a)).addOnFailureListener((Activity) a, (OnFailureListener) new C5589r(this, 1)).addOnFailureListener((Activity) a, (OnFailureListener) new C5678a(0, this, a)).addOnCompleteListener((Activity) a, new C18588a(this, 2));
    }

    /* renamed from: n2 */
    public final void mo21530n2(boolean z, Exception exc, C5680c cVar) {
        String str;
        if (cVar != null) {
            str = "action_open_deep_link";
        } else {
            str = null;
        }
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.MICRO_MOBILITY_ACTION_RESULT);
        aVar.mo49941i(AnalyticsAttributeKey.SUCCESS, z);
        aVar.mo49935c(AnalyticsAttributeKey.ERROR_CODE, C13751d.m34343d(exc));
        aVar.mo49945m(AnalyticsAttributeKey.TYPE, str);
        mo46797j2(aVar.mo49933a());
    }

    /* renamed from: o2 */
    public final Object mo21531o2(C5680c cVar) {
        cVar.f18464a.mo46946c(requireActivity());
        return null;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        MicroMobilityAction microMobilityAction;
        if (i != 1001) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 == -1) {
            int i3 = BarcodeScannerActivity.f40810U;
            C24362h.m61211f(intent, "data");
            Barcode barcode = (Barcode) intent.getParcelableExtra("barcode");
            if (barcode != null) {
                C5850c cVar = new C5850c(barcode.f40798b);
                ServerId serverId = this.f18461n;
                if (serverId != null && (microMobilityAction = this.f18463p) != null) {
                    mo21529m2(serverId, microMobilityAction, cVar);
                }
            }
        }
    }

    public final void onCreate(Bundle bundle) {
        MicroMobilityAction microMobilityAction;
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.f18461n = (ServerId) requireArguments.getParcelable("rideId");
        this.f18462o = requireArguments.getParcelableArrayList("actions");
        if (this.f18461n != null) {
            if (bundle != null) {
                microMobilityAction = (MicroMobilityAction) bundle.getParcelable("pendingAction");
            } else {
                microMobilityAction = null;
            }
            this.f18463p = microMobilityAction;
            if (getChildFragmentManager().mo3923A("capture") == null) {
                FragmentManager childFragmentManager = getChildFragmentManager();
                C0909a K = C0017h.m54K(childFragmentManager, childFragmentManager);
                K.mo4041e(0, new C16017c(), "capture", 1);
                K.mo4046l();
                return;
            }
            return;
        }
        throw new IllegalStateException("Did you use MicroMobilityActionsFragment.newInstance(...)?");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(C5566a0.micro_mobility_actions_fragment, viewGroup, false);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("pendingAction", this.f18463p);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        int i;
        MicroMobilityAction microMobilityAction;
        super.onViewCreated(view, bundle);
        List asList = Arrays.asList(new Button[]{(Button) view.findViewById(C5597z.button1), (Button) view.findViewById(C5597z.button2)});
        ArrayList arrayList = this.f18462o;
        if (arrayList != null) {
            i = arrayList.size();
        } else {
            i = 0;
        }
        for (int i2 = 0; i2 < asList.size(); i2++) {
            Button button = (Button) asList.get(i2);
            if (i2 < i) {
                microMobilityAction = (MicroMobilityAction) this.f18462o.get(i2);
            } else {
                microMobilityAction = null;
            }
            if (microMobilityAction != null) {
                button.setText(microMobilityAction.f14845c);
                button.setOnClickListener(new C7159d(3, this, microMobilityAction));
                button.setVisibility(0);
            } else {
                button.setVisibility(8);
            }
        }
    }

    /* renamed from: s1 */
    public final void mo21532s1(File file, boolean z, Bundle bundle) {
        FragmentActivity activity = getActivity();
        MicroMobilityAction microMobilityAction = this.f18463p;
        if (activity != null && microMobilityAction != null) {
            mo46797j2(new C17474b(AnalyticsEventKey.PHOTO_TAKEN));
            Tasks.call(MoovitExecutors.COMPUTATION, new C17589h(file, 4)).addOnSuccessListener((Activity) activity, new C17843u(this, 9)).addOnFailureListener((Activity) activity, (OnFailureListener) new C18448g(this, bundle, 1));
        }
    }

    /* renamed from: t0 */
    public final boolean mo19430t0(String str, int i, Bundle bundle) {
        if ("action_confirmation_dialog".equals(str)) {
            C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
            aVar.mo49939g(AnalyticsAttributeKey.TYPE, C0016g.m17G(i));
            aVar.mo49937e(AnalyticsAttributeKey.RIDE_ID, this.f18461n);
            mo46797j2(aVar.mo49933a());
            if (i == -1) {
                ServerId serverId = (ServerId) bundle.getParcelable("rideId");
                MicroMobilityAction microMobilityAction = (MicroMobilityAction) bundle.getParcelable(Events.PROPERTY_ACTION);
                if (!(serverId == null || microMobilityAction == null)) {
                    microMobilityAction.f14846d.mo19450e1(serverId, microMobilityAction, this);
                }
            }
            return true;
        }
        super.mo19430t0(str, i, bundle);
        return true;
    }
}
