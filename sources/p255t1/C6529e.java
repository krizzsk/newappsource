package p255t1;

import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.C14178h;
import com.google.android.material.textfield.TextInputLayout;
import java.util.WeakHashMap;
import p242s1.C6333d0;
import p242s1.C6382p0;

/* renamed from: t1.e */
public final class C6529e implements AccessibilityManager.TouchExplorationStateChangeListener {

    /* renamed from: a */
    public final C6528d f20332a;

    public C6529e(C6528d dVar) {
        this.f20332a = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6529e)) {
            return false;
        }
        return this.f20332a.equals(((C6529e) obj).f20332a);
    }

    public final int hashCode() {
        return this.f20332a.hashCode();
    }

    public final void onTouchExplorationStateChanged(boolean z) {
        AutoCompleteTextView autoCompleteTextView;
        boolean z2;
        C14178h.C14187g gVar = (C14178h.C14187g) this.f20332a;
        TextInputLayout textInputLayout = C14178h.this.f35621a;
        if (textInputLayout != null && (autoCompleteTextView = (AutoCompleteTextView) textInputLayout.getEditText()) != null) {
            int i = 1;
            if (autoCompleteTextView.getKeyListener() != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                CheckableImageButton checkableImageButton = C14178h.this.f35623c;
                if (z) {
                    i = 2;
                }
                WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
                C6333d0.C6337d.m15059s(checkableImageButton, i);
            }
        }
    }
}
