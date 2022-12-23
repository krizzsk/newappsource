package com.usebutton.sdk.internal.models;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.ArrayMap;
import com.usebutton.sdk.internal.api.models.BrowserCardMapDTO;
import com.usebutton.sdk.internal.api.models.InternalInstallCardDTO;
import com.usebutton.sdk.internal.api.models.InternalRewardCardDTO;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

public class BrowserCardMap implements Parcelable {
    public static final Parcelable.Creator<BrowserCardMap> CREATOR = new Parcelable.Creator<BrowserCardMap>() {
        public BrowserCardMap createFromParcel(Parcel parcel) {
            return new BrowserCardMap(parcel);
        }

        public BrowserCardMap[] newArray(int i) {
            return new BrowserCardMap[i];
        }
    };
    private Map<String, InternalInstallCard> internalInstallCardMap;
    private Map<String, InternalRewardCard> internalRewardCardMap;

    public BrowserCardMap(Map<String, InternalRewardCard> map, Map<String, InternalInstallCard> map2) {
        this.internalRewardCardMap = new ArrayMap();
        new ArrayMap();
        this.internalRewardCardMap = map;
        this.internalInstallCardMap = map2;
    }

    public static BrowserCardMap fromDTO(BrowserCardMapDTO browserCardMapDTO) {
        if (browserCardMapDTO == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        Map<BrowserCardType, InternalRewardCardDTO> internalRewardCardDTOMap = browserCardMapDTO.getInternalRewardCardDTOMap();
        Map<BrowserCardType, InternalInstallCardDTO> internalInstallCardDTOMap = browserCardMapDTO.getInternalInstallCardDTOMap();
        for (Map.Entry next : internalRewardCardDTOMap.entrySet()) {
            hashMap.put(((BrowserCardType) next.getKey()).getApiValue(), InternalRewardCard.fromDTO((InternalRewardCardDTO) next.getValue()));
        }
        for (Map.Entry next2 : internalInstallCardDTOMap.entrySet()) {
            hashMap2.put(((BrowserCardType) next2.getKey()).getApiValue(), InternalInstallCard.fromDTO((InternalInstallCardDTO) next2.getValue()));
        }
        return new BrowserCardMap(hashMap, hashMap2);
    }

    public int describeContents() {
        return 0;
    }

    public Map<BrowserCardType, BrowserCard> getMap() {
        EnumMap enumMap = new EnumMap(BrowserCardType.class);
        for (Map.Entry next : this.internalRewardCardMap.entrySet()) {
            enumMap.put(BrowserCardType.getCardType((String) next.getKey()), next.getValue());
        }
        for (Map.Entry next2 : this.internalInstallCardMap.entrySet()) {
            enumMap.put(BrowserCardType.getCardType((String) next2.getKey()), next2.getValue());
        }
        return enumMap;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeMap(this.internalRewardCardMap);
        parcel.writeMap(this.internalInstallCardMap);
    }

    public BrowserCardMap(Parcel parcel) {
        this.internalRewardCardMap = new ArrayMap();
        this.internalInstallCardMap = new ArrayMap();
        parcel.readMap(this.internalRewardCardMap, InternalRewardCard.class.getClassLoader());
        parcel.readMap(this.internalInstallCardMap, InternalInstallCard.class.getClassLoader());
    }
}
