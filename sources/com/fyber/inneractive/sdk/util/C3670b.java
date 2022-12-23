package com.fyber.inneractive.sdk.util;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.renderscript.RSRuntimeException;
import com.appboy.support.ValidationUtils;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.reflect.Array;

/* renamed from: com.fyber.inneractive.sdk.util.b */
public class C3670b {
    /* renamed from: a */
    public static Bitmap m9912a(Context context, Bitmap bitmap, C3674c cVar) {
        boolean z;
        Bitmap bitmap2;
        int i = cVar.f12829a;
        int i2 = cVar.f12832d;
        int i3 = i / i2;
        int i4 = cVar.f12830b / i2;
        int[] iArr = {i3, i4};
        int i5 = 0;
        while (true) {
            if (i5 >= 2) {
                z = false;
                break;
            } else if (iArr[i5] == 0) {
                z = true;
                break;
            } else {
                i5++;
            }
        }
        if (z) {
            return null;
        }
        Bitmap createBitmap = Bitmap.createBitmap(i3, i4, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        float f = 1.0f / ((float) cVar.f12832d);
        canvas.scale(f, f);
        Paint paint = new Paint();
        paint.setFlags(3);
        paint.setColorFilter(new PorterDuffColorFilter(0, PorterDuff.Mode.SRC_ATOP));
        canvas.drawBitmap(bitmap, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, paint);
        try {
            bitmap2 = m9911a(context, createBitmap, cVar.f12831c);
        } catch (RSRuntimeException unused) {
            bitmap2 = m9913a(createBitmap, cVar.f12831c, true);
        }
        if (cVar.f12832d == 1) {
            return bitmap2;
        }
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap2, cVar.f12829a, cVar.f12830b, true);
        bitmap2.recycle();
        return createScaledBitmap;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: android.renderscript.RenderScript} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: android.renderscript.Allocation} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: android.renderscript.RenderScript} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: android.renderscript.Allocation} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: android.renderscript.RenderScript} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: android.renderscript.Allocation} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: android.renderscript.RenderScript} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: android.renderscript.RenderScript} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: android.renderscript.ScriptIntrinsicBlur} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: android.renderscript.RenderScript} */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0061  */
    @android.annotation.TargetApi(18)
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap m9911a(android.content.Context r5, android.graphics.Bitmap r6, int r7) throws android.renderscript.RSRuntimeException {
        /*
            r0 = 0
            android.renderscript.RenderScript r5 = android.renderscript.RenderScript.create(r5)     // Catch:{ all -> 0x004c }
            android.renderscript.RenderScript$RSMessageHandler r1 = new android.renderscript.RenderScript$RSMessageHandler     // Catch:{ all -> 0x0046 }
            r1.<init>()     // Catch:{ all -> 0x0046 }
            r5.setMessageHandler(r1)     // Catch:{ all -> 0x0046 }
            android.renderscript.Allocation$MipmapControl r1 = android.renderscript.Allocation.MipmapControl.MIPMAP_NONE     // Catch:{ all -> 0x0046 }
            r2 = 1
            android.renderscript.Allocation r1 = android.renderscript.Allocation.createFromBitmap(r5, r6, r1, r2)     // Catch:{ all -> 0x0046 }
            android.renderscript.Type r2 = r1.getType()     // Catch:{ all -> 0x0043 }
            android.renderscript.Allocation r2 = android.renderscript.Allocation.createTyped(r5, r2)     // Catch:{ all -> 0x0043 }
            android.renderscript.Element r3 = android.renderscript.Element.U8_4(r5)     // Catch:{ all -> 0x003e }
            android.renderscript.ScriptIntrinsicBlur r0 = android.renderscript.ScriptIntrinsicBlur.create(r5, r3)     // Catch:{ all -> 0x003e }
            r0.setInput(r1)     // Catch:{ all -> 0x003e }
            float r7 = (float) r7     // Catch:{ all -> 0x003e }
            r0.setRadius(r7)     // Catch:{ all -> 0x003e }
            r0.forEach(r2)     // Catch:{ all -> 0x003e }
            r2.copyTo(r6)     // Catch:{ all -> 0x003e }
            r5.destroy()
            r1.destroy()
            r2.destroy()
            r0.destroy()
            return r6
        L_0x003e:
            r6 = move-exception
            r4 = r0
            r0 = r5
            r5 = r4
            goto L_0x0050
        L_0x0043:
            r6 = move-exception
            r2 = r0
            goto L_0x0049
        L_0x0046:
            r6 = move-exception
            r1 = r0
            r2 = r1
        L_0x0049:
            r0 = r5
            r5 = r2
            goto L_0x0050
        L_0x004c:
            r6 = move-exception
            r5 = r0
            r1 = r5
            r2 = r1
        L_0x0050:
            if (r0 == 0) goto L_0x0055
            r0.destroy()
        L_0x0055:
            if (r1 == 0) goto L_0x005a
            r1.destroy()
        L_0x005a:
            if (r2 == 0) goto L_0x005f
            r2.destroy()
        L_0x005f:
            if (r5 == 0) goto L_0x0064
            r5.destroy()
        L_0x0064:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.util.C3670b.m9911a(android.content.Context, android.graphics.Bitmap, int):android.graphics.Bitmap");
    }

    /* renamed from: a */
    public static Bitmap m9913a(Bitmap bitmap, int i, boolean z) {
        Bitmap bitmap2;
        int[] iArr;
        int i2 = i;
        if (z) {
            bitmap2 = bitmap;
        } else {
            bitmap2 = bitmap.copy(bitmap.getConfig(), true);
        }
        if (i2 < 1) {
            return null;
        }
        int width = bitmap2.getWidth();
        int height = bitmap2.getHeight();
        int i3 = width * height;
        int[] iArr2 = new int[i3];
        bitmap2.getPixels(iArr2, 0, width, 0, 0, width, height);
        int i4 = width - 1;
        int i5 = height - 1;
        int i6 = i2 + i2 + 1;
        int[] iArr3 = new int[i3];
        int[] iArr4 = new int[i3];
        int[] iArr5 = new int[i3];
        int[] iArr6 = new int[Math.max(width, height)];
        int i7 = (i6 + 1) >> 1;
        int i8 = i7 * i7;
        int i9 = i8 * 256;
        int[] iArr7 = new int[i9];
        for (int i11 = 0; i11 < i9; i11++) {
            iArr7[i11] = i11 / i8;
        }
        int[] iArr8 = new int[2];
        iArr8[1] = 3;
        iArr8[0] = i6;
        int[][] iArr9 = (int[][]) Array.newInstance(Integer.TYPE, iArr8);
        int i12 = i2 + 1;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (i13 < height) {
            Bitmap bitmap3 = bitmap2;
            int i16 = height;
            int i17 = 0;
            int i18 = 0;
            int i19 = 0;
            int i21 = 0;
            int i22 = 0;
            int i23 = 0;
            int i24 = 0;
            int i25 = 0;
            int i26 = -i2;
            int i27 = 0;
            while (i26 <= i2) {
                int i28 = i5;
                int[] iArr10 = iArr6;
                int i29 = iArr2[Math.min(i4, Math.max(i26, 0)) + i14];
                int[] iArr11 = iArr9[i26 + i2];
                iArr11[0] = (i29 & 16711680) >> 16;
                iArr11[1] = (i29 & 65280) >> 8;
                iArr11[2] = i29 & ValidationUtils.APPBOY_STRING_MAX_LENGTH;
                int abs = i12 - Math.abs(i26);
                int i31 = iArr11[0];
                i18 = (i31 * abs) + i18;
                int i32 = iArr11[1];
                i17 = (i32 * abs) + i17;
                int i33 = iArr11[2];
                i27 += abs * i33;
                if (i26 > 0) {
                    i25 += i31;
                    i24 += i32;
                    i23 += i33;
                } else {
                    i22 += i31;
                    i21 += i32;
                    i19 += i33;
                }
                i26++;
                i5 = i28;
                iArr6 = iArr10;
            }
            int i34 = i5;
            int[] iArr12 = iArr6;
            int i35 = i2;
            int i36 = i27;
            int i37 = 0;
            while (i37 < width) {
                iArr3[i14] = iArr7[i18];
                iArr4[i14] = iArr7[i17];
                iArr5[i14] = iArr7[i36];
                int i38 = i18 - i22;
                int i39 = i17 - i21;
                int i41 = i36 - i19;
                int[] iArr13 = iArr9[((i35 - i2) + i6) % i6];
                int i42 = i22 - iArr13[0];
                int i43 = i21 - iArr13[1];
                int i44 = i19 - iArr13[2];
                if (i13 == 0) {
                    iArr = iArr7;
                    iArr12[i37] = Math.min(i37 + i2 + 1, i4);
                } else {
                    iArr = iArr7;
                }
                int i45 = iArr2[i15 + iArr12[i37]];
                int i46 = (i45 & 16711680) >> 16;
                iArr13[0] = i46;
                int i47 = (i45 & 65280) >> 8;
                iArr13[1] = i47;
                int i48 = i45 & ValidationUtils.APPBOY_STRING_MAX_LENGTH;
                iArr13[2] = i48;
                int i49 = i25 + i46;
                int i51 = i24 + i47;
                int i52 = i23 + i48;
                i18 = i38 + i49;
                i17 = i39 + i51;
                i36 = i41 + i52;
                i35 = (i35 + 1) % i6;
                int[] iArr14 = iArr9[i35 % i6];
                int i53 = iArr14[0];
                i22 = i42 + i53;
                int i54 = iArr14[1];
                i21 = i43 + i54;
                int i55 = iArr14[2];
                i19 = i44 + i55;
                i25 = i49 - i53;
                i24 = i51 - i54;
                i23 = i52 - i55;
                i14++;
                i37++;
                iArr7 = iArr;
            }
            int[] iArr15 = iArr7;
            i15 += width;
            i13++;
            bitmap2 = bitmap3;
            height = i16;
            i5 = i34;
            iArr6 = iArr12;
        }
        Bitmap bitmap4 = bitmap2;
        int i56 = i5;
        int[] iArr16 = iArr6;
        int i57 = height;
        int[] iArr17 = iArr7;
        int i58 = 0;
        while (i58 < width) {
            int i59 = -i2;
            int i61 = i6;
            int[] iArr18 = iArr2;
            int i62 = 0;
            int i63 = 0;
            int i64 = 0;
            int i65 = 0;
            int i66 = 0;
            int i67 = 0;
            int i68 = 0;
            int i69 = i59;
            int i71 = i59 * width;
            int i72 = 0;
            int i73 = 0;
            while (i69 <= i2) {
                int i74 = width;
                int max = Math.max(0, i71) + i58;
                int[] iArr19 = iArr9[i69 + i2];
                iArr19[0] = iArr3[max];
                iArr19[1] = iArr4[max];
                iArr19[2] = iArr5[max];
                int abs2 = i12 - Math.abs(i69);
                i62 = (iArr3[max] * abs2) + i62;
                i73 = (iArr4[max] * abs2) + i73;
                i72 = (iArr5[max] * abs2) + i72;
                if (i69 > 0) {
                    i66 += iArr19[0];
                    i67 += iArr19[1];
                    i68 += iArr19[2];
                } else {
                    i65 += iArr19[0];
                    i64 += iArr19[1];
                    i63 += iArr19[2];
                }
                int i75 = i56;
                if (i69 < i75) {
                    i71 += i74;
                }
                i69++;
                i56 = i75;
                width = i74;
            }
            int i76 = width;
            int i77 = i56;
            int i78 = i2;
            int i79 = i58;
            int i81 = i73;
            int i82 = i57;
            int i83 = i72;
            int i84 = 0;
            while (i84 < i82) {
                iArr18[i79] = (iArr18[i79] & -16777216) | (iArr17[i62] << 16) | (iArr17[i81] << 8) | iArr17[i83];
                int i85 = i62 - i65;
                int i86 = i81 - i64;
                int i87 = i83 - i63;
                int[] iArr20 = iArr9[((i78 - i2) + i61) % i61];
                int i88 = i65 - iArr20[0];
                int i89 = i64 - iArr20[1];
                int i91 = i63 - iArr20[2];
                if (i58 == 0) {
                    iArr16[i84] = Math.min(i84 + i12, i77) * i76;
                }
                int i92 = iArr16[i84] + i58;
                int i93 = iArr3[i92];
                iArr20[0] = i93;
                int i94 = iArr4[i92];
                iArr20[1] = i94;
                int i95 = iArr5[i92];
                iArr20[2] = i95;
                int i96 = i66 + i93;
                int i97 = i67 + i94;
                int i98 = i68 + i95;
                i62 = i85 + i96;
                i81 = i86 + i97;
                i83 = i87 + i98;
                i78 = (i78 + 1) % i61;
                int[] iArr21 = iArr9[i78];
                int i99 = iArr21[0];
                i65 = i88 + i99;
                int i100 = iArr21[1];
                i64 = i89 + i100;
                int i101 = iArr21[2];
                i63 = i91 + i101;
                i66 = i96 - i99;
                i67 = i97 - i100;
                i68 = i98 - i101;
                i79 += i76;
                i84++;
                i2 = i;
            }
            i58++;
            i2 = i;
            i56 = i77;
            i57 = i82;
            i6 = i61;
            iArr2 = iArr18;
            width = i76;
        }
        int i102 = width;
        bitmap4.setPixels(iArr2, 0, i102, 0, 0, i102, i57);
        return bitmap4;
    }
}
