package kd0;

import android.content.Context;
import android.widget.RelativeLayout;
import com.vungle.warren.C23231u1;
import p198o9.C6012a;

/* renamed from: kd0.a */
public final class C23755a extends RelativeLayout {

    /* renamed from: b */
    public final /* synthetic */ C23757c f60012b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C23755a(C23757c cVar, Context context) {
        super(context);
        this.f60012b = cVar;
    }

    public final void onAttachedToWindow() {
        C23757c cVar;
        C23755a aVar;
        C23231u1 u1Var;
        super.onAttachedToWindow();
        C6012a aVar2 = this.f60012b.f60019f;
        if (aVar2 != null && (cVar = aVar2.f19210a.get()) != null && (aVar = cVar.f60020g) != null && (u1Var = aVar2.f19211b) != null && u1Var.getParent() == null) {
            aVar.addView(aVar2.f19211b);
        }
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C6012a aVar = this.f60012b.f60019f;
        if (aVar != null) {
            aVar.mo22016a();
        }
    }
}
