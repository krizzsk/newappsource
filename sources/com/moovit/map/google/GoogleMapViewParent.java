package com.moovit.map.google;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.moovit.map.MapFragmentView;
import s20.C19408h;

public class GoogleMapViewParent extends FrameLayout implements MapFragmentView.C16241a {

    /* renamed from: b */
    public C19408h f42544b;

    /* renamed from: c */
    public boolean f42545c = true;

    public GoogleMapViewParent(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public final void mo48698a(int i, int i2, int i3, int i4) {
        C19408h hVar = this.f42544b;
        if (hVar != null) {
            hVar.f49375G.set(i, i2, i3, i4);
            hVar.mo51822M();
        }
    }

    public GoogleMapView getMapView() {
        return (GoogleMapView) getChildAt(0);
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z = this.f42544b.f49381M;
        if (!this.f42545c) {
            return true;
        }
        requestDisallowInterceptTouchEvent(z);
        return true;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f42544b.f49381M) {
            return false;
        }
        getChildAt(0).dispatchTouchEvent(motionEvent);
        return true;
    }

    public void setOwner(C19408h hVar) {
        this.f42544b = hVar;
    }

    public void setRequestDisallowInterceptTouchEvent(boolean z) {
        this.f42545c = z;
    }

    public GoogleMapViewParent(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
