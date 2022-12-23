package com.google.android.gms.measurement.internal;

import android.content.Context;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zzhe;
import com.google.android.gms.internal.measurement.zzhp;
import com.moovit.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@VisibleForTesting
public final class zzeb {
    public static final zzea zzA = zza("measurement.upload.retry_time", 1800000L, 1800000L, zzbi.zza);
    public static final zzea zzB = zza("measurement.upload.retry_count", 6, 6, zzbk.zza);
    public static final zzea zzC = zza("measurement.upload.max_queue_time", 2419200000L, 2419200000L, zzbl.zza);
    public static final zzea zzD = zza("measurement.lifetimevalue.max_currency_tracked", 4, 4, zzbm.zza);
    public static final zzea zzE = zza("measurement.audience.filter_result_max_count", 200, 200, zzbo.zza);
    public static final zzea zzF = zza("measurement.upload.max_public_user_properties", 25, 25, (zzdx) null);
    public static final zzea zzG = zza("measurement.upload.max_event_name_cardinality", 500, 500, (zzdx) null);
    public static final zzea zzH = zza("measurement.upload.max_public_event_params", 25, 25, (zzdx) null);
    public static final zzea zzI;
    public static final zzea zzJ;
    public static final zzea zzK = zza("measurement.test.string_flag", "---", "---", zzbr.zza);
    public static final zzea zzL = zza("measurement.test.long_flag", -1L, -1L, zzbs.zza);
    public static final zzea zzM = zza("measurement.test.int_flag", -2, -2, zzbt.zza);
    public static final zzea zzN;
    public static final zzea zzO = zza("measurement.experiment.max_ids", 50, 50, zzbw.zza);
    public static final zzea zzP = zza("measurement.max_bundles_per_iteration", 100, 100, zzbx.zza);
    public static final zzea zzQ = zza("measurement.sdk.attribution.cache.ttl", 604800000L, 604800000L, zzby.zza);
    public static final zzea zzR = zza("measurement.redaction.app_instance_id.ttl", 7200000L, 7200000L, zzca.zza);
    public static final zzea zzS;
    public static final zzea zzT;
    public static final zzea zzU;
    public static final zzea zzV;
    public static final zzea zzW;
    public static final zzea zzX;
    public static final zzea zzY;
    public static final zzea zzZ;
    public static final zzea zza = zza("measurement.ad_id_cache_time", 10000L, 10000L, zzbj.zza);
    public static final zzea zzaA;
    public static final zzea zzaB;
    /* access modifiers changed from: private */
    public static final List zzaC = Collections.synchronizedList(new ArrayList());
    private static final Set zzaD = Collections.synchronizedSet(new HashSet());
    public static final zzea zzaa;
    public static final zzea zzab;
    public static final zzea zzac;
    public static final zzea zzad;
    public static final zzea zzae;
    public static final zzea zzaf = zza("measurement.service.storage_consent_support_version", 203600, 203600, zzcp.zza);
    public static final zzea zzag;
    public static final zzea zzah;
    public static final zzea zzai;
    public static final zzea zzaj;
    public static final zzea zzak;
    public static final zzea zzal;
    public static final zzea zzam;
    public static final zzea zzan;
    public static final zzea zzao;
    public static final zzea zzap;
    public static final zzea zzaq;
    public static final zzea zzar;
    public static final zzea zzas;
    public static final zzea zzat;
    public static final zzea zzau;
    public static final zzea zzav;
    public static final zzea zzaw;
    public static final zzea zzax;
    public static final zzea zzay;
    public static final zzea zzaz;
    public static final zzea zzb = zza("measurement.monitoring.sample_period_millis", 86400000L, 86400000L, zzbb.zza);
    public static final zzea zzc = zza("measurement.config.cache_time", 86400000L, 3600000L, zzbn.zza);
    public static final zzea zzd = zza("measurement.config.url_scheme", "https", "https", zzbz.zza);
    public static final zzea zze = zza("measurement.config.url_authority", "app-measurement.com", "app-measurement.com", zzcl.zza);
    public static final zzea zzf = zza("measurement.upload.max_bundles", 100, 100, zzcx.zza);
    public static final zzea zzg;
    public static final zzea zzh;
    public static final zzea zzi = zza("measurement.upload.max_events_per_bundle", 1000, 1000, zzds.zza);
    public static final zzea zzj = zza("measurement.upload.max_events_per_day", 100000, 100000, zzdt.zza);
    public static final zzea zzk = zza("measurement.upload.max_error_events_per_day", 1000, 1000, zzbu.zza);
    public static final zzea zzl = zza("measurement.upload.max_public_events_per_day", 50000, 50000, zzcf.zza);
    public static final zzea zzm = zza("measurement.upload.max_conversions_per_day", 10000, 10000, zzcq.zza);
    public static final zzea zzn = zza("measurement.upload.max_realtime_events_per_day", 10, 10, zzdb.zza);
    public static final zzea zzo = zza("measurement.store.max_stored_events_per_app", 100000, 100000, zzdm.zza);
    public static final zzea zzp = zza("measurement.upload.url", "https://app-measurement.com/a", "https://app-measurement.com/a", zzdu.zza);
    public static final zzea zzq = zza("measurement.upload.backoff_period", 43200000L, 43200000L, zzdv.zza);
    public static final zzea zzr = zza("measurement.upload.window_interval", 3600000L, 3600000L, zzdw.zza);
    public static final zzea zzs = zza("measurement.upload.interval", 3600000L, 3600000L, zzaz.zza);
    public static final zzea zzt = zza("measurement.upload.realtime_upload_interval", 10000L, 10000L, zzba.zza);
    public static final zzea zzu = zza("measurement.upload.debug_upload_interval", 1000L, 1000L, zzbc.zza);
    public static final zzea zzv = zza("measurement.upload.minimum_delay", 500L, 500L, zzbd.zza);
    public static final zzea zzw = zza("measurement.alarm_manager.minimum_interval", 60000L, 60000L, zzbe.zza);
    public static final zzea zzx = zza("measurement.upload.stale_data_deletion_interval", 86400000L, 86400000L, zzbf.zza);
    public static final zzea zzy = zza("measurement.upload.refresh_blacklisted_config_interval", 604800000L, 604800000L, zzbg.zza);
    public static final zzea zzz = zza("measurement.upload.initial_upload_delay_time", 15000L, 15000L, zzbh.zza);

