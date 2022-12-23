package com.usebutton.sdk.internal.models;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.net.Uri;
import com.usebutton.sdk.internal.ImageLoader;
import com.usebutton.sdk.internal.api.ButtonNetworkException;
import com.usebutton.sdk.internal.util.ButtonLog;
import com.usebutton.sdk.internal.util.ButtonUtil;
import com.usebutton.sdk.internal.util.StopWatch;

public class AssetCollection {
    private static final String TAG = "AssetCollection";
    private final AppAction mAction;

    public AssetCollection(AppAction appAction) {
        this.mAction = appAction;
    }

    public static boolean isValidAsset(Asset asset) {
        if (asset == null) {
            return true;
        }
        if (asset.getData() != null && asset.getData().length > 0) {
            return true;
        }
        return false;
    }

    @TargetApi(4)
    public static void setImageDensity(Bitmap bitmap, double d) {
        bitmap.setDensity((int) (d * 160.0d));
    }

    public void downloadToAsset(ImageLoader imageLoader) {
        StopWatch stopWatch = new StopWatch();
        downloadToAsset(stopWatch, imageLoader, this.mAction.getPreview().getIcon());
        stopWatch.stop("Downloaded all assets");
    }

    public static boolean downloadToAsset(StopWatch stopWatch, ImageLoader imageLoader, Asset asset) {
        if (asset == null || asset.getUrl() == null) {
            ButtonLog.infoFormat(TAG, "Skipped downloading asset: %s", asset);
            return true;
        }
        Uri url = asset.getUrl();
        try {
            byte[] imageData = imageLoader.getImageData(url);
            asset.setData(imageData);
            ButtonLog.infoFormat(TAG, "Got image: %s", ButtonUtil.imageSizeString(imageData));
        } catch (ButtonNetworkException e) {
            ButtonLog.infoFormat(TAG, "Failed to get asset.", e);
        } catch (OutOfMemoryError e2) {
            ButtonLog.infoFormat(TAG, "Out of memory while retrieving asset %s\n%s" + url, e2);
        }
        if (stopWatch != null) {
            stopWatch.lap(url.toString());
        }
        return isValidAsset(asset);
    }
}
