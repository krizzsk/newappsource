package com.dlazaro66.qrcodereaderview;

import android.content.Context;
import android.graphics.Point;
import android.graphics.PointF;
import android.hardware.Camera;
import android.os.AsyncTask;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.WindowManager;
import com.google.zxing.DecodeHintType;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.Map;
import p360ah.C13460a;
import p360ah.C13462b;
import p360ah.C13464c;
import p385bh.C13625a;
import p389bl.C13637c;
import p558ih.C17599a;
import p935yg.C20724f;
import p935yg.C20725g;

public class QRCodeReaderView extends SurfaceView implements SurfaceHolder.Callback, Camera.PreviewCallback {

    /* renamed from: j */
    public static final /* synthetic */ int f8336j = 0;

    /* renamed from: b */
    public C2263b f8337b;

    /* renamed from: c */
    public C17599a f8338c;

    /* renamed from: d */
    public int f8339d;

    /* renamed from: e */
    public int f8340e;

    /* renamed from: f */
    public C13464c f8341f;

    /* renamed from: g */
    public boolean f8342g = true;

    /* renamed from: h */
    public C2262a f8343h;

    /* renamed from: i */
    public Map<DecodeHintType, Object> f8344i;

    /* renamed from: com.dlazaro66.qrcodereaderview.QRCodeReaderView$a */
    public static class C2262a extends AsyncTask<byte[], Void, C20724f> {

        /* renamed from: a */
        public final WeakReference<QRCodeReaderView> f8345a;

        /* renamed from: b */
        public final WeakReference<Map<DecodeHintType, Object>> f8346b;

        /* renamed from: c */
        public final C13637c f8347c = new C13637c();

