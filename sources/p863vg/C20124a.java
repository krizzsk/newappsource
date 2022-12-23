package p863vg;

import android.content.Context;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Pair;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.internal.mlkit_common.zzam;
import com.google.android.gms.internal.mlkit_vision_face.zzld;
import com.google.android.gms.internal.mlkit_vision_face.zzlh;
import com.google.android.gms.internal.mlkit_vision_face.zzlj;
import com.google.android.gms.internal.mlkit_vision_face.zzll;
import com.google.android.gms.internal.mlkit_vision_face.zzln;
import com.google.mlkit.common.MlKitException;
import java.util.ArrayList;
import java.util.List;
import p627lg.C18211j;
import p791sg.C19459a;
import p815tg.C19672b;
import p815tg.C19674d;
import p839ug.C19907a;
import p839ug.C19910d;

/* renamed from: vg.a */
public final class C20124a implements C20125b {

    /* renamed from: a */
    public final Context f51062a;

    /* renamed from: b */
    public final C19910d f51063b;

    /* renamed from: c */
    public boolean f51064c;

    /* renamed from: d */
    public boolean f51065d;

    /* renamed from: e */
    public zzll f51066e;

    /* renamed from: f */
    public zzll f51067f;

    public C20124a(Context context, C19910d dVar) {
        this.f51062a = context;
        this.f51063b = dVar;
    }

    /* renamed from: d */
    public static ArrayList m47714d(zzll zzll, C19459a aVar) throws MlKitException {
        zzld zzld = new zzld(aVar.f49484f, aVar.f49481c, aVar.f49482d, C19672b.m47158a(aVar.f49483e), SystemClock.elapsedRealtime());
        C19674d.f49953a.getClass();
        try {
            List<zzlj> zzf = zzll.zzf(C19674d.m47161a(aVar), zzld);
            ArrayList arrayList = new ArrayList();
            for (zzlj aVar2 : zzf) {
                arrayList.add(new C19907a(aVar2));
            }
            return arrayList;
        } catch (RemoteException e) {
            throw new MlKitException(13, "Failed to run face detector.", e);
        }
    }

    /* renamed from: a */
    public final Pair<List<C19907a>, List<C19907a>> mo52370a(C19459a aVar) throws MlKitException {
        ArrayList arrayList;
        zza();
        zzll zzll = this.f51067f;
        if (zzll == null && this.f51066e == null) {
            throw new MlKitException("Waiting for the face detection module to be downloaded. Please wait.", 14);
        }
        ArrayList arrayList2 = null;
        if (zzll != null) {
            arrayList = m47714d(zzll, aVar);
            if (!this.f51063b.f50558e) {
                C20129f.m47719e(arrayList);
            }
        } else {
            arrayList = null;
        }
        zzll zzll2 = this.f51066e;
        if (zzll2 != null) {
            arrayList2 = m47714d(zzll2, aVar);
            C20129f.m47719e(arrayList2);
        }
        return new Pair<>(arrayList, arrayList2);
    }

    /* renamed from: b */
    public final void mo52371b() throws DynamiteModule.LoadingException, RemoteException {
        if (this.f51063b.f50555b == 2) {
            if (this.f51066e == null) {
                C19910d dVar = this.f51063b;
                zzll c = mo52372c(new zzlh(dVar.f50557d, 1, 1, 2, false, dVar.f50559f));
                this.f51066e = c;
                c.zzd();
            }
            C19910d dVar2 = this.f51063b;
            if ((dVar2.f50554a == 2 || dVar2.f50556c == 2 || dVar2.f50557d == 2) && this.f51067f == null) {
                C19910d dVar3 = this.f51063b;
                zzll c2 = mo52372c(new zzlh(dVar3.f50557d, dVar3.f50554a, dVar3.f50556c, 1, dVar3.f50558e, dVar3.f50559f));
                this.f51067f = c2;
                c2.zzd();
            }
        } else if (this.f51067f == null) {
            C19910d dVar4 = this.f51063b;
            zzll c3 = mo52372c(new zzlh(dVar4.f50557d, dVar4.f50554a, dVar4.f50556c, 1, dVar4.f50558e, dVar4.f50559f));
            this.f51067f = c3;
            c3.zzd();
        }
    }

    /* renamed from: c */
    public final zzll mo52372c(zzlh zzlh) throws DynamiteModule.LoadingException, RemoteException {
        if (this.f51064c) {
            return zzln.zza(DynamiteModule.load(this.f51062a, DynamiteModule.PREFER_LOCAL, "com.google.android.gms.vision.dynamite.face").instantiate("com.google.android.gms.vision.face.mlkit.FaceDetectorCreator")).zzd(ObjectWrapper.wrap(this.f51062a), zzlh);
        }
        return zzln.zza(DynamiteModule.load(this.f51062a, DynamiteModule.PREFER_REMOTE, "com.google.android.gms.vision.face").instantiate("com.google.android.gms.vision.face.mlkit.FaceDetectorCreator")).zzd(ObjectWrapper.wrap(this.f51062a), zzlh);
    }

    public final boolean zza() throws MlKitException {
        if (this.f51067f != null || this.f51066e != null) {
            return this.f51064c;
        }
        if (DynamiteModule.getLocalVersion(this.f51062a, "com.google.android.gms.vision.dynamite.face") > 0) {
            this.f51064c = true;
            try {
                mo52371b();
            } catch (DynamiteModule.LoadingException e) {
                throw new MlKitException(14, "Failed to load the bundled face module.", e);
            } catch (RemoteException e2) {
                throw new MlKitException(13, "Failed to init thick face detector.", e2);
            }
        } else {
            this.f51064c = false;
            try {
                mo52371b();
            } catch (DynamiteModule.LoadingException unused) {
                if (!this.f51065d) {
                    C18211j.m44947a(this.f51062a, zzam.zzj("face"));
                    this.f51065d = true;
                }
            } catch (RemoteException e3) {
                throw new MlKitException(13, "Failed to init thin face detector.", e3);
            }
        }
        return this.f51064c;
    }

    public final void zzc() {
        try {
            zzll zzll = this.f51067f;
            if (zzll != null) {
                zzll.zze();
                this.f51067f = null;
            }
            zzll zzll2 = this.f51066e;
            if (zzll2 != null) {
                zzll2.zze();
                this.f51066e = null;
            }
        } catch (RemoteException unused) {
        }
    }
}
