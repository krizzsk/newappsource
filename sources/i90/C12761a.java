package i90;

import android.app.Activity;
import android.content.Intent;
import com.google.android.gms.tasks.OnFailureListener;
import com.moovit.ticketing.ticket.TicketId;
import com.moovit.ticketing.validation.TicketValidationActivity;
import m80.C12887v;
import p946ys.C20763d;

/* renamed from: i90.a */
public final /* synthetic */ class C12761a implements OnFailureListener {

    /* renamed from: b */
    public final /* synthetic */ TicketValidationActivity f31528b;

    /* renamed from: c */
    public final /* synthetic */ Intent f31529c;

    /* renamed from: d */
    public final /* synthetic */ C12887v f31530d;

    public /* synthetic */ C12761a(TicketValidationActivity ticketValidationActivity, Intent intent, C12887v vVar) {
        this.f31528b = ticketValidationActivity;
        this.f31529c = intent;
        this.f31530d = vVar;
    }

    public final void onFailure(Exception exc) {
        TicketValidationActivity ticketValidationActivity = this.f31528b;
        Intent intent = this.f31529c;
        C12887v vVar = this.f31530d;
        int i = TicketValidationActivity.f23570X;
        ticketValidationActivity.getClass();
        TicketId ticketId = (TicketId) intent.getParcelableExtra("ticketId");
        if (ticketId == null) {
            throw new IllegalStateException("You must pass a non-null ticket id or provider id in the TicketValidationActivity start intent");
        } else if (ticketValidationActivity.f37313z) {
            vVar.mo39735e(ticketId).addOnSuccessListener((Activity) ticketValidationActivity, new C20763d(ticketValidationActivity, 6)).addOnFailureListener((Activity) ticketValidationActivity, (OnFailureListener) new C12762b(ticketValidationActivity));
        }
    }
}
