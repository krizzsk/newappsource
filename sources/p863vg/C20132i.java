package p863vg;

import android.content.Context;
import android.media.Image;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Pair;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.internal.mlkit_common.zzam;
import com.google.android.gms.internal.mlkit_vision_face.zzf;
import com.google.android.gms.internal.mlkit_vision_face.zzh;
import com.google.android.gms.internal.mlkit_vision_face.zzj;
import com.google.android.gms.internal.mlkit_vision_face.zzl;
import com.google.android.gms.internal.mlkit_vision_face.zzm;
import com.google.android.gms.internal.mlkit_vision_face.zzp;
import com.google.mlkit.common.MlKitException;
import java.util.ArrayList;
import java.util.List;
import p627lg.C18211j;
import p791sg.C19459a;
import p815tg.C19672b;
import p815tg.C19673c;
import p839ug.C19907a;
import p839ug.C19910d;

/* renamed from: vg.i */
public final class C20132i implements C20125b {

    /* renamed from: a */
    public boolean f51086a;

    /* renamed from: b */
    public final Context f51087b;

    /* renamed from: c */
    public final C19910d f51088c;

    /* renamed from: d */
    public final int f51089d;

    /* renamed from: e */
    public zzj f51090e;

    /* renamed from: f */
    public zzj f51091f;

    public C20132i(Context context, C19910d dVar) {
        this.f51087b = context;
        this.f51088c = dVar;
        this.f51089d = GoogleApiAvailabilityLight.getInstance().getApkVersion(context);
    }

    /* renamed from: b */
    public static int m47727b(int i) {
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        throw new IllegalArgumentException(C13715c.m34241g(34, "Invalid landmark type: ", i));
    }

    /* renamed from: c */
    public static int m47728c(int i) {
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        throw new IllegalArgumentException(C13715c.m34241g(40, "Invalid classification type: ", i));
    }

    /* renamed from: d */
    public static int m47729d(int i) {
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        throw new IllegalArgumentException(C13715c.m34241g(30, "Invalid mode type: ", i));
    }

    /* renamed from: a */
    public final Pair<List<C19907a>, List<C19907a>> mo52370a(C19459a aVar) throws MlKitException {
        ArrayList arrayList;
        if (this.f51090e == null && this.f51091f == null) {
            zza();
        }
        zzj zzj = this.f51090e;
        if (zzj == null && this.f51091f == null) {
            throw new MlKitException("Waiting for the face detection module to be downloaded. Please wait.", 14);
        }
        ArrayList arrayList2 = null;
        if (zzj != null) {
            arrayList = mo52377e(zzj, aVar);
            if (!this.f51088c.f50558e) {
                C20129f.m47719e(arrayList);
            }
        } else {
            arrayList = null;
        }
        zzj zzj2 = this.f51091f;
        if (zzj2 != null) {
            arrayList2 = mo52377e(zzj2, aVar);
            C20129f.m47719e(arrayList2);
        }
        return new Pair<>(arrayList, arrayList2);
    }

    /* renamed from: e */
    public final ArrayList mo52377e(zzj zzj, C19459a aVar) throws MlKitException {
        zzf[] zzfArr;
        try {
            zzp zzp = new zzp(aVar.f49481c, aVar.f49482d, 0, SystemClock.elapsedRealtime(), C19672b.m47158a(aVar.f49483e));
            if (aVar.f49484f != 35 || this.f51089d < 201500000) {
                zzfArr = zzj.zzd(ObjectWrapper.wrap(C19673c.m47159a(aVar)), zzp);
            } else {
                Image.Plane[] planeArr = (Image.Plane[]) Preconditions.checkNotNull(aVar.mo51864b());
                zzfArr = zzj.zze(ObjectWrapper.wrap(planeArr[0].getBuffer()), ObjectWrapper.wrap(planeArr[1].getBuffer()), ObjectWrapper.wrap(planeArr[2].getBuffer()), planeArr[0].getPixelStride(), planeArr[1].getPixelStride(), planeArr[2].getPixelStride(), planeArr[0].getRowStride(), planeArr[1].getRowStride(), planeArr[2].getRowStride(), zzp);
            }
            ArrayList arrayList = new ArrayList();
            for (zzf aVar2 : zzfArr) {
                arrayList.add(new C19907a(aVar2));
            }
            return arrayList;
        } catch (RemoteException e) {
            throw new MlKitException(13, "Failed to detect with legacy face detector", e);
        }
    }

    public final boolean zza() throws MlKitException {
        if (this.f51090e != null || this.f51091f != null) {
            return false;
        }
        try {
            zzm zza = zzl.zza(DynamiteModule.load(this.f51087b, DynamiteModule.PREFER_REMOTE, "com.google.android.gms.vision.dynamite").instantiate("com.google.android.gms.vision.face.ChimeraNativeFaceDetectorCreator"));
            IObjectWrapper wrap = ObjectWrapper.wrap(this.f51087b);
            if (this.f51088c.f50555b == 2) {
                if (this.f51091f == null) {
                    this.f51091f = zza.zzd(wrap, new zzh(2, 2, 0, true, false, this.f51088c.f50559f));
                }
                C19910d dVar = this.f51088c;
                if ((dVar.f50554a == 2 || dVar.f50556c == 2 || dVar.f50557d == 2) && this.f51090e == null) {
                    int d = m47729d(this.f51088c.f50557d);
                    int b = m47727b(this.f51088c.f50554a);
                    int c = m47728c(this.f51088c.f50556c);
                    C19910d dVar2 = this.f51088c;
                    this.f51090e = zza.zzd(wrap, new zzh(d, b, c, false, dVar2.f50558e, dVar2.f50559f));
                }
            } else if (this.f51090e == null) {
                int d2 = m47729d(this.f51088c.f50557d);
                int b2 = m47727b(this.f51088c.f50554a);
                int c2 = m47728c(this.f51088c.f50556c);
                C19910d dVar3 = this.f51088c;
                this.f51090e = zza.zzd(wrap, new zzh(d2, b2, c2, false, dVar3.f50558e, dVar3.f50559f));
            }
            if (this.f51090e == null && this.f51091f == null && !this.f51086a) {
                C18211j.m44947a(this.f51087b, zzam.zzj("barcode"));
                this.f51086a = true;
            }
            return false;
        } catch (RemoteException e) {
            throw new MlKitException(13, "Failed to create legacy face detector.", e);
        } catch (DynamiteModule.LoadingException e2) {
            throw new MlKitException(13, "Failed to load deprecated vision dynamite module.", e2);
        }
    }

    public final void zzc() {
        zzj zzj = this.f51090e;
        if (zzj != null) {
            try {
                zzj.zzf();
            } catch (RemoteException unused) {
            }
            this.f51090e = null;
        }
        zzj zzj2 = this.f51091f;
        if (zzj2 != null) {
            try {
                zzj2.zzf();
            } catch (RemoteException unused2) {
            }
            this.f51091f = null;
        }
    }
}
