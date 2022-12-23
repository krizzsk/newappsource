package p839ug;

import android.graphics.PointF;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.internal.mlkit_vision_face.zzu;
import com.google.android.gms.internal.mlkit_vision_face.zzv;

/* renamed from: ug.e */
public final class C19911e {

    /* renamed from: a */
    public final int f50561a;

    /* renamed from: b */
    public final PointF f50562b;

    public C19911e(int i, PointF pointF) {
        this.f50561a = i;
        this.f50562b = pointF;
    }

    @RecentlyNonNull
    public final String toString() {
        zzu zza = zzv.zza("FaceLandmark");
        zza.zzd("type", this.f50561a);
        zza.zza("position", this.f50562b);
        return zza.toString();
    }
}
