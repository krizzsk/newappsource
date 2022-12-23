package androidx.emoji2.text;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;

/* renamed from: androidx.emoji2.text.p */
public final class C0861p extends C0851k {
    public C0861p(C0848i iVar) {
        super(iVar);
    }

    public final void draw(Canvas canvas, @SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        Paint paint2 = paint;
        C0836f.m2528a().getClass();
        C0848i iVar = this.f3528c;
        Typeface typeface = iVar.f3516b.f3543d;
        Typeface typeface2 = paint.getTypeface();
        paint2.setTypeface(typeface);
        int i6 = iVar.f3515a * 2;
        char[] cArr = iVar.f3516b.f3541b;
        canvas.drawText(cArr, i6, 2, f, (float) i4, paint);
        paint2.setTypeface(typeface2);
    }
}
