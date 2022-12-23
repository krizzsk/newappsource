package com.moovit.view.p340cc;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import ce0.C21100e;
import p977zz.C20964s0;

/* renamed from: com.moovit.view.cc.MaskFormatterWatcher */
public abstract class MaskFormatterWatcher implements TextWatcher, View.OnKeyListener {

    /* renamed from: b */
    public final CreditCardInputView f24086b;

    /* renamed from: c */
    public final AllowanceLevel f24087c;

    /* renamed from: d */
    public boolean f24088d = false;

    /* renamed from: e */
    public boolean f24089e = false;

    /* renamed from: f */
    public boolean f24090f = false;

    /* renamed from: com.moovit.view.cc.MaskFormatterWatcher$AllowanceLevel */
    public enum AllowanceLevel {
        ALLOW_ALL,
        DISALLOW_CURRENT,
        SUGGEST_FIX
    }

    /* renamed from: com.moovit.view.cc.MaskFormatterWatcher$a */
    public static /* synthetic */ class C7958a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f24091a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.moovit.view.cc.MaskFormatterWatcher$AllowanceLevel[] r0 = com.moovit.view.p340cc.MaskFormatterWatcher.AllowanceLevel.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f24091a = r0
                com.moovit.view.cc.MaskFormatterWatcher$AllowanceLevel r1 = com.moovit.view.p340cc.MaskFormatterWatcher.AllowanceLevel.DISALLOW_CURRENT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f24091a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.moovit.view.cc.MaskFormatterWatcher$AllowanceLevel r1 = com.moovit.view.p340cc.MaskFormatterWatcher.AllowanceLevel.ALLOW_ALL     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f24091a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.moovit.view.cc.MaskFormatterWatcher$AllowanceLevel r1 = com.moovit.view.p340cc.MaskFormatterWatcher.AllowanceLevel.SUGGEST_FIX     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moovit.view.p340cc.MaskFormatterWatcher.C7958a.<clinit>():void");
        }
    }

    public MaskFormatterWatcher(CreditCardInputView creditCardInputView, AllowanceLevel allowanceLevel) {
        C21100e.m49373x(creditCardInputView, "host");
        this.f24086b = creditCardInputView;
        C21100e.m49373x(allowanceLevel, "errorAllowanceLevel");
        this.f24087c = allowanceLevel;
    }

    /* renamed from: a */
    public abstract void mo24834a(Editable editable, int i);

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void afterTextChanged(android.text.Editable r8) {
        /*
            r7 = this;
            if (r8 == 0) goto L_0x008d
            boolean r0 = r7.f24090f
            if (r0 == 0) goto L_0x0008
            goto L_0x008d
        L_0x0008:
            boolean r0 = r7.f24089e
            java.lang.String r1 = ""
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L_0x0011
            goto L_0x0046
        L_0x0011:
            int[] r0 = com.moovit.view.p340cc.MaskFormatterWatcher.C7958a.f24091a
            com.moovit.view.cc.MaskFormatterWatcher$AllowanceLevel r4 = r7.f24087c
            int r4 = r4.ordinal()
            r0 = r0[r4]
            if (r0 == r3) goto L_0x003a
            r4 = 2
            if (r0 == r4) goto L_0x0035
            r4 = 3
            if (r0 == r4) goto L_0x0024
            goto L_0x0046
        L_0x0024:
            int r0 = r8.length()
            if (r0 == 0) goto L_0x0033
            r7.f24090f = r3
            boolean r0 = r7.mo24838c(r8)
            r7.f24090f = r2
            goto L_0x0047
        L_0x0033:
            r0 = 0
            goto L_0x0047
        L_0x0035:
            boolean r0 = r7.mo24838c(r8)
            goto L_0x0047
        L_0x003a:
            int r0 = r8.length()
            int r4 = r0 + -1
            r8.charAt(r4)
            r8.replace(r4, r0, r1)
        L_0x0046:
            r0 = 1
        L_0x0047:
            if (r0 == 0) goto L_0x008d
            r7.f24090f = r3
            r7.mo24840e(r8)
            int r0 = r8.length()
            int r4 = r7.mo24836b()
            if (r3 > r4) goto L_0x006e
            int r5 = r0 + -1
            if (r4 > r5) goto L_0x006e
            int r4 = r8.length()
            int r5 = r4 + -1
            char r6 = r8.charAt(r5)
            r8.replace(r5, r4, r1)
            java.lang.Character r1 = java.lang.Character.valueOf(r6)
            goto L_0x006f
        L_0x006e:
            r1 = 0
        L_0x006f:
            if (r3 > r0) goto L_0x007d
            boolean r4 = r7.mo24841f(r3)
            if (r4 == 0) goto L_0x007a
            r7.mo24834a(r8, r3)
        L_0x007a:
            int r3 = r3 + 1
            goto L_0x006f
        L_0x007d:
            if (r1 == 0) goto L_0x0084
            com.moovit.view.cc.CreditCardInputView r0 = r7.f24086b
            r0.mo24806c(r1)
        L_0x0084:
            java.lang.String r8 = r8.toString()
            r7.mo24839d(r8)
            r7.f24090f = r2
        L_0x008d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moovit.view.p340cc.MaskFormatterWatcher.afterTextChanged(android.text.Editable):void");
    }

    /* renamed from: b */
    public abstract int mo24836b();

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.f24088d = i3 == 0 && i == 0;
    }

    /* renamed from: c */
    public abstract boolean mo24838c(Editable editable);

    /* renamed from: d */
    public abstract void mo24839d(String str);

    /* renamed from: e */
    public abstract void mo24840e(Editable editable);

    /* renamed from: f */
    public abstract boolean mo24841f(int i);

    /* renamed from: g */
    public abstract boolean mo24842g(CharSequence charSequence);

    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (!(view instanceof EditText)) {
            return true;
        }
        EditText editText = (EditText) view;
        View view2 = null;
        if (i != 66) {
            boolean z = false;
            if (i != 67) {
                return false;
            }
            if (this.f24088d) {
                this.f24088d = false;
                z = true;
            }
            if (!C20964s0.m49090h(editText.getText()) && (editText.getSelectionStart() != 0 || editText.getSelectionEnd() != 0)) {
                return z;
            }
            CreditCardInputView creditCardInputView = this.f24086b;
            creditCardInputView.getClass();
            int indexOfChild = creditCardInputView.indexOfChild(creditCardInputView.getFocusedChild()) - 1;
            int childCount = creditCardInputView.getChildCount();
            if (indexOfChild >= 0 && indexOfChild < childCount) {
                view2 = creditCardInputView.getChildAt(indexOfChild);
                view2.requestFocus();
            }
            if (!(view2 instanceof EditText)) {
                return true;
            }
            EditText editText2 = (EditText) view2;
            editText2.setSelection(editText2.length());
            return true;
        }
        this.f24086b.mo24806c((Character) null);
        return true;
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (charSequence != null) {
            this.f24089e = mo24842g(charSequence);
        }
    }
}
