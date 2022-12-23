package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import androidx.core.widget.C0801k;
import androidx.core.widget.C0812p;
import p114i.C5215a;
import p127j.C5344a;
import p172m9.C5720b;

public class AppCompatCheckedTextView extends CheckedTextView implements C0812p {

    /* renamed from: b */
    public final C0395e f1141b;

    /* renamed from: c */
    public final C0392d f1142c;

    /* renamed from: d */
    public final C0468w f1143d;

    /* renamed from: e */
    public C0414i f1144e;

    public AppCompatCheckedTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C5215a.checkedTextViewStyle);
    }

    private C0414i getEmojiTextViewHelper() {
        if (this.f1144e == null) {
            this.f1144e = new C0414i(this);
        }
        return this.f1144e;
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0468w wVar = this.f1143d;
        if (wVar != null) {
            wVar.mo2188b();
        }
        C0392d dVar = this.f1142c;
        if (dVar != null) {
            dVar.mo2054a();
        }
        C0395e eVar = this.f1141b;
        if (eVar != null) {
            eVar.mo2065a();
        }
    }

    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return C0801k.m2425g(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0392d dVar = this.f1142c;
        if (dVar != null) {
            return dVar.mo2055b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0392d dVar = this.f1142c;
        if (dVar != null) {
            return dVar.mo2056c();
        }
        return null;
    }

    public ColorStateList getSupportCheckMarkTintList() {
        C0395e eVar = this.f1141b;
        if (eVar != null) {
            return eVar.f1474b;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        C0395e eVar = this.f1141b;
        if (eVar != null) {
            return eVar.f1475c;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f1143d.mo2189d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f1143d.mo2190e();
    }

    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        C5720b.m14035C(this, editorInfo, onCreateInputConnection);
        return onCreateInputConnection;
    }

    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().mo2102c(z);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0392d dVar = this.f1142c;
        if (dVar != null) {
            dVar.mo2058e();
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0392d dVar = this.f1142c;
        if (dVar != null) {
            dVar.mo2059f(i);
        }
    }

    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        C0395e eVar = this.f1141b;
        if (eVar == null) {
            return;
        }
        if (eVar.f1478f) {
            eVar.f1478f = false;
            return;
        }
        eVar.f1478f = true;
        eVar.mo2065a();
    }

    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0468w wVar = this.f1143d;
        if (wVar != null) {
            wVar.mo2188b();
        }
    }

    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0468w wVar = this.f1143d;
        if (wVar != null) {
            wVar.mo2188b();
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C0801k.m2426h(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().mo2103d(z);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0392d dVar = this.f1142c;
        if (dVar != null) {
            dVar.mo2061h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0392d dVar = this.f1142c;
        if (dVar != null) {
            dVar.mo2062i(mode);
        }
    }

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        C0395e eVar = this.f1141b;
        if (eVar != null) {
            eVar.f1474b = colorStateList;
            eVar.f1476d = true;
            eVar.mo2065a();
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        C0395e eVar = this.f1141b;
        if (eVar != null) {
            eVar.f1475c = mode;
            eVar.f1477e = true;
            eVar.mo2065a();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f1143d.mo2196l(colorStateList);
        this.f1143d.mo2188b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f1143d.mo2197m(mode);
        this.f1143d.mo2188b();
    }

    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0468w wVar = this.f1143d;
        if (wVar != null) {
            wVar.mo2192g(i, context);
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0062 A[SYNTHETIC, Splitter:B:12:0x0062] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0085 A[Catch:{ all -> 0x00b0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0096 A[Catch:{ all -> 0x00b0 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AppCompatCheckedTextView(android.content.Context r9, android.util.AttributeSet r10, int r11) {
        /*
            r8 = this;
            androidx.appcompat.widget.C0403e1.m1011a(r9)
            r8.<init>(r9, r10, r11)
            android.content.Context r9 = r8.getContext()
            androidx.appcompat.widget.C0391c1.m972a(r9, r8)
            androidx.appcompat.widget.w r9 = new androidx.appcompat.widget.w
            r9.<init>(r8)
            r8.f1143d = r9
            r9.mo2191f(r10, r11)
            r9.mo2188b()
            androidx.appcompat.widget.d r9 = new androidx.appcompat.widget.d
            r9.<init>(r8)
            r8.f1142c = r9
            r9.mo2057d(r10, r11)
            androidx.appcompat.widget.e r9 = new androidx.appcompat.widget.e
            r9.<init>(r8)
            r8.f1141b = r9
            android.content.Context r0 = r8.getContext()
            int[] r3 = p114i.C5224j.CheckedTextView
            androidx.appcompat.widget.h1 r0 = androidx.appcompat.widget.C0413h1.m1063m(r0, r10, r3, r11)
            android.content.Context r2 = r8.getContext()
            android.content.res.TypedArray r5 = r0.f1515b
            r7 = 0
            r1 = r8
            r4 = r10
            r6 = r11
            p242s1.C6333d0.m15028p(r1, r2, r3, r4, r5, r6, r7)
            int r1 = p114i.C5224j.CheckedTextView_checkMarkCompat     // Catch:{ all -> 0x00b0 }
            boolean r2 = r0.mo2098l(r1)     // Catch:{ all -> 0x00b0 }
            r3 = 0
            if (r2 == 0) goto L_0x005f
            int r1 = r0.mo2095i(r1, r3)     // Catch:{ all -> 0x00b0 }
            if (r1 == 0) goto L_0x005f
            android.content.Context r2 = r8.getContext()     // Catch:{ NotFoundException -> 0x005e }
            android.graphics.drawable.Drawable r1 = p127j.C5344a.m13397a(r2, r1)     // Catch:{ NotFoundException -> 0x005e }
            r8.setCheckMarkDrawable((android.graphics.drawable.Drawable) r1)     // Catch:{ NotFoundException -> 0x005e }
            r1 = 1
            goto L_0x0060
        L_0x005e:
        L_0x005f:
            r1 = 0
        L_0x0060:
            if (r1 != 0) goto L_0x007d
            int r1 = p114i.C5224j.CheckedTextView_android_checkMark     // Catch:{ all -> 0x00b0 }
            boolean r2 = r0.mo2098l(r1)     // Catch:{ all -> 0x00b0 }
            if (r2 == 0) goto L_0x007d
            int r1 = r0.mo2095i(r1, r3)     // Catch:{ all -> 0x00b0 }
            if (r1 == 0) goto L_0x007d
            android.widget.CheckedTextView r2 = r9.f1473a     // Catch:{ all -> 0x00b0 }
            android.content.Context r3 = r2.getContext()     // Catch:{ all -> 0x00b0 }
            android.graphics.drawable.Drawable r1 = p127j.C5344a.m13397a(r3, r1)     // Catch:{ all -> 0x00b0 }
            r2.setCheckMarkDrawable(r1)     // Catch:{ all -> 0x00b0 }
        L_0x007d:
            int r1 = p114i.C5224j.CheckedTextView_checkMarkTint     // Catch:{ all -> 0x00b0 }
            boolean r2 = r0.mo2098l(r1)     // Catch:{ all -> 0x00b0 }
            if (r2 == 0) goto L_0x008e
            android.widget.CheckedTextView r2 = r9.f1473a     // Catch:{ all -> 0x00b0 }
            android.content.res.ColorStateList r1 = r0.mo2088b(r1)     // Catch:{ all -> 0x00b0 }
            r2.setCheckMarkTintList(r1)     // Catch:{ all -> 0x00b0 }
        L_0x008e:
            int r1 = p114i.C5224j.CheckedTextView_checkMarkTintMode     // Catch:{ all -> 0x00b0 }
            boolean r2 = r0.mo2098l(r1)     // Catch:{ all -> 0x00b0 }
            if (r2 == 0) goto L_0x00a5
            android.widget.CheckedTextView r9 = r9.f1473a     // Catch:{ all -> 0x00b0 }
            r2 = -1
            int r1 = r0.mo2094h(r1, r2)     // Catch:{ all -> 0x00b0 }
            r2 = 0
            android.graphics.PorterDuff$Mode r1 = androidx.appcompat.widget.C0418j0.m1109c(r1, r2)     // Catch:{ all -> 0x00b0 }
            r9.setCheckMarkTintMode(r1)     // Catch:{ all -> 0x00b0 }
        L_0x00a5:
            r0.mo2099n()
            androidx.appcompat.widget.i r9 = r8.getEmojiTextViewHelper()
            r9.mo2101b(r10, r11)
            return
        L_0x00b0:
            r9 = move-exception
            r0.mo2099n()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AppCompatCheckedTextView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(C5344a.m13397a(getContext(), i));
    }
}
