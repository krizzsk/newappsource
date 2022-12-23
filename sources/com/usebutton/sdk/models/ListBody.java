package com.usebutton.sdk.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.usebutton.sdk.internal.api.models.BodyDTO;
import java.util.ArrayList;
import java.util.List;

public class ListBody implements Parcelable {
    public static final Parcelable.Creator<ListBody> CREATOR = new Parcelable.Creator<ListBody>() {
        public ListBody createFromParcel(Parcel parcel) {
            return new ListBody(parcel);
        }

        public ListBody[] newArray(int i) {
            return new ListBody[i];
        }
    };
    private final List<InventoryGroup> mGroups;
    private final boolean mShowHeadings;

    public ListBody(Parcel parcel) {
        ArrayList arrayList = new ArrayList();
        this.mGroups = arrayList;
        this.mShowHeadings = parcel.readInt() != 1 ? false : true;
        parcel.readTypedList(arrayList, InventoryGroup.CREATOR);
    }

    public static ListBody fromDTO(BodyDTO.ListDTO listDTO) {
        if (listDTO == null) {
            return null;
        }
        return new ListBody(listDTO.showHeadings, InventoryGroup.fromDTOs(listDTO.groups));
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
        ListBody listBody = (ListBody) obj;
        if (this.mShowHeadings != listBody.mShowHeadings) {
            return false;
        }
        List<InventoryGroup> list = this.mGroups;
        List<InventoryGroup> list2 = listBody.mGroups;
        if (list != null) {
            return list.equals(list2);
        }
        if (list2 == null) {
            return true;
        }
        return false;
    }

    public List<InventoryGroup> getGroups() {
        return this.mGroups;
    }

    public int hashCode() {
        int i;
        int i2 = (this.mShowHeadings ? 1 : 0) * true;
        List<InventoryGroup> list = this.mGroups;
        if (list != null) {
            i = list.hashCode();
        } else {
            i = 0;
        }
        return i2 + i;
    }

    public boolean shouldShowHeadings() {
        return this.mShowHeadings;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.mShowHeadings ? 1 : 0);
        parcel.writeTypedList(this.mGroups);
    }

    public ListBody(boolean z, List<InventoryGroup> list) {
        ArrayList arrayList = new ArrayList();
        this.mGroups = arrayList;
        this.mShowHeadings = z;
        arrayList.addAll(list);
    }
}
