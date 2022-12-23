package zd0;

import android.content.DialogInterface;
import com.vungle.warren.persistence.C23192a;
import od0.C24559j;

/* renamed from: zd0.b */
public final class C25335b implements DialogInterface.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ C24559j f63671b;

    /* renamed from: c */
    public final /* synthetic */ C25330a f63672c;

    public C25335b(C25330a aVar, C24559j jVar) {
        this.f63672c = aVar;
        this.f63671b = jVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        String str;
        if (i == -2) {
            str = "opted_out";
        } else if (i == -1) {
            str = "opted_in";
        } else {
            str = "opted_out_by_timeout";
        }
        this.f63671b.mo60827d(str, "consent_status");
        this.f63671b.mo60827d(Long.valueOf(System.currentTimeMillis() / 1000), "timestamp");
        this.f63671b.mo60827d("vungle_modal", "consent_source");
        this.f63672c.f63647i.mo58289x(this.f63671b, (C23192a.C23207n) null, true);
        this.f63672c.start();
    }
}
