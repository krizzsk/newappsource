package p531he;

import android.os.Process;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: he.d */
public final class C17393d {

    /* renamed from: a */
    public static final AtomicLong f44802a = new AtomicLong(0);

    /* renamed from: b */
    public static String f44803b;

    public C17393d(C17390b0 b0Var) {
        String str;
        long time = new Date().getTime();
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.putInt((int) (time / 1000));
        allocate.order(ByteOrder.BIG_ENDIAN);
        allocate.position(0);
        byte[] array = allocate.array();
        byte[] a = m43443a(time % 1000);
        byte[] a2 = m43443a(f44802a.incrementAndGet());
        byte[] a3 = m43443a((long) Integer.valueOf(Process.myPid()).shortValue());
        byte[] bArr = {array[0], array[1], array[2], array[3], a[0], a[1], a2[0], a2[1], a3[0], a3[1]};
        byte[] bytes = b0Var.mo49864c().getBytes();
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-1");
            instance.update(bytes);
            str = CommonUtils.m35970h(instance.digest());
        } catch (NoSuchAlgorithmException unused) {
            str = "";
        }
        String h = CommonUtils.m35970h(bArr);
        Locale locale = Locale.US;
        f44803b = String.format(locale, "%s%s%s%s", new Object[]{h.substring(0, 12), h.substring(12, 16), h.subSequence(16, 20), str.substring(0, 12)}).toUpperCase(locale);
    }

    /* renamed from: a */
    public static byte[] m43443a(long j) {
        ByteBuffer allocate = ByteBuffer.allocate(2);
        allocate.putShort((short) ((int) j));
        allocate.order(ByteOrder.BIG_ENDIAN);
        allocate.position(0);
        return allocate.array();
    }

    public final String toString() {
        return f44803b;
    }
}
