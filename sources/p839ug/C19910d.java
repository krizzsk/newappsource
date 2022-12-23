package p839ug;

import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.internal.mlkit_vision_face.zzu;
import com.google.android.gms.internal.mlkit_vision_face.zzv;
import java.util.concurrent.Executor;

/* renamed from: ug.d */
public final class C19910d {

    /* renamed from: a */
    public final int f50554a;

    /* renamed from: b */
    public final int f50555b = 1;

    /* renamed from: c */
    public final int f50556c;

    /* renamed from: d */
    public final int f50557d;

    /* renamed from: e */
    public final boolean f50558e;

    /* renamed from: f */
    public final float f50559f;

    /* renamed from: g */
    public final Executor f50560g;

    public /* synthetic */ C19910d(int i, int i2, int i3) {
        this.f50554a = i;
        this.f50556c = i2;
        this.f50557d = i3;
        this.f50558e = false;
        this.f50559f = 0.1f;
        this.f50560g = null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C19910d)) {
            return false;
        }
        C19910d dVar = (C19910d) obj;
        if (Float.floatToIntBits(this.f50559f) == Float.floatToIntBits(dVar.f50559f) && this.f50554a == dVar.f50554a && this.f50555b == dVar.f50555b && this.f50557d == dVar.f50557d && this.f50558e == dVar.f50558e && this.f50556c == dVar.f50556c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(Integer.valueOf(Float.floatToIntBits(this.f50559f)), Integer.valueOf(this.f50554a), Integer.valueOf(this.f50555b), Integer.valueOf(this.f50557d), Boolean.valueOf(this.f50558e), Integer.valueOf(this.f50556c));
    }

    @RecentlyNonNull
    public final String toString() {
        zzu zza = zzv.zza("FaceDetectorOptions");
        zza.zzd("landmarkMode", this.f50554a);
        zza.zzd("contourMode", this.f50555b);
        zza.zzd("classificationMode", this.f50556c);
        zza.zzd("performanceMode", this.f50557d);
        zza.zzb("trackingEnabled", this.f50558e);
        zza.zzc("minFaceSize", this.f50559f);
        return zza.toString();
    }
}
