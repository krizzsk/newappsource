package com.moovit.image;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import ce0.C21100e;
import com.bumptech.glide.Priority;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.moovit.commons.utils.UiUtils;
import com.moovit.commons.view.Alignment$Horizontal;
import com.moovit.commons.view.Alignment$Vertical;
import com.moovit.image.ColorAdjustment;
import com.moovit.image.model.Image;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;
import p129j1.C5348a;
import p141k1.C5450a;
import p191o2.C5928b;
import p260t6.C6599e;
import p435de.C16596f;
import p583jk.C17884p;
import p693nz.C18659h;
import p786rz.C19387a;
import p977zz.C20964s0;
import p977zz.C20966t;

/* renamed from: com.moovit.image.l */
public final class C16035l {

    /* renamed from: a */
    public static volatile C18659h f41753a;

    /* renamed from: b */
    public static final C20966t f41754b = new C20966t(Matrix.class);

    /* renamed from: c */
    public static final C16036a f41755c = new C16036a();

    /* renamed from: d */
    public static final C16037b f41756d = new C16037b();

    /* renamed from: com.moovit.image.l$a */
    public class C16036a extends ThreadLocal<float[]> {
        public final Object initialValue() {
            return new float[2];
        }
    }

    /* renamed from: com.moovit.image.l$b */
    public class C16037b extends ThreadLocal<float[]> {
        public final Object initialValue() {
            return new float[3];
        }
    }

