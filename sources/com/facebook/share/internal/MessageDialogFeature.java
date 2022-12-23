package com.facebook.share.internal;

import com.facebook.internal.C2396f;

public enum MessageDialogFeature implements C2396f {
    MESSAGE_DIALOG(20140204),
    PHOTOS(20140324),
    VIDEO(20141218),
    MESSENGER_GENERIC_TEMPLATE(20171115),
    MESSENGER_OPEN_GRAPH_MUSIC_TEMPLATE(20171115),
    MESSENGER_MEDIA_TEMPLATE(20171115);
    
    private int minVersion;

    private MessageDialogFeature(int i) {
        this.minVersion = i;
    }

    public String getAction() {
        return "com.facebook.platform.action.request.MESSAGE_DIALOG";
    }

    public int getMinVersion() {
        return this.minVersion;
    }
}
