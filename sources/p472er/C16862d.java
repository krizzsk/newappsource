package p472er;

import android.view.View;
import com.moovit.app.carpool.CarpoolProfilePopupActivity;

/* renamed from: er.d */
public final class C16862d implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ CarpoolProfilePopupActivity f43867b;

    public C16862d(CarpoolProfilePopupActivity carpoolProfilePopupActivity) {
        this.f43867b = carpoolProfilePopupActivity;
    }

    public final void onClick(View view) {
        this.f43867b.onBackPressed();
    }
}
