package com.google.android.gms.internal.ads;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.CountDownLatch;

final class zzamq implements Runnable {
    private zzamq() {
    }

    public /* synthetic */ zzamq(zzamp zzamp) {
    }

    public final void run() {
        CountDownLatch countDownLatch;
        try {
            zzamr.zzc = MessageDigest.getInstance("MD5");
            countDownLatch = zzamr.zzb;
        } catch (NoSuchAlgorithmException unused) {
            countDownLatch = zzamr.zzb;
        } catch (Throwable th) {
            zzamr.zzb.countDown();
            throw th;
        }
        countDownLatch.countDown();
    }
}
