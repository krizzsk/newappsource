package androidx.emoji2.text;

import android.text.TextPaint;
import androidx.emoji2.text.C0836f;

/* renamed from: androidx.emoji2.text.d */
public final class C0834d implements C0836f.C0840d {

    /* renamed from: b */
    public static final ThreadLocal<StringBuilder> f3487b = new ThreadLocal<>();

    /* renamed from: a */
    public final TextPaint f3488a;

    public C0834d() {
        TextPaint textPaint = new TextPaint();
        this.f3488a = textPaint;
        textPaint.setTextSize(10.0f);
    }
}
