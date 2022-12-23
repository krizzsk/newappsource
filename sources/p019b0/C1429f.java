package p019b0;

import android.annotation.SuppressLint;
import android.hardware.camera2.CaptureRequest;
import p001a0.C0022m;
import p001a0.C0029s;
import p291w.C6956a;

/* renamed from: b0.f */
public final class C1429f {
    @SuppressLint({"NewApi"})
    /* renamed from: a */
    public static void m3820a(int i, C6956a.C6957a aVar) {
        if (((C0029s) C0022m.m93a(C0029s.class)) != null) {
            if (i == 0) {
                aVar.mo23202a(CaptureRequest.CONTROL_ENABLE_ZSL, Boolean.TRUE);
            } else if (i == 1) {
                aVar.mo23202a(CaptureRequest.CONTROL_ENABLE_ZSL, Boolean.FALSE);
            }
        }
    }
}
