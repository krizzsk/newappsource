package p734ps;

import android.content.DialogInterface;
import com.moovit.C15676b;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import ga0.C12702e;
import p543hq.C17474b;

/* renamed from: ps.b */
public final /* synthetic */ class C18973b implements DialogInterface.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ int f48308b;

    /* renamed from: c */
    public final /* synthetic */ C15676b f48309c;

    public /* synthetic */ C18973b(C15676b bVar, int i) {
        this.f48308b = i;
        this.f48309c = bVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f48308b) {
            case 0:
                C18974c cVar = (C18974c) this.f48309c;
                int i2 = C18974c.f48310h;
                cVar.getClass();
                C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar.mo49939g(AnalyticsAttributeKey.TYPE, "cancel_clicked");
                cVar.mo22564R1(aVar.mo49933a());
                dialogInterface.dismiss();
                return;
            default:
                int i3 = C12702e.f31362s;
                ((C12702e) this.f48309c).mo39476T1(i);
                return;
        }
    }
}
