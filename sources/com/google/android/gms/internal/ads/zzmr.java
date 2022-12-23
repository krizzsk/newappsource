package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.content.Context;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.PlaybackMetrics$Builder;
import android.media.metrics.PlaybackSession;
import android.media.metrics.TrackChangeEvent$Builder;
import android.os.SystemClock;
import android.util.Pair;
import com.facebook.ads.AdError;
import java.io.IOException;
import java.util.HashMap;

public final class zzmr implements zzkl, zzms {
    private final Context zza;
    private final zzmt zzb;
    private final PlaybackSession zzc;
    private final long zzd = SystemClock.elapsedRealtime();
    private final zzch zze = new zzch();
    private final zzcf zzf = new zzcf();
    private final HashMap zzg = new HashMap();
    private final HashMap zzh = new HashMap();
    private String zzi;
    private PlaybackMetrics$Builder zzj;
    private int zzk;
    private int zzl = 0;
    private int zzm = 0;
    private zzbr zzn;
    private zzmq zzo;
    private zzmq zzp;
    private zzmq zzq;
    private zzad zzr;
    private zzad zzs;
    private zzad zzt;
    private boolean zzu;
    private boolean zzv;
    private int zzw;
    private int zzx;
    private int zzy;
    private boolean zzz;

    private zzmr(Context context, PlaybackSession playbackSession) {
        this.zza = context.getApplicationContext();
        this.zzc = playbackSession;
        zzmp zzmp = new zzmp(zzmp.zza);
        this.zzb = zzmp;
        zzmp.zzg(this);
    }

    public static zzmr zzb(Context context) {
        MediaMetricsManager mediaMetricsManager = (MediaMetricsManager) context.getSystemService("media_metrics");
        if (mediaMetricsManager == null) {
            return null;
        }
        return new zzmr(context, mediaMetricsManager.createPlaybackSession());
    }

    @SuppressLint({"SwitchIntDef"})
    private static int zzr(int i) {
        switch (zzeg.zzl(i)) {
            case AdError.ICONVIEW_MISSING_ERROR_CODE:
                return 24;
            case AdError.AD_ASSETS_UNSUPPORTED_TYPE_ERROR_CODE:
                return 28;
            case 6004:
                return 25;
            case 6005:
                return 26;
            default:
                return 27;
        }
    }

    private final void zzs() {
        long j;
        long j2;
        int i;
        PlaybackMetrics$Builder playbackMetrics$Builder = this.zzj;
        if (playbackMetrics$Builder != null && this.zzz) {
            playbackMetrics$Builder.setAudioUnderrunCount(this.zzy);
            this.zzj.setVideoFramesDropped(this.zzw);
            this.zzj.setVideoFramesPlayed(this.zzx);
            Long l = (Long) this.zzg.get(this.zzi);
            PlaybackMetrics$Builder playbackMetrics$Builder2 = this.zzj;
            if (l == null) {
                j = 0;
            } else {
                j = l.longValue();
            }
            playbackMetrics$Builder2.setNetworkTransferDurationMillis(j);
            Long l2 = (Long) this.zzh.get(this.zzi);
            PlaybackMetrics$Builder playbackMetrics$Builder3 = this.zzj;
            if (l2 == null) {
                j2 = 0;
            } else {
                j2 = l2.longValue();
            }
            playbackMetrics$Builder3.setNetworkBytesRead(j2);
            PlaybackMetrics$Builder playbackMetrics$Builder4 = this.zzj;
            if (l2 == null || l2.longValue() <= 0) {
                i = 0;
            } else {
                i = 1;
            }
            playbackMetrics$Builder4.setStreamSource(i);
            this.zzc.reportPlaybackMetrics(this.zzj.build());
        }
        this.zzj = null;
        this.zzi = null;
        this.zzy = 0;
        this.zzw = 0;
        this.zzx = 0;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzz = false;
    }

    private final void zzt(long j, zzad zzad, int i) {
        int i2;
        if (!zzeg.zzS(this.zzs, zzad)) {
            if (this.zzs == null) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            this.zzs = zzad;
            zzx(0, j, zzad, i2);
        }
    }

    private final void zzu(long j, zzad zzad, int i) {
        int i2;
        if (!zzeg.zzS(this.zzt, zzad)) {
            if (this.zzt == null) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            this.zzt = zzad;
            zzx(2, j, zzad, i2);
        }
    }

