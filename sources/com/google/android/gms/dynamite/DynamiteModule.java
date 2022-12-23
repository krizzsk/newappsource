package com.google.android.gms.dynamite;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.DynamiteApi;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

@KeepForSdk
public final class DynamiteModule {
    @KeepForSdk
    public static final int LOCAL = -1;
    @KeepForSdk
    public static final int NONE = 0;
    @KeepForSdk
    public static final int NO_SELECTION = 0;
    @KeepForSdk
    public static final VersionPolicy PREFER_HIGHEST_OR_LOCAL_VERSION = new zzi();
    @KeepForSdk
    public static final VersionPolicy PREFER_HIGHEST_OR_LOCAL_VERSION_NO_FORCE_STAGING = new zzj();
    @KeepForSdk
    public static final VersionPolicy PREFER_HIGHEST_OR_REMOTE_VERSION = new zzk();
    @KeepForSdk
    public static final VersionPolicy PREFER_LOCAL = new zzg();
    @KeepForSdk
    public static final VersionPolicy PREFER_REMOTE = new zzf();
    @KeepForSdk
    public static final VersionPolicy PREFER_REMOTE_VERSION_NO_FORCE_STAGING = new zzh();
    @KeepForSdk
    public static final int REMOTE = 1;
    public static final VersionPolicy zza = new zzl();
    private static Boolean zzb = null;
    private static String zzc = null;
    private static boolean zzd = false;
    private static int zze = -1;
    private static Boolean zzf;
    private static final ThreadLocal zzg = new ThreadLocal();
    private static final ThreadLocal zzh = new zzd();
    private static final VersionPolicy.IVersions zzi = new zze();
    private static zzq zzk;
    private static zzr zzl;
    private final Context zzj;

    @DynamiteApi
    public static class DynamiteLoaderClassLoader {
        public static ClassLoader sClassLoader;
    }

    @KeepForSdk
    public static class LoadingException extends Exception {
        public /* synthetic */ LoadingException(String str, zzp zzp) {
            super(str);
        }

        public /* synthetic */ LoadingException(String str, Throwable th, zzp zzp) {
            super(str, th);
        }
    }

    public interface VersionPolicy {

        @KeepForSdk
        public interface IVersions {
            int zza(Context context, String str);

            int zzb(Context context, String str, boolean z) throws LoadingException;
        }

        @KeepForSdk
        public static class SelectionResult {
            @KeepForSdk
            public int localVersion = 0;
            @KeepForSdk
            public int remoteVersion = 0;
            @KeepForSdk
            public int selection = 0;
        }

        @KeepForSdk
        SelectionResult selectModule(Context context, String str, IVersions iVersions) throws LoadingException;
    }

    private DynamiteModule(Context context) {
        Preconditions.checkNotNull(context);
        this.zzj = context;
    }

