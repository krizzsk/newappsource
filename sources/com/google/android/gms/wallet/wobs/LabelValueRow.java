package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.ArrayUtils;
import java.util.ArrayList;
import java.util.Collection;

@SafeParcelable.Class(creator = "LabelValueRowCreator")
@SafeParcelable.Reserved({1})
public final class LabelValueRow extends AbstractSafeParcelable {
    public static final Parcelable.Creator<LabelValueRow> CREATOR = new zzf();
    @SafeParcelable.Field(mo65739id = 2)
    @Deprecated
    public String zza;
    @SafeParcelable.Field(mo65739id = 3)
    @Deprecated
    public String zzb;
    @SafeParcelable.Field(defaultValueUnchecked = "com.google.android.gms.common.util.ArrayUtils.newArrayList()", mo65739id = 4)
    public ArrayList zzc;

    public final class Builder {
        public /* synthetic */ Builder(zze zze) {
        }

        public Builder addColumn(LabelValue labelValue) {
            LabelValueRow.this.zzc.add(labelValue);
            return this;
        }

        public Builder addColumns(Collection<LabelValue> collection) {
            LabelValueRow.this.zzc.addAll(collection);
            return this;
        }

        public LabelValueRow build() {
            return LabelValueRow.this;
        }

        @Deprecated
        public Builder setHexBackgroundColor(String str) {
            LabelValueRow.this.zzb = str;
            return this;
        }

        @Deprecated
        public Builder setHexFontColor(String str) {
            LabelValueRow.this.zza = str;
            return this;
        }
    }

    public LabelValueRow() {
        this.zzc = ArrayUtils.newArrayList();
    }

    public static Builder newBuilder() {
        return new Builder((zze) null);
    }

    public ArrayList<LabelValue> getColumns() {
        return this.zzc;
    }

    @Deprecated
    public String getHexBackgroundColor() {
        return this.zzb;
    }

    @Deprecated
    public String getHexFontColor() {
        return this.zza;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.zza, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzb, false);
        SafeParcelWriter.writeTypedList(parcel, 4, this.zzc, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @SafeParcelable.Constructor
    public LabelValueRow(@SafeParcelable.Param(mo65742id = 2) String str, @SafeParcelable.Param(mo65742id = 3) String str2, @SafeParcelable.Param(mo65742id = 4) ArrayList arrayList) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = arrayList;
    }
}
