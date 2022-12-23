package p887wg;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzci;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzec;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzei;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzek;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfm;
import com.google.android.play.core.appupdate.C14226d;
import p584jl.C17886b;

/* renamed from: wg.p */
public final class C20323p extends zzec implements zzfm {
    /* access modifiers changed from: private */
    public static final C20323p zza;
    private byte zzA = 2;
    private int zze;
    private int zzf;
    private zzdb zzg;
    private String zzh;
    private int zzi;
    private C20332y zzj;
    private C20308b0 zzk;
    private zzci zzl;
    private C20315h zzm;
    private C20321n zzn;
    private C20318k zzo;
    private C20311d zzp;
    private C20331x zzq;
    private C20333z zzr;
    private C20327t zzs;
    private zzek zzt;
    private zzei zzu;
    private String zzv;
    private zzek zzw;
    private boolean zzx;
    private double zzy;
    private zzdb zzz;

    static {
        C20323p pVar = new C20323p();
        zza = pVar;
        zzec.zzS(C20323p.class, pVar);
    }

    public C20323p() {
        zzdb zzdb = zzdb.zzb;
        this.zzg = zzdb;
        this.zzh = "";
        this.zzt = zzec.zzO();
        this.zzu = zzec.zzN();
        this.zzv = "";
        this.zzw = zzec.zzO();
        this.zzx = true;
        this.zzz = zzdb;
    }

    /* renamed from: o */
    public static /* synthetic */ void m47906o(C20323p pVar, int i, C20313f fVar) {
        fVar.getClass();
        zzek zzek = pVar.zzt;
        if (!zzek.zzc()) {
            pVar.zzt = zzec.zzP(zzek);
        }
        pVar.zzt.set(i, fVar);
    }

    /* renamed from: a */
    public final int mo52488a() {
        int p = C17886b.m44489p(this.zzi);
        if (p == 0) {
            return 1;
        }
        return p;
    }

    /* renamed from: b */
    public final int mo52489b() {
        return this.zzt.size();
    }

    /* renamed from: d */
    public final C20331x mo52490d() {
        C20331x xVar = this.zzq;
        return xVar == null ? C20331x.m47939d() : xVar;
    }

    /* renamed from: e */
    public final C20332y mo52491e() {
        C20332y yVar = this.zzj;
        return yVar == null ? C20332y.m47943b() : yVar;
    }

    /* renamed from: f */
    public final C20333z mo52492f() {
        C20333z zVar = this.zzr;
        return zVar == null ? C20333z.m47949b() : zVar;
    }

    /* renamed from: g */
    public final C20308b0 mo52493g() {
        C20308b0 b0Var = this.zzk;
        return b0Var == null ? C20308b0.m47886b() : b0Var;
    }

    /* renamed from: h */
    public final C20311d mo52494h() {
        C20311d dVar = this.zzp;
        return dVar == null ? C20311d.m47889d() : dVar;
    }

    /* renamed from: i */
    public final C20315h mo52495i() {
        C20315h hVar = this.zzm;
        return hVar == null ? C20315h.m47899b() : hVar;
    }

    /* renamed from: j */
    public final C20318k mo52496j() {
        C20318k kVar = this.zzo;
        return kVar == null ? C20318k.m47901b() : kVar;
    }

    /* renamed from: k */
    public final C20321n mo52497k() {
        C20321n nVar = this.zzn;
        return nVar == null ? C20321n.m47903b() : nVar;
    }

    /* renamed from: l */
    public final zzdb mo52498l() {
        return this.zzg;
    }

    /* renamed from: m */
    public final String mo52499m() {
        return this.zzh;
    }

    /* renamed from: n */
    public final zzek mo52500n() {
        return this.zzt;
    }

    /* renamed from: p */
    public final boolean mo52501p() {
        return (this.zze & 2048) != 0;
    }

    /* renamed from: q */
    public final boolean mo52502q() {
        return (this.zze & 16) != 0;
    }

    /* renamed from: r */
    public final boolean mo52503r() {
        return (this.zze & 4096) != 0;
    }

    /* renamed from: s */
    public final boolean mo52504s() {
        return (this.zze & 32) != 0;
    }

    /* renamed from: t */
    public final boolean mo52505t() {
        return (this.zze & 1024) != 0;
    }

    /* renamed from: u */
    public final boolean mo52506u() {
        return (this.zze & 64) != 0;
    }

    /* renamed from: v */
    public final boolean mo52507v() {
        return (this.zze & RecyclerView.C1119a0.FLAG_IGNORE) != 0;
    }

    /* renamed from: w */
    public final boolean mo52508w() {
        return (this.zze & 512) != 0;
    }

    /* renamed from: x */
    public final boolean mo52509x() {
        return (this.zze & 256) != 0;
    }

    /* renamed from: y */
    public final int mo52510y() {
        int L0 = C14226d.m35345L0(this.zzf);
        if (L0 == 0) {
            return 1;
        }
        return L0;
    }

    public final zzci zzb() {
        zzci zzci = this.zzl;
        return zzci == null ? zzci.zzb() : zzci;
    }

    public final Object zzg(int i, Object obj, Object obj2) {
        Class<C20313f> cls = C20313f.class;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzA);
        }
        byte b = 1;
        if (i2 == 2) {
            return zzec.zzR(zza, "\u0001\u0015\u0000\u0001\u0001\u0015\u0015\u0000\u0003\u000b\u0001ᔌ\u0000\u0002ᔊ\u0001\u0003ᔈ\u0002\u0004ᔌ\u0003\u0005ᐉ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\bᐉ\u0007\tᐉ\b\nᐉ\t\u000bЛ\fဈ\u000e\rЛ\u000eည\u0011\u000fᐉ\n\u0010ဉ\u000b\u0011ဉ\f\u0012\u0016\u0013ဉ\r\u0014ဇ\u000f\u0015က\u0010", new Object[]{"zze", "zzf", C20324q.f51494a, "zzg", "zzh", "zzi", C20325r.f51495a, "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzt", cls, "zzv", "zzw", cls, "zzz", "zzp", "zzq", "zzr", "zzu", "zzs", "zzx", "zzy"});
        } else if (i2 == 3) {
            return new C20323p();
        } else {
            if (i2 == 4) {
                return new C20322o(0);
            }
            if (i2 == 5) {
                return zza;
            }
            if (obj == null) {
                b = 0;
            }
            this.zzA = b;
            return null;
        }
    }
}
