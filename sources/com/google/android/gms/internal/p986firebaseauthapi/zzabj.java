package com.google.android.gms.internal.p986firebaseauthapi;

import java.io.IOException;
import java.util.List;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzabj */
final class zzabj implements zzadx {
    private final zzabi zza;
    private int zzb;
    private int zzc;
    private int zzd = 0;

    private zzabj(zzabi zzabi) {
        zzacn.zzf(zzabi, "input");
        this.zza = zzabi;
        zzabi.zzc = this;
    }

    private final Object zzP(zzady zzady, zzabu zzabu) throws IOException {
        int i = this.zzc;
        this.zzc = ((this.zzb >>> 3) << 3) | 4;
        try {
            Object zze = zzady.zze();
            zzady.zzh(zze, this, zzabu);
            zzady.zzf(zze);
            if (this.zzb == this.zzc) {
                return zze;
            }
            throw zzacp.zzg();
        } finally {
            this.zzc = i;
        }
    }

    private final Object zzQ(zzady zzady, zzabu zzabu) throws IOException {
        int zze = ((zzabg) this.zza).zze();
        zzabi zzabi = this.zza;
        if (zzabi.zza < zzabi.zzb) {
            int zzc2 = zzabi.zzc(zze);
            Object zze2 = zzady.zze();
            this.zza.zza++;
            zzady.zzh(zze2, this, zzabu);
            zzady.zzf(zze2);
            this.zza.zzm(0);
            zzabi zzabi2 = this.zza;
            zzabi2.zza--;
            zzabi2.zzn(zzc2);
            return zze2;
        }
        throw new zzacp("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    private final void zzR(int i) throws IOException {
        if (this.zza.zzb() != i) {
            throw zzacp.zzi();
        }
    }

    private final void zzS(int i) throws IOException {
        if ((this.zzb & 7) != i) {
            throw zzacp.zza();
        }
    }

    private static final void zzT(int i) throws IOException {
        if ((i & 3) != 0) {
            throw zzacp.zzg();
        }
    }

    private static final void zzU(int i) throws IOException {
        if ((i & 7) != 0) {
            throw zzacp.zzg();
        }
    }

    public static zzabj zzq(zzabi zzabi) {
        zzabj zzabj = zzabi.zzc;
        return zzabj != null ? zzabj : new zzabj(zzabi);
    }

    public final void zzA(List list) throws IOException {
        int zzf;
        int zzf2;
        if (list instanceof zzadb) {
            zzadb zzadb = (zzadb) list;
            int i = this.zzb & 7;
            if (i == 1) {
                do {
                    zzadb.zzf(((zzabg) this.zza).zzg());
                    zzabi zzabi = this.zza;
                    if (!zzabi.zzp()) {
                        zzf2 = zzabi.zzf();
                    } else {
                        return;
                    }
                } while (zzf2 == this.zzb);
                this.zzd = zzf2;
            } else if (i == 2) {
                int zze = ((zzabg) this.zza).zze();
                zzU(zze);
                int zzb2 = this.zza.zzb() + zze;
                do {
                    zzadb.zzf(((zzabg) this.zza).zzg());
                } while (this.zza.zzb() < zzb2);
            } else {
                throw zzacp.zza();
            }
        } else {
            int i2 = this.zzb & 7;
            if (i2 == 1) {
                do {
                    list.add(Long.valueOf(((zzabg) this.zza).zzg()));
                    zzabi zzabi2 = this.zza;
                    if (!zzabi2.zzp()) {
                        zzf = zzabi2.zzf();
                    } else {
                        return;
                    }
                } while (zzf == this.zzb);
                this.zzd = zzf;
            } else if (i2 == 2) {
                int zze2 = ((zzabg) this.zza).zze();
                zzU(zze2);
                int zzb3 = this.zza.zzb() + zze2;
                do {
                    list.add(Long.valueOf(((zzabg) this.zza).zzg()));
                } while (this.zza.zzb() < zzb3);
            } else {
                throw zzacp.zza();
            }
        }
    }

    public final void zzB(List list) throws IOException {
        int zzf;
        int zzf2;
        if (list instanceof zzacb) {
            zzacb zzacb = (zzacb) list;
            int i = this.zzb & 7;
            if (i == 2) {
                int zze = ((zzabg) this.zza).zze();
                zzT(zze);
                int zzb2 = this.zza.zzb() + zze;
                do {
                    zzacb.zze(Float.intBitsToFloat(((zzabg) this.zza).zzd()));
                } while (this.zza.zzb() < zzb2);
            } else if (i == 5) {
                do {
                    zzacb.zze(Float.intBitsToFloat(((zzabg) this.zza).zzd()));
                    zzabi zzabi = this.zza;
                    if (!zzabi.zzp()) {
                        zzf2 = zzabi.zzf();
                    } else {
                        return;
                    }
                } while (zzf2 == this.zzb);
                this.zzd = zzf2;
            } else {
                throw zzacp.zza();
            }
        } else {
            int i2 = this.zzb & 7;
            if (i2 == 2) {
                int zze2 = ((zzabg) this.zza).zze();
                zzT(zze2);
                int zzb3 = this.zza.zzb() + zze2;
                do {
                    list.add(Float.valueOf(Float.intBitsToFloat(((zzabg) this.zza).zzd())));
                } while (this.zza.zzb() < zzb3);
            } else if (i2 == 5) {
                do {
                    list.add(Float.valueOf(Float.intBitsToFloat(((zzabg) this.zza).zzd())));
                    zzabi zzabi2 = this.zza;
                    if (!zzabi2.zzp()) {
                        zzf = zzabi2.zzf();
                    } else {
                        return;
                    }
                } while (zzf == this.zzb);
                this.zzd = zzf;
            } else {
                throw zzacp.zza();
            }
        }
    }

    @Deprecated
    public final void zzC(List list, zzady zzady, zzabu zzabu) throws IOException {
        int zzf;
        int i = this.zzb;
        if ((i & 7) == 3) {
            do {
                list.add(zzP(zzady, zzabu));
                zzabi zzabi = this.zza;
                if (!zzabi.zzp() && this.zzd == 0) {
                    zzf = zzabi.zzf();
                } else {
                    return;
                }
            } while (zzf == i);
            this.zzd = zzf;
            return;
        }
        throw zzacp.zza();
    }

    public final void zzD(List list) throws IOException {
        int zzf;
        int zzf2;
        if (list instanceof zzaci) {
            zzaci zzaci = (zzaci) list;
            int i = this.zzb & 7;
            if (i == 0) {
                do {
                    zzaci.zzf(((zzabg) this.zza).zze());
                    zzabi zzabi = this.zza;
                    if (!zzabi.zzp()) {
                        zzf2 = zzabi.zzf();
                    } else {
                        return;
                    }
                } while (zzf2 == this.zzb);
                this.zzd = zzf2;
            } else if (i == 2) {
                int zzb2 = this.zza.zzb() + ((zzabg) this.zza).zze();
                do {
                    zzaci.zzf(((zzabg) this.zza).zze());
                } while (this.zza.zzb() < zzb2);
                zzR(zzb2);
            } else {
                throw zzacp.zza();
            }
        } else {
            int i2 = this.zzb & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(((zzabg) this.zza).zze()));
                    zzabi zzabi2 = this.zza;
                    if (!zzabi2.zzp()) {
                        zzf = zzabi2.zzf();
                    } else {
                        return;
                    }
                } while (zzf == this.zzb);
                this.zzd = zzf;
            } else if (i2 == 2) {
                int zzb3 = this.zza.zzb() + ((zzabg) this.zza).zze();
                do {
                    list.add(Integer.valueOf(((zzabg) this.zza).zze()));
                } while (this.zza.zzb() < zzb3);
                zzR(zzb3);
            } else {
                throw zzacp.zza();
            }
        }
    }

    public final void zzE(List list) throws IOException {
        int zzf;
        int zzf2;
        if (list instanceof zzadb) {
            zzadb zzadb = (zzadb) list;
            int i = this.zzb & 7;
            if (i == 0) {
                do {
                    zzadb.zzf(((zzabg) this.zza).zzh());
                    zzabi zzabi = this.zza;
                    if (!zzabi.zzp()) {
                        zzf2 = zzabi.zzf();
                    } else {
                        return;
                    }
                } while (zzf2 == this.zzb);
                this.zzd = zzf2;
            } else if (i == 2) {
                int zzb2 = this.zza.zzb() + ((zzabg) this.zza).zze();
                do {
                    zzadb.zzf(((zzabg) this.zza).zzh());
                } while (this.zza.zzb() < zzb2);
                zzR(zzb2);
            } else {
                throw zzacp.zza();
            }
        } else {
            int i2 = this.zzb & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(((zzabg) this.zza).zzh()));
                    zzabi zzabi2 = this.zza;
                    if (!zzabi2.zzp()) {
                        zzf = zzabi2.zzf();
                    } else {
                        return;
                    }
                } while (zzf == this.zzb);
                this.zzd = zzf;
            } else if (i2 == 2) {
                int zzb3 = this.zza.zzb() + ((zzabg) this.zza).zze();
                do {
                    list.add(Long.valueOf(((zzabg) this.zza).zzh()));
                } while (this.zza.zzb() < zzb3);
                zzR(zzb3);
            } else {
                throw zzacp.zza();
            }
        }
    }

    public final void zzF(List list, zzady zzady, zzabu zzabu) throws IOException {
        int zzf;
        int i = this.zzb;
        if ((i & 7) == 2) {
            do {
                list.add(zzQ(zzady, zzabu));
                zzabi zzabi = this.zza;
                if (!zzabi.zzp() && this.zzd == 0) {
                    zzf = zzabi.zzf();
                } else {
                    return;
                }
            } while (zzf == i);
            this.zzd = zzf;
            return;
        }
        throw zzacp.zza();
    }

    public final void zzG(List list) throws IOException {
        int zzf;
        int zzf2;
        if (list instanceof zzaci) {
            zzaci zzaci = (zzaci) list;
            int i = this.zzb & 7;
            if (i == 2) {
                int zze = ((zzabg) this.zza).zze();
                zzT(zze);
                int zzb2 = this.zza.zzb() + zze;
                do {
                    zzaci.zzf(((zzabg) this.zza).zzd());
                } while (this.zza.zzb() < zzb2);
            } else if (i == 5) {
                do {
                    zzaci.zzf(((zzabg) this.zza).zzd());
                    zzabi zzabi = this.zza;
                    if (!zzabi.zzp()) {
                        zzf2 = zzabi.zzf();
                    } else {
                        return;
                    }
                } while (zzf2 == this.zzb);
                this.zzd = zzf2;
            } else {
                throw zzacp.zza();
            }
        } else {
            int i2 = this.zzb & 7;
            if (i2 == 2) {
                int zze2 = ((zzabg) this.zza).zze();
                zzT(zze2);
                int zzb3 = this.zza.zzb() + zze2;
                do {
                    list.add(Integer.valueOf(((zzabg) this.zza).zzd()));
                } while (this.zza.zzb() < zzb3);
            } else if (i2 == 5) {
                do {
                    list.add(Integer.valueOf(((zzabg) this.zza).zzd()));
                    zzabi zzabi2 = this.zza;
                    if (!zzabi2.zzp()) {
                        zzf = zzabi2.zzf();
                    } else {
                        return;
                    }
                } while (zzf == this.zzb);
                this.zzd = zzf;
            } else {
                throw zzacp.zza();
            }
        }
    }

    public final void zzH(List list) throws IOException {
        int zzf;
        int zzf2;
        if (list instanceof zzadb) {
            zzadb zzadb = (zzadb) list;
            int i = this.zzb & 7;
            if (i == 1) {
                do {
                    zzadb.zzf(((zzabg) this.zza).zzg());
                    zzabi zzabi = this.zza;
                    if (!zzabi.zzp()) {
                        zzf2 = zzabi.zzf();
                    } else {
                        return;
                    }
                } while (zzf2 == this.zzb);
                this.zzd = zzf2;
            } else if (i == 2) {
                int zze = ((zzabg) this.zza).zze();
                zzU(zze);
                int zzb2 = this.zza.zzb() + zze;
                do {
                    zzadb.zzf(((zzabg) this.zza).zzg());
                } while (this.zza.zzb() < zzb2);
            } else {
                throw zzacp.zza();
            }
        } else {
            int i2 = this.zzb & 7;
            if (i2 == 1) {
                do {
                    list.add(Long.valueOf(((zzabg) this.zza).zzg()));
                    zzabi zzabi2 = this.zza;
                    if (!zzabi2.zzp()) {
                        zzf = zzabi2.zzf();
                    } else {
                        return;
                    }
                } while (zzf == this.zzb);
                this.zzd = zzf;
            } else if (i2 == 2) {
                int zze2 = ((zzabg) this.zza).zze();
                zzU(zze2);
                int zzb3 = this.zza.zzb() + zze2;
                do {
                    list.add(Long.valueOf(((zzabg) this.zza).zzg()));
                } while (this.zza.zzb() < zzb3);
            } else {
                throw zzacp.zza();
            }
        }
    }

    public final void zzI(List list) throws IOException {
        int zzf;
        int zzf2;
        if (list instanceof zzaci) {
            zzaci zzaci = (zzaci) list;
            int i = this.zzb & 7;
            if (i == 0) {
                do {
                    zzaci.zzf(zzabi.zzs(((zzabg) this.zza).zze()));
                    zzabi zzabi = this.zza;
                    if (!zzabi.zzp()) {
                        zzf2 = zzabi.zzf();
                    } else {
                        return;
                    }
                } while (zzf2 == this.zzb);
                this.zzd = zzf2;
            } else if (i == 2) {
                int zzb2 = this.zza.zzb() + ((zzabg) this.zza).zze();
                do {
                    zzaci.zzf(zzabi.zzs(((zzabg) this.zza).zze()));
                } while (this.zza.zzb() < zzb2);
                zzR(zzb2);
            } else {
                throw zzacp.zza();
            }
        } else {
            int i2 = this.zzb & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(zzabi.zzs(((zzabg) this.zza).zze())));
                    zzabi zzabi2 = this.zza;
                    if (!zzabi2.zzp()) {
                        zzf = zzabi2.zzf();
                    } else {
                        return;
                    }
                } while (zzf == this.zzb);
                this.zzd = zzf;
            } else if (i2 == 2) {
                int zzb3 = this.zza.zzb() + ((zzabg) this.zza).zze();
                do {
                    list.add(Integer.valueOf(zzabi.zzs(((zzabg) this.zza).zze())));
                } while (this.zza.zzb() < zzb3);
                zzR(zzb3);
            } else {
                throw zzacp.zza();
            }
        }
    }

    public final void zzJ(List list) throws IOException {
        int zzf;
        int zzf2;
        if (list instanceof zzadb) {
            zzadb zzadb = (zzadb) list;
            int i = this.zzb & 7;
            if (i == 0) {
                do {
                    zzadb.zzf(zzabi.zzt(((zzabg) this.zza).zzh()));
                    zzabi zzabi = this.zza;
                    if (!zzabi.zzp()) {
                        zzf2 = zzabi.zzf();
                    } else {
                        return;
                    }
                } while (zzf2 == this.zzb);
                this.zzd = zzf2;
            } else if (i == 2) {
                int zzb2 = this.zza.zzb() + ((zzabg) this.zza).zze();
                do {
                    zzadb.zzf(zzabi.zzt(((zzabg) this.zza).zzh()));
                } while (this.zza.zzb() < zzb2);
                zzR(zzb2);
            } else {
                throw zzacp.zza();
            }
        } else {
            int i2 = this.zzb & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(zzabi.zzt(((zzabg) this.zza).zzh())));
                    zzabi zzabi2 = this.zza;
                    if (!zzabi2.zzp()) {
                        zzf = zzabi2.zzf();
                    } else {
                        return;
                    }
                } while (zzf == this.zzb);
                this.zzd = zzf;
            } else if (i2 == 2) {
                int zzb3 = this.zza.zzb() + ((zzabg) this.zza).zze();
                do {
                    list.add(Long.valueOf(zzabi.zzt(((zzabg) this.zza).zzh())));
                } while (this.zza.zzb() < zzb3);
                zzR(zzb3);
            } else {
                throw zzacp.zza();
            }
        }
    }

    public final void zzK(List list, boolean z) throws IOException {
        String str;
        int zzf;
        int zzf2;
        if ((this.zzb & 7) != 2) {
            throw zzacp.zza();
        } else if ((list instanceof zzacu) && !z) {
            zzacu zzacu = (zzacu) list;
            do {
                zzacu.zzi(zzp());
                zzabi zzabi = this.zza;
                if (!zzabi.zzp()) {
                    zzf2 = zzabi.zzf();
                } else {
                    return;
                }
            } while (zzf2 == this.zzb);
            this.zzd = zzf2;
        } else {
            do {
                if (z) {
                    str = zzu();
                } else {
                    str = zzt();
                }
                list.add(str);
                zzabi zzabi2 = this.zza;
                if (!zzabi2.zzp()) {
                    zzf = zzabi2.zzf();
                } else {
                    return;
                }
            } while (zzf == this.zzb);
            this.zzd = zzf;
        }
    }

    public final void zzL(List list) throws IOException {
        int zzf;
        int zzf2;
        if (list instanceof zzaci) {
            zzaci zzaci = (zzaci) list;
            int i = this.zzb & 7;
            if (i == 0) {
                do {
                    zzaci.zzf(((zzabg) this.zza).zze());
                    zzabi zzabi = this.zza;
                    if (!zzabi.zzp()) {
                        zzf2 = zzabi.zzf();
                    } else {
                        return;
                    }
                } while (zzf2 == this.zzb);
                this.zzd = zzf2;
            } else if (i == 2) {
                int zzb2 = this.zza.zzb() + ((zzabg) this.zza).zze();
                do {
                    zzaci.zzf(((zzabg) this.zza).zze());
                } while (this.zza.zzb() < zzb2);
                zzR(zzb2);
            } else {
                throw zzacp.zza();
            }
        } else {
            int i2 = this.zzb & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(((zzabg) this.zza).zze()));
                    zzabi zzabi2 = this.zza;
                    if (!zzabi2.zzp()) {
                        zzf = zzabi2.zzf();
                    } else {
                        return;
                    }
                } while (zzf == this.zzb);
                this.zzd = zzf;
            } else if (i2 == 2) {
                int zzb3 = this.zza.zzb() + ((zzabg) this.zza).zze();
                do {
                    list.add(Integer.valueOf(((zzabg) this.zza).zze()));
                } while (this.zza.zzb() < zzb3);
                zzR(zzb3);
            } else {
                throw zzacp.zza();
            }
        }
    }

    public final void zzM(List list) throws IOException {
        int zzf;
        int zzf2;
        if (list instanceof zzadb) {
            zzadb zzadb = (zzadb) list;
            int i = this.zzb & 7;
            if (i == 0) {
                do {
                    zzadb.zzf(((zzabg) this.zza).zzh());
                    zzabi zzabi = this.zza;
                    if (!zzabi.zzp()) {
                        zzf2 = zzabi.zzf();
                    } else {
                        return;
                    }
                } while (zzf2 == this.zzb);
                this.zzd = zzf2;
            } else if (i == 2) {
                int zzb2 = this.zza.zzb() + ((zzabg) this.zza).zze();
                do {
                    zzadb.zzf(((zzabg) this.zza).zzh());
                } while (this.zza.zzb() < zzb2);
                zzR(zzb2);
            } else {
                throw zzacp.zza();
            }
        } else {
            int i2 = this.zzb & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(((zzabg) this.zza).zzh()));
                    zzabi zzabi2 = this.zza;
                    if (!zzabi2.zzp()) {
                        zzf = zzabi2.zzf();
                    } else {
                        return;
                    }
                } while (zzf == this.zzb);
                this.zzd = zzf;
            } else if (i2 == 2) {
                int zzb3 = this.zza.zzb() + ((zzabg) this.zza).zze();
                do {
                    list.add(Long.valueOf(((zzabg) this.zza).zzh()));
                } while (this.zza.zzb() < zzb3);
                zzR(zzb3);
            } else {
                throw zzacp.zza();
            }
        }
    }

    public final boolean zzN() throws IOException {
        zzS(0);
        return this.zza.zzq();
    }

    public final boolean zzO() throws IOException {
        int i;
        zzabi zzabi = this.zza;
        if (zzabi.zzp() || (i = this.zzb) == this.zzc) {
            return false;
        }
        return zzabi.zzr(i);
    }

    public final double zza() throws IOException {
        zzS(1);
        return Double.longBitsToDouble(((zzabg) this.zza).zzg());
    }

    public final float zzb() throws IOException {
        zzS(5);
        return Float.intBitsToFloat(((zzabg) this.zza).zzd());
    }

    public final int zzc() throws IOException {
        int i = this.zzd;
        if (i != 0) {
            this.zzb = i;
            this.zzd = 0;
        } else {
            i = this.zza.zzf();
            this.zzb = i;
        }
        if (i == 0 || i == this.zzc) {
            return Integer.MAX_VALUE;
        }
        return i >>> 3;
    }

    public final int zzd() {
        return this.zzb;
    }

    public final int zze() throws IOException {
        zzS(0);
        return ((zzabg) this.zza).zze();
    }

    public final int zzf() throws IOException {
        zzS(5);
        return ((zzabg) this.zza).zzd();
    }

    public final int zzg() throws IOException {
        zzS(0);
        return ((zzabg) this.zza).zze();
    }

    public final int zzh() throws IOException {
        zzS(5);
        return ((zzabg) this.zza).zzd();
    }

    public final int zzi() throws IOException {
        zzS(0);
        return zzabi.zzs(((zzabg) this.zza).zze());
    }

    public final int zzj() throws IOException {
        zzS(0);
        return ((zzabg) this.zza).zze();
    }

    public final long zzk() throws IOException {
        zzS(1);
        return ((zzabg) this.zza).zzg();
    }

    public final long zzl() throws IOException {
        zzS(0);
        return ((zzabg) this.zza).zzh();
    }

    public final long zzm() throws IOException {
        zzS(1);
        return ((zzabg) this.zza).zzg();
    }

    public final long zzn() throws IOException {
        zzS(0);
        return zzabi.zzt(((zzabg) this.zza).zzh());
    }

    public final long zzo() throws IOException {
        zzS(0);
        return ((zzabg) this.zza).zzh();
    }

    public final zzabe zzp() throws IOException {
        zzS(2);
        return this.zza.zzj();
    }

    @Deprecated
    public final Object zzr(zzady zzady, zzabu zzabu) throws IOException {
        zzS(3);
        return zzP(zzady, zzabu);
    }

    public final Object zzs(zzady zzady, zzabu zzabu) throws IOException {
        zzS(2);
        return zzQ(zzady, zzabu);
    }

    public final String zzt() throws IOException {
        zzS(2);
        return this.zza.zzk();
    }

    public final String zzu() throws IOException {
        zzS(2);
        return this.zza.zzl();
    }

    public final void zzv(List list) throws IOException {
        int zzf;
        int zzf2;
        if (list instanceof zzaat) {
            zzaat zzaat = (zzaat) list;
            int i = this.zzb & 7;
            if (i == 0) {
                do {
                    zzaat.zze(this.zza.zzq());
                    zzabi zzabi = this.zza;
                    if (!zzabi.zzp()) {
                        zzf2 = zzabi.zzf();
                    } else {
                        return;
                    }
                } while (zzf2 == this.zzb);
                this.zzd = zzf2;
            } else if (i == 2) {
                int zzb2 = this.zza.zzb() + ((zzabg) this.zza).zze();
                do {
                    zzaat.zze(this.zza.zzq());
                } while (this.zza.zzb() < zzb2);
                zzR(zzb2);
            } else {
                throw zzacp.zza();
            }
        } else {
            int i2 = this.zzb & 7;
            if (i2 == 0) {
                do {
                    list.add(Boolean.valueOf(this.zza.zzq()));
                    zzabi zzabi2 = this.zza;
                    if (!zzabi2.zzp()) {
                        zzf = zzabi2.zzf();
                    } else {
                        return;
                    }
                } while (zzf == this.zzb);
                this.zzd = zzf;
            } else if (i2 == 2) {
                int zzb3 = this.zza.zzb() + ((zzabg) this.zza).zze();
                do {
                    list.add(Boolean.valueOf(this.zza.zzq()));
                } while (this.zza.zzb() < zzb3);
                zzR(zzb3);
            } else {
                throw zzacp.zza();
            }
        }
    }

    public final void zzw(List list) throws IOException {
        int zzf;
        if ((this.zzb & 7) == 2) {
            do {
                list.add(zzp());
                zzabi zzabi = this.zza;
                if (!zzabi.zzp()) {
                    zzf = zzabi.zzf();
                } else {
                    return;
                }
            } while (zzf == this.zzb);
            this.zzd = zzf;
            return;
        }
        throw zzacp.zza();
    }

    public final void zzx(List list) throws IOException {
        int zzf;
        int zzf2;
        if (list instanceof zzabr) {
            zzabr zzabr = (zzabr) list;
            int i = this.zzb & 7;
            if (i == 1) {
                do {
                    zzabr.zze(Double.longBitsToDouble(((zzabg) this.zza).zzg()));
                    zzabi zzabi = this.zza;
                    if (!zzabi.zzp()) {
                        zzf2 = zzabi.zzf();
                    } else {
                        return;
                    }
                } while (zzf2 == this.zzb);
                this.zzd = zzf2;
            } else if (i == 2) {
                int zze = ((zzabg) this.zza).zze();
                zzU(zze);
                int zzb2 = this.zza.zzb() + zze;
                do {
                    zzabr.zze(Double.longBitsToDouble(((zzabg) this.zza).zzg()));
                } while (this.zza.zzb() < zzb2);
            } else {
                throw zzacp.zza();
            }
        } else {
            int i2 = this.zzb & 7;
            if (i2 == 1) {
                do {
                    list.add(Double.valueOf(Double.longBitsToDouble(((zzabg) this.zza).zzg())));
                    zzabi zzabi2 = this.zza;
                    if (!zzabi2.zzp()) {
                        zzf = zzabi2.zzf();
                    } else {
                        return;
                    }
                } while (zzf == this.zzb);
                this.zzd = zzf;
            } else if (i2 == 2) {
                int zze2 = ((zzabg) this.zza).zze();
                zzU(zze2);
                int zzb3 = this.zza.zzb() + zze2;
                do {
                    list.add(Double.valueOf(Double.longBitsToDouble(((zzabg) this.zza).zzg())));
                } while (this.zza.zzb() < zzb3);
            } else {
                throw zzacp.zza();
            }
        }
    }

    public final void zzy(List list) throws IOException {
        int zzf;
        int zzf2;
        if (list instanceof zzaci) {
            zzaci zzaci = (zzaci) list;
            int i = this.zzb & 7;
            if (i == 0) {
                do {
                    zzaci.zzf(((zzabg) this.zza).zze());
                    zzabi zzabi = this.zza;
                    if (!zzabi.zzp()) {
                        zzf2 = zzabi.zzf();
                    } else {
                        return;
                    }
                } while (zzf2 == this.zzb);
                this.zzd = zzf2;
            } else if (i == 2) {
                int zzb2 = this.zza.zzb() + ((zzabg) this.zza).zze();
                do {
                    zzaci.zzf(((zzabg) this.zza).zze());
                } while (this.zza.zzb() < zzb2);
                zzR(zzb2);
            } else {
                throw zzacp.zza();
            }
        } else {
            int i2 = this.zzb & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(((zzabg) this.zza).zze()));
                    zzabi zzabi2 = this.zza;
                    if (!zzabi2.zzp()) {
                        zzf = zzabi2.zzf();
                    } else {
                        return;
                    }
                } while (zzf == this.zzb);
                this.zzd = zzf;
            } else if (i2 == 2) {
                int zzb3 = this.zza.zzb() + ((zzabg) this.zza).zze();
                do {
                    list.add(Integer.valueOf(((zzabg) this.zza).zze()));
                } while (this.zza.zzb() < zzb3);
                zzR(zzb3);
            } else {
                throw zzacp.zza();
            }
        }
    }

    public final void zzz(List list) throws IOException {
        int zzf;
        int zzf2;
        if (list instanceof zzaci) {
            zzaci zzaci = (zzaci) list;
            int i = this.zzb & 7;
            if (i == 2) {
                int zze = ((zzabg) this.zza).zze();
                zzT(zze);
                int zzb2 = this.zza.zzb() + zze;
                do {
                    zzaci.zzf(((zzabg) this.zza).zzd());
                } while (this.zza.zzb() < zzb2);
            } else if (i == 5) {
                do {
                    zzaci.zzf(((zzabg) this.zza).zzd());
                    zzabi zzabi = this.zza;
                    if (!zzabi.zzp()) {
                        zzf2 = zzabi.zzf();
                    } else {
                        return;
                    }
                } while (zzf2 == this.zzb);
                this.zzd = zzf2;
            } else {
                throw zzacp.zza();
            }
        } else {
            int i2 = this.zzb & 7;
            if (i2 == 2) {
                int zze2 = ((zzabg) this.zza).zze();
                zzT(zze2);
                int zzb3 = this.zza.zzb() + zze2;
                do {
                    list.add(Integer.valueOf(((zzabg) this.zza).zzd()));
                } while (this.zza.zzb() < zzb3);
            } else if (i2 == 5) {
                do {
                    list.add(Integer.valueOf(((zzabg) this.zza).zzd()));
                    zzabi zzabi2 = this.zza;
                    if (!zzabi2.zzp()) {
                        zzf = zzabi2.zzf();
                    } else {
                        return;
                    }
                } while (zzf == this.zzb);
                this.zzd = zzf;
            } else {
                throw zzacp.zza();
            }
        }
    }
}
