package com.usebutton.sdk.internal.views;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.usebutton.sdk.internal.models.Asset;
import com.usebutton.sdk.internal.util.ButtonLog;
import com.usebutton.sdk.internal.util.ButtonUtil;
import java.io.IOException;

public class LazyByteBitmapDrawable extends Drawable {
    private static final String TAG = "LazyByteBitmapDrawable";
    private Rect mBitmapSourceRect;
    private Rect mCanvasDestinationRect;
    private Bitmap mDecodedBitmap;
    private int mHeight;
    private Paint mPainter;
    private final byte[] mRawImageData;
    private int mWidth;

    public LazyByteBitmapDrawable(byte[] bArr) {
        this.mWidth = -1;
        this.mHeight = -1;
        this.mRawImageData = bArr;
        this.mPainter = new Paint(2);
    }

    private void decodeImageForCanvas(Canvas canvas) {
        this.mWidth = canvas.getWidth();
        this.mHeight = canvas.getHeight();
        Bitmap bitmap = this.mDecodedBitmap;
        if (bitmap != null) {
            bitmap.recycle();
            this.mDecodedBitmap = null;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        byte[] bArr = this.mRawImageData;
        BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        ButtonLog.infoFormat(TAG, "Will reload image from %dx%d to fit frame: %dx%d", Integer.valueOf(options.outWidth), Integer.valueOf(options.outHeight), Integer.valueOf(this.mWidth), Integer.valueOf(this.mHeight));
        try {
            byte[] bArr2 = this.mRawImageData;
            BitmapRegionDecoder newInstance = BitmapRegionDecoder.newInstance(bArr2, 0, bArr2.length, false);
            Rect rect = new Rect(0, 0, options.outWidth, Math.min((int) ((((double) options.outWidth) / (((double) this.mWidth) * 1.0d)) * ((double) this.mHeight)), options.outHeight));
            BitmapFactory.Options options2 = new BitmapFactory.Options();
            options2.inSampleSize = Math.max(1, options.outWidth / this.mWidth);
            this.mDecodedBitmap = newInstance.decodeRegion(rect, options2);
            newInstance.recycle();
        } catch (IOException e) {
            ButtonLog.warn(TAG, "Could not decode image.", e);
        } catch (OutOfMemoryError e2) {
            StringBuilder k = C13555b.m33972k("ran out of memory while decoding image of size ");
            k.append(ButtonUtil.imageSizeString(this.mRawImageData));
            ButtonLog.warn(TAG, k.toString(), e2);
        }
    }

    private boolean hasSizeChanged(Canvas canvas) {
        if (this.mWidth == canvas.getWidth() && this.mHeight == canvas.getHeight()) {
            return false;
        }
        return true;
    }

    public void draw(Canvas canvas) {
        if (this.mRawImageData != null) {
            if (hasSizeChanged(canvas)) {
                decodeImageForCanvas(canvas);
            }
            if (this.mDecodedBitmap != null) {
                int min = Math.min(canvas.getHeight(), this.mDecodedBitmap.getHeight());
                int min2 = Math.min(canvas.getWidth(), this.mDecodedBitmap.getWidth());
                this.mBitmapSourceRect = new Rect(0, 0, min2, min);
                Rect rect = new Rect(0, 0, min2, min);
                this.mCanvasDestinationRect = rect;
                ButtonLog.infoFormat(TAG, "Requested to draw in: %s", rect.toShortString());
                canvas.drawBitmap(this.mDecodedBitmap, this.mBitmapSourceRect, this.mCanvasDestinationRect, this.mPainter);
            }
        }
    }

    public int getIntrinsicHeight() {
        return 1;
    }

    public int getIntrinsicWidth() {
        return 10000;
    }

    public int getOpacity() {
        return -3;
    }

    public void setAlpha(int i) {
        this.mPainter.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.mPainter.setColorFilter(colorFilter);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public LazyByteBitmapDrawable(Asset asset) {
        this(asset != null ? asset.getData() : null);
    }
}
