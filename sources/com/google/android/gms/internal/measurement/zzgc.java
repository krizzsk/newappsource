package com.google.android.gms.internal.measurement;

import androidx.recyclerview.widget.RecyclerView;
import com.appboy.support.AppboyImageUtils;
import com.moovit.database.sqlite.SQLiteDatabase;
import com.unity3d.services.core.request.metrics.MetricCommonTags;
import java.util.List;
import p988j$.util.Spliterator;

public final class zzgc extends zzke implements zzlm {
    public static final /* synthetic */ int zza = 0;
    /* access modifiers changed from: private */
    public static final zzgc zze;
    private boolean zzA;
    private String zzB = "";
    private long zzC;
    private int zzD;
    private String zzE = "";
    private String zzF = "";
    private boolean zzG;
    /* access modifiers changed from: private */
    public zzkl zzH = zzke.zzbD();
    private String zzI = "";
    private int zzJ;
    private int zzK;
    private int zzL;
    private String zzM = "";
    private long zzN;
    private long zzO;
    private String zzP = "";
    private String zzQ = "";
    private int zzR;
    private String zzS = "";
    private zzgf zzT;
    private zzkj zzU = zzke.zzbA();
    private long zzV;
    private long zzW;
    private String zzX = "";
    private String zzY = "";
    private int zzZ;
    private boolean zzaa;
    private String zzab = "";
    private boolean zzac;
    private zzfy zzad;
    private String zzae = "";
    private zzkl zzaf = zzke.zzbD();
    private String zzag = "";
    private int zzf;
    private int zzg;
    private int zzh;
    /* access modifiers changed from: private */
    public zzkl zzi = zzke.zzbD();
    private zzkl zzj = zzke.zzbD();
    private long zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private String zzp = "";
    private String zzq = "";
    private String zzr = "";
    private String zzs = "";
    private int zzt;
    private String zzu = "";
    private String zzv = "";
    private String zzw = "";
    private long zzx;
    private long zzy;
    private String zzz = "";

    static {
        zzgc zzgc = new zzgc();
        zze = zzgc;
        zzke.zzbJ(zzgc.class, zzgc);
    }

    private zzgc() {
    }

    public static /* synthetic */ void zzP(zzgc zzgc) {
        zzgc.zzf &= Integer.MAX_VALUE;
        zzgc.zzP = zze.zzP;
    }

    public static /* synthetic */ void zzQ(zzgc zzgc, int i) {
        zzgc.zzg |= 2;
        zzgc.zzR = i;
    }

    public static /* synthetic */ void zzR(zzgc zzgc, int i, zzfs zzfs) {
        zzfs.getClass();
        zzgc.zzbL();
        zzgc.zzi.set(i, zzfs);
    }

    public static /* synthetic */ void zzS(zzgc zzgc, String str) {
        str.getClass();
        zzgc.zzg |= 4;
        zzgc.zzS = str;
    }

    public static /* synthetic */ void zzT(zzgc zzgc, zzgf zzgf) {
        zzgf.getClass();
        zzgc.zzT = zzgf;
        zzgc.zzg |= 8;
    }

    public static /* synthetic */ void zzU(zzgc zzgc, Iterable iterable) {
        int i;
        zzkj zzkj = zzgc.zzU;
        if (!zzkj.zzc()) {
            int size = zzkj.size();
            if (size == 0) {
                i = 10;
            } else {
                i = size + size;
            }
            zzgc.zzU = zzkj.zzg(i);
        }
        zzin.zzbt(iterable, zzgc.zzU);
    }

    public static /* synthetic */ void zzV(zzgc zzgc, zzfs zzfs) {
        zzfs.getClass();
        zzgc.zzbL();
        zzgc.zzi.add(zzfs);
    }

    public static /* synthetic */ void zzW(zzgc zzgc, long j) {
        zzgc.zzg |= 16;
        zzgc.zzV = j;
    }

