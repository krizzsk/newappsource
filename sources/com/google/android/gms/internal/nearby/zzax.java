package com.google.android.gms.internal.nearby;

import android.annotation.TargetApi;
import android.content.Context;
import android.provider.Settings;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.nearby.exposurenotification.DailySummariesConfig;
import com.google.android.gms.nearby.exposurenotification.DailySummary;
import com.google.android.gms.nearby.exposurenotification.DiagnosisKeyFileProvider;
import com.google.android.gms.nearby.exposurenotification.DiagnosisKeysDataMapping;
import com.google.android.gms.nearby.exposurenotification.ExposureConfiguration;
import com.google.android.gms.nearby.exposurenotification.ExposureInformation;
import com.google.android.gms.nearby.exposurenotification.ExposureNotificationClient;
import com.google.android.gms.nearby.exposurenotification.ExposureNotificationStatus;
import com.google.android.gms.nearby.exposurenotification.ExposureSummary;
import com.google.android.gms.nearby.exposurenotification.ExposureWindow;
import com.google.android.gms.nearby.exposurenotification.PackageConfiguration;
import com.google.android.gms.nearby.exposurenotification.TemporaryExposureKey;
import com.google.android.gms.nearby.zza;
import com.google.android.gms.tasks.Task;
import java.io.File;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public final class zzax extends GoogleApi implements ExposureNotificationClient {
    public static final /* synthetic */ int zza = 0;
    private static final Api zzb = new Api("Nearby.EXPOSURE_NOTIFICATION_API", new zzap(), new Api.ClientKey());
    private static final long zzc;
    private static final long zzd;

    static {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        zzc = timeUnit.toMillis(2);
        zzd = timeUnit.toMillis(60);
    }

    public zzax(Context context) {
        super(context, zzb, null, GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    private final Task zzb(DiagnosisKeyFileProvider diagnosisKeyFileProvider, ExposureConfiguration exposureConfiguration, String str) {
        return zzfd.zza(doWrite(TaskApiCall.builder().run(new zzaf(this, exposureConfiguration, diagnosisKeyFileProvider, str)).setFeatures(zza.zzo).build()), zzd);
    }

    @TargetApi(21)
    public final boolean deviceSupportsLocationlessScanning() {
        if (Settings.Global.getInt(getApplicationContext().getContentResolver(), "bluetooth_sanitized_exposure_notification_supported", 0) == 1) {
            return true;
        }
        return false;
    }

    public final Task<Integer> getCalibrationConfidence() {
        return zzfd.zza(doRead(TaskApiCall.builder().run(new zzz(this)).setFeatures(zza.zzk).build()), zzc);
    }

    public final Task<List<DailySummary>> getDailySummaries(DailySummariesConfig dailySummariesConfig) {
        return zzfd.zza(doRead(TaskApiCall.builder().run(new zzs(this, dailySummariesConfig)).setFeatures(zza.zzl).build()), zzc);
    }

    public final Task<DiagnosisKeysDataMapping> getDiagnosisKeysDataMapping() {
        return zzfd.zza(doRead(TaskApiCall.builder().run(new zzab(this)).setFeatures(zza.zzn).build()), zzc);
    }

    public final Task<List<ExposureInformation>> getExposureInformation(String str) {
        return zzfd.zza(doRead(TaskApiCall.builder().run(new zzaa(this, str)).setFeatures(zza.zzh).build()), zzc);
    }

    public final Task<ExposureSummary> getExposureSummary(String str) {
        return zzfd.zza(doRead(TaskApiCall.builder().run(new zzad(this, str)).setFeatures(zza.zzh).build()), zzc);
    }

    public final Task<List<ExposureWindow>> getExposureWindows() {
        return zzfd.zza(doRead(TaskApiCall.builder().run(new zzac(this, ExposureNotificationClient.TOKEN_A)).setFeatures(zza.zzh).build()), zzc);
    }

    public final Task<PackageConfiguration> getPackageConfiguration() {
        return zzfd.zza(doRead(TaskApiCall.builder().run(new zzag(this)).setFeatures(zza.zzp).build()), zzc);
    }

    public final Task<Set<ExposureNotificationStatus>> getStatus() {
        return zzfd.zza(doRead(TaskApiCall.builder().run(new zzq(this)).setFeatures(zza.zzm).build()), zzc);
    }

    public final Task<List<TemporaryExposureKey>> getTemporaryExposureKeyHistory() {
        return zzfd.zza(doRead(TaskApiCall.builder().run(new zzae(this)).setFeatures(zza.zzh).build()), zzc);
    }

    public final Task<Long> getVersion() {
        return zzfd.zza(doRead(TaskApiCall.builder().run(new zzr(this)).setFeatures(zza.zzj).build()), zzc);
    }

    public final Task<Boolean> isEnabled() {
        return zzfd.zza(doRead(TaskApiCall.builder().run(new zzu(this)).setFeatures(zza.zzh).build()), zzc);
    }

    public final Task<Void> provideDiagnosisKeys(DiagnosisKeyFileProvider diagnosisKeyFileProvider) {
        return zzb(diagnosisKeyFileProvider, new ExposureConfiguration.ExposureConfigurationBuilder().build(), ExposureNotificationClient.TOKEN_A);
    }

    public final Task<Void> requestPreAuthorizedTemporaryExposureKeyHistory() {
        return zzfd.zza(doWrite(TaskApiCall.builder().run(zzy.zza).setFeatures(zza.zzq).build()), zzc);
    }

    public final Task<Void> requestPreAuthorizedTemporaryExposureKeyHistoryForSelfReport() {
        return zzfd.zza(doWrite(TaskApiCall.builder().run(zzt.zza).setFeatures(zza.zzr).build()), zzc);
    }

    public final Task<Void> requestPreAuthorizedTemporaryExposureKeyRelease() {
        return zzfd.zza(doWrite(TaskApiCall.builder().run(zzo.zza).setFeatures(zza.zzq).build()), zzc);
    }

    public final Task<Void> setDiagnosisKeysDataMapping(DiagnosisKeysDataMapping diagnosisKeysDataMapping) {
        return zzfd.zza(doWrite(TaskApiCall.builder().run(new zzx(diagnosisKeysDataMapping)).setFeatures(zza.zzn).build()), zzc);
    }

    public final Task<Void> start() {
        return zzfd.zza(doWrite(TaskApiCall.builder().run(zzw.zza).setFeatures(zza.zzh).build()), zzc);
    }

    public final Task<Void> stop() {
        return zzfd.zza(doWrite(TaskApiCall.builder().run(zzp.zza).setFeatures(zza.zzh).build()), zzc);
    }

    public final /* synthetic */ Task zza(List list, ExposureConfiguration exposureConfiguration, String str, Task task) throws Exception {
        if (((Long) task.getResult()).longValue() >= 17203704004L) {
            return zzb(new DiagnosisKeyFileProvider(list), exposureConfiguration, str);
        }
        return doWrite(TaskApiCall.builder().run(new zzah(this, list, exposureConfiguration, str)).setFeatures(zza.zzh).build());
    }

    public final Task<Void> provideDiagnosisKeys(List<File> list) {
        ExposureConfiguration build = new ExposureConfiguration.ExposureConfigurationBuilder().build();
        return zzfd.zza(zzfd.zza(doRead(TaskApiCall.builder().run(new zzr(this)).setFeatures(zza.zzj).build()), zzc).continueWithTask(new zzv(this, list, build, ExposureNotificationClient.TOKEN_A)), zzd);
    }

    public final Task<List<ExposureWindow>> getExposureWindows(String str) {
        return zzfd.zza(doRead(TaskApiCall.builder().run(new zzac(this, str)).setFeatures(zza.zzh).build()), zzc);
    }

    public final Task<Void> provideDiagnosisKeys(List<File> list, ExposureConfiguration exposureConfiguration, String str) {
        return zzfd.zza(zzfd.zza(doRead(TaskApiCall.builder().run(new zzr(this)).setFeatures(zza.zzj).build()), zzc).continueWithTask(new zzv(this, list, exposureConfiguration, str)), zzd);
    }
}
