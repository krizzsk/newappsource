package com.usebutton.sdk.internal.util;

import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.view.View;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.WeakHashMap;
import p242s1.C6333d0;
import p242s1.C6382p0;

public class ViewUtils {
    private static final int BYTES_PER_PIXEL = 4;
    private static final String TAG = "ViewUtils";
    private static Integer sShowAnimTime;

    public static int calculateInSampleSize(BitmapFactory.Options options, int i, int i2) {
        int i3 = 1;
        if (i2 >= 1 && i >= 1) {
            int i4 = options.outHeight;
            int i5 = options.outWidth;
            if (i4 > i2 || i5 > i) {
                int i6 = i4 / 2;
                int i7 = i5 / 2;
                while (i6 / i3 >= i2 && i7 / i3 >= i) {
                    i3 *= 2;
                }
            }
        }
        return i3;
    }

    public static Drawable colorDrawable(Drawable drawable, int i) {
        drawable.setColorFilter(i, PorterDuff.Mode.SRC_ATOP);
        return drawable;
    }

    public static int darken(int i, float f) {
        float[] fArr = new float[3];
        Color.colorToHSV(i, fArr);
        fArr[2] = fArr[2] * f;
        return Color.HSVToColor(fArr);
    }

    public static Bitmap decodeImageWithin(byte[] bArr, int i, int i2) {
        Bitmap bitmap = null;
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            BitmapFactory.Options options2 = new BitmapFactory.Options();
            options2.inSampleSize = calculateInSampleSize(options, i, i2);
            bitmap = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options2);
            ButtonLog.verboseFormat(TAG, "Decoded bitmap for frame %dx%d, original %dx%d %.1fkB decoded %dx%d %.1fkB", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(options.outWidth), Integer.valueOf(options.outHeight), Double.valueOf(((double) ((options.outHeight * options.outWidth) * 4)) / 1024.0d), Integer.valueOf(bitmap.getWidth()), Integer.valueOf(bitmap.getHeight()), Double.valueOf(((double) getByteSize(bitmap)) / 1024.0d));
            return bitmap;
        } catch (OutOfMemoryError e) {
            StringBuilder k = C13555b.m33972k("Out of memory while decoding image of size: ");
            k.append(bArr.length / 1024);
            k.append("kB.");
            ButtonLog.warn(TAG, k.toString(), e);
            if (bitmap == null || bitmap.isRecycled()) {
                return bitmap;
            }
            bitmap.recycle();
            return bitmap;
        }
    }

    private static int getAnimationTime(View view) {
        if (sShowAnimTime == null) {
            if (TestUtils.isTesting()) {
                sShowAnimTime = 0;
            } else {
                sShowAnimTime = Integer.valueOf(view.getResources().getInteger(17694721));
            }
        }
        return sShowAnimTime.intValue();
    }

    private static int getByteSize(Bitmap bitmap) {
        return bitmap.getAllocationByteCount();
    }

    public static void hide(View view) {
        if (view != null && Looper.getMainLooper().getThread() == Thread.currentThread()) {
            WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
            float f = 1.0f;
            if (view.getAlpha() < 1.0f) {
                f = view.getAlpha();
            }
            if (view.getAnimation() == null) {
                ObjectAnimator.ofFloat(view, "alpha", new float[]{f, 0.0f}).setDuration((long) getAnimationTime(view)).start();
                view.setVisibility(8);
            }
        }
    }

    public static boolean isNotNull(Object... objArr) {
        for (Object obj : objArr) {
            if (obj != null) {
                return true;
            }
        }
        return false;
    }

    public static void show(View view) {
        float f;
        if (view != null) {
            view.setVisibility(0);
            if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
                if (view.getAlpha() < 1.0f) {
                    f = view.getAlpha();
                } else {
                    f = BitmapDescriptorFactory.HUE_RED;
                }
                if (view.getAnimation() == null) {
                    ObjectAnimator.ofFloat(view, "alpha", new float[]{f, 1.0f}).setDuration((long) getAnimationTime(view)).start();
                }
            }
        }
    }
}
