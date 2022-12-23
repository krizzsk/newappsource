package com.moovit.app.wondo.tickets.codes;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.moovit.app.MoovitAppActivity;
import com.moovit.app.wondo.tickets.model.WondoCode;
import com.moovit.commons.utils.UiUtils;
import com.moovit.commons.view.FormatTextView;
import com.tranzmate.R;
import p304x.C7029b1;
import p761qy.C19201a;
import p977zz.C20964s0;

public class WondoCodeDetailsActivity extends MoovitAppActivity {

    /* renamed from: X */
    public static final /* synthetic */ int f40677X = 0;

    /* renamed from: U */
    public WondoCode f40678U;

    /* renamed from: e2 */
    public final void mo19425e2(Bundle bundle) {
        int i;
        super.mo19425e2(bundle);
        setContentView((int) R.layout.wondo_code_details_activity);
        Intent intent = getIntent();
        if (intent != null) {
            this.f40678U = (WondoCode) intent.getParcelableExtra("wondoCode");
        }
        ((TextView) findViewById(R.id.title)).setText(this.f40678U.f40698d.f40705f);
        ((TextView) findViewById(R.id.code)).setText(this.f40678U.f40697c);
        FormatTextView formatTextView = (FormatTextView) findViewById(R.id.copy_description);
        formatTextView.setArguments(this.f40678U.f40698d.f40701b);
        View findViewById = findViewById(R.id.copy_to_clipboard);
        findViewById.setOnClickListener(new C19201a(this, 1));
        if (this.f40678U.f40700f) {
            i = 8;
        } else {
            i = 0;
        }
        UiUtils.m40238F(i, formatTextView, findViewById);
        ((TextView) findViewById(R.id.description)).setText(this.f40678U.f40698d.f40706g);
        ((TextView) findViewById(R.id.availability_description)).setText(this.f40678U.f40698d.f40707h);
        TextView textView = (TextView) findViewById(R.id.terms_and_conditions);
        String string = getString(R.string.wondo_code_details_terms_and_conditions_link);
        textView.setText(getString(R.string.wondo_code_details_terms_and_conditions, new Object[]{string}));
        C20964s0.m49105w(textView, string, false, new C7029b1(this, 8));
    }
}
