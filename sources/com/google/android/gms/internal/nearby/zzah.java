package com.google.android.gms.internal.nearby;

import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.nearby.exposurenotification.ExposureConfiguration;
import com.google.android.gms.nearby.exposurenotification.ExposureNotificationStatusCodes;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public final /* synthetic */ class zzah implements RemoteCall {
    public final /* synthetic */ zzax zza;
    public final /* synthetic */ List zzb;
    public final /* synthetic */ ExposureConfiguration zzc;
    public final /* synthetic */ String zzd;

    public /* synthetic */ zzah(zzax zzax, List list, ExposureConfiguration exposureConfiguration, String str) {
        this.zza = zzax;
        this.zzb = list;
        this.zzc = exposureConfiguration;
        this.zzd = str;
    }

    public final void accept(Object obj, Object obj2) {
        zzax zzax = this.zza;
        List<File> list = this.zzb;
        ExposureConfiguration exposureConfiguration = this.zzc;
        String str = this.zzd;
        zzn zzn = (zzn) obj;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        ArrayList arrayList = new ArrayList(list.size());
        try {
            for (File open : list) {
                arrayList.add(ParcelFileDescriptor.open(open, 268435456));
            }
            zzed zzed = new zzed();
            zzed.zzc(arrayList);
            zzed.zzb(exposureConfiguration);
            zzed.zzd(new zzas(zzax, arrayList, taskCompletionSource));
            zzed.zze(str);
            ((zzdr) zzn.getService()).zzo(zzed.zzf());
        } catch (FileNotFoundException e) {
            TaskUtil.setResultOrApiException(new Status((int) ExposureNotificationStatusCodes.FAILED_DISK_IO, e.getMessage()), taskCompletionSource);
        }
    }
}