        public C2262a(QRCodeReaderView qRCodeReaderView, Map<DecodeHintType, Object> map) {
            this.f8345a = new WeakReference<>(qRCodeReaderView);
            this.f8346b = new WeakReference<>(map);
        }

        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x003e */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object doInBackground(java.lang.Object[] r11) {
            /*
                r10 = this;
                byte[][] r11 = (byte[][]) r11
                java.lang.ref.WeakReference<com.dlazaro66.qrcodereaderview.QRCodeReaderView> r0 = r10.f8345a
                java.lang.Object r0 = r0.get()
                com.dlazaro66.qrcodereaderview.QRCodeReaderView r0 = (com.dlazaro66.qrcodereaderview.QRCodeReaderView) r0
                r1 = 0
                if (r0 != 0) goto L_0x000e
                goto L_0x004b
            L_0x000e:
                ah.c r2 = r0.f8341f
                r3 = 0
                r5 = r11[r3]
                int r8 = r0.f8339d
                int r9 = r0.f8340e
                r2.getClass()
                yg.e r11 = new yg.e
                r4 = r11
                r6 = r8
                r7 = r9
                r4.<init>(r5, r6, r7, r8, r9)
                ch.e r2 = new ch.e
                r2.<init>(r11)
                yg.b r11 = new yg.b
                r11.<init>(r2)
                ih.a r2 = r0.f8338c     // Catch:{ ChecksumException -> 0x0044, NotFoundException -> 0x0041, FormatException -> 0x003e }
                java.lang.ref.WeakReference<java.util.Map<com.google.zxing.DecodeHintType, java.lang.Object>> r3 = r10.f8346b     // Catch:{ ChecksumException -> 0x0044, NotFoundException -> 0x0041, FormatException -> 0x003e }
                java.lang.Object r3 = r3.get()     // Catch:{ ChecksumException -> 0x0044, NotFoundException -> 0x0041, FormatException -> 0x003e }
                java.util.Map r3 = (java.util.Map) r3     // Catch:{ ChecksumException -> 0x0044, NotFoundException -> 0x0041, FormatException -> 0x003e }
                yg.f r11 = r2.mo50072a(r11, r3)     // Catch:{ ChecksumException -> 0x0044, NotFoundException -> 0x0041, FormatException -> 0x003e }
                r1 = r11
                goto L_0x0046
            L_0x003c:
                r11 = move-exception
                goto L_0x004c
            L_0x003e:
                int r11 = com.dlazaro66.qrcodereaderview.QRCodeReaderView.f8336j     // Catch:{ all -> 0x003c }
                goto L_0x0046
            L_0x0041:
                int r11 = com.dlazaro66.qrcodereaderview.QRCodeReaderView.f8336j     // Catch:{ all -> 0x003c }
                goto L_0x0046
            L_0x0044:
                int r11 = com.dlazaro66.qrcodereaderview.QRCodeReaderView.f8336j     // Catch:{ all -> 0x003c }
            L_0x0046:
                ih.a r11 = r0.f8338c
                r11.getClass()
            L_0x004b:
                return r1
            L_0x004c:
                ih.a r0 = r0.f8338c
                r0.getClass()
                throw r11
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dlazaro66.qrcodereaderview.QRCodeReaderView.C2262a.doInBackground(java.lang.Object[]):java.lang.Object");
        }

        public final void onPostExecute(Object obj) {
            Orientation orientation;
            boolean z;
            C20725g[] gVarArr;
            PointF pointF;
            C20724f fVar = (C20724f) obj;
            super.onPostExecute(fVar);
            QRCodeReaderView qRCodeReaderView = this.f8345a.get();
            if (qRCodeReaderView != null && fVar != null && qRCodeReaderView.f8337b != null) {
                C20725g[] gVarArr2 = fVar.f52324b;
                int a = qRCodeReaderView.getCameraDisplayOrientation();
                if (a == 90 || a == 270) {
                    orientation = Orientation.PORTRAIT;
                } else {
                    orientation = Orientation.LANDSCAPE;
                }
                Point point = new Point(qRCodeReaderView.getWidth(), qRCodeReaderView.getHeight());
                C13464c cVar = qRCodeReaderView.f8341f;
                Point point2 = cVar.f33323a.f33319c;
                int i = 0;
                if (cVar.f33330h == 1) {
                    z = true;
                } else {
                    z = false;
                }
                this.f8347c.getClass();
                PointF[] pointFArr = new PointF[gVarArr2.length];
                int length = gVarArr2.length;
                int i2 = 0;
                while (i < length) {
                    C20725g gVar = gVarArr2[i];
                    float f = (float) point2.x;
                    float f2 = (float) point2.y;
                    if (orientation == Orientation.PORTRAIT) {
                        gVarArr = gVarArr2;
                        pointF = new PointF((f2 - gVar.f52327b) * (((float) point.x) / f2), gVar.f52326a * (((float) point.y) / f));
                        if (z) {
                            pointF.y = ((float) point.y) - pointF.y;
                        }
                    } else {
                        gVarArr = gVarArr2;
                        if (orientation == Orientation.LANDSCAPE) {
                            float f3 = ((float) point.y) / f2;
                            pointF = new PointF(((float) point.x) - (gVar.f52326a * (((float) point.x) / f)), ((float) point.y) - (gVar.f52327b * f3));
                            if (z) {
                                pointF.x = ((float) point.x) - pointF.x;
                            }
                        } else {
                            pointF = null;
                        }
                    }
                    pointFArr[i2] = pointF;
                    i2++;
                    i++;
                    gVarArr2 = gVarArr;
                }
                qRCodeReaderView.f8337b.mo11839M0(fVar.f52323a);
            }
        }
    }

    /* renamed from: com.dlazaro66.qrcodereaderview.QRCodeReaderView$b */
    public interface C2263b {
        /* renamed from: M0 */
        void mo11839M0(String str);
    }

    static {
        Class<QRCodeReaderView> cls = QRCodeReaderView.class;
    }

    public QRCodeReaderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        boolean z = true;
        if (!isInEditMode()) {
            if (!getContext().getPackageManager().hasSystemFeature("android.hardware.camera") && !getContext().getPackageManager().hasSystemFeature("android.hardware.camera.front")) {
                z = getContext().getPackageManager().hasSystemFeature("android.hardware.camera.any");
            }
            if (z) {
                C13464c cVar = new C13464c(getContext());
                this.f8341f = cVar;
                cVar.f33328f = this;
                if (cVar.mo40370b()) {
                    cVar.f33324b.f33592b.setPreviewCallback(this);
                }
                getHolder().addCallback(this);
                setPreviewCameraId(0);
                return;
            }
            throw new RuntimeException("Error: Camera not found");
        }
    }

    /* access modifiers changed from: private */
    public int getCameraDisplayOrientation() {
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        Camera.getCameraInfo(this.f8341f.f33330h, cameraInfo);
        int rotation = ((WindowManager) getContext().getSystemService("window")).getDefaultDisplay().getRotation();
        int i = 0;
        if (rotation != 0) {
            if (rotation == 1) {
                i = 90;
            } else if (rotation == 2) {
                i = 180;
            } else if (rotation == 3) {
                i = 270;
            }
        }
        if (cameraInfo.facing == 1) {
            return (360 - ((cameraInfo.orientation + i) % 360)) % 360;
        }
        return ((cameraInfo.orientation - i) + 360) % 360;
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C2262a aVar = this.f8343h;
        if (aVar != null) {
            aVar.cancel(true);
            this.f8343h = null;
        }
    }

