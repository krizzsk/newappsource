package com.masabi.justride.sdk.p415ui.features.ticket_info;

import android.os.Bundle;
import androidx.appcompat.app.ActionBar;
import androidx.fragment.app.Fragment;
import com.masabi.justride.sdk.p415ui.base.activities.BaseContainerActivity;
import p605ki.C18057k;
import p682no.C18578a;
import p775ro.C19295b;
import p847uo.C19964a;

/* renamed from: com.masabi.justride.sdk.ui.features.ticket_info.TicketInfoActivity */
public class TicketInfoActivity extends BaseContainerActivity implements C19295b {

    /* renamed from: y */
    public static final /* synthetic */ int f37205y = 0;

    /* renamed from: d1 */
    public final String mo44387d1() {
        return ((C18578a) mo44385b1().f46184n.f47828a).f47304h;
    }

    /* renamed from: e1 */
    public final String mo44388e1() {
        return ((C18578a) mo44385b1().f46184n.f47828a).f47305i;
    }

    /* renamed from: f1 */
    public final Fragment mo44389f1(Bundle bundle) {
        C19964a aVar = new C19964a();
        aVar.setArguments(bundle);
        aVar.f50760k = this;
        return aVar;
    }

    public final void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(C18057k.animate_sub_navigation_static, C18057k.animate_sub_navigation_enter_out);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.mo791m(false);
        }
    }

    /* renamed from: y0 */
    public final void mo44434y0(String str) {
        if (getSupportActionBar() != null) {
            getSupportActionBar().mo801w(str);
        }
    }
}
