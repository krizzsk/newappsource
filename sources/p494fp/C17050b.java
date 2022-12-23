package p494fp;

import android.os.Bundle;
import android.view.View;
import bf0.C21050d;
import com.masabi.justride.sdk.p415ui.features.universalticket.main.MainTicketFragment;
import com.masabi.justride.sdk.p415ui.features.universalticket.main.actions.ActionsDialogFragment;
import mf0.C24362h;
import p605ki.C18047b;

/* renamed from: fp.b */
public final class C17050b implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ MainTicketFragment f44204b;

    public C17050b(MainTicketFragment mainTicketFragment) {
        this.f44204b = mainTicketFragment;
    }

    public final void onClick(View view) {
        MainTicketFragment mainTicketFragment = this.f44204b;
        int i = MainTicketFragment.f37249t;
        String U1 = mainTicketFragment.mo44488U1();
        C18047b bVar = mainTicketFragment.f45307b;
        C24362h.m61210e(bVar, "justrideSDK");
        ActionsDialogFragment actionsDialogFragment = new ActionsDialogFragment();
        Bundle b = C25541a.m63872b("TICKET_ID_KEY", U1);
        b.putString("SDK_IDENTIFIER", bVar.mo50524c());
        C21050d dVar = C21050d.f52856a;
        actionsDialogFragment.setArguments(b);
        actionsDialogFragment.show(mainTicketFragment.getChildFragmentManager(), "actionsModal");
    }
}
