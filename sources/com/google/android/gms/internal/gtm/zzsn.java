package com.google.android.gms.internal.gtm;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;

final class zzsn extends zzsp {
    private final byte[] zza;
    private int zzb;
    private int zzc;
    private int zzd;
    private int zze;

    public zzsn(ByteBuffer byteBuffer, boolean z) {
        super((zzso) null);
        this.zza = byteBuffer.array();
        this.zzb = byteBuffer.position() + byteBuffer.arrayOffset();
        this.zzc = byteBuffer.limit() + byteBuffer.arrayOffset();
    }

    private final byte zzU() throws IOException {
        int i = this.zzb;
        if (i != this.zzc) {
            byte[] bArr = this.zza;
            this.zzb = i + 1;
            return bArr[i];
        }
        throw zzvk.zzj();
    }

    private final int zzV() throws IOException {
        zzad(4);
        return zzW();
    }

    private final int zzW() {
        int i = this.zzb;
        byte[] bArr = this.zza;
        this.zzb = i + 4;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    private final int zzX() throws IOException {
        byte b;
        int i = this.zzb;
        int i2 = this.zzc;
        if (i2 != i) {
            byte[] bArr = this.zza;
            int i3 = i + 1;
            byte b2 = bArr[i];
            if (b2 >= 0) {
                this.zzb = i3;
                return b2;
            } else if (i2 - i3 < 9) {
                return (int) zzaa();
            } else {
                int i4 = i3 + 1;
                byte b3 = b2 ^ (bArr[i3] << 7);
                if (b3 < 0) {
                    b = b3 ^ Byte.MIN_VALUE;
                } else {
                    int i5 = i4 + 1;
                    byte b4 = b3 ^ (bArr[i4] << 14);
                    if (b4 >= 0) {
                        b = b4 ^ 16256;
                    } else {
                        i4 = i5 + 1;
                        byte b5 = b4 ^ (bArr[i5] << 21);
                        if (b5 < 0) {
                            b = b5 ^ -2080896;
                        } else {
                            i5 = i4 + 1;
                            byte b6 = bArr[i4];
                            b = (b5 ^ (b6 << 28)) ^ 266354560;
                            if (b6 < 0) {
                                i4 = i5 + 1;
                                if (bArr[i5] < 0) {
                                    i5 = i4 + 1;
                                    if (bArr[i4] < 0) {
                                        i4 = i5 + 1;
                                        if (bArr[i5] < 0) {
                                            i5 = i4 + 1;
                                            if (bArr[i4] < 0) {
                                                i4 = i5 + 1;
                                                if (bArr[i5] < 0) {
                                                    throw zzvk.zze();
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    i4 = i5;
                }
                this.zzb = i4;
                return b;
            }
        } else {
            throw zzvk.zzj();
        }
    }

    private final long zzY() throws IOException {
        zzad(8);
        return zzZ();
    }

    private final long zzZ() {
        int i = this.zzb;
        byte[] bArr = this.zza;
        this.zzb = i + 8;
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    private final long zzaa() throws IOException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte zzU = zzU();
            j |= ((long) (zzU & Byte.MAX_VALUE)) << i;
            if ((zzU & 128) == 0) {
                return j;
            }
        }
        throw zzvk.zze();
    }

    private final <T> T zzab(zzwx<T> zzwx, zzuj zzuj) throws IOException {
        int i = this.zze;
        this.zze = ((this.zzd >>> 3) << 3) | 4;
        try {
            T zze2 = zzwx.zze();
            zzwx.zzh(zze2, this, zzuj);
            zzwx.zzf(zze2);
            if (this.zzd == this.zze) {
                return zze2;
            }
            throw zzvk.zzg();
        } finally {
            this.zze = i;
        }
    }

    private final <T> T zzac(zzwx<T> zzwx, zzuj zzuj) throws IOException {
        int zzX = zzX();
        zzad(zzX);
        int i = this.zzc;
        int i2 = this.zzb + zzX;
        this.zzc = i2;
        try {
            T zze2 = zzwx.zze();
            zzwx.zzh(zze2, this, zzuj);
            zzwx.zzf(zze2);
            if (this.zzb == i2) {
                return zze2;
            }
            throw zzvk.zzg();
        } finally {
            this.zzc = i;
        }
    }

    private final void zzad(int i) throws IOException {
        if (i < 0 || i > this.zzc - this.zzb) {
            throw zzvk.zzj();
        }
    }

    private final void zzae(int i) throws IOException {
        if (this.zzb != i) {
            throw zzvk.zzj();
        }
    }

    private final void zzaf(int i) throws IOException {
        if ((this.zzd & 7) != i) {
            throw zzvk.zza();
        }
    }

    private final void zzag(int i) throws IOException {
        zzad(i);
        this.zzb += i;
    }

    private final void zzah(int i) throws IOException {
        zzad(i);
        if ((i & 3) != 0) {
            throw zzvk.zzg();
        }
    }

    private final void zzai(int i) throws IOException {
        zzad(i);
        if ((i & 7) != 0) {
            throw zzvk.zzg();
        }
    }

    private final boolean zzaj() {
        return this.zzb == this.zzc;
    }

    public final void zzA(List<Double> list) throws IOException {
        int i;
        int i2;
        if (list instanceof zzug) {
            zzug zzug = (zzug) list;
            int i3 = this.zzd & 7;
            if (i3 == 1) {
                do {
                    zzug.zze(zza());
                    if (!zzaj()) {
                        i2 = this.zzb;
                    } else {
                        return;
                    }
                } while (zzX() == this.zzd);
                this.zzb = i2;
            } else if (i3 == 2) {
                int zzX = zzX();
                zzai(zzX);
                int i4 = this.zzb + zzX;
                while (this.zzb < i4) {
                    zzug.zze(Double.longBitsToDouble(zzZ()));
                }
            } else {
                throw zzvk.zza();
            }
        } else {
            int i5 = this.zzd & 7;
            if (i5 == 1) {
                do {
                    list.add(Double.valueOf(zza()));
                    if (!zzaj()) {
                        i = this.zzb;
                    } else {
                        return;
                    }
                } while (zzX() == this.zzd);
                this.zzb = i;
            } else if (i5 == 2) {
                int zzX2 = zzX();
                zzai(zzX2);
                int i6 = this.zzb + zzX2;
                while (this.zzb < i6) {
                    list.add(Double.valueOf(Double.longBitsToDouble(zzZ())));
                }
            } else {
                throw zzvk.zza();
            }
        }
    }

    public final void zzB(List<Integer> list) throws IOException {
        int i;
        int i2;
        if (list instanceof zzva) {
            zzva zzva = (zzva) list;
            int i3 = this.zzd & 7;
            if (i3 == 0) {
                do {
                    zzva.zzh(zze());
                    if (!zzaj()) {
                        i2 = this.zzb;
                    } else {
                        return;
                    }
                } while (zzX() == this.zzd);
                this.zzb = i2;
            } else if (i3 == 2) {
                int zzX = this.zzb + zzX();
                while (this.zzb < zzX) {
                    zzva.zzh(zzX());
                }
            } else {
                throw zzvk.zza();
            }
        } else {
            int i4 = this.zzd & 7;
            if (i4 == 0) {
                do {
                    list.add(Integer.valueOf(zze()));
                    if (!zzaj()) {
                        i = this.zzb;
                    } else {
                        return;
                    }
                } while (zzX() == this.zzd);
                this.zzb = i;
            } else if (i4 == 2) {
                int zzX2 = this.zzb + zzX();
                while (this.zzb < zzX2) {
                    list.add(Integer.valueOf(zzX()));
                }
            } else {
                throw zzvk.zza();
            }
        }
    }

    public final void zzC(List<Integer> list) throws IOException {
        int i;
        int i2;
        if (list instanceof zzva) {
            zzva zzva = (zzva) list;
            int i3 = this.zzd & 7;
            if (i3 == 2) {
                int zzX = zzX();
                zzah(zzX);
                int i4 = this.zzb + zzX;
                while (this.zzb < i4) {
                    zzva.zzh(zzW());
                }
            } else if (i3 == 5) {
                do {
                    zzva.zzh(zzf());
                    if (!zzaj()) {
                        i2 = this.zzb;
                    } else {
                        return;
                    }
                } while (zzX() == this.zzd);
                this.zzb = i2;
            } else {
                throw zzvk.zza();
            }
        } else {
            int i5 = this.zzd & 7;
            if (i5 == 2) {
                int zzX2 = zzX();
                zzah(zzX2);
                int i6 = this.zzb + zzX2;
                while (this.zzb < i6) {
                    list.add(Integer.valueOf(zzW()));
                }
            } else if (i5 == 5) {
                do {
                    list.add(Integer.valueOf(zzf()));
                    if (!zzaj()) {
                        i = this.zzb;
                    } else {
                        return;
                    }
                } while (zzX() == this.zzd);
                this.zzb = i;
            } else {
                throw zzvk.zza();
            }
        }
    }

    public final void zzD(List<Long> list) throws IOException {
        int i;
        int i2;
        if (list instanceof zzvz) {
            zzvz zzvz = (zzvz) list;
            int i3 = this.zzd & 7;
            if (i3 == 1) {
                do {
                    zzvz.zzf(zzk());
                    if (!zzaj()) {
                        i2 = this.zzb;
                    } else {
                        return;
                    }
                } while (zzX() == this.zzd);
                this.zzb = i2;
            } else if (i3 == 2) {
                int zzX = zzX();
                zzai(zzX);
                int i4 = this.zzb + zzX;
                while (this.zzb < i4) {
                    zzvz.zzf(zzZ());
                }
            } else {
                throw zzvk.zza();
            }
        } else {
            int i5 = this.zzd & 7;
            if (i5 == 1) {
                do {
                    list.add(Long.valueOf(zzk()));
                    if (!zzaj()) {
                        i = this.zzb;
                    } else {
                        return;
                    }
                } while (zzX() == this.zzd);
                this.zzb = i;
            } else if (i5 == 2) {
                int zzX2 = zzX();
                zzai(zzX2);
                int i6 = this.zzb + zzX2;
                while (this.zzb < i6) {
                    list.add(Long.valueOf(zzZ()));
                }
            } else {
                throw zzvk.zza();
            }
        }
    }

    public final void zzE(List<Float> list) throws IOException {
        int i;
        int i2;
        if (list instanceof zzuq) {
            zzuq zzuq = (zzuq) list;
            int i3 = this.zzd & 7;
            if (i3 == 2) {
                int zzX = zzX();
                zzah(zzX);
                int i4 = this.zzb + zzX;
                while (this.zzb < i4) {
                    zzuq.zze(Float.intBitsToFloat(zzW()));
                }
            } else if (i3 == 5) {
                do {
                    zzuq.zze(zzb());
                    if (!zzaj()) {
                        i2 = this.zzb;
                    } else {
                        return;
                    }
                } while (zzX() == this.zzd);
                this.zzb = i2;
            } else {
                throw zzvk.zza();
            }
        } else {
            int i5 = this.zzd & 7;
            if (i5 == 2) {
                int zzX2 = zzX();
                zzah(zzX2);
                int i6 = this.zzb + zzX2;
                while (this.zzb < i6) {
                    list.add(Float.valueOf(Float.intBitsToFloat(zzW())));
                }
            } else if (i5 == 5) {
                do {
                    list.add(Float.valueOf(zzb()));
                    if (!zzaj()) {
                        i = this.zzb;
                    } else {
                        return;
                    }
                } while (zzX() == this.zzd);
                this.zzb = i;
            } else {
                throw zzvk.zza();
            }
        }
    }

    public final <T> void zzF(List<T> list, zzwx<T> zzwx, zzuj zzuj) throws IOException {
        int i;
        int i2 = this.zzd;
        if ((i2 & 7) == 3) {
            do {
                list.add(zzab(zzwx, zzuj));
                if (!zzaj()) {
                    i = this.zzb;
                } else {
                    return;
                }
            } while (zzX() == i2);
            this.zzb = i;
            return;
        }
        throw zzvk.zza();
    }

    public final void zzG(List<Integer> list) throws IOException {
        int i;
        int i2;
        if (list instanceof zzva) {
            zzva zzva = (zzva) list;
            int i3 = this.zzd & 7;
            if (i3 == 0) {
                do {
                    zzva.zzh(zzg());
                    if (!zzaj()) {
                        i2 = this.zzb;
                    } else {
                        return;
                    }
                } while (zzX() == this.zzd);
                this.zzb = i2;
            } else if (i3 == 2) {
                int zzX = this.zzb + zzX();
                while (this.zzb < zzX) {
                    zzva.zzh(zzX());
                }
                zzae(zzX);
            } else {
                throw zzvk.zza();
            }
        } else {
            int i4 = this.zzd & 7;
            if (i4 == 0) {
                do {
                    list.add(Integer.valueOf(zzg()));
                    if (!zzaj()) {
                        i = this.zzb;
                    } else {
                        return;
                    }
                } while (zzX() == this.zzd);
                this.zzb = i;
            } else if (i4 == 2) {
                int zzX2 = this.zzb + zzX();
                while (this.zzb < zzX2) {
                    list.add(Integer.valueOf(zzX()));
                }
                zzae(zzX2);
            } else {
                throw zzvk.zza();
            }
        }
    }

    public final void zzH(List<Long> list) throws IOException {
        int i;
        int i2;
        if (list instanceof zzvz) {
            zzvz zzvz = (zzvz) list;
            int i3 = this.zzd & 7;
            if (i3 == 0) {
                do {
                    zzvz.zzf(zzl());
                    if (!zzaj()) {
                        i2 = this.zzb;
                    } else {
                        return;
                    }
                } while (zzX() == this.zzd);
                this.zzb = i2;
            } else if (i3 == 2) {
                int zzX = this.zzb + zzX();
                while (this.zzb < zzX) {
                    zzvz.zzf(zzp());
                }
                zzae(zzX);
            } else {
                throw zzvk.zza();
            }
        } else {
            int i4 = this.zzd & 7;
            if (i4 == 0) {
                do {
                    list.add(Long.valueOf(zzl()));
                    if (!zzaj()) {
                        i = this.zzb;
                    } else {
                        return;
                    }
                } while (zzX() == this.zzd);
                this.zzb = i;
            } else if (i4 == 2) {
                int zzX2 = this.zzb + zzX();
                while (this.zzb < zzX2) {
                    list.add(Long.valueOf(zzp()));
                }
                zzae(zzX2);
            } else {
                throw zzvk.zza();
            }
        }
    }

    public final <T> void zzI(List<T> list, zzwx<T> zzwx, zzuj zzuj) throws IOException {
        int i;
        int i2 = this.zzd;
        if ((i2 & 7) == 2) {
            do {
                list.add(zzac(zzwx, zzuj));
                if (!zzaj()) {
                    i = this.zzb;
                } else {
                    return;
                }
            } while (zzX() == i2);
            this.zzb = i;
            return;
        }
        throw zzvk.zza();
    }

    public final void zzJ(List<Integer> list) throws IOException {
        int i;
        int i2;
        if (list instanceof zzva) {
            zzva zzva = (zzva) list;
            int i3 = this.zzd & 7;
            if (i3 == 2) {
                int zzX = zzX();
                zzah(zzX);
                int i4 = this.zzb + zzX;
                while (this.zzb < i4) {
                    zzva.zzh(zzW());
                }
            } else if (i3 == 5) {
                do {
                    zzva.zzh(zzh());
                    if (!zzaj()) {
                        i2 = this.zzb;
                    } else {
                        return;
                    }
                } while (zzX() == this.zzd);
                this.zzb = i2;
            } else {
                throw zzvk.zza();
            }
        } else {
            int i5 = this.zzd & 7;
            if (i5 == 2) {
                int zzX2 = zzX();
                zzah(zzX2);
                int i6 = this.zzb + zzX2;
                while (this.zzb < i6) {
                    list.add(Integer.valueOf(zzW()));
                }
            } else if (i5 == 5) {
                do {
                    list.add(Integer.valueOf(zzh()));
                    if (!zzaj()) {
                        i = this.zzb;
                    } else {
                        return;
                    }
                } while (zzX() == this.zzd);
                this.zzb = i;
            } else {
                throw zzvk.zza();
            }
        }
    }

    public final void zzK(List<Long> list) throws IOException {
        int i;
        int i2;
        if (list instanceof zzvz) {
            zzvz zzvz = (zzvz) list;
            int i3 = this.zzd & 7;
            if (i3 == 1) {
                do {
                    zzvz.zzf(zzm());
                    if (!zzaj()) {
                        i2 = this.zzb;
                    } else {
                        return;
                    }
                } while (zzX() == this.zzd);
                this.zzb = i2;
            } else if (i3 == 2) {
                int zzX = zzX();
                zzai(zzX);
                int i4 = this.zzb + zzX;
                while (this.zzb < i4) {
                    zzvz.zzf(zzZ());
                }
            } else {
                throw zzvk.zza();
            }
        } else {
            int i5 = this.zzd & 7;
            if (i5 == 1) {
                do {
                    list.add(Long.valueOf(zzm()));
                    if (!zzaj()) {
                        i = this.zzb;
                    } else {
                        return;
                    }
                } while (zzX() == this.zzd);
                this.zzb = i;
            } else if (i5 == 2) {
                int zzX2 = zzX();
                zzai(zzX2);
                int i6 = this.zzb + zzX2;
                while (this.zzb < i6) {
                    list.add(Long.valueOf(zzZ()));
                }
            } else {
                throw zzvk.zza();
            }
        }
    }

    public final void zzL(List<Integer> list) throws IOException {
        int i;
        int i2;
        if (list instanceof zzva) {
            zzva zzva = (zzva) list;
            int i3 = this.zzd & 7;
            if (i3 == 0) {
                do {
                    zzva.zzh(zzi());
                    if (!zzaj()) {
                        i2 = this.zzb;
                    } else {
                        return;
                    }
                } while (zzX() == this.zzd);
                this.zzb = i2;
            } else if (i3 == 2) {
                int zzX = this.zzb + zzX();
                while (this.zzb < zzX) {
                    zzva.zzh(zztj.zzs(zzX()));
                }
            } else {
                throw zzvk.zza();
            }
        } else {
            int i4 = this.zzd & 7;
            if (i4 == 0) {
                do {
                    list.add(Integer.valueOf(zzi()));
                    if (!zzaj()) {
                        i = this.zzb;
                    } else {
                        return;
                    }
                } while (zzX() == this.zzd);
                this.zzb = i;
            } else if (i4 == 2) {
                int zzX2 = this.zzb + zzX();
                while (this.zzb < zzX2) {
                    list.add(Integer.valueOf(zztj.zzs(zzX())));
                }
            } else {
                throw zzvk.zza();
            }
        }
    }

    public final void zzM(List<Long> list) throws IOException {
        int i;
        int i2;
        if (list instanceof zzvz) {
            zzvz zzvz = (zzvz) list;
            int i3 = this.zzd & 7;
            if (i3 == 0) {
                do {
                    zzvz.zzf(zzn());
                    if (!zzaj()) {
                        i2 = this.zzb;
                    } else {
                        return;
                    }
                } while (zzX() == this.zzd);
                this.zzb = i2;
            } else if (i3 == 2) {
                int zzX = this.zzb + zzX();
                while (this.zzb < zzX) {
                    zzvz.zzf(zztj.zzt(zzp()));
                }
            } else {
                throw zzvk.zza();
            }
        } else {
            int i4 = this.zzd & 7;
            if (i4 == 0) {
                do {
                    list.add(Long.valueOf(zzn()));
                    if (!zzaj()) {
                        i = this.zzb;
                    } else {
                        return;
                    }
                } while (zzX() == this.zzd);
                this.zzb = i;
            } else if (i4 == 2) {
                int zzX2 = this.zzb + zzX();
                while (this.zzb < zzX2) {
                    list.add(Long.valueOf(zztj.zzt(zzp())));
                }
            } else {
                throw zzvk.zza();
            }
        }
    }

    public final void zzN(List<String> list) throws IOException {
        zzO(list, false);
    }

    public final void zzO(List<String> list, boolean z) throws IOException {
        int i;
        int i2;
        if ((this.zzd & 7) != 2) {
            throw zzvk.zza();
        } else if ((list instanceof zzvs) && !z) {
            zzvs zzvs = (zzvs) list;
            do {
                zzvs.zzi(zzq());
                if (!zzaj()) {
                    i2 = this.zzb;
                } else {
                    return;
                }
            } while (zzX() == this.zzd);
            this.zzb = i2;
        } else {
            do {
                list.add(zzw(z));
                if (!zzaj()) {
                    i = this.zzb;
                } else {
                    return;
                }
            } while (zzX() == this.zzd);
            this.zzb = i;
        }
    }

    public final void zzP(List<String> list) throws IOException {
        zzO(list, true);
    }

    public final void zzQ(List<Integer> list) throws IOException {
        int i;
        int i2;
        if (list instanceof zzva) {
            zzva zzva = (zzva) list;
            int i3 = this.zzd & 7;
            if (i3 == 0) {
                do {
                    zzva.zzh(zzj());
                    if (!zzaj()) {
                        i2 = this.zzb;
                    } else {
                        return;
                    }
                } while (zzX() == this.zzd);
                this.zzb = i2;
            } else if (i3 == 2) {
                int zzX = this.zzb + zzX();
                while (this.zzb < zzX) {
                    zzva.zzh(zzX());
                }
            } else {
                throw zzvk.zza();
            }
        } else {
            int i4 = this.zzd & 7;
            if (i4 == 0) {
                do {
                    list.add(Integer.valueOf(zzj()));
                    if (!zzaj()) {
                        i = this.zzb;
                    } else {
                        return;
                    }
                } while (zzX() == this.zzd);
                this.zzb = i;
            } else if (i4 == 2) {
                int zzX2 = this.zzb + zzX();
                while (this.zzb < zzX2) {
                    list.add(Integer.valueOf(zzX()));
                }
            } else {
                throw zzvk.zza();
            }
        }
    }

    public final void zzR(List<Long> list) throws IOException {
        int i;
        int i2;
        if (list instanceof zzvz) {
            zzvz zzvz = (zzvz) list;
            int i3 = this.zzd & 7;
            if (i3 == 0) {
                do {
                    zzvz.zzf(zzo());
                    if (!zzaj()) {
                        i2 = this.zzb;
                    } else {
                        return;
                    }
                } while (zzX() == this.zzd);
                this.zzb = i2;
            } else if (i3 == 2) {
                int zzX = this.zzb + zzX();
                while (this.zzb < zzX) {
                    zzvz.zzf(zzp());
                }
                zzae(zzX);
            } else {
                throw zzvk.zza();
            }
        } else {
            int i4 = this.zzd & 7;
            if (i4 == 0) {
                do {
                    list.add(Long.valueOf(zzo()));
                    if (!zzaj()) {
                        i = this.zzb;
                    } else {
                        return;
                    }
                } while (zzX() == this.zzd);
                this.zzb = i;
            } else if (i4 == 2) {
                int zzX2 = this.zzb + zzX();
                while (this.zzb < zzX2) {
                    list.add(Long.valueOf(zzp()));
                }
                zzae(zzX2);
            } else {
                throw zzvk.zza();
            }
        }
    }

    public final boolean zzS() throws IOException {
        zzaf(0);
        if (zzX() != 0) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x002e A[LOOP:0: B:18:0x002e->B:21:0x003b, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean zzT() throws java.io.IOException {
        /*
            r7 = this;
            boolean r0 = r7.zzaj()
            r1 = 0
            if (r0 != 0) goto L_0x0085
            int r0 = r7.zzd
            int r2 = r7.zze
            if (r0 != r2) goto L_0x000f
            goto L_0x0085
        L_0x000f:
            r3 = r0 & 7
            r4 = 1
            if (r3 == 0) goto L_0x0059
            if (r3 == r4) goto L_0x0053
            r1 = 2
            if (r3 == r1) goto L_0x004b
            r1 = 4
            r5 = 3
            if (r3 == r5) goto L_0x0029
            r0 = 5
            if (r3 != r0) goto L_0x0024
            r7.zzag(r1)
            return r4
        L_0x0024:
            com.google.android.gms.internal.gtm.zzvj r0 = com.google.android.gms.internal.gtm.zzvk.zza()
            throw r0
        L_0x0029:
            int r0 = r0 >>> r5
            int r0 = r0 << r5
            r0 = r0 | r1
            r7.zze = r0
        L_0x002e:
            int r0 = r7.zzc()
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r0 == r1) goto L_0x003d
            boolean r0 = r7.zzT()
            if (r0 != 0) goto L_0x002e
        L_0x003d:
            int r0 = r7.zzd
            int r1 = r7.zze
            if (r0 != r1) goto L_0x0046
            r7.zze = r2
            return r4
        L_0x0046:
            com.google.android.gms.internal.gtm.zzvk r0 = com.google.android.gms.internal.gtm.zzvk.zzg()
            throw r0
        L_0x004b:
            int r0 = r7.zzX()
            r7.zzag(r0)
            return r4
        L_0x0053:
            r0 = 8
            r7.zzag(r0)
            return r4
        L_0x0059:
            int r0 = r7.zzc
            int r2 = r7.zzb
            int r0 = r0 - r2
            r3 = 10
            if (r0 < r3) goto L_0x0074
            byte[] r0 = r7.zza
            r5 = 0
        L_0x0065:
            if (r5 >= r3) goto L_0x0074
            int r6 = r2 + 1
            byte r2 = r0[r2]
            if (r2 < 0) goto L_0x0070
            r7.zzb = r6
            goto L_0x007f
        L_0x0070:
            int r5 = r5 + 1
            r2 = r6
            goto L_0x0065
        L_0x0074:
            if (r1 >= r3) goto L_0x0080
            byte r0 = r7.zzU()
            if (r0 >= 0) goto L_0x007f
            int r1 = r1 + 1
            goto L_0x0074
        L_0x007f:
            return r4
        L_0x0080:
            com.google.android.gms.internal.gtm.zzvk r0 = com.google.android.gms.internal.gtm.zzvk.zze()
            throw r0
        L_0x0085:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzsn.zzT():boolean");
    }

    public final double zza() throws IOException {
        zzaf(1);
        return Double.longBitsToDouble(zzY());
    }

    public final float zzb() throws IOException {
        zzaf(5);
        return Float.intBitsToFloat(zzV());
    }

    public final int zzc() throws IOException {
        if (zzaj()) {
            return Integer.MAX_VALUE;
        }
        int zzX = zzX();
        this.zzd = zzX;
        if (zzX == this.zze) {
            return Integer.MAX_VALUE;
        }
        return zzX >>> 3;
    }

    public final int zzd() {
        return this.zzd;
    }

    public final int zze() throws IOException {
        zzaf(0);
        return zzX();
    }

    public final int zzf() throws IOException {
        zzaf(5);
        return zzV();
    }

    public final int zzg() throws IOException {
        zzaf(0);
        return zzX();
    }

    public final int zzh() throws IOException {
        zzaf(5);
        return zzV();
    }

    public final int zzi() throws IOException {
        zzaf(0);
        return zztj.zzs(zzX());
    }

    public final int zzj() throws IOException {
        zzaf(0);
        return zzX();
    }

    public final long zzk() throws IOException {
        zzaf(1);
        return zzY();
    }

    public final long zzl() throws IOException {
        zzaf(0);
        return zzp();
    }

    public final long zzm() throws IOException {
        zzaf(1);
        return zzY();
    }

    public final long zzn() throws IOException {
        zzaf(0);
        return zztj.zzt(zzp());
    }

    public final long zzo() throws IOException {
        zzaf(0);
        return zzp();
    }

    public final long zzp() throws IOException {
        long j;
        long j2;
        long j3;
        long j4;
        byte b;
        int i = this.zzb;
        int i2 = this.zzc;
        if (i2 != i) {
            byte[] bArr = this.zza;
            int i3 = i + 1;
            byte b2 = bArr[i];
            if (b2 >= 0) {
                this.zzb = i3;
                return (long) b2;
            } else if (i2 - i3 < 9) {
                return zzaa();
            } else {
                int i4 = i3 + 1;
                byte b3 = b2 ^ (bArr[i3] << 7);
                if (b3 < 0) {
                    b = b3 ^ Byte.MIN_VALUE;
                } else {
                    int i5 = i4 + 1;
                    byte b4 = b3 ^ (bArr[i4] << 14);
                    if (b4 >= 0) {
                        j2 = (long) (b4 ^ 16256);
                    } else {
                        i4 = i5 + 1;
                        byte b5 = b4 ^ (bArr[i5] << 21);
                        if (b5 < 0) {
                            b = b5 ^ -2080896;
                        } else {
                            i5 = i4 + 1;
                            long j5 = (((long) bArr[i4]) << 28) ^ ((long) b5);
                            if (j5 >= 0) {
                                j4 = 266354560;
                            } else {
                                int i6 = i5 + 1;
                                long j6 = j5 ^ (((long) bArr[i5]) << 35);
                                if (j6 < 0) {
                                    j3 = -34093383808L;
                                } else {
                                    i5 = i6 + 1;
                                    j5 = j6 ^ (((long) bArr[i6]) << 42);
                                    if (j5 >= 0) {
                                        j4 = 4363953127296L;
                                    } else {
                                        i6 = i5 + 1;
                                        j6 = j5 ^ (((long) bArr[i5]) << 49);
                                        if (j6 < 0) {
                                            j3 = -558586000294016L;
                                        } else {
                                            i5 = i6 + 1;
                                            j2 = (j6 ^ (((long) bArr[i6]) << 56)) ^ 71499008037633920L;
                                            if (j2 < 0) {
                                                i6 = i5 + 1;
                                                if (((long) bArr[i5]) >= 0) {
                                                    j = j2;
                                                    i4 = i6;
                                                    this.zzb = i4;
                                                    return j;
                                                }
                                                throw zzvk.zze();
                                            }
                                        }
                                    }
                                }
                                j = j3 ^ j6;
                                i4 = i6;
                                this.zzb = i4;
                                return j;
                            }
                            j2 = j5 ^ j4;
                        }
                    }
                    i4 = i5;
                    j = j2;
                    this.zzb = i4;
                    return j;
                }
                j = (long) b;
                this.zzb = i4;
                return j;
            }
        } else {
            throw zzvk.zzj();
        }
    }

    public final zztd zzq() throws IOException {
        zzaf(2);
        int zzX = zzX();
        if (zzX == 0) {
            return zztd.zzb;
        }
        zzad(zzX);
        zztd zzq = zztd.zzq(this.zza, this.zzb, zzX);
        this.zzb += zzX;
        return zzq;
    }

    public final <T> T zzr(Class<T> cls, zzuj zzuj) throws IOException {
        zzaf(3);
        return zzab(zzwt.zza().zzb(cls), zzuj);
    }

    public final <T> T zzs(zzwx<T> zzwx, zzuj zzuj) throws IOException {
        zzaf(3);
        return zzab(zzwx, zzuj);
    }

    public final <T> T zzt(Class<T> cls, zzuj zzuj) throws IOException {
        zzaf(2);
        return zzac(zzwt.zza().zzb(cls), zzuj);
    }

    public final <T> T zzu(zzwx<T> zzwx, zzuj zzuj) throws IOException {
        zzaf(2);
        return zzac(zzwx, zzuj);
    }

    public final String zzv() throws IOException {
        return zzw(false);
    }

    public final String zzw(boolean z) throws IOException {
        zzaf(2);
        int zzX = zzX();
        if (zzX == 0) {
            return "";
        }
        zzad(zzX);
        if (z) {
            byte[] bArr = this.zza;
            int i = this.zzb;
            if (!zzyd.zzf(bArr, i, i + zzX)) {
                throw zzvk.zzd();
            }
        }
        String str = new String(this.zza, this.zzb, zzX, zzvi.zza);
        this.zzb += zzX;
        return str;
    }

    public final String zzx() throws IOException {
        return zzw(true);
    }

    public final void zzy(List<Boolean> list) throws IOException {
        int i;
        boolean z;
        int i2;
        boolean z2;
        if (list instanceof zzsr) {
            zzsr zzsr = (zzsr) list;
            int i3 = this.zzd & 7;
            if (i3 == 0) {
                do {
                    zzsr.zze(zzS());
                    if (!zzaj()) {
                        i2 = this.zzb;
                    } else {
                        return;
                    }
                } while (zzX() == this.zzd);
                this.zzb = i2;
            } else if (i3 == 2) {
                int zzX = this.zzb + zzX();
                while (this.zzb < zzX) {
                    if (zzX() != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    zzsr.zze(z2);
                }
                zzae(zzX);
            } else {
                throw zzvk.zza();
            }
        } else {
            int i4 = this.zzd & 7;
            if (i4 == 0) {
                do {
                    list.add(Boolean.valueOf(zzS()));
                    if (!zzaj()) {
                        i = this.zzb;
                    } else {
                        return;
                    }
                } while (zzX() == this.zzd);
                this.zzb = i;
            } else if (i4 == 2) {
                int zzX2 = this.zzb + zzX();
                while (this.zzb < zzX2) {
                    if (zzX() != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    list.add(Boolean.valueOf(z));
                }
                zzae(zzX2);
            } else {
                throw zzvk.zza();
            }
        }
    }

    public final void zzz(List<zztd> list) throws IOException {
        int i;
        if ((this.zzd & 7) == 2) {
            do {
                list.add(zzq());
                if (!zzaj()) {
                    i = this.zzb;
                } else {
                    return;
                }
            } while (zzX() == this.zzd);
            this.zzb = i;
            return;
        }
        throw zzvk.zza();
    }
}