    /* renamed from: com.moovit.image.l$c */
    public static /* synthetic */ class C16038c {

        /* renamed from: a */
        public static final /* synthetic */ int[] f41757a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.moovit.image.ColorAdjustment$Mode[] r0 = com.moovit.image.ColorAdjustment.Mode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f41757a = r0
                com.moovit.image.ColorAdjustment$Mode r1 = com.moovit.image.ColorAdjustment.Mode.TINT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f41757a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.moovit.image.ColorAdjustment$Mode r1 = com.moovit.image.ColorAdjustment.Mode.AUTO     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moovit.image.C16035l.C16038c.<clinit>():void");
        }
    }

    /* renamed from: com.moovit.image.l$d */
    public static class C16039d {
        /* renamed from: a */
        public Bitmap mo48208a(int i, int i2) {
            throw null;
        }
    }

    /* renamed from: com.moovit.image.l$g */
    public static abstract class C16044g {

        /* renamed from: a */
        public final C16045h f41786a;

        public C16044g(C16045h hVar) {
            C21100e.m49373x(hVar, "layout");
            this.f41786a = hVar;
        }

        /* renamed from: a */
        public abstract C16044g mo48209a(Context context, String[] strArr) throws JSONException;

        /* renamed from: b */
        public abstract void mo48210b(Canvas canvas, Bitmap bitmap, int i, int i2, int i3, int i4, C16039d dVar);

        /* renamed from: c */
        public abstract int mo48211c();

        /* renamed from: d */
        public abstract int mo48212d();

        /* renamed from: e */
        public final int mo48219e() {
            boolean z;
            int i = this.f41786a.f41790d;
            if (i >= 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return i;
            }
            return mo48211c();
        }

        /* renamed from: f */
        public int mo48214f() {
            return 0;
        }

        /* renamed from: g */
        public int mo48215g() {
            return 0;
        }

        /* renamed from: h */
        public int mo48216h() {
            return 0;
        }

        /* renamed from: i */
        public int mo48217i() {
            return 0;
        }

        /* renamed from: j */
        public final int mo48220j() {
            boolean z;
            int i = this.f41786a.f41789c;
            if (i >= 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return i;
            }
            return mo48212d();
        }

        /* renamed from: k */
        public void mo48213k() {
        }
    }

    /* renamed from: com.moovit.image.l$h */
    public static class C16045h {

        /* renamed from: a */
        public final float f41787a;

        /* renamed from: b */
        public final float f41788b;

        /* renamed from: c */
        public final int f41789c;

        /* renamed from: d */
        public final int f41790d;

        /* renamed from: e */
        public final float f41791e;

        /* renamed from: f */
        public final float f41792f;

        /* renamed from: g */
        public final Alignment$Horizontal f41793g;

        /* renamed from: h */
        public final Alignment$Vertical f41794h;

        public C16045h(float f, float f2, int i, int i2, float f3, float f4, Alignment$Horizontal alignment$Horizontal, Alignment$Vertical alignment$Vertical) {
            this.f41787a = f;
            this.f41788b = f2;
            this.f41789c = i;
            this.f41790d = i2;
            this.f41791e = f3;
            this.f41792f = f4;
            this.f41793g = alignment$Horizontal;
            this.f41794h = alignment$Vertical;
        }
    }

    /* renamed from: a */
    public static int m40843a(Bitmap bitmap, Canvas canvas, float f, float f2) {
        Matrix matrix = (Matrix) f41754b.get();
        float[] fArr = (float[]) f41755c.get();
        fArr[1] = 0.0f;
        fArr[0] = 0.0f;
        canvas.getMatrix(matrix);
        matrix.mapPoints(fArr);
        return bitmap.getPixel((int) (f + fArr[0]), (int) (f2 + fArr[1]));
    }

    /* renamed from: b */
    public static int m40844b(int i, int i2) {
        if (Color.alpha(i) >= 255 && com.moovit.commons.utils.Color.m40219c(i, i2) < 4.5d) {
            return com.moovit.commons.utils.Color.m40221f(i2);
        }
        return i2;
    }

    /* renamed from: c */
    public static Bitmap m40845c(Context context, Object obj, String[] strArr, byte[] bArr, C16039d dVar) {
        if (strArr != null) {
            C18659h hVar = f41753a;
            if (hVar == null) {
                hVar = new C18659h(100);
                f41753a = hVar;
                context.getApplicationContext().registerComponentCallbacks(new C16047m(hVar));
            }
            C16044g gVar = (C16044g) hVar.get(obj);
            if (gVar == null) {
                try {
                    gVar = m40849g(context, new JSONObject(new String(bArr, C20964s0.f52719b)));
                    hVar.put(obj, gVar);
                } catch (JSONException e) {
                    throw new BadMvfException("Error parsing MVF with id: " + obj + " message: " + e.getMessage(), e);
                }
            }
            return m40850h(context, obj, gVar, strArr, dVar);
        }
        throw new BadMvfException("Error parsing MVF with id: " + obj + " cannot decode mvf with null params");
    }

    /* renamed from: d */
    public static Bitmap m40846d(Context context, int i, String[] strArr, C16039d dVar) {
        InputStream openRawResource;
        C18659h hVar = f41753a;
        if (hVar == null) {
            hVar = new C18659h(100);
            f41753a = hVar;
            context.getApplicationContext().registerComponentCallbacks(new C16047m(hVar));
        }
        C16044g gVar = (C16044g) hVar.get(Integer.valueOf(i));
        if (gVar != null) {
            try {
                return m40850h(context, Integer.valueOf(i), gVar, strArr, dVar);
            } catch (JSONException e) {
                throw new BadMvfException(C16759e.m42349e("Error rendering MVF with id: ", i), e);
            }
        } else {
            try {
                openRawResource = context.getResources().openRawResource(i);
                byte[] d = C19387a.m46672d(openRawResource);
                openRawResource.close();
                return m40845c(context, Integer.valueOf(i), strArr, d, dVar);
            } catch (IOException unused) {
                return null;
            } catch (Throwable th) {
                openRawResource.close();
                throw th;
            }
        }
    }

    /* renamed from: e */
    public static int m40847e(int i, int i2, float[] fArr) {
        float f;
        if (com.moovit.commons.utils.Color.m40219c(i, i2) >= 4.5d) {
            return i2;
        }
        float f2 = fArr[2];
        if (f2 == BitmapDescriptorFactory.HUE_RED) {
            return i2;
        }
        if (((double) f2) > 0.5d) {
            f = 1.0f - f2;
        } else {
            f = Math.max(BitmapDescriptorFactory.HUE_RED, f2 - 0.1f);
        }
        fArr[2] = f;
        int a = C5348a.m13405a(fArr);
        return m40847e(i, Color.argb(Color.alpha(i2), Color.red(a), Color.green(a), Color.blue(a)), fArr);
    }

    /* renamed from: f */
    public static int m40848f(int i, int i2, float[] fArr) {
        float f;
        if (com.moovit.commons.utils.Color.m40219c(i, i2) >= 4.5d) {
            return i2;
        }
        float f2 = fArr[2];
        if (f2 == 1.0f) {
            return i2;
        }
        if (f2 < 0.5f) {
            f = 1.0f - f2;
        } else {
            f = Math.min(1.0f, f2 + 0.1f);
        }
        fArr[2] = f;
        int a = C5348a.m13405a(fArr);
        return m40848f(i, Color.argb(Color.alpha(i2), Color.red(a), Color.green(a), Color.blue(a)), fArr);
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x01d2  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x01fc  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x027c  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x02da  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x02f2  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x030a  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x0344  */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x034f  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x035f  */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x036c A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x037f  */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x0385  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00c9 A[Catch:{ IllegalArgumentException -> 0x03ca }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0127 A[Catch:{ IllegalArgumentException -> 0x03ca }] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0166  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0176  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.moovit.image.C16035l.C16044g m40849g(android.content.Context r25, org.json.JSONObject r26) throws org.json.JSONException {
        /*
            r0 = r25
            r1 = r26
            java.lang.String r2 = "center"
            java.lang.String r3 = "layout"
            org.json.JSONObject r3 = r1.optJSONObject(r3)
            if (r3 != 0) goto L_0x0013
            org.json.JSONObject r3 = new org.json.JSONObject
            r3.<init>()
        L_0x0013:
            java.lang.String r4 = "w"
            r5 = -1
            int r4 = r3.optInt(r4, r5)
            if (r4 < 0) goto L_0x0025
            float r4 = (float) r4
            android.content.res.Resources r6 = r25.getResources()
            int r4 = com.moovit.commons.utils.UiUtils.m40249h(r6, r4)
        L_0x0025:
            r9 = r4
            java.lang.String r4 = "h"
            int r4 = r3.optInt(r4, r5)
            if (r4 < 0) goto L_0x0037
            float r4 = (float) r4
            android.content.res.Resources r5 = r25.getResources()
            int r4 = com.moovit.commons.utils.UiUtils.m40249h(r5, r4)
        L_0x0037:
            r10 = r4
            r4 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            java.lang.String r6 = "x"
            double r6 = r3.optDouble(r6, r4)
            float r7 = (float) r6
            java.lang.String r6 = "y"
            double r4 = r3.optDouble(r6, r4)
            float r8 = (float) r4
            r4 = 0
            java.lang.String r6 = "dx"
            double r11 = r3.optDouble(r6, r4)
            float r6 = (float) r11
            android.content.res.Resources r11 = r25.getResources()
            float r11 = com.moovit.commons.utils.UiUtils.m40247f(r11, r6)
            java.lang.String r6 = "dy"
            double r4 = r3.optDouble(r6, r4)
            float r4 = (float) r4
            android.content.res.Resources r5 = r25.getResources()
            float r12 = com.moovit.commons.utils.UiUtils.m40247f(r5, r4)
            java.lang.String r4 = "halign"
            java.lang.String r4 = r3.optString(r4, r2)     // Catch:{ IllegalArgumentException -> 0x03ca }
            r4.getClass()     // Catch:{ IllegalArgumentException -> 0x03ca }
            int r5 = r4.hashCode()
            r6 = -1364013995(0xffffffffaeb2cc55, float:-8.1307995E-11)
            r13 = 1
            r15 = 2
            if (r5 == r6) goto L_0x009d
            r14 = 3317767(0x32a007, float:4.649182E-39)
            if (r5 == r14) goto L_0x0092
            r14 = 108511772(0x677c21c, float:4.6598146E-35)
            if (r5 == r14) goto L_0x0087
            goto L_0x00a3
        L_0x0087:
            java.lang.String r5 = "right"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0090
            goto L_0x00a3
        L_0x0090:
            r5 = 2
            goto L_0x00a6
        L_0x0092:
            java.lang.String r5 = "left"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x009b
            goto L_0x00a3
        L_0x009b:
            r5 = 1
            goto L_0x00a6
        L_0x009d:
            boolean r5 = r4.equals(r2)
            if (r5 != 0) goto L_0x00a5
        L_0x00a3:
            r5 = -1
            goto L_0x00a6
        L_0x00a5:
            r5 = 0
        L_0x00a6:
            if (r5 == 0) goto L_0x00c9
            if (r5 == r13) goto L_0x00c6
            if (r5 != r15) goto L_0x00af
            com.moovit.commons.view.Alignment$Horizontal r4 = com.moovit.commons.view.Alignment$Horizontal.RIGHT     // Catch:{ IllegalArgumentException -> 0x03ca }
            goto L_0x00cb
        L_0x00af:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x03ca }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IllegalArgumentException -> 0x03ca }
            r1.<init>()     // Catch:{ IllegalArgumentException -> 0x03ca }
            java.lang.String r2 = "Unknown horizontal alignment value: "
            r1.append(r2)     // Catch:{ IllegalArgumentException -> 0x03ca }
            r1.append(r4)     // Catch:{ IllegalArgumentException -> 0x03ca }
            java.lang.String r1 = r1.toString()     // Catch:{ IllegalArgumentException -> 0x03ca }
            r0.<init>(r1)     // Catch:{ IllegalArgumentException -> 0x03ca }
            throw r0     // Catch:{ IllegalArgumentException -> 0x03ca }
        L_0x00c6:
            com.moovit.commons.view.Alignment$Horizontal r4 = com.moovit.commons.view.Alignment$Horizontal.LEFT     // Catch:{ IllegalArgumentException -> 0x03ca }
            goto L_0x00cb
        L_0x00c9:
            com.moovit.commons.view.Alignment$Horizontal r4 = com.moovit.commons.view.Alignment$Horizontal.CENTER     // Catch:{ IllegalArgumentException -> 0x03ca }
        L_0x00cb:
            java.lang.String r5 = "valign"
            java.lang.String r3 = r3.optString(r5, r2)     // Catch:{ IllegalArgumentException -> 0x03ca }
            r3.getClass()     // Catch:{ IllegalArgumentException -> 0x03ca }
            int r5 = r3.hashCode()
            r14 = -1383228885(0xffffffffad8d9a2b, float:-1.6098308E-11)
            if (r5 == r14) goto L_0x00f9
            if (r5 == r6) goto L_0x00f0
            r2 = 115029(0x1c155, float:1.6119E-40)
            if (r5 == r2) goto L_0x00e5
            goto L_0x0101
        L_0x00e5:
            java.lang.String r2 = "top"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L_0x00ee
            goto L_0x0101
        L_0x00ee:
            r2 = 2
            goto L_0x0104
        L_0x00f0:
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L_0x00f7
            goto L_0x0101
        L_0x00f7:
            r2 = 1
            goto L_0x0104
        L_0x00f9:
            java.lang.String r2 = "bottom"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L_0x0103
        L_0x0101:
            r2 = -1
            goto L_0x0104
        L_0x0103:
            r2 = 0
        L_0x0104:
            if (r2 == 0) goto L_0x0127
            if (r2 == r13) goto L_0x0124
            if (r2 != r15) goto L_0x010d
            com.moovit.commons.view.Alignment$Vertical r2 = com.moovit.commons.view.Alignment$Vertical.TOP     // Catch:{ IllegalArgumentException -> 0x03ca }
            goto L_0x0129
        L_0x010d:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x03ca }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IllegalArgumentException -> 0x03ca }
            r1.<init>()     // Catch:{ IllegalArgumentException -> 0x03ca }
            java.lang.String r2 = "Unknown vertical alignment value: "
            r1.append(r2)     // Catch:{ IllegalArgumentException -> 0x03ca }
            r1.append(r3)     // Catch:{ IllegalArgumentException -> 0x03ca }
            java.lang.String r1 = r1.toString()     // Catch:{ IllegalArgumentException -> 0x03ca }
            r0.<init>(r1)     // Catch:{ IllegalArgumentException -> 0x03ca }
            throw r0     // Catch:{ IllegalArgumentException -> 0x03ca }
        L_0x0124:
            com.moovit.commons.view.Alignment$Vertical r2 = com.moovit.commons.view.Alignment$Vertical.CENTER     // Catch:{ IllegalArgumentException -> 0x03ca }
            goto L_0x0129
        L_0x0127:
            com.moovit.commons.view.Alignment$Vertical r2 = com.moovit.commons.view.Alignment$Vertical.BOTTOM     // Catch:{ IllegalArgumentException -> 0x03ca }
        L_0x0129:
            r14 = r2
            com.moovit.image.l$h r17 = new com.moovit.image.l$h     // Catch:{ IllegalArgumentException -> 0x03ca }
            r2 = 1
            r6 = r17
            r13 = r4
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14)     // Catch:{ IllegalArgumentException -> 0x03ca }
            java.lang.String r3 = "type"
            java.lang.String r3 = r1.getString(r3)
            r3.getClass()
            int r4 = r3.hashCode()
            java.lang.String r5 = "text"
            r6 = -410956671(0xffffffffe7814c81, float:-1.221193E24)
            if (r4 == r6) goto L_0x0166
            r6 = 3556653(0x36452d, float:4.983932E-39)
            if (r4 == r6) goto L_0x015d
            r6 = 100313435(0x5faa95b, float:2.3572098E-35)
            if (r4 == r6) goto L_0x0152
            goto L_0x016e
        L_0x0152:
            java.lang.String r4 = "image"
            boolean r4 = r3.equals(r4)
            if (r4 != 0) goto L_0x015b
            goto L_0x016e
        L_0x015b:
            r4 = 2
            goto L_0x0171
        L_0x015d:
            boolean r4 = r3.equals(r5)
            if (r4 != 0) goto L_0x0164
            goto L_0x016e
        L_0x0164:
            r4 = 1
            goto L_0x0171
        L_0x0166:
            java.lang.String r4 = "container"
            boolean r4 = r3.equals(r4)
            if (r4 != 0) goto L_0x0170
        L_0x016e:
            r4 = -1
            goto L_0x0171
        L_0x0170:
            r4 = 0
        L_0x0171:
            java.lang.String r6 = "color"
            r7 = 0
            if (r4 == 0) goto L_0x027c
            if (r4 == r2) goto L_0x0219
            if (r4 != r15) goto L_0x020d
            java.lang.String r0 = "id"
            java.lang.String r18 = r1.getString(r0)
            java.lang.String r0 = "ext_params_range"
            java.lang.String r19 = r1.optString(r0, r7)
            java.lang.String r20 = r1.optString(r6, r7)
            java.lang.String r0 = "scale"
            java.lang.String r3 = "1.0"
            java.lang.String r22 = r1.optString(r0, r3)
            java.lang.String r0 = "none"
            java.lang.String r3 = "color_adjustment"
            java.lang.String r1 = r1.optString(r3, r0)
            r1.getClass()
            int r3 = r1.hashCode()
            r4 = 3005871(0x2dddaf, float:4.212122E-39)
            if (r3 == r4) goto L_0x01c5
            r4 = 3387192(0x33af38, float:4.746467E-39)
            if (r3 == r4) goto L_0x01bc
            r0 = 392597729(0x176690e1, float:7.449987E-25)
            if (r3 == r0) goto L_0x01b1
            goto L_0x01cd
        L_0x01b1:
            java.lang.String r0 = "auto_brightness"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x01ba
            goto L_0x01cd
        L_0x01ba:
            r0 = 2
            goto L_0x01d0
        L_0x01bc:
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x01c3
            goto L_0x01cd
        L_0x01c3:
            r0 = 1
            goto L_0x01d0
        L_0x01c5:
            java.lang.String r0 = "auto"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x01cf
        L_0x01cd:
            r0 = -1
            goto L_0x01d0
        L_0x01cf:
            r0 = 0
        L_0x01d0:
            if (r0 == 0) goto L_0x01fc
            if (r0 == r2) goto L_0x01f4
            if (r0 == r15) goto L_0x01ec
            com.moovit.commons.utils.Color r0 = com.moovit.commons.utils.Color.m40224k(r1)     // Catch:{ Exception -> 0x01e4 }
            com.moovit.image.ColorAdjustment r1 = new com.moovit.image.ColorAdjustment     // Catch:{ Exception -> 0x01e4 }
            com.moovit.image.ColorAdjustment$Mode r2 = com.moovit.image.ColorAdjustment.Mode.TINT     // Catch:{ Exception -> 0x01e4 }
            r1.<init>(r2, r0)     // Catch:{ Exception -> 0x01e4 }
            r21 = r1
            goto L_0x0205
        L_0x01e4:
            com.moovit.image.ColorAdjustment r0 = new com.moovit.image.ColorAdjustment
            com.moovit.image.ColorAdjustment$Mode r1 = com.moovit.image.ColorAdjustment.Mode.NONE
            r0.<init>(r1, r7)
            goto L_0x0203
        L_0x01ec:
            com.moovit.image.ColorAdjustment r0 = new com.moovit.image.ColorAdjustment
            com.moovit.image.ColorAdjustment$Mode r1 = com.moovit.image.ColorAdjustment.Mode.AUTO_BRIGHTNESS
            r0.<init>(r1, r7)
            goto L_0x0203
        L_0x01f4:
            com.moovit.image.ColorAdjustment r0 = new com.moovit.image.ColorAdjustment
            com.moovit.image.ColorAdjustment$Mode r1 = com.moovit.image.ColorAdjustment.Mode.NONE
            r0.<init>(r1, r7)
            goto L_0x0203
        L_0x01fc:
            com.moovit.image.ColorAdjustment r0 = new com.moovit.image.ColorAdjustment
            com.moovit.image.ColorAdjustment$Mode r1 = com.moovit.image.ColorAdjustment.Mode.AUTO
            r0.<init>(r1, r7)
        L_0x0203:
            r21 = r0
        L_0x0205:
            com.moovit.image.l$f r0 = new com.moovit.image.l$f
            r16 = r0
            r16.<init>(r17, r18, r19, r20, r21, r22)
            return r0
        L_0x020d:
            com.moovit.image.BadMvfException r0 = new com.moovit.image.BadMvfException
            java.lang.String r1 = "Unknown layer type: "
            java.lang.String r1 = p379.C25541a.m63881k(r1, r3)
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0219:
            java.lang.String r3 = ""
            java.lang.String r18 = r1.optString(r5, r3)
            boolean r3 = com.moovit.commons.utils.UiUtils.m40253l(r25)
            if (r3 == 0) goto L_0x0228
            java.lang.String r3 = "#292A30"
            goto L_0x022a
        L_0x0228:
            java.lang.String r3 = "ffffff"
        L_0x022a:
            java.lang.String r19 = r1.optString(r6, r3)
            java.lang.String r3 = "ignoreIfTextEmpty"
            boolean r22 = r1.optBoolean(r3, r2)
            r2 = 2147483647(0x7fffffff, float:NaN)
            java.lang.String r3 = "maxLength"
            int r23 = r1.optInt(r3, r2)
            java.lang.String r2 = "size"
            double r2 = r1.getDouble(r2)
            float r2 = (float) r2
            android.content.res.Resources r0 = r25.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = android.util.TypedValue.applyDimension(r15, r2, r0)
            double r2 = (double) r0
            double r2 = java.lang.Math.ceil(r2)
            int r0 = (int) r2
            float r0 = (float) r0
            java.lang.String r2 = "bold"
            r3 = 0
            boolean r2 = r1.optBoolean(r2, r3)
            java.lang.String r4 = "italic"
            boolean r3 = r1.optBoolean(r4, r3)
            if (r3 == 0) goto L_0x0268
            r2 = r2 | 2
        L_0x0268:
            java.lang.String r3 = "font"
            java.lang.String r1 = r1.optString(r3, r7)
            android.graphics.Typeface r21 = android.graphics.Typeface.create(r1, r2)
            com.moovit.image.l$i r1 = new com.moovit.image.l$i
            r16 = r1
            r20 = r0
            r16.<init>(r17, r18, r19, r20, r21, r22, r23)
            return r1
        L_0x027c:
            java.lang.String r3 = "background"
            org.json.JSONObject r3 = r1.optJSONObject(r3)
            if (r3 != 0) goto L_0x0287
            r20 = r7
            goto L_0x028d
        L_0x0287:
            com.moovit.image.l$g r3 = m40849g(r0, r3)
            r20 = r3
        L_0x028d:
            java.lang.String r3 = "measureBackground"
            r4 = 0
            boolean r21 = r1.optBoolean(r3, r4)
            java.lang.String r3 = "ignoreIfEmpty"
            boolean r22 = r1.optBoolean(r3, r4)
            java.lang.String r3 = "stack"
            java.lang.String r4 = "stacking_strategy"
            java.lang.String r4 = r1.optString(r4, r3)
            r4.getClass()
            int r5 = r4.hashCode()
            r6 = -1984141450(0xffffffff89bc6776, float:-4.5356648E-33)
            if (r5 == r6) goto L_0x02cd
            r6 = 109757064(0x68ac288, float:5.219567E-35)
            if (r5 == r6) goto L_0x02c4
            r3 = 1387629604(0x52b58c24, float:3.89870125E11)
            if (r5 == r3) goto L_0x02b9
            goto L_0x02d5
        L_0x02b9:
            java.lang.String r3 = "horizontal"
            boolean r3 = r4.equals(r3)
            if (r3 != 0) goto L_0x02c2
            goto L_0x02d5
        L_0x02c2:
            r3 = 2
            goto L_0x02d8
        L_0x02c4:
            boolean r3 = r4.equals(r3)
            if (r3 != 0) goto L_0x02cb
            goto L_0x02d5
        L_0x02cb:
            r3 = 1
            goto L_0x02d8
        L_0x02cd:
            java.lang.String r3 = "vertical"
            boolean r3 = r4.equals(r3)
            if (r3 != 0) goto L_0x02d7
        L_0x02d5:
            r3 = -1
            goto L_0x02d8
        L_0x02d7:
            r3 = 0
        L_0x02d8:
            if (r3 == 0) goto L_0x02f2
            if (r3 == r2) goto L_0x02ee
            if (r3 != r15) goto L_0x02e2
            r3 = 1
            r18 = 1
            goto L_0x02f5
        L_0x02e2:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Unknown layout mode: "
            java.lang.String r1 = p379.C25541a.m63881k(r1, r4)
            r0.<init>(r1)
            throw r0
        L_0x02ee:
            r3 = 0
            r18 = 0
            goto L_0x02f5
        L_0x02f2:
            r3 = 2
            r18 = 2
        L_0x02f5:
            java.lang.String r3 = "middle"
            java.lang.String r4 = "spacing_mode"
            java.lang.String r4 = r1.optString(r4, r3)
            r5 = 124(0x7c, float:1.74E-43)
            java.lang.String[] r4 = p977zz.C20964s0.m49080A(r4, r5)
            int r5 = r4.length
            r6 = 0
            r7 = 0
            r23 = 0
        L_0x0308:
            if (r6 >= r5) goto L_0x0356
            r7 = r4[r6]
            r7.getClass()
            int r8 = r7.hashCode()
            r9 = -1074341483(0xffffffffbff6d995, float:-1.9285151)
            if (r8 == r9) goto L_0x0339
            r9 = 100571(0x188db, float:1.4093E-40)
            if (r8 == r9) goto L_0x032e
            r9 = 109757538(0x68ac462, float:5.219839E-35)
            if (r8 == r9) goto L_0x0323
            goto L_0x033f
        L_0x0323:
            java.lang.String r8 = "start"
            boolean r7 = r7.equals(r8)
            if (r7 != 0) goto L_0x032c
            goto L_0x033f
        L_0x032c:
            r7 = 2
            goto L_0x0342
        L_0x032e:
            java.lang.String r8 = "end"
            boolean r7 = r7.equals(r8)
            if (r7 != 0) goto L_0x0337
            goto L_0x033f
        L_0x0337:
            r7 = 1
            goto L_0x0342
        L_0x0339:
            boolean r7 = r7.equals(r3)
            if (r7 != 0) goto L_0x0341
        L_0x033f:
            r7 = -1
            goto L_0x0342
        L_0x0341:
            r7 = 0
        L_0x0342:
            if (r7 == 0) goto L_0x034f
            if (r7 == r2) goto L_0x034c
            if (r7 == r15) goto L_0x0349
            goto L_0x0353
        L_0x0349:
            r7 = r23 | 1
            goto L_0x0351
        L_0x034c:
            r7 = r23 | 4
            goto L_0x0351
        L_0x034f:
            r7 = r23 | 2
        L_0x0351:
            r23 = r7
        L_0x0353:
            int r6 = r6 + 1
            goto L_0x0308
        L_0x0356:
            java.lang.String r2 = "spacing"
            r3 = 0
            int r2 = r1.optInt(r2, r3)
            if (r2 <= 0) goto L_0x0368
            float r2 = (float) r2
            android.content.res.Resources r3 = r25.getResources()
            int r2 = com.moovit.commons.utils.UiUtils.m40249h(r3, r2)
        L_0x0368:
            r24 = r2
            if (r21 == 0) goto L_0x0377
            if (r20 == 0) goto L_0x036f
            goto L_0x0377
        L_0x036f:
            com.moovit.image.BadMvfException r0 = new com.moovit.image.BadMvfException
            java.lang.String r1 = "measureBackground can't be set when background is null"
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0377:
            java.lang.String r2 = "layers"
            org.json.JSONArray r2 = r1.optJSONArray(r2)
            if (r2 != 0) goto L_0x0385
            r0 = 0
            com.moovit.image.l$g[] r0 = new com.moovit.image.C16035l.C16044g[r0]
            r19 = r0
            goto L_0x03c2
        L_0x0385:
            int r3 = r2.length()
            com.moovit.image.l$g[] r4 = new com.moovit.image.C16035l.C16044g[r3]
            r5 = 0
        L_0x038c:
            int r6 = r2.length()
            if (r5 >= r6) goto L_0x039f
            org.json.JSONObject r6 = r2.getJSONObject(r5)
            com.moovit.image.l$g r6 = m40849g(r0, r6)
            r4[r5] = r6
            int r5 = r5 + 1
            goto L_0x038c
        L_0x039f:
            java.lang.String r2 = "autoMirrored"
            r5 = 0
            boolean r1 = r1.optBoolean(r2, r5)
            if (r1 == 0) goto L_0x03c0
            boolean r0 = com.moovit.commons.utils.C15780a.m40268a(r25)
            if (r0 == 0) goto L_0x03c0
            int r3 = r3 + -1
            r0 = 0
        L_0x03b1:
            if (r3 <= r0) goto L_0x03c0
            r1 = r4[r0]
            r2 = r4[r3]
            r4[r0] = r2
            r4[r3] = r1
            int r3 = r3 + -1
            int r0 = r0 + 1
            goto L_0x03b1
        L_0x03c0:
            r19 = r4
        L_0x03c2:
            com.moovit.image.l$e r0 = new com.moovit.image.l$e
            r16 = r0
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24)
            return r0
        L_0x03ca:
            r0 = move-exception
            com.moovit.image.BadMvfException r1 = new com.moovit.image.BadMvfException
            r1.<init>((java.lang.IllegalArgumentException) r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moovit.image.C16035l.m40849g(android.content.Context, org.json.JSONObject):com.moovit.image.l$g");
    }

    /* renamed from: h */
    public static Bitmap m40850h(Context context, Object obj, C16044g gVar, String[] strArr, C16039d dVar) throws JSONException {
        try {
            C16044g a = gVar.mo48209a(context, strArr);
            if (a == null) {
                Objects.toString(obj);
                Arrays.toString(strArr);
                C16596f a2 = C16596f.m42113a();
                a2.mo49363b("MVF (id=" + obj + " params=" + Arrays.toString(strArr) + ")");
                a2.mo49364c(new IllegalArgumentException("Top level layer in MVF is null"));
                return null;
            }
            a.mo48213k();
            int j = a.mo48220j();
            int e = a.mo48219e();
            if (j == 0 || e == 0) {
                throw new IllegalArgumentException("Layer width or height is <= 0 with given parameters");
            }
            dVar.getClass();
            int j2 = a.mo48220j();
            int e2 = a.mo48219e();
            Bitmap a3 = dVar.mo48208a(j2, e2);
            a.mo48210b(new Canvas(a3), a3, a3.getWidth(), a3.getHeight(), j2, e2, dVar);
            return a3;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    /* renamed from: com.moovit.image.l$i */
    public static class C16046i extends C16044g {

        /* renamed from: b */
        public final String f41795b;

        /* renamed from: c */
        public final String f41796c;

        /* renamed from: d */
        public final Paint f41797d;

        /* renamed from: e */
        public final boolean f41798e;

        /* renamed from: f */
        public final int f41799f;

        /* renamed from: g */
        public int f41800g;

        /* renamed from: h */
        public int f41801h;

        public C16046i(C16045h hVar, String str, String str2, float f, Typeface typeface, boolean z, int i) {
            super(hVar);
            this.f41795b = str;
            this.f41796c = str2;
            this.f41798e = z;
            this.f41799f = i;
            Paint paint = new Paint(1);
            this.f41797d = paint;
            paint.setTextAlign(Paint.Align.LEFT);
            paint.setTextSize(f);
            paint.setTypeface(typeface);
        }

        /* renamed from: a */
        public final C16044g mo48209a(Context context, String[] strArr) {
            String str = this.f41795b;
            C18659h hVar = C16035l.f41753a;
            String str2 = C20964s0.f52718a;
            String format = String.format((Locale) null, str, strArr);
            int length = format.length();
            int i = this.f41799f;
            if (length > i) {
                format = format.substring(0, i);
            }
            String str3 = format;
            if (str3.isEmpty() && this.f41798e) {
                return null;
            }
            com.moovit.commons.utils.Color k = com.moovit.commons.utils.Color.m40224k(String.format((Locale) null, this.f41796c, strArr));
            Paint paint = new Paint(this.f41797d);
            paint.setColor(k.f41007b);
            return new C16046i(this.f41786a, str3, paint, this.f41798e, this.f41799f);
        }

        /* renamed from: b */
        public final void mo48210b(Canvas canvas, Bitmap bitmap, int i, int i2, int i3, int i4, C16039d dVar) {
            boolean z;
            int i5;
            C16045h hVar = this.f41786a;
            float leftFor = hVar.f41793g.getLeftFor(hVar.f41787a, hVar.f41791e, (float) i3, i);
            C16045h hVar2 = this.f41786a;
            float topFor = hVar2.f41794h.getTopFor(hVar2.f41788b, hVar2.f41792f, (float) i4, i2) - this.f41797d.getFontMetrics().ascent;
            int a = C16035l.m40843a(bitmap, canvas, leftFor, topFor);
            Paint paint = this.f41797d;
            int color = paint.getColor();
            if (Color.alpha(a) >= 255 && com.moovit.commons.utils.Color.m40219c(a, color) < 4.5d) {
                float[] fArr = (float[]) C16035l.f41756d.get();
                ThreadLocal<double[]> threadLocal = C5348a.f17644a;
                C5348a.m13406b(Color.red(color), Color.green(color), Color.blue(color), fArr);
                if (com.moovit.commons.utils.Color.m40219c(a, -1) > com.moovit.commons.utils.Color.m40219c(a, -16777216)) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    i5 = C16035l.m40848f(a, color, fArr);
                } else {
                    i5 = C16035l.m40847e(a, color, fArr);
                }
                color = i5;
            }
            paint.setColor(color);
            canvas.drawText(this.f41795b, leftFor, topFor, this.f41797d);
        }

        /* renamed from: c */
        public final int mo48211c() {
            return this.f41801h;
        }

        /* renamed from: d */
        public final int mo48212d() {
            return this.f41800g;
        }

        /* renamed from: k */
        public final void mo48213k() {
            this.f41800g = (int) this.f41797d.measureText(this.f41795b);
            this.f41801h = (int) (this.f41797d.getFontMetrics().descent - this.f41797d.getFontMetrics().ascent);
        }

        public C16046i(C16045h hVar, String str, Paint paint, boolean z, int i) {
            super(hVar);
            this.f41795b = str;
            this.f41797d = paint;
            this.f41796c = null;
            this.f41798e = z;
            this.f41799f = i;
        }
    }

    /* renamed from: com.moovit.image.l$e */
    public static class C16040e extends C16044g {

        /* renamed from: b */
        public final int f41758b;

        /* renamed from: c */
        public final C16044g[] f41759c;

        /* renamed from: d */
        public final float[][] f41760d;

        /* renamed from: e */
        public final C16044g f41761e;

        /* renamed from: f */
        public final float[] f41762f;

        /* renamed from: g */
        public final boolean f41763g;

        /* renamed from: h */
        public final boolean f41764h;

        /* renamed from: i */
        public int f41765i;

        /* renamed from: j */
        public int f41766j;

        /* renamed from: k */
        public final int f41767k;

        /* renamed from: l */
        public final int f41768l;

        public C16040e(C16045h hVar, int i, C16044g[] gVarArr, C16044g gVar, boolean z, boolean z2, int i2, int i3) {
            super(hVar);
            this.f41758b = i;
            this.f41759c = gVarArr;
            this.f41760d = null;
            this.f41761e = gVar;
            this.f41762f = null;
            this.f41763g = z;
            this.f41764h = z2;
            this.f41767k = i2;
            this.f41768l = i3;
        }

        /* renamed from: l */
        public static void m40852l(C16044g gVar, float[] fArr) {
            float f;
            float f2;
            float f3;
            float f4;
            float f5;
            float f6;
            C16044g gVar2 = gVar;
            gVar.mo48213k();
            C16045h hVar = gVar2.f41786a;
            float f7 = hVar.f41791e;
            float f8 = hVar.f41787a;
            float j = (float) gVar.mo48220j();
            C16045h hVar2 = gVar2.f41786a;
            float f9 = hVar2.f41792f;
            float f11 = hVar2.f41788b;
            float e = (float) gVar.mo48219e();
            Alignment$Horizontal alignment$Horizontal = gVar2.f41786a.f41793g;
            if (alignment$Horizontal == Alignment$Horizontal.LEFT) {
                if (1.0f != f8) {
                    if (f8 == BitmapDescriptorFactory.HUE_RED) {
                        f6 = j + f7;
                    } else {
                        f6 = (-f7) / f8;
                    }
                    f = Math.max(f6, (j + f7) / (1.0f - f8));
                } else {
                    throw new BadMvfException("Layer is aligned to left, but the layer's relative x position is 1.");
                }
            } else if (alignment$Horizontal == Alignment$Horizontal.RIGHT) {
                if (BitmapDescriptorFactory.HUE_RED != f8) {
                    if (f8 == 1.0f) {
                        f5 = j + f7;
                    } else {
                        f5 = f7 / (1.0f - f8);
                    }
                    f = Math.max(f5, (j - f7) / f8);
                } else {
                    throw new BadMvfException("Layer is aligned to right, but the layer's relative x position is 0.");
                }
            } else if (BitmapDescriptorFactory.HUE_RED == f8 || 1.0f == f8) {
                throw new BadMvfException("Layer is aligned to center, but the layer's relative x position is at an edge.");
            } else {
                double d = ((double) j) * 0.5d;
                double d2 = (double) f7;
                f = (float) Math.max((d - d2) / ((double) f8), (d + d2) / ((double) (1.0f - f8)));
            }
            Alignment$Vertical alignment$Vertical = gVar2.f41786a.f41794h;
            if (alignment$Vertical == Alignment$Vertical.TOP) {
                if (1.0f != f11) {
                    if (f11 == BitmapDescriptorFactory.HUE_RED) {
                        f4 = e + f9;
                    } else {
                        f4 = (-f9) / f11;
                    }
                    f2 = Math.max(f4, (e + f9) / (1.0f - f11));
                } else {
                    throw new BadMvfException("Layer is aligned to top, but the layer's relative y position is 1.");
                }
            } else if (alignment$Vertical == Alignment$Vertical.BOTTOM) {
                if (BitmapDescriptorFactory.HUE_RED != f11) {
                    if (f11 == 1.0f) {
                        f3 = e + f9;
                    } else {
                        f3 = f9 / (1.0f - f11);
                    }
                    f2 = Math.max(f3, (e - f9) / f11);
                } else {
                    throw new BadMvfException("Layer is aligned to bottom, but the layer's relative y position is 0.");
                }
            } else if (BitmapDescriptorFactory.HUE_RED == f11 || 1.0f == f11) {
                throw new BadMvfException("Layer is aligned to center, but the layer's relative y position is at an edge.");
            } else {
                double d3 = ((double) e) * 0.5d;
                double d4 = (double) f9;
                f2 = (float) Math.max((d3 - d4) / ((double) f11), (d3 + d4) / ((double) (1.0f - f11)));
            }
            fArr[0] = f;
            fArr[1] = f2;
        }

        /* renamed from: a */
        public final C16044g mo48209a(Context context, String[] strArr) throws JSONException {
            C16044g gVar;
            boolean z;
            int length = this.f41759c.length;
            C16044g[] gVarArr = new C16044g[length];
            boolean z2 = false;
            for (int i = 0; i < length; i++) {
                C16044g a = this.f41759c[i].mo48209a(context, strArr);
                gVarArr[i] = a;
                if (a != null) {
                    z = true;
                } else {
                    z = false;
                }
                z2 |= z;
            }
            if (this.f41764h && !z2) {
                return null;
            }
            C16044g gVar2 = this.f41761e;
            if (gVar2 != null) {
                gVar = gVar2.mo48209a(context, strArr);
            } else {
                gVar = null;
            }
            return new C16040e(this.f41786a, this.f41758b, gVarArr, gVar, this.f41763g, this.f41767k, this.f41768l);
        }

        /* renamed from: b */
        public final void mo48210b(Canvas canvas, Bitmap bitmap, int i, int i2, int i3, int i4, C16039d dVar) {
            int i5;
            int i6;
            int i7;
            int i8;
            boolean z;
            int i9;
            boolean z2;
            boolean z3;
            int i11;
            Canvas canvas2 = canvas;
            int i12 = i3;
            int i13 = i4;
            C16045h hVar = this.f41786a;
            Alignment$Horizontal alignment$Horizontal = hVar.f41793g;
            float f = hVar.f41787a;
            float f2 = hVar.f41791e;
            C16045h hVar2 = this.f41786a;
            Alignment$Vertical alignment$Vertical = hVar2.f41794h;
            float f3 = hVar2.f41788b;
            float f4 = hVar2.f41792f;
            canvas.save();
            canvas2.translate((float) ((int) alignment$Horizontal.getLeftFor(f, f2, (float) i12, i)), (float) ((int) alignment$Vertical.getTopFor(f3, f4, (float) i13, i2)));
            C16044g gVar = this.f41761e;
            int i14 = 0;
            if (gVar != null) {
                gVar.mo48210b(canvas, bitmap, i3, i4, i3, i4, dVar);
                i8 = this.f41761e.mo48215g();
                i7 = this.f41761e.mo48216h();
                i6 = this.f41761e.mo48217i();
                i5 = this.f41761e.mo48214f();
            } else {
                i8 = 0;
                i7 = 0;
                i6 = 0;
                i5 = 0;
            }
            int i15 = i12 - (i7 + i8);
            int i16 = i13 - (i5 + i6);
            canvas2.translate((float) i8, (float) i6);
            int i17 = this.f41758b;
            if (i17 != 0) {
                boolean z4 = true;
                if (i17 == 1) {
                    int i18 = this.f41767k;
                    if ((i18 & 1) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if ((i18 & 2) == 0) {
                        z4 = false;
                    }
                    if (z) {
                        i9 = this.f41768l;
                    } else {
                        i9 = 0;
                    }
                    int i19 = 0;
                    while (true) {
                        C16044g[] gVarArr = this.f41759c;
                        if (i19 >= gVarArr.length) {
                            break;
                        }
                        C16044g gVar2 = gVarArr[i19];
                        if (gVar2 != null) {
                            if (i9 > 0) {
                                canvas2.translate((float) i9, BitmapDescriptorFactory.HUE_RED);
                            }
                            int j = gVar2.mo48220j();
                            int e = gVar2.mo48219e();
                            int i21 = (int) this.f41760d[i19][0];
                            gVar2.mo48210b(canvas, bitmap, i21, i16, j, e, dVar);
                            if (z4) {
                                i21 += this.f41768l;
                            }
                            i9 = i21;
                        }
                        i19++;
                    }
                } else if (i17 == 2) {
                    int i22 = this.f41767k;
                    if ((i22 & 1) != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if ((i22 & 2) != 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (z2) {
                        i11 = this.f41768l;
                    } else {
                        i11 = 0;
                    }
                    while (true) {
                        C16044g[] gVarArr2 = this.f41759c;
                        if (i14 >= gVarArr2.length) {
                            break;
                        }
                        C16044g gVar3 = gVarArr2[i14];
                        if (gVar3 != null) {
                            if (i11 > 0) {
                                canvas2.translate(BitmapDescriptorFactory.HUE_RED, (float) i11);
                            }
                            int j2 = gVar3.mo48220j();
                            int e2 = gVar3.mo48219e();
                            int i23 = (int) this.f41760d[i14][1];
                            gVar3.mo48210b(canvas, bitmap, i15, i23, j2, e2, dVar);
                            if (z3) {
                                i23 += this.f41768l;
                            }
                            i11 = i23;
                        }
                        i14++;
                    }
                }
            } else {
                C16044g[] gVarArr3 = this.f41759c;
                int length = gVarArr3.length;
                while (i14 < length) {
                    C16044g gVar4 = gVarArr3[i14];
                    if (gVar4 != null) {
                        gVar4.mo48210b(canvas, bitmap, i15, i16, gVar4.mo48220j(), gVar4.mo48219e(), dVar);
                    }
                    i14++;
                }
            }
            canvas.restore();
        }

        /* renamed from: c */
        public final int mo48211c() {
            return this.f41766j;
        }

        /* renamed from: d */
        public final int mo48212d() {
            return this.f41765i;
        }

        /* renamed from: k */
        public final void mo48213k() {
            boolean z;
            boolean z2;
            float f = BitmapDescriptorFactory.HUE_RED;
            boolean z3 = false;
            float f2 = BitmapDescriptorFactory.HUE_RED;
            int i = 0;
            int i2 = 0;
            while (true) {
                C16044g[] gVarArr = this.f41759c;
                if (i >= gVarArr.length) {
                    break;
                }
                C16044g gVar = gVarArr[i];
                if (gVar != null) {
                    i2++;
                    float[] fArr = this.f41760d[i];
                    m40852l(gVar, fArr);
                    float f3 = fArr[0];
                    if (this.f41758b == 1) {
                        f += f3;
                    } else {
                        f = Math.max(f, f3);
                    }
                    float f4 = fArr[1];
                    if (this.f41758b == 2) {
                        f2 += f4;
                    } else {
                        f2 = Math.max(f2, f4);
                    }
                }
                i++;
            }
            C16044g gVar2 = this.f41761e;
            if (gVar2 != null) {
                f += (float) (this.f41761e.mo48216h() + gVar2.mo48215g());
                f2 += (float) (this.f41761e.mo48214f() + this.f41761e.mo48217i());
                if (this.f41763g) {
                    m40852l(this.f41761e, this.f41762f);
                    f = Math.max(f, this.f41762f[0]);
                    f2 = Math.max(f2, this.f41762f[1]);
                }
            }
            int i3 = this.f41767k;
            if ((i3 & 1) != 0) {
                z = true;
            } else {
                z = false;
            }
            if ((i3 & 2) != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if ((i3 & 4) != 0) {
                z3 = true;
            }
            int i4 = this.f41758b;
            if (i4 == 1 && i2 > 0) {
                if (z) {
                    f += (float) this.f41768l;
                }
                if (z2 && i2 > 1) {
                    f += (float) ((i2 - 1) * this.f41768l);
                }
                if (z3) {
                    f += (float) this.f41768l;
                }
            }
            if (i4 == 2 && i2 > 0) {
                if (z) {
                    f2 += (float) this.f41768l;
                }
                if (z2 && i2 > 1) {
                    f2 += (float) ((i2 - 1) * this.f41768l);
                }
                if (z3) {
                    f2 += (float) this.f41768l;
                }
            }
            this.f41765i = (int) f;
            this.f41766j = (int) f2;
        }

        public C16040e(C16045h hVar, int i, C16044g[] gVarArr, C16044g gVar, boolean z, int i2, int i3) {
            super(hVar);
            this.f41758b = i;
            this.f41759c = gVarArr;
            int length = gVarArr.length;
            int[] iArr = new int[2];
            iArr[1] = 2;
            iArr[0] = length;
            this.f41760d = (float[][]) Array.newInstance(Float.TYPE, iArr);
            this.f41761e = gVar;
            this.f41762f = new float[2];
            this.f41763g = z;
            this.f41764h = false;
            this.f41767k = i2;
            this.f41768l = i3;
        }
    }

    /* renamed from: com.moovit.image.l$f */
    public static class C16041f extends C16044g {

        /* renamed from: b */
        public final String f41769b;

        /* renamed from: c */
        public final String f41770c;

        /* renamed from: d */
        public final C16042a f41771d;

        /* renamed from: e */
        public final com.moovit.commons.utils.Color f41772e;

        /* renamed from: f */
        public final String f41773f;

        /* renamed from: g */
        public final ColorAdjustment f41774g;

        /* renamed from: h */
        public final String f41775h;

        /* renamed from: i */
        public final Rect f41776i;

        /* renamed from: j */
        public final float f41777j;

        /* renamed from: k */
        public int f41778k;

        /* renamed from: l */
        public int f41779l;

        /* renamed from: com.moovit.image.l$f$a */
        public static class C16042a {

            /* renamed from: d */
            public static final C20966t f41780d = new C20966t(Canvas.class);

            /* renamed from: e */
            public static final C16043a f41781e = new C16043a();

            /* renamed from: f */
            public static final ColorMatrixColorFilter f41782f = new ColorMatrixColorFilter(new float[]{-1.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 255.0f, BitmapDescriptorFactory.HUE_RED, -1.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 255.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, -1.0f, BitmapDescriptorFactory.HUE_RED, 255.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f, BitmapDescriptorFactory.HUE_RED});

            /* renamed from: a */
            public final Context f41783a;

            /* renamed from: b */
            public Drawable f41784b = null;

            /* renamed from: c */
            public C6599e f41785c;

            /* renamed from: com.moovit.image.l$f$a$a */
            public class C16043a extends ThreadLocal<float[]> {
                public final Object initialValue() {
                    return new float[]{1.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f, BitmapDescriptorFactory.HUE_RED};
                }
            }

            public C16042a(Context context) {
                this.f41783a = context;
            }

            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v1, resolved type: java.lang.Object} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v2, resolved type: o2.b$c} */
            /* JADX WARNING: Multi-variable type inference failed */
            /* JADX WARNING: Removed duplicated region for block: B:56:0x014f  */
            /* JADX WARNING: Removed duplicated region for block: B:77:0x01bc  */
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public static java.lang.Integer m40867a(android.graphics.Bitmap r23) {
                /*
                    r0 = r23
                    java.util.ArrayList r1 = new java.util.ArrayList
                    r1.<init>()
                    java.util.ArrayList r2 = new java.util.ArrayList
                    r2.<init>()
                    if (r0 == 0) goto L_0x0273
                    boolean r3 = r23.isRecycled()
                    if (r3 != 0) goto L_0x0273
                    o2.b$a r3 = p191o2.C5928b.f19038a
                    r2.add(r3)
                    o2.c r3 = p191o2.C5932c.f19048e
                    r1.add(r3)
                    o2.c r3 = p191o2.C5932c.f19049f
                    r1.add(r3)
                    o2.c r3 = p191o2.C5932c.f19050g
                    r1.add(r3)
                    o2.c r3 = p191o2.C5932c.f19051h
                    r1.add(r3)
                    o2.c r3 = p191o2.C5932c.f19052i
                    r1.add(r3)
                    o2.c r3 = p191o2.C5932c.f19053j
                    r1.add(r3)
                    r2.clear()
                    r3 = -4616189618054758400(0xbff0000000000000, double:-1.0)
                    int r5 = r23.getWidth()
                    int r6 = r23.getHeight()
                    int r6 = r6 * r5
                    r5 = 12544(0x3100, float:1.7578E-41)
                    if (r6 <= r5) goto L_0x0051
                    double r3 = (double) r5
                    double r5 = (double) r6
                    double r3 = r3 / r5
                    double r3 = java.lang.Math.sqrt(r3)
                L_0x0051:
                    r5 = 0
                    r7 = 0
                    int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                    if (r8 > 0) goto L_0x005a
                    r3 = r0
                    goto L_0x0076
                L_0x005a:
                    int r5 = r23.getWidth()
                    double r5 = (double) r5
                    double r5 = r5 * r3
                    double r5 = java.lang.Math.ceil(r5)
                    int r5 = (int) r5
                    int r6 = r23.getHeight()
                    double r8 = (double) r6
                    double r8 = r8 * r3
                    double r3 = java.lang.Math.ceil(r8)
                    int r3 = (int) r3
                    android.graphics.Bitmap r3 = android.graphics.Bitmap.createScaledBitmap(r0, r5, r3, r7)
                L_0x0076:
                    o2.a r4 = new o2.a
                    int r14 = r3.getWidth()
                    int r15 = r3.getHeight()
                    int r5 = r14 * r15
                    int[] r5 = new int[r5]
                    r10 = 0
                    r12 = 0
                    r13 = 0
                    r8 = r3
                    r9 = r5
                    r11 = r14
                    r8.getPixels(r9, r10, r11, r12, r13, r14, r15)
                    boolean r6 = r2.isEmpty()
                    if (r6 == 0) goto L_0x0095
                    r2 = 0
                    goto L_0x00a1
                L_0x0095:
                    int r6 = r2.size()
                    o2.b$b[] r6 = new p191o2.C5928b.C5930b[r6]
                    java.lang.Object[] r2 = r2.toArray(r6)
                    o2.b$b[] r2 = (p191o2.C5928b.C5930b[]) r2
                L_0x00a1:
                    r6 = 16
                    r4.<init>(r5, r6, r2)
                    if (r3 == r0) goto L_0x00ab
                    r3.recycle()
                L_0x00ab:
                    java.util.ArrayList r2 = r4.f19025c
                    android.util.SparseBooleanArray r3 = new android.util.SparseBooleanArray
                    r3.<init>()
                    s0.b r4 = new s0.b
                    r4.<init>()
                    int r5 = r2.size()
                    r6 = -2147483648(0xffffffff80000000, float:-0.0)
                    r9 = 0
                    r10 = 0
                L_0x00bf:
                    if (r9 >= r5) goto L_0x00d0
                    java.lang.Object r11 = r2.get(r9)
                    o2.b$c r11 = (p191o2.C5928b.C5931c) r11
                    int r12 = r11.f19043e
                    if (r12 <= r6) goto L_0x00cd
                    r10 = r11
                    r6 = r12
                L_0x00cd:
                    int r9 = r9 + 1
                    goto L_0x00bf
                L_0x00d0:
                    int r5 = r1.size()
                    r6 = 0
                L_0x00d5:
                    if (r6 >= r5) goto L_0x01ec
                    java.lang.Object r9 = r1.get(r6)
                    o2.c r9 = (p191o2.C5932c) r9
                    float[] r11 = r9.f19056c
                    int r11 = r11.length
                    r12 = 0
                    r13 = 0
                    r14 = 0
                L_0x00e3:
                    if (r13 >= r11) goto L_0x00f1
                    float[] r15 = r9.f19056c
                    r15 = r15[r13]
                    int r16 = (r15 > r12 ? 1 : (r15 == r12 ? 0 : -1))
                    if (r16 <= 0) goto L_0x00ee
                    float r14 = r14 + r15
                L_0x00ee:
                    int r13 = r13 + 1
                    goto L_0x00e3
                L_0x00f1:
                    int r11 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
                    if (r11 == 0) goto L_0x010a
                    float[] r11 = r9.f19056c
                    int r11 = r11.length
                    r13 = 0
                L_0x00f9:
                    if (r13 >= r11) goto L_0x010a
                    float[] r15 = r9.f19056c
                    r16 = r15[r13]
                    int r17 = (r16 > r12 ? 1 : (r16 == r12 ? 0 : -1))
                    if (r17 <= 0) goto L_0x0107
                    float r16 = r16 / r14
                    r15[r13] = r16
                L_0x0107:
                    int r13 = r13 + 1
                    goto L_0x00f9
                L_0x010a:
                    int r11 = r2.size()
                    r13 = 0
                    r14 = 0
                    r15 = 0
                L_0x0111:
                    r8 = 1
                    if (r13 >= r11) goto L_0x01ce
                    java.lang.Object r17 = r2.get(r13)
                    r12 = r17
                    o2.b$c r12 = (p191o2.C5928b.C5931c) r12
                    float[] r17 = r12.mo21917b()
                    r19 = r17[r8]
                    float[] r8 = r9.f19054a
                    r21 = r8[r7]
                    r22 = 2
                    int r21 = (r19 > r21 ? 1 : (r19 == r21 ? 0 : -1))
                    if (r21 < 0) goto L_0x014c
                    r8 = r8[r22]
                    int r8 = (r19 > r8 ? 1 : (r19 == r8 ? 0 : -1))
                    if (r8 > 0) goto L_0x014c
                    r8 = r17[r22]
                    float[] r0 = r9.f19055b
                    r17 = r0[r7]
                    int r17 = (r8 > r17 ? 1 : (r8 == r17 ? 0 : -1))
                    if (r17 < 0) goto L_0x014c
                    r0 = r0[r22]
                    int r0 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
                    if (r0 > 0) goto L_0x014c
                    int r0 = r12.f19042d
                    boolean r0 = r3.get(r0)
                    if (r0 != 0) goto L_0x014c
                    r0 = 1
                    goto L_0x014d
                L_0x014c:
                    r0 = 0
                L_0x014d:
                    if (r0 == 0) goto L_0x01bc
                    float[] r0 = r12.mo21917b()
                    if (r10 == 0) goto L_0x015a
                    int r8 = r10.f19043e
                    r17 = r1
                    goto L_0x015d
                L_0x015a:
                    r17 = r1
                    r8 = 1
                L_0x015d:
                    float[] r1 = r9.f19056c
                    r1 = r1[r7]
                    r19 = 1065353216(0x3f800000, float:1.0)
                    r18 = 0
                    int r21 = (r1 > r18 ? 1 : (r1 == r18 ? 0 : -1))
                    if (r21 <= 0) goto L_0x017c
                    r20 = 1
                    r21 = r0[r20]
                    float[] r7 = r9.f19054a
                    r7 = r7[r20]
                    float r21 = r21 - r7
                    float r7 = java.lang.Math.abs(r21)
                    float r7 = r19 - r7
                    float r1 = r1 * r7
                    goto L_0x017f
                L_0x017c:
                    r20 = 1
                    r1 = 0
                L_0x017f:
                    float[] r7 = r9.f19056c
                    r7 = r7[r20]
                    r18 = 0
                    int r21 = (r7 > r18 ? 1 : (r7 == r18 ? 0 : -1))
                    if (r21 <= 0) goto L_0x019b
                    r0 = r0[r22]
                    r21 = r5
                    float[] r5 = r9.f19055b
                    r5 = r5[r20]
                    float r0 = r0 - r5
                    float r0 = java.lang.Math.abs(r0)
                    float r19 = r19 - r0
                    float r0 = r19 * r7
                    goto L_0x019e
                L_0x019b:
                    r21 = r5
                    r0 = 0
                L_0x019e:
                    float[] r5 = r9.f19056c
                    r5 = r5[r22]
                    r18 = 0
                    int r7 = (r5 > r18 ? 1 : (r5 == r18 ? 0 : -1))
                    if (r7 <= 0) goto L_0x01b0
                    int r7 = r12.f19043e
                    float r7 = (float) r7
                    float r8 = (float) r8
                    float r7 = r7 / r8
                    float r5 = r5 * r7
                    goto L_0x01b1
                L_0x01b0:
                    r5 = 0
                L_0x01b1:
                    float r1 = r1 + r0
                    float r1 = r1 + r5
                    if (r14 == 0) goto L_0x01b9
                    int r0 = (r1 > r15 ? 1 : (r1 == r15 ? 0 : -1))
                    if (r0 <= 0) goto L_0x01c2
                L_0x01b9:
                    r15 = r1
                    r14 = r12
                    goto L_0x01c2
                L_0x01bc:
                    r17 = r1
                    r21 = r5
                    r18 = 0
                L_0x01c2:
                    int r13 = r13 + 1
                    r7 = 0
                    r12 = 0
                    r0 = r23
                    r1 = r17
                    r5 = r21
                    goto L_0x0111
                L_0x01ce:
                    r17 = r1
                    r21 = r5
                    if (r14 == 0) goto L_0x01de
                    boolean r0 = r9.f19057d
                    if (r0 == 0) goto L_0x01de
                    int r0 = r14.f19042d
                    r1 = 1
                    r3.append(r0, r1)
                L_0x01de:
                    r4.put(r9, r14)
                    int r6 = r6 + 1
                    r7 = 0
                    r0 = r23
                    r1 = r17
                    r5 = r21
                    goto L_0x00d5
                L_0x01ec:
                    r3.clear()
                    java.util.List r0 = java.util.Collections.unmodifiableList(r2)
                    boolean r0 = r0.isEmpty()
                    if (r0 == 0) goto L_0x01fb
                    r0 = 0
                    return r0
                L_0x01fb:
                    r0 = 0
                    if (r10 != 0) goto L_0x01ff
                    return r0
                L_0x01ff:
                    int r1 = r23.getWidth()
                    int r2 = r23.getHeight()
                    int r2 = r2 * r1
                    double r1 = (double) r2
                    r5 = 4587366580439587226(0x3fa999999999999a, double:0.05)
                    double r1 = r1 * r5
                    int r1 = (int) r1
                    o2.c r2 = p191o2.C5932c.f19049f
                    java.lang.Object r2 = r4.getOrDefault(r2, r0)
                    o2.b$c r2 = (p191o2.C5928b.C5931c) r2
                    boolean r2 = m40868b(r10, r2, r1)
                    if (r2 == 0) goto L_0x0221
                    return r0
                L_0x0221:
                    o2.c r2 = p191o2.C5932c.f19048e
                    java.lang.Object r2 = r4.getOrDefault(r2, r0)
                    o2.b$c r2 = (p191o2.C5928b.C5931c) r2
                    boolean r2 = m40868b(r10, r2, r1)
                    if (r2 == 0) goto L_0x0230
                    return r0
                L_0x0230:
                    o2.c r2 = p191o2.C5932c.f19050g
                    java.lang.Object r2 = r4.getOrDefault(r2, r0)
                    o2.b$c r2 = (p191o2.C5928b.C5931c) r2
                    boolean r2 = m40868b(r10, r2, r1)
                    if (r2 == 0) goto L_0x023f
                    return r0
                L_0x023f:
                    o2.c r2 = p191o2.C5932c.f19052i
                    java.lang.Object r2 = r4.getOrDefault(r2, r0)
                    o2.b$c r2 = (p191o2.C5928b.C5931c) r2
                    boolean r2 = m40868b(r10, r2, r1)
                    if (r2 == 0) goto L_0x024e
                    return r0
                L_0x024e:
                    o2.c r2 = p191o2.C5932c.f19051h
                    java.lang.Object r2 = r4.getOrDefault(r2, r0)
                    o2.b$c r2 = (p191o2.C5928b.C5931c) r2
                    boolean r2 = m40868b(r10, r2, r1)
                    if (r2 == 0) goto L_0x025d
                    return r0
                L_0x025d:
                    o2.c r2 = p191o2.C5932c.f19053j
                    java.lang.Object r2 = r4.getOrDefault(r2, r0)
                    o2.b$c r2 = (p191o2.C5928b.C5931c) r2
                    boolean r1 = m40868b(r10, r2, r1)
                    if (r1 == 0) goto L_0x026c
                    return r0
                L_0x026c:
                    int r0 = r10.f19042d
                    java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                    return r0
                L_0x0273:
                    java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                    java.lang.String r1 = "Bitmap is not valid"
                    r0.<init>(r1)
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.moovit.image.C16035l.C16041f.C16042a.m40867a(android.graphics.Bitmap):java.lang.Integer");
            }

            /* renamed from: b */
            public static boolean m40868b(C5928b.C5931c cVar, C5928b.C5931c cVar2, int i) {
                if (cVar2 == null || cVar2.f19043e < i || cVar2.equals(cVar)) {
                    return false;
                }
                return com.moovit.commons.utils.Color.m40222g(cVar.f19042d, cVar2.f19042d, 10);
            }
        }

        public C16041f(C16045h hVar, String str, String str2, String str3, ColorAdjustment colorAdjustment, String str4) {
            super(hVar);
            this.f41769b = str;
            this.f41770c = str2;
            this.f41771d = null;
            this.f41772e = null;
            this.f41773f = str3;
            this.f41774g = colorAdjustment;
            this.f41775h = str4;
            this.f41776i = null;
            this.f41777j = BitmapDescriptorFactory.HUE_RED;
        }

        /* renamed from: a */
        public final C16044g mo48209a(Context context, String[] strArr) throws JSONException {
            String[] strArr2;
            String str;
            com.moovit.commons.utils.Color color;
            int i;
            String str2 = this.f41770c;
            if (str2 == null) {
                strArr2 = null;
            } else {
                String[] split = str2.split("-");
                int parseInt = Integer.parseInt(split[0].trim()) - 1;
                if (split.length == 1) {
                    i = strArr.length;
                } else {
                    i = Integer.parseInt(split[1].trim());
                }
                int i2 = ((i - 1) - parseInt) + 1;
                strArr2 = new String[i2];
                System.arraycopy(strArr, parseInt, strArr2, 0, i2);
            }
            String str3 = this.f41769b;
            C18659h hVar = C16035l.f41753a;
            String str4 = C20964s0.f52718a;
            String format = String.format((Locale) null, str3, strArr);
            if ("0".equals(format)) {
                return null;
            }
            Image j = C16028g.m40832j(Integer.parseInt(format), strArr2);
            if (j == null) {
                C16596f.m42113a().mo49363b("Image with id " + format + " could not be decoded");
                return null;
            }
            C16042a aVar = new C16042a(context);
            try {
                C6599e e0 = C17884p.m44353X(context).mo51642v(j).mo51628o0(j).mo22740y(Priority.IMMEDIATE).mo22721L().mo22727j().mo10863e0(Integer.MIN_VALUE, Integer.MIN_VALUE);
                aVar.f41785c = e0;
                aVar.f41784b = (Drawable) e0.get(20, TimeUnit.SECONDS);
            } catch (Exception unused) {
                Objects.toString(j);
                aVar.f41784b = null;
            }
            if (aVar.f41784b == null) {
                return null;
            }
            String str5 = this.f41773f;
            if (str5 != null) {
                String str6 = C20964s0.f52718a;
                str = String.format((Locale) null, str5, strArr);
            } else {
                str = null;
            }
            if (!C20964s0.m49090h(str)) {
                color = com.moovit.commons.utils.Color.m40224k(str);
            } else {
                color = null;
            }
            return new C16041f(this.f41786a, aVar, color, this.f41774g, Float.parseFloat(String.format((Locale) null, this.f41775h, strArr)));
        }

        /* renamed from: b */
        public final void mo48210b(Canvas canvas, Bitmap bitmap, int i, int i2, int i3, int i4, C16039d dVar) {
            Integer num;
            int i5;
            Canvas canvas2 = canvas;
            int i6 = i3;
            if (i6 == -1) {
                i6 = i;
            }
            int i7 = i4;
            if (i7 == -1) {
                i7 = i2;
            }
            C16045h hVar = this.f41786a;
            float f = (float) i6;
            int leftFor = (int) hVar.f41793g.getLeftFor(hVar.f41787a, hVar.f41791e, f, i);
            C16045h hVar2 = this.f41786a;
            int topFor = (int) hVar2.f41794h.getTopFor(hVar2.f41788b, hVar2.f41792f, (float) i7, i2);
            Bitmap bitmap2 = bitmap;
            int a = C16035l.m40843a(bitmap2, canvas2, (f * 0.5f) + ((float) leftFor), ((float) topFor) * 0.5f);
            C16042a aVar = this.f41771d;
            com.moovit.commons.utils.Color color = this.f41772e;
            ColorAdjustment colorAdjustment = this.f41774g;
            if (color != null) {
                if (!UiUtils.m40253l(aVar.f41783a) || colorAdjustment.f41699a != ColorAdjustment.Mode.AUTO) {
                    i5 = color.f41007b;
                } else {
                    i5 = C16035l.m40844b(a, color.f41007b);
                }
                Drawable drawable = aVar.f41784b;
                if (drawable != null) {
                    PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                    ColorStateList valueOf = ColorStateList.valueOf(i5);
                    Drawable g = C5450a.m13604g(drawable.mutate());
                    C5450a.C5452b.m13617h(g, valueOf);
                    if (mode != null) {
                        C5450a.C5452b.m13618i(g, mode);
                    }
                    aVar.f41784b = g;
                }
            } else if (UiUtils.m40253l(aVar.f41783a)) {
                int i8 = C16038c.f41757a[colorAdjustment.f41699a.ordinal()];
                if (i8 == 1) {
                    com.moovit.commons.utils.Color color2 = colorAdjustment.f41700b;
                    if (color2 != null) {
                        int i9 = color2.f41007b;
                        Drawable drawable2 = aVar.f41784b;
                        if (drawable2 != null) {
                            PorterDuff.Mode mode2 = PorterDuff.Mode.SRC_IN;
                            ColorStateList valueOf2 = ColorStateList.valueOf(i9);
                            Drawable g2 = C5450a.m13604g(drawable2.mutate());
                            C5450a.C5452b.m13617h(g2, valueOf2);
                            if (mode2 != null) {
                                C5450a.C5452b.m13618i(g2, mode2);
                            }
                            aVar.f41784b = g2;
                        }
                    }
                } else if (i8 == 2) {
                    Drawable drawable3 = aVar.f41784b;
                    if (drawable3 != null) {
                        if (drawable3 instanceof BitmapDrawable) {
                            num = C16042a.m40867a(((BitmapDrawable) drawable3).getBitmap());
                        } else {
                            Canvas canvas3 = (Canvas) C16042a.f41780d.get();
                            int intrinsicWidth = aVar.f41784b.getIntrinsicWidth();
                            int intrinsicHeight = aVar.f41784b.getIntrinsicHeight();
                            if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
                                num = null;
                            } else {
                                Bitmap a2 = dVar.mo48208a(intrinsicWidth, intrinsicHeight);
                                canvas3.setBitmap(a2);
                                Drawable drawable4 = aVar.f41784b;
                                int intrinsicWidth2 = drawable4.getIntrinsicWidth();
                                int intrinsicHeight2 = drawable4.getIntrinsicHeight();
                                Rect bounds = drawable4.getBounds();
                                drawable4.setBounds(0, 0, intrinsicWidth2, intrinsicHeight2);
                                drawable4.draw(canvas3);
                                drawable4.setBounds(bounds);
                                num = C16042a.m40867a(a2);
                            }
                        }
                        if (num != null && Color.alpha(a) >= 255 && com.moovit.commons.utils.Color.m40219c(a, num.intValue()) < 4.5d) {
                            if (!com.moovit.commons.utils.Color.m40222g(a, num.intValue(), 50)) {
                                Drawable drawable5 = aVar.f41784b;
                                if (drawable5 != null) {
                                    drawable5.setColorFilter(C16042a.f41782f);
                                }
                            } else {
                                int intValue = num.intValue();
                                float[] fArr = (float[]) com.moovit.commons.utils.Color.f40999c.get();
                                Color.colorToHSV(intValue, fArr);
                                float f2 = fArr[2];
                                int b = C16035l.m40844b(a, num.intValue());
                                while (b != num.intValue()) {
                                    num = Integer.valueOf(b);
                                    b = C16035l.m40844b(a, num.intValue());
                                }
                                float[] fArr2 = (float[]) com.moovit.commons.utils.Color.f40999c.get();
                                Color.colorToHSV(b, fArr2);
                                float f3 = fArr2[2] - f2;
                                if (aVar.f41784b != null) {
                                    float[] fArr3 = (float[]) C16042a.f41781e.get();
                                    float f4 = f3 * 255.0f;
                                    fArr3[14] = f4;
                                    fArr3[9] = f4;
                                    fArr3[4] = f4;
                                    aVar.f41784b.setColorFilter(new ColorMatrixColorFilter(fArr3));
                                }
                            }
                        }
                    } else {
                        throw new IllegalStateException("Did you call resolve(Image) or considered resolving failure?");
                    }
                }
            }
            Drawable drawable6 = this.f41771d.f41784b;
            if (drawable6 != null) {
                drawable6.setBounds(leftFor, topFor, i6 + leftFor, i7 + topFor);
                drawable6.draw(canvas2);
                C16042a aVar2 = this.f41771d;
                if (aVar2.f41785c != null) {
                    C17884p.m44353X(aVar2.f41783a).mo10873o(aVar2.f41785c);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Did you call resolve(Image) or considered resolving failure?");
        }

        /* renamed from: c */
        public final int mo48211c() {
            return this.f41779l;
        }

        /* renamed from: d */
        public final int mo48212d() {
            return this.f41778k;
        }

        /* renamed from: f */
        public final int mo48214f() {
            return this.f41776i.bottom;
        }

        /* renamed from: g */
        public final int mo48215g() {
            return this.f41776i.left;
        }

        /* renamed from: h */
        public final int mo48216h() {
            return this.f41776i.right;
        }

        /* renamed from: i */
        public final int mo48217i() {
            return this.f41776i.top;
        }

        /* renamed from: k */
        public final void mo48213k() {
            boolean z;
            float f;
            float f2;
            Drawable drawable = this.f41771d.f41784b;
            if (drawable != null) {
                float intrinsicWidth = this.f41777j * ((float) drawable.getIntrinsicWidth());
                int i = this.f41786a.f41789c;
                boolean z2 = true;
                if (i >= 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    f = (float) i;
                } else {
                    f = intrinsicWidth;
                }
                float intrinsicHeight = this.f41777j * ((float) drawable.getIntrinsicHeight());
                int i2 = this.f41786a.f41790d;
                if (i2 < 0) {
                    z2 = false;
                }
                if (z2) {
                    f2 = (float) i2;
                } else {
                    f2 = intrinsicHeight;
                }
                if (intrinsicHeight > f2 || intrinsicWidth > f) {
                    float min = Math.min(f2 / intrinsicHeight, f / intrinsicWidth);
                    intrinsicWidth *= min;
                    intrinsicHeight *= min;
                }
                this.f41778k = (int) Math.ceil((double) intrinsicWidth);
                this.f41779l = (int) Math.ceil((double) intrinsicHeight);
                return;
            }
            throw new IllegalStateException("Did you call resolve(Image) or considered resolving failure?");
        }

        public C16041f(C16045h hVar, C16042a aVar, com.moovit.commons.utils.Color color, ColorAdjustment colorAdjustment, float f) {
            super(hVar);
            this.f41769b = null;
            this.f41770c = null;
            this.f41771d = aVar;
            this.f41772e = color;
            this.f41773f = null;
            C21100e.m49373x(colorAdjustment, "colorAdjustment");
            this.f41774g = colorAdjustment;
            this.f41775h = null;
            Rect rect = new Rect();
            Drawable drawable = aVar.f41784b;
            if (drawable != null) {
                drawable.getPadding(rect);
                this.f41776i = rect;
                this.f41777j = f;
                return;
            }
            throw new IllegalStateException("Did you call resolve(Image) or considered resolving failure?");
        }
    }
}