    public static /* synthetic */ void zzX(zzgc zzgc, long j) {
        zzgc.zzg |= 32;
        zzgc.zzW = j;
    }

    public static /* synthetic */ void zzY(zzgc zzgc, String str) {
        zzgc.zzg |= RecyclerView.C1119a0.FLAG_IGNORE;
        zzgc.zzY = str;
    }

    public static /* synthetic */ void zzZ(zzgc zzgc, Iterable iterable) {
        zzgc.zzbL();
        zzin.zzbt(iterable, zzgc.zzi);
    }

    public static /* synthetic */ void zzaA(zzgc zzgc, String str) {
        str.getClass();
        zzgc.zzf |= 8192;
        zzgc.zzw = str;
    }

    public static /* synthetic */ void zzaB(zzgc zzgc, long j) {
        zzgc.zzf |= Spliterator.SUBSIZED;
        zzgc.zzx = j;
    }

    public static /* synthetic */ void zzaC(zzgc zzgc, long j) {
        zzgc.zzf |= 32768;
        zzgc.zzy = 73000;
    }

    public static /* synthetic */ void zzaD(zzgc zzgc, String str) {
        str.getClass();
        zzgc.zzf |= SQLiteDatabase.OPEN_FULLMUTEX;
        zzgc.zzz = str;
    }

    public static /* synthetic */ void zzaE(zzgc zzgc) {
        zzgc.zzf &= -65537;
        zzgc.zzz = zze.zzz;
    }

    public static /* synthetic */ void zzaF(zzgc zzgc, boolean z) {
        zzgc.zzf |= SQLiteDatabase.OPEN_SHAREDCACHE;
        zzgc.zzA = z;
    }

    public static /* synthetic */ void zzaG(zzgc zzgc) {
        zzgc.zzf &= -131073;
        zzgc.zzA = false;
    }

    public static /* synthetic */ void zzaH(zzgc zzgc, String str) {
        str.getClass();
        zzgc.zzf |= SQLiteDatabase.OPEN_PRIVATECACHE;
        zzgc.zzB = str;
    }

    public static /* synthetic */ void zzaI(zzgc zzgc) {
        zzgc.zzf &= -262145;
        zzgc.zzB = zze.zzB;
    }

    public static /* synthetic */ void zzaJ(zzgc zzgc, long j) {
        zzgc.zzf |= 524288;
        zzgc.zzC = j;
    }

    public static /* synthetic */ void zzaK(zzgc zzgc, int i) {
        zzgc.zzf |= 1048576;
        zzgc.zzD = i;
    }

    public static /* synthetic */ void zzaL(zzgc zzgc, String str) {
        zzgc.zzf |= 2097152;
        zzgc.zzE = str;
    }

    public static /* synthetic */ void zzaM(zzgc zzgc) {
        zzgc.zzf &= -2097153;
        zzgc.zzE = zze.zzE;
    }

    public static /* synthetic */ void zzaN(zzgc zzgc, String str) {
        str.getClass();
        zzgc.zzf |= 4194304;
        zzgc.zzF = str;
    }

    public static /* synthetic */ void zzaO(zzgc zzgc, boolean z) {
        zzgc.zzf |= 8388608;
        zzgc.zzG = z;
    }

    public static /* synthetic */ void zzaP(zzgc zzgc, Iterable iterable) {
        zzkl zzkl = zzgc.zzH;
        if (!zzkl.zzc()) {
            zzgc.zzH = zzke.zzbE(zzkl);
        }
        zzin.zzbt(iterable, zzgc.zzH);
    }

    public static /* synthetic */ void zzaR(zzgc zzgc, String str) {
        str.getClass();
        zzgc.zzf |= 16777216;
        zzgc.zzI = str;
    }

    public static /* synthetic */ void zzaS(zzgc zzgc, int i) {
        zzgc.zzf |= AppboyImageUtils.MAX_IMAGE_CACHE_SIZE_BYTES;
        zzgc.zzJ = i;
    }

