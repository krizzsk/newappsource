package com.moovit.inputfields;

import a00.C13382a;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import ce0.C21100e;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.material.textfield.TextInputLayout;
import com.moovit.inputfields.C16069a;
import d20.C16533a;
import d20.C16534b;
import i00.C17522a;
import java.util.WeakHashMap;
import p242s1.C6333d0;
import p242s1.C6382p0;
import p824tp.C19735m;
import p977zz.C20935e;
import p977zz.C20964s0;

public class TextInputFieldView extends TextInputLayout implements C16069a {

    /* renamed from: a1 */
    public static final /* synthetic */ int f41839a1 = 0;

    /* renamed from: X0 */
    public final C16068a f41840X0;

    /* renamed from: Y0 */
    public InputField f41841Y0;

    /* renamed from: Z0 */
    public C16069a.C16070a f41842Z0;

    /* renamed from: com.moovit.inputfields.TextInputFieldView$a */
    public class C16068a extends C17522a {
        public C16068a() {
        }

        public final void afterTextChanged(Editable editable) {
            TextInputFieldView.this.setError((CharSequence) null);
            C16069a.C16070a aVar = TextInputFieldView.this.f41842Z0;
            if (aVar != null) {
                aVar.mo23440H0();
            }
        }
    }

    public TextInputFieldView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C19735m.textInputStyle);
    }

    /* renamed from: B */
    public final void mo48263B(int i, C20935e<C16069a> eVar) {
        EditText editText = getEditText();
        if (editText != null) {
            editText.setImeOptions(i);
            if (eVar != null) {
                editText.setOnEditorActionListener(new C16534b(this, i, eVar));
            } else {
                editText.setOnEditorActionListener((TextView.OnEditorActionListener) null);
            }
        }
    }

    /* renamed from: C */
    public final void mo48264C(InputField inputField, String str) {
        C21100e.m49373x(inputField, "inputField");
        this.f41841Y0 = inputField;
        setHint((CharSequence) inputField.f41831d);
        setPlaceholderText(inputField.f41833f);
        int i = inputField.f41835h;
        if (i > 0) {
            setCounterMaxLength(i);
            setCounterEnabled(true);
        }
        InputFieldType inputFieldType = inputField.f41830c;
        EditText editText = getEditText();
        if (editText != null) {
            int i2 = inputFieldType.inputType;
            if (i2 != 0) {
                editText.setInputType(i2);
            }
            String str2 = inputFieldType.autoFillHint;
            if (str2 != null) {
                String[] strArr = {str2};
                WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
                if (Build.VERSION.SDK_INT >= 26) {
                    C6333d0.C6346l.m15129j(editText, strArr);
                }
            }
            editText.setText(str);
            String str3 = inputField.f41834g;
            if (str3 != null) {
                editText.setContentDescription(str3);
                C13382a.m33668d(editText, false);
            }
        }
    }

    /* renamed from: a */
    public final InputFieldValue mo48265a() {
        EditText editText = getEditText();
        if (editText == null || this.f41841Y0 == null) {
            return null;
        }
        return new InputFieldValue(this.f41841Y0.f41829b, C20964s0.m49082C(editText.getText()));
    }

    public String getValue() {
        EditText editText = getEditText();
        if (editText != null) {
            return C20964s0.m49082C(editText.getText());
        }
        return null;
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        super.onRestoreInstanceState(bundle.getParcelable("super"));
        this.f41841Y0 = (InputField) bundle.getParcelable("inputField");
    }

    public final Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("super", super.onSaveInstanceState());
        bundle.putParcelable("inputField", this.f41841Y0);
        return bundle;
    }

    public void setInputFieldListener(C16069a.C16070a aVar) {
        C21100e.m49373x(aVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f41842Z0 = aVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0021, code lost:
        if (r0 != false) goto L_0x0025;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean validate() {
        /*
            r5 = this;
            com.moovit.inputfields.InputField r0 = r5.f41841Y0
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0024
            com.moovit.inputfields.InputFieldType r0 = r0.f41830c
            aa0.q$a r0 = r0.validator
            aa0.q$a$e r0 = (aa0.C7546q.C7547a.C7552e) r0
            r0.getClass()
            int r3 = r5.getVisibility()
            r4 = 8
            if (r3 == r4) goto L_0x0020
            boolean r0 = r0.mo23810a(r5)
            if (r0 == 0) goto L_0x001e
            goto L_0x0020
        L_0x001e:
            r0 = 0
            goto L_0x0021
        L_0x0020:
            r0 = 1
        L_0x0021:
            if (r0 == 0) goto L_0x0024
            goto L_0x0025
        L_0x0024:
            r1 = 0
        L_0x0025:
            if (r1 != 0) goto L_0x002e
            com.moovit.inputfields.InputField r0 = r5.f41841Y0
            if (r0 == 0) goto L_0x002e
            java.lang.String r0 = r0.f41832e
            goto L_0x002f
        L_0x002e:
            r0 = 0
        L_0x002f:
            r5.setError(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moovit.inputfields.TextInputFieldView.validate():boolean");
    }

    public TextInputFieldView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f41840X0 = new C16068a();
        mo42405b(new C16533a(this));
    }
}
