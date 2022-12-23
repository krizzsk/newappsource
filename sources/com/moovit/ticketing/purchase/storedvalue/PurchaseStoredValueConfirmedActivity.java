package com.moovit.ticketing.purchase.storedvalue;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import c20.C13744a;
import com.moovit.MoovitActivity;
import com.moovit.commons.utils.UiUtils;
import com.moovit.image.model.Image;
import com.moovit.network.model.ServerId;
import com.moovit.ticketing.storedvalue.StoredValueView;
import com.moovit.ticketing.ticket.TicketAgency;
import com.moovit.util.CurrencyAmount;
import java.util.HashSet;
import java.util.Set;
import m80.C12868d;
import m80.C12869e;
import m80.C12870f;
import m80.C12887v;
import p244s3.C6444s;
import p397bu.C13685c;
import p583jk.C17884p;
import p761qy.C19201a;
import p80.C12989a;
import p80.C12991b;
import r10.C19220d;
import r10.C19221e;
import y10.C20686a;

public class PurchaseStoredValueConfirmedActivity extends MoovitActivity {

    /* renamed from: U */
    public static final /* synthetic */ int f23436U = 0;

    /* renamed from: e2 */
    public final void mo19425e2(Bundle bundle) {
        TicketAgency ticketAgency;
        super.mo19425e2(bundle);
        setContentView(C12870f.purchase_stored_value_confirmed_activity);
        C12991b bVar = (C12991b) mo44537r1("TICKETING_CONFIGURATION");
        Intent intent = getIntent();
        ServerId serverId = (ServerId) intent.getParcelableExtra("providerId");
        String stringExtra = intent.getStringExtra("agencyKey");
        if (serverId == null || stringExtra == null) {
            finish();
            return;
        }
        C12989a a = bVar.mo39880a(serverId, stringExtra);
        if (a != null) {
            ticketAgency = a.f32150b;
        } else {
            ticketAgency = null;
        }
        CurrencyAmount currencyAmount = (CurrencyAmount) intent.getParcelableExtra("amount");
        if (ticketAgency == null || currencyAmount == null) {
            finish();
            return;
        }
        ((Button) findViewById(C12869e.dismiss_button)).setOnClickListener(new C19201a(this, 14));
        StoredValueView storedValueView = (StoredValueView) findViewById(C12869e.stored_value_view);
        storedValueView.f23471r.setText(currencyAmount.toString());
        storedValueView.f23472s.setText(ticketAgency.mo24223c());
        C13744a.m34299a(storedValueView.f23472s, UiUtils.Edge.LEFT, ticketAgency.mo24222b());
        Image image = ticketAgency.f23499f;
        View view = storedValueView.f23470q;
        int i = C12868d.img_bg_ticket_default;
        if (image != null) {
            C17884p.m44354Y(view).mo51642v(image).mo51628o0(image).mo22730m(i).mo10848R(new C20686a(view));
        } else {
            C19221e Y = C17884p.m44354Y(view);
            ((C19220d) Y.mo10871m().mo10854X(Integer.valueOf(i))).mo10848R(new C20686a(view));
        }
        Button button = (Button) findViewById(C12869e.validate_button);
        button.setOnClickListener(new C13685c(3, this, serverId, stringExtra));
        C12887v.m32668b().mo39734c(serverId).addOnSuccessListener((Activity) this, new C6444s(button, 6));
    }

    /* renamed from: s1 */
    public final Set<String> mo19438s1() {
        Set<String> s1 = super.mo19438s1();
        ((HashSet) s1).add("TICKETING_CONFIGURATION");
        return s1;
    }
}
