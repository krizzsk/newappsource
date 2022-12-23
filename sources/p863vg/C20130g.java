package p863vg;

import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.internal.mlkit_vision_face.zzhw;
import com.google.android.gms.internal.mlkit_vision_face.zzhx;
import com.google.android.gms.internal.mlkit_vision_face.zzhy;
import com.google.android.gms.internal.mlkit_vision_face.zzhz;
import com.google.android.gms.internal.mlkit_vision_face.zzia;
import com.google.android.gms.internal.mlkit_vision_face.zzib;
import java.util.concurrent.atomic.AtomicReference;
import p627lg.C18208g;
import p839ug.C19910d;

/* renamed from: vg.g */
public final class C20130g {

    /* renamed from: a */
    public static final AtomicReference<String> f51084a = new AtomicReference<>();

    /* renamed from: a */
    public static zzib m47724a(C19910d dVar) {
        zzhz zzhz;
        zzhx zzhx;
        zzia zzia;
        zzhy zzhy;
        zzhw zzhw = new zzhw();
        int i = dVar.f50554a;
        if (i == 1) {
            zzhz = zzhz.NO_LANDMARKS;
        } else if (i != 2) {
            zzhz = zzhz.UNKNOWN_LANDMARKS;
        } else {
            zzhz = zzhz.ALL_LANDMARKS;
        }
        zzhw.zza(zzhz);
        int i2 = dVar.f50556c;
        if (i2 == 1) {
            zzhx = zzhx.NO_CLASSIFICATIONS;
        } else if (i2 != 2) {
            zzhx = zzhx.UNKNOWN_CLASSIFICATIONS;
        } else {
            zzhx = zzhx.ALL_CLASSIFICATIONS;
        }
        zzhw.zzb(zzhx);
        int i3 = dVar.f50557d;
        if (i3 == 1) {
            zzia = zzia.FAST;
        } else if (i3 != 2) {
            zzia = zzia.UNKNOWN_PERFORMANCE;
        } else {
            zzia = zzia.ACCURATE;
        }
        zzhw.zzc(zzia);
        int i4 = dVar.f50555b;
        if (i4 == 1) {
            zzhy = zzhy.NO_CONTOURS;
        } else if (i4 != 2) {
            zzhy = zzhy.UNKNOWN_CONTOURS;
        } else {
            zzhy = zzhy.ALL_CONTOURS;
        }
        zzhw.zzd(zzhy);
        zzhw.zze(Boolean.valueOf(dVar.f50558e));
        zzhw.zzf(Float.valueOf(dVar.f50559f));
        return zzhw.zzg();
    }

    /* renamed from: b */
    public static String m47725b() {
        boolean z;
        String str;
        AtomicReference<String> atomicReference = f51084a;
        if (atomicReference.get() != null) {
            return atomicReference.get();
        }
        if (DynamiteModule.getLocalVersion(C18208g.m44941c().mo50623b(), "com.google.android.gms.vision.dynamite.face") > 0) {
            z = true;
        } else {
            z = false;
        }
        if (true != z) {
            str = "play-services-mlkit-face-detection";
        } else {
            str = "face-detection";
        }
        atomicReference.set(str);
        return str;
    }
}