    private final void zzv(zzci zzci, zzsb zzsb) {
        int zza2;
        PlaybackMetrics$Builder playbackMetrics$Builder = this.zzj;
        if (zzsb != null && (zza2 = zzci.zza(zzsb.zza)) != -1) {
            int i = 0;
            zzci.zzd(zza2, this.zzf, false);
            zzci.zze(this.zzf.zzd, this.zze, 0);
            zzaw zzaw = this.zze.zzd.zzd;
            int i2 = 2;
            if (zzaw != null) {
                int zzp2 = zzeg.zzp(zzaw.zza);
                if (zzp2 == 0) {
                    i = 3;
                } else if (zzp2 == 1) {
                    i = 5;
                } else if (zzp2 != 2) {
                    i = 1;
                } else {
                    i = 4;
                }
            }
            playbackMetrics$Builder.setStreamType(i);
            zzch zzch = this.zze;
            if (zzch.zzn != -9223372036854775807L && !zzch.zzl && !zzch.zzi && !zzch.zzb()) {
                playbackMetrics$Builder.setMediaDurationMillis(zzeg.zzz(this.zze.zzn));
            }
            if (true != this.zze.zzb()) {
                i2 = 1;
            }
            playbackMetrics$Builder.setPlaybackType(i2);
            this.zzz = true;
        }
    }

    private final void zzw(long j, zzad zzad, int i) {
        int i2;
        if (!zzeg.zzS(this.zzr, zzad)) {
            if (this.zzr == null) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            this.zzr = zzad;
            zzx(1, j, zzad, i2);
        }
    }

