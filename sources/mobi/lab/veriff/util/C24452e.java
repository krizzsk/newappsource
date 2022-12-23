package mobi.lab.veriff.util;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.PowerManager;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import mobi.lab.veriff.data.C24429e;

/* renamed from: mobi.lab.veriff.util.e */
public class C24452e {

    /* renamed from: a */
    private static final C24465j f61889a = C24465j.m61536a(C24452e.class);

    /* renamed from: a */
    public static boolean m61504a(File file) {
        if (file == null || !file.exists()) {
            return false;
        }
        C24465j jVar = f61889a;
        StringBuilder k = C13555b.m33972k("deleteLocalFile() :: deleting photo file:");
        k.append(file.getAbsolutePath());
        jVar.mo60705d(k.toString());
        boolean delete = file.delete();
        if (delete) {
            jVar.mo60705d("deleteLocalFile() :: photo file deletion successful");
            return delete;
        }
        jVar.mo60705d("deleteLocalFile() :: photo file deletion unsuccessful");
        return delete;
    }

    /* renamed from: a */
    public static void m61503a(PowerManager.WakeLock wakeLock, long j) {
        if (wakeLock == null) {
            f61889a.mo60711w("wakeLock: trying to take a NULL wakelock!");
            return;
        }
        C24465j jVar = f61889a;
        jVar.mo60705d("acquireWakeLock (before): " + wakeLock);
        wakeLock.acquire(j);
        jVar.mo60705d("acquireWakeLock (after): " + wakeLock);
    }

    /* renamed from: a */
    public static void m61502a(PowerManager.WakeLock wakeLock) {
        if (wakeLock != null) {
            try {
                if (wakeLock.isHeld()) {
                    C24465j jVar = f61889a;
                    jVar.mo60705d("releaseWakeLock (before): " + wakeLock);
                    wakeLock.release();
                    jVar.mo60705d("releaseWakeLock (after): " + wakeLock);
                    return;
                }
            } catch (Exception e) {
                f61889a.mo60708e("releaseWakeLock", e);
                return;
            }
        }
        try {
            throw new IOException("Trying to release a NULL wakelock!");
        } catch (IOException e2) {
            f61889a.mo60712w("releaseWakeLock", e2);
        }
    }

    /* renamed from: a */
    public static C24429e[] m61506a(List<String> list) {
        HashSet hashSet = new HashSet(list);
        String[] strArr = (String[]) hashSet.toArray(new String[0]);
        Arrays.sort(strArr);
        C24429e[] eVarArr = new C24429e[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            eVarArr[i] = new C24429e(strArr[i]);
        }
        return eVarArr;
    }

    /* renamed from: a */
    public static byte[] m61505a(Bitmap bitmap, int i, Bitmap.CompressFormat compressFormat) {
        C24465j jVar = f61889a;
        jVar.mo60705d("getByteArrayFromBitmap() called with: bmp = [" + bitmap + "], quality = [" + i + "], format = [" + compressFormat + "]");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(compressFormat, i, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    /* renamed from: a */
    public static void m61501a(Context context) {
        C24465j a = C24465j.m61536a(C24452e.class);
        File file = new File(context.getFilesDir(), "veriff");
        if (file.exists() && file.isDirectory()) {
            for (File file2 : file.listFiles()) {
                StringBuilder k = C13555b.m33972k("Deleting file: ");
                k.append(file2.getPath());
                a.mo60711w(k.toString());
                file2.delete();
            }
        }
    }
}
