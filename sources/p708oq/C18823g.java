package p708oq;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import androidx.fragment.app.FragmentActivity;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.navigation.MultiLegNavActivity;
import com.moovit.navigation.NavigationService;
import com.tranzmate.R;
import p543hq.C17474b;
import p584jl.C17885a;
import p613kq.C18116c;

/* renamed from: oq.g */
public class C18823g extends C18116c<MultiLegNavActivity> {
    public C18823g() {
        super(MultiLegNavActivity.class);
    }

    /* renamed from: p2 */
    public final void mo50554p2(Button button) {
        C17885a.m44441i(button, 2131952774, R.attr.roundedButtonMediumStyle, 2131953355);
        button.setText(R.string.quick_action_stop);
        C17885a.m44467v0(button, R.drawable.ic_stop_16);
    }

    /* renamed from: r2 */
    public final void mo50556r2(View view) {
        String str = ((MultiLegNavActivity) this.f40822c).f39109H0;
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "stop_clicked");
        aVar.mo49939g(AnalyticsAttributeKey.NAVIGABLE_ID, str);
        mo46797j2(aVar.mo49933a());
        Context context = view.getContext();
        context.startService(NavigationService.m11309z(context, str, "user_terminated"));
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }
}