    private final void zzx(int i, long j, zzad zzad, int i2) {
        int i3;
        String str;
        TrackChangeEvent$Builder timeSinceCreatedMillis = new TrackChangeEvent$Builder(i).setTimeSinceCreatedMillis(j - this.zzd);
        if (zzad != null) {
            timeSinceCreatedMillis.setTrackState(1);
            if (i2 != 1) {
                i3 = 1;
            } else {
                i3 = 2;
            }
            timeSinceCreatedMillis.setTrackChangeReason(i3);
            String str2 = zzad.zzl;
            if (str2 != null) {
                timeSinceCreatedMillis.setContainerMimeType(str2);
            }
            String str3 = zzad.zzm;
            if (str3 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str3);
            }
            String str4 = zzad.zzj;
            if (str4 != null) {
                timeSinceCreatedMillis.setCodecName(str4);
            }
            int i4 = zzad.zzi;
            if (i4 != -1) {
                timeSinceCreatedMillis.setBitrate(i4);
            }
            int i5 = zzad.zzr;
            if (i5 != -1) {
                timeSinceCreatedMillis.setWidth(i5);
            }
            int i6 = zzad.zzs;
            if (i6 != -1) {
                timeSinceCreatedMillis.setHeight(i6);
            }
            int i7 = zzad.zzz;
            if (i7 != -1) {
                timeSinceCreatedMillis.setChannelCount(i7);
            }
            int i8 = zzad.zzA;
            if (i8 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i8);
            }
            String str5 = zzad.zzd;
            if (str5 != null) {
                String[] zzaf = zzeg.zzaf(str5, "-");
                String str6 = zzaf[0];
                if (zzaf.length >= 2) {
                    str = zzaf[1];
                } else {
                    str = null;
                }
                Pair create = Pair.create(str6, str);
                timeSinceCreatedMillis.setLanguage((String) create.first);
                Object obj = create.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f = zzad.zzt;
            if (f != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.zzz = true;
        this.zzc.reportTrackChangeEvent(timeSinceCreatedMillis.build());
    }

    private final boolean zzy(zzmq zzmq) {
        return zzmq != null && zzmq.zzc.equals(this.zzb.zzd());
    }

    public final LogSessionId zza() {
        return this.zzc.getSessionId();
    }

    public final void zzc(zzkj zzkj, String str) {
        zzsb zzsb = zzkj.zzd;
        if (zzsb == null || !zzsb.zzb()) {
            zzs();
            this.zzi = str;
            this.zzj = new PlaybackMetrics$Builder().setPlayerName("AndroidXMedia3").setPlayerVersion("1.0.0-alpha03");
            zzv(zzkj.zzb, zzkj.zzd);
        }
    }

    public final void zzd(zzkj zzkj, String str, boolean z) {
        zzsb zzsb = zzkj.zzd;
        if ((zzsb == null || !zzsb.zzb()) && str.equals(this.zzi)) {
            zzs();
        }
        this.zzg.remove(str);
        this.zzh.remove(str);
    }

    public final /* synthetic */ void zze(zzkj zzkj, zzad zzad, zzgn zzgn) {
    }

    public final void zzf(zzkj zzkj, int i, long j, long j2) {
        long j3;
        zzsb zzsb = zzkj.zzd;
        if (zzsb != null) {
            String zze2 = this.zzb.zze(zzkj.zzb, zzsb);
            Long l = (Long) this.zzh.get(zze2);
            Long l2 = (Long) this.zzg.get(zze2);
            HashMap hashMap = this.zzh;
            long j4 = 0;
            if (l == null) {
                j3 = 0;
            } else {
                j3 = l.longValue();
            }
            hashMap.put(zze2, Long.valueOf(j3 + j));
            HashMap hashMap2 = this.zzg;
            if (l2 != null) {
                j4 = l2.longValue();
            }
            hashMap2.put(zze2, Long.valueOf(j4 + ((long) i)));
        }
    }

    public final void zzg(zzkj zzkj, zzrx zzrx) {
        zzsb zzsb = zzkj.zzd;
        if (zzsb != null) {
            zzad zzad = zzrx.zzb;
            zzad.getClass();
            zzmq zzmq = new zzmq(zzad, 0, this.zzb.zze(zzkj.zzb, zzsb));
            int i = zzrx.zza;
            if (i != 0) {
                if (i == 1) {
                    this.zzp = zzmq;
                    return;
                } else if (i != 2) {
                    if (i == 3) {
                        this.zzq = zzmq;
                        return;
                    }
                    return;
                }
            }
            this.zzo = zzmq;
        }
    }

    public final /* synthetic */ void zzh(zzkj zzkj, int i, long j) {
    }

    /* JADX WARNING: Removed duplicated region for block: B:178:0x02e4  */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x02f5  */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x030b  */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x030d  */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x030f  */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x0312  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x0314  */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x0316  */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x0318  */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x031a  */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x031c  */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x031f  */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x0324  */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x0346  */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x034a  */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x0357  */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x035a  */
    /* JADX WARNING: Removed duplicated region for block: B:209:0x036a  */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x036c  */
    /* JADX WARNING: Removed duplicated region for block: B:242:0x03ba  */
    /* JADX WARNING: Removed duplicated region for block: B:245:0x03e1  */
    /* JADX WARNING: Removed duplicated region for block: B:261:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzi(com.google.android.gms.internal.ads.zzcb r21, com.google.android.gms.internal.ads.zzkk r22) {
        /*
            r20 = this;
            r0 = r20
            r1 = r22
            int r2 = r22.zzb()
            if (r2 == 0) goto L_0x03ea
            r2 = 0
            r3 = 0
        L_0x000c:
            int r4 = r22.zzb()
            r5 = 11
            if (r3 >= r4) goto L_0x0036
            int r4 = r1.zza(r3)
            com.google.android.gms.internal.ads.zzkj r6 = r1.zzc(r4)
            if (r4 != 0) goto L_0x0024
            com.google.android.gms.internal.ads.zzmt r4 = r0.zzb
            r4.zzj(r6)
            goto L_0x0033
        L_0x0024:
            if (r4 != r5) goto L_0x002e
            com.google.android.gms.internal.ads.zzmt r4 = r0.zzb
            int r5 = r0.zzk
            r4.zzi(r6, r5)
            goto L_0x0033
        L_0x002e:
            com.google.android.gms.internal.ads.zzmt r4 = r0.zzb
            r4.zzh(r6)
        L_0x0033:
            int r3 = r3 + 1
            goto L_0x000c
        L_0x0036:
            long r3 = android.os.SystemClock.elapsedRealtime()
            boolean r6 = r1.zzd(r2)
            if (r6 == 0) goto L_0x004f
            com.google.android.gms.internal.ads.zzkj r6 = r1.zzc(r2)
            android.media.metrics.PlaybackMetrics$Builder r7 = r0.zzj
            if (r7 == 0) goto L_0x004f
            com.google.android.gms.internal.ads.zzci r7 = r6.zzb
            com.google.android.gms.internal.ads.zzsb r6 = r6.zzd
            r0.zzv(r7, r6)
        L_0x004f:
            r6 = 2
            boolean r7 = r1.zzd(r6)
            r9 = 3
            r10 = 0
            r11 = 1
            if (r7 == 0) goto L_0x00c6
            android.media.metrics.PlaybackMetrics$Builder r7 = r0.zzj
            if (r7 == 0) goto L_0x00c6
            com.google.android.gms.internal.ads.zzct r7 = r21.zzo()
            com.google.android.gms.internal.ads.zzfrh r7 = r7.zza()
            int r12 = r7.size()
            r13 = 0
        L_0x006a:
            if (r13 >= r12) goto L_0x008f
            java.lang.Object r14 = r7.get(r13)
            com.google.android.gms.internal.ads.zzcs r14 = (com.google.android.gms.internal.ads.zzcs) r14
            r15 = 0
        L_0x0073:
            int r5 = r14.zzb
            int r5 = r13 + 1
            if (r15 > 0) goto L_0x008b
            boolean r5 = r14.zzd(r15)
            if (r5 == 0) goto L_0x0088
            com.google.android.gms.internal.ads.zzad r5 = r14.zzb(r15)
            com.google.android.gms.internal.ads.zzv r5 = r5.zzp
            if (r5 == 0) goto L_0x0088
            goto L_0x0090
        L_0x0088:
            int r15 = r15 + 1
            goto L_0x0073
        L_0x008b:
            r13 = r5
            r5 = 11
            goto L_0x006a
        L_0x008f:
            r5 = r10
        L_0x0090:
            if (r5 == 0) goto L_0x00c6
            android.media.metrics.PlaybackMetrics$Builder r7 = r0.zzj
            int r12 = com.google.android.gms.internal.ads.zzeg.zza
            r12 = 0
        L_0x0097:
            int r13 = r5.zzb
            if (r12 >= r13) goto L_0x00c2
            com.google.android.gms.internal.ads.zzu r13 = r5.zza(r12)
            java.util.UUID r13 = r13.zza
            java.util.UUID r14 = com.google.android.gms.internal.ads.zzm.zzd
            boolean r14 = r13.equals(r14)
            if (r14 == 0) goto L_0x00ab
            r5 = 3
            goto L_0x00c3
        L_0x00ab:
            java.util.UUID r14 = com.google.android.gms.internal.ads.zzm.zze
            boolean r14 = r13.equals(r14)
            if (r14 == 0) goto L_0x00b5
            r5 = 2
            goto L_0x00c3
        L_0x00b5:
            java.util.UUID r14 = com.google.android.gms.internal.ads.zzm.zzc
            boolean r13 = r13.equals(r14)
            if (r13 == 0) goto L_0x00bf
            r5 = 6
            goto L_0x00c3
        L_0x00bf:
            int r12 = r12 + 1
            goto L_0x0097
        L_0x00c2:
            r5 = 1
        L_0x00c3:
            r7.setDrmType(r5)
        L_0x00c6:
            r5 = 1011(0x3f3, float:1.417E-42)
            boolean r5 = r1.zzd(r5)
            if (r5 == 0) goto L_0x00d3
            int r5 = r0.zzy
            int r5 = r5 + r11
            r0.zzy = r5
        L_0x00d3:
            com.google.android.gms.internal.ads.zzbr r5 = r0.zzn
            r16 = 9
            if (r5 != 0) goto L_0x00db
            goto L_0x0294
        L_0x00db:
            android.content.Context r7 = r0.zza
            int r8 = r5.zzb
            r12 = 1001(0x3e9, float:1.403E-42)
            r17 = 14
            r18 = 35
            r19 = 31
            r13 = 21
            r14 = 23
            if (r8 != r12) goto L_0x00f3
            r17 = 20
            r14 = 20
            goto L_0x026e
        L_0x00f3:
            r8 = r5
            com.google.android.gms.internal.ads.zzgu r8 = (com.google.android.gms.internal.ads.zzgu) r8
            int r12 = r8.zze
            int r8 = r8.zzi
            java.lang.Throwable r15 = r5.getCause()
            r15.getClass()
            boolean r2 = r15 instanceof java.io.IOException
            if (r2 == 0) goto L_0x01fd
            boolean r2 = r15 instanceof com.google.android.gms.internal.ads.zzfm
            if (r2 == 0) goto L_0x0110
            com.google.android.gms.internal.ads.zzfm r15 = (com.google.android.gms.internal.ads.zzfm) r15
            int r2 = r15.zzd
            r14 = 5
            goto L_0x026e
        L_0x0110:
            boolean r2 = r15 instanceof com.google.android.gms.internal.ads.zzfl
            if (r2 != 0) goto L_0x01f8
            boolean r2 = r15 instanceof com.google.android.gms.internal.ads.zzbp
            if (r2 == 0) goto L_0x011a
            goto L_0x01f8
        L_0x011a:
            boolean r2 = r15 instanceof com.google.android.gms.internal.ads.zzfk
            if (r2 != 0) goto L_0x01c5
            boolean r8 = r15 instanceof com.google.android.gms.internal.ads.zzfu
            if (r8 == 0) goto L_0x0124
            goto L_0x01c5
        L_0x0124:
            int r2 = r5.zzb
            r7 = 1002(0x3ea, float:1.404E-42)
            if (r2 != r7) goto L_0x012f
            r2 = 0
            r14 = 21
            goto L_0x026e
        L_0x012f:
            boolean r2 = r15 instanceof com.google.android.gms.internal.ads.zzpb
            if (r2 == 0) goto L_0x018d
            java.lang.Throwable r2 = r15.getCause()
            r2.getClass()
            int r7 = com.google.android.gms.internal.ads.zzeg.zza
            if (r7 < r13) goto L_0x0152
            boolean r8 = r2 instanceof android.media.MediaDrm.MediaDrmStateException
            if (r8 == 0) goto L_0x0152
            android.media.MediaDrm$MediaDrmStateException r2 = (android.media.MediaDrm.MediaDrmStateException) r2
            java.lang.String r2 = r2.getDiagnosticInfo()
            int r2 = com.google.android.gms.internal.ads.zzeg.zzm(r2)
            int r17 = zzr(r2)
            goto L_0x0266
        L_0x0152:
            if (r7 < r14) goto L_0x015f
            boolean r7 = r2 instanceof android.media.MediaDrmResetException
            if (r7 == 0) goto L_0x015f
            r17 = 27
            r2 = 0
            r14 = 27
            goto L_0x026e
        L_0x015f:
            boolean r7 = r2 instanceof android.media.NotProvisionedException
            if (r7 == 0) goto L_0x016a
            r17 = 24
            r2 = 0
            r14 = 24
            goto L_0x026e
        L_0x016a:
            boolean r7 = r2 instanceof android.media.DeniedByServerException
            if (r7 == 0) goto L_0x0175
            r17 = 29
            r2 = 0
            r14 = 29
            goto L_0x026e
        L_0x0175:
            boolean r7 = r2 instanceof com.google.android.gms.internal.ads.zzpm
            if (r7 == 0) goto L_0x017b
            goto L_0x0216
        L_0x017b:
            boolean r2 = r2 instanceof com.google.android.gms.internal.ads.zzoz
            if (r2 == 0) goto L_0x0186
            r17 = 28
            r2 = 0
            r14 = 28
            goto L_0x026e
        L_0x0186:
            r17 = 30
            r2 = 0
            r14 = 30
            goto L_0x026e
        L_0x018d:
            boolean r2 = r15 instanceof com.google.android.gms.internal.ads.zzfg
            if (r2 == 0) goto L_0x01c0
            java.lang.Throwable r2 = r15.getCause()
            boolean r2 = r2 instanceof java.io.FileNotFoundException
            if (r2 == 0) goto L_0x01c0
            java.lang.Throwable r2 = r15.getCause()
            r2.getClass()
            java.lang.Throwable r2 = r2.getCause()
            int r7 = com.google.android.gms.internal.ads.zzeg.zza
            if (r7 < r13) goto L_0x01bb
            boolean r7 = r2 instanceof android.system.ErrnoException
            if (r7 == 0) goto L_0x01bb
            android.system.ErrnoException r2 = (android.system.ErrnoException) r2
            int r2 = r2.errno
            int r7 = android.system.OsConstants.EACCES
            if (r2 != r7) goto L_0x01bb
            r17 = 32
            r2 = 0
            r14 = 32
            goto L_0x026e
        L_0x01bb:
            r2 = 0
            r14 = 31
            goto L_0x026e
        L_0x01c0:
            r2 = 0
            r14 = 9
            goto L_0x026e
        L_0x01c5:
            com.google.android.gms.internal.ads.zzdw r7 = com.google.android.gms.internal.ads.zzdw.zzb(r7)
            int r7 = r7.zza()
            if (r7 != r11) goto L_0x01d3
            r2 = 0
            r14 = 3
            goto L_0x026e
        L_0x01d3:
            java.lang.Throwable r7 = r15.getCause()
            boolean r8 = r7 instanceof java.net.UnknownHostException
            if (r8 == 0) goto L_0x01df
            r2 = 0
            r14 = 6
            goto L_0x026e
        L_0x01df:
            boolean r7 = r7 instanceof java.net.SocketTimeoutException
            if (r7 == 0) goto L_0x01e7
            r2 = 0
            r14 = 7
            goto L_0x026e
        L_0x01e7:
            if (r2 == 0) goto L_0x01f3
            com.google.android.gms.internal.ads.zzfk r15 = (com.google.android.gms.internal.ads.zzfk) r15
            int r2 = r15.zzc
            if (r2 != r11) goto L_0x01f3
            r2 = 0
            r14 = 4
            goto L_0x026e
        L_0x01f3:
            r2 = 0
            r14 = 8
            goto L_0x026e
        L_0x01f8:
            r2 = 0
            r14 = 11
            goto L_0x026e
        L_0x01fd:
            if (r12 != r11) goto L_0x0208
            if (r8 == 0) goto L_0x0203
            if (r8 != r11) goto L_0x0208
        L_0x0203:
            r2 = 0
            r14 = 35
            goto L_0x026e
        L_0x0208:
            if (r12 != r11) goto L_0x0212
            if (r8 != r9) goto L_0x0212
            r17 = 15
            r2 = 0
            r14 = 15
            goto L_0x026e
        L_0x0212:
            if (r12 != r11) goto L_0x0218
            if (r8 != r6) goto L_0x0218
        L_0x0216:
            r2 = 0
            goto L_0x026e
        L_0x0218:
            boolean r2 = r15 instanceof com.google.android.gms.internal.ads.zzqi
            if (r2 == 0) goto L_0x0227
            com.google.android.gms.internal.ads.zzqi r15 = (com.google.android.gms.internal.ads.zzqi) r15
            java.lang.String r2 = r15.zzd
            int r2 = com.google.android.gms.internal.ads.zzeg.zzm(r2)
            r14 = 13
            goto L_0x026e
        L_0x0227:
            boolean r2 = r15 instanceof com.google.android.gms.internal.ads.zzqf
            if (r2 == 0) goto L_0x0236
            com.google.android.gms.internal.ads.zzqf r15 = (com.google.android.gms.internal.ads.zzqf) r15
            java.lang.String r2 = r15.zzb
            int r2 = com.google.android.gms.internal.ads.zzeg.zzm(r2)
        L_0x0233:
            r14 = 14
            goto L_0x026e
        L_0x0236:
            boolean r2 = r15 instanceof java.lang.OutOfMemoryError
            if (r2 == 0) goto L_0x023c
            r2 = 0
            goto L_0x0233
        L_0x023c:
            boolean r2 = r15 instanceof com.google.android.gms.internal.ads.zznn
            if (r2 == 0) goto L_0x0249
            com.google.android.gms.internal.ads.zznn r15 = (com.google.android.gms.internal.ads.zznn) r15
            int r2 = r15.zza
            r17 = 17
            r14 = 17
            goto L_0x026e
        L_0x0249:
            boolean r2 = r15 instanceof com.google.android.gms.internal.ads.zznq
            if (r2 == 0) goto L_0x0256
            com.google.android.gms.internal.ads.zznq r15 = (com.google.android.gms.internal.ads.zznq) r15
            int r2 = r15.zza
            r17 = 18
            r14 = 18
            goto L_0x026e
        L_0x0256:
            int r2 = com.google.android.gms.internal.ads.zzeg.zza
            boolean r2 = r15 instanceof android.media.MediaCodec.CryptoException
            if (r2 == 0) goto L_0x0269
            android.media.MediaCodec$CryptoException r15 = (android.media.MediaCodec.CryptoException) r15
            int r2 = r15.getErrorCode()
            int r17 = zzr(r2)
        L_0x0266:
            r14 = r17
            goto L_0x026e
        L_0x0269:
            r17 = 22
            r2 = 0
            r14 = 22
        L_0x026e:
            android.media.metrics.PlaybackSession r7 = r0.zzc
            android.media.metrics.PlaybackErrorEvent$Builder r8 = new android.media.metrics.PlaybackErrorEvent$Builder
            r8.<init>()
            long r12 = r0.zzd
            long r12 = r3 - r12
            android.media.metrics.PlaybackErrorEvent$Builder r8 = r8.setTimeSinceCreatedMillis(r12)
            android.media.metrics.PlaybackErrorEvent$Builder r8 = r8.setErrorCode(r14)
            android.media.metrics.PlaybackErrorEvent$Builder r2 = r8.setSubErrorCode(r2)
            android.media.metrics.PlaybackErrorEvent$Builder r2 = r2.setException(r5)
            android.media.metrics.PlaybackErrorEvent r2 = r2.build()
            r7.reportPlaybackErrorEvent(r2)
            r0.zzz = r11
            r0.zzn = r10
        L_0x0294:
            boolean r2 = r1.zzd(r6)
            if (r2 == 0) goto L_0x02c3
            com.google.android.gms.internal.ads.zzct r2 = r21.zzo()
            boolean r5 = r2.zzb(r6)
            boolean r7 = r2.zzb(r11)
            boolean r2 = r2.zzb(r9)
            if (r5 != 0) goto L_0x02b1
            if (r7 != 0) goto L_0x02b1
            if (r2 == 0) goto L_0x02c3
            r2 = 1
        L_0x02b1:
            if (r5 != 0) goto L_0x02b8
            r5 = 0
            r0.zzw(r3, r10, r5)
            goto L_0x02b9
        L_0x02b8:
            r5 = 0
        L_0x02b9:
            if (r7 != 0) goto L_0x02be
            r0.zzt(r3, r10, r5)
        L_0x02be:
            if (r2 != 0) goto L_0x02c3
            r0.zzu(r3, r10, r5)
        L_0x02c3:
            com.google.android.gms.internal.ads.zzmq r2 = r0.zzo
            boolean r2 = r0.zzy(r2)
            if (r2 == 0) goto L_0x02db
            com.google.android.gms.internal.ads.zzmq r2 = r0.zzo
            com.google.android.gms.internal.ads.zzad r2 = r2.zza
            int r5 = r2.zzs
            r7 = -1
            if (r5 == r7) goto L_0x02db
            r5 = 0
            r0.zzw(r3, r2, r5)
            r0.zzo = r10
            goto L_0x02dc
        L_0x02db:
            r5 = 0
        L_0x02dc:
            com.google.android.gms.internal.ads.zzmq r2 = r0.zzp
            boolean r2 = r0.zzy(r2)
            if (r2 == 0) goto L_0x02ed
            com.google.android.gms.internal.ads.zzmq r2 = r0.zzp
            com.google.android.gms.internal.ads.zzad r2 = r2.zza
            r0.zzt(r3, r2, r5)
            r0.zzp = r10
        L_0x02ed:
            com.google.android.gms.internal.ads.zzmq r2 = r0.zzq
            boolean r2 = r0.zzy(r2)
            if (r2 == 0) goto L_0x02fe
            com.google.android.gms.internal.ads.zzmq r2 = r0.zzq
            com.google.android.gms.internal.ads.zzad r2 = r2.zza
            r0.zzu(r3, r2, r5)
            r0.zzq = r10
        L_0x02fe:
            android.content.Context r2 = r0.zza
            com.google.android.gms.internal.ads.zzdw r2 = com.google.android.gms.internal.ads.zzdw.zzb(r2)
            int r2 = r2.zza()
            switch(r2) {
                case 0: goto L_0x031f;
                case 1: goto L_0x031c;
                case 2: goto L_0x031a;
                case 3: goto L_0x0318;
                case 4: goto L_0x0316;
                case 5: goto L_0x0314;
                case 6: goto L_0x030b;
                case 7: goto L_0x0312;
                case 8: goto L_0x030b;
                case 9: goto L_0x030f;
                case 10: goto L_0x030d;
                default: goto L_0x030b;
            }
        L_0x030b:
            r13 = 1
            goto L_0x0320
        L_0x030d:
            r13 = 7
            goto L_0x0320
        L_0x030f:
            r13 = 8
            goto L_0x0320
        L_0x0312:
            r13 = 3
            goto L_0x0320
        L_0x0314:
            r13 = 6
            goto L_0x0320
        L_0x0316:
            r13 = 5
            goto L_0x0320
        L_0x0318:
            r13 = 4
            goto L_0x0320
        L_0x031a:
            r13 = 2
            goto L_0x0320
        L_0x031c:
            r13 = 9
            goto L_0x0320
        L_0x031f:
            r13 = 0
        L_0x0320:
            int r2 = r0.zzm
            if (r13 == r2) goto L_0x0340
            r0.zzm = r13
            android.media.metrics.PlaybackSession r2 = r0.zzc
            android.media.metrics.NetworkEvent$Builder r5 = new android.media.metrics.NetworkEvent$Builder
            r5.<init>()
            android.media.metrics.NetworkEvent$Builder r5 = r5.setNetworkType(r13)
            long r7 = r0.zzd
            long r7 = r3 - r7
            android.media.metrics.NetworkEvent$Builder r5 = r5.setTimeSinceCreatedMillis(r7)
            android.media.metrics.NetworkEvent r5 = r5.build()
            r2.reportNetworkEvent(r5)
        L_0x0340:
            int r2 = r21.zzh()
            if (r2 == r6) goto L_0x034a
            r2 = 0
            r0.zzu = r2
            goto L_0x034b
        L_0x034a:
            r2 = 0
        L_0x034b:
            r5 = r21
            com.google.android.gms.internal.ads.zzjz r5 = (com.google.android.gms.internal.ads.zzjz) r5
            com.google.android.gms.internal.ads.zzgu r5 = r5.zzw()
            r7 = 10
            if (r5 != 0) goto L_0x035a
            r0.zzv = r2
            goto L_0x0362
        L_0x035a:
            boolean r2 = r1.zzd(r7)
            if (r2 == 0) goto L_0x0362
            r0.zzv = r11
        L_0x0362:
            int r2 = r21.zzh()
            boolean r5 = r0.zzu
            if (r5 == 0) goto L_0x036c
            r5 = 5
            goto L_0x03b6
        L_0x036c:
            boolean r5 = r0.zzv
            if (r5 == 0) goto L_0x0373
            r5 = 13
            goto L_0x03b6
        L_0x0373:
            r5 = 4
            if (r2 != r5) goto L_0x0379
            r5 = 11
            goto L_0x03b6
        L_0x0379:
            if (r2 != r6) goto L_0x0397
            int r2 = r0.zzl
            if (r2 == 0) goto L_0x0395
            if (r2 != r6) goto L_0x0382
            goto L_0x0395
        L_0x0382:
            boolean r2 = r21.zzq()
            if (r2 != 0) goto L_0x038a
            r5 = 7
            goto L_0x03b6
        L_0x038a:
            int r2 = r21.zzi()
            if (r2 == 0) goto L_0x0393
            r5 = 10
            goto L_0x03b6
        L_0x0393:
            r5 = 6
            goto L_0x03b6
        L_0x0395:
            r5 = 2
            goto L_0x03b6
        L_0x0397:
            if (r2 != r9) goto L_0x03ab
            boolean r2 = r21.zzq()
            if (r2 != 0) goto L_0x03a0
            goto L_0x03b6
        L_0x03a0:
            int r2 = r21.zzi()
            if (r2 == 0) goto L_0x03a9
            r5 = 9
            goto L_0x03b6
        L_0x03a9:
            r5 = 3
            goto L_0x03b6
        L_0x03ab:
            if (r2 != r11) goto L_0x03b4
            int r2 = r0.zzl
            if (r2 == 0) goto L_0x03b4
            r5 = 12
            goto L_0x03b6
        L_0x03b4:
            int r5 = r0.zzl
        L_0x03b6:
            int r2 = r0.zzl
            if (r2 == r5) goto L_0x03d9
            r0.zzl = r5
            r0.zzz = r11
            android.media.metrics.PlaybackSession r2 = r0.zzc
            android.media.metrics.PlaybackStateEvent$Builder r5 = new android.media.metrics.PlaybackStateEvent$Builder
            r5.<init>()
            int r6 = r0.zzl
            android.media.metrics.PlaybackStateEvent$Builder r5 = r5.setState(r6)
            long r6 = r0.zzd
            long r3 = r3 - r6
            android.media.metrics.PlaybackStateEvent$Builder r3 = r5.setTimeSinceCreatedMillis(r3)
            android.media.metrics.PlaybackStateEvent r3 = r3.build()
            r2.reportPlaybackStateEvent(r3)
        L_0x03d9:
            r2 = 1028(0x404, float:1.44E-42)
            boolean r3 = r1.zzd(r2)
            if (r3 == 0) goto L_0x03ea
            com.google.android.gms.internal.ads.zzmt r3 = r0.zzb
            com.google.android.gms.internal.ads.zzkj r1 = r1.zzc(r2)
            r3.zzf(r1)
        L_0x03ea:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzmr.zzi(com.google.android.gms.internal.ads.zzcb, com.google.android.gms.internal.ads.zzkk):void");
    }

    public final void zzj(zzkj zzkj, zzrs zzrs, zzrx zzrx, IOException iOException, boolean z) {
    }

    public final /* synthetic */ void zzk(zzkj zzkj, int i) {
    }

    public final void zzl(zzkj zzkj, zzbr zzbr) {
        this.zzn = zzbr;
    }

    public final void zzm(zzkj zzkj, zzca zzca, zzca zzca2, int i) {
        if (i == 1) {
            this.zzu = true;
            i = 1;
        }
        this.zzk = i;
    }

    public final /* synthetic */ void zzn(zzkj zzkj, Object obj, long j) {
    }

    public final void zzo(zzkj zzkj, zzgm zzgm) {
        this.zzw += zzgm.zzg;
        this.zzx += zzgm.zze;
    }

    public final /* synthetic */ void zzp(zzkj zzkj, zzad zzad, zzgn zzgn) {
    }

    public final void zzq(zzkj zzkj, zzcv zzcv) {
        zzmq zzmq = this.zzo;
        if (zzmq != null) {
            zzad zzad = zzmq.zza;
            if (zzad.zzs == -1) {
                zzab zzb2 = zzad.zzb();
                zzb2.zzX(zzcv.zzc);
                zzb2.zzF(zzcv.zzd);
                this.zzo = new zzmq(zzb2.zzY(), 0, zzmq.zzc);
            }
        }
    }
}
