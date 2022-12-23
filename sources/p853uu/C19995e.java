package p853uu;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.moovit.C15682c;
import com.moovit.MoovitExecutors;
import com.moovit.app.MoovitAppActivity;
import com.moovit.app.mot.model.MotActivation;
import com.moovit.network.model.ServerId;
import com.moovit.util.p339qr.QrCodesPagerView;
import com.tranzmate.R;
import java.util.List;
import p073e7.C4585c;
import p372at.C13515b;
import p664mu.C18443f;

/* renamed from: uu.e */
public class C19995e extends C15682c<MoovitAppActivity> {

    /* renamed from: p */
    public static final /* synthetic */ int f50836p = 0;

    /* renamed from: n */
    public QrCodesPagerView f50837n;

    /* renamed from: o */
    public List<MotActivation> f50838o;

    public C19995e() {
        super(MoovitAppActivity.class);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.mot_regional_qr_code_viewer_fragment, viewGroup, false);
        QrCodesPagerView qrCodesPagerView = (QrCodesPagerView) inflate.findViewById(R.id.qr_pager_view);
        this.f50837n = qrCodesPagerView;
        qrCodesPagerView.f23880h.addOnPageChangeListener(new C19994d(this));
        inflate.findViewById(R.id.show_activation).setOnClickListener(new C4585c(this, 18));
        return inflate;
    }

    public final void onStart() {
        super.onStart();
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.setTitle(R.string.payment_mot_rides_qr_title);
        }
        Bundle Q1 = mo46782Q1();
        String string = Q1.getString("price_reference");
        ServerId serverId = (ServerId) Q1.getParcelable("activation_id");
        if (string != null) {
            C18443f.m45298d().mo50887a(string).onSuccessTask(MoovitExecutors.COMPUTATION, new C19991a(serverId)).addOnSuccessListener((Activity) requireActivity(), new C13515b(this, 1));
            return;
        }
        throw new IllegalStateException("Did you use MotRegionalQrCodeViewerFragment.newInstance(...)?");
    }
}
