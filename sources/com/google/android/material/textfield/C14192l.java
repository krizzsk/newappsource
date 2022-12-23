package com.google.android.material.textfield;

import android.view.MotionEvent;
import android.view.View;
import android.widget.AutoCompleteTextView;

/* renamed from: com.google.android.material.textfield.l */
public final class C14192l implements View.OnTouchListener {

    /* renamed from: b */
    public final /* synthetic */ AutoCompleteTextView f35619b;

    /* renamed from: c */
    public final /* synthetic */ C14178h f35620c;

    public C14192l(C14178h hVar, AutoCompleteTextView autoCompleteTextView) {
        this.f35620c = hVar;
        this.f35619b = autoCompleteTextView;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        if (motionEvent.getAction() == 1) {
            C14178h hVar = this.f35620c;
            hVar.getClass();
            long currentTimeMillis = System.currentTimeMillis() - hVar.f35598n;
            if (currentTimeMillis < 0 || currentTimeMillis > 300) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.f35620c.f35596l = false;
            }
            C14178h.m35264d(this.f35620c, this.f35619b);
            C14178h hVar2 = this.f35620c;
            hVar2.f35596l = true;
            hVar2.f35598n = System.currentTimeMillis();
        }
        return false;
    }
}
