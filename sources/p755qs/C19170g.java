package p755qs;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.appsflyer.ServerParameters;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.moovit.C15676b;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.analytics.AnalyticsFlowKey;
import com.moovit.app.MoovitAppActivity;
import com.moovit.app.general.settings.privacy.C14894a;
import com.tranzmate.R;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import p297w5.C6994a;
import p304x.C7073m;
import p543hq.C17474b;
import p567iq.C17635b;
import p977zz.C20964s0;

/* renamed from: qs.g */
public class C19170g extends C15676b<MoovitAppActivity> {

    /* renamed from: j */
    public static final /* synthetic */ int f48751j = 0;

    /* renamed from: h */
    public long f48752h;

    /* renamed from: i */
    public String f48753i = "PRIVACY_NOT_AGREED";

    public C19170g() {
        super(MoovitAppActivity.class);
    }

    /* renamed from: I1 */
    public final Set<String> mo22562I1() {
        return Collections.singleton("USER_CONTEXT");
    }

    /* renamed from: R1 */
    public final void mo22564R1(C17474b bVar) {
        C17635b.m43779f(requireContext()).f50173c.mo22850h(AnalyticsFlowKey.POPUP, bVar);
    }

    /* renamed from: S1 */
    public final void mo51599S1(Context context, String str) {
        this.f48753i = str;
        C14894a.m37560b(context).mo45018h();
        dismissAllowingStateLoss();
    }

    /* renamed from: T1 */
    public final boolean mo51600T1() {
        if (C14894a.m37560b(requireContext()).mo45017g() || SystemClock.elapsedRealtime() - this.f48752h <= TimeUnit.SECONDS.toMillis(1)) {
            return false;
        }
        return true;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        Context requireContext = requireContext();
        FirebaseAnalytics.getInstance(requireContext).mo43247a((Bundle) null, "privacy_update_dialog_on_cancel");
        if (!C14894a.m37560b(requireContext()).mo45017g()) {
            mo51599S1(requireContext, "PRIVACY_AGREED_BY_CANCEL");
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.privacy_update_dialog, viewGroup, false);
    }

    public final void onStart() {
        super.onStart();
        this.f48752h = SystemClock.elapsedRealtime();
        Context requireContext = requireContext();
        FirebaseAnalytics.getInstance(requireContext).mo43247a((Bundle) null, "privacy_update_dialog_impression");
        C17635b.m43779f(requireContext).f50173c.mo22849g(requireContext, AnalyticsFlowKey.POPUP);
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.OPEN_POPUP);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "privacy_update");
        mo22564R1(aVar.mo49933a());
    }

    public final void onStop() {
        super.onStop();
        Context requireContext = requireContext();
        if (mo51600T1()) {
            mo51599S1(requireContext, "PRIVACY_AGREED_AUTOMATICALLY");
        }
        Bundle bundle = new Bundle(1);
        bundle.putString(ServerParameters.STATUS, this.f48753i);
        FirebaseAnalytics.getInstance(requireContext).mo43247a(bundle, "privacy_update_dialog_stop");
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.CLOSE_POPUP);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "privacy_update");
        aVar.mo49939g(AnalyticsAttributeKey.STATUS, this.f48753i);
        mo22564R1(aVar.mo49933a());
        C17635b.m43779f(requireContext).f50173c.mo22847b(requireContext, AnalyticsFlowKey.POPUP, true);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        TextView textView = (TextView) view.findViewById(R.id.terms);
        String string = getString(R.string.privacy_update_dialog_message_hyperlink);
        textView.setText(getString(R.string.privacy_update_dialog_message, string));
        C20964s0.m49105w(textView, string, false, new C7073m(this, 9));
        view.findViewById(R.id.continue_button).setOnClickListener(new C6994a(this, 7));
    }
}