    static {
        Integer valueOf = Integer.valueOf(SQLiteDatabase.OPEN_FULLMUTEX);
        zzg = zza("measurement.upload.max_batch_size", valueOf, valueOf, zzdj.zza);
        zzh = zza("measurement.upload.max_bundle_size", valueOf, valueOf, zzdr.zza);
        Long valueOf2 = Long.valueOf(InstallSheetPresenter.LOADING_TIMER_DELAY_IN_MILLIS);
        zzI = zza("measurement.service_client.idle_disconnect_millis", valueOf2, valueOf2, zzbp.zza);
        Boolean bool = Boolean.FALSE;
        zzJ = zza("measurement.test.boolean_flag", bool, bool, zzbq.zza);
        Double valueOf3 = Double.valueOf(-3.0d);
        zzN = zza("measurement.test.double_flag", valueOf3, valueOf3, zzbv.zza);
        Boolean bool2 = Boolean.TRUE;
        zzS = zza("measurement.collection.log_event_and_bundle_v2", bool2, bool2, zzcb.zza);
        zzT = zza("measurement.quality.checksum", bool, bool, (zzdx) null);
        zzU = zza("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", bool, bool, zzcc.zza);
        zzV = zza("measurement.audience.refresh_event_count_filters_timestamp", bool, bool, zzcd.zza);
        zzW = zza("measurement.audience.use_bundle_timestamp_for_event_count_filters", bool, bool, zzce.zza);
        zzX = zza("measurement.sdk.collection.retrieve_deeplink_from_bow_2", bool2, bool2, zzcg.zza);
        zzY = zza("measurement.sdk.collection.last_deep_link_referrer_campaign2", bool, bool, zzch.zza);
        zzZ = zza("measurement.lifecycle.app_in_background_parameter", bool, bool, zzci.zza);
        zzaa = zza("measurement.integration.disable_firebase_instance_id", bool, bool, zzcj.zza);
        zzab = zza("measurement.collection.service.update_with_analytics_fix", bool, bool, zzck.zza);
        zzac = zza("measurement.client.firebase_feature_rollout.v1.enable", bool2, bool2, zzcm.zza);
        zzad = zza("measurement.client.sessions.check_on_reset_and_enable2", bool2, bool2, zzcn.zza);
        zzae = zza("measurement.collection.synthetic_data_mitigation", bool, bool, zzco.zza);
        zzag = zza("measurement.client.click_identifier_control.dev", bool, bool, zzcr.zza);
        zzah = zza("measurement.service.click_identifier_control", bool, bool, zzcs.zza);
        zzai = zza("measurement.service.store_null_safelist", bool2, bool2, zzct.zza);
        zzaj = zza("measurement.service.store_safelist", bool2, bool2, zzcu.zza);
        zzak = zza("measurement.redaction.no_aiid_in_config_request", bool2, bool2, zzcv.zza);
        zzal = zza("measurement.redaction.config_redacted_fields", bool2, bool2, zzcw.zza);
        zzam = zza("measurement.redaction.upload_redacted_fields", bool2, bool2, zzcy.zza);
        zzan = zza("measurement.redaction.upload_subdomain_override", bool2, bool2, zzcz.zza);
        zzao = zza("measurement.redaction.device_info", bool2, bool2, zzda.zza);
        zzap = zza("measurement.redaction.user_id", bool2, bool2, zzdc.zza);
        zzaq = zza("measurement.redaction.google_signals", bool2, bool2, zzdd.zza);
        zzar = zza("measurement.collection.enable_session_stitching_token.service", bool, bool, zzde.zza);
        zzas = zza("measurement.collection.enable_session_stitching_token.client.dev", bool, bool, zzdf.zza);
        zzat = zza("measurement.redaction.app_instance_id", bool2, bool2, zzdg.zza);
        zzau = zza("measurement.redaction.populate_ephemeral_app_instance_id", bool2, bool2, zzdh.zza);
        zzav = zza("measurement.redaction.enhanced_uid", bool2, bool2, zzdi.zza);
        zzaw = zza("measurement.redaction.e_tag", bool2, bool2, zzdk.zza);
        zzax = zza("measurement.redaction.client_ephemeral_aiid_generation", bool2, bool2, zzdl.zza);
        zzay = zza("measurement.redaction.retain_major_os_version", bool2, bool2, zzdn.zza);
        zzaz = zza("measurement.redaction.scion_payload_generator", bool2, bool2, zzdo.zza);
        zzaA = zza("measurement.audience.dynamic_filters.oob_fix", bool2, bool2, zzdp.zza);
        zzaB = zza("measurement.service.clear_global_params_on_uninstall", bool2, bool2, zzdq.zza);
    }

    @VisibleForTesting
    public static zzea zza(String str, Object obj, Object obj2, zzdx zzdx) {
        zzea zzea = new zzea(str, obj, obj2, zzdx, (zzdz) null);
        zzaC.add(zzea);
        return zzea;
    }

    public static Map zzc(Context context) {
        zzhe zza2 = zzhe.zza(context.getContentResolver(), zzhp.zza("com.google.android.gms.measurement"), zzay.zza);
        if (zza2 == null) {
            return Collections.emptyMap();
        }
        return zza2.zzc();
    }
}
