package com.fyber.inneractive.sdk.player.p050ui;

import android.content.Context;
import android.widget.ImageView;
import com.fyber.inneractive.sdk.config.C2702y;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.util.C3707l;
import com.fyber.inneractive.sdk.util.C3724q0;
import com.google.android.gms.nearby.messages.Strategy;

/* renamed from: com.fyber.inneractive.sdk.player.ui.f */
public class C3454f extends C3457i {
    public C3454f(Context context) {
        super(context);
    }

    /* renamed from: a */
    public void mo14675a(C3724q0 q0Var, int i, int i2) {
        if (q0Var != null) {
            UnitDisplayType unitDisplayType = this.f12318d;
            if (unitDisplayType == UnitDisplayType.SQUARE) {
                int min = Math.min(i, this.f12316b) - C3707l.m9963b(((C2702y) this.f12317c).f9427f.f9252f.intValue() * 2);
                q0Var.f12915a = min;
                q0Var.f12916b = min;
            } else if (unitDisplayType == UnitDisplayType.LANDSCAPE) {
                int min2 = Math.min(i, this.f12316b) - C3707l.m9963b(((C2702y) this.f12317c).f9427f.f9252f.intValue() * 2);
                q0Var.f12915a = min2;
                q0Var.f12916b = (min2 * 9) / 16;
            } else if (unitDisplayType == UnitDisplayType.MRECT) {
                q0Var.f12915a = C3707l.m9963b((int) Strategy.TTL_SECONDS_DEFAULT);
                q0Var.f12916b = C3707l.m9963b(250);
            } else if (unitDisplayType != UnitDisplayType.DEFAULT || !this.f12345s) {
                q0Var.f12915a = 0;
                q0Var.f12916b = 0;
            } else {
                mo14692a(q0Var, this.f12343q, this.f12344r, i, i2);
            }
        }
    }

    /* renamed from: g */
    public void mo14684g() {
        C3724q0 q0Var = new C3724q0(0, 0);
        this.f12326B = q0Var;
        if (this.f12318d == UnitDisplayType.SQUARE) {
            ImageView imageView = this.f12335i;
            if (imageView != null) {
                imageView.getLayoutParams().width = this.f12325A.f12915a;
                this.f12335i.getLayoutParams().height = this.f12325A.f12915a;
            }
            C3724q0 q0Var2 = this.f12326B;
            int i = this.f12343q;
            int i2 = this.f12344r;
            int i3 = this.f12325A.f12915a;
            mo14692a(q0Var2, i, i2, i3, i3);
            return;
        }
        int i4 = this.f12343q;
        int i5 = this.f12344r;
        C3724q0 q0Var3 = this.f12325A;
        mo14692a(q0Var, i4, i5, q0Var3.f12915a, q0Var3.f12916b);
        ImageView imageView2 = this.f12335i;
        if (imageView2 != null) {
            imageView2.getLayoutParams().width = this.f12326B.f12915a;
            this.f12335i.getLayoutParams().height = this.f12326B.f12916b;
        }
    }
}
