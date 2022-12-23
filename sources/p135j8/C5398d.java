package p135j8;

import android.app.Activity;
import android.view.View;
import android.view.Window;
import java.util.Arrays;
import mf0.C24362h;
import p262t8.C6606a;

/* renamed from: j8.d */
public final class C5398d {

    /* renamed from: a */
    public static final /* synthetic */ int f17731a = 0;

    static {
        new C5398d();
    }

    /* renamed from: a */
    public static final String m13500a(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer();
        int length = bArr.length;
        int i = 0;
        while (i < length) {
            byte b = bArr[i];
            i++;
            String format = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b)}, 1));
            C24362h.m61210e(format, "java.lang.String.format(format, *args)");
            stringBuffer.append(format);
        }
        String stringBuffer2 = stringBuffer.toString();
        C24362h.m61210e(stringBuffer2, "sb.toString()");
        return stringBuffer2;
    }

    /* renamed from: b */
    public static final View m13501b(Activity activity) {
        Class<C5398d> cls = C5398d.class;
        if (C6606a.m15601b(cls) || activity == null) {
            return null;
        }
        try {
            Window window = activity.getWindow();
            if (window == null) {
                return null;
            }
            return window.getDecorView().getRootView();
        } catch (Exception unused) {
            return null;
        } catch (Throwable th) {
            C6606a.m15600a(cls, th);
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x005f, code lost:
        if (uh0.C25081h.m62835F(r0, "generic") == false) goto L_0x0061;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean m13502c() {
        /*
            java.lang.String r0 = android.os.Build.FINGERPRINT
            java.lang.String r1 = "FINGERPRINT"
            mf0.C24362h.m61210e(r0, r1)
            java.lang.String r1 = "generic"
            boolean r2 = uh0.C25081h.m62835F(r0, r1)
            r3 = 0
            if (r2 != 0) goto L_0x0069
            java.lang.String r2 = "unknown"
            boolean r0 = uh0.C25081h.m62835F(r0, r2)
            if (r0 != 0) goto L_0x0069
            java.lang.String r0 = android.os.Build.MODEL
            java.lang.String r2 = "MODEL"
            mf0.C24362h.m61210e(r0, r2)
            java.lang.String r2 = "google_sdk"
            boolean r4 = kotlin.text.C24179b.m60559G(r0, r2, r3)
            if (r4 != 0) goto L_0x0069
            java.lang.String r4 = "Emulator"
            boolean r4 = kotlin.text.C24179b.m60559G(r0, r4, r3)
            if (r4 != 0) goto L_0x0069
            java.lang.String r4 = "Android SDK built for x86"
            boolean r0 = kotlin.text.C24179b.m60559G(r0, r4, r3)
            if (r0 != 0) goto L_0x0069
            java.lang.String r0 = android.os.Build.MANUFACTURER
            java.lang.String r4 = "MANUFACTURER"
            mf0.C24362h.m61210e(r0, r4)
            java.lang.String r4 = "Genymotion"
            boolean r0 = kotlin.text.C24179b.m60559G(r0, r4, r3)
            if (r0 != 0) goto L_0x0069
            java.lang.String r0 = android.os.Build.BRAND
            java.lang.String r4 = "BRAND"
            mf0.C24362h.m61210e(r0, r4)
            boolean r0 = uh0.C25081h.m62835F(r0, r1)
            if (r0 == 0) goto L_0x0061
            java.lang.String r0 = android.os.Build.DEVICE
            java.lang.String r4 = "DEVICE"
            mf0.C24362h.m61210e(r0, r4)
            boolean r0 = uh0.C25081h.m62835F(r0, r1)
            if (r0 != 0) goto L_0x0069
        L_0x0061:
            java.lang.String r0 = android.os.Build.PRODUCT
            boolean r0 = mf0.C24362h.m61206a(r2, r0)
            if (r0 == 0) goto L_0x006a
        L_0x0069:
            r3 = 1
        L_0x006a:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p135j8.C5398d.m13502c():boolean");
    }
}
