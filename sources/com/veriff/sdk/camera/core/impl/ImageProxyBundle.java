package com.veriff.sdk.camera.core.impl;

import com.veriff.sdk.camera.core.ImageProxy;
import java.util.List;
import p695od.C18728c;

public interface ImageProxyBundle {
    List<Integer> getCaptureIds();

    C18728c<ImageProxy> getImageProxy(int i);
}
