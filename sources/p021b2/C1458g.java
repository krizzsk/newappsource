package p021b2;

import android.text.Editable;
import android.text.Selection;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.emoji2.text.C0836f;
import java.lang.ref.WeakReference;

/* renamed from: b2.g */
public final class C1458g implements TextWatcher {

    /* renamed from: b */
    public final EditText f5319b;

    /* renamed from: c */
    public final boolean f5320c = false;

    /* renamed from: d */
    public C1459a f5321d;

    /* renamed from: e */
    public boolean f5322e = true;

    /* renamed from: b2.g$a */
    public static class C1459a extends C0836f.C0841e {

        /* renamed from: a */
        public final WeakReference f5323a;

        public C1459a(EditText editText) {
            this.f5323a = new WeakReference(editText);
        }

        /* renamed from: b */
        public final void mo1910b() {
            C1458g.m3842a((EditText) this.f5323a.get(), 1);
        }
    }

    public C1458g(EditText editText) {
        this.f5319b = editText;
    }

    /* renamed from: a */
    public static void m3842a(EditText editText, int i) {
        int i2;
        if (i == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            C0836f a = C0836f.m2528a();
            if (editableText == null) {
                i2 = 0;
            } else {
                a.getClass();
                i2 = editableText.length();
            }
            a.mo3623f(0, i2, editableText);
            if (selectionStart >= 0 && selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionStart, selectionEnd);
            } else if (selectionStart >= 0) {
                Selection.setSelection(editableText, selectionStart);
            } else if (selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionEnd);
            }
        }
    }

    public final void afterTextChanged(Editable editable) {
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0019, code lost:
        if (r0 == false) goto L_0x001b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0048  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onTextChanged(java.lang.CharSequence r4, int r5, int r6, int r7) {
        /*
            r3 = this;
            android.widget.EditText r0 = r3.f5319b
            boolean r0 = r0.isInEditMode()
            if (r0 != 0) goto L_0x0056
            boolean r0 = r3.f5322e
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x001b
            boolean r0 = r3.f5320c
            if (r0 != 0) goto L_0x001c
            androidx.emoji2.text.f r0 = androidx.emoji2.text.C0836f.f3491j
            if (r0 == 0) goto L_0x0018
            r0 = 1
            goto L_0x0019
        L_0x0018:
            r0 = 0
        L_0x0019:
            if (r0 != 0) goto L_0x001c
        L_0x001b:
            r1 = 1
        L_0x001c:
            if (r1 == 0) goto L_0x001f
            goto L_0x0056
        L_0x001f:
            if (r6 > r7) goto L_0x0056
            boolean r6 = r4 instanceof android.text.Spannable
            if (r6 == 0) goto L_0x0056
            androidx.emoji2.text.f r6 = androidx.emoji2.text.C0836f.m2528a()
            int r6 = r6.mo3619b()
            if (r6 == 0) goto L_0x0040
            if (r6 == r2) goto L_0x0035
            r4 = 3
            if (r6 == r4) goto L_0x0040
            goto L_0x0056
        L_0x0035:
            android.text.Spannable r4 = (android.text.Spannable) r4
            androidx.emoji2.text.f r6 = androidx.emoji2.text.C0836f.m2528a()
            int r7 = r7 + r5
            r6.mo3623f(r5, r7, r4)
            goto L_0x0056
        L_0x0040:
            androidx.emoji2.text.f r4 = androidx.emoji2.text.C0836f.m2528a()
            b2.g$a r5 = r3.f5321d
            if (r5 != 0) goto L_0x0051
            b2.g$a r5 = new b2.g$a
            android.widget.EditText r6 = r3.f5319b
            r5.<init>(r6)
            r3.f5321d = r5
        L_0x0051:
            b2.g$a r5 = r3.f5321d
            r4.mo3624g(r5)
        L_0x0056:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p021b2.C1458g.onTextChanged(java.lang.CharSequence, int, int, int):void");
    }
}
