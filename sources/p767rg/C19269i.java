package p767rg;

import android.graphics.Point;
import android.graphics.Rect;
import com.google.android.gms.internal.mlkit_vision_barcode.zzon;
import p745qg.C19119a;

/* renamed from: rg.i */
public final class C19269i implements C19119a {

    /* renamed from: a */
    public final zzon f48975a;

    public C19269i(zzon zzon) {
        this.f48975a = zzon;
    }

    /* renamed from: a */
    public final Rect mo51553a() {
        Point[] zzo = this.f48975a.zzo();
        if (zzo == null) {
            return null;
        }
        int i = Integer.MIN_VALUE;
        int i2 = Integer.MIN_VALUE;
        int i3 = Integer.MAX_VALUE;
        int i4 = Integer.MAX_VALUE;
        for (Point point : zzo) {
            i3 = Math.min(i3, point.x);
            i = Math.max(i, point.x);
            i4 = Math.min(i4, point.y);
            i2 = Math.max(i2, point.y);
        }
        return new Rect(i3, i4, i, i2);
    }

    /* renamed from: b */
    public final String mo51554b() {
        return this.f48975a.zzm();
    }

    /* renamed from: c */
    public final int mo51555c() {
        return this.f48975a.zzb();
    }

    /* renamed from: d */
    public final Point[] mo51556d() {
        return this.f48975a.zzo();
    }

    public final int getFormat() {
        return this.f48975a.zza();
    }
}
