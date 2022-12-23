package com.usebutton.sdk.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.usebutton.sdk.internal.api.models.GroupDTO;
import com.usebutton.sdk.internal.models.Text;
import java.util.ArrayList;
import java.util.List;

public class InventoryGroup implements Parcelable {
    public static final Parcelable.Creator<InventoryGroup> CREATOR = new Parcelable.Creator() {
        public InventoryGroup createFromParcel(Parcel parcel) {
            return new InventoryGroup(parcel);
        }

        public InventoryGroup[] newArray(int i) {
            return new InventoryGroup[i];
        }
    };
    private final List<Inventory> mInventory;
    private final Text mName;

    public InventoryGroup(Text text, List<Inventory> list) {
        this.mName = text;
        this.mInventory = list;
    }

    private static InventoryGroup fromDTO(GroupDTO groupDTO) {
        return new InventoryGroup(Text.fromDTO(groupDTO.mTitle), Inventory.fromDTOs(groupDTO.mItems));
    }

    public static List<InventoryGroup> fromDTOs(List<GroupDTO> list) {
        ArrayList arrayList = new ArrayList();
        for (GroupDTO fromDTO : list) {
            arrayList.add(fromDTO(fromDTO));
        }
        return arrayList;
    }

    public int describeContents() {
        return 0;
    }

    public List<Inventory> getInventory() {
        return this.mInventory;
    }

    public String getName() {
        return this.mName.getCopy();
    }

    public int getNameColor() {
        return this.mName.getColor();
    }

    public String toString() {
        StringBuilder k = C13555b.m33972k("InventoryGroup{mName='");
        k.append(this.mName);
        k.append('\'');
        k.append(", mInventory=");
        return C13555b.m33970i(k, this.mInventory, '}');
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.mName, i);
        parcel.writeList(this.mInventory);
    }

    public InventoryGroup(Parcel parcel) {
        this.mName = (Text) parcel.readParcelable(Text.class.getClassLoader());
        this.mInventory = parcel.readArrayList(InventoryGroup.class.getClassLoader());
    }
}
