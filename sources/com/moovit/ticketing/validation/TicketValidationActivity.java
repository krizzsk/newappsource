package com.moovit.ticketing.validation;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.tasks.OnFailureListener;
import com.moovit.MoovitActivity;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.network.model.ServerId;
import com.moovit.ticketing.ticket.TicketId;
import i90.C12761a;
import m80.C12870f;
import m80.C12887v;
import m90.C12894d;
import p543hq.C17474b;
import p805su.C19542d;

public class TicketValidationActivity extends MoovitActivity {

    /* renamed from: X */
    public static final /* synthetic */ int f23570X = 0;

    /* renamed from: U */
    public final C12894d f23571U = new C12894d(this);

    /* renamed from: y2 */
    public static Intent m17717y2(Context context, ServerId serverId, String str, TicketId ticketId) {
        Intent intent = new Intent(context, TicketValidationActivity.class);
        intent.putExtra("providerId", serverId);
        intent.putExtra("agencyKey", str);
        intent.putExtra("ticketId", ticketId);
        return intent;
    }

    /* renamed from: V0 */
    public final void mo19423V0(Bundle bundle, String str) {
        if ("validation_error".equals(str)) {
            finish();
        }
    }

    /* renamed from: b2 */
    public final void mo19424b2(Intent intent) {
        setIntent(intent);
        mo24260z2();
    }

    /* renamed from: e2 */
    public final void mo19425e2(Bundle bundle) {
        super.mo19425e2(bundle);
        setContentView(C12870f.ticket_validation_activity);
        getWindow().setFlags(8192, 8192);
    }

    /* renamed from: h2 */
    public final void mo19426h2() {
        super.mo19426h2();
        mo24260z2();
    }

    /* renamed from: m1 */
    public final C17474b.C17475a mo19762m1() {
        String str;
        TicketId ticketId = (TicketId) getIntent().getParcelableExtra("ticketId");
        C17474b.C17475a m1 = super.mo19762m1();
        m1.mo49937e(AnalyticsAttributeKey.PROVIDER, (ServerId) getIntent().getParcelableExtra("providerId"));
        AnalyticsAttributeKey analyticsAttributeKey = AnalyticsAttributeKey.TICKET;
        if (ticketId != null) {
            str = ticketId.f23513d;
        } else {
            str = null;
        }
        m1.mo49945m(analyticsAttributeKey, str);
        return m1;
    }

    /* renamed from: z2 */
    public final void mo24260z2() {
        Intent intent = getIntent();
        ServerId serverId = (ServerId) intent.getParcelableExtra("providerId");
        String stringExtra = intent.getStringExtra("agencyKey");
        if (serverId != null) {
            C12887v b = C12887v.m32668b();
            b.mo39734c(serverId).addOnSuccessListener((Activity) this, new C19542d(2, this, stringExtra)).addOnFailureListener((Activity) this, (OnFailureListener) new C12761a(this, intent, b));
            return;
        }
        throw new IllegalStateException("You must pass a non-null provider id in the TicketValidationActivity start intent");
    }
}
