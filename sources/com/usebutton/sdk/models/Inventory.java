package com.usebutton.sdk.models;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.usebutton.sdk.internal.api.models.GroupDTO;
import com.usebutton.sdk.internal.models.Asset;
import com.usebutton.sdk.internal.models.Text;
import java.util.ArrayList;
import java.util.List;

public class Inventory implements Parcelable {
    public static final Parcelable.Creator<Inventory> CREATOR = new Parcelable.Creator<Inventory>() {
        public Inventory createFromParcel(Parcel parcel) {
            return new Inventory(parcel);
        }

        public Inventory[] newArray(int i) {
            return new Inventory[i];
        }
    };
    private final Link mActions;
    private Asset mIcon;
    private final Text mIconText;
    private final Text mPrimary;
    private final Text mSecondary;

    public Inventory(Parcel parcel) {
        this.mActions = (Link) parcel.readParcelable(Link.class.getClassLoader());
        this.mPrimary = (Text) parcel.readParcelable(Text.class.getClassLoader());
        this.mSecondary = (Text) parcel.readParcelable(Text.class.getClassLoader());
        this.mIconText = (Text) parcel.readParcelable(Text.class.getClassLoader());
        this.mIcon = (Asset) parcel.readParcelable(Asset.class.getClassLoader());
    }

    private static Inventory fromDTO(GroupDTO.ItemDTO itemDTO) {
        return new Inventory(Link.fromDTO(itemDTO.mAction), Text.fromDTO(itemDTO.mTitle), Text.fromDTO(itemDTO.mSubtitle), Text.fromDTO(itemDTO.mIconText), Asset.fromDTO(itemDTO.mIcon));
    }

    public static List<Inventory> fromDTOs(List<GroupDTO.ItemDTO> list) {
        ArrayList arrayList = new ArrayList();
        for (GroupDTO.ItemDTO fromDTO : list) {
            arrayList.add(fromDTO(fromDTO));
        }
        return arrayList;
    }

    public int describeContents() {
        return 0;
    }

    public Link getAction() {
        return this.mActions;
    }

    public Asset getIcon() {
        return this.mIcon;
    }

    public Text getIconText() {
        return this.mIconText;
    }

    public Uri getIconUri() {
        Asset asset = this.mIcon;
        if (asset != null) {
            return asset.getUrl();
        }
        return null;
    }

    public Text getPrimary() {
        return this.mPrimary;
    }

    public Text getSecondary() {
        return this.mSecondary;
    }

    public void test_setIcon(Asset asset) {
        this.mIcon = asset;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.mActions, i);
        parcel.writeParcelable(this.mPrimary, i);
        parcel.writeParcelable(this.mSecondary, i);
        parcel.writeParcelable(this.mIconText, i);
        parcel.writeParcelable(this.mIcon, i);
    }

    public Inventory(Link link, Text text, Text text2, Text text3, Asset asset) {
        this.mActions = link;
        this.mPrimary = text;
        this.mSecondary = text2;
        this.mIconText = text3;
        this.mIcon = asset;
    }
}
