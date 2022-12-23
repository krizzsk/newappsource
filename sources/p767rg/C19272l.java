package p767rg;

import android.content.Context;
import android.media.Image;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.internal.mlkit_common.zzam;
import com.google.android.gms.internal.mlkit_vision_barcode.zzad;
import com.google.android.gms.internal.mlkit_vision_barcode.zzaf;
import com.google.android.gms.internal.mlkit_vision_barcode.zzah;
import com.google.android.gms.internal.mlkit_vision_barcode.zzaj;
import com.google.android.gms.internal.mlkit_vision_barcode.zzkj;
import com.google.android.gms.internal.mlkit_vision_barcode.zznm;
import com.google.android.gms.internal.mlkit_vision_barcode.zzq;
import com.google.mlkit.common.MlKitException;
import java.util.ArrayList;
import p627lg.C18211j;
import p674ng.C18549b;
import p722pg.C18922a;
import p791sg.C19459a;
import p815tg.C19672b;
import p815tg.C19673c;

/* renamed from: rg.l */
public final class C19272l implements C19268h {

    /* renamed from: a */
    public boolean f48985a;

    /* renamed from: b */
    public final Context f48986b;

    /* renamed from: c */
    public final zzad f48987c;

    /* renamed from: d */
    public final zznm f48988d;

    /* renamed from: e */
    public zzaf f48989e;

    public C19272l(Context context, C18549b bVar, zznm zznm) {
        zzad zzad = new zzad();
        this.f48987c = zzad;
        this.f48986b = context;
        zzad.zza = bVar.f47230a;
        this.f48988d = zznm;
    }

    /* renamed from: a */
    public final ArrayList mo51684a(C19459a aVar) throws MlKitException {
        zzq[] zzqArr;
        if (this.f48989e == null) {
            zzc();
        }
        zzaf zzaf = this.f48989e;
        if (zzaf != null) {
            zzaf zzaf2 = (zzaf) Preconditions.checkNotNull(zzaf);
            zzaj zzaj = new zzaj(aVar.f49481c, aVar.f49482d, 0, 0, C19672b.m47158a(aVar.f49483e));
            try {
                int i = aVar.f49484f;
                if (i == -1) {
                    zzqArr = zzaf2.zzf(ObjectWrapper.wrap(aVar.f49479a), zzaj);
                } else if (i == 17) {
                    zzqArr = zzaf2.zze(ObjectWrapper.wrap(null), zzaj);
                } else if (i == 35) {
                    Image.Plane[] planeArr = (Image.Plane[]) Preconditions.checkNotNull(aVar.mo51864b());
                    zzaj.zza = planeArr[0].getRowStride();
                    zzqArr = zzaf2.zze(ObjectWrapper.wrap(planeArr[0].getBuffer()), zzaj);
                } else if (i == 842094169) {
                    zzqArr = zzaf2.zze(ObjectWrapper.wrap(C19673c.m47159a(aVar)), zzaj);
                } else {
                    int i2 = aVar.f49484f;
                    StringBuilder sb = new StringBuilder(37);
                    sb.append("Unsupported image format: ");
                    sb.append(i2);
                    throw new MlKitException(sb.toString(), 3);
                }
                ArrayList arrayList = new ArrayList();
                for (zzq kVar : zzqArr) {
                    arrayList.add(new C18922a(new C19271k(kVar), aVar.f49485g));
                }
                return arrayList;
            } catch (RemoteException e) {
                throw new MlKitException(13, "Failed to detect with legacy barcode detector", e);
            }
        } else {
            throw new MlKitException("Error initializing the legacy barcode scanner.", 14);
        }
    }

    public final void zzb() {
        zzaf zzaf = this.f48989e;
        if (zzaf != null) {
            try {
                zzaf.zzd();
            } catch (RemoteException unused) {
            }
            this.f48989e = null;
        }
    }

    public final boolean zzc() throws MlKitException {
        if (this.f48989e != null) {
            return false;
        }
        try {
            zzaf zzd = zzah.zza(DynamiteModule.load(this.f48986b, DynamiteModule.PREFER_REMOTE, "com.google.android.gms.vision.dynamite").instantiate("com.google.android.gms.vision.barcode.ChimeraNativeBarcodeDetectorCreator")).zzd(ObjectWrapper.wrap(this.f48986b), this.f48987c);
            this.f48989e = zzd;
            if (zzd == null) {
                if (!this.f48985a) {
                    C18211j.m44947a(this.f48986b, zzam.zzj("barcode"));
                    this.f48985a = true;
                    C19261a.m46516b(this.f48988d, zzkj.OPTIONAL_MODULE_NOT_AVAILABLE);
                    throw new MlKitException("Waiting for the barcode module to be downloaded. Please wait.", 14);
                }
            }
            C19261a.m46516b(this.f48988d, zzkj.NO_ERROR);
            return false;
        } catch (RemoteException e) {
            throw new MlKitException(13, "Failed to create legacy barcode detector.", e);
        } catch (DynamiteModule.LoadingException e2) {
            throw new MlKitException(13, "Failed to load deprecated vision dynamite module.", e2);
        }
    }
}
