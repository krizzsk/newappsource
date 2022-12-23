package com.google.android.gms.appindexing;

import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;

@Deprecated
@VisibleForTesting
public final class Action extends Thing {
    public static final String STATUS_TYPE_ACTIVE = "http://schema.org/ActiveActionStatus";
    public static final String STATUS_TYPE_COMPLETED = "http://schema.org/CompletedActionStatus";
    public static final String STATUS_TYPE_FAILED = "http://schema.org/FailedActionStatus";
    public static final String TYPE_ACTIVATE = "http://schema.org/ActivateAction";
    public static final String TYPE_ADD = "http://schema.org/AddAction";
    public static final String TYPE_BOOKMARK = "http://schema.org/BookmarkAction";
    public static final String TYPE_COMMUNICATE = "http://schema.org/CommunicateAction";
    public static final String TYPE_FILM = "http://schema.org/FilmAction";
    public static final String TYPE_LIKE = "http://schema.org/LikeAction";
    public static final String TYPE_LISTEN = "http://schema.org/ListenAction";
    public static final String TYPE_PHOTOGRAPH = "http://schema.org/PhotographAction";
    public static final String TYPE_RESERVE = "http://schema.org/ReserveAction";
    public static final String TYPE_SEARCH = "http://schema.org/SearchAction";
    public static final String TYPE_VIEW = "http://schema.org/ViewAction";
    public static final String TYPE_WANT = "http://schema.org/WantAction";
    public static final String TYPE_WATCH = "http://schema.org/WatchAction";

    public /* synthetic */ Action(Bundle bundle, zza zza) {
        super(bundle);
    }

    public static Action newAction(String str, String str2, Uri uri) {
        return newAction(str, str2, (Uri) null, uri);
    }

    @Deprecated
    public static final class Builder extends Thing.Builder {
        public Builder(String str) {
            Preconditions.checkNotNull(str);
            super.put("type", str);
        }

        public Action build() {
            Preconditions.checkNotNull(this.zza.get("object"), "setObject is required before calling build().");
            Preconditions.checkNotNull(this.zza.get("type"), "setType is required before calling build().");
            Bundle bundle = (Bundle) this.zza.getParcelable("object");
            if (bundle != null) {
                Preconditions.checkNotNull(bundle.get("name"), "Must call setObject() with a valid name. Example: setObject(new Thing.Builder().setName(name).setUrl(url))");
                Preconditions.checkNotNull(bundle.get("url"), "Must call setObject() with a valid app URI. Example: setObject(new Thing.Builder().setName(name).setUrl(url))");
            }
            return new Action(this.zza, (zza) null);
        }

        public Builder put(String str, Thing thing) {
            super.put(str, thing);
            return this;
        }

        public Builder setActionStatus(String str) {
            Preconditions.checkNotNull(str);
            super.put("actionStatus", str);
            return this;
        }

        public Builder setName(String str) {
            super.put("name", str);
            return this;
        }

        public Builder setObject(Thing thing) {
            Preconditions.checkNotNull(thing);
            super.put("object", thing);
            return this;
        }

        public Builder setUrl(Uri uri) {
            if (uri != null) {
                super.put("url", uri.toString());
            }
            return this;
        }

        public Builder put(String str, String str2) {
            super.put(str, str2);
            return this;
        }

        public Builder put(String str, boolean z) {
            super.put(str, z);
            return this;
        }

        public Builder put(String str, Thing[] thingArr) {
            super.put(str, thingArr);
            return this;
        }

        public Builder put(String str, String[] strArr) {
            super.put(str, strArr);
            return this;
        }
    }

    public static Action newAction(String str, String str2, Uri uri, Uri uri2) {
        String str3;
        Builder builder = new Builder(str);
        Thing.Builder builder2 = new Thing.Builder();
        builder2.setName(str2);
        if (uri == null) {
            str3 = null;
        } else {
            str3 = uri.toString();
        }
        builder2.setId(str3);
        builder2.setUrl(uri2);
        builder.setObject(builder2.build());
        return builder.build();
    }
}
