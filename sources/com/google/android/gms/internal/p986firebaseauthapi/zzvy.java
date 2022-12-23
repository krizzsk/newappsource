package com.google.android.gms.internal.p986firebaseauthapi;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.tasks.TaskCompletionSource;

@VisibleForTesting
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzvy */
final class zzvy extends zzxd {
    private final zzqg zza;

    public zzvy(String str, String str2) {
        super(4);
        Preconditions.checkNotEmpty(str, "code cannot be null or empty");
        this.zza = new zzqg(str, str2);
    }

    public final String zza() {
        return "verifyPasswordResetCode";
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzb() {
        /*
            r9 = this;
            com.google.android.gms.internal.firebase-auth-api.zzzl r0 = r9.zzm
            boolean r1 = r0.zzh()
            if (r1 == 0) goto L_0x000c
            r0.zzd()
            goto L_0x000f
        L_0x000c:
            r0.zzc()
        L_0x000f:
            r0.zzc()
            boolean r1 = r0.zzi()
            r2 = 3
            if (r1 != 0) goto L_0x001b
            goto L_0x00c4
        L_0x001b:
            java.lang.String r1 = r0.zze()
            int r3 = r1.hashCode()
            r4 = 0
            r5 = 5
            r6 = 1
            r7 = 4
            r8 = 2
            switch(r3) {
                case -1874510116: goto L_0x005e;
                case -1452371317: goto L_0x0054;
                case -1341836234: goto L_0x004a;
                case -1099157829: goto L_0x0040;
                case 870738373: goto L_0x0036;
                case 970484929: goto L_0x002c;
                default: goto L_0x002b;
            }
        L_0x002b:
            goto L_0x0068
        L_0x002c:
            java.lang.String r3 = "RECOVER_EMAIL"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0068
            r1 = 4
            goto L_0x0069
        L_0x0036:
            java.lang.String r3 = "EMAIL_SIGNIN"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0068
            r1 = 2
            goto L_0x0069
        L_0x0040:
            java.lang.String r3 = "VERIFY_AND_CHANGE_EMAIL"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0068
            r1 = 3
            goto L_0x0069
        L_0x004a:
            java.lang.String r3 = "VERIFY_EMAIL"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0068
            r1 = 1
            goto L_0x0069
        L_0x0054:
            java.lang.String r3 = "PASSWORD_RESET"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0068
            r1 = 0
            goto L_0x0069
        L_0x005e:
            java.lang.String r3 = "REVERT_SECOND_FACTOR_ADDITION"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0068
            r1 = 5
            goto L_0x0069
        L_0x0068:
            r1 = -1
        L_0x0069:
            if (r1 == 0) goto L_0x0080
            if (r1 == r6) goto L_0x007f
            if (r1 == r8) goto L_0x007d
            if (r1 == r2) goto L_0x007b
            if (r1 == r7) goto L_0x0079
            if (r1 == r5) goto L_0x0077
            r4 = 3
            goto L_0x0080
        L_0x0077:
            r4 = 6
            goto L_0x0080
        L_0x0079:
            r4 = 2
            goto L_0x0080
        L_0x007b:
            r4 = 5
            goto L_0x0080
        L_0x007d:
            r4 = 4
            goto L_0x0080
        L_0x007f:
            r4 = 1
        L_0x0080:
            if (r4 == r7) goto L_0x00c3
            if (r4 != r2) goto L_0x0085
            goto L_0x00c3
        L_0x0085:
            boolean r1 = r0.zzg()
            if (r1 == 0) goto L_0x00a1
            java.lang.String r1 = r0.zzc()
            com.google.android.gms.internal.firebase-auth-api.zzze r0 = r0.zzb()
            com.google.firebase.auth.PhoneMultiFactorInfo r0 = p583jk.C17884p.m44359b0(r0)
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r1)
            java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            com.google.firebase.auth.MultiFactorInfo r0 = (com.google.firebase.auth.MultiFactorInfo) r0
            goto L_0x00c3
        L_0x00a1:
            boolean r1 = r0.zzh()
            if (r1 == 0) goto L_0x00b6
            java.lang.String r1 = r0.zzd()
            java.lang.String r0 = r0.zzc()
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r1)
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r0)
            goto L_0x00c3
        L_0x00b6:
            boolean r1 = r0.zzf()
            if (r1 == 0) goto L_0x00c3
            java.lang.String r0 = r0.zzc()
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r0)
        L_0x00c3:
            r2 = r4
        L_0x00c4:
            if (r2 == 0) goto L_0x00d1
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status
            r1 = 17499(0x445b, float:2.4521E-41)
            r0.<init>(r1)
            r9.zzl(r0)
            return
        L_0x00d1:
            com.google.android.gms.internal.firebase-auth-api.zzzl r0 = r9.zzm
            java.lang.String r0 = r0.zzc()
            r9.zzm(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p986firebaseauthapi.zzvy.zzb():void");
    }

    public final void zzc(TaskCompletionSource taskCompletionSource, zzwd zzwd) {
        this.zzv = new zzxc(this, taskCompletionSource);
        zzwd.zzd(this.zza, this.zzc);
    }
}
