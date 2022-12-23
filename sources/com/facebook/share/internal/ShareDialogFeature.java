package com.facebook.share.internal;

import com.facebook.internal.C2396f;
import kotlin.Metadata;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u0011\b\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016R\u0014\u0010\u0007\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, mo59060d2 = {"Lcom/facebook/share/internal/ShareDialogFeature;", "", "Lcom/facebook/internal/f;", "", "getAction", "", "getMinVersion", "minVersion", "I", "<init>", "(Ljava/lang/String;II)V", "SHARE_DIALOG", "PHOTOS", "VIDEO", "MULTIMEDIA", "HASHTAG", "LINK_SHARE_QUOTES", "facebook-common_release"}, mo59061k = 1, mo59062mv = {1, 5, 1})
public enum ShareDialogFeature implements C2396f {
    SHARE_DIALOG(20130618),
    PHOTOS(20140204),
    VIDEO(20141028),
    MULTIMEDIA(20160327),
    HASHTAG(20160327),
    LINK_SHARE_QUOTES(20160327);
    
    private final int minVersion;

    private ShareDialogFeature(int i) {
        this.minVersion = i;
    }

    public String getAction() {
        return "com.facebook.platform.action.request.FEED_DIALOG";
    }

    public int getMinVersion() {
        return this.minVersion;
    }
}
