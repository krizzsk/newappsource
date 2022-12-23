package com.moovit.app.useraccount;

import android.widget.TextView;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.design.view.list.ListItemView;
import com.tranzmate.R;
import p543hq.C17474b;

public class ConnectActivity extends AbstractConnectActivity {

    /* renamed from: l0 */
    public static final /* synthetic */ int f40549l0 = 0;

    /* renamed from: A2 */
    public final void mo46543A2(ListItemView listItemView) {
        listItemView.setTitle((int) R.string.user_account_push_title);
    }

    /* renamed from: m1 */
    public final C17474b.C17475a mo19762m1() {
        C17474b.C17475a m1 = super.mo19762m1();
        m1.mo49941i(AnalyticsAttributeKey.IS_LOGGED_IN, false);
        return m1;
    }

    /* renamed from: z2 */
    public final void mo46549z2(TextView textView) {
        textView.setText(R.string.user_account_push_subtitle);
    }
}
