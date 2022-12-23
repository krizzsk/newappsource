package p787sc;

import android.graphics.Paint;
import android.graphics.Path;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import p129j1.C5348a;

/* renamed from: sc.a */
public final class C19444a {

    /* renamed from: i */
    public static final int[] f49454i = new int[3];

    /* renamed from: j */
    public static final float[] f49455j = {BitmapDescriptorFactory.HUE_RED, 0.5f, 1.0f};

    /* renamed from: k */
    public static final int[] f49456k = new int[4];

    /* renamed from: l */
    public static final float[] f49457l = {BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0.5f, 1.0f};

    /* renamed from: a */
    public final Paint f49458a = new Paint();

    /* renamed from: b */
    public final Paint f49459b;

    /* renamed from: c */
    public final Paint f49460c;

    /* renamed from: d */
    public int f49461d;

    /* renamed from: e */
    public int f49462e;

    /* renamed from: f */
    public int f49463f;

    /* renamed from: g */
    public final Path f49464g = new Path();

    /* renamed from: h */
    public Paint f49465h = new Paint();

    public C19444a() {
        mo51854a(-16777216);
        this.f49465h.setColor(0);
        Paint paint = new Paint(4);
        this.f49459b = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f49460c = new Paint(paint);
    }

    /* renamed from: a */
    public final void mo51854a(int i) {
        this.f49461d = C5348a.m13417m(i, 68);
        this.f49462e = C5348a.m13417m(i, 20);
        this.f49463f = C5348a.m13417m(i, 0);
        this.f49458a.setColor(this.f49461d);
    }
}