    public final void onPreviewFrame(byte[] bArr, Camera camera) {
        if (this.f8342g) {
            C2262a aVar = this.f8343h;
            if (aVar == null || !(aVar.getStatus() == AsyncTask.Status.RUNNING || this.f8343h.getStatus() == AsyncTask.Status.PENDING)) {
                C2262a aVar2 = new C2262a(this, this.f8344i);
                this.f8343h = aVar2;
                aVar2.execute(new byte[][]{bArr});
            }
        }
    }

    public void setAutofocusInterval(long j) {
        C13464c cVar = this.f8341f;
        if (cVar != null) {
            cVar.f33331i = j;
            C13460a aVar = cVar.f33325c;
            if (aVar == null) {
                return;
            }
            if (j > 0) {
                aVar.f33310a = j;
                return;
            }
            throw new IllegalArgumentException("AutoFocusInterval must be greater than 0.");
        }
    }

    public void setDecodeHints(Map<DecodeHintType, Object> map) {
        this.f8344i = map;
    }

    public void setOnQRCodeReadListener(C2263b bVar) {
        this.f8337b = bVar;
    }

    public void setPreviewCameraId(int i) {
        C13464c cVar = this.f8341f;
        synchronized (cVar) {
            cVar.f33330h = i;
        }
    }

    public void setQRDecodingEnabled(boolean z) {
        this.f8342g = z;
    }

    public void setTorchEnabled(boolean z) {
        boolean z2;
        String flashMode;
        C13464c cVar = this.f8341f;
        if (cVar != null) {
            synchronized (cVar) {
                C13625a aVar = cVar.f33324b;
                if (aVar != null) {
                    C13462b bVar = cVar.f33323a;
                    Camera camera = aVar.f33592b;
                    bVar.getClass();
                    boolean z3 = true;
                    if (camera == null || camera.getParameters() == null || (flashMode = camera.getParameters().getFlashMode()) == null || (!"on".equals(flashMode) && !"torch".equals(flashMode))) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if (z != z2) {
                        C13460a aVar2 = cVar.f33325c;
                        if (aVar2 == null) {
                            z3 = false;
                        }
                        if (z3) {
                            aVar2.mo40363c();
                            cVar.f33325c = null;
                        }
                        C13462b bVar2 = cVar.f33323a;
                        Camera camera2 = aVar.f33592b;
                        bVar2.getClass();
                        C13462b.m33782e(z, camera2);
                        if (z3) {
                            C13460a aVar3 = new C13460a(aVar.f33592b);
                            cVar.f33325c = aVar3;
                            aVar3.mo40362b();
                        }
                    }
                }
            }
        }
    }

    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        if (surfaceHolder.getSurface() != null) {
            C13464c cVar = this.f8341f;
            Point point = cVar.f33323a.f33319c;
            if (point != null) {
                this.f8339d = point.x;
                this.f8340e = point.y;
                cVar.mo40373e();
                C13464c cVar2 = this.f8341f;
                cVar2.f33328f = this;
                if (cVar2.mo40370b()) {
                    cVar2.f33324b.f33592b.setPreviewCallback(this);
                }
                C13464c cVar3 = this.f8341f;
                int cameraDisplayOrientation = getCameraDisplayOrientation();
                cVar3.f33329g = cameraDisplayOrientation;
                if (cVar3.mo40370b()) {
                    cVar3.f33324b.f33592b.setDisplayOrientation(cameraDisplayOrientation);
                }
                this.f8341f.mo40372d();
            }
        }
    }

    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        try {
            this.f8341f.mo40371c(surfaceHolder, getWidth(), getHeight());
        } catch (IOException | RuntimeException e) {
            e.getMessage();
            this.f8341f.mo40369a();
        }
        try {
            this.f8338c = new C17599a();
            this.f8341f.mo40372d();
        } catch (Exception e2) {
            e2.getMessage();
            this.f8341f.mo40369a();
        }
    }

    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        C13464c cVar = this.f8341f;
        cVar.f33328f = null;
        if (cVar.mo40370b()) {
            cVar.f33324b.f33592b.setPreviewCallback((Camera.PreviewCallback) null);
        }
        this.f8341f.mo40373e();
        this.f8341f.mo40369a();
    }
}
