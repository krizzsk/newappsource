package p453dw;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.moovit.C15676b;
import com.moovit.MoovitActivity;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.analytics.AnalyticsFlowKey;
import com.moovit.commons.view.TextureVideoHelper;
import com.tranzmate.R;
import p073e7.C4583a;
import p543hq.C17474b;
import p567iq.C17635b;
import p583jk.C17884p;

/* renamed from: dw.l */
public class C16736l extends C15676b<MoovitActivity> {

    /* renamed from: h */
    public static final /* synthetic */ int f43585h = 0;

    public C16736l() {
        super(MoovitActivity.class);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.stop_image_thank_you_fragment, viewGroup, false);
    }

    public final void onStart() {
        super.onStart();
        FragmentActivity activity = getActivity();
        C17635b.m43779f(activity).f50173c.mo22849g(activity, AnalyticsFlowKey.POPUP);
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.OPEN_POPUP);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "thank_you_for_image");
        mo22564R1(aVar.mo49933a());
    }

    public final void onStop() {
        super.onStop();
        mo22564R1(new C17474b(AnalyticsEventKey.CLOSE_POPUP));
        FragmentActivity activity = getActivity();
        C17635b.m43779f(activity).f50173c.mo22847b(activity, AnalyticsFlowKey.POPUP, true);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        TextureVideoHelper textureVideoHelper = new TextureVideoHelper(view.getContext(), C17884p.m44351V(getResources(), R.raw.mov_station_image_thank_you), false);
        textureVideoHelper.mo47172a();
        TextureView textureView = (TextureView) view.findViewById(R.id.video);
        textureView.setTag(textureVideoHelper);
        textureView.setSurfaceTextureListener(textureVideoHelper);
        view.findViewById(R.id.button_ok).setOnClickListener(new C4583a(this, 26));
    }
}
