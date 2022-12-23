package p501fw;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.moovit.C15676b;
import com.moovit.MoovitActivity;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.tranzmate.R;
import p073e7.C4585c;
import p453dw.C16740o;
import p543hq.C17474b;

/* renamed from: fw.l */
public class C17115l extends C15676b<MoovitActivity> {

    /* renamed from: h */
    public static final /* synthetic */ int f44295h = 0;

    public C17115l() {
        super(MoovitActivity.class);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setCancelable(false);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.restore_dialog_fragment, viewGroup, false);
    }

    public final void onStart() {
        super.onStart();
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.CONTENT_SHOWN);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "restore_subscription_screen_impression");
        mo22564R1(aVar.mo49933a());
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        ((Button) view.findViewById(R.id.primary_button)).setOnClickListener(new C4585c(this, 25));
        ((Button) view.findViewById(R.id.secondary_button)).setOnClickListener(new C16740o(this, 1));
    }
}
