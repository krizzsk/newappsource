package com.moovit.design.dialog;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.Window;
import androidx.appcompat.app.C0259p;
import w00.C20261b;
import w00.C20266g;
import w00.C20267h;

/* renamed from: com.moovit.design.dialog.a */
public final class C15858a extends C0259p {
    public C15858a(Context context, int i) {
        super(context, i);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes((AttributeSet) null, C20267h.MoovitDialog, C20261b.dialogTheme, C20266g.ThemeOverlay_Moovit_Dialog);
            try {
                int i = C20267h.MoovitDialog_android_layout_width;
                if (obtainStyledAttributes.hasValue(i)) {
                    int i2 = C20267h.MoovitDialog_android_layout_height;
                    if (obtainStyledAttributes.hasValue(i2)) {
                        window.setLayout(obtainStyledAttributes.getInt(i, -2), obtainStyledAttributes.getInt(i2, -2));
                    }
                }
                int i3 = C20267h.MoovitDialog_android_layout_gravity;
                if (obtainStyledAttributes.hasValue(i3)) {
                    window.setGravity(obtainStyledAttributes.getInt(i3, 17));
                }
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
    }
}
