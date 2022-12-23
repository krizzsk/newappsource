package com.google.android.material.textfield;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;

/* renamed from: com.google.android.material.textfield.p */
public final class C14197p extends View.AccessibilityDelegate {

    /* renamed from: a */
    public final /* synthetic */ C14195o f35651a;

    public C14197p(C14195o oVar) {
        this.f35651a = oVar;
    }

    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        EditText editText = this.f35651a.f35626b.getEditText();
        if (editText != null) {
            accessibilityNodeInfo.setLabeledBy(editText);
        }
    }
}
