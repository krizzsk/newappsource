package com.google.android.gms.internal.ads;

import com.appboy.support.ValidationUtils;
import com.google.android.gms.ads.internal.client.zzay;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

final class zzamr {
    public static boolean zza = false;
    public static final CountDownLatch zzb = new CountDownLatch(1);
    /* access modifiers changed from: private */
    public static MessageDigest zzc;
    private static final Object zzd = new Object();
    private static final Object zze = new Object();

    public static String zza(zzaly zzaly, String str) throws GeneralSecurityException, UnsupportedEncodingException {
        byte[] bArr;
        byte[] bArr2;
        byte[] zzau = zzaly.zzau();
        if (((Boolean) zzay.zzc().zzb(zzbhy.zzct)).booleanValue()) {
            Vector zzb2 = zzb(zzau, ValidationUtils.APPBOY_STRING_MAX_LENGTH);
            if (zzb2 == null || zzb2.size() == 0) {
                bArr = zzg(zzf(4096).zzau(), str, true);
            } else {
                zzamk zza2 = zzaml.zza();
                int size = zzb2.size();
                for (int i = 0; i < size; i++) {
                    zza2.zza(zzgjg.zzv(zzg((byte[]) zzb2.get(i), str, false)));
                }
                zza2.zzb(zzgjg.zzv(zze(zzau)));
                bArr = ((zzaml) zza2.zzaj()).zzau();
            }
        } else if (zzapd.zza != null) {
            if (str != null) {
                bArr2 = str.getBytes();
            } else {
                bArr2 = new byte[0];
            }
            byte[] zza3 = zzapd.zza.zza(zzau, bArr2);
            zzamk zza4 = zzaml.zza();
            zza4.zza(zzgjg.zzv(zza3));
            zza4.zzc(3);
            bArr = ((zzaml) zza4.zzaj()).zzau();
        } else {
            throw new GeneralSecurityException();
        }
        return zzamn.zza(bArr, true);
    }

    public static Vector zzb(byte[] bArr, int i) {
        int length;
        if (bArr == null || (length = bArr.length) <= 0) {
            return null;
        }
        int i2 = (length + 254) / ValidationUtils.APPBOY_STRING_MAX_LENGTH;
        Vector vector = new Vector();
        int i3 = 0;
        while (i3 < i2) {
            int i4 = i3 * ValidationUtils.APPBOY_STRING_MAX_LENGTH;
            try {
                int length2 = bArr.length;
                if (length2 - i4 > 255) {
                    length2 = i4 + ValidationUtils.APPBOY_STRING_MAX_LENGTH;
                }
                vector.add(Arrays.copyOfRange(bArr, i4, length2));
                i3++;
            } catch (IndexOutOfBoundsException unused) {
                return null;
            }
        }
        return vector;
    }

    public static void zzd() {
        synchronized (zze) {
            if (!zza) {
                zza = true;
                new Thread(new zzamq((zzamp) null)).start();
            }
        }
    }

    public static byte[] zze(byte[] bArr) throws NoSuchAlgorithmException {
        byte[] digest;
        synchronized (zzd) {
            zzd();
            MessageDigest messageDigest = null;
            try {
                if (zzb.await(2, TimeUnit.SECONDS)) {
                    MessageDigest messageDigest2 = zzc;
                    if (messageDigest2 != null) {
                        messageDigest = messageDigest2;
                    }
                }
            } catch (InterruptedException unused) {
            }
            if (messageDigest != null) {
                messageDigest.reset();
                messageDigest.update(bArr);
                digest = zzc.digest();
            } else {
                throw new NoSuchAlgorithmException("Cannot compute hash");
            }
        }
        return digest;
    }

    public static zzaly zzf(int i) {
        zzali zza2 = zzaly.zza();
        zza2.zzA(4096);
        return (zzaly) zza2.zzaj();
    }

    private static byte[] zzg(byte[] bArr, String str, boolean z) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        int i;
        byte[] bArr2;
        if (true != z) {
            i = ValidationUtils.APPBOY_STRING_MAX_LENGTH;
        } else {
            i = 239;
        }
        if (bArr.length > i) {
            bArr = zzf(4096).zzau();
        }
        int length = bArr.length;
        if (length < i) {
            byte[] bArr3 = new byte[(i - length)];
            new SecureRandom().nextBytes(bArr3);
            bArr2 = ByteBuffer.allocate(i + 1).put((byte) length).put(bArr).put(bArr3).array();
        } else {
            bArr2 = ByteBuffer.allocate(i + 1).put((byte) length).put(bArr).array();
        }
        if (z) {
            bArr2 = ByteBuffer.allocate(256).put(zze(bArr2)).put(bArr2).array();
        }
        byte[] bArr4 = new byte[256];
        zzams[] zzamsArr = new zzanr().zzcG;
        int length2 = zzamsArr.length;
        for (int i2 = 0; i2 < 12; i2++) {
            zzamsArr[i2].zza(bArr2, bArr4);
        }
        if (str != null && str.length() > 0) {
            if (str.length() > 32) {
                str = str.substring(0, 32);
            }
            new zzgin(str.getBytes("UTF-8")).zza(bArr4);
        }
        return bArr4;
    }
}
