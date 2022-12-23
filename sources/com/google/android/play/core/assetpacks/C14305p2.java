package com.google.android.play.core.assetpacks;

import androidx.appcompat.app.C0262r;
import java.io.File;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;

/* renamed from: com.google.android.play.core.assetpacks.p2 */
public final class C14305p2 {

    /* renamed from: b */
    public static final C0262r f35993b = new C0262r("VerifySliceTaskHandler");

    /* renamed from: a */
    public final C14243a0 f35994a;

    public C14305p2(C14243a0 a0Var) {
        this.f35994a = a0Var;
    }

    /* renamed from: a */
    public final void mo42881a(C14301o2 o2Var) {
        File k = this.f35994a.mo42794k(o2Var.f35972d, o2Var.f35934b, o2Var.f35973e, o2Var.f35971c);
        if (k.exists()) {
            try {
                C14243a0 a0Var = this.f35994a;
                String str = o2Var.f35934b;
                int i = o2Var.f35971c;
                long j = o2Var.f35972d;
                String str2 = o2Var.f35973e;
                a0Var.getClass();
                File file = new File(new File(new File(a0Var.mo42788c(i, j, str), "_slices"), "_metadata"), str2);
                if (file.exists()) {
                    try {
                        if (C14256d1.m35492j(C14297n2.m35571a(k, file)).equals(o2Var.f35974f)) {
                            f35993b.mo977d("Verification of slice %s of pack %s successful.", o2Var.f35973e, o2Var.f35934b);
                            File l = this.f35994a.mo42795l(o2Var.f35972d, o2Var.f35934b, o2Var.f35973e, o2Var.f35971c);
                            if (!l.exists()) {
                                l.mkdirs();
                            }
                            if (!k.renameTo(l)) {
                                throw new zzck(String.format("Failed to move slice %s after verification.", new Object[]{o2Var.f35973e}), o2Var.f35933a);
                            }
                            return;
                        }
                        throw new zzck(String.format("Verification failed for slice %s.", new Object[]{o2Var.f35973e}), o2Var.f35933a);
                    } catch (NoSuchAlgorithmException e) {
                        throw new zzck("SHA256 algorithm not supported.", e, o2Var.f35933a);
                    } catch (IOException e2) {
                        throw new zzck(String.format("Could not digest file during verification for slice %s.", new Object[]{o2Var.f35973e}), e2, o2Var.f35933a);
                    }
                } else {
                    throw new zzck(String.format("Cannot find metadata files for slice %s.", new Object[]{o2Var.f35973e}), o2Var.f35933a);
                }
            } catch (IOException e3) {
                throw new zzck(String.format("Could not reconstruct slice archive during verification for slice %s.", new Object[]{o2Var.f35973e}), e3, o2Var.f35933a);
            }
        } else {
            throw new zzck(String.format("Cannot find unverified files for slice %s.", new Object[]{o2Var.f35973e}), o2Var.f35933a);
        }
    }
}
