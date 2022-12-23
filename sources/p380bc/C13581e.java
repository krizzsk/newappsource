package p380bc;

import android.graphics.Matrix;
import android.util.Property;
import android.widget.ImageView;

/* renamed from: bc.e */
public final class C13581e extends Property<ImageView, Matrix> {

    /* renamed from: a */
    public final Matrix f33545a = new Matrix();

    public C13581e() {
        super(Matrix.class, "imageMatrixProperty");
    }

    public final Object get(Object obj) {
        this.f33545a.set(((ImageView) obj).getImageMatrix());
        return this.f33545a;
    }

    public final void set(Object obj, Object obj2) {
        ((ImageView) obj).setImageMatrix((Matrix) obj2);
    }
}