    @KeepForSdk
    public static int getLocalVersion(Context context, String str) {
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            Class<?> loadClass = classLoader.loadClass("com.google.android.gms.dynamite.descriptors." + str + ".ModuleDescriptor");
            Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (Objects.equal(declaredField.get((Object) null), str)) {
                return declaredField2.getInt((Object) null);
            }
            String.valueOf(declaredField.get((Object) null));
            return 0;
        } catch (ClassNotFoundException unused) {
            return 0;
        } catch (Exception e) {
            "Failed to load module descriptor class: ".concat(String.valueOf(e.getMessage()));
            return 0;
        }
    }

    @KeepForSdk
    public static int getRemoteVersion(Context context, String str) {
        return zza(context, str, false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:158:0x0245  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x024b  */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x0258  */
    @com.google.android.gms.common.annotation.KeepForSdk
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.dynamite.DynamiteModule load(android.content.Context r20, com.google.android.gms.dynamite.DynamiteModule.VersionPolicy r21, java.lang.String r22) throws com.google.android.gms.dynamite.DynamiteModule.LoadingException {
        /*
            r1 = r20
            r2 = r21
            r3 = r22
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r4 = com.google.android.gms.dynamite.DynamiteModule.class
            java.lang.ThreadLocal r0 = zzg
            java.lang.Object r5 = r0.get()
            com.google.android.gms.dynamite.zzn r5 = (com.google.android.gms.dynamite.zzn) r5
            com.google.android.gms.dynamite.zzn r6 = new com.google.android.gms.dynamite.zzn
            r7 = 0
            r6.<init>(r7)
            r0.set(r6)
            java.lang.ThreadLocal r8 = zzh
            java.lang.Object r9 = r8.get()
            java.lang.Long r9 = (java.lang.Long) r9
            long r9 = r9.longValue()
            r11 = 0
            long r13 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x023f }
            java.lang.Long r13 = java.lang.Long.valueOf(r13)     // Catch:{ all -> 0x023f }
            r8.set(r13)     // Catch:{ all -> 0x023f }
            com.google.android.gms.dynamite.DynamiteModule$VersionPolicy$IVersions r13 = zzi     // Catch:{ all -> 0x023f }
            com.google.android.gms.dynamite.DynamiteModule$VersionPolicy$SelectionResult r13 = r2.selectModule(r1, r3, r13)     // Catch:{ all -> 0x023f }
            int r14 = r13.localVersion     // Catch:{ all -> 0x023f }
            int r14 = r13.selection     // Catch:{ all -> 0x023f }
            if (r14 == 0) goto L_0x020a
            r15 = -1
            if (r14 != r15) goto L_0x0046
            int r14 = r13.localVersion     // Catch:{ all -> 0x023f }
            if (r14 == 0) goto L_0x020a
            r14 = -1
        L_0x0046:
            r7 = 1
            if (r14 != r7) goto L_0x004d
            int r7 = r13.remoteVersion     // Catch:{ all -> 0x023f }
            if (r7 == 0) goto L_0x020a
        L_0x004d:
            if (r14 != r15) goto L_0x006d
            com.google.android.gms.dynamite.DynamiteModule r1 = zzc(r1, r3)     // Catch:{ all -> 0x023f }
            int r2 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r2 != 0) goto L_0x005b
            r8.remove()
            goto L_0x0062
        L_0x005b:
            java.lang.Long r2 = java.lang.Long.valueOf(r9)
            r8.set(r2)
        L_0x0062:
            android.database.Cursor r2 = r6.zza
            if (r2 == 0) goto L_0x0069
            r2.close()
        L_0x0069:
            r0.set(r5)
            return r1
        L_0x006d:
            r7 = 1
            if (r14 != r7) goto L_0x01f2
            int r7 = r13.remoteVersion     // Catch:{ LoadingException -> 0x01aa }
            monitor-enter(r4)     // Catch:{ RemoteException -> 0x01a0, LoadingException -> 0x019e, all -> 0x0191 }
            boolean r18 = zzf(r20)     // Catch:{ all -> 0x018e }
            if (r18 == 0) goto L_0x0185
            java.lang.Boolean r18 = zzb     // Catch:{ all -> 0x018e }
            monitor-exit(r4)     // Catch:{ all -> 0x018e }
            if (r18 == 0) goto L_0x017c
            boolean r18 = r18.booleanValue()     // Catch:{ RemoteException -> 0x01a0, LoadingException -> 0x019e, all -> 0x0191 }
            r15 = 2
            if (r18 == 0) goto L_0x0101
            monitor-enter(r4)     // Catch:{ RemoteException -> 0x01a0, LoadingException -> 0x019e, all -> 0x0191 }
            com.google.android.gms.dynamite.zzr r14 = zzl     // Catch:{ all -> 0x00fe }
            monitor-exit(r4)     // Catch:{ all -> 0x00fe }
            if (r14 == 0) goto L_0x00f5
            java.lang.Object r19 = r0.get()     // Catch:{ RemoteException -> 0x01a0, LoadingException -> 0x019e, all -> 0x0191 }
            r11 = r19
            com.google.android.gms.dynamite.zzn r11 = (com.google.android.gms.dynamite.zzn) r11     // Catch:{ RemoteException -> 0x01a0, LoadingException -> 0x019e, all -> 0x0191 }
            if (r11 == 0) goto L_0x00ec
            android.database.Cursor r12 = r11.zza     // Catch:{ RemoteException -> 0x01a0, LoadingException -> 0x019e, all -> 0x0191 }
            if (r12 == 0) goto L_0x00ec
            android.content.Context r12 = r20.getApplicationContext()     // Catch:{ RemoteException -> 0x01a0, LoadingException -> 0x019e, all -> 0x0191 }
            android.database.Cursor r11 = r11.zza     // Catch:{ RemoteException -> 0x01a0, LoadingException -> 0x019e, all -> 0x0191 }
            r16 = 0
            com.google.android.gms.dynamic.ObjectWrapper.wrap(r16)     // Catch:{ RemoteException -> 0x01a0, LoadingException -> 0x019e, all -> 0x0191 }
            monitor-enter(r4)     // Catch:{ RemoteException -> 0x01a0, LoadingException -> 0x019e, all -> 0x0191 }
            int r2 = zze     // Catch:{ all -> 0x00e9 }
            if (r2 < r15) goto L_0x00ac
            r17 = 1
            goto L_0x00ae
        L_0x00ac:
            r17 = 0
        L_0x00ae:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r17)     // Catch:{ all -> 0x00e9 }
            monitor-exit(r4)     // Catch:{ all -> 0x00e9 }
            boolean r2 = r2.booleanValue()     // Catch:{ RemoteException -> 0x01a0, LoadingException -> 0x019e, all -> 0x0191 }
            if (r2 == 0) goto L_0x00c6
            com.google.android.gms.dynamic.IObjectWrapper r2 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r12)     // Catch:{ RemoteException -> 0x01a0, LoadingException -> 0x019e, all -> 0x0191 }
            com.google.android.gms.dynamic.IObjectWrapper r4 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r11)     // Catch:{ RemoteException -> 0x01a0, LoadingException -> 0x019e, all -> 0x0191 }
            com.google.android.gms.dynamic.IObjectWrapper r2 = r14.zzf(r2, r3, r7, r4)     // Catch:{ RemoteException -> 0x01a0, LoadingException -> 0x019e, all -> 0x0191 }
            goto L_0x00d2
        L_0x00c6:
            com.google.android.gms.dynamic.IObjectWrapper r2 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r12)     // Catch:{ RemoteException -> 0x01a0, LoadingException -> 0x019e, all -> 0x0191 }
            com.google.android.gms.dynamic.IObjectWrapper r4 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r11)     // Catch:{ RemoteException -> 0x01a0, LoadingException -> 0x019e, all -> 0x0191 }
            com.google.android.gms.dynamic.IObjectWrapper r2 = r14.zze(r2, r3, r7, r4)     // Catch:{ RemoteException -> 0x01a0, LoadingException -> 0x019e, all -> 0x0191 }
        L_0x00d2:
            java.lang.Object r2 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r2)     // Catch:{ RemoteException -> 0x01a0, LoadingException -> 0x019e, all -> 0x0191 }
            android.content.Context r2 = (android.content.Context) r2     // Catch:{ RemoteException -> 0x01a0, LoadingException -> 0x019e, all -> 0x0191 }
            if (r2 == 0) goto L_0x00e0
            com.google.android.gms.dynamite.DynamiteModule r4 = new com.google.android.gms.dynamite.DynamiteModule     // Catch:{ RemoteException -> 0x01a0, LoadingException -> 0x019e, all -> 0x0191 }
            r4.<init>(r2)     // Catch:{ RemoteException -> 0x01a0, LoadingException -> 0x019e, all -> 0x0191 }
            goto L_0x014e
        L_0x00e0:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r0 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch:{ RemoteException -> 0x01a0, LoadingException -> 0x019e, all -> 0x0191 }
            java.lang.String r2 = "Failed to get module context"
            r4 = 0
            r0.<init>(r2, r4)     // Catch:{ RemoteException -> 0x01a0, LoadingException -> 0x019e, all -> 0x0191 }
            throw r0     // Catch:{ RemoteException -> 0x01a0, LoadingException -> 0x019e, all -> 0x0191 }
        L_0x00e9:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x00e9 }
            throw r0     // Catch:{ RemoteException -> 0x01a0, LoadingException -> 0x019e, all -> 0x0191 }
        L_0x00ec:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r0 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch:{ RemoteException -> 0x01a0, LoadingException -> 0x019e, all -> 0x0191 }
            java.lang.String r2 = "No result cursor"
            r4 = 0
            r0.<init>(r2, r4)     // Catch:{ RemoteException -> 0x01a0, LoadingException -> 0x019e, all -> 0x0191 }
            throw r0     // Catch:{ RemoteException -> 0x01a0, LoadingException -> 0x019e, all -> 0x0191 }
        L_0x00f5:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r0 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch:{ RemoteException -> 0x01a0, LoadingException -> 0x019e, all -> 0x0191 }
            java.lang.String r2 = "DynamiteLoaderV2 was not cached."
            r4 = 0
            r0.<init>(r2, r4)     // Catch:{ RemoteException -> 0x01a0, LoadingException -> 0x019e, all -> 0x0191 }
            throw r0     // Catch:{ RemoteException -> 0x01a0, LoadingException -> 0x019e, all -> 0x0191 }
        L_0x00fe:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x00fe }
            throw r0     // Catch:{ RemoteException -> 0x01a0, LoadingException -> 0x019e, all -> 0x0191 }
        L_0x0101:
            com.google.android.gms.dynamite.zzq r2 = zzg(r20)     // Catch:{ RemoteException -> 0x01a0, LoadingException -> 0x019e, all -> 0x0191 }
            if (r2 == 0) goto L_0x0173
            int r4 = r2.zze()     // Catch:{ RemoteException -> 0x01a0, LoadingException -> 0x019e, all -> 0x0191 }
            r11 = 3
            if (r4 < r11) goto L_0x012e
            java.lang.Object r4 = r0.get()     // Catch:{ RemoteException -> 0x01a0, LoadingException -> 0x019e, all -> 0x0191 }
            com.google.android.gms.dynamite.zzn r4 = (com.google.android.gms.dynamite.zzn) r4     // Catch:{ RemoteException -> 0x01a0, LoadingException -> 0x019e, all -> 0x0191 }
            if (r4 == 0) goto L_0x0125
            com.google.android.gms.dynamic.IObjectWrapper r11 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r20)     // Catch:{ RemoteException -> 0x01a0, LoadingException -> 0x019e, all -> 0x0191 }
            android.database.Cursor r4 = r4.zza     // Catch:{ RemoteException -> 0x01a0, LoadingException -> 0x019e, all -> 0x0191 }
            com.google.android.gms.dynamic.IObjectWrapper r4 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r4)     // Catch:{ RemoteException -> 0x01a0, LoadingException -> 0x019e, all -> 0x0191 }
            com.google.android.gms.dynamic.IObjectWrapper r2 = r2.zzi(r11, r3, r7, r4)     // Catch:{ RemoteException -> 0x01a0, LoadingException -> 0x019e, all -> 0x0191 }
            goto L_0x0141
        L_0x0125:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r0 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch:{ RemoteException -> 0x01a0, LoadingException -> 0x019e, all -> 0x0191 }
            java.lang.String r2 = "No cached result cursor holder"
            r4 = 0
            r0.<init>(r2, r4)     // Catch:{ RemoteException -> 0x01a0, LoadingException -> 0x019e, all -> 0x0191 }
            throw r0     // Catch:{ RemoteException -> 0x01a0, LoadingException -> 0x019e, all -> 0x0191 }
        L_0x012e:
            if (r4 != r15) goto L_0x0139
            com.google.android.gms.dynamic.IObjectWrapper r4 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r20)     // Catch:{ RemoteException -> 0x01a0, LoadingException -> 0x019e, all -> 0x0191 }
            com.google.android.gms.dynamic.IObjectWrapper r2 = r2.zzj(r4, r3, r7)     // Catch:{ RemoteException -> 0x01a0, LoadingException -> 0x019e, all -> 0x0191 }
            goto L_0x0141
        L_0x0139:
            com.google.android.gms.dynamic.IObjectWrapper r4 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r20)     // Catch:{ RemoteException -> 0x01a0, LoadingException -> 0x019e, all -> 0x0191 }
            com.google.android.gms.dynamic.IObjectWrapper r2 = r2.zzh(r4, r3, r7)     // Catch:{ RemoteException -> 0x01a0, LoadingException -> 0x019e, all -> 0x0191 }
        L_0x0141:
            java.lang.Object r2 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r2)     // Catch:{ RemoteException -> 0x01a0, LoadingException -> 0x019e, all -> 0x0191 }
            if (r2 == 0) goto L_0x016a
            com.google.android.gms.dynamite.DynamiteModule r4 = new com.google.android.gms.dynamite.DynamiteModule     // Catch:{ RemoteException -> 0x01a0, LoadingException -> 0x019e, all -> 0x0191 }
            android.content.Context r2 = (android.content.Context) r2     // Catch:{ RemoteException -> 0x01a0, LoadingException -> 0x019e, all -> 0x0191 }
            r4.<init>(r2)     // Catch:{ RemoteException -> 0x01a0, LoadingException -> 0x019e, all -> 0x0191 }
        L_0x014e:
            r1 = 0
            int r3 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r3 != 0) goto L_0x0158
            r8.remove()
            goto L_0x015f
        L_0x0158:
            java.lang.Long r1 = java.lang.Long.valueOf(r9)
            r8.set(r1)
        L_0x015f:
            android.database.Cursor r1 = r6.zza
            if (r1 == 0) goto L_0x0166
            r1.close()
        L_0x0166:
            r0.set(r5)
            return r4
        L_0x016a:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r0 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch:{ RemoteException -> 0x01a0, LoadingException -> 0x019e, all -> 0x0191 }
            java.lang.String r2 = "Failed to load remote module."
            r4 = 0
            r0.<init>(r2, r4)     // Catch:{ RemoteException -> 0x01a0, LoadingException -> 0x019e, all -> 0x0191 }
            throw r0     // Catch:{ RemoteException -> 0x01a0, LoadingException -> 0x019e, all -> 0x0191 }
        L_0x0173:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r0 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch:{ RemoteException -> 0x01a0, LoadingException -> 0x019e, all -> 0x0191 }
            java.lang.String r2 = "Failed to create IDynamiteLoader."
            r4 = 0
            r0.<init>(r2, r4)     // Catch:{ RemoteException -> 0x01a0, LoadingException -> 0x019e, all -> 0x0191 }
            throw r0     // Catch:{ RemoteException -> 0x01a0, LoadingException -> 0x019e, all -> 0x0191 }
        L_0x017c:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r0 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch:{ RemoteException -> 0x01a0, LoadingException -> 0x019e, all -> 0x0191 }
            java.lang.String r2 = "Failed to determine which loading route to use."
            r4 = 0
            r0.<init>(r2, r4)     // Catch:{ RemoteException -> 0x01a0, LoadingException -> 0x019e, all -> 0x0191 }
            throw r0     // Catch:{ RemoteException -> 0x01a0, LoadingException -> 0x019e, all -> 0x0191 }
        L_0x0185:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r0 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch:{ all -> 0x018e }
            java.lang.String r2 = "Remote loading disabled"
            r7 = 0
            r0.<init>(r2, r7)     // Catch:{ all -> 0x018e }
            throw r0     // Catch:{ all -> 0x018e }
        L_0x018e:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x018e }
            throw r0     // Catch:{ RemoteException -> 0x01a0, LoadingException -> 0x019e, all -> 0x0191 }
        L_0x0191:
            r0 = move-exception
            com.google.android.gms.common.util.CrashUtils.addDynamiteErrorToDropBox(r1, r0)     // Catch:{ all -> 0x023b }
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r2 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch:{ all -> 0x023b }
            java.lang.String r4 = "Failed to load remote module."
            r7 = 0
            r2.<init>(r4, r0, r7)     // Catch:{ all -> 0x023b }
            throw r2     // Catch:{ all -> 0x023b }
        L_0x019e:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x023b }
        L_0x01a0:
            r0 = move-exception
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r2 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch:{ all -> 0x023b }
            java.lang.String r4 = "Failed to load remote module."
            r7 = 0
            r2.<init>(r4, r0, r7)     // Catch:{ all -> 0x023b }
            throw r2     // Catch:{ all -> 0x023b }
        L_0x01aa:
            r0 = move-exception
            r0.getMessage()     // Catch:{  }
            int r2 = r13.localVersion     // Catch:{  }
            if (r2 == 0) goto L_0x01e9
            com.google.android.gms.dynamite.zzo r4 = new com.google.android.gms.dynamite.zzo     // Catch:{  }
            r7 = 0
            r4.<init>(r2, r7)     // Catch:{  }
            r2 = r21
            com.google.android.gms.dynamite.DynamiteModule$VersionPolicy$SelectionResult r2 = r2.selectModule(r1, r3, r4)     // Catch:{  }
            int r2 = r2.selection     // Catch:{  }
            r4 = -1
            if (r2 != r4) goto L_0x01e9
            com.google.android.gms.dynamite.DynamiteModule r0 = zzc(r1, r3)     // Catch:{  }
            r1 = 0
            int r3 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r3 != 0) goto L_0x01d3
            java.lang.ThreadLocal r1 = zzh
            r1.remove()
            goto L_0x01dc
        L_0x01d3:
            java.lang.ThreadLocal r1 = zzh
            java.lang.Long r2 = java.lang.Long.valueOf(r9)
            r1.set(r2)
        L_0x01dc:
            android.database.Cursor r1 = r6.zza
            if (r1 == 0) goto L_0x01e3
            r1.close()
        L_0x01e3:
            java.lang.ThreadLocal r1 = zzg
            r1.set(r5)
            return r0
        L_0x01e9:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r1 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch:{  }
            java.lang.String r2 = "Remote load failed. No local fallback found."
            r3 = 0
            r1.<init>(r2, r0, r3)     // Catch:{  }
            throw r1     // Catch:{  }
        L_0x01f2:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r0 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch:{  }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{  }
            r1.<init>()     // Catch:{  }
            java.lang.String r2 = "VersionPolicy returned invalid code:"
            r1.append(r2)     // Catch:{  }
            r1.append(r14)     // Catch:{  }
            java.lang.String r1 = r1.toString()     // Catch:{  }
            r2 = 0
            r0.<init>(r1, r2)     // Catch:{  }
            throw r0     // Catch:{  }
        L_0x020a:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r0 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch:{  }
            int r1 = r13.localVersion     // Catch:{  }
            int r2 = r13.remoteVersion     // Catch:{  }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{  }
            r4.<init>()     // Catch:{  }
            java.lang.String r7 = "No acceptable module "
            r4.append(r7)     // Catch:{  }
            r4.append(r3)     // Catch:{  }
            java.lang.String r3 = " found. Local version is "
            r4.append(r3)     // Catch:{  }
            r4.append(r1)     // Catch:{  }
            java.lang.String r1 = " and remote version is "
            r4.append(r1)     // Catch:{  }
            r4.append(r2)     // Catch:{  }
            java.lang.String r1 = "."
            r4.append(r1)     // Catch:{  }
            java.lang.String r1 = r4.toString()     // Catch:{  }
            r2 = 0
            r0.<init>(r1, r2)     // Catch:{  }
            throw r0     // Catch:{  }
        L_0x023b:
            r0 = move-exception
            r1 = 0
            goto L_0x0241
        L_0x023f:
            r0 = move-exception
            r1 = r11
        L_0x0241:
            int r3 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r3 != 0) goto L_0x024b
            java.lang.ThreadLocal r1 = zzh
            r1.remove()
            goto L_0x0254
        L_0x024b:
            java.lang.ThreadLocal r1 = zzh
            java.lang.Long r2 = java.lang.Long.valueOf(r9)
            r1.set(r2)
        L_0x0254:
            android.database.Cursor r1 = r6.zza
            if (r1 == 0) goto L_0x025b
            r1.close()
        L_0x025b:
            java.lang.ThreadLocal r1 = zzg
            r1.set(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.load(android.content.Context, com.google.android.gms.dynamite.DynamiteModule$VersionPolicy, java.lang.String):com.google.android.gms.dynamite.DynamiteModule");
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:31:0x0056=Splitter:B:31:0x0056, B:50:0x009a=Splitter:B:50:0x009a, B:17:0x003b=Splitter:B:17:0x003b} */
    public static int zza(android.content.Context r10, java.lang.String r11, boolean r12) {
        /*
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r0 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r0)     // Catch:{ all -> 0x0168 }
            java.lang.Boolean r1 = zzb     // Catch:{ all -> 0x0165 }
            r2 = 0
            r3 = 0
            if (r1 != 0) goto L_0x00c1
            android.content.Context r1 = r10.getApplicationContext()     // Catch:{ ClassNotFoundException -> 0x00b9, IllegalAccessException -> 0x00b7, NoSuchFieldException -> 0x00b5 }
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x00b9, IllegalAccessException -> 0x00b7, NoSuchFieldException -> 0x00b5 }
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule$DynamiteLoaderClassLoader> r4 = com.google.android.gms.dynamite.DynamiteModule.DynamiteLoaderClassLoader.class
            java.lang.String r4 = r4.getName()     // Catch:{ ClassNotFoundException -> 0x00b9, IllegalAccessException -> 0x00b7, NoSuchFieldException -> 0x00b5 }
            java.lang.Class r1 = r1.loadClass(r4)     // Catch:{ ClassNotFoundException -> 0x00b9, IllegalAccessException -> 0x00b7, NoSuchFieldException -> 0x00b5 }
            java.lang.String r4 = "sClassLoader"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r4)     // Catch:{ ClassNotFoundException -> 0x00b9, IllegalAccessException -> 0x00b7, NoSuchFieldException -> 0x00b5 }
            java.lang.Class r4 = r1.getDeclaringClass()     // Catch:{ ClassNotFoundException -> 0x00b9, IllegalAccessException -> 0x00b7, NoSuchFieldException -> 0x00b5 }
            monitor-enter(r4)     // Catch:{ ClassNotFoundException -> 0x00b9, IllegalAccessException -> 0x00b7, NoSuchFieldException -> 0x00b5 }
            java.lang.Object r5 = r1.get(r2)     // Catch:{ all -> 0x00b2 }
            java.lang.ClassLoader r5 = (java.lang.ClassLoader) r5     // Catch:{ all -> 0x00b2 }
            java.lang.ClassLoader r6 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x00b2 }
            if (r5 != r6) goto L_0x0036
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x00b2 }
            goto L_0x00b0
        L_0x0036:
            if (r5 == 0) goto L_0x003f
            zzd(r5)     // Catch:{ LoadingException -> 0x003b }
        L_0x003b:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x00b2 }
            goto L_0x00b0
        L_0x003f:
            boolean r5 = zzf(r10)     // Catch:{ all -> 0x00b2 }
            if (r5 != 0) goto L_0x0048
            monitor-exit(r4)     // Catch:{ all -> 0x00b2 }
            monitor-exit(r0)     // Catch:{ all -> 0x0165 }
            return r3
        L_0x0048:
            boolean r5 = zzd     // Catch:{ all -> 0x00b2 }
            if (r5 != 0) goto L_0x00a7
            java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x00b2 }
            boolean r6 = r5.equals(r2)     // Catch:{ all -> 0x00b2 }
            if (r6 == 0) goto L_0x0055
            goto L_0x00a7
        L_0x0055:
            r6 = 1
            int r6 = zzb(r10, r11, r12, r6)     // Catch:{ LoadingException -> 0x009d }
            java.lang.String r7 = zzc     // Catch:{ LoadingException -> 0x009d }
            if (r7 == 0) goto L_0x009a
            boolean r7 = r7.isEmpty()     // Catch:{ LoadingException -> 0x009d }
            if (r7 == 0) goto L_0x0065
            goto L_0x009a
        L_0x0065:
            java.lang.ClassLoader r7 = com.google.android.gms.dynamite.zzb.zza()     // Catch:{ LoadingException -> 0x009d }
            if (r7 == 0) goto L_0x006c
            goto L_0x008f
        L_0x006c:
            int r7 = android.os.Build.VERSION.SDK_INT     // Catch:{ LoadingException -> 0x009d }
            r8 = 29
            if (r7 < r8) goto L_0x0081
            dalvik.system.DelegateLastClassLoader r7 = new dalvik.system.DelegateLastClassLoader     // Catch:{ LoadingException -> 0x009d }
            java.lang.String r8 = zzc     // Catch:{ LoadingException -> 0x009d }
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r8)     // Catch:{ LoadingException -> 0x009d }
            java.lang.ClassLoader r9 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ LoadingException -> 0x009d }
            r7.<init>(r8, r9)     // Catch:{ LoadingException -> 0x009d }
            goto L_0x008f
        L_0x0081:
            com.google.android.gms.dynamite.zzc r7 = new com.google.android.gms.dynamite.zzc     // Catch:{ LoadingException -> 0x009d }
            java.lang.String r8 = zzc     // Catch:{ LoadingException -> 0x009d }
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r8)     // Catch:{ LoadingException -> 0x009d }
            java.lang.ClassLoader r9 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ LoadingException -> 0x009d }
            r7.<init>(r8, r9)     // Catch:{ LoadingException -> 0x009d }
        L_0x008f:
            zzd(r7)     // Catch:{ LoadingException -> 0x009d }
            r1.set(r2, r7)     // Catch:{ LoadingException -> 0x009d }
            zzb = r5     // Catch:{ LoadingException -> 0x009d }
            monitor-exit(r4)     // Catch:{ all -> 0x00b2 }
            monitor-exit(r0)     // Catch:{ all -> 0x0165 }
            return r6
        L_0x009a:
            monitor-exit(r4)     // Catch:{ all -> 0x00b2 }
            monitor-exit(r0)     // Catch:{ all -> 0x0165 }
            return r6
        L_0x009d:
            java.lang.ClassLoader r5 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x00b2 }
            r1.set(r2, r5)     // Catch:{ all -> 0x00b2 }
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x00b2 }
            goto L_0x00b0
        L_0x00a7:
            java.lang.ClassLoader r5 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x00b2 }
            r1.set(r2, r5)     // Catch:{ all -> 0x00b2 }
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x00b2 }
        L_0x00b0:
            monitor-exit(r4)     // Catch:{ all -> 0x00b2 }
            goto L_0x00bf
        L_0x00b2:
            r1 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x00b2 }
            throw r1     // Catch:{ ClassNotFoundException -> 0x00b9, IllegalAccessException -> 0x00b7, NoSuchFieldException -> 0x00b5 }
        L_0x00b5:
            r1 = move-exception
            goto L_0x00ba
        L_0x00b7:
            r1 = move-exception
            goto L_0x00ba
        L_0x00b9:
            r1 = move-exception
        L_0x00ba:
            r1.toString()     // Catch:{ all -> 0x0165 }
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x0165 }
        L_0x00bf:
            zzb = r1     // Catch:{ all -> 0x0165 }
        L_0x00c1:
            monitor-exit(r0)     // Catch:{ all -> 0x0165 }
            boolean r0 = r1.booleanValue()     // Catch:{ all -> 0x0168 }
            if (r0 == 0) goto L_0x00d2
            int r10 = zzb(r10, r11, r12, r3)     // Catch:{ LoadingException -> 0x00cd }
            return r10
        L_0x00cd:
            r11 = move-exception
            r11.getMessage()     // Catch:{ all -> 0x0168 }
            return r3
        L_0x00d2:
            com.google.android.gms.dynamite.zzq r4 = zzg(r10)     // Catch:{ all -> 0x0168 }
            if (r4 != 0) goto L_0x00da
            goto L_0x015d
        L_0x00da:
            int r0 = r4.zze()     // Catch:{ RemoteException -> 0x0153, all -> 0x0150 }
            r1 = 3
            if (r0 < r1) goto L_0x013b
            java.lang.ThreadLocal r0 = zzg     // Catch:{ RemoteException -> 0x0153, all -> 0x0150 }
            java.lang.Object r0 = r0.get()     // Catch:{ RemoteException -> 0x0153, all -> 0x0150 }
            com.google.android.gms.dynamite.zzn r0 = (com.google.android.gms.dynamite.zzn) r0     // Catch:{ RemoteException -> 0x0153, all -> 0x0150 }
            if (r0 == 0) goto L_0x00f5
            android.database.Cursor r0 = r0.zza     // Catch:{ RemoteException -> 0x0153, all -> 0x0150 }
            if (r0 == 0) goto L_0x00f5
            int r3 = r0.getInt(r3)     // Catch:{ RemoteException -> 0x0153, all -> 0x0150 }
            goto L_0x015d
        L_0x00f5:
            com.google.android.gms.dynamic.IObjectWrapper r5 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r10)     // Catch:{ RemoteException -> 0x0153, all -> 0x0150 }
            java.lang.ThreadLocal r0 = zzh     // Catch:{ RemoteException -> 0x0153, all -> 0x0150 }
            java.lang.Object r0 = r0.get()     // Catch:{ RemoteException -> 0x0153, all -> 0x0150 }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ RemoteException -> 0x0153, all -> 0x0150 }
            long r8 = r0.longValue()     // Catch:{ RemoteException -> 0x0153, all -> 0x0150 }
            r6 = r11
            r7 = r12
            com.google.android.gms.dynamic.IObjectWrapper r11 = r4.zzk(r5, r6, r7, r8)     // Catch:{ RemoteException -> 0x0153, all -> 0x0150 }
            java.lang.Object r11 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r11)     // Catch:{ RemoteException -> 0x0153, all -> 0x0150 }
            android.database.Cursor r11 = (android.database.Cursor) r11     // Catch:{ RemoteException -> 0x0153, all -> 0x0150 }
            if (r11 == 0) goto L_0x0135
            boolean r12 = r11.moveToFirst()     // Catch:{ RemoteException -> 0x0132, all -> 0x012f }
            if (r12 != 0) goto L_0x011a
            goto L_0x0135
        L_0x011a:
            int r12 = r11.getInt(r3)     // Catch:{ RemoteException -> 0x0132, all -> 0x012f }
            if (r12 <= 0) goto L_0x0127
            boolean r0 = zze(r11)     // Catch:{ RemoteException -> 0x0132, all -> 0x012f }
            if (r0 == 0) goto L_0x0127
            goto L_0x0128
        L_0x0127:
            r2 = r11
        L_0x0128:
            if (r2 == 0) goto L_0x012d
            r2.close()     // Catch:{ all -> 0x0168 }
        L_0x012d:
            r3 = r12
            goto L_0x015d
        L_0x012f:
            r12 = move-exception
            r2 = r11
            goto L_0x015f
        L_0x0132:
            r12 = move-exception
            r2 = r11
            goto L_0x0155
        L_0x0135:
            if (r11 == 0) goto L_0x015d
            r11.close()     // Catch:{ all -> 0x0168 }
            goto L_0x015d
        L_0x013b:
            r1 = 2
            if (r0 != r1) goto L_0x0147
            com.google.android.gms.dynamic.IObjectWrapper r0 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r10)     // Catch:{ RemoteException -> 0x0153, all -> 0x0150 }
            int r3 = r4.zzg(r0, r11, r12)     // Catch:{ RemoteException -> 0x0153, all -> 0x0150 }
            goto L_0x015d
        L_0x0147:
            com.google.android.gms.dynamic.IObjectWrapper r0 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r10)     // Catch:{ RemoteException -> 0x0153, all -> 0x0150 }
            int r3 = r4.zzf(r0, r11, r12)     // Catch:{ RemoteException -> 0x0153, all -> 0x0150 }
            goto L_0x015d
        L_0x0150:
            r11 = move-exception
            r12 = r11
            goto L_0x015f
        L_0x0153:
            r11 = move-exception
            r12 = r11
        L_0x0155:
            r12.getMessage()     // Catch:{ all -> 0x015e }
            if (r2 == 0) goto L_0x015d
            r2.close()     // Catch:{ all -> 0x0168 }
        L_0x015d:
            return r3
        L_0x015e:
            r12 = move-exception
        L_0x015f:
            if (r2 == 0) goto L_0x0164
            r2.close()     // Catch:{ all -> 0x0168 }
        L_0x0164:
            throw r12     // Catch:{ all -> 0x0168 }
        L_0x0165:
            r11 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0165 }
            throw r11     // Catch:{ all -> 0x0168 }
        L_0x0168:
            r11 = move-exception
            com.google.android.gms.common.util.CrashUtils.addDynamiteErrorToDropBox(r10, r11)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.zza(android.content.Context, java.lang.String, boolean):int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:55:0x00b5 A[Catch:{ all -> 0x00be }] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00b6 A[Catch:{ all -> 0x00be }] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00c2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int zzb(android.content.Context r10, java.lang.String r11, boolean r12, boolean r13) throws com.google.android.gms.dynamite.DynamiteModule.LoadingException {
        /*
            r0 = 0
            java.lang.ThreadLocal r1 = zzh     // Catch:{ Exception -> 0x00ae, all -> 0x00ab }
            java.lang.Object r1 = r1.get()     // Catch:{ Exception -> 0x00ae, all -> 0x00ab }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ Exception -> 0x00ae, all -> 0x00ab }
            long r1 = r1.longValue()     // Catch:{ Exception -> 0x00ae, all -> 0x00ab }
            android.content.ContentResolver r3 = r10.getContentResolver()     // Catch:{ Exception -> 0x00ae, all -> 0x00ab }
            java.lang.String r10 = "api_force_staging"
            java.lang.String r4 = "api"
            r9 = 1
            if (r9 == r12) goto L_0x0019
            r10 = r4
        L_0x0019:
            android.net.Uri$Builder r12 = new android.net.Uri$Builder     // Catch:{ Exception -> 0x00ae, all -> 0x00ab }
            r12.<init>()     // Catch:{ Exception -> 0x00ae, all -> 0x00ab }
            java.lang.String r4 = "content"
            android.net.Uri$Builder r12 = r12.scheme(r4)     // Catch:{ Exception -> 0x00ae, all -> 0x00ab }
            java.lang.String r4 = "com.google.android.gms.chimera"
            android.net.Uri$Builder r12 = r12.authority(r4)     // Catch:{ Exception -> 0x00ae, all -> 0x00ab }
            android.net.Uri$Builder r10 = r12.path(r10)     // Catch:{ Exception -> 0x00ae, all -> 0x00ab }
            android.net.Uri$Builder r10 = r10.appendPath(r11)     // Catch:{ Exception -> 0x00ae, all -> 0x00ab }
            java.lang.String r11 = "requestStartTime"
            java.lang.String r12 = java.lang.String.valueOf(r1)     // Catch:{ Exception -> 0x00ae, all -> 0x00ab }
            android.net.Uri$Builder r10 = r10.appendQueryParameter(r11, r12)     // Catch:{ Exception -> 0x00ae, all -> 0x00ab }
            android.net.Uri r4 = r10.build()     // Catch:{ Exception -> 0x00ae, all -> 0x00ab }
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r10 = r3.query(r4, r5, r6, r7, r8)     // Catch:{ Exception -> 0x00ae, all -> 0x00ab }
            if (r10 == 0) goto L_0x00a3
            boolean r11 = r10.moveToFirst()     // Catch:{ Exception -> 0x009b }
            if (r11 == 0) goto L_0x00a3
            r11 = 0
            int r12 = r10.getInt(r11)     // Catch:{ Exception -> 0x009b }
            if (r12 <= 0) goto L_0x008e
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r1 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r1)     // Catch:{ Exception -> 0x009b }
            r2 = 2
            java.lang.String r2 = r10.getString(r2)     // Catch:{ all -> 0x008b }
            zzc = r2     // Catch:{ all -> 0x008b }
            java.lang.String r2 = "loaderVersion"
            int r2 = r10.getColumnIndex(r2)     // Catch:{ all -> 0x008b }
            if (r2 < 0) goto L_0x006f
            int r2 = r10.getInt(r2)     // Catch:{ all -> 0x008b }
            zze = r2     // Catch:{ all -> 0x008b }
        L_0x006f:
            java.lang.String r2 = "disableStandaloneDynamiteLoader2"
            int r2 = r10.getColumnIndex(r2)     // Catch:{ all -> 0x008b }
            if (r2 < 0) goto L_0x0082
            int r2 = r10.getInt(r2)     // Catch:{ all -> 0x008b }
            if (r2 == 0) goto L_0x007e
            goto L_0x007f
        L_0x007e:
            r9 = 0
        L_0x007f:
            zzd = r9     // Catch:{ all -> 0x008b }
            r11 = r9
        L_0x0082:
            monitor-exit(r1)     // Catch:{ all -> 0x008b }
            boolean r1 = zze(r10)     // Catch:{ Exception -> 0x009b }
            if (r1 == 0) goto L_0x008e
            r10 = r0
            goto L_0x008e
        L_0x008b:
            r11 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x008b }
            throw r11     // Catch:{ Exception -> 0x009b }
        L_0x008e:
            if (r13 == 0) goto L_0x009d
            if (r11 != 0) goto L_0x0093
            goto L_0x009d
        L_0x0093:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r11 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch:{ Exception -> 0x009b }
            java.lang.String r12 = "forcing fallback to container DynamiteLoader impl"
            r11.<init>(r12, r0)     // Catch:{ Exception -> 0x009b }
            throw r11     // Catch:{ Exception -> 0x009b }
        L_0x009b:
            r11 = move-exception
            goto L_0x00b1
        L_0x009d:
            if (r10 == 0) goto L_0x00a2
            r10.close()
        L_0x00a2:
            return r12
        L_0x00a3:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r11 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch:{ Exception -> 0x009b }
            java.lang.String r12 = "Failed to connect to dynamite module ContentResolver."
            r11.<init>(r12, r0)     // Catch:{ Exception -> 0x009b }
            throw r11     // Catch:{ Exception -> 0x009b }
        L_0x00ab:
            r10 = move-exception
            r11 = r10
            goto L_0x00c0
        L_0x00ae:
            r10 = move-exception
            r11 = r10
            r10 = r0
        L_0x00b1:
            boolean r12 = r11 instanceof com.google.android.gms.dynamite.DynamiteModule.LoadingException     // Catch:{ all -> 0x00be }
            if (r12 == 0) goto L_0x00b6
            throw r11     // Catch:{ all -> 0x00be }
        L_0x00b6:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r12 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch:{ all -> 0x00be }
            java.lang.String r13 = "V2 version check failed"
            r12.<init>(r13, r11, r0)     // Catch:{ all -> 0x00be }
            throw r12     // Catch:{ all -> 0x00be }
        L_0x00be:
            r11 = move-exception
            r0 = r10
        L_0x00c0:
            if (r0 == 0) goto L_0x00c5
            r0.close()
        L_0x00c5:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.zzb(android.content.Context, java.lang.String, boolean, boolean):int");
    }

    private static DynamiteModule zzc(Context context, String str) {
        "Selected local version of ".concat(String.valueOf(str));
        return new DynamiteModule(context.getApplicationContext());
    }

    private static void zzd(ClassLoader classLoader) throws LoadingException {
        zzr zzr;
        try {
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(new Class[0]).newInstance(new Object[0]);
            if (iBinder == null) {
                zzr = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                if (queryLocalInterface instanceof zzr) {
                    zzr = (zzr) queryLocalInterface;
                } else {
                    zzr = new zzr(iBinder);
                }
            }
            zzl = zzr;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
            throw new LoadingException("Failed to instantiate dynamite loader", e, (zzp) null);
        }
    }

    private static boolean zze(Cursor cursor) {
        zzn zzn = (zzn) zzg.get();
        if (zzn == null || zzn.zza != null) {
            return false;
        }
        zzn.zza = cursor;
        return true;
    }

    private static boolean zzf(Context context) {
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals((Object) null) || bool.equals(zzf)) {
            return true;
        }
        boolean z = false;
        if (zzf == null) {
            ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", 0);
            if (GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(context, 10000000) == 0 && resolveContentProvider != null && "com.google.android.gms".equals(resolveContentProvider.packageName)) {
                z = true;
            }
            Boolean valueOf = Boolean.valueOf(z);
            zzf = valueOf;
            z = valueOf.booleanValue();
            if (z && resolveContentProvider != null && (applicationInfo = resolveContentProvider.applicationInfo) != null && (applicationInfo.flags & 129) == 0) {
                zzd = true;
            }
        }
        return z;
    }

    private static zzq zzg(Context context) {
        zzq zzq;
        synchronized (DynamiteModule.class) {
            zzq zzq2 = zzk;
            if (zzq2 != null) {
                return zzq2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    zzq = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    if (queryLocalInterface instanceof zzq) {
                        zzq = (zzq) queryLocalInterface;
                    } else {
                        zzq = new zzq(iBinder);
                    }
                }
                if (zzq != null) {
                    zzk = zzq;
                    return zzq;
                }
            } catch (Exception e) {
                e.getMessage();
            }
        }
        return null;
    }

    @KeepForSdk
    public Context getModuleContext() {
        return this.zzj;
    }

    @KeepForSdk
    public IBinder instantiate(String str) throws LoadingException {
        try {
            return (IBinder) this.zzj.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            throw new LoadingException("Failed to instantiate module class: ".concat(String.valueOf(str)), e, (zzp) null);
        }
    }
}
