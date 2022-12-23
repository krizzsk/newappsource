package i00;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import ce0.C21100e;
import com.moovit.app.general.aboutandcontact.AboutAndContactActivity;
import com.moovit.payment.account.PaymentAccountUpdateEmailActivity;

/* renamed from: i00.c */
public abstract class C17524c implements View.OnClickListener {

    /* renamed from: b */
    public final int f45108b;

    /* renamed from: c */
    public int f45109c = 0;

    /* renamed from: d */
    public long f45110d = 0;

    public C17524c() {
        C21100e.m49365t(5, "finalClickCount");
        this.f45108b = 5;
    }

    public final void onClick(View view) {
        long currentTimeMillis = System.currentTimeMillis();
        long j = this.f45110d;
        this.f45110d = currentTimeMillis;
        int i = this.f45109c;
        if (i <= 0 || currentTimeMillis - j <= 1000) {
            int i2 = i + 1;
            this.f45109c = i2;
            if (i2 == this.f45108b) {
                AboutAndContactActivity aboutAndContactActivity = AboutAndContactActivity.this;
                Context context = view.getContext();
                int i3 = PaymentAccountUpdateEmailActivity.f63839o0;
                aboutAndContactActivity.startActivity(new Intent(context, PaymentAccountUpdateEmailActivity.class));
                this.f45109c = 0;
                return;
            }
            return;
        }
        this.f45109c = 1;
    }
}
