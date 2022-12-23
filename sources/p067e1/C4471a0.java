package p067e1;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import p055d1.C4327c;
import p055d1.C4328d;
import p055d1.C4329e;

/* renamed from: e1.a0 */
public abstract class C4471a0 {
    public CharSequence mBigContentTitle;
    public C4522y mBuilder;
    public CharSequence mSummaryText;
    public boolean mSummaryTextSet = false;

    private int calculateTopPadding() {
        Resources resources = this.mBuilder.f15620a.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(C4327c.notification_top_pad);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(C4327c.notification_top_pad_large_text);
        float constrain = (constrain(resources.getConfiguration().fontScale, 1.0f, 1.3f) - 1.0f) / 0.29999995f;
        return Math.round((constrain * ((float) dimensionPixelSize2)) + ((1.0f - constrain) * ((float) dimensionPixelSize)));
    }

    private static float constrain(float f, float f2, float f3) {
        return f < f2 ? f2 : f > f3 ? f3 : f;
    }

    private Bitmap createIconWithBackground(int i, int i2, int i3, int i4) {
        int i5 = C4328d.notification_icon_background;
        if (i4 == 0) {
            i4 = 0;
        }
        Bitmap createColoredBitmap = createColoredBitmap(i5, i4, i2);
        Canvas canvas = new Canvas(createColoredBitmap);
        Drawable mutate = this.mBuilder.f15620a.getResources().getDrawable(i).mutate();
        mutate.setFilterBitmap(true);
        int i6 = (i2 - i3) / 2;
        int i7 = i3 + i6;
        mutate.setBounds(i6, i6, i7, i7);
        mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_ATOP));
        mutate.draw(canvas);
        return createColoredBitmap;
    }

    private void hideNormalContent(RemoteViews remoteViews) {
        remoteViews.setViewVisibility(C4329e.title, 8);
        remoteViews.setViewVisibility(C4329e.text2, 8);
        remoteViews.setViewVisibility(C4329e.text, 8);
    }

    public void addCompatExtras(Bundle bundle) {
        if (this.mSummaryTextSet) {
            bundle.putCharSequence("android.summaryText", this.mSummaryText);
        }
        CharSequence charSequence = this.mBigContentTitle;
        if (charSequence != null) {
            bundle.putCharSequence("android.title.big", charSequence);
        }
        String className = getClassName();
        if (className != null) {
            bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", className);
        }
    }

    public void apply(C4508n nVar) {
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x010a  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0134  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x014c  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0151  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0153  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x015d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.widget.RemoteViews applyStandardTemplate(boolean r12, int r13, boolean r14) {
        /*
            r11 = this;
            e1.y r0 = r11.mBuilder
            android.content.Context r0 = r0.f15620a
            android.content.res.Resources r0 = r0.getResources()
            android.widget.RemoteViews r7 = new android.widget.RemoteViews
            e1.y r1 = r11.mBuilder
            android.content.Context r1 = r1.f15620a
            java.lang.String r1 = r1.getPackageName()
            r7.<init>(r1, r13)
            e1.y r13 = r11.mBuilder
            int r1 = r13.f15629j
            android.graphics.Bitmap r1 = r13.f15627h
            r8 = 0
            if (r1 == 0) goto L_0x0059
            int r13 = p055d1.C4329e.icon
            r7.setViewVisibility(r13, r8)
            e1.y r1 = r11.mBuilder
            android.graphics.Bitmap r1 = r1.f15627h
            r7.setImageViewBitmap(r13, r1)
            if (r12 == 0) goto L_0x0088
            e1.y r12 = r11.mBuilder
            android.app.Notification r12 = r12.f15644y
            int r12 = r12.icon
            if (r12 == 0) goto L_0x0088
            int r12 = p055d1.C4327c.notification_right_icon_size
            int r12 = r0.getDimensionPixelSize(r12)
            int r13 = p055d1.C4327c.notification_small_icon_background_padding
            int r13 = r0.getDimensionPixelSize(r13)
            int r13 = r13 * 2
            int r13 = r12 - r13
            e1.y r1 = r11.mBuilder
            android.app.Notification r2 = r1.f15644y
            int r2 = r2.icon
            int r1 = r1.f15636q
            android.graphics.Bitmap r12 = r11.createIconWithBackground(r2, r12, r13, r1)
            int r13 = p055d1.C4329e.right_icon
            r7.setImageViewBitmap(r13, r12)
            r7.setViewVisibility(r13, r8)
            goto L_0x0088
        L_0x0059:
            if (r12 == 0) goto L_0x0088
            android.app.Notification r12 = r13.f15644y
            int r12 = r12.icon
            if (r12 == 0) goto L_0x0088
            int r12 = p055d1.C4329e.icon
            r7.setViewVisibility(r12, r8)
            int r13 = p055d1.C4327c.notification_large_icon_width
            int r13 = r0.getDimensionPixelSize(r13)
            int r1 = p055d1.C4327c.notification_big_circle_margin
            int r1 = r0.getDimensionPixelSize(r1)
            int r13 = r13 - r1
            int r1 = p055d1.C4327c.notification_small_icon_size_as_large
            int r1 = r0.getDimensionPixelSize(r1)
            e1.y r2 = r11.mBuilder
            android.app.Notification r3 = r2.f15644y
            int r3 = r3.icon
            int r2 = r2.f15636q
            android.graphics.Bitmap r13 = r11.createIconWithBackground(r3, r13, r1, r2)
            r7.setImageViewBitmap(r12, r13)
        L_0x0088:
            e1.y r12 = r11.mBuilder
            java.lang.CharSequence r12 = r12.f15624e
            if (r12 == 0) goto L_0x0093
            int r13 = p055d1.C4329e.title
            r7.setTextViewText(r13, r12)
        L_0x0093:
            e1.y r12 = r11.mBuilder
            java.lang.CharSequence r12 = r12.f15625f
            r13 = 1
            if (r12 == 0) goto L_0x00a1
            int r1 = p055d1.C4329e.text
            r7.setTextViewText(r1, r12)
            r12 = 1
            goto L_0x00a2
        L_0x00a1:
            r12 = 0
        L_0x00a2:
            e1.y r1 = r11.mBuilder
            r1.getClass()
            e1.y r1 = r11.mBuilder
            int r1 = r1.f15628i
            r9 = 8
            if (r1 <= 0) goto L_0x00e1
            int r12 = p055d1.C4330f.status_bar_notification_info_maxnum
            int r12 = r0.getInteger(r12)
            e1.y r1 = r11.mBuilder
            int r1 = r1.f15628i
            if (r1 <= r12) goto L_0x00c7
            int r12 = p055d1.C4329e.info
            int r1 = p055d1.C4332h.status_bar_notification_info_overflow
            java.lang.String r1 = r0.getString(r1)
            r7.setTextViewText(r12, r1)
            goto L_0x00d9
        L_0x00c7:
            java.text.NumberFormat r12 = java.text.NumberFormat.getIntegerInstance()
            int r1 = p055d1.C4329e.info
            e1.y r2 = r11.mBuilder
            int r2 = r2.f15628i
            long r2 = (long) r2
            java.lang.String r12 = r12.format(r2)
            r7.setTextViewText(r1, r12)
        L_0x00d9:
            int r12 = p055d1.C4329e.info
            r7.setViewVisibility(r12, r8)
            r12 = 1
            r10 = 1
            goto L_0x00e7
        L_0x00e1:
            int r1 = p055d1.C4329e.info
            r7.setViewVisibility(r1, r9)
            r10 = 0
        L_0x00e7:
            e1.y r1 = r11.mBuilder
            java.lang.CharSequence r1 = r1.f15632m
            if (r1 == 0) goto L_0x0107
            int r2 = p055d1.C4329e.text
            r7.setTextViewText(r2, r1)
            e1.y r1 = r11.mBuilder
            java.lang.CharSequence r1 = r1.f15625f
            if (r1 == 0) goto L_0x0102
            int r2 = p055d1.C4329e.text2
            r7.setTextViewText(r2, r1)
            r7.setViewVisibility(r2, r8)
            r1 = 1
            goto L_0x0108
        L_0x0102:
            int r1 = p055d1.C4329e.text2
            r7.setViewVisibility(r1, r9)
        L_0x0107:
            r1 = 0
        L_0x0108:
            if (r1 == 0) goto L_0x0122
            if (r14 == 0) goto L_0x0118
            int r14 = p055d1.C4327c.notification_subtext_size
            int r14 = r0.getDimensionPixelSize(r14)
            float r14 = (float) r14
            int r0 = p055d1.C4329e.text
            r7.setTextViewTextSize(r0, r8, r14)
        L_0x0118:
            int r2 = p055d1.C4329e.line1
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r1 = r7
            r1.setViewPadding(r2, r3, r4, r5, r6)
        L_0x0122:
            e1.y r14 = r11.mBuilder
            boolean r0 = r14.f15630k
            r1 = 0
            if (r0 == 0) goto L_0x012f
            android.app.Notification r0 = r14.f15644y
            long r3 = r0.when
            goto L_0x0130
        L_0x012f:
            r3 = r1
        L_0x0130:
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x014c
            r14.getClass()
            int r14 = p055d1.C4329e.time
            r7.setViewVisibility(r14, r8)
            e1.y r0 = r11.mBuilder
            boolean r3 = r0.f15630k
            if (r3 == 0) goto L_0x0146
            android.app.Notification r0 = r0.f15644y
            long r1 = r0.when
        L_0x0146:
            java.lang.String r0 = "setTime"
            r7.setLong(r14, r0, r1)
            goto L_0x014d
        L_0x014c:
            r13 = r10
        L_0x014d:
            int r14 = p055d1.C4329e.right_side
            if (r13 == 0) goto L_0x0153
            r13 = 0
            goto L_0x0155
        L_0x0153:
            r13 = 8
        L_0x0155:
            r7.setViewVisibility(r14, r13)
            int r13 = p055d1.C4329e.line3
            if (r12 == 0) goto L_0x015d
            goto L_0x015f
        L_0x015d:
            r8 = 8
        L_0x015f:
            r7.setViewVisibility(r13, r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p067e1.C4471a0.applyStandardTemplate(boolean, int, boolean):android.widget.RemoteViews");
    }

    public void buildIntoRemoteViews(RemoteViews remoteViews, RemoteViews remoteViews2) {
        hideNormalContent(remoteViews);
        int i = C4329e.notification_main_column;
        remoteViews.removeAllViews(i);
        remoteViews.addView(i, remoteViews2.clone());
        remoteViews.setViewVisibility(i, 0);
        remoteViews.setViewPadding(C4329e.notification_main_column_container, 0, calculateTopPadding(), 0, 0);
    }

    public Bitmap createColoredBitmap(IconCompat iconCompat, int i) {
        return createColoredBitmap(iconCompat, i, 0);
    }

    public String getClassName() {
        return null;
    }

    public RemoteViews makeBigContentView(C4508n nVar) {
        return null;
    }

    public RemoteViews makeContentView(C4508n nVar) {
        return null;
    }

    public RemoteViews makeHeadsUpContentView(C4508n nVar) {
        return null;
    }

    public void setBuilder(C4522y yVar) {
        if (this.mBuilder != yVar) {
            this.mBuilder = yVar;
            if (yVar != null) {
                yVar.mo20037i(this);
            }
        }
    }

    private Bitmap createColoredBitmap(int i, int i2, int i3) {
        Context context = this.mBuilder.f15620a;
        PorterDuff.Mode mode = IconCompat.f3343k;
        context.getClass();
        return createColoredBitmap(IconCompat.m2335b(context.getResources(), context.getPackageName(), i), i2, i3);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0083, code lost:
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0119, code lost:
        if (r1 == null) goto L_0x0132;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x011d, code lost:
        if (r11.f3350g != null) goto L_0x0125;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0123, code lost:
        if (r11.f3351h == androidx.core.graphics.drawable.IconCompat.f3343k) goto L_0x0132;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0125, code lost:
        r1.mutate();
        p141k1.C5450a.C5452b.m13617h(r1, r11.f3350g);
        p141k1.C5450a.C5452b.m13618i(r1, r11.f3351h);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0132, code lost:
        r11 = r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.graphics.Bitmap createColoredBitmap(androidx.core.graphics.drawable.IconCompat r11, int r12, int r13) {
        /*
            r10 = this;
            e1.y r0 = r10.mBuilder
            android.content.Context r0 = r0.f15620a
            int r1 = r11.f3344a
            r2 = 1
            r3 = 2
            r4 = 0
            if (r1 != r3) goto L_0x0050
            java.lang.Object r1 = r11.f3345b
            if (r1 == 0) goto L_0x0050
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r5 = ":"
            boolean r6 = r1.contains(r5)
            if (r6 != 0) goto L_0x001a
            goto L_0x0050
        L_0x001a:
            r6 = -1
            java.lang.String[] r7 = r1.split(r5, r6)
            r7 = r7[r2]
            java.lang.String r8 = "/"
            java.lang.String[] r9 = r7.split(r8, r6)
            r9 = r9[r4]
            java.lang.String[] r7 = r7.split(r8, r6)
            r7 = r7[r2]
            java.lang.String[] r1 = r1.split(r5, r6)
            r1 = r1[r4]
            java.lang.String r5 = "0_resource_name_obfuscated"
            boolean r5 = r5.equals(r7)
            if (r5 == 0) goto L_0x003e
            goto L_0x0050
        L_0x003e:
            java.lang.String r5 = r11.mo3429e()
            android.content.res.Resources r5 = androidx.core.graphics.drawable.IconCompat.m2336f(r0, r5)
            int r1 = r5.getIdentifier(r7, r9, r1)
            int r5 = r11.f3348e
            if (r5 == r1) goto L_0x0050
            r11.f3348e = r1
        L_0x0050:
            int r1 = android.os.Build.VERSION.SDK_INT
            r5 = 23
            if (r1 < r5) goto L_0x0060
            android.graphics.drawable.Icon r11 = r11.mo3433j(r0)
            android.graphics.drawable.Drawable r11 = androidx.core.graphics.drawable.IconCompat.C0774a.m2348e(r11, r0)
            goto L_0x0133
        L_0x0060:
            int r5 = r11.f3344a
            r6 = 0
            switch(r5) {
                case 1: goto L_0x010a;
                case 2: goto L_0x00d7;
                case 3: goto L_0x00c1;
                case 4: goto L_0x00ac;
                case 5: goto L_0x0099;
                case 6: goto L_0x0068;
                default: goto L_0x0066;
            }
        L_0x0066:
            goto L_0x0118
        L_0x0068:
            java.io.InputStream r2 = r11.mo3432i(r0)
            if (r2 == 0) goto L_0x0118
            r3 = 26
            if (r1 < r3) goto L_0x0086
            android.graphics.drawable.BitmapDrawable r1 = new android.graphics.drawable.BitmapDrawable
            android.content.res.Resources r0 = r0.getResources()
            android.graphics.Bitmap r2 = android.graphics.BitmapFactory.decodeStream(r2)
            r1.<init>(r0, r2)
            android.graphics.drawable.Drawable r0 = androidx.core.graphics.drawable.IconCompat.C0775b.m2350a(r6, r1)
        L_0x0083:
            r1 = r0
            goto L_0x0119
        L_0x0086:
            android.graphics.drawable.BitmapDrawable r1 = new android.graphics.drawable.BitmapDrawable
            android.content.res.Resources r0 = r0.getResources()
            android.graphics.Bitmap r2 = android.graphics.BitmapFactory.decodeStream(r2)
            android.graphics.Bitmap r2 = androidx.core.graphics.drawable.IconCompat.m2334a(r2, r4)
            r1.<init>(r0, r2)
            goto L_0x0119
        L_0x0099:
            android.graphics.drawable.BitmapDrawable r1 = new android.graphics.drawable.BitmapDrawable
            android.content.res.Resources r0 = r0.getResources()
            java.lang.Object r2 = r11.f3345b
            android.graphics.Bitmap r2 = (android.graphics.Bitmap) r2
            android.graphics.Bitmap r2 = androidx.core.graphics.drawable.IconCompat.m2334a(r2, r4)
            r1.<init>(r0, r2)
            goto L_0x0119
        L_0x00ac:
            java.io.InputStream r1 = r11.mo3432i(r0)
            if (r1 == 0) goto L_0x0118
            android.graphics.drawable.BitmapDrawable r2 = new android.graphics.drawable.BitmapDrawable
            android.content.res.Resources r0 = r0.getResources()
            android.graphics.Bitmap r1 = android.graphics.BitmapFactory.decodeStream(r1)
            r2.<init>(r0, r1)
            r1 = r2
            goto L_0x0119
        L_0x00c1:
            android.graphics.drawable.BitmapDrawable r1 = new android.graphics.drawable.BitmapDrawable
            android.content.res.Resources r0 = r0.getResources()
            java.lang.Object r2 = r11.f3345b
            byte[] r2 = (byte[]) r2
            int r3 = r11.f3348e
            int r5 = r11.f3349f
            android.graphics.Bitmap r2 = android.graphics.BitmapFactory.decodeByteArray(r2, r3, r5)
            r1.<init>(r0, r2)
            goto L_0x0119
        L_0x00d7:
            java.lang.String r1 = r11.mo3429e()
            boolean r5 = android.text.TextUtils.isEmpty(r1)
            if (r5 == 0) goto L_0x00e5
            java.lang.String r1 = r0.getPackageName()
        L_0x00e5:
            android.content.res.Resources r1 = androidx.core.graphics.drawable.IconCompat.m2336f(r0, r1)
            int r5 = r11.f3348e     // Catch:{ RuntimeException -> 0x00f6 }
            android.content.res.Resources$Theme r0 = r0.getTheme()     // Catch:{ RuntimeException -> 0x00f6 }
            java.lang.ThreadLocal<android.util.TypedValue> r7 = p116i1.C5247f.f17365a     // Catch:{ RuntimeException -> 0x00f6 }
            android.graphics.drawable.Drawable r0 = p116i1.C5247f.C5248a.m13264a(r1, r5, r0)     // Catch:{ RuntimeException -> 0x00f6 }
            goto L_0x0083
        L_0x00f6:
            java.lang.Object[] r0 = new java.lang.Object[r3]
            int r1 = r11.f3348e
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0[r4] = r1
            java.lang.Object r1 = r11.f3345b
            r0[r2] = r1
            java.lang.String r1 = "Unable to load resource 0x%08x from pkg=%s"
            java.lang.String.format(r1, r0)
            goto L_0x0118
        L_0x010a:
            android.graphics.drawable.BitmapDrawable r1 = new android.graphics.drawable.BitmapDrawable
            android.content.res.Resources r0 = r0.getResources()
            java.lang.Object r2 = r11.f3345b
            android.graphics.Bitmap r2 = (android.graphics.Bitmap) r2
            r1.<init>(r0, r2)
            goto L_0x0119
        L_0x0118:
            r1 = r6
        L_0x0119:
            if (r1 == 0) goto L_0x0132
            android.content.res.ColorStateList r0 = r11.f3350g
            if (r0 != 0) goto L_0x0125
            android.graphics.PorterDuff$Mode r0 = r11.f3351h
            android.graphics.PorterDuff$Mode r2 = androidx.core.graphics.drawable.IconCompat.f3343k
            if (r0 == r2) goto L_0x0132
        L_0x0125:
            r1.mutate()
            android.content.res.ColorStateList r0 = r11.f3350g
            p141k1.C5450a.C5452b.m13617h(r1, r0)
            android.graphics.PorterDuff$Mode r11 = r11.f3351h
            p141k1.C5450a.C5452b.m13618i(r1, r11)
        L_0x0132:
            r11 = r1
        L_0x0133:
            if (r13 != 0) goto L_0x013a
            int r0 = r11.getIntrinsicWidth()
            goto L_0x013b
        L_0x013a:
            r0 = r13
        L_0x013b:
            if (r13 != 0) goto L_0x0141
            int r13 = r11.getIntrinsicHeight()
        L_0x0141:
            android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r1 = android.graphics.Bitmap.createBitmap(r0, r13, r1)
            r11.setBounds(r4, r4, r0, r13)
            if (r12 == 0) goto L_0x015a
            android.graphics.drawable.Drawable r13 = r11.mutate()
            android.graphics.PorterDuffColorFilter r0 = new android.graphics.PorterDuffColorFilter
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.SRC_IN
            r0.<init>(r12, r2)
            r13.setColorFilter(r0)
        L_0x015a:
            android.graphics.Canvas r12 = new android.graphics.Canvas
            r12.<init>(r1)
            r11.draw(r12)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p067e1.C4471a0.createColoredBitmap(androidx.core.graphics.drawable.IconCompat, int, int):android.graphics.Bitmap");
    }
}
