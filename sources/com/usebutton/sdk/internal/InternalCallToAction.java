package com.usebutton.sdk.internal;

import android.net.Uri;
import com.usebutton.sdk.purchasepath.CallToAction;

public class InternalCallToAction extends CallToAction {
    private final Uri iconUrl;

    public InternalCallToAction(Uri uri, String str, int i) {
        super(0, str, i);
        this.iconUrl = uri;
    }

    public Uri getIconUrl() {
        return this.iconUrl;
    }
}
