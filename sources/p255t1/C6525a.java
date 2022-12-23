package p255t1;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: t1.a */
public final class C6525a extends ClickableSpan {

    /* renamed from: b */
    public final int f20329b;

    /* renamed from: c */
    public final C6531g f20330c;

    /* renamed from: d */
    public final int f20331d;

    public C6525a(int i, C6531g gVar, int i2) {
        this.f20329b = i;
        this.f20330c = gVar;
        this.f20331d = i2;
    }

    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f20329b);
        C6531g gVar = this.f20330c;
        gVar.f20334a.performAction(this.f20331d, bundle);
    }
}
