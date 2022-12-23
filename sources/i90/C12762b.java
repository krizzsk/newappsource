package i90;

import c70.C13751d;
import com.google.android.gms.tasks.OnFailureListener;
import com.moovit.ticketing.validation.TicketValidationActivity;

/* renamed from: i90.b */
public final /* synthetic */ class C12762b implements OnFailureListener {

    /* renamed from: b */
    public final /* synthetic */ TicketValidationActivity f31531b;

    public /* synthetic */ C12762b(TicketValidationActivity ticketValidationActivity) {
        this.f31531b = ticketValidationActivity;
    }

    public final void onFailure(Exception exc) {
        TicketValidationActivity ticketValidationActivity = this.f31531b;
        int i = TicketValidationActivity.f23570X;
        ticketValidationActivity.mo44506I1();
        ticketValidationActivity.mo44530n2(C13751d.m34341b(ticketValidationActivity, "validation_error", exc));
    }
}
