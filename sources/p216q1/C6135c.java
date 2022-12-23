package p216q1;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
import p229r1.C6232b;

/* renamed from: q1.c */
public final class C6135c implements Spannable {
    public final char charAt(int i) {
        throw null;
    }

    public final int getSpanEnd(Object obj) {
        throw null;
    }

    public final int getSpanFlags(Object obj) {
        throw null;
    }

    public final int getSpanStart(Object obj) {
        throw null;
    }

    public final <T> T[] getSpans(int i, int i2, Class<T> cls) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        throw null;
    }

    public final int length() {
        throw null;
    }

    public final int nextSpanTransition(int i, int i2, Class cls) {
        throw null;
    }

    public final void removeSpan(Object obj) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
        } else if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        } else {
            throw null;
        }
    }

    public final void setSpan(Object obj, int i, int i2, int i3) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
        } else if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        } else {
            throw null;
        }
    }

    public final CharSequence subSequence(int i, int i2) {
        throw null;
    }

    public final String toString() {
        throw null;
    }

    /* renamed from: q1.c$a */
    public static final class C6136a {

        /* renamed from: a */
        public final TextPaint f19497a;

        /* renamed from: b */
        public final TextDirectionHeuristic f19498b;

        /* renamed from: c */
        public final int f19499c;

        /* renamed from: d */
        public final int f19500d;

        public C6136a(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i, int i2) {
            if (Build.VERSION.SDK_INT >= 29) {
                new PrecomputedText.Params.Builder(textPaint).setBreakStrategy(i).setHyphenationFrequency(i2).setTextDirection(textDirectionHeuristic).build();
            }
            this.f19497a = textPaint;
            this.f19498b = textDirectionHeuristic;
            this.f19499c = i;
            this.f19500d = i2;
        }

        /* renamed from: a */
        public final boolean mo22112a(C6136a aVar) {
            int i = Build.VERSION.SDK_INT;
            if ((i >= 23 && (this.f19499c != aVar.f19499c || this.f19500d != aVar.f19500d)) || this.f19497a.getTextSize() != aVar.f19497a.getTextSize() || this.f19497a.getTextScaleX() != aVar.f19497a.getTextScaleX() || this.f19497a.getTextSkewX() != aVar.f19497a.getTextSkewX() || this.f19497a.getLetterSpacing() != aVar.f19497a.getLetterSpacing() || !TextUtils.equals(this.f19497a.getFontFeatureSettings(), aVar.f19497a.getFontFeatureSettings()) || this.f19497a.getFlags() != aVar.f19497a.getFlags()) {
                return false;
            }
            if (i >= 24) {
                if (!this.f19497a.getTextLocales().equals(aVar.f19497a.getTextLocales())) {
                    return false;
                }
            } else if (!this.f19497a.getTextLocale().equals(aVar.f19497a.getTextLocale())) {
                return false;
            }
            if (this.f19497a.getTypeface() == null) {
                if (aVar.f19497a.getTypeface() != null) {
                    return false;
                }
                return true;
            } else if (!this.f19497a.getTypeface().equals(aVar.f19497a.getTypeface())) {
                return false;
            } else {
                return true;
            }
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C6136a)) {
                return false;
            }
            C6136a aVar = (C6136a) obj;
            if (mo22112a(aVar) && this.f19498b == aVar.f19498b) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            if (Build.VERSION.SDK_INT >= 24) {
                return C6232b.m14817b(Float.valueOf(this.f19497a.getTextSize()), Float.valueOf(this.f19497a.getTextScaleX()), Float.valueOf(this.f19497a.getTextSkewX()), Float.valueOf(this.f19497a.getLetterSpacing()), Integer.valueOf(this.f19497a.getFlags()), this.f19497a.getTextLocales(), this.f19497a.getTypeface(), Boolean.valueOf(this.f19497a.isElegantTextHeight()), this.f19498b, Integer.valueOf(this.f19499c), Integer.valueOf(this.f19500d));
            }
            return C6232b.m14817b(Float.valueOf(this.f19497a.getTextSize()), Float.valueOf(this.f19497a.getTextScaleX()), Float.valueOf(this.f19497a.getTextSkewX()), Float.valueOf(this.f19497a.getLetterSpacing()), Integer.valueOf(this.f19497a.getFlags()), this.f19497a.getTextLocale(), this.f19497a.getTypeface(), Boolean.valueOf(this.f19497a.isElegantTextHeight()), this.f19498b, Integer.valueOf(this.f19499c), Integer.valueOf(this.f19500d));
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("{");
            StringBuilder k = C13555b.m33972k("textSize=");
            k.append(this.f19497a.getTextSize());
            sb.append(k.toString());
            sb.append(", textScaleX=" + this.f19497a.getTextScaleX());
            sb.append(", textSkewX=" + this.f19497a.getTextSkewX());
            int i = Build.VERSION.SDK_INT;
            StringBuilder k2 = C13555b.m33972k(", letterSpacing=");
            k2.append(this.f19497a.getLetterSpacing());
            sb.append(k2.toString());
            sb.append(", elegantTextHeight=" + this.f19497a.isElegantTextHeight());
            if (i >= 24) {
                StringBuilder k3 = C13555b.m33972k(", textLocale=");
                k3.append(this.f19497a.getTextLocales());
                sb.append(k3.toString());
            } else {
                StringBuilder k4 = C13555b.m33972k(", textLocale=");
                k4.append(this.f19497a.getTextLocale());
                sb.append(k4.toString());
            }
            StringBuilder k5 = C13555b.m33972k(", typeface=");
            k5.append(this.f19497a.getTypeface());
            sb.append(k5.toString());
            if (i >= 26) {
                StringBuilder k6 = C13555b.m33972k(", variationSettings=");
                k6.append(this.f19497a.getFontVariationSettings());
                sb.append(k6.toString());
            }
            StringBuilder k7 = C13555b.m33972k(", textDir=");
            k7.append(this.f19498b);
            sb.append(k7.toString());
            sb.append(", breakStrategy=" + this.f19499c);
            sb.append(", hyphenationFrequency=" + this.f19500d);
            sb.append("}");
            return sb.toString();
        }

        public C6136a(PrecomputedText.Params params) {
            this.f19497a = params.getTextPaint();
            this.f19498b = params.getTextDirection();
            this.f19499c = params.getBreakStrategy();
            this.f19500d = params.getHyphenationFrequency();
        }
    }
}
