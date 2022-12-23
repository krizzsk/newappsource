package p718pc;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.provider.Settings;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import p188o.C5892b;
import p718pc.C18893c;

/* renamed from: pc.m */
public final class C18907m<S extends C18893c> extends C18904k {

    /* renamed from: m */
    public C18906l<S> f48128m;

    /* renamed from: n */
    public C5892b f48129n;

    public C18907m(Context context, C18893c cVar, C18906l<S> lVar, C5892b bVar) {
        super(context, cVar);
        this.f48128m = lVar;
        lVar.f48127b = this;
        this.f48129n = bVar;
        bVar.f18961a = this;
    }

    public final void draw(Canvas canvas) {
        Rect rect = new Rect();
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(rect)) {
            canvas.save();
            C18906l<S> lVar = this.f48128m;
            float b = mo51402b();
            lVar.f48126a.mo42099a();
            lVar.mo51382a(canvas, b);
            this.f48128m.mo51384c(canvas, this.f48124j);
            int i = 0;
            while (true) {
                C5892b bVar = this.f48129n;
                int[] iArr = (int[]) bVar.f18963c;
                if (i < iArr.length) {
                    C18906l<S> lVar2 = this.f48128m;
                    Paint paint = this.f48124j;
                    float[] fArr = (float[]) bVar.f18962b;
                    int i2 = i * 2;
                    lVar2.mo51383b(canvas, paint, fArr[i2], fArr[i2 + 1], iArr[i]);
                    i++;
                } else {
                    canvas.restore();
                    return;
                }
            }
        }
    }

    /* renamed from: f */
    public final boolean mo51395f(boolean z, boolean z2, boolean z3) {
        boolean f = super.mo51395f(z, z2, z3);
        if (!isRunning()) {
            this.f48129n.mo21794c();
        }
        C18887a aVar = this.f48118d;
        ContentResolver contentResolver = this.f48116b.getContentResolver();
        aVar.getClass();
        float f2 = Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f);
        if (z && (z3 || (Build.VERSION.SDK_INT <= 21 && f2 > BitmapDescriptorFactory.HUE_RED))) {
            this.f48129n.mo21800i();
        }
        return f;
    }

    public final int getIntrinsicHeight() {
        return this.f48128m.mo51385d();
    }

    public final int getIntrinsicWidth() {
        return this.f48128m.mo51386e();
    }
}
