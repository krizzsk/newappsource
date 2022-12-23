package p453dw;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import com.moovit.C15676b;
import com.moovit.MoovitActivity;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.analytics.AnalyticsFlowKey;
import com.moovit.commons.view.TextureVideoHelper;
import com.moovit.network.model.ServerId;
import com.tranzmate.R;
import p543hq.C17474b;
import p567iq.C17635b;
import p583jk.C17884p;

/* renamed from: dw.p */
public class C16741p extends C15676b<MoovitActivity> {

    /* renamed from: j */
    public static String f43600j = C16741p.class.getName();

    /* renamed from: h */
    public ServerId f43601h;

    /* renamed from: i */
    public boolean f43602i;

    /* renamed from: dw.p$a */
    public interface C16742a {
        /* renamed from: O0 */
        void mo49421O0(ServerId serverId);
    }

    public C16741p() {
        super(MoovitActivity.class);
    }

    /* renamed from: R1 */
    public final void mo22564R1(C17474b bVar) {
        C17635b.m43779f(requireContext()).f50173c.mo22850h(AnalyticsFlowKey.POPUP, bVar);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f43601h = (ServerId) mo46752K1().getParcelable("stopId");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.take_stop_image_fragment, viewGroup, false);
    }

    public final void onStart() {
        super.onStart();
        Context requireContext = requireContext();
        C17635b.m43779f(requireContext).f50173c.mo22849g(requireContext, AnalyticsFlowKey.POPUP);
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.OPEN_POPUP);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "popup_take_photo");
        mo22564R1(aVar.mo49933a());
    }

    public final void onStop() {
        super.onStop();
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.CLOSE_POPUP);
        aVar.mo49941i(AnalyticsAttributeKey.SUCCESS, this.f43602i);
        mo22564R1(aVar.mo49933a());
        Context requireContext = requireContext();
        C17635b.m43779f(requireContext).f50173c.mo22847b(requireContext, AnalyticsFlowKey.POPUP, true);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        view.findViewById(R.id.take_photo).setOnClickListener(new C16740o(this, 0));
        TextureVideoHelper textureVideoHelper = new TextureVideoHelper(view.getContext(), C17884p.m44351V(getResources(), R.raw.mov_station_image_capture), false);
        textureVideoHelper.mo47172a();
        TextureView textureView = (TextureView) view.findViewById(R.id.video);
        textureView.setTag(textureVideoHelper);
        textureView.setSurfaceTextureListener(textureVideoHelper);
    }
}
