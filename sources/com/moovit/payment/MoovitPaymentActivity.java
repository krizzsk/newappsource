package com.moovit.payment;

import com.moovit.MoovitActivity;
import com.moovit.MoovitApplication;
import p646lz.C18299a;

public class MoovitPaymentActivity extends MoovitActivity {
    /* renamed from: O1 */
    public final void mo19442O1(Object obj, String str) {
        if (isFinishing() || (obj instanceof C18299a.C18302c)) {
            return;
        }
        if ("USER_CONTEXT".equals(str)) {
            MoovitApplication.f37317k.mo44574v(this, mo44550y1());
            finish();
            return;
        }
        super.mo19442O1(obj, str);
    }
}
