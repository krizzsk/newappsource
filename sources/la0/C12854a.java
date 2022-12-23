package la0;

import android.opengl.GLSurfaceView;

/* renamed from: la0.a */
public final /* synthetic */ class C12854a implements GLSurfaceView.EGLConfigChooser {
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0082 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final javax.microedition.khronos.egl.EGLConfig chooseConfig(javax.microedition.khronos.egl.EGL10 r15, javax.microedition.khronos.egl.EGLDisplay r16) {
        /*
            r14 = this;
            java.lang.String[] r0 = com.nutiteq.MapView.f24162q
            r0 = 5
            int[][] r1 = new int[r0][]
            r2 = 15
            int[] r2 = new int[r2]
            r2 = {12324, 8, 12323, 8, 12322, 8, 12325, 24, 12326, 0, 12338, 1, 12337, 4, 12344} // fill-array
            r3 = 0
            r1[r3] = r2
            r2 = 11
            int[] r4 = new int[r2]
            r4 = {12324, 8, 12323, 8, 12322, 8, 12325, 24, 12326, 0, 12344} // fill-array
            r5 = 1
            r1[r5] = r4
            int[] r4 = new int[r2]
            r4 = {12324, 5, 12323, 6, 12322, 5, 12325, 24, 12326, 0, 12344} // fill-array
            r6 = 2
            r1[r6] = r4
            int[] r4 = new int[r2]
            r4 = {12324, 8, 12323, 8, 12322, 8, 12325, 16, 12326, 0, 12344} // fill-array
            r6 = 3
            r1[r6] = r4
            int[] r2 = new int[r2]
            r2 = {12324, 5, 12323, 6, 12322, 5, 12325, 16, 12326, 0, 12344} // fill-array
            r4 = 4
            r1[r4] = r2
            java.lang.String r2 = android.os.Build.MODEL
            java.lang.String r2 = android.os.Build.BOARD
            java.lang.String r2 = android.os.Build.PRODUCT
            java.lang.String[] r2 = com.nutiteq.MapView.f24162q
            java.util.List r2 = java.util.Arrays.asList(r2)
            java.lang.String r4 = android.os.Build.BOARD
            boolean r2 = r2.contains(r4)
            r2 = r2 ^ r5
            if (r2 != 0) goto L_0x0048
            java.lang.String r4 = android.os.Build.BOARD
        L_0x0048:
            r4 = 0
        L_0x0049:
            if (r4 >= r0) goto L_0x0085
            if (r2 != 0) goto L_0x0063
            r6 = 0
        L_0x004e:
            int r7 = r6 + 1
            r8 = r1[r4]
            int r9 = r8.length
            if (r7 >= r9) goto L_0x0063
            r6 = r8[r6]
            r9 = 12338(0x3032, float:1.7289E-41)
            if (r6 != r9) goto L_0x0061
            r6 = r8[r7]
            if (r6 <= 0) goto L_0x0061
            r6 = 1
            goto L_0x0064
        L_0x0061:
            r6 = r7
            goto L_0x004e
        L_0x0063:
            r6 = 0
        L_0x0064:
            if (r6 == 0) goto L_0x0067
            goto L_0x0082
        L_0x0067:
            int[] r6 = new int[r5]
            r6[r3] = r3
            javax.microedition.khronos.egl.EGLConfig[] r13 = new javax.microedition.khronos.egl.EGLConfig[r5]
            r9 = r1[r4]
            r11 = 1
            r7 = r15
            r8 = r16
            r10 = r13
            r12 = r6
            boolean r7 = r7.eglChooseConfig(r8, r9, r10, r11, r12)
            if (r7 == 0) goto L_0x0082
            r6 = r6[r3]
            if (r6 <= 0) goto L_0x0082
            r0 = r13[r3]
            return r0
        L_0x0082:
            int r4 = r4 + 1
            goto L_0x0049
        L_0x0085:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "eglChooseConfig failed"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: la0.C12854a.chooseConfig(javax.microedition.khronos.egl.EGL10, javax.microedition.khronos.egl.EGLDisplay):javax.microedition.khronos.egl.EGLConfig");
    }
}
