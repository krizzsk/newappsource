package p176n0;

import android.view.View;
import androidx.camera.view.PreviewView;
import p583jk.C17884p;

/* renamed from: n0.f */
public final /* synthetic */ class C5787f implements View.OnLayoutChangeListener {

    /* renamed from: b */
    public final /* synthetic */ PreviewView f18731b;

    public /* synthetic */ C5787f(PreviewView previewView) {
        this.f18731b = previewView;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        boolean z;
        PreviewView previewView = this.f18731b;
        PreviewView.ImplementationMode implementationMode = PreviewView.f2234m;
        previewView.getClass();
        if (i3 - i == i7 - i5 && i4 - i2 == i8 - i6) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            previewView.mo2611a();
            C17884p.m44372k();
            previewView.getDisplay();
            previewView.getViewPort();
        }
    }
}
