package p839ug;

import android.graphics.PointF;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.internal.mlkit_vision_face.zzu;
import com.google.android.gms.internal.mlkit_vision_face.zzv;
import java.util.List;

/* renamed from: ug.b */
public final class C19908b {

    /* renamed from: a */
    public final int f50552a;

    /* renamed from: b */
    public final List<PointF> f50553b;

    public C19908b(int i, @RecentlyNonNull List<PointF> list) {
        this.f50552a = i;
        this.f50553b = list;
    }

    @RecentlyNonNull
    public final String toString() {
        zzu zza = zzv.zza("FaceContour");
        zza.zzd("type", this.f50552a);
        zza.zza("points", this.f50553b.toArray());
        return zza.toString();
    }
}
