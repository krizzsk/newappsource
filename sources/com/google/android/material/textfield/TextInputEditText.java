package com.google.android.material.textfield;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.text.Editable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.appcompat.widget.AppCompatEditText;
import com.google.android.material.internal.C14077m;
import java.util.Locale;
import p355ac.C13401b;
import p355ac.C13410k;
import p355ac.C13411l;
import p883wc.C20289a;

public class TextInputEditText extends AppCompatEditText {

    /* renamed from: g */
    public final Rect f35475g;

    /* renamed from: h */
    public boolean f35476h;

    public TextInputEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C13401b.editTextStyle);
    }

    private CharSequence getHintFromLayout() {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null) {
            return textInputLayout.getHint();
        }
        return null;
    }

    private TextInputLayout getTextInputLayout() {
        for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    public final void getFocusedRect(Rect rect) {
        boolean z;
        super.getFocusedRect(rect);
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout == null || !this.f35476h) {
            z = false;
        } else {
            z = true;
        }
        if (z && rect != null) {
            textInputLayout.getFocusedRect(this.f35475g);
            rect.bottom = this.f35475g.bottom;
        }
    }

    public final boolean getGlobalVisibleRect(Rect rect, Point point) {
        boolean z;
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout == null || !this.f35476h) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return textInputLayout.getGlobalVisibleRect(rect, point);
        }
        return super.getGlobalVisibleRect(rect, point);
    }

    public CharSequence getHint() {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout == null || !textInputLayout.f35488F) {
            return super.getHint();
        }
        return textInputLayout.getHint();
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null && textInputLayout.f35488F && super.getHint() == null && Build.MANUFACTURER.toLowerCase(Locale.ENGLISH).equals("meizu")) {
            setHint("");
        }
    }

    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection != null && editorInfo.hintText == null) {
            editorInfo.hintText = getHintFromLayout();
        }
        return onCreateInputConnection;
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        String str;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        TextInputLayout textInputLayout = getTextInputLayout();
        if (Build.VERSION.SDK_INT < 23 && textInputLayout != null) {
            Editable text = getText();
            CharSequence hint = textInputLayout.getHint();
            boolean z = !TextUtils.isEmpty(text);
            String str2 = "";
            if (!TextUtils.isEmpty(hint)) {
                str = hint.toString();
            } else {
                str = str2;
            }
            if (z) {
                StringBuilder sb = new StringBuilder();
                sb.append(text);
                if (!TextUtils.isEmpty(str)) {
                    str2 = C25541a.m63881k(", ", str);
                }
                sb.append(str2);
                str2 = sb.toString();
            } else if (!TextUtils.isEmpty(str)) {
                str2 = str;
            }
            accessibilityNodeInfo.setText(str2);
        }
    }

    public final boolean requestRectangleOnScreen(Rect rect) {
        boolean z;
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout == null || !this.f35476h) {
            z = false;
        } else {
            z = true;
        }
        if (!z || rect == null) {
            return super.requestRectangleOnScreen(rect);
        }
        this.f35475g.set(rect.left, rect.top, rect.right, rect.bottom + (textInputLayout.getHeight() - getHeight()));
        return super.requestRectangleOnScreen(this.f35475g);
    }

    public void setTextInputLayoutFocusedRectEnabled(boolean z) {
        this.f35476h = z;
    }

    public TextInputEditText(Context context, AttributeSet attributeSet, int i) {
        super(C20289a.m47861a(context, attributeSet, i, 0), attributeSet, i);
        this.f35475g = new Rect();
        TypedArray d = C14077m.m35060d(context, attributeSet, C13411l.TextInputEditText, i, C13410k.Widget_Design_TextInputEditText, new int[0]);
        setTextInputLayoutFocusedRectEnabled(d.getBoolean(C13411l.TextInputEditText_textInputLayoutFocusedRectEnabled, false));
        d.recycle();
    }
}
