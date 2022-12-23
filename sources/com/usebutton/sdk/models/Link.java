package com.usebutton.sdk.models;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.usebutton.sdk.internal.api.models.LinkDTO;

public class Link implements Parcelable {
    public static final Parcelable.Creator<Link> CREATOR = new Parcelable.Creator<Link>() {
        public Link createFromParcel(Parcel parcel) {
            return new Link(parcel);
        }

        public Link[] newArray(int i) {
            return new Link[i];
        }
    };
    private final Uri mAppLink;
    private final Uri mBrowserLink;

    public Link(Uri uri, Uri uri2) {
        this.mAppLink = uri;
        this.mBrowserLink = uri2;
    }

    public static Link fromDTO(LinkDTO linkDTO) {
        if (linkDTO == null) {
            return null;
        }
        return new Link(linkDTO.appLink, linkDTO.browserLink);
    }

    public static Link withAppLink(Uri uri) {
        if (uri == null) {
            return null;
        }
        return new Link(uri, (Uri) null);
    }

    public static Link withBrowserLink(Uri uri) {
        if (uri == null) {
            return null;
        }
        return new Link((Uri) null, uri);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Link link = (Link) obj;
        Uri uri = this.mAppLink;
        if (uri == null ? link.mAppLink != null : !uri.equals(link.mAppLink)) {
            return false;
        }
        Uri uri2 = this.mBrowserLink;
        Uri uri3 = link.mBrowserLink;
        if (uri2 != null) {
            return uri2.equals(uri3);
        }
        if (uri3 == null) {
            return true;
        }
        return false;
    }

    public Uri getAppLink() {
        return this.mAppLink;
    }

    public Uri getBrowserLink() {
        return this.mBrowserLink;
    }

    public int hashCode() {
        int i;
        Uri uri = this.mAppLink;
        int i2 = 0;
        if (uri != null) {
            i = uri.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        Uri uri2 = this.mBrowserLink;
        if (uri2 != null) {
            i2 = uri2.hashCode();
        }
        return i3 + i2;
    }

    public String toString() {
        StringBuilder k = C13555b.m33972k("Link{mAppLink=");
        k.append(this.mAppLink);
        k.append(", mBrowserLink=");
        k.append(this.mBrowserLink);
        k.append('}');
        return k.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.mAppLink, i);
        parcel.writeParcelable(this.mBrowserLink, i);
    }

    public Link(Parcel parcel) {
        this.mAppLink = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.mBrowserLink = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
    }
}
