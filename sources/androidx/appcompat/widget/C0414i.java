package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.TextView;
import p021b2.C1454f;
import p114i.C5224j;

/* renamed from: androidx.appcompat.widget.i */
public final class C0414i {

    /* renamed from: a */
    public final TextView f1517a;

    /* renamed from: b */
    public final C1454f f1518b;

    public C0414i(TextView textView) {
        this.f1517a = textView;
        this.f1518b = new C1454f(textView);
    }

    /* renamed from: a */
    public final InputFilter[] mo2100a(InputFilter[] inputFilterArr) {
        return this.f1518b.f5314a.mo5782a(inputFilterArr);
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: b */
    public final void mo2101b(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = this.f1517a.getContext().obtainStyledAttributes(attributeSet, C5224j.AppCompatTextView, i, 0);
        try {
            int i2 = C5224j.AppCompatTextView_emojiCompatEnabled;
            boolean z = true;
            if (obtainStyledAttributes.hasValue(i2)) {
                z = obtainStyledAttributes.getBoolean(i2, true);
            }
            obtainStyledAttributes.recycle();
            mo2103d(z);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* renamed from: c */
    public final void mo2102c(boolean z) {
        this.f1518b.f5314a.mo5784c(z);
    }

    /* renamed from: d */
    public final void mo2103d(boolean z) {
        this.f1518b.f5314a.mo5785d(z);
    }
}