    public static /* synthetic */ void zzaT(zzgc zzgc, int i) {
        zzgc.zzf |= 1;
        zzgc.zzh = 1;
    }

    public static /* synthetic */ void zzaU(zzgc zzgc) {
        zzgc.zzf &= -268435457;
        zzgc.zzM = zze.zzM;
    }

    public static /* synthetic */ void zzaV(zzgc zzgc, long j) {
        zzgc.zzf |= SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING;
        zzgc.zzN = j;
    }

    public static /* synthetic */ void zzaa(zzgc zzgc, String str) {
        str.getClass();
        zzgc.zzg |= 8192;
        zzgc.zzae = str;
    }

    public static /* synthetic */ void zzab(zzgc zzgc) {
        zzgc.zzg &= -8193;
        zzgc.zzae = zze.zzae;
    }

    public static /* synthetic */ void zzac(zzgc zzgc, Iterable iterable) {
        zzkl zzkl = zzgc.zzaf;
        if (!zzkl.zzc()) {
            zzgc.zzaf = zzke.zzbE(zzkl);
        }
        zzin.zzbt(iterable, zzgc.zzaf);
    }

    public static /* synthetic */ void zzae(zzgc zzgc, String str) {
        str.getClass();
        zzgc.zzg |= Spliterator.SUBSIZED;
        zzgc.zzag = str;
    }

    public static /* synthetic */ void zzaf(zzgc zzgc, int i) {
        zzgc.zzbL();
        zzgc.zzi.remove(i);
    }

    public static /* synthetic */ void zzag(zzgc zzgc, int i, zzgl zzgl) {
        zzgl.getClass();
        zzgc.zzbM();
        zzgc.zzj.set(i, zzgl);
    }

    public static /* synthetic */ void zzah(zzgc zzgc, zzgl zzgl) {
        zzgl.getClass();
        zzgc.zzbM();
        zzgc.zzj.add(zzgl);
    }

    public static /* synthetic */ void zzai(zzgc zzgc, Iterable iterable) {
        zzgc.zzbM();
        zzin.zzbt(iterable, zzgc.zzj);
    }

    public static /* synthetic */ void zzaj(zzgc zzgc, int i) {
        zzgc.zzbM();
        zzgc.zzj.remove(i);
    }

    public static /* synthetic */ void zzak(zzgc zzgc, long j) {
        zzgc.zzf |= 2;
        zzgc.zzk = j;
    }

    public static /* synthetic */ void zzal(zzgc zzgc, long j) {
        zzgc.zzf |= 4;
        zzgc.zzl = j;
    }

    public static /* synthetic */ void zzam(zzgc zzgc, long j) {
        zzgc.zzf |= 8;
        zzgc.zzm = j;
    }

    public static /* synthetic */ void zzan(zzgc zzgc, long j) {
        zzgc.zzf |= 16;
        zzgc.zzn = j;
    }

    public static /* synthetic */ void zzao(zzgc zzgc) {
        zzgc.zzf &= -17;
        zzgc.zzn = 0;
    }

    public static /* synthetic */ void zzap(zzgc zzgc, long j) {
        zzgc.zzf |= 32;
        zzgc.zzo = j;
    }

    public static /* synthetic */ void zzaq(zzgc zzgc) {
        zzgc.zzf &= -33;
        zzgc.zzo = 0;
    }

    public static /* synthetic */ void zzar(zzgc zzgc, String str) {
        zzgc.zzf |= 64;
        zzgc.zzp = MetricCommonTags.METRIC_COMMON_TAG_PLATFORM_ANDROID;
    }

    public static /* synthetic */ void zzas(zzgc zzgc, String str) {
        str.getClass();
        zzgc.zzf |= RecyclerView.C1119a0.FLAG_IGNORE;
        zzgc.zzq = str;
    }

