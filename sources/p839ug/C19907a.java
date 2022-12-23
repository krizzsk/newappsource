package p839ug;

import android.graphics.PointF;
import android.graphics.Rect;
import android.util.SparseArray;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.internal.mlkit_vision_face.zzd;
import com.google.android.gms.internal.mlkit_vision_face.zzf;
import com.google.android.gms.internal.mlkit_vision_face.zzlf;
import com.google.android.gms.internal.mlkit_vision_face.zzlj;
import com.google.android.gms.internal.mlkit_vision_face.zzlp;
import com.google.android.gms.internal.mlkit_vision_face.zzn;
import com.google.android.gms.internal.mlkit_vision_face.zzu;
import com.google.android.gms.internal.mlkit_vision_face.zzv;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: ug.a */
public final class C19907a {

    /* renamed from: a */
    public final Rect f50542a;

    /* renamed from: b */
    public int f50543b;

    /* renamed from: c */
    public final float f50544c;

    /* renamed from: d */
    public final float f50545d;

    /* renamed from: e */
    public final float f50546e;

    /* renamed from: f */
    public final float f50547f;

    /* renamed from: g */
    public final float f50548g;

    /* renamed from: h */
    public final float f50549h;

    /* renamed from: i */
    public final SparseArray<C19911e> f50550i = new SparseArray<>();

    /* renamed from: j */
    public final SparseArray<C19908b> f50551j = new SparseArray<>();

    public C19907a(zzf zzf) {
        float f = zzf.zzc;
        float f2 = zzf.zze / 2.0f;
        float f3 = zzf.zzd;
        float f4 = zzf.zzf / 2.0f;
        this.f50542a = new Rect((int) (f - f2), (int) (f3 - f4), (int) (f + f2), (int) (f3 + f4));
        this.f50543b = zzf.zzb;
        for (zzn zzn : zzf.zzj) {
            if (m47421b(zzn.zzd)) {
                SparseArray<C19911e> sparseArray = this.f50550i;
                int i = zzn.zzd;
                sparseArray.put(i, new C19911e(i, new PointF(zzn.zzb, zzn.zzc)));
            }
        }
        for (zzd zzd : zzf.zzn) {
            int i2 = zzd.zzb;
            if (i2 <= 15 && i2 > 0) {
                SparseArray<C19908b> sparseArray2 = this.f50551j;
                PointF[] pointFArr = zzd.zza;
                pointFArr.getClass();
                int length = pointFArr.length;
                long j = ((long) length) + 5 + ((long) (length / 10));
                ArrayList arrayList = new ArrayList(j > 2147483647L ? Integer.MAX_VALUE : (int) j);
                Collections.addAll(arrayList, pointFArr);
                sparseArray2.put(i2, new C19908b(i2, arrayList));
            }
        }
        this.f50547f = zzf.zzi;
        this.f50548g = zzf.zzg;
        this.f50549h = zzf.zzh;
        this.f50546e = zzf.zzm;
        this.f50545d = zzf.zzk;
        this.f50544c = zzf.zzl;
    }

    /* renamed from: b */
    public static boolean m47421b(int i) {
        return i == 0 || i == 1 || i == 7 || i == 3 || i == 9 || i == 4 || i == 10 || i == 5 || i == 11 || i == 6;
    }

    /* renamed from: a */
    public final void mo52185a(@RecentlyNonNull SparseArray<C19908b> sparseArray) {
        this.f50551j.clear();
        for (int i = 0; i < sparseArray.size(); i++) {
            this.f50551j.put(sparseArray.keyAt(i), sparseArray.valueAt(i));
        }
    }

    @RecentlyNonNull
    public final String toString() {
        zzu zza = zzv.zza("Face");
        zza.zza("boundingBox", this.f50542a);
        zza.zzd("trackingId", this.f50543b);
        zza.zzc("rightEyeOpenProbability", this.f50544c);
        zza.zzc("leftEyeOpenProbability", this.f50545d);
        zza.zzc("smileProbability", this.f50546e);
        zza.zzc("eulerX", this.f50547f);
        zza.zzc("eulerY", this.f50548g);
        zza.zzc("eulerZ", this.f50549h);
        zzu zza2 = zzv.zza("Landmarks");
        for (int i = 0; i <= 11; i++) {
            if (m47421b(i)) {
                zza2.zza(C13715c.m34241g(20, "landmark_", i), this.f50550i.get(i));
            }
        }
        zza.zza("landmarks", zza2.toString());
        zzu zza3 = zzv.zza("Contours");
        for (int i2 = 1; i2 <= 15; i2++) {
            zza3.zza(C13715c.m34241g(19, "Contour_", i2), this.f50551j.get(i2));
        }
        zza.zza("contours", zza3.toString());
        return zza.toString();
    }

    public C19907a(zzlj zzlj) {
        this.f50542a = zzlj.zzb();
        this.f50543b = zzlj.zza();
        for (zzlp next : zzlj.zzi()) {
            if (m47421b(next.zza())) {
                this.f50550i.put(next.zza(), new C19911e(next.zza(), next.zzb()));
            }
        }
        for (zzlf next2 : zzlj.zzj()) {
            int zza = next2.zza();
            if (zza <= 15 && zza > 0) {
                this.f50551j.put(zza, new C19908b(zza, next2.zzb()));
            }
        }
        this.f50547f = zzlj.zze();
        this.f50548g = zzlj.zzd();
        this.f50549h = -zzlj.zzc();
        this.f50546e = zzlj.zzh();
        this.f50545d = zzlj.zzf();
        this.f50544c = zzlj.zzg();
    }
}
