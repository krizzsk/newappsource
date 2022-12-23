package com.theartofdev.edmodo.cropper;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

public final class CropWindowMoveHandler {

    /* renamed from: a */
    public final float f24440a;

    /* renamed from: b */
    public final float f24441b;

    /* renamed from: c */
    public final float f24442c;

    /* renamed from: d */
    public final float f24443d;

    /* renamed from: e */
    public final Type f24444e;

    /* renamed from: f */
    public final PointF f24445f;

    public enum Type {
        TOP_LEFT,
        TOP_RIGHT,
        BOTTOM_LEFT,
        BOTTOM_RIGHT,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        CENTER
    }

    /* renamed from: com.theartofdev.edmodo.cropper.CropWindowMoveHandler$a */
    public static /* synthetic */ class C8048a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f24446a;

        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|(3:17|18|20)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.theartofdev.edmodo.cropper.CropWindowMoveHandler$Type[] r0 = com.theartofdev.edmodo.cropper.CropWindowMoveHandler.Type.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f24446a = r0
                com.theartofdev.edmodo.cropper.CropWindowMoveHandler$Type r1 = com.theartofdev.edmodo.cropper.CropWindowMoveHandler.Type.TOP_LEFT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f24446a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.theartofdev.edmodo.cropper.CropWindowMoveHandler$Type r1 = com.theartofdev.edmodo.cropper.CropWindowMoveHandler.Type.TOP_RIGHT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f24446a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.theartofdev.edmodo.cropper.CropWindowMoveHandler$Type r1 = com.theartofdev.edmodo.cropper.CropWindowMoveHandler.Type.BOTTOM_LEFT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f24446a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.theartofdev.edmodo.cropper.CropWindowMoveHandler$Type r1 = com.theartofdev.edmodo.cropper.CropWindowMoveHandler.Type.BOTTOM_RIGHT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f24446a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.theartofdev.edmodo.cropper.CropWindowMoveHandler$Type r1 = com.theartofdev.edmodo.cropper.CropWindowMoveHandler.Type.LEFT     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f24446a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.theartofdev.edmodo.cropper.CropWindowMoveHandler$Type r1 = com.theartofdev.edmodo.cropper.CropWindowMoveHandler.Type.TOP     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f24446a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.theartofdev.edmodo.cropper.CropWindowMoveHandler$Type r1 = com.theartofdev.edmodo.cropper.CropWindowMoveHandler.Type.RIGHT     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f24446a     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.theartofdev.edmodo.cropper.CropWindowMoveHandler$Type r1 = com.theartofdev.edmodo.cropper.CropWindowMoveHandler.Type.BOTTOM     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f24446a     // Catch:{ NoSuchFieldError -> 0x006c }
                com.theartofdev.edmodo.cropper.CropWindowMoveHandler$Type r1 = com.theartofdev.edmodo.cropper.CropWindowMoveHandler.Type.CENTER     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.theartofdev.edmodo.cropper.CropWindowMoveHandler.C8048a.<clinit>():void");
        }
    }

    static {
        new Matrix();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0085, code lost:
        r5 = r5 - r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0087, code lost:
        r1 = r5;
        r5 = com.google.android.gms.maps.model.BitmapDescriptorFactory.HUE_RED;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0089, code lost:
        r0.x = r1;
        r0.y = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x008d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0068, code lost:
        r5 = r5 - r7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public CropWindowMoveHandler(com.theartofdev.edmodo.cropper.CropWindowMoveHandler.Type r5, com.theartofdev.edmodo.cropper.C8056d r6, float r7, float r8) {
        /*
            r4 = this;
            r4.<init>()
            android.graphics.PointF r0 = new android.graphics.PointF
            r0.<init>()
            r4.f24445f = r0
            r4.f24444e = r5
            float r1 = r6.f24493c
            float r2 = r6.f24497g
            float r3 = r6.f24501k
            float r2 = r2 / r3
            float r1 = java.lang.Math.max(r1, r2)
            r4.f24440a = r1
            float r1 = r6.f24494d
            float r2 = r6.f24498h
            float r3 = r6.f24502l
            float r2 = r2 / r3
            float r1 = java.lang.Math.max(r1, r2)
            r4.f24441b = r1
            float r1 = r6.f24495e
            float r2 = r6.f24499i
            float r3 = r6.f24501k
            float r2 = r2 / r3
            float r1 = java.lang.Math.min(r1, r2)
            r4.f24442c = r1
            float r1 = r6.f24496f
            float r2 = r6.f24500j
            float r3 = r6.f24502l
            float r2 = r2 / r3
            float r1 = java.lang.Math.min(r1, r2)
            r4.f24443d = r1
            android.graphics.RectF r6 = r6.mo25200a()
            int[] r1 = com.theartofdev.edmodo.cropper.CropWindowMoveHandler.C8048a.f24446a
            int r5 = r5.ordinal()
            r5 = r1[r5]
            r1 = 0
            switch(r5) {
                case 1: goto L_0x007f;
                case 2: goto L_0x0078;
                case 3: goto L_0x0071;
                case 4: goto L_0x006a;
                case 5: goto L_0x0066;
                case 6: goto L_0x0063;
                case 7: goto L_0x0060;
                case 8: goto L_0x005d;
                case 9: goto L_0x0052;
                default: goto L_0x0050;
            }
        L_0x0050:
            r5 = 0
            goto L_0x0087
        L_0x0052:
            float r5 = r6.centerX()
            float r1 = r5 - r7
            float r5 = r6.centerY()
            goto L_0x0085
        L_0x005d:
            float r5 = r6.bottom
            goto L_0x0085
        L_0x0060:
            float r5 = r6.right
            goto L_0x0068
        L_0x0063:
            float r5 = r6.top
            goto L_0x0085
        L_0x0066:
            float r5 = r6.left
        L_0x0068:
            float r5 = r5 - r7
            goto L_0x0087
        L_0x006a:
            float r5 = r6.right
            float r1 = r5 - r7
            float r5 = r6.bottom
            goto L_0x0085
        L_0x0071:
            float r5 = r6.left
            float r1 = r5 - r7
            float r5 = r6.bottom
            goto L_0x0085
        L_0x0078:
            float r5 = r6.right
            float r1 = r5 - r7
            float r5 = r6.top
            goto L_0x0085
        L_0x007f:
            float r5 = r6.left
            float r1 = r5 - r7
            float r5 = r6.top
        L_0x0085:
            float r5 = r5 - r8
            goto L_0x0089
        L_0x0087:
            r1 = r5
            r5 = 0
        L_0x0089:
            r0.x = r1
            r0.y = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.theartofdev.edmodo.cropper.CropWindowMoveHandler.<init>(com.theartofdev.edmodo.cropper.CropWindowMoveHandler$Type, com.theartofdev.edmodo.cropper.d, float, float):void");
    }

    /* renamed from: c */
    public static void m18365c(RectF rectF, RectF rectF2, float f) {
        rectF.inset((rectF.width() - (rectF.height() * f)) / 2.0f, BitmapDescriptorFactory.HUE_RED);
        float f2 = rectF.left;
        float f3 = rectF2.left;
        if (f2 < f3) {
            rectF.offset(f3 - f2, BitmapDescriptorFactory.HUE_RED);
        }
        float f4 = rectF.right;
        float f5 = rectF2.right;
        if (f4 > f5) {
            rectF.offset(f5 - f4, BitmapDescriptorFactory.HUE_RED);
        }
    }

    /* renamed from: f */
    public static void m18366f(RectF rectF, RectF rectF2, float f) {
        rectF.inset(BitmapDescriptorFactory.HUE_RED, (rectF.height() - (rectF.width() / f)) / 2.0f);
        float f2 = rectF.top;
        float f3 = rectF2.top;
        if (f2 < f3) {
            rectF.offset(BitmapDescriptorFactory.HUE_RED, f3 - f2);
        }
        float f4 = rectF.bottom;
        float f5 = rectF2.bottom;
        if (f4 > f5) {
            rectF.offset(BitmapDescriptorFactory.HUE_RED, f5 - f4);
        }
    }

    /* renamed from: a */
    public final void mo25192a(RectF rectF, float f, RectF rectF2, int i, float f2, float f3, boolean z, boolean z2) {
        float f4 = (float) i;
        if (f > f4) {
            f = ((f - f4) / 1.05f) + f4;
            this.f24445f.y -= (f - f4) / 1.1f;
        }
        float f5 = rectF2.bottom;
        if (f > f5) {
            this.f24445f.y -= (f - f5) / 2.0f;
        }
        if (f5 - f < f2) {
            f = f5;
        }
        float f6 = rectF.top;
        float f7 = this.f24441b;
        if (f - f6 < f7) {
            f = f6 + f7;
        }
        float f8 = this.f24443d;
        if (f - f6 > f8) {
            f = f6 + f8;
        }
        if (f5 - f < f2) {
            f = f5;
        }
        if (f3 > BitmapDescriptorFactory.HUE_RED) {
            float f9 = (f - f6) * f3;
            float f11 = this.f24440a;
            if (f9 < f11) {
                f = Math.min(f5, (f11 / f3) + f6);
                f9 = (f - rectF.top) * f3;
            }
            float f12 = this.f24442c;
            if (f9 > f12) {
                f = Math.min(rectF2.bottom, (f12 / f3) + rectF.top);
                f9 = (f - rectF.top) * f3;
            }
            if (!z || !z2) {
                if (z) {
                    float f13 = rectF.right;
                    float f14 = rectF2.left;
                    if (f13 - f9 < f14) {
                        f = Math.min(rectF2.bottom, ((f13 - f14) / f3) + rectF.top);
                        f9 = (f - rectF.top) * f3;
                    }
                }
                if (z2) {
                    float f15 = rectF.left;
                    float f16 = rectF2.right;
                    if (f9 + f15 > f16) {
                        f = Math.min(f, Math.min(rectF2.bottom, ((f16 - f15) / f3) + rectF.top));
                    }
                }
            } else {
                f = Math.min(f, Math.min(rectF2.bottom, (rectF2.width() / f3) + rectF.top));
            }
        }
        rectF.bottom = f;
    }

    /* renamed from: b */
    public final void mo25193b(RectF rectF, float f, RectF rectF2, float f2, float f3, boolean z, boolean z2) {
        if (f < BitmapDescriptorFactory.HUE_RED) {
            f /= 1.05f;
            this.f24445f.x -= f / 1.1f;
        }
        float f4 = rectF2.left;
        if (f < f4) {
            this.f24445f.x -= (f - f4) / 2.0f;
        }
        if (f - f4 < f2) {
            f = f4;
        }
        float f5 = rectF.right;
        float f6 = this.f24440a;
        if (f5 - f < f6) {
            f = f5 - f6;
        }
        float f7 = this.f24442c;
        if (f5 - f > f7) {
            f = f5 - f7;
        }
        if (f - f4 < f2) {
            f = f4;
        }
        if (f3 > BitmapDescriptorFactory.HUE_RED) {
            float f8 = (f5 - f) / f3;
            float f9 = this.f24441b;
            if (f8 < f9) {
                f = Math.max(f4, f5 - (f9 * f3));
                f8 = (rectF.right - f) / f3;
            }
            float f11 = this.f24443d;
            if (f8 > f11) {
                f = Math.max(rectF2.left, rectF.right - (f11 * f3));
                f8 = (rectF.right - f) / f3;
            }
            if (!z || !z2) {
                if (z) {
                    float f12 = rectF.bottom;
                    float f13 = rectF2.top;
                    if (f12 - f8 < f13) {
                        f = Math.max(rectF2.left, rectF.right - ((f12 - f13) * f3));
                        f8 = (rectF.right - f) / f3;
                    }
                }
                if (z2) {
                    float f14 = rectF.top;
                    float f15 = rectF2.bottom;
                    if (f8 + f14 > f15) {
                        f = Math.max(f, Math.max(rectF2.left, rectF.right - ((f15 - f14) * f3)));
                    }
                }
            } else {
                f = Math.max(f, Math.max(rectF2.left, rectF.right - (rectF2.height() * f3)));
            }
        }
        rectF.left = f;
    }

    /* renamed from: d */
    public final void mo25194d(RectF rectF, float f, RectF rectF2, int i, float f2, float f3, boolean z, boolean z2) {
        float f4 = (float) i;
        if (f > f4) {
            f = ((f - f4) / 1.05f) + f4;
            this.f24445f.x -= (f - f4) / 1.1f;
        }
        float f5 = rectF2.right;
        if (f > f5) {
            this.f24445f.x -= (f - f5) / 2.0f;
        }
        if (f5 - f < f2) {
            f = f5;
        }
        float f6 = rectF.left;
        float f7 = this.f24440a;
        if (f - f6 < f7) {
            f = f6 + f7;
        }
        float f8 = this.f24442c;
        if (f - f6 > f8) {
            f = f6 + f8;
        }
        if (f5 - f < f2) {
            f = f5;
        }
        if (f3 > BitmapDescriptorFactory.HUE_RED) {
            float f9 = (f - f6) / f3;
            float f11 = this.f24441b;
            if (f9 < f11) {
                f = Math.min(f5, (f11 * f3) + f6);
                f9 = (f - rectF.left) / f3;
            }
            float f12 = this.f24443d;
            if (f9 > f12) {
                f = Math.min(rectF2.right, (f12 * f3) + rectF.left);
                f9 = (f - rectF.left) / f3;
            }
            if (!z || !z2) {
                if (z) {
                    float f13 = rectF.bottom;
                    float f14 = rectF2.top;
                    if (f13 - f9 < f14) {
                        f = Math.min(rectF2.right, ((f13 - f14) * f3) + rectF.left);
                        f9 = (f - rectF.left) / f3;
                    }
                }
                if (z2) {
                    float f15 = rectF.top;
                    float f16 = rectF2.bottom;
                    if (f9 + f15 > f16) {
                        f = Math.min(f, Math.min(rectF2.right, ((f16 - f15) * f3) + rectF.left));
                    }
                }
            } else {
                f = Math.min(f, Math.min(rectF2.right, (rectF2.height() * f3) + rectF.left));
            }
        }
        rectF.right = f;
    }

    /* renamed from: e */
    public final void mo25195e(RectF rectF, float f, RectF rectF2, float f2, float f3, boolean z, boolean z2) {
        if (f < BitmapDescriptorFactory.HUE_RED) {
            f /= 1.05f;
            this.f24445f.y -= f / 1.1f;
        }
        float f4 = rectF2.top;
        if (f < f4) {
            this.f24445f.y -= (f - f4) / 2.0f;
        }
        if (f - f4 < f2) {
            f = f4;
        }
        float f5 = rectF.bottom;
        float f6 = this.f24441b;
        if (f5 - f < f6) {
            f = f5 - f6;
        }
        float f7 = this.f24443d;
        if (f5 - f > f7) {
            f = f5 - f7;
        }
        if (f - f4 < f2) {
            f = f4;
        }
        if (f3 > BitmapDescriptorFactory.HUE_RED) {
            float f8 = (f5 - f) * f3;
            float f9 = this.f24440a;
            if (f8 < f9) {
                f = Math.max(f4, f5 - (f9 / f3));
                f8 = (rectF.bottom - f) * f3;
            }
            float f11 = this.f24442c;
            if (f8 > f11) {
                f = Math.max(rectF2.top, rectF.bottom - (f11 / f3));
                f8 = (rectF.bottom - f) * f3;
            }
            if (!z || !z2) {
                if (z) {
                    float f12 = rectF.right;
                    float f13 = rectF2.left;
                    if (f12 - f8 < f13) {
                        f = Math.max(rectF2.top, rectF.bottom - ((f12 - f13) / f3));
                        f8 = (rectF.bottom - f) * f3;
                    }
                }
                if (z2) {
                    float f14 = rectF.left;
                    float f15 = rectF2.right;
                    if (f8 + f14 > f15) {
                        f = Math.max(f, Math.max(rectF2.top, rectF.bottom - ((f15 - f14) / f3)));
                    }
                }
            } else {
                f = Math.max(f, Math.max(rectF2.top, rectF.bottom - (rectF2.width() / f3)));
            }
        }
        rectF.top = f;
    }
}
