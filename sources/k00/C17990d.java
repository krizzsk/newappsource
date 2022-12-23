package k00;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Property;

/* renamed from: k00.d */
public final class C17990d extends C17987a {

    /* renamed from: b */
    public float f46072b = 180.0f;

    /* renamed from: k00.d$a */
    public class C17991a extends Property<C17990d, Float> {
        public C17991a() {
            super(Float.class, "rotation");
        }

        public final Object get(Object obj) {
            return Float.valueOf(((C17990d) obj).f46072b);
        }

        public final void set(Object obj, Object obj2) {
            C17990d dVar = (C17990d) obj;
            dVar.f46072b = ((Float) obj2).floatValue();
            dVar.invalidateSelf();
        }
    }

    static {
        new C17991a();
    }

    public C17990d(Drawable drawable) {
        super(drawable);
    }

    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        float exactCenterX = bounds.exactCenterX();
        float exactCenterY = bounds.exactCenterY();
        canvas.save();
        canvas.rotate(this.f46072b, exactCenterX, exactCenterY);
        super.draw(canvas);
        canvas.restore();
    }
}
