package androidx.appcompat.app;

import android.content.Context;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.mlkit_vision_face.zzdk;
import com.google.android.gms.internal.mlkit_vision_face.zzdm;
import com.google.android.gms.internal.mlkit_vision_face.zzhu;
import com.google.android.gms.internal.mlkit_vision_face.zziq;
import com.google.android.gms.internal.mlkit_vision_face.zzkl;
import com.google.android.gms.internal.mlkit_vision_face.zzkp;
import com.google.android.play.core.appupdate.C14228f;
import com.google.android.play.core.appupdate.C14232j;
import com.google.android.play.core.assetpacks.C14243a0;
import java.io.File;
import java.util.IllegalFormatException;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import lj0.C24327d;
import p025b6.C1486a;
import p434dd.C16552f0;
import p554id.C17563b;
import p584jl.C17885a;
import p863vg.C20129f;

/* renamed from: androidx.appcompat.app.r */
public class C0262r implements C1486a, C16552f0, C17563b, zzkl {

    /* renamed from: b */
    public final /* synthetic */ int f760b;

    /* renamed from: c */
    public Object f761c;

    public /* synthetic */ C0262r(Object obj, int i) {
        this.f760b = i;
        this.f761c = obj;
    }

    /* renamed from: f */
    public static String m528f(String str, String str2, Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException unused) {
                String valueOf = String.valueOf(str2);
                if (valueOf.length() != 0) {
                    "Unable to format ".concat(valueOf);
                }
                String join = TextUtils.join(", ", objArr);
                str2 = C13715c.m34246l(new StringBuilder(String.valueOf(str2).length() + 3 + String.valueOf(join).length()), str2, " [", join, "]");
            }
        }
        return C13715c.m34245k(new StringBuilder(String.valueOf(str).length() + 3 + String.valueOf(str2).length()), str, " : ", str2);
    }

    /* renamed from: a */
    public final void mo974a(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 3)) {
            m528f((String) this.f761c, str, objArr);
        }
    }

    /* renamed from: b */
    public final void mo975b(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            m528f((String) this.f761c, str, objArr);
        }
    }

    /* renamed from: c */
    public final void mo976c(String str, Exception exc, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            m528f((String) this.f761c, str, objArr);
        }
    }

    /* renamed from: d */
    public final void mo977d(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            m528f((String) this.f761c, str, objArr);
        }
    }

    /* renamed from: e */
    public final void mo978e(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 5)) {
            m528f((String) this.f761c, str, objArr);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0033 A[SYNTHETIC, Splitter:B:17:0x0033] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0041 A[SYNTHETIC, Splitter:B:24:0x0041] */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo979n(java.lang.Object r4, java.io.File r5, p025b6.C1492e r6) {
        /*
            r3 = this;
            java.io.InputStream r4 = (java.io.InputStream) r4
            java.lang.Object r6 = r3.f761c
            e6.b r6 = (p072e6.C4564b) r6
            java.lang.Class<byte[]> r0 = byte[].class
            r1 = 65536(0x10000, float:9.18355E-41)
            java.lang.Object r6 = r6.mo20074c(r1, r0)
            byte[] r6 = (byte[]) r6
            r0 = 0
            r1 = 0
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x003e, all -> 0x0030 }
            r2.<init>(r5)     // Catch:{ IOException -> 0x003e, all -> 0x0030 }
        L_0x0017:
            int r5 = r4.read(r6)     // Catch:{ IOException -> 0x002d, all -> 0x002a }
            r1 = -1
            if (r5 == r1) goto L_0x0022
            r2.write(r6, r0, r5)     // Catch:{ IOException -> 0x002d, all -> 0x002a }
            goto L_0x0017
        L_0x0022:
            r2.close()     // Catch:{ IOException -> 0x002d, all -> 0x002a }
            r0 = 1
            r2.close()     // Catch:{ IOException -> 0x0044 }
            goto L_0x0044
        L_0x002a:
            r4 = move-exception
            r1 = r2
            goto L_0x0031
        L_0x002d:
            r1 = r2
            goto L_0x003f
        L_0x0030:
            r4 = move-exception
        L_0x0031:
            if (r1 == 0) goto L_0x0036
            r1.close()     // Catch:{ IOException -> 0x0036 }
        L_0x0036:
            java.lang.Object r5 = r3.f761c
            e6.b r5 = (p072e6.C4564b) r5
            r5.put(r6)
            throw r4
        L_0x003e:
        L_0x003f:
            if (r1 == 0) goto L_0x0044
            r1.close()     // Catch:{ IOException -> 0x0044 }
        L_0x0044:
            java.lang.Object r4 = r3.f761c
            e6.b r4 = (p072e6.C4564b) r4
            r4.put(r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.C0262r.mo979n(java.lang.Object, java.io.File, b6.e):boolean");
    }

    public final void onSuccess(Object obj) {
        C14243a0 a0Var = (C14243a0) this.f761c;
        List list = (List) obj;
        int a = a0Var.f35791b.mo42806a();
        Iterator it = a0Var.mo42790e().iterator();
        while (it.hasNext()) {
            File file = (File) it.next();
            if (!list.contains(file.getName()) && C14243a0.m35457b(file, true) != ((long) a)) {
                C14243a0.m35459g(file);
            }
        }
    }

    public final String toString() {
        switch (this.f760b) {
            case 13:
                return String.format("line %s", new Object[]{Integer.valueOf(((C24327d) this.f761c).mo60475O())});
            default:
                return super.toString();
        }
    }

    public final zzkp zza(Object obj, int i, zzhu zzhu) {
        C20129f fVar = (C20129f) this.f761c;
        fVar.getClass();
        zziq zziq = new zziq();
        zziq.zzc(Boolean.valueOf(fVar.f51082g));
        zzdk zzdk = new zzdk();
        zzdk.zzb(Integer.valueOf(i));
        zzdk.zza((zzdm) obj);
        zzdk.zzc(zzhu);
        zziq.zze(zzdk.zzd());
        return zzkp.zzc(zziq);
    }

    public C0262r(String str) {
        this.f760b = 7;
        int myUid = Process.myUid();
        int myPid = Process.myPid();
        StringBuilder sb = new StringBuilder(39);
        sb.append("UID: [");
        sb.append(myUid);
        sb.append("]  PID: [");
        sb.append(myPid);
        sb.append("] ");
        String sb2 = sb.toString();
        this.f761c = str.length() != 0 ? sb2.concat(str) : new String(sb2);
    }

    public final Object zza() {
        Context context = (Context) ((C14232j) ((C16552f0) this.f761c)).f35765b.f35762a;
        C17885a.m44409K0(context);
        return new C14228f(context);
    }

    public C0262r() {
        this.f760b = 12;
    }
}
