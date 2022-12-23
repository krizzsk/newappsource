package mc0;

import ac0.C7557a;
import com.umo.ads.p342c.zzb;
import com.umo.ads.p342c.zzd;
import java.util.ArrayList;
import mf0.C24362h;
import p043ch.qos.logback.classic.Logger;
import p584jl.C17885a;

/* renamed from: mc0.c */
public final class C12911c {

    /* renamed from: a */
    public zzb f31962a = zzb.UNKNOWN;

    /* renamed from: b */
    public ArrayList f31963b;

    /* renamed from: c */
    public boolean f31964c;

    /* renamed from: a */
    public final void mo39779a(String str, boolean z, int i, int i2, zzd zzd) {
        boolean z2;
        C24362h.m61211f(str, "spotId");
        C24362h.m61211f(zzd, "vastError");
        String str2 = this.f31962a.zza;
        ArrayList arrayList = this.f31963b;
        if (arrayList == null || !(!arrayList.isEmpty())) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!z2) {
            Logger logger = C7557a.f23040a;
            logger.mo6667d("HIT_TRACKERS: Invalid \"" + str2 + "\" Trackers list.");
        } else if (this.f31964c) {
            Logger logger2 = C7557a.f23040a;
            logger2.mo6672i("HIT_TRACKERS: \"" + str2 + "\" Trackers already hit.");
        } else {
            if (z) {
                this.f31964c = true;
            }
            C17885a.m44411L0(str, this.f31963b, this.f31962a, i, i2, zzd);
        }
    }
}
