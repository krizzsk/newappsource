package p853uu;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.moovit.C15682c;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.mot.p417qr.MotQrCodeViewerActivity;
import com.moovit.network.model.ServerId;
import com.tranzmate.R;
import p543hq.C17474b;
import p664mu.C18443f;

/* renamed from: uu.h */
public class C19998h extends C15682c<MotQrCodeViewerActivity> {

    /* renamed from: n */
    public static final /* synthetic */ int f50842n = 0;

    public C19998h() {
        super(MotQrCodeViewerActivity.class);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.mot_station_inspection_fragment, viewGroup, false);
    }

    public final void onStart() {
        super.onStart();
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.CONTENT_SHOWN);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "train_active_ride_impression");
        mo46797j2(aVar.mo49933a());
        Bundle Q1 = mo46782Q1();
        String string = Q1.getString("price_reference");
        ServerId serverId = (ServerId) Q1.getParcelable("activation_id");
        if (string != null) {
            C18443f.m45298d().mo50887a(string).addOnSuccessListener((Activity) requireActivity(), new C19992b(1, this, string, serverId));
            return;
        }
        throw new IllegalStateException("Did you use MOTCreateExitQRFragment.newInstance(...)?");
    }
}
