package zd0;

import android.content.DialogInterface;
import android.text.TextUtils;

/* renamed from: zd0.c */
public final class C25336c implements DialogInterface.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ C25330a f63673b;

    public C25336c(C25330a aVar) {
        this.f63673b = aVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (i == -2) {
            this.f63673b.mo61919t("video_close", (String) null);
            C25330a aVar = this.f63673b;
            if (!TextUtils.isEmpty(aVar.f63645g.f62219r)) {
                aVar.mo61918s();
            } else {
                aVar.mo61914o();
            }
        }
    }
}
