package com.google.android.gms.tagmanager;

import android.content.Context;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.gtm.zzaa;
import com.google.android.gms.internal.gtm.zzag;
import com.google.android.gms.internal.gtm.zzai;
import com.google.android.gms.internal.gtm.zzrs;
import com.google.android.gms.internal.gtm.zzrz;
import com.google.android.gms.internal.gtm.zzsa;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@VisibleForTesting
public class Container {
    private final Context zza;
    private final String zzb;
    private final DataLayer zzc;
    private zzeu zzd;
    private Map<String, FunctionCallMacroCallback> zze = new HashMap();
    private Map<String, FunctionCallTagCallback> zzf = new HashMap();
    private volatile long zzg;
    private volatile String zzh = "";

    public interface FunctionCallMacroCallback {
        Object getValue(String str, Map<String, Object> map);
    }

    public interface FunctionCallTagCallback {
        void execute(String str, Map<String, Object> map);
    }

    public Container(Context context, DataLayer dataLayer, String str, long j, zzai zzai) {
        this.zza = context;
        this.zzc = dataLayer;
        this.zzb = str;
        this.zzg = j;
        zzaa zzc2 = zzai.zzc();
        zzc2.getClass();
        try {
            zzg(zzsa.zzb(zzc2));
        } catch (zzrz e) {
            String valueOf = String.valueOf(zzc2);
            String obj = e.toString();
            StringBuilder sb = new StringBuilder(valueOf.length() + 46 + String.valueOf(obj).length());
            sb.append("Not loading resource: ");
            sb.append(valueOf);
            sb.append(" because it is invalid: ");
            sb.append(obj);
            zzdh.zza(sb.toString());
        }
        if (zzai.zza() != 0) {
            zzag[] zzagArr = (zzag[]) zzai.zzi().toArray(new zzag[0]);
            zzeu zzf2 = zzf();
            if (zzf2 == null) {
                zzdh.zza("evaluateTags called for closed container.");
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (zzag add : zzagArr) {
                arrayList.add(add);
            }
            zzf2.zze(arrayList);
        }
    }

    private final synchronized zzeu zzf() {
        return this.zzd;
    }

    private final void zzg(zzrs zzrs) {
        this.zzh = zzrs.zzb();
        zzrs zzrs2 = zzrs;
        zzh(new zzeu((Context) Preconditions.checkNotNull(this.zza), zzrs2, (DataLayer) Preconditions.checkNotNull(this.zzc), new zzv(this, (zzu) null), new zzx(this, (zzw) null), new zzdl(), (byte[]) null));
        if (getBoolean("_gtm.loadEventEnabled")) {
            this.zzc.pushEvent("gtm.load", DataLayer.mapOf("gtm.id", Preconditions.checkNotNull(this.zzb)));
        }
    }

    private final synchronized void zzh(zzeu zzeu) {
        this.zzd = zzeu;
    }

    public boolean getBoolean(String str) {
        zzeu zzf2 = zzf();
        if (zzf2 == null) {
            zzdh.zza("getBoolean called for closed container.");
            return zzfv.zzf().booleanValue();
        }
        try {
            return zzfv.zzg(zzfv.zzl(zzf2.zza(str).zza())).booleanValue();
        } catch (Exception e) {
            String message = e.getMessage();
            StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 66);
            sb.append("Calling getBoolean() threw an exception: ");
            sb.append(message);
            sb.append(" Returning default value.");
            zzdh.zza(sb.toString());
            return zzfv.zzf().booleanValue();
        }
    }

    public String getContainerId() {
        return this.zzb;
    }

    public double getDouble(String str) {
        zzeu zzf2 = zzf();
        if (zzf2 == null) {
            zzdh.zza("getDouble called for closed container.");
            return zzfv.zzh().doubleValue();
        }
        try {
            return zzfv.zzi(zzfv.zzl(zzf2.zza(str).zza())).doubleValue();
        } catch (Exception e) {
            String message = e.getMessage();
            StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 65);
            sb.append("Calling getDouble() threw an exception: ");
            sb.append(message);
            sb.append(" Returning default value.");
            zzdh.zza(sb.toString());
            return zzfv.zzh().doubleValue();
        }
    }

    public long getLastRefreshTime() {
        return this.zzg;
    }

    public long getLong(String str) {
        zzeu zzf2 = zzf();
        if (zzf2 == null) {
            zzdh.zza("getLong called for closed container.");
            return zzfv.zzj().longValue();
        }
        try {
            return zzfv.zzk(zzfv.zzl(zzf2.zza(str).zza())).longValue();
        } catch (Exception e) {
            String message = e.getMessage();
            StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 63);
            sb.append("Calling getLong() threw an exception: ");
            sb.append(message);
            sb.append(" Returning default value.");
            zzdh.zza(sb.toString());
            return zzfv.zzj().longValue();
        }
    }

    public String getString(String str) {
        zzeu zzf2 = zzf();
        if (zzf2 == null) {
            zzdh.zza("getString called for closed container.");
            return zzfv.zzm();
        }
        try {
            return zzfv.zzn(zzfv.zzl(zzf2.zza(str).zza()));
        } catch (Exception e) {
            String message = e.getMessage();
            StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 65);
            sb.append("Calling getString() threw an exception: ");
            sb.append(message);
            sb.append(" Returning default value.");
            zzdh.zza(sb.toString());
            return zzfv.zzm();
        }
    }

    public boolean isDefault() {
        return getLastRefreshTime() == 0;
    }

    public void registerFunctionCallMacroCallback(String str, FunctionCallMacroCallback functionCallMacroCallback) {
        if (functionCallMacroCallback != null) {
            synchronized (this.zze) {
                this.zze.put(str, functionCallMacroCallback);
            }
            return;
        }
        throw new NullPointerException("Macro handler must be non-null");
    }

    public void registerFunctionCallTagCallback(String str, FunctionCallTagCallback functionCallTagCallback) {
        if (functionCallTagCallback != null) {
            synchronized (this.zzf) {
                this.zzf.put(str, functionCallTagCallback);
            }
            return;
        }
        throw new NullPointerException("Tag callback must be non-null");
    }

    public void unregisterFunctionCallMacroCallback(String str) {
        synchronized (this.zze) {
            this.zze.remove(str);
        }
    }

    public void unregisterFunctionCallTagCallback(String str) {
        synchronized (this.zzf) {
            this.zzf.remove(str);
        }
    }

    @VisibleForTesting
    public final FunctionCallMacroCallback zza(String str) {
        FunctionCallMacroCallback functionCallMacroCallback;
        synchronized (this.zze) {
            functionCallMacroCallback = this.zze.get(str);
        }
        return functionCallMacroCallback;
    }

    @VisibleForTesting
    public final FunctionCallTagCallback zzb(String str) {
        FunctionCallTagCallback functionCallTagCallback;
        synchronized (this.zzf) {
            functionCallTagCallback = this.zzf.get(str);
        }
        return functionCallTagCallback;
    }

    @VisibleForTesting
    public final String zzc() {
        return this.zzh;
    }

    @VisibleForTesting
    public final void zzd(String str) {
        zzeu zzf2 = zzf();
        if (zzf2 == null) {
            zzdh.zza("evaluateTags called for closed container.");
        } else {
            zzf2.zzc(str);
        }
    }

    public final void zze() {
        this.zzd = null;
    }

    public Container(Context context, DataLayer dataLayer, String str, long j, zzrs zzrs) {
        this.zza = context;
        this.zzc = dataLayer;
        this.zzb = str;
        this.zzg = 0;
        zzg(zzrs);
    }
}