    public static /* synthetic */ void zzat(zzgc zzgc) {
        zzgc.zzf &= -129;
        zzgc.zzq = zze.zzq;
    }

    public static /* synthetic */ void zzau(zzgc zzgc, String str) {
        str.getClass();
        zzgc.zzf |= 256;
        zzgc.zzr = str;
    }

    public static /* synthetic */ void zzav(zzgc zzgc) {
        zzgc.zzf &= -257;
        zzgc.zzr = zze.zzr;
    }

    public static /* synthetic */ void zzaw(zzgc zzgc, String str) {
        str.getClass();
        zzgc.zzf |= 512;
        zzgc.zzs = str;
    }

    public static /* synthetic */ void zzax(zzgc zzgc, int i) {
        zzgc.zzf |= 1024;
        zzgc.zzt = i;
    }

    public static /* synthetic */ void zzay(zzgc zzgc, String str) {
        str.getClass();
        zzgc.zzf |= 2048;
        zzgc.zzu = str;
    }

    public static /* synthetic */ void zzaz(zzgc zzgc, String str) {
        str.getClass();
        zzgc.zzf |= 4096;
        zzgc.zzv = str;
    }

    private final void zzbL() {
        zzkl zzkl = this.zzi;
        if (!zzkl.zzc()) {
            this.zzi = zzke.zzbE(zzkl);
        }
    }

    private final void zzbM() {
        zzkl zzkl = this.zzj;
        if (!zzkl.zzc()) {
            this.zzj = zzke.zzbE(zzkl);
        }
    }

    public static zzgb zzt() {
        return (zzgb) zze.zzbx();
    }

    public final String zzA() {
        return this.zzw;
    }

    public final String zzB() {
        return this.zzY;
    }

    public final String zzC() {
        return this.zzr;
    }

    public final String zzD() {
        return this.zzP;
    }

    public final String zzE() {
        return this.zzI;
    }

    public final String zzF() {
        return this.zzF;
    }

    public final String zzG() {
        return this.zzE;
    }

    public final String zzH() {
        return this.zzq;
    }

    public final String zzI() {
        return this.zzp;
    }

    public final String zzJ() {
        return this.zzz;
    }

    public final String zzK() {
        return this.zzae;
    }

    public final String zzL() {
        return this.zzs;
    }

    public final List zzM() {
        return this.zzH;
    }

    public final List zzN() {
        return this.zzi;
    }

    public final List zzO() {
        return this.zzj;
    }

    public final int zza() {
        return this.zzJ;
    }

    public final boolean zzaW() {
        return this.zzA;
    }

    public final boolean zzaX() {
        return this.zzG;
    }

    public final boolean zzaY() {
        return (this.zzf & AppboyImageUtils.MAX_IMAGE_CACHE_SIZE_BYTES) != 0;
    }

    public final boolean zzaZ() {
        return (this.zzf & 1048576) != 0;
    }

    public final int zzb() {
        return this.zzD;
    }

