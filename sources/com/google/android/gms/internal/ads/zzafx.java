package com.google.android.gms.internal.ads;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class zzafx implements zzahl {
    private final List zza;

    public zzafx() {
        this(0);
    }

    private final zzahb zzb(zzahk zzahk) {
        return new zzahb(zzd(zzahk));
    }

    private final zzahp zzc(zzahk zzahk) {
        return new zzahp(zzd(zzahk));
    }

    private final List zzd(zzahk zzahk) {
        ArrayList arrayList;
        String str;
        int i;
        List list;
        zzdy zzdy = new zzdy(zzahk.zzd);
        List list2 = this.zza;
        while (zzdy.zza() > 0) {
            int zzk = zzdy.zzk();
            int zzc = zzdy.zzc() + zzdy.zzk();
            if (zzk == 134) {
                ArrayList arrayList2 = new ArrayList();
                int zzk2 = zzdy.zzk() & 31;
                for (int i2 = 0; i2 < zzk2; i2++) {
                    String zzx = zzdy.zzx(3, zzfog.zzc);
                    int zzk3 = zzdy.zzk();
                    int i3 = zzk3 & RecyclerView.C1119a0.FLAG_IGNORE;
                    if (i3 != 0) {
                        i = zzk3 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i = 1;
                    }
                    byte zzk4 = (byte) zzdy.zzk();
                    zzdy.zzG(1);
                    if (i3 != 0) {
                        int i4 = zzcy.zza;
                        list = Collections.singletonList((zzk4 & 64) != 0 ? new byte[]{1} : new byte[]{0});
                    } else {
                        list = null;
                    }
                    zzab zzab = new zzab();
                    zzab.zzS(str);
                    zzab.zzK(zzx);
                    zzab.zzu(i);
                    zzab.zzI(list);
                    arrayList2.add(zzab.zzY());
                }
                arrayList = arrayList2;
            } else {
                arrayList = list2;
            }
            zzdy.zzF(zzc);
            list2 = arrayList;
        }
        return list2;
    }

    public final zzahn zza(int i, zzahk zzahk) {
        if (i != 2) {
            if (i == 3 || i == 4) {
                return new zzagr(new zzago(zzahk.zzb));
            }
            if (i == 21) {
                return new zzagr(new zzagm());
            }
            if (i == 27) {
                return new zzagr(new zzagj(zzb(zzahk), false, false));
            }
            if (i == 36) {
                return new zzagr(new zzagl(zzb(zzahk)));
            }
            if (i == 89) {
                return new zzagr(new zzafz(zzahk.zzc));
            }
            if (i == 138) {
                return new zzagr(new zzafy(zzahk.zzb));
            }
            if (i == 172) {
                return new zzagr(new zzaft(zzahk.zzb));
            }
            if (i == 257) {
                return new zzaha(new zzagq("application/vnd.dvb.ait"));
            }
            if (i != 128) {
                if (i != 129) {
                    if (i == 134) {
                        return new zzaha(new zzagq("application/x-scte35"));
                    }
                    if (i != 135) {
                        switch (i) {
                            case 15:
                                return new zzagr(new zzafw(false, zzahk.zzb));
                            case 16:
                                return new zzagr(new zzagf(zzc(zzahk)));
                            case 17:
                                return new zzagr(new zzagn(zzahk.zzb));
                            default:
                                return null;
                        }
                    }
                }
                return new zzagr(new zzafq(zzahk.zzb));
            }
        }
        return new zzagr(new zzagc(zzc(zzahk)));
    }

    public zzafx(int i) {
        this.zza = zzfrh.zzo();
    }
}
