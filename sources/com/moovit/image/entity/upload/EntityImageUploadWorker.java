package com.moovit.image.entity.upload;

import android.content.Context;
import androidx.work.C1388b;
import androidx.work.NetworkType;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import c70.C13752e;
import ce0.C21100e;
import com.appsflyer.ServerParameters;
import com.google.android.gms.tasks.Tasks;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.commons.request.ServerException;
import com.unity3d.ads.metadata.PlayerMetaData;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.ExecutionException;
import p081f3.C4648b;
import p081f3.C4658i;
import p092g3.C4763k;
import p10.C18868c;
import p435de.C16596f;

public class EntityImageUploadWorker extends Worker {

    public enum EntityImageType {
        STOP(new C16023b()),
        VERIFICATION(new C16024c());
        
        /* access modifiers changed from: private */
        public final C16022a uploadUrlRetriever;

        private EntityImageType(C16022a aVar) {
            C21100e.m49373x(aVar, "uploadUrlRetriever");
            this.uploadUrlRetriever = aVar;
        }
    }

    /* renamed from: com.moovit.image.entity.upload.EntityImageUploadWorker$a */
    public static class C16021a {

        /* renamed from: a */
        public final EntityImageType f41724a;

        /* renamed from: b */
        public final String f41725b;

        /* renamed from: c */
        public final String f41726c;

        /* renamed from: d */
        public final LatLonE6 f41727d;

        public C16021a(EntityImageType entityImageType, String str, String str2, LatLonE6 latLonE6) {
            C21100e.m49373x(entityImageType, "type");
            this.f41724a = entityImageType;
            C21100e.m49373x(str, "filePath");
            this.f41725b = str;
            C21100e.m49373x(str2, "serverContext");
            this.f41726c = str2;
            this.f41727d = latLonE6;
        }

        /* renamed from: a */
        public static C16021a m40809a(C1388b bVar) {
            double d;
            EntityImageType entityImageType = EntityImageType.STOP;
            try {
                entityImageType = EntityImageType.valueOf(bVar.mo5691b("type"));
            } catch (IllegalArgumentException unused) {
            }
            String b = bVar.mo5691b("file_path");
            String b2 = bVar.mo5691b(PlayerMetaData.KEY_SERVER_ID);
            Object obj = bVar.f5152a.get(ServerParameters.LAT_KEY);
            double d2 = 0.0d;
            if (obj instanceof Double) {
                d = ((Double) obj).doubleValue();
            } else {
                d = 0.0d;
            }
            Object obj2 = bVar.f5152a.get(ServerParameters.LON_KEY);
            if (obj2 instanceof Double) {
                d2 = ((Double) obj2).doubleValue();
            }
            return new C16021a(entityImageType, b, b2, LatLonE6.m40176g(d, d2));
        }
    }

    public EntityImageUploadWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    /* renamed from: a */
    public static void m40807a(Context context, EntityImageType entityImageType, String str, String str2, LatLonE6 latLonE6) {
        C4648b.C4649a aVar = new C4648b.C4649a();
        aVar.f15887c = NetworkType.CONNECTED;
        C4648b bVar = new C4648b(aVar);
        C21100e.m49373x(entityImageType, "type");
        C21100e.m49373x(str, "filePath");
        C21100e.m49373x(str2, "serverContext");
        HashMap hashMap = new HashMap();
        hashMap.put("type", entityImageType.name());
        hashMap.put("file_path", str);
        hashMap.put(PlayerMetaData.KEY_SERVER_ID, str2);
        if (latLonE6 != null) {
            hashMap.put(ServerParameters.LAT_KEY, Double.valueOf(latLonE6.mo46922k()));
            hashMap.put(ServerParameters.LON_KEY, Double.valueOf(latLonE6.mo46926o()));
        }
        C1388b bVar2 = new C1388b(hashMap);
        C1388b.m3716c(bVar2);
        C4763k.m12079g(context).mo20185a((C4658i) ((C4658i.C4659a) ((C4658i.C4659a) ((C4658i.C4659a) new C4658i.C4659a(EntityImageUploadWorker.class).mo20189a("image_upload_work_tag")).mo20192f(bVar)).mo20194h(bVar2)).mo20190b());
    }

