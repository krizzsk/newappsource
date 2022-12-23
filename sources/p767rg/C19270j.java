package p767rg;

import android.content.Context;
import android.media.Image;
import android.os.RemoteException;
import android.os.SystemClock;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.barcode.ModuleDescriptor;
import com.google.android.gms.internal.mlkit_vision_barcode.zzcc;
import com.google.android.gms.internal.mlkit_vision_barcode.zzkj;
import com.google.android.gms.internal.mlkit_vision_barcode.zznm;
import com.google.android.gms.internal.mlkit_vision_barcode.zzon;
import com.google.android.gms.internal.mlkit_vision_barcode.zzop;
import com.google.android.gms.internal.mlkit_vision_barcode.zzox;
import com.google.android.gms.internal.mlkit_vision_barcode.zzoz;
import com.google.android.gms.internal.mlkit_vision_barcode.zzpg;
import com.google.mlkit.common.MlKitException;
import java.util.ArrayList;
import java.util.List;
import p627lg.C18211j;
import p674ng.C18549b;
import p722pg.C18922a;
import p791sg.C19459a;
import p815tg.C19672b;
import p815tg.C19674d;

/* renamed from: rg.j */
public final class C19270j implements C19268h {

    /* renamed from: h */
    public static final zzcc f48976h = zzcc.zzi("com.google.android.gms.vision.barcode", "com.google.android.gms.tflite_dynamite");

    /* renamed from: a */
    public boolean f48977a;

    /* renamed from: b */
    public boolean f48978b;

    /* renamed from: c */
    public boolean f48979c;

    /* renamed from: d */
    public final Context f48980d;

    /* renamed from: e */
    public final C18549b f48981e;

    /* renamed from: f */
    public final zznm f48982f;

    /* renamed from: g */
    public zzox f48983g;

    public C19270j(Context context, C18549b bVar, zznm zznm) {
        this.f48980d = context;
        this.f48981e = bVar;
        this.f48982f = zznm;
    }

    /* renamed from: a */
    public final ArrayList mo51684a(C19459a aVar) throws MlKitException {
        if (this.f48983g == null) {
            zzc();
        }
        zzox zzox = (zzox) Preconditions.checkNotNull(this.f48983g);
        if (!this.f48977a) {
            try {
                zzox.zze();
                this.f48977a = true;
            } catch (RemoteException e) {
                throw new MlKitException(13, "Failed to init barcode scanner.", e);
            }
        }
        int i = aVar.f49481c;
        if (aVar.f49484f == 35) {
            i = ((Image.Plane[]) Preconditions.checkNotNull(aVar.mo51864b()))[0].getRowStride();
        }
        zzpg zzpg = new zzpg(aVar.f49484f, i, aVar.f49482d, C19672b.m47158a(aVar.f49483e), SystemClock.elapsedRealtime());
        C19674d.f49953a.getClass();
        try {
            List<zzon> zzd = zzox.zzd(C19674d.m47161a(aVar), zzpg);
            ArrayList arrayList = new ArrayList();
            for (zzon iVar : zzd) {
                arrayList.add(new C18922a(new C19269i(iVar), aVar.f49485g));
            }
            return arrayList;
        } catch (RemoteException e2) {
            throw new MlKitException(13, "Failed to run barcode scanner.", e2);
        }
    }

    /* renamed from: b */
    public final zzox mo51687b(DynamiteModule.VersionPolicy versionPolicy, String str, String str2) throws DynamiteModule.LoadingException, RemoteException {
        return zzoz.zza(DynamiteModule.load(this.f48980d, versionPolicy, str).instantiate(str2)).zzd(ObjectWrapper.wrap(this.f48980d), new zzop(this.f48981e.f47230a));
    }

    public final void zzb() {
        zzox zzox = this.f48983g;
        if (zzox != null) {
            try {
                zzox.zzf();
            } catch (RemoteException unused) {
            }
            this.f48983g = null;
            this.f48977a = false;
        }
    }

    public final boolean zzc() throws MlKitException {
        boolean z;
        if (this.f48983g != null) {
            return this.f48978b;
        }
        boolean z2 = false;
        if (DynamiteModule.getLocalVersion(this.f48980d, ModuleDescriptor.MODULE_ID) > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f48978b = true;
            try {
                this.f48983g = mo51687b(DynamiteModule.PREFER_LOCAL, ModuleDescriptor.MODULE_ID, "com.google.mlkit.vision.barcode.bundled.internal.ThickBarcodeScannerCreator");
            } catch (DynamiteModule.LoadingException e) {
                throw new MlKitException(13, "Failed to load the bundled barcode module.", e);
            } catch (RemoteException e2) {
                throw new MlKitException(13, "Failed to create thick barcode scanner.", e2);
            }
        } else {
            this.f48978b = false;
            Context context = this.f48980d;
            try {
                for (String load : f48976h) {
                    DynamiteModule.load(context, DynamiteModule.PREFER_REMOTE, load);
                }
                z2 = true;
            } catch (DynamiteModule.LoadingException unused) {
            }
            if (!z2) {
                if (!this.f48979c) {
                    C18211j.m44947a(this.f48980d, zzcc.zzi("barcode", "tflite_dynamite"));
                    this.f48979c = true;
                }
                C19261a.m46516b(this.f48982f, zzkj.OPTIONAL_MODULE_NOT_AVAILABLE);
                throw new MlKitException("Waiting for the barcode module to be downloaded. Please wait.", 14);
            }
            try {
                this.f48983g = mo51687b(DynamiteModule.PREFER_REMOTE, "com.google.android.gms.vision.barcode", "com.google.android.gms.vision.barcode.mlkit.BarcodeScannerCreator");
            } catch (RemoteException | DynamiteModule.LoadingException e3) {
                C19261a.m46516b(this.f48982f, zzkj.OPTIONAL_MODULE_INIT_ERROR);
                throw new MlKitException(13, "Failed to create thin barcode scanner.", e3);
            }
        }
        C19261a.m46516b(this.f48982f, zzkj.NO_ERROR);
        return this.f48978b;
    }
}
