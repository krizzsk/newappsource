package p977zz;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: zz.r0 */
public final class C20962r0 extends ClickableSpan {

    /* renamed from: b */
    public final /* synthetic */ Runnable f52714b;

    /* renamed from: c */
    public final /* synthetic */ boolean f52715c;

    /* renamed from: d */
    public final /* synthetic */ int f52716d;

    public C20962r0(Runnable runnable, boolean z, int i) {
        this.f52714b = runnable;
        this.f52715c = z;
        this.f52716d = i;
    }

    public final void onClick(View view) {
        this.f52714b.run();
    }

    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(this.f52715c);
        int i = this.f52716d;
        if (i != 0) {
            textPaint.setColor(i);
        }
    }
}
