package p054d0;

import android.graphics.Rect;
import android.util.Size;
import androidx.camera.core.C0554h;
import androidx.camera.core.C0627p;

/* renamed from: d0.t0 */
public final class C4310t0 extends C0554h {

    /* renamed from: d */
    public final C4282g0 f15259d;

    /* renamed from: e */
    public final int f15260e;

    /* renamed from: f */
    public final int f15261f;

    public C4310t0(C0627p pVar, Size size, C4282g0 g0Var) {
        super(pVar);
        if (size == null) {
            this.f15260e = super.getWidth();
            this.f15261f = super.getHeight();
        } else {
            this.f15260e = size.getWidth();
            this.f15261f = size.getHeight();
        }
        this.f15259d = g0Var;
    }

    public final synchronized int getHeight() {
        return this.f15261f;
    }

    public final C4282g0 getImageInfo() {
        return this.f15259d;
    }

    public final synchronized int getWidth() {
        return this.f15260e;
    }

    public final synchronized void setCropRect(Rect rect) {
        Rect rect2 = new Rect(rect);
        if (!rect2.intersect(0, 0, getWidth(), getHeight())) {
            rect2.setEmpty();
        }
    }
}
