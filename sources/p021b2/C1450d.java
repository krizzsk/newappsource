package p021b2;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.text.Spanned;
import android.widget.TextView;
import androidx.emoji2.text.C0836f;
import java.lang.ref.WeakReference;

/* renamed from: b2.d */
public final class C1450d implements InputFilter {

    /* renamed from: a */
    public final TextView f5308a;

    /* renamed from: b */
    public C1451a f5309b;

    /* renamed from: b2.d$a */
    public static class C1451a extends C0836f.C0841e {

        /* renamed from: a */
        public final WeakReference f5310a;

        /* renamed from: b */
        public final WeakReference f5311b;

        public C1451a(TextView textView, C1450d dVar) {
            this.f5310a = new WeakReference(textView);
            this.f5311b = new WeakReference(dVar);
        }

        /* renamed from: b */
        public final void mo1910b() {
            boolean z;
            int i;
            InputFilter[] filters;
            TextView textView = (TextView) this.f5310a.get();
            InputFilter inputFilter = (InputFilter) this.f5311b.get();
            if (inputFilter != null && textView != null && (filters = textView.getFilters()) != null) {
                int i2 = 0;
                while (true) {
                    if (i2 >= filters.length) {
                        break;
                    } else if (filters[i2] == inputFilter) {
                        z = true;
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            z = false;
            if (z && textView.isAttachedToWindow()) {
                CharSequence text = textView.getText();
                C0836f a = C0836f.m2528a();
                if (text == null) {
                    i = 0;
                } else {
                    a.getClass();
                    i = text.length();
                }
                CharSequence f = a.mo3623f(0, i, text);
                if (text != f) {
                    int selectionStart = Selection.getSelectionStart(f);
                    int selectionEnd = Selection.getSelectionEnd(f);
                    textView.setText(f);
                    if (f instanceof Spannable) {
                        Spannable spannable = (Spannable) f;
                        if (selectionStart >= 0 && selectionEnd >= 0) {
                            Selection.setSelection(spannable, selectionStart, selectionEnd);
                        } else if (selectionStart >= 0) {
                            Selection.setSelection(spannable, selectionStart);
                        } else if (selectionEnd >= 0) {
                            Selection.setSelection(spannable, selectionEnd);
                        }
                    }
                }
            }
        }
    }

    public C1450d(TextView textView) {
        this.f5308a = textView;
    }

    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        if (this.f5308a.isInEditMode()) {
            return charSequence;
        }
        int b = C0836f.m2528a().mo3619b();
        if (b != 0) {
            boolean z = true;
            if (b == 1) {
                if (i4 == 0 && i3 == 0 && spanned.length() == 0 && charSequence == this.f5308a.getText()) {
                    z = false;
                }
                if (!z || charSequence == null) {
                    return charSequence;
                }
                if (!(i == 0 && i2 == charSequence.length())) {
                    charSequence = charSequence.subSequence(i, i2);
                }
                return C0836f.m2528a().mo3623f(0, charSequence.length(), charSequence);
            } else if (b != 3) {
                return charSequence;
            }
        }
        C0836f a = C0836f.m2528a();
        if (this.f5309b == null) {
            this.f5309b = new C1451a(this.f5308a, this);
        }
        a.mo3624g(this.f5309b);
        return charSequence;
    }
}
