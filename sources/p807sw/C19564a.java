package p807sw;

import android.app.Dialog;
import android.text.Html;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.moovit.C15676b;
import com.moovit.MoovitActivity;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.analytics.AnalyticsFlowKey;
import com.moovit.app.taxi.C15413a;
import com.moovit.app.taxi.providers.TaxiPopupConfig;
import com.moovit.app.taxi.providers.TaxiProvider;
import com.moovit.app.taxi.providers.TaxiProvidersManager;
import com.moovit.image.model.Image;
import com.moovit.network.model.ServerId;
import com.tranzmate.R;
import java.util.Collections;
import java.util.Set;
import p073e7.C4585c;
import p543hq.C17474b;
import p567iq.C17635b;
import p583jk.C17884p;

/* renamed from: sw.a */
public class C19564a extends C15676b<MoovitActivity> {

    /* renamed from: h */
    public static final /* synthetic */ int f49735h = 0;

    public C19564a() {
        super(MoovitActivity.class);
    }

    /* renamed from: I1 */
    public final Set<String> mo22562I1() {
        return Collections.singleton("TAXI_PROVIDERS_MANAGER");
    }

    /* renamed from: N1 */
    public final void mo46755N1(Dialog dialog) {
        TaxiProvider taxiProvider;
        TaxiProvidersManager taxiProvidersManager = (TaxiProvidersManager) mo46750H1("TAXI_PROVIDERS_MANAGER");
        ServerId serverId = (ServerId) mo46752K1().getParcelable("providerId");
        TaxiPopupConfig taxiPopupConfig = null;
        if (serverId != null) {
            taxiProvider = taxiProvidersManager.mo46163c(serverId);
        } else {
            taxiProvider = null;
        }
        if (taxiProvider != null) {
            taxiPopupConfig = taxiProvider.f39980o;
        }
        if (taxiPopupConfig == null) {
            dismissAllowingStateLoss();
            return;
        }
        dialog.setContentView(R.layout.taxi_promo_popup_dialog);
        ImageView imageView = (ImageView) dialog.findViewById(R.id.icon);
        Image image = taxiPopupConfig.f39961b;
        C17884p.m44354Y(imageView).mo51642v(image).mo51628o0(image).mo10850T(imageView);
        ((TextView) dialog.findViewById(R.id.title)).setText(taxiPopupConfig.f39962c);
        TextView textView = (TextView) dialog.findViewById(R.id.subtitle);
        if (TextUtils.isEmpty(taxiPopupConfig.f39965f)) {
            textView.setText(Html.fromHtml(taxiPopupConfig.f39963d));
        } else {
            textView.setText(Html.fromHtml(String.format(taxiPopupConfig.f39963d, new Object[]{taxiPopupConfig.f39965f})));
        }
        Button button = (Button) dialog.findViewById(R.id.button);
        C15413a.m39456a(button, taxiPopupConfig.f39964e);
        button.setTag(taxiProvider.f39976k.f39926e);
        button.setOnClickListener(new C4585c(this, 26));
    }

    /* renamed from: P1 */
    public final void mo45507P1(Object obj, String str) {
        if ("TAXI_PROVIDERS_MANAGER".equals(str)) {
            dismissAllowingStateLoss();
        }
    }

    /* renamed from: R1 */
    public final void mo22564R1(C17474b bVar) {
        C17635b.m43779f(getActivity()).f50173c.mo22850h(AnalyticsFlowKey.POPUP, bVar);
    }

    public final void onPause() {
        super.onPause();
        mo22564R1(new C17474b(AnalyticsEventKey.CLOSE_POPUP));
        FragmentActivity activity = getActivity();
        C17635b.m43779f(activity).f50173c.mo22847b(activity, AnalyticsFlowKey.POPUP, true);
    }

    public final void onResume() {
        super.onResume();
        FragmentActivity activity = getActivity();
        C17635b.m43779f(activity).f50173c.mo22849g(activity, AnalyticsFlowKey.POPUP);
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.OPEN_POPUP);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "taxi_popup");
        mo22564R1(aVar.mo49933a());
    }
}
