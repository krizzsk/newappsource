package com.moovit.micromobility.damage;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import c00.C13717b;
import com.google.android.material.textfield.TextInputLayout;
import com.moovit.gallery.EmbeddedGalleryFragment;
import com.moovit.micromobility.MoovitMicroMobilityActivity;
import l30.C5566a0;
import l30.C5597z;
import p30.C6061a;
import p739px.C19037a;
import p977zz.C20964s0;

public class MicroMobilityReportDamageActivity extends MoovitMicroMobilityActivity implements EmbeddedGalleryFragment.C15875a {

    /* renamed from: l0 */
    public static final /* synthetic */ int f14858l0 = 0;

    /* renamed from: U */
    public String f14859U;

    /* renamed from: X */
    public String f14860X;

    /* renamed from: Y */
    public EditText f14861Y;

    /* renamed from: Z */
    public Button f14862Z;

    /* renamed from: O */
    public final void mo19478O() {
        mo19480y2();
    }

    /* renamed from: R0 */
    public final void mo19479R0() {
        mo19480y2();
    }

    /* renamed from: V0 */
    public final void mo19423V0(Bundle bundle, String str) {
        if ("report_sent_successfully_dialog".equals(str)) {
            setResult(-1);
            finish();
        }
    }

    /* renamed from: e2 */
    public final void mo19425e2(Bundle bundle) {
        super.mo19425e2(bundle);
        setContentView(C5566a0.micro_mobility_report_damage_activity);
        Intent intent = getIntent();
        this.f14859U = intent.getStringExtra("serviceId");
        this.f14860X = intent.getStringExtra("itemId");
        if (C20964s0.m49090h(this.f14859U) || C20964s0.m49090h(this.f14860X)) {
            throw new IllegalStateException("Did you use MicroMobilityReportDamageActivity.createStartingIntent(...)?");
        }
        EditText editText = ((TextInputLayout) findViewById(C5597z.description)).getEditText();
        this.f14861Y = editText;
        editText.addTextChangedListener(new C6061a(this));
        Button button = (Button) findViewById(C5597z.action_send);
        this.f14862Z = button;
        button.setOnClickListener(new C19037a(this, 6));
    }

    /* renamed from: y2 */
    public final void mo19480y2() {
        boolean z;
        Button button = this.f14862Z;
        if (C20964s0.m49092j(this.f14861Y.getText()) || C13717b.m34258e(((EmbeddedGalleryFragment) mo44529n1(C5597z.gallery)).f41477q)) {
            z = false;
        } else {
            z = true;
        }
        button.setEnabled(z);
    }
}
