package com.moovit.app.ataf;

import android.os.Bundle;
import com.google.android.exoplayer2.p052ui.C4051q;
import com.google.android.exoplayer2.p052ui.C4052r;
import com.moovit.MoovitActivity;
import com.tranzmate.R;
import f00.C16919g;

public class AtafTicketsActivity extends MoovitActivity {

    /* renamed from: U */
    public static final C16919g.C16920a f37610U = new C16919g.C16920a("do_not_show_again", false);

    /* renamed from: e2 */
    public final void mo19425e2(Bundle bundle) {
        super.mo19425e2(bundle);
        setContentView((int) R.layout.ataf_tickets_activity);
        findViewById(R.id.primary_button).setOnClickListener(new C4051q(this, 3));
        findViewById(R.id.secondary_button).setOnClickListener(new C4052r(this, 2));
    }
}
