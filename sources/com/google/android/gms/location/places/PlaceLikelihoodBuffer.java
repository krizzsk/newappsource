package com.google.android.gms.location.places;

import android.os.Bundle;
import com.appsflyer.ServerParameters;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.AbstractDataBuffer;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.location.places.internal.zzak;
import com.google.android.gms.location.places.internal.zzam;
import java.util.Comparator;

@Deprecated
public class PlaceLikelihoodBuffer extends AbstractDataBuffer<PlaceLikelihood> implements Result {
    private static final Comparator<zzak> zzac = new zzj();
    private final int zzad;
    private final boolean zzae;
    private final Status zzp;
    private final String zzq;

    public PlaceLikelihoodBuffer(DataHolder dataHolder, int i) {
        this(dataHolder, false, i);
    }

    public static int zzb(Bundle bundle) {
        return bundle.getInt("com.google.android.gms.location.places.PlaceLikelihoodBuffer.SOURCE_EXTRA_KEY");
    }

    public PlaceLikelihood get(int i) {
        return new zzam(this.mDataHolder, i);
    }

    public CharSequence getAttributions() {
        return this.zzq;
    }

    public Status getStatus() {
        return this.zzp;
    }

    @ShowFirstParty
    public String toString() {
        return Objects.toStringHelper(this).add(ServerParameters.STATUS, getStatus()).add("attributions", this.zzq).toString();
    }

    private PlaceLikelihoodBuffer(DataHolder dataHolder, boolean z, int i) {
        super(dataHolder);
        this.zzp = PlacesStatusCodes.zzb(dataHolder.getStatusCode());
        switch (i) {
            case 100:
            case 101:
            case 102:
            case 103:
            case 104:
            case 105:
            case 106:
            case 107:
            case 108:
                this.zzad = i;
                this.zzae = false;
                if (dataHolder.getMetadata() != null) {
                    this.zzq = dataHolder.getMetadata().getString("com.google.android.gms.location.places.PlaceLikelihoodBuffer.ATTRIBUTIONS_EXTRA_KEY");
                    return;
                } else {
                    this.zzq = null;
                    return;
                }
            default:
                throw new IllegalArgumentException(C13715c.m34241g(27, "invalid source: ", i));
        }
    }
}
