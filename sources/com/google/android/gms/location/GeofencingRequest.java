package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.location.zzbj;
import java.util.ArrayList;
import java.util.List;
import p001a0.C0016g;

@SafeParcelable.Class(creator = "GeofencingRequestCreator")
@SafeParcelable.Reserved({1000})
public class GeofencingRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GeofencingRequest> CREATOR = new zzbb();
    public static final int INITIAL_TRIGGER_DWELL = 4;
    public static final int INITIAL_TRIGGER_ENTER = 1;
    public static final int INITIAL_TRIGGER_EXIT = 2;
    @SafeParcelable.Field(getter = "getParcelableGeofences", mo65739id = 1)
    private final List zza;
    @InitialTrigger
    @SafeParcelable.Field(getter = "getInitialTrigger", mo65739id = 2)
    private final int zzb;
    @SafeParcelable.Field(defaultValue = "", getter = "getTag", mo65739id = 3)
    private final String zzc;
    @SafeParcelable.Field(getter = "getContextAttributionTag", mo65739id = 4)
    private final String zzd;

    public static final class Builder {
        private final List zza = new ArrayList();
        @InitialTrigger
        private int zzb = 5;
        private String zzc = "";

        public Builder addGeofence(Geofence geofence) {
            Preconditions.checkNotNull(geofence, "geofence can't be null.");
            Preconditions.checkArgument(geofence instanceof zzbj, "Geofence must be created using Geofence.Builder.");
            this.zza.add((zzbj) geofence);
            return this;
        }

        public Builder addGeofences(List<Geofence> list) {
            if (list != null && !list.isEmpty()) {
                for (Geofence next : list) {
                    if (next != null) {
                        addGeofence(next);
                    }
                }
            }
            return this;
        }

        public GeofencingRequest build() {
            Preconditions.checkArgument(!this.zza.isEmpty(), "No geofence has been added to this request.");
            return new GeofencingRequest(this.zza, this.zzb, this.zzc, (String) null);
        }

        public Builder setInitialTrigger(@InitialTrigger int i) {
            this.zzb = i & 7;
            return this;
        }
    }

    public @interface InitialTrigger {
    }

    @SafeParcelable.Constructor
    public GeofencingRequest(@SafeParcelable.Param(mo65742id = 1) List list, @InitialTrigger @SafeParcelable.Param(mo65742id = 2) int i, @SafeParcelable.Param(mo65742id = 3) String str, @SafeParcelable.Param(mo65742id = 4) String str2) {
        this.zza = list;
        this.zzb = i;
        this.zzc = str;
        this.zzd = str2;
    }

    public List<Geofence> getGeofences() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.zza);
        return arrayList;
    }

    @InitialTrigger
    public int getInitialTrigger() {
        return this.zzb;
    }

    public String toString() {
        StringBuilder k = C13555b.m33972k("GeofencingRequest[geofences=");
        k.append(this.zza);
        k.append(", initialTrigger=");
        k.append(this.zzb);
        k.append(", tag=");
        k.append(this.zzc);
        k.append(", attributionTag=");
        return C0016g.m31o(k, this.zzd, "]");
    }

    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedList(parcel, 1, this.zza, false);
        SafeParcelWriter.writeInt(parcel, 2, getInitialTrigger());
        SafeParcelWriter.writeString(parcel, 3, this.zzc, false);
        SafeParcelWriter.writeString(parcel, 4, this.zzd, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final GeofencingRequest zza(String str) {
        return new GeofencingRequest(this.zza, this.zzb, this.zzc, str);
    }
}
