package p767rg;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.SparseArray;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.barcode.ModuleDescriptor;
import com.google.android.gms.internal.mlkit_vision_barcode.zzbz;
import com.google.android.gms.internal.mlkit_vision_barcode.zzcc;
import com.google.android.gms.internal.mlkit_vision_barcode.zzkj;
import com.google.android.gms.internal.mlkit_vision_barcode.zzkk;
import com.google.android.gms.internal.mlkit_vision_barcode.zzkv;
import com.google.android.gms.internal.mlkit_vision_barcode.zzkw;
import com.google.android.gms.internal.mlkit_vision_barcode.zzmv;
import com.google.android.gms.internal.mlkit_vision_barcode.zzmw;
import com.google.android.gms.internal.mlkit_vision_barcode.zzmy;
import com.google.android.gms.internal.mlkit_vision_barcode.zznm;
import com.google.android.play.core.appupdate.C14230h;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import p627lg.C18208g;
import p674ng.C18549b;

/* renamed from: rg.a */
public final class C19261a {

    /* renamed from: a */
    public static final SparseArray f48952a;

    /* renamed from: b */
    public static final SparseArray f48953b;

    /* renamed from: c */
    public static final AtomicReference f48954c = new AtomicReference();
    @SuppressLint({"UseSparseArrays"})

    /* renamed from: d */
    public static final HashMap f48955d;

    static {
        SparseArray sparseArray = new SparseArray();
        f48952a = sparseArray;
        SparseArray sparseArray2 = new SparseArray();
        f48953b = sparseArray2;
        sparseArray.put(-1, zzkv.FORMAT_UNKNOWN);
        sparseArray.put(1, zzkv.FORMAT_CODE_128);
        sparseArray.put(2, zzkv.FORMAT_CODE_39);
        sparseArray.put(4, zzkv.FORMAT_CODE_93);
        sparseArray.put(8, zzkv.FORMAT_CODABAR);
        sparseArray.put(16, zzkv.FORMAT_DATA_MATRIX);
        sparseArray.put(32, zzkv.FORMAT_EAN_13);
        sparseArray.put(64, zzkv.FORMAT_EAN_8);
        sparseArray.put(RecyclerView.C1119a0.FLAG_IGNORE, zzkv.FORMAT_ITF);
        sparseArray.put(256, zzkv.FORMAT_QR_CODE);
        sparseArray.put(512, zzkv.FORMAT_UPC_A);
        sparseArray.put(1024, zzkv.FORMAT_UPC_E);
        sparseArray.put(2048, zzkv.FORMAT_PDF417);
        sparseArray.put(4096, zzkv.FORMAT_AZTEC);
        sparseArray2.put(0, zzkw.TYPE_UNKNOWN);
        sparseArray2.put(1, zzkw.TYPE_CONTACT_INFO);
        sparseArray2.put(2, zzkw.TYPE_EMAIL);
        sparseArray2.put(3, zzkw.TYPE_ISBN);
        sparseArray2.put(4, zzkw.TYPE_PHONE);
        sparseArray2.put(5, zzkw.TYPE_PRODUCT);
        sparseArray2.put(6, zzkw.TYPE_SMS);
        sparseArray2.put(7, zzkw.TYPE_TEXT);
        sparseArray2.put(8, zzkw.TYPE_URL);
        sparseArray2.put(9, zzkw.TYPE_WIFI);
        sparseArray2.put(10, zzkw.TYPE_GEO);
        sparseArray2.put(11, zzkw.TYPE_CALENDAR_EVENT);
        sparseArray2.put(12, zzkw.TYPE_DRIVER_LICENSE);
        HashMap hashMap = new HashMap();
        f48955d = hashMap;
        hashMap.put(1, zzmv.CODE_128);
        hashMap.put(2, zzmv.CODE_39);
        hashMap.put(4, zzmv.CODE_93);
        hashMap.put(8, zzmv.CODABAR);
        hashMap.put(16, zzmv.DATA_MATRIX);
        hashMap.put(32, zzmv.EAN_13);
        hashMap.put(64, zzmv.EAN_8);
        hashMap.put(Integer.valueOf(RecyclerView.C1119a0.FLAG_IGNORE), zzmv.ITF);
        hashMap.put(256, zzmv.QR_CODE);
        hashMap.put(512, zzmv.UPC_A);
        hashMap.put(1024, zzmv.UPC_E);
        hashMap.put(2048, zzmv.PDF417);
        hashMap.put(4096, zzmv.AZTEC);
    }

    /* renamed from: a */
    public static zzmy m46515a(C18549b bVar) {
        int i = bVar.f47230a;
        zzbz zzbz = new zzbz();
        if (i == 0) {
            zzbz.zze(f48955d.values());
        } else {
            for (Map.Entry entry : f48955d.entrySet()) {
                if ((((Integer) entry.getKey()).intValue() & i) != 0) {
                    zzbz.zzd((zzmv) entry.getValue());
                }
            }
        }
        zzmw zzmw = new zzmw();
        zzmw.zzb(zzbz.zzf());
        return zzmw.zzc();
    }

    /* renamed from: b */
    public static void m46516b(zznm zznm, zzkj zzkj) {
        zznm.zzb(new C14230h((Object) zzkj), zzkk.ON_DEVICE_BARCODE_LOAD);
    }

    /* renamed from: c */
    public static boolean m46517c() {
        boolean z;
        AtomicReference atomicReference = f48954c;
        if (atomicReference.get() != null) {
            return ((Boolean) atomicReference.get()).booleanValue();
        }
        Context b = C18208g.m44941c().mo50623b();
        zzcc zzcc = C19270j.f48976h;
        if (DynamiteModule.getLocalVersion(b, ModuleDescriptor.MODULE_ID) > 0) {
            z = true;
        } else {
            z = false;
        }
        atomicReference.set(Boolean.valueOf(z));
        return z;
    }
}
