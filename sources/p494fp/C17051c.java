package p494fp;

import android.view.View;
import androidx.fragment.app.Fragment;
import com.masabi.justride.sdk.p415ui.features.universalticket.main.MainTicketFragment;
import p871vo.C20178e;

/* renamed from: fp.c */
public final class C17051c implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ MainTicketFragment f44205b;

    public C17051c(MainTicketFragment mainTicketFragment) {
        this.f44205b = mainTicketFragment;
    }

    public final void onClick(View view) {
        Fragment parentFragment = this.f44205b.getParentFragment();
        if (!(parentFragment instanceof C20178e)) {
            parentFragment = null;
        }
        C20178e eVar = (C20178e) parentFragment;
        if (eVar != null) {
            eVar.mo52428O1();
        }
    }
}
