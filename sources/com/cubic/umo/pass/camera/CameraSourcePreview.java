package com.cubic.umo.pass.camera;

import android.content.Context;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.ViewGroup;

public class CameraSourcePreview extends ViewGroup {

    /* renamed from: b */
    public final Context f7829b;

    /* renamed from: c */
    public final SurfaceView f7830c;

    /* renamed from: com.cubic.umo.pass.camera.CameraSourcePreview$a */
    public class C2238a implements SurfaceHolder.Callback {
        public C2238a() {
        }

        public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        }

        public final void surfaceCreated(SurfaceHolder surfaceHolder) {
            CameraSourcePreview.this.getClass();
        }

        public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            CameraSourcePreview.this.getClass();
        }
    }

    public CameraSourcePreview(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7829b = context;
        SurfaceView surfaceView = new SurfaceView(context);
        this.f7830c = surfaceView;
        surfaceView.getHolder().addCallback(new C2238a());
        addView(surfaceView);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0013, code lost:
        if (r5 == 1) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onLayout(boolean r5, int r6, int r7, int r8, int r9) {
        /*
            r4 = this;
            android.content.Context r5 = r4.f7829b
            android.content.res.Resources r5 = r5.getResources()
            android.content.res.Configuration r5 = r5.getConfiguration()
            int r5 = r5.orientation
            r0 = 0
            r1 = 2
            if (r5 != r1) goto L_0x0012
        L_0x0010:
            r2 = 0
            goto L_0x0015
        L_0x0012:
            r2 = 1
            if (r5 != r2) goto L_0x0010
        L_0x0015:
            r5 = 320(0x140, float:4.48E-43)
            r3 = 240(0xf0, float:3.36E-43)
            if (r2 == 0) goto L_0x001f
            r5 = 240(0xf0, float:3.36E-43)
            r3 = 320(0x140, float:4.48E-43)
        L_0x001f:
            float r5 = (float) r5
            float r2 = (float) r3
            float r5 = r5 / r2
            int r8 = r8 - r6
            int r9 = r9 - r7
            float r6 = (float) r8
            float r7 = (float) r9
            float r2 = r6 / r7
            int r2 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r2 <= 0) goto L_0x0039
            float r5 = r5 * r7
            float r5 = r5 - r6
            int r5 = (int) r5
            int r5 = r5 / r1
            android.view.SurfaceView r6 = r4.f7830c
            int r7 = -r5
            int r8 = r8 + r5
            r6.layout(r7, r0, r8, r9)
            goto L_0x0044
        L_0x0039:
            float r6 = r6 / r5
            float r6 = r6 - r7
            int r5 = (int) r6
            int r5 = r5 / r1
            android.view.SurfaceView r6 = r4.f7830c
            int r7 = -r5
            int r9 = r9 + r5
            r6.layout(r0, r7, r8, r9)
        L_0x0044:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cubic.umo.pass.camera.CameraSourcePreview.onLayout(boolean, int, int, int, int):void");
    }
}
