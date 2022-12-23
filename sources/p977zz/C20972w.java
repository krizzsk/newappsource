package p977zz;

import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.Field;

/* renamed from: zz.w */
public abstract class C20972w {

    /* renamed from: d */
    public static Field f52726d;

    /* renamed from: a */
    public final ViewGroup f52727a;

    /* renamed from: b */
    public View[] f52728b = null;

    /* renamed from: c */
    public boolean f52729c = false;

    public C20972w(ViewGroup viewGroup) {
        this.f52727a = viewGroup;
    }

    /* renamed from: a */
    public final View[] mo53043a() {
        try {
            if (f52726d == null) {
                Field declaredField = ViewGroup.class.getDeclaredField("mChildren");
                f52726d = declaredField;
                declaredField.setAccessible(true);
            }
            return (View[]) f52726d.get(this.f52727a);
        } catch (IllegalAccessException | NoSuchFieldException e) {
            e.printStackTrace();
            throw new IllegalStateException("Unable to retrieve mChildren");
        }
    }

    /* renamed from: b */
    public final void mo53044b() {
        View[] a = mo53043a();
        int length = a.length;
        for (int i = 0; i < length; i++) {
            a[i] = this.f52728b[i];
        }
        int i2 = 0;
        while (true) {
            View[] viewArr = this.f52728b;
            if (i2 < viewArr.length) {
                viewArr[i2] = null;
                i2++;
            } else {
                this.f52729c = false;
                return;
            }
        }
    }
}
