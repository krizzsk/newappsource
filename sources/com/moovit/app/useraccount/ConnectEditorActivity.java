package com.moovit.app.useraccount;

import android.widget.TextView;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.design.view.list.ListItemView;
import com.tranzmate.R;
import p543hq.C17474b;

public class ConnectEditorActivity extends AbstractConnectActivity {

    /* renamed from: l0 */
    public static final /* synthetic */ int f40550l0 = 0;

    /* renamed from: A2 */
    public final void mo46543A2(ListItemView listItemView) {
        listItemView.setTitle((int) R.string.user_account_connect_community_title);
    }

    /* renamed from: c2 */
    public final void mo24880c2() {
        super.mo24880c2();
        mo44545v2(new C17474b.C17475a(AnalyticsEventKey.CLOSE_POPUP).mo49933a());
    }

    /* renamed from: f2 */
    public final void mo24881f2() {
        super.mo24881f2();
        mo44545v2(new C17474b.C17475a(AnalyticsEventKey.OPEN_POPUP).mo49933a());
    }

    /* renamed from: z2 */
    public final void mo46549z2(TextView textView) {
        textView.setText(R.string.user_account_connect_community_message);
    }
}
