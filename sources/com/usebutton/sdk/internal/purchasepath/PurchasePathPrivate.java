package com.usebutton.sdk.internal.purchasepath;

import android.net.Uri;
import com.usebutton.sdk.internal.models.AppAction;
import com.usebutton.sdk.models.Link;
import com.usebutton.sdk.purchasepath.PurchasePath;

public class PurchasePathPrivate extends PurchasePath {
    public PurchasePathPrivate(AppAction appAction) {
        super(appAction);
    }

    private Uri replaceLink(Uri uri, String str, String str2) {
        return Uri.parse(String.valueOf(uri).replace(str, str2));
    }

    public void replaceAll(String str, String str2) {
        Uri uri;
        Link link = this.appAction.getLink();
        if (link != null) {
            Uri appLink = link.getAppLink();
            Uri uri2 = null;
            if (appLink != null) {
                uri = replaceLink(appLink, str, str2);
            } else {
                uri = null;
            }
            Uri browserLink = link.getBrowserLink();
            if (browserLink != null) {
                uri2 = replaceLink(browserLink, str, str2);
            }
            this.appAction.setLink(new Link(uri, uri2));
        }
    }
}
