package com.moovit.app.general.aboutandcontact;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.google.android.exoplayer2.p052ui.C4051q;
import com.google.android.exoplayer2.p052ui.C4052r;
import com.moovit.app.MoovitAppActivity;
import com.moovit.commons.utils.UiUtils;
import com.tranzmate.R;
import i00.C17524c;
import p073e7.C4583a;
import p073e7.C4584b;
import p073e7.C4585c;
import p259t5.C6592b;
import p259t5.C6593c;
import p297w5.C6996c;
import p874vr.C20199a;
import q00.C19047a;
import w40.C25761d;

public class AboutAndContactActivity extends MoovitAppActivity {

    /* renamed from: U */
    public static final /* synthetic */ int f38043U = 0;

    /* renamed from: com.moovit.app.general.aboutandcontact.AboutAndContactActivity$a */
    public class C14889a extends C17524c {
        public C14889a() {
        }
    }

    /* renamed from: e2 */
    public final void mo19425e2(Bundle bundle) {
        super.mo19425e2(bundle);
        setContentView((int) R.layout.about_and_contact_activity);
        C19047a.C19048a aVar = C19047a.f48441d;
        if (((Boolean) ((C19047a) getSystemService("user_configuration")).mo51505b(C20199a.f51306x0)).booleanValue()) {
            findViewById(R.id.terms_of_use).setOnClickListener(new C6996c(this, 10));
            findViewById(R.id.privacy).setOnClickListener(new C4584b(this, 7));
            View findViewById = findViewById(R.id.wondo_terms_of_use);
            findViewById.setVisibility(0);
            findViewById.setOnClickListener(new C4585c(this, 7));
            View findViewById2 = findViewById(R.id.wondo_privacy);
            findViewById2.setVisibility(0);
            findViewById2.setOnClickListener(new C4051q(this, 7));
            View findViewById3 = findViewById(R.id.wondo_promotions_policy);
            findViewById3.setVisibility(0);
            findViewById3.setOnClickListener(new C4052r(this, 6));
        } else {
            findViewById(R.id.terms_of_use).setOnClickListener(new C6593c(this, 10));
            findViewById(R.id.privacy).setOnClickListener(new C4583a(this, 7));
            UiUtils.m40238F(8, findViewById(R.id.wondo_terms_of_use), findViewById(R.id.wondo_privacy), findViewById(R.id.wondo_promotions_policy));
        }
        View findViewById4 = findViewById(R.id.partners_and_thanks);
        findViewById4.setOnClickListener(new C6592b(this, 9));
        findViewById4.setVisibility(0);
        TextView x2 = mo44549x2(R.id.moovit_version);
        x2.setText("5.108.1.564");
        if (!C25761d.m64299a().mo83590e()) {
            x2.setOnClickListener(new C14889a());
        }
    }
}
