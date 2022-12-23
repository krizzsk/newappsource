package com.veriff.sdk.camera.view;

import android.graphics.Bitmap;
import android.util.Size;
import android.view.View;
import android.widget.FrameLayout;
import com.veriff.sdk.camera.core.SurfaceRequest;
import p695od.C18728c;

abstract class PreviewViewImplementation {
    public FrameLayout mParent;
    private final PreviewTransformation mPreviewTransform;
    public Size mResolution;
    private boolean mWasSurfaceProvided = false;

    public interface OnSurfaceNotInUseListener {
    }

    public PreviewViewImplementation(FrameLayout frameLayout, PreviewTransformation previewTransformation) {
        this.mParent = frameLayout;
        this.mPreviewTransform = previewTransformation;
    }

    public Bitmap getBitmap() {
        Bitmap previewBitmap = getPreviewBitmap();
        if (previewBitmap == null) {
            return null;
        }
        return this.mPreviewTransform.createTransformedBitmap(previewBitmap, new Size(this.mParent.getWidth(), this.mParent.getHeight()), this.mParent.getLayoutDirection());
    }

    public abstract View getPreview();

    public abstract Bitmap getPreviewBitmap();

    public abstract void onAttachedToWindow();

    public abstract void onDetachedFromWindow();

    public void onSurfaceProvided() {
        this.mWasSurfaceProvided = true;
        redrawPreview();
    }

    public abstract void onSurfaceRequested(SurfaceRequest surfaceRequest, OnSurfaceNotInUseListener onSurfaceNotInUseListener);

    public void redrawPreview() {
        View preview = getPreview();
        if (preview != null && this.mWasSurfaceProvided) {
            this.mPreviewTransform.transformView(new Size(this.mParent.getWidth(), this.mParent.getHeight()), this.mParent.getLayoutDirection(), preview);
        }
    }

    public abstract C18728c<Void> waitForNextFrame();
}
