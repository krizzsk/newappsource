package com.usebutton.sdk.internal.commands;

import com.usebutton.sdk.internal.ImageLoader;
import com.usebutton.sdk.internal.api.ButtonNetworkException;
import com.usebutton.sdk.internal.core.Command;
import com.usebutton.sdk.internal.core.FailableReceiver;
import com.usebutton.sdk.internal.models.Asset;
import com.usebutton.sdk.internal.models.AssetCollection;
import com.usebutton.sdk.internal.util.StopWatch;
import java.util.List;

public class LoadAssetsCommand<Void> extends Command {
    private final List<Asset> mAssets;
    private final ImageLoader mImageLoader;

    public LoadAssetsCommand(ImageLoader imageLoader, List<Asset> list, FailableReceiver<Void> failableReceiver) {
        super(failableReceiver);
        this.mImageLoader = imageLoader;
        this.mAssets = list;
    }

    public Object execute() throws Exception {
        StopWatch stopWatch = new StopWatch();
        for (Asset downloadToAsset : this.mAssets) {
            if (!AssetCollection.downloadToAsset(stopWatch, this.mImageLoader, downloadToAsset)) {
                throw new ButtonNetworkException("Failure while loading assets.");
            }
        }
        stopWatch.stop("Done loading assets.");
        return null;
    }

    public String key() {
        StringBuilder k = C13555b.m33972k("LoadAssetsCommand: ");
        k.append(this.mAssets.toString());
        return k.toString();
    }
}
