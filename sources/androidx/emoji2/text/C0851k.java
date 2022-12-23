package androidx.emoji2.text;

import android.annotation.SuppressLint;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import mf0.C24361g;
import p003a2.C0046a;

/* renamed from: androidx.emoji2.text.k */
public abstract class C0851k extends ReplacementSpan {

    /* renamed from: b */
    public final Paint.FontMetricsInt f3527b = new Paint.FontMetricsInt();

    /* renamed from: c */
    public final C0848i f3528c;

    /* renamed from: d */
    public float f3529d = 1.0f;

    public C0851k(C0848i iVar) {
        C24361g.m61185s(iVar, "metadata cannot be null");
        this.f3528c = iVar;
    }

    public final int getSize(Paint paint, @SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        short s;
        paint.getFontMetricsInt(this.f3527b);
        Paint.FontMetricsInt fontMetricsInt2 = this.f3527b;
        float abs = ((float) Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent)) * 1.0f;
        C0046a c = this.f3528c.mo3629c();
        int a = c.mo24a(14);
        short s2 = 0;
        if (a != 0) {
            s = c.f51b.getShort(a + c.f50a);
        } else {
            s = 0;
        }
        this.f3529d = abs / ((float) s);
        C0046a c2 = this.f3528c.mo3629c();
        int a2 = c2.mo24a(14);
        if (a2 != 0) {
            c2.f51b.getShort(a2 + c2.f50a);
        }
        C0046a c3 = this.f3528c.mo3629c();
        int a3 = c3.mo24a(12);
        if (a3 != 0) {
            s2 = c3.f51b.getShort(a3 + c3.f50a);
        }
        short s3 = (short) ((int) (((float) s2) * this.f3529d));
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt fontMetricsInt3 = this.f3527b;
            fontMetricsInt.ascent = fontMetricsInt3.ascent;
            fontMetricsInt.descent = fontMetricsInt3.descent;
            fontMetricsInt.top = fontMetricsInt3.top;
            fontMetricsInt.bottom = fontMetricsInt3.bottom;
        }
        return s3;
    }
}