    public final boolean zzba() {
        return (this.zzf & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0;
    }

    public final boolean zzbb() {
        return (this.zzg & RecyclerView.C1119a0.FLAG_IGNORE) != 0;
    }

    public final boolean zzbc() {
        return (this.zzf & 524288) != 0;
    }

    public final boolean zzbd() {
        return (this.zzg & 16) != 0;
    }

    public final boolean zzbe() {
        return (this.zzf & 8) != 0;
    }

    public final boolean zzbf() {
        return (this.zzf & Spliterator.SUBSIZED) != 0;
    }

    public final boolean zzbg() {
        return (this.zzf & SQLiteDatabase.OPEN_SHAREDCACHE) != 0;
    }

    public final boolean zzbh() {
        return (this.zzf & 32) != 0;
    }

    public final boolean zzbi() {
        return (this.zzf & 16) != 0;
    }

    public final boolean zzbj() {
        return (this.zzf & 1) != 0;
    }

    public final boolean zzbk() {
        return (this.zzg & 2) != 0;
    }

    public final boolean zzbl() {
        return (this.zzf & 8388608) != 0;
    }

    public final boolean zzbm() {
        return (this.zzg & 8192) != 0;
    }

    public final boolean zzbn() {
        return (this.zzf & 4) != 0;
    }

    public final boolean zzbo() {
        return (this.zzf & 1024) != 0;
    }

    public final boolean zzbp() {
        return (this.zzf & 2) != 0;
    }

    public final boolean zzbq() {
        return (this.zzf & 32768) != 0;
    }

    public final int zzc() {
        return this.zzi.size();
    }

    public final int zzd() {
        return this.zzh;
    }

    public final int zze() {
        return this.zzR;
    }

    public final int zzf() {
        return this.zzt;
    }

    public final int zzg() {
        return this.zzj.size();
    }

    public final long zzh() {
        return this.zzN;
    }

    public final long zzi() {
        return this.zzC;
    }

    public final long zzj() {
        return this.zzV;
    }

    public final long zzk() {
        return this.zzm;
    }

    public final Object zzl(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzke.zzbI(zze, "\u00014\u0000\u0002\u0001A4\u0000\u0005\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဂ\u0001\u0005ဂ\u0002\u0006ဂ\u0003\u0007ဂ\u0005\bဈ\u0006\tဈ\u0007\nဈ\b\u000bဈ\t\fင\n\rဈ\u000b\u000eဈ\f\u0010ဈ\r\u0011ဂ\u000e\u0012ဂ\u000f\u0013ဈ\u0010\u0014ဇ\u0011\u0015ဈ\u0012\u0016ဂ\u0013\u0017င\u0014\u0018ဈ\u0015\u0019ဈ\u0016\u001aဂ\u0004\u001cဇ\u0017\u001d\u001b\u001eဈ\u0018\u001fင\u0019 င\u001a!င\u001b\"ဈ\u001c#ဂ\u001d$ဂ\u001e%ဈ\u001f&ဈ 'င!)ဈ\",ဉ#-\u001d.ဂ$/ဂ%2ဈ&4ဈ'5ဌ(7ဇ)9ဈ*:ဇ+;ဉ,?ဈ-@\u001aAဈ.", new Object[]{"zzf", "zzg", "zzh", "zzi", zzfs.class, "zzj", zzgl.class, "zzk", "zzl", "zzm", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzB", "zzC", "zzD", "zzE", "zzF", "zzn", "zzG", "zzH", zzfo.class, "zzI", "zzJ", "zzK", "zzL", "zzM", "zzN", "zzO", "zzP", "zzQ", "zzR", "zzS", "zzT", "zzU", "zzV", "zzW", "zzX", "zzY", "zzZ", zzfk.zza, "zzaa", "zzab", "zzac", "zzad", "zzae", "zzaf", "zzag"});
        } else if (i2 == 3) {
            return new zzgc();
        } else {
            if (i2 == 4) {
                return new zzgb((zzfj) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zze;
        }
    }

    public final long zzm() {
        return this.zzx;
    }

    public final long zzn() {
        return this.zzo;
    }

    public final long zzo() {
        return this.zzn;
    }

    public final long zzp() {
        return this.zzl;
    }

    public final long zzq() {
        return this.zzk;
    }

    public final long zzr() {
        return this.zzy;
    }

    public final zzfs zzs(int i) {
        return (zzfs) this.zzi.get(i);
    }

    public final zzgl zzv(int i) {
        return (zzgl) this.zzj.get(i);
    }

    public final String zzw() {
        return this.zzS;
    }

    public final String zzx() {
        return this.zzv;
    }

    public final String zzy() {
        return this.zzB;
    }

    public final String zzz() {
        return this.zzu;
    }
}
