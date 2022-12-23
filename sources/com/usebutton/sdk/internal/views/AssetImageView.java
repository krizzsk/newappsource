package com.usebutton.sdk.internal.views;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Looper;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.usebutton.sdk.internal.ImageLoader;
import com.usebutton.sdk.internal.models.Asset;
import com.usebutton.sdk.internal.util.ViewUtils;

public class AssetImageView extends ImageView {
    private static final Decoder DEFAULT_DECODER = new Decoder() {
        public Bitmap decodeImageWithin(byte[] bArr, int i, int i2) {
            return ViewUtils.decodeImageWithin(bArr, i, i2);
        }
    };
    private static final String TAG = "AssetImageView";
    private Asset mAsset;
    private Decoder mDecoder;
    private String mLastHash;
    private AsyncTask mLoadTask;
    private ImageLoader mLoader;
    private Uri mUrl;

    public interface Decoder {
        Bitmap decodeImageWithin(byte[] bArr, int i, int i2);
    }

    public AssetImageView(Context context) {
        this(context, (AttributeSet) null);
    }

    @SuppressLint({"DefaultLocale"})
    private String currentHash() {
        return String.format("asset=%s,w=%d,h=%d", new Object[]{this.mAsset, Integer.valueOf(getDrawableWidth()), Integer.valueOf(getDrawableHeight())});
    }

    /* access modifiers changed from: private */
    public void doInvalidateDrawable() {
        if (this.mAsset == null) {
            setImageDrawable((Drawable) null);
        } else if ((getDrawableHeight() >= 1 || getDrawableWidth() >= 1) && !currentHash().equals(this.mLastHash)) {
            this.mLastHash = currentHash();
            if (this.mAsset.getData() != null) {
                doInvalidateWithBytes(this.mAsset.getData());
            } else if (this.mLoader != null && this.mAsset.getUrl() != null) {
                loadImage(this.mAsset.getUrl());
            }
        }
    }

    private void doInvalidateWithBytes(byte[] bArr) {
        Bitmap decodeImageWithin = this.mDecoder.decodeImageWithin(bArr, getDrawableWidth(), getDrawableHeight());
        if (decodeImageWithin != null) {
            setImageDrawable(new BitmapDrawable(getResources(), decodeImageWithin));
        } else {
            setImageDrawable((Drawable) null);
        }
    }

    private int getDrawableHeight() {
        return (getHeight() - getPaddingTop()) - getPaddingBottom();
    }

    private int getDrawableWidth() {
        return (getWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private void invalidateDrawable() {
        Thread.currentThread();
        if (Thread.currentThread() == Looper.getMainLooper().getThread() || getHandler() == null) {
            doInvalidateDrawable();
        } else {
            getHandler().post(new Runnable() {
                public void run() {
                    AssetImageView.this.doInvalidateDrawable();
                }
            });
        }
    }

    private void loadImage(Uri uri) {
        if (this.mUrl != uri) {
            this.mUrl = uri;
            AsyncTask asyncTask = this.mLoadTask;
            if (asyncTask != null && !asyncTask.isCancelled()) {
                this.mLoadTask.cancel(false);
            }
            this.mLoadTask = this.mLoader.load(uri, this);
        }
    }

    public void loadAsset(ImageLoader imageLoader, Asset asset) {
        this.mLoader = imageLoader;
        this.mAsset = asset;
        doInvalidateDrawable();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ImageLoader imageLoader = this.mLoader;
        if (imageLoader != null) {
            imageLoader.stop(this);
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z || this.mLastHash == null) {
            invalidateDrawable();
        }
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3 || i2 != i4 || this.mLastHash == null) {
            invalidateDrawable();
        }
    }

    public void setAsset(Asset asset) {
        this.mAsset = asset;
        invalidateDrawable();
    }

    public void test_setDecoder(Decoder decoder) {
        this.mDecoder = decoder;
    }

    public AssetImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AssetImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mDecoder = DEFAULT_DECODER;
    }

    @TargetApi(21)
    public AssetImageView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.mDecoder = DEFAULT_DECODER;
    }
}
