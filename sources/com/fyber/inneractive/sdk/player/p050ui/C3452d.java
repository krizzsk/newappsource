package com.fyber.inneractive.sdk.player.p050ui;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.util.C3724q0;

/* renamed from: com.fyber.inneractive.sdk.player.ui.d */
public class C3452d extends C3457i {
    public C3452d(Context context) {
        super(context);
    }

    /* renamed from: a */
    public void mo14675a(C3724q0 q0Var, int i, int i2) {
        if (this.f12318d == UnitDisplayType.DEFAULT && this.f12345s) {
            mo14692a(q0Var, this.f12343q, this.f12344r, i, i2);
        }
        q0Var.f12915a = 0;
        q0Var.f12916b = 0;
    }

    /* renamed from: g */
    public void mo14684g() {
        C3724q0 q0Var = new C3724q0(0, 0);
        this.f12326B = q0Var;
        if (this.f12318d == UnitDisplayType.SQUARE) {
            int min = Math.min(this.f12325A.f12915a, this.f12316b);
            ViewGroup viewGroup = this.f12336j;
            if (viewGroup != null) {
                viewGroup.getLayoutParams().width = min;
                this.f12336j.getLayoutParams().height = min;
            }
            ImageView imageView = this.f12335i;
            if (imageView != null) {
                imageView.getLayoutParams().width = min;
                this.f12335i.getLayoutParams().height = min;
            }
            mo14692a(this.f12326B, this.f12343q, this.f12344r, min, min);
            return;
        }
        int i = this.f12343q;
        int i2 = this.f12344r;
        C3724q0 q0Var2 = this.f12325A;
        mo14692a(q0Var, i, i2, q0Var2.f12915a, q0Var2.f12916b);
        ImageView imageView2 = this.f12335i;
        if (imageView2 != null) {
            imageView2.getLayoutParams().width = this.f12326B.f12915a;
            this.f12335i.getLayoutParams().height = this.f12326B.f12916b;
        }
    }
}
