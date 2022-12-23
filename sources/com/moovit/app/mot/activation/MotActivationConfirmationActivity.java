package com.moovit.app.mot.activation;

import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import android.widget.Button;
import android.widget.TextView;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.app.MoovitAppActivity;
import com.moovit.app.mot.model.MotActivation;
import com.moovit.app.mot.view.MotActivationView;
import com.moovit.commons.view.FormatTextView;
import com.moovit.util.time.C7925b;
import com.tranzmate.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import p073e7.C4584b;
import p297w5.C6996c;
import p543hq.C17474b;
import p977zz.C20964s0;

public class MotActivationConfirmationActivity extends MoovitAppActivity {

    /* renamed from: Y */
    public static final /* synthetic */ int f38971Y = 0;

    /* renamed from: U */
    public ArrayList f38972U;

    /* renamed from: X */
    public MotActivation f38973X;

    /* renamed from: e2 */
    public final void mo19425e2(Bundle bundle) {
        int i;
        int i2;
        super.mo19425e2(bundle);
        setContentView((int) R.layout.mot_activation_confirmation_activity);
        Intent intent = getIntent();
        if (intent != null) {
            ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("activations");
            this.f38972U = parcelableArrayListExtra;
            this.f38973X = (MotActivation) parcelableArrayListExtra.get(0);
        }
        int size = this.f38972U.size();
        TextView x2 = mo44549x2(R.id.subtitle);
        if (size == 1) {
            i = R.string.payment_mot_validation_ride;
        } else {
            i = R.string.payment_mot_validation_rides;
        }
        x2.setText(i);
        long j = this.f38973X.f38998o;
        String j2 = C7925b.m18022j(this, j);
        String l = C7925b.m18024l(this, j);
        String t = C20964s0.m49102t(getString(R.string.string_list_delimiter_pipe), j2, l);
        SpannableString spannableString = new SpannableString(t);
        spannableString.setSpan(new StyleSpan(1), 0, t.length(), 33);
        ((FormatTextView) findViewById(R.id.time)).setSpannedArguments(spannableString);
        ((MotActivationView) findViewById(R.id.activation_view)).mo45633a(this.f38973X, this.f38972U.size());
        findViewById(R.id.close_view).setOnClickListener(new C6996c(this, 20));
        int size2 = this.f38972U.size();
        Button button = (Button) findViewById(R.id.show_qr_action);
        if (size2 == 1) {
            i2 = R.string.payment_mot_validation_qr;
        } else {
            i2 = R.string.payment_mot_validation_qrs;
        }
        button.setText(i2);
        button.setOnClickListener(new C4584b(this, 19));
    }

    /* renamed from: m1 */
    public final C17474b.C17475a mo19762m1() {
        Intent intent = getIntent();
        if (intent != null) {
            ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("activations");
            this.f38972U = parcelableArrayListExtra;
            this.f38973X = (MotActivation) parcelableArrayListExtra.get(0);
        }
        C17474b.C17475a m1 = super.mo19762m1();
        m1.mo49937e(AnalyticsAttributeKey.ID, this.f38973X.f38985b);
        m1.mo49935c(AnalyticsAttributeKey.COUNT, this.f38972U.size());
        return m1;
    }

    /* renamed from: s1 */
    public final Set<String> mo19438s1() {
        Set<String> s1 = super.mo19438s1();
        ((HashSet) s1).add("MOT_SUPPORT_VALIDATOR");
        return s1;
    }
}
