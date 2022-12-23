package p304x;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.InputConfiguration;
import android.media.Image;
import android.media.ImageReader;
import android.media.ImageWriter;
import android.os.Build;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.C0627p;
import androidx.camera.core.C0642t;
import androidx.camera.core.impl.SessionConfig;
import com.google.android.play.core.appupdate.C14226d;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Objects;
import p054d0.C4272c;
import p066e0.C4415a0;
import p066e0.C4424e;
import p066e0.C4428g;
import p128j0.C5345a;
import p695od.C18728c;

/* renamed from: x.c2 */
public final class C7034c2 implements C7127z1 {

    /* renamed from: a */
    public final LinkedList f21881a = new LinkedList();

    /* renamed from: b */
    public final LinkedList f21882b = new LinkedList();

    /* renamed from: c */
    public boolean f21883c;

    /* renamed from: d */
    public boolean f21884d;

    /* renamed from: e */
    public boolean f21885e;

    /* renamed from: f */
    public C0642t f21886f;

    /* renamed from: g */
    public C4415a0 f21887g;

    /* renamed from: h */
    public ImageWriter f21888h;

    /* renamed from: x.c2$a */
    public class C7035a extends C4424e {
        public C7035a() {
        }

        /* renamed from: b */
        public final void mo2570b(C4428g gVar) {
            CaptureResult b = gVar.mo19950b();
            if (b != null && (b instanceof TotalCaptureResult)) {
                C7034c2.this.f21882b.add((TotalCaptureResult) b);
            }
        }
    }

    /* renamed from: x.c2$b */
    public class C7036b extends CameraCaptureSession.StateCallback {
        public C7036b() {
        }

        public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        }

        public final void onConfigured(CameraCaptureSession cameraCaptureSession) {
            Surface h = cameraCaptureSession.getInputSurface();
            if (h != null) {
                C7034c2.this.f21888h = C5345a.m13398a(1, h);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x003f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C7034c2(p316y.C7225s r8) {
        /*
            r7 = this;
            r7.<init>()
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            r7.f21881a = r0
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            r7.f21882b = r0
            r0 = 0
            r7.f21883c = r0
            r7.f21884d = r0
            r7.f21885e = r0
            android.hardware.camera2.CameraCharacteristics$Key r1 = android.hardware.camera2.CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES
            java.lang.Object r1 = r8.mo23532a(r1)
            int[] r1 = (int[]) r1
            r2 = 1
            if (r1 == 0) goto L_0x0031
            int r3 = r1.length
            r4 = 0
        L_0x0025:
            if (r4 >= r3) goto L_0x0031
            r5 = r1[r4]
            r6 = 7
            if (r5 != r6) goto L_0x002e
            r1 = 1
            goto L_0x0032
        L_0x002e:
            int r4 = r4 + 1
            goto L_0x0025
        L_0x0031:
            r1 = 0
        L_0x0032:
            r7.f21884d = r1
            r1 = 4
            android.hardware.camera2.CameraCharacteristics$Key r3 = android.hardware.camera2.CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES
            java.lang.Object r8 = r8.mo23532a(r3)
            int[] r8 = (int[]) r8
            if (r8 == 0) goto L_0x004c
            int r3 = r8.length
            r4 = 0
        L_0x0041:
            if (r4 >= r3) goto L_0x004c
            r5 = r8[r4]
            if (r5 != r1) goto L_0x0049
            r0 = 1
            goto L_0x004c
        L_0x0049:
            int r4 = r4 + 1
            goto L_0x0041
        L_0x004c:
            r7.f21885e = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p304x.C7034c2.<init>(y.s):void");
    }

    /* renamed from: a */
    public final void mo23287a(Size size, SessionConfig.C0566b bVar) {
        int i;
        if (!this.f21883c) {
            if (this.f21884d || this.f21885e) {
                LinkedList linkedList = this.f21881a;
                while (!linkedList.isEmpty()) {
                    ((C0627p) linkedList.remove()).close();
                }
                this.f21882b.clear();
                C4415a0 a0Var = this.f21887g;
                if (a0Var != null) {
                    C0642t tVar = this.f21886f;
                    if (tVar != null) {
                        a0Var.mo2453d().addListener(new C7029b1(tVar, 1), C14226d.m35358z0());
                    }
                    a0Var.mo2450a();
                }
                ImageWriter imageWriter = this.f21888h;
                if (imageWriter != null) {
                    imageWriter.close();
                    this.f21888h = null;
                }
                if (this.f21884d) {
                    i = 35;
                } else {
                    i = 34;
                }
                C0642t tVar2 = new C0642t(new C4272c(ImageReader.newInstance(size.getWidth(), size.getHeight(), i, 2)));
                this.f21886f = tVar2;
                tVar2.mo2556a(new C7026a2(this), C14226d.m35357x0());
                C4415a0 a0Var2 = new C4415a0(this.f21886f.getSurface(), new Size(this.f21886f.getWidth(), this.f21886f.getHeight()), i);
                this.f21887g = a0Var2;
                C0642t tVar3 = this.f21886f;
                C18728c<Void> d = a0Var2.mo2453d();
                Objects.requireNonNull(tVar3);
                d.addListener(new C7030b2(tVar3, 0), C14226d.m35358z0());
                C4415a0 a0Var3 = this.f21887g;
                bVar.f1939a.add(a0Var3);
                bVar.f1940b.f1977a.add(a0Var3);
                bVar.mo2458a(new C7035a());
                bVar.mo2459b(new C7036b());
                bVar.f1945g = new InputConfiguration(this.f21886f.getWidth(), this.f21886f.getHeight(), this.f21886f.getImageFormat());
            }
        }
    }

    /* renamed from: b */
    public final C0627p mo23288b() {
        try {
            return (C0627p) this.f21881a.remove();
        } catch (NoSuchElementException unused) {
            return null;
        }
    }

    /* renamed from: c */
    public final boolean mo23289c(C0627p pVar) {
        ImageWriter imageWriter;
        Image image = pVar.getImage();
        if (Build.VERSION.SDK_INT < 23 || (imageWriter = this.f21888h) == null || image == null) {
            return false;
        }
        C5345a.m13400c(imageWriter, image);
        return true;
    }

    /* renamed from: d */
    public final void mo23290d(boolean z) {
        this.f21883c = z;
    }
}
