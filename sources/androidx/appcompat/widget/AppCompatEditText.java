package androidx.appcompat.widget;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import androidx.appcompat.widget.C0465v;
import androidx.core.widget.C0801k;
import androidx.core.widget.C0811o;
import androidx.core.widget.C0812p;
import p114i.C5215a;
import p172m9.C5720b;
import p242s1.C6323c;
import p242s1.C6333d0;
import p242s1.C6395v;
import p280v1.C6838a;
import p280v1.C6839b;
import p280v1.C6840c;
import p304x.C7038d0;

public class AppCompatEditText extends EditText implements C6395v, C0812p {

    /* renamed from: b */
    public final C0392d f1145b;

    /* renamed from: c */
    public final C0468w f1146c;

    /* renamed from: d */
    public final C0465v f1147d;

    /* renamed from: e */
    public final C0811o f1148e;

    /* renamed from: f */
    public final C0411h f1149f;

    public AppCompatEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C5215a.editTextStyle);
    }

    /* renamed from: a */
    public final C6323c mo1480a(C6323c cVar) {
        return this.f1148e.mo3529a(this, cVar);
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0392d dVar = this.f1145b;
        if (dVar != null) {
            dVar.mo2054a();
        }
        C0468w wVar = this.f1146c;
        if (wVar != null) {
            wVar.mo2188b();
        }
    }

    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return C0801k.m2425g(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0392d dVar = this.f1145b;
        if (dVar != null) {
            return dVar.mo2055b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0392d dVar = this.f1145b;
        if (dVar != null) {
            return dVar.mo2056c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f1146c.mo2189d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f1146c.mo2190e();
    }

    public TextClassifier getTextClassifier() {
        C0465v vVar;
        if (Build.VERSION.SDK_INT >= 28 || (vVar = this.f1147d) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = vVar.f1630b;
        if (textClassifier == null) {
            return C0465v.C0466a.m1285a(vVar.f1629a);
        }
        return textClassifier;
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        int i;
        String[] h;
        InputConnection cVar;
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f1146c.getClass();
        C0468w.m1287h(this, onCreateInputConnection, editorInfo);
        C5720b.m14035C(this, editorInfo, onCreateInputConnection);
        if (!(onCreateInputConnection == null || (i = Build.VERSION.SDK_INT) > 30 || (h = C6333d0.m15020h(this)) == null)) {
            C6838a.m16154b(editorInfo, h);
            C7038d0 d0Var = new C7038d0(this, 2);
            if (i >= 25) {
                cVar = new C6839b(onCreateInputConnection, d0Var);
            } else if (C6838a.m16153a(editorInfo).length != 0) {
                cVar = new C6840c(onCreateInputConnection, d0Var);
            }
            onCreateInputConnection = cVar;
        }
        return this.f1149f.mo2084f(onCreateInputConnection, editorInfo);
    }

    public final boolean onDragEvent(DragEvent dragEvent) {
        Activity activity;
        int i = Build.VERSION.SDK_INT;
        boolean z = false;
        if (i < 31 && i >= 24 && dragEvent.getLocalState() == null && C6333d0.m15020h(this) != null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    activity = null;
                    break;
                } else if (context instanceof Activity) {
                    activity = (Activity) context;
                    break;
                } else {
                    context = ((ContextWrapper) context).getBaseContext();
                }
            }
            if (activity == null) {
                toString();
            } else if (dragEvent.getAction() != 1 && dragEvent.getAction() == 3) {
                z = C0454s.m1266a(dragEvent, this, activity);
            }
        }
        if (z) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    public final boolean onTextContextMenuItem(int i) {
        ClipData clipData;
        C6323c.C6325b bVar;
        int i2 = Build.VERSION.SDK_INT;
        int i3 = 0;
        if (i2 < 31 && C6333d0.m15020h(this) != null && (i == 16908322 || i == 16908337)) {
            ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
            if (clipboardManager == null) {
                clipData = null;
            } else {
                clipData = clipboardManager.getPrimaryClip();
            }
            if (clipData != null && clipData.getItemCount() > 0) {
                if (i2 >= 31) {
                    bVar = new C6323c.C6324a(clipData, 1);
                } else {
                    bVar = new C6323c.C6326c(clipData, 1);
                }
                if (i != 16908322) {
                    i3 = 1;
                }
                bVar.mo22453b(i3);
                C6333d0.m15025m(this, bVar.build());
            }
            i3 = 1;
        }
        if (i3 != 0) {
            return true;
        }
        return super.onTextContextMenuItem(i);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0392d dVar = this.f1145b;
        if (dVar != null) {
            dVar.mo2058e();
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0392d dVar = this.f1145b;
        if (dVar != null) {
            dVar.mo2059f(i);
        }
    }

    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0468w wVar = this.f1146c;
        if (wVar != null) {
            wVar.mo2188b();
        }
    }

    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0468w wVar = this.f1146c;
        if (wVar != null) {
            wVar.mo2188b();
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C0801k.m2426h(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.f1149f.mo2085g(z);
    }

    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f1149f.mo2082d(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0392d dVar = this.f1145b;
        if (dVar != null) {
            dVar.mo2061h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0392d dVar = this.f1145b;
        if (dVar != null) {
            dVar.mo2062i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f1146c.mo2196l(colorStateList);
        this.f1146c.mo2188b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f1146c.mo2197m(mode);
        this.f1146c.mo2188b();
    }

    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0468w wVar = this.f1146c;
        if (wVar != null) {
            wVar.mo2192g(i, context);
        }
    }

    public void setTextClassifier(TextClassifier textClassifier) {
        C0465v vVar;
        if (Build.VERSION.SDK_INT >= 28 || (vVar = this.f1147d) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            vVar.f1630b = textClassifier;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AppCompatEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C0403e1.m1011a(context);
        C0391c1.m972a(getContext(), this);
        C0392d dVar = new C0392d(this);
        this.f1145b = dVar;
        dVar.mo2057d(attributeSet, i);
        C0468w wVar = new C0468w(this);
        this.f1146c = wVar;
        wVar.mo2191f(attributeSet, i);
        wVar.mo2188b();
        this.f1147d = new C0465v(this);
        this.f1148e = new C0811o();
        C0411h hVar = new C0411h((EditText) this);
        this.f1149f = hVar;
        hVar.mo2083e(attributeSet, i);
        KeyListener keyListener = getKeyListener();
        if (!(keyListener instanceof NumberKeyListener)) {
            boolean isFocusable = super.isFocusable();
            boolean isClickable = super.isClickable();
            boolean isLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener d = hVar.mo2082d(keyListener);
            if (d != keyListener) {
                super.setKeyListener(d);
                super.setRawInputType(inputType);
                super.setFocusable(isFocusable);
                super.setClickable(isClickable);
                super.setLongClickable(isLongClickable);
            }
        }
    }

    public Editable getText() {
        if (Build.VERSION.SDK_INT >= 28) {
            return super.getText();
        }
        return super.getEditableText();
    }
}