    /* renamed from: b */
    public static void m40808b(C13752e eVar, C16021a aVar) throws IOException, ServerException, ExecutionException, InterruptedException {
        File file = new File(aVar.f41725b);
        file.getName();
        String str = (String) Tasks.await(aVar.f41724a.uploadUrlRetriever.mo48190a(eVar, aVar));
        file.getName();
        C16596f a = C16596f.m42113a();
        StringBuilder k = C13555b.m33972k("Uploading entity image, entity id: ");
        k.append(aVar.f41726c);
        k.append(" file path: ");
        k.append(file.getName());
        k.append(" to server URL: ");
        k.append(str);
        a.mo49363b(k.toString());
        new C18868c(eVar.f33852a, file, str).mo52626J();
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0083  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.work.ListenableWorker.C1379a doWork() {
        /*
            r8 = this;
            r0 = 0
            androidx.work.b r1 = r8.getInputData()     // Catch:{ Exception -> 0x0057 }
            com.moovit.image.entity.upload.EntityImageUploadWorker$a r1 = com.moovit.image.entity.upload.EntityImageUploadWorker.C16021a.m40809a(r1)     // Catch:{ Exception -> 0x0057 }
            java.io.File r2 = new java.io.File     // Catch:{ Exception -> 0x0055 }
            java.lang.String r3 = r1.f41725b     // Catch:{ Exception -> 0x0055 }
            r2.<init>(r3)     // Catch:{ Exception -> 0x0055 }
            boolean r2 = r2.exists()     // Catch:{ Exception -> 0x0055 }
            r2 = r2 ^ 1
            if (r2 == 0) goto L_0x001e
            androidx.work.ListenableWorker$a$a r0 = new androidx.work.ListenableWorker$a$a     // Catch:{ Exception -> 0x0055 }
            r0.<init>()     // Catch:{ Exception -> 0x0055 }
            return r0
        L_0x001e:
            com.moovit.MoovitApplication<?, ?, ?> r2 = com.moovit.MoovitApplication.f37317k     // Catch:{ Exception -> 0x0055 }
            c70.e r3 = r2.mo44560l()     // Catch:{ Exception -> 0x0055 }
            android.content.Context r4 = r2.getApplicationContext()     // Catch:{ Exception -> 0x0055 }
            tp.a0 r5 = r3.f33853b     // Catch:{ Exception -> 0x0055 }
            if (r5 != 0) goto L_0x0042
            boolean r5 = com.moovit.appdata.UserContextLoader.m40004l(r4)     // Catch:{ Exception -> 0x0055 }
            if (r5 == 0) goto L_0x0042
            c70.e r3 = new c70.e     // Catch:{ Exception -> 0x0055 }
            lz.a r2 = r2.f37321e     // Catch:{ Exception -> 0x0055 }
            r5 = 0
            java.lang.String r6 = "USER_CONTEXT"
            java.lang.Object r2 = r2.mo50695h(r6, r5)     // Catch:{ Exception -> 0x0055 }
            tp.a0 r2 = (p824tp.C19722a0) r2     // Catch:{ Exception -> 0x0055 }
            r3.<init>(r4, r2, r0)     // Catch:{ Exception -> 0x0055 }
        L_0x0042:
            m40808b(r3, r1)     // Catch:{ Exception -> 0x0055 }
            java.io.File r0 = new java.io.File     // Catch:{ Exception -> 0x0055 }
            java.lang.String r2 = r1.f41725b     // Catch:{ Exception -> 0x0055 }
            r0.<init>(r2)     // Catch:{ Exception -> 0x0055 }
            r0.delete()     // Catch:{ Exception -> 0x0055 }
            androidx.work.ListenableWorker$a$c r0 = new androidx.work.ListenableWorker$a$c     // Catch:{ Exception -> 0x0055 }
            r0.<init>()     // Catch:{ Exception -> 0x0055 }
            return r0
        L_0x0055:
            r0 = move-exception
            goto L_0x005b
        L_0x0057:
            r1 = move-exception
            r7 = r1
            r1 = r0
            r0 = r7
        L_0x005b:
            de.f r2 = p435de.C16596f.m42113a()
            java.lang.Exception r3 = new java.lang.Exception
            java.lang.String r4 = "Image uploading exception"
            java.lang.StringBuilder r4 = p379.C13555b.m33972k(r4)
            java.lang.String r5 = r0.getMessage()
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4, r0)
            r2.mo49364c(r3)
            r0.getMessage()
            if (r1 == 0) goto L_0x0083
            androidx.work.ListenableWorker$a$b r0 = new androidx.work.ListenableWorker$a$b
            r0.<init>()
            goto L_0x0088
        L_0x0083:
            androidx.work.ListenableWorker$a$a r0 = new androidx.work.ListenableWorker$a$a
            r0.<init>()
        L_0x0088:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moovit.image.entity.upload.EntityImageUploadWorker.doWork():androidx.work.ListenableWorker$a");
    }
}
