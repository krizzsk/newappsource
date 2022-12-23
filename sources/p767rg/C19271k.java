package p767rg;

import android.graphics.Point;
import android.graphics.Rect;
import com.google.android.gms.internal.mlkit_vision_barcode.zzq;
import p745qg.C19119a;

/* renamed from: rg.k */
public final class C19271k implements C19119a {

    /* renamed from: a */
    public final zzq f48984a;

    public C19271k(zzq zzq) {
        this.f48984a = zzq;
    }

    /* renamed from: a */
    public final Rect mo51553a() {
        zzq zzq = this.f48984a;
        if (zzq.zze == null) {
            return null;
        }
        int i = 0;
        int i2 = Integer.MIN_VALUE;
        int i3 = Integer.MIN_VALUE;
        int i4 = Integer.MAX_VALUE;
        int i5 = Integer.MAX_VALUE;
        while (true) {
            Point[] pointArr = zzq.zze;
            if (i >= pointArr.length) {
                return new Rect(i4, i5, i2, i3);
            }
            Point point = pointArr[i];
            i4 = Math.min(i4, point.x);
            i2 = Math.max(i2, point.x);
            i5 = Math.min(i5, point.y);
            i3 = Math.max(i3, point.y);
            i++;
        }
    }

    /* renamed from: b */
    public final String mo51554b() {
        return this.f48984a.zzb;
    }

    /* renamed from: c */
    public final int mo51555c() {
        return this.f48984a.zzd;
    }

    /* renamed from: d */
    public final Point[] mo51556d() {
        return this.f48984a.zze;
    }

    public final int getFormat() {
        return this.f48984a.zza;
    }
}
