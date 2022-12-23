package p955zd;

import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.location.places.PlacesStatusCodes;

@VisibleForTesting
/* renamed from: zd.k */
public final class C20826k extends TaskApiCall<C20821f, Void> {

    /* renamed from: a */
    public final /* synthetic */ C20827l f52548a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C20826k(C20827l lVar) {
        super((Feature[]) null, false, PlacesStatusCodes.KEY_INVALID);
        this.f52548a = lVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: zd.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: zd.l} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void doExecute(com.google.android.gms.common.api.Api.AnyClient r6, com.google.android.gms.tasks.TaskCompletionSource r7) throws android.os.RemoteException {
        /*
            r5 = this;
            zd.f r6 = (p955zd.C20821f) r6
            android.os.IInterface r6 = r6.getService()
            zd.s r6 = (p955zd.C20834s) r6
            zd.j r0 = new zd.j
            r0.<init>(r5, r7)
            zd.l r1 = r5.f52548a
            com.google.firebase.appindexing.internal.zzz r1 = r1.f52549a
            android.os.Parcel r2 = r6.zza()
            com.google.android.gms.internal.icing.zzc.zzc(r2, r0)
            com.google.android.gms.internal.icing.zzc.zzb(r2, r1)
            r0 = 8
            android.os.Parcel r6 = r6.zzb(r0, r2)
            android.os.Parcelable$Creator<com.google.firebase.appindexing.internal.zzg> r0 = com.google.firebase.appindexing.internal.zzg.CREATOR
            android.os.Parcelable r0 = com.google.android.gms.internal.icing.zzc.zza(r6, r0)
            com.google.firebase.appindexing.internal.zzg r0 = (com.google.firebase.appindexing.internal.zzg) r0
            r6.recycle()
            r6 = 2
            if (r0 != 0) goto L_0x0031
            r0 = 2
            goto L_0x0033
        L_0x0031:
            int r0 = r0.f36357b
        L_0x0033:
            r1 = 3
            r2 = 0
            r3 = 1
            r4 = 0
            if (r0 != r1) goto L_0x0068
            boolean r7 = r7.trySetResult(r2)
            if (r7 == 0) goto L_0x00ae
            zd.l r7 = r5.f52548a
            zd.m r7 = r7.f52551c
            java.util.ArrayDeque r7 = r7.f52554d
            monitor-enter(r7)
            zd.l r0 = r5.f52548a     // Catch:{ all -> 0x0065 }
            zd.m r0 = r0.f52551c     // Catch:{ all -> 0x0065 }
            int r1 = r0.f52555e     // Catch:{ all -> 0x0065 }
            if (r1 != 0) goto L_0x0061
            java.util.ArrayDeque r6 = r0.f52554d     // Catch:{ all -> 0x0065 }
            java.lang.Object r6 = r6.peek()     // Catch:{ all -> 0x0065 }
            r2 = r6
            zd.l r2 = (p955zd.C20827l) r2     // Catch:{ all -> 0x0065 }
            zd.l r6 = r5.f52548a     // Catch:{ all -> 0x0065 }
            if (r2 != r6) goto L_0x005c
            goto L_0x005d
        L_0x005c:
            r3 = 0
        L_0x005d:
            com.google.android.gms.common.internal.Preconditions.checkState(r3)     // Catch:{ all -> 0x0065 }
            goto L_0x0063
        L_0x0061:
            r0.f52555e = r6     // Catch:{ all -> 0x0065 }
        L_0x0063:
            monitor-exit(r7)     // Catch:{ all -> 0x0065 }
            goto L_0x00ae
        L_0x0065:
            r6 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0065 }
            throw r6
        L_0x0068:
            if (r0 == r3) goto L_0x007e
            boolean r6 = r7.trySetResult(r2)
            if (r6 == 0) goto L_0x007e
            zd.l r6 = r5.f52548a
            com.google.android.gms.tasks.TaskCompletionSource<java.lang.Void> r6 = r6.f52550b
            com.google.firebase.appindexing.FirebaseAppIndexingException r7 = new com.google.firebase.appindexing.FirebaseAppIndexingException
            java.lang.String r0 = "Indexing error."
            r7.<init>(r0)
            r6.setException(r7)
        L_0x007e:
            zd.l r6 = r5.f52548a
            zd.m r6 = r6.f52551c
            java.util.ArrayDeque r6 = r6.f52554d
            monitor-enter(r6)
            zd.l r7 = r5.f52548a     // Catch:{ all -> 0x00b4 }
            zd.m r7 = r7.f52551c     // Catch:{ all -> 0x00b4 }
            java.util.ArrayDeque r7 = r7.f52554d     // Catch:{ all -> 0x00b4 }
            java.lang.Object r7 = r7.poll()     // Catch:{ all -> 0x00b4 }
            zd.l r7 = (p955zd.C20827l) r7     // Catch:{ all -> 0x00b4 }
            zd.l r0 = r5.f52548a     // Catch:{ all -> 0x00b4 }
            if (r7 != r0) goto L_0x0096
            goto L_0x0097
        L_0x0096:
            r3 = 0
        L_0x0097:
            com.google.android.gms.common.internal.Preconditions.checkState(r3)     // Catch:{ all -> 0x00b4 }
            zd.l r7 = r5.f52548a     // Catch:{ all -> 0x00b4 }
            zd.m r7 = r7.f52551c     // Catch:{ all -> 0x00b4 }
            java.util.ArrayDeque r7 = r7.f52554d     // Catch:{ all -> 0x00b4 }
            java.lang.Object r7 = r7.peek()     // Catch:{ all -> 0x00b4 }
            r2 = r7
            zd.l r2 = (p955zd.C20827l) r2     // Catch:{ all -> 0x00b4 }
            zd.l r7 = r5.f52548a     // Catch:{ all -> 0x00b4 }
            zd.m r7 = r7.f52551c     // Catch:{ all -> 0x00b4 }
            r7.f52555e = r4     // Catch:{ all -> 0x00b4 }
            monitor-exit(r6)     // Catch:{ all -> 0x00b4 }
        L_0x00ae:
            if (r2 == 0) goto L_0x00b3
            r2.mo52957a()
        L_0x00b3:
            return
        L_0x00b4:
            r7 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x00b4 }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p955zd.C20826k.doExecute(com.google.android.gms.common.api.Api$AnyClient, com.google.android.gms.tasks.TaskCompletionSource):void");
    }
}
