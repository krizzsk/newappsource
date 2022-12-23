package p472er;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.exoplayer2.p052ui.C4052r;
import com.moovit.C15676b;
import com.moovit.MoovitActivity;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.analytics.AnalyticsFlowKey;
import com.moovit.commons.utils.AppDeepLink;
import com.moovit.commons.utils.UiUtils;
import com.moovit.image.model.ResourceImage;
import com.moovit.itinerary.C16080a;
import com.moovit.itinerary.model.leg.CarpoolLeg;
import com.tranzmate.R;
import java.util.Set;
import p472er.C16865g;
import p543hq.C17474b;
import p567iq.C17635b;
import p583jk.C17884p;

/* renamed from: er.h */
public class C16867h extends C15676b<MoovitActivity> {

    /* renamed from: j */
    public static final /* synthetic */ int f43872j = 0;

    /* renamed from: h */
    public CarpoolLeg.CarpoolProvider f43873h;

    /* renamed from: i */
    public AppDeepLink f43874i;

    public C16867h() {
        super(MoovitActivity.class);
    }

    /* renamed from: R1 */
    public final void mo22564R1(C17474b bVar) {
        C17635b.m43779f(requireContext()).f50173c.mo22850h(AnalyticsFlowKey.POPUP, bVar);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle K1 = mo46752K1();
        this.f43873h = (CarpoolLeg.CarpoolProvider) K1.getParcelable("provider");
        this.f43874i = (AppDeepLink) K1.getParcelable("appDeepLink");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ResourceImage resourceImage;
        String str;
        String str2;
        String str3;
        Context context = layoutInflater.getContext();
        View inflate = layoutInflater.inflate(R.layout.carpool_popup_dialog_fragment, viewGroup, false);
        CarpoolLeg.CarpoolProvider carpoolProvider = this.f43873h;
        Set<CarpoolLeg.CarpoolProvider> set = C16865g.f43870a;
        int[] iArr = C16865g.C16866a.f43871a;
        int i = iArr[carpoolProvider.ordinal()];
        if (i == 1) {
            resourceImage = new ResourceImage(R.drawable.img_waze_carpool, new String[0]);
        } else if (i == 3 || i == 4) {
            resourceImage = new ResourceImage(R.drawable.img_blabla_carpool, new String[0]);
        } else {
            resourceImage = new ResourceImage(R.drawable.img_other_carpool, new String[0]);
        }
        ImageView imageView = (ImageView) inflate.findViewById(R.id.image);
        C17884p.m44354Y(imageView).mo51642v(resourceImage).mo51628o0(resourceImage).mo10850T(imageView);
        TextView textView = (TextView) inflate.findViewById(R.id.title);
        CarpoolLeg.CarpoolProvider carpoolProvider2 = this.f43873h;
        if (iArr[carpoolProvider2.ordinal()] != 1) {
            str = context.getString(R.string.carpool_goto_provider_dialog_title, new Object[]{C16865g.m42679b(context, carpoolProvider2)});
        } else {
            str = context.getString(R.string.carpool_waze_dialog_title);
        }
        UiUtils.m40234B(textView, str);
        TextView textView2 = (TextView) inflate.findViewById(R.id.subtitle);
        CarpoolLeg.CarpoolProvider carpoolProvider3 = this.f43873h;
        if (iArr[carpoolProvider3.ordinal()] != 1) {
            str2 = context.getString(R.string.carpool_goto_provider_dialog_message, new Object[]{C16865g.m42679b(context, carpoolProvider3)});
        } else {
            str2 = context.getString(R.string.carpool_waze_dialog_message);
        }
        UiUtils.m40234B(textView2, str2);
        Button button = (Button) inflate.findViewById(R.id.button);
        if (iArr[this.f43873h.ordinal()] != 1) {
            str3 = context.getString(R.string.carpool_goto_provider_dialog_action);
        } else {
            str3 = context.getString(R.string.carpool_waze_dialog_action);
        }
        button.setText(str3);
        button.setOnClickListener(new C4052r(this, 3));
        return inflate;
    }

    public final void onStart() {
        super.onStart();
        Context requireContext = requireContext();
        C17635b.m43779f(requireContext).f50173c.mo22849g(requireContext, AnalyticsFlowKey.POPUP);
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.OPEN_POPUP);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "popup_ride_hailing_preview");
        aVar.mo49939g(AnalyticsAttributeKey.SOURCE, C16080a.m40960p(this.f43873h).name());
        mo22564R1(aVar.mo49933a());
    }

    public final void onStop() {
        super.onStop();
        Context requireContext = requireContext();
        C17635b.m43779f(requireContext).f50173c.mo22847b(requireContext, AnalyticsFlowKey.POPUP, true);
        mo22564R1(new C17474b(AnalyticsEventKey.CLOSE_POPUP));
    }
}
