package androidx.emoji2.text;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.SpannableString;
import p216q1.C6135c;
import p988j$.util.stream.IntStream;

/* renamed from: androidx.emoji2.text.s */
public final class C0864s implements Spannable {

    /* renamed from: b */
    public boolean f3550b = false;

    /* renamed from: c */
    public Spannable f3551c;

    /* renamed from: androidx.emoji2.text.s$a */
    public static class C0865a {
        /* renamed from: a */
        public boolean mo3685a(Spannable spannable) {
            return spannable instanceof C6135c;
        }
    }

    /* renamed from: androidx.emoji2.text.s$b */
    public static class C0866b extends C0865a {
        /* renamed from: a */
        public final boolean mo3685a(Spannable spannable) {
            return (spannable instanceof PrecomputedText) || (spannable instanceof C6135c);
        }
    }

    public C0864s(Spannable spannable) {
        this.f3551c = spannable;
    }

    /* renamed from: a */
    public final void mo3671a() {
        C0865a aVar;
        Spannable spannable = this.f3551c;
        if (!this.f3550b) {
            if (Build.VERSION.SDK_INT < 28) {
                aVar = new C0865a();
            } else {
                aVar = new C0866b();
            }
            if (aVar.mo3685a(spannable)) {
                this.f3551c = new SpannableString(spannable);
            }
        }
        this.f3550b = true;
    }

    public final char charAt(int i) {
        return this.f3551c.charAt(i);
    }

    public final IntStream chars() {
        return IntStream.VivifiedWrapper.convert(this.f3551c.chars());
    }

    public final IntStream codePoints() {
        return IntStream.VivifiedWrapper.convert(this.f3551c.codePoints());
    }

    public final int getSpanEnd(Object obj) {
        return this.f3551c.getSpanEnd(obj);
    }

    public final int getSpanFlags(Object obj) {
        return this.f3551c.getSpanFlags(obj);
    }

    public final int getSpanStart(Object obj) {
        return this.f3551c.getSpanStart(obj);
    }

    public final <T> T[] getSpans(int i, int i2, Class<T> cls) {
        return this.f3551c.getSpans(i, i2, cls);
    }

    public final int length() {
        return this.f3551c.length();
    }

    public final int nextSpanTransition(int i, int i2, Class cls) {
        return this.f3551c.nextSpanTransition(i, i2, cls);
    }

    public final void removeSpan(Object obj) {
        mo3671a();
        this.f3551c.removeSpan(obj);
    }

    public final void setSpan(Object obj, int i, int i2, int i3) {
        mo3671a();
        this.f3551c.setSpan(obj, i, i2, i3);
    }

    public final CharSequence subSequence(int i, int i2) {
        return this.f3551c.subSequence(i, i2);
    }

    public final String toString() {
        return this.f3551c.toString();
    }

    public C0864s(CharSequence charSequence) {
        this.f3551c = new SpannableString(charSequence);
    }
}
