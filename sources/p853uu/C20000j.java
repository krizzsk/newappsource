package p853uu;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.C0909a;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.moovit.C15682c;
import com.moovit.app.mot.p417qr.C15174a;
import com.moovit.app.mot.p417qr.C15176b;
import com.moovit.app.mot.p417qr.C15177c;
import com.moovit.app.mot.p417qr.MotQrCodeViewerActivity;
import com.moovit.location.C16202a;
import com.moovit.network.model.ServerId;
import com.tranzmate.R;
import java.util.Collections;
import java.util.Set;
import p001a0.C0017h;
import p664mu.C18443f;
import p858uz.C20061g;

/* renamed from: uu.j */
public class C20000j extends C15682c<MotQrCodeViewerActivity> {

    /* renamed from: n */
    public static final /* synthetic */ int f50847n = 0;

    public C20000j() {
        super(MotQrCodeViewerActivity.class);
    }

    /* renamed from: I1 */
    public final C20061g mo21526I1() {
        return C16202a.get(requireContext()).getPermissionAwareHighAccuracyFrequentUpdates();
    }

    /* renamed from: K1 */
    public final Set<String> mo23781K1() {
        return Collections.singleton("CONFIGURATION");
    }

    /* renamed from: W1 */
    public final void mo23788W1(View view) {
        mo52271m2();
    }

    /* renamed from: m2 */
    public final void mo52271m2() {
        if (this.f40824e && mo46775H1()) {
            Bundle Q1 = mo46782Q1();
            String string = Q1.getString("priceReference");
            ServerId serverId = (ServerId) Q1.getParcelable("activationId");
            if (string != null) {
                C18443f.m45298d().mo50887a(string).addOnSuccessListener((Activity) requireActivity(), new C19999i(this, string, serverId, 0));
                return;
            }
            throw new IllegalStateException("Did you use MotStationQrCodeViewerFragment.newInstance(...)?");
        }
    }

    /* renamed from: n2 */
    public final void mo52272n2(String str, String str2, ServerId serverId, boolean z) {
        Fragment fragment;
        String str3 = str;
        String str4 = str2;
        ServerId serverId2 = serverId;
        FragmentManager childFragmentManager = getChildFragmentManager();
        C0909a K = C0017h.m54K(childFragmentManager, childFragmentManager);
        boolean z2 = false;
        if (z) {
            FragmentManager childFragmentManager2 = getChildFragmentManager();
            if (childFragmentManager2.mo3926D() > 0) {
                childFragmentManager2.mo3938S(childFragmentManager2.mo3925C(0).getId());
            }
            Fragment A = childFragmentManager2.mo3923A("inspection");
            if (A != null) {
                K.mo4050p(A);
            }
            Fragment A2 = childFragmentManager2.mo3923A("entrance_qr_code_viewer");
            if (A2 != null) {
                K.mo4050p(A2);
            }
            Fragment A3 = childFragmentManager2.mo3923A("inspection_qr_code_viewer");
            if (A3 != null) {
                K.mo4050p(A3);
            }
            Fragment A4 = childFragmentManager2.mo3923A("exit_qr_code_viewer");
            if (A4 != null) {
                K.mo4050p(A4);
            }
        }
        char c = 65535;
        switch (str.hashCode()) {
            case -2003483449:
                if (str3.equals("exit_qr_code_viewer")) {
                    c = 0;
                    break;
                }
                break;
            case -423102031:
                if (str3.equals("inspection_qr_code_viewer")) {
                    c = 1;
                    break;
                }
                break;
            case 1751846260:
                if (str3.equals("inspection")) {
                    c = 2;
                    break;
                }
                break;
            case 1998196783:
                if (str3.equals("entrance_qr_code_viewer")) {
                    c = 3;
                    break;
                }
                break;
        }
        if (c == 0) {
            Bundle bundle = new Bundle();
            bundle.putString("price_reference", str4);
            bundle.putParcelable("activation_id", serverId2);
            fragment = new C15176b();
            fragment.setArguments(bundle);
        } else if (c == 1) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("price_reference", str4);
            bundle2.putParcelable("activation_id", serverId2);
            fragment = new C15177c();
            fragment.setArguments(bundle2);
        } else if (c == 2) {
            Bundle bundle3 = new Bundle();
            bundle3.putString("price_reference", str4);
            bundle3.putParcelable("activation_id", serverId2);
            fragment = new C19998h();
            fragment.setArguments(bundle3);
        } else if (c == 3) {
            Bundle bundle4 = new Bundle();
            bundle4.putString("price_reference", str4);
            bundle4.putParcelable("activation_id", serverId2);
            fragment = new C15174a();
            fragment.setArguments(bundle4);
        } else {
            throw new IllegalStateException(C25541a.m63881k("Unknown fragment tag: ", str3));
        }
        if (!z && childFragmentManager.mo3983z(R.id.fragments_container) != null) {
            z2 = true;
        }
        if (z2) {
            K.mo4112g(R.anim.slide_fragment_enter, R.anim.slide_fragment_exit, R.anim.slide_fragment_pop_enter, R.anim.slide_fragment_pop_exit);
            K.mo4111f(R.id.fragments_container, fragment, str3);
            K.mo4110c(str3);
        } else {
            K.mo4111f(R.id.fragments_container, fragment, str3);
        }
        K.mo4040d();
    }

    public final boolean onBackPressed() {
        FragmentManager childFragmentManager = getChildFragmentManager();
        if (childFragmentManager.mo3926D() <= 0) {
            return false;
        }
        childFragmentManager.mo3936Q();
        return true;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.mot_station_qr_code_viewer_fragment, viewGroup, false);
    }

    public final void onStart() {
        super.onStart();
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.setTitle(R.string.payment_mot_create_qr_page_title);
        }
        mo52271m2();
    }
}
