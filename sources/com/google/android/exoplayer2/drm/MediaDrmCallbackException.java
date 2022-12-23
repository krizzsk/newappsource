package com.google.android.exoplayer2.drm;

import android.net.Uri;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import p265tb.C6657i;

public final class MediaDrmCallbackException extends IOException {
    public final long bytesLoaded;
    public final C6657i dataSpec;
    public final Map<String, List<String>> responseHeaders;
    public final Uri uriAfterRedirects;

    public MediaDrmCallbackException(C6657i iVar, Uri uri, Map map, long j, Exception exc) {
        super(exc);
        this.dataSpec = iVar;
        this.uriAfterRedirects = uri;
        this.responseHeaders = map;
        this.bytesLoaded = j;
    }
}
