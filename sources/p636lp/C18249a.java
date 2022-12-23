package p636lp;

import android.view.View;
import androidx.fragment.app.Fragment;
import com.masabi.justride.sdk.p415ui.features.universalticket.regulations.TicketRegulationsFragment;
import p871vo.C20178e;

/* renamed from: lp.a */
public final class C18249a implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ TicketRegulationsFragment f46566b;

    public C18249a(TicketRegulationsFragment ticketRegulationsFragment) {
        this.f46566b = ticketRegulationsFragment;
    }

    public final void onClick(View view) {
        Fragment parentFragment = this.f46566b.getParentFragment();
        if (!(parentFragment instanceof C20178e)) {
            parentFragment = null;
        }
        C20178e eVar = (C20178e) parentFragment;
        if (eVar != null) {
            eVar.mo52428O1();
        }
    }
}
