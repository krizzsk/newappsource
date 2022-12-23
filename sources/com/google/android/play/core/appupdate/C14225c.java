package com.google.android.play.core.appupdate;

/* renamed from: com.google.android.play.core.appupdate.c */
public abstract class C14225c {
    /* renamed from: c */
    public static C14241s m35332c() {
        byte b = (byte) (((byte) 1) | 2);
        if (b == 3) {
            return new C14241s(0, false);
        }
        StringBuilder sb = new StringBuilder();
        if ((b & 1) == 0) {
            sb.append(" appUpdateType");
        }
        if ((b & 2) == 0) {
            sb.append(" allowAssetPackDeletion");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: a */
    public abstract boolean mo42694a();

    /* renamed from: b */
    public abstract int mo42695b();
}
