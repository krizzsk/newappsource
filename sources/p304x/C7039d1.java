package p304x;

import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.util.Size;
import android.view.Display;
import androidx.camera.core.impl.SurfaceConfig;
import p001a0.C0024o;
import p019b0.C1430g;

/* renamed from: x.d1 */
public final class C7039d1 {

    /* renamed from: d */
    public static final Size f21895d = new Size(1920, 1080);

    /* renamed from: e */
    public static final Object f21896e = new Object();

    /* renamed from: f */
    public static volatile C7039d1 f21897f;

    /* renamed from: a */
    public final DisplayManager f21898a;

    /* renamed from: b */
    public volatile Size f21899b = null;

    /* renamed from: c */
    public final C1430g f21900c = new C1430g();

    public C7039d1(Context context) {
        this.f21898a = (DisplayManager) context.getSystemService("display");
    }

    /* renamed from: b */
    public static C7039d1 m16545b(Context context) {
        if (f21897f == null) {
            synchronized (f21896e) {
                if (f21897f == null) {
                    f21897f = new C7039d1(context);
                }
            }
        }
        return f21897f;
    }

    /* renamed from: a */
    public final Size mo23299a() {
        Size size;
        Size a;
        boolean z;
        Point point = new Point();
        mo23300c().getRealSize(point);
        if (point.x > point.y) {
            size = new Size(point.x, point.y);
        } else {
            size = new Size(point.y, point.x);
        }
        int height = size.getHeight() * size.getWidth();
        Size size2 = f21895d;
        if (height > size2.getHeight() * size2.getWidth()) {
            size = size2;
        }
        if (this.f21900c.f5278a == null || (a = C0024o.m94a(SurfaceConfig.ConfigType.PRIV)) == null) {
            return size;
        }
        if (a.getHeight() * a.getWidth() > size.getHeight() * size.getWidth()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return a;
        }
        return size;
    }

    /* renamed from: c */
    public final Display mo23300c() {
        Display[] displays = this.f21898a.getDisplays();
        if (displays.length == 1) {
            return displays[0];
        }
        Display display = null;
        int i = -1;
        for (Display display2 : displays) {
            if (display2.getState() != 1) {
                Point point = new Point();
                display2.getRealSize(point);
                int i2 = point.x;
                int i3 = point.y;
                if (i2 * i3 > i) {
                    display = display2;
                    i = i2 * i3;
                }
            }
        }
        if (display != null) {
            return display;
        }
        throw new IllegalArgumentException("No display can be found from the input display manager!");
    }

    /* renamed from: d */
    public final Size mo23301d() {
        if (this.f21899b != null) {
            return this.f21899b;
        }
        this.f21899b = mo23299a();
        return this.f21899b;
    }
}
