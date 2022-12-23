package p518gp;

import android.view.View;
import com.masabi.justride.sdk.p415ui.features.universalticket.main.actions.ActionsDialogFragment;
import com.usebutton.sdk.internal.events.Events;
import mf0.C24362h;
import p658mo.C18408b;
import p658mo.C18412f;
import p798sn.C19493a;

/* renamed from: gp.a */
public final class C17212a implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ C18412f f44500b;

    /* renamed from: c */
    public final /* synthetic */ ActionsDialogFragment f44501c;

    /* renamed from: d */
    public final /* synthetic */ C19493a f44502d;

    public C17212a(C18412f fVar, ActionsDialogFragment actionsDialogFragment, C19493a aVar) {
        this.f44500b = fVar;
        this.f44501c = actionsDialogFragment;
        this.f44502d = aVar;
    }

    public final void onClick(View view) {
        if (this.f44501c.f37271d) {
            C18412f fVar = this.f44500b;
            C24362h.m61210e(fVar, Events.PROPERTY_ACTION);
            C18408b bVar = fVar.f46964d;
            C24362h.m61210e(view, "it");
            bVar.mo50863b(view.getContext(), this.f44502d);
            this.f44501c.dismiss();
        }
    }
}
