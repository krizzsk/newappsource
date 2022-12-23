package com.moovit.aws.kinesis;

import android.content.Context;
import ce0.C21100e;
import com.amazonaws.mobileconnectors.kinesis.kinesisrecorder.KinesisRecorder;
import com.amazonaws.mobileconnectors.kinesis.kinesisrecorder.KinesisRecorderConfig;
import com.amazonaws.regions.Regions;
import com.moovit.commons.utils.CallableRunnable;
import com.tranzmate.moovit.protocol.kinesis.MVKinesisRecord;
import com.usebutton.sdk.internal.api.AppActionRequest;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.zip.GZIPOutputStream;
import org.apache.thrift.TException;
import p378az.C13552a;
import p401bz.C13710d;
import p824tp.C19731i;
import p977zz.C20932c0;
import p977zz.C20933d;
import vi0.C25111a;
import xi0.C25276a;

public final class KinesisStreamRecorder {

    /* renamed from: a */
    public final Context f40782a;

    /* renamed from: b */
    public final String f40783b;

    /* renamed from: c */
    public final String f40784c;

    /* renamed from: d */
    public final ExecutorService f40785d;

    /* renamed from: e */
    public final KinesisStreamRecorder f40786e;

    /* renamed from: f */
    public KinesisRecorder f40787f = null;

    public static class KinesisException extends RuntimeException {
        public KinesisException(Exception exc) {
            super("Failed to save kinesisable record", exc);
        }

        public KinesisException(Exception exc, int i) {
            super(exc);
        }
    }

    public static class KinesisSaveRecordException extends KinesisException {
        public KinesisSaveRecordException(Exception exc) {
            super(exc);
        }
    }

    /* renamed from: com.moovit.aws.kinesis.KinesisStreamRecorder$a */
    public class C15675a implements CallableRunnable {

        /* renamed from: b */
        public final Collection<? extends C13710d> f40788b;

        /* renamed from: c */
        public final boolean f40789c;

        public C15675a(Collection collection, boolean z) {
            C21100e.m49373x(collection, "records");
            this.f40788b = collection;
            this.f40789c = z;
        }

        /* renamed from: a */
        public final byte[] mo46745a(C13710d dVar, ByteArrayOutputStream byteArrayOutputStream) throws IOException, TException {
            OutputStream outputStream;
            boolean i = dVar.mo40580i();
            byteArrayOutputStream.reset();
            if (i) {
                outputStream = new GZIPOutputStream(byteArrayOutputStream);
            } else {
                outputStream = byteArrayOutputStream;
            }
            dVar.mo40579h(outputStream);
            outputStream.flush();
            if (i) {
                outputStream.close();
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            if (byteArray.length == 0) {
                return null;
            }
            String str = KinesisStreamRecorder.this.f40784c;
            ByteBuffer wrap = ByteBuffer.wrap(byteArray);
            MVKinesisRecord mVKinesisRecord = new MVKinesisRecord();
            mVKinesisRecord.protocolVersion = str;
            mVKinesisRecord.isGzip = i;
            mVKinesisRecord.mo27739i();
            mVKinesisRecord.data = wrap;
            byteArrayOutputStream.reset();
            C25276a aVar = new C25276a((OutputStream) byteArrayOutputStream);
            mVKinesisRecord.mo25202X0(new C25111a(aVar));
            aVar.mo61877a();
            return byteArrayOutputStream.toByteArray();
        }

        public final /* synthetic */ void onError(Throwable th) {
            C20933d.m49028c(this, th);
        }

        public final /* synthetic */ void run() {
            C20933d.m49029d(this);
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(10:1|2|(2:4|5)|6|7|(6:10|11|12|(2:14|33)(1:32)|30|8)|31|18|(1:25)(1:24)|(2:27|37)(1:36)) */
        /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0011 */
        /* JADX WARNING: Removed duplicated region for block: B:10:0x0024 A[Catch:{ Exception -> 0x007c }] */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x006e A[Catch:{ Exception -> 0x007c }] */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x006f A[Catch:{ Exception -> 0x007c }] */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x0072 A[Catch:{ Exception -> 0x007c }] */
        /* JADX WARNING: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void runSafe() throws java.lang.Exception {
            /*
                r7 = this;
                r0 = 0
                com.moovit.aws.kinesis.KinesisStreamRecorder r1 = com.moovit.aws.kinesis.KinesisStreamRecorder.this     // Catch:{ Exception -> 0x007c }
                com.moovit.aws.kinesis.KinesisStreamRecorder r1 = r1.f40786e     // Catch:{ Exception -> 0x007c }
                if (r1 != 0) goto L_0x0008
                goto L_0x0011
            L_0x0008:
                java.util.concurrent.ExecutorService r1 = r1.f40785d     // Catch:{ InterruptedException -> 0x0011 }
                r2 = 1
                java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MINUTES     // Catch:{ InterruptedException -> 0x0011 }
                r1.awaitTermination(r2, r4)     // Catch:{ InterruptedException -> 0x0011 }
            L_0x0011:
                java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream     // Catch:{ Exception -> 0x007c }
                r2 = 512(0x200, float:7.175E-43)
                r1.<init>(r2)     // Catch:{ Exception -> 0x007c }
                java.util.Collection<? extends bz.d> r2 = r7.f40788b     // Catch:{ Exception -> 0x007c }
                java.util.Iterator r2 = r2.iterator()     // Catch:{ Exception -> 0x007c }
            L_0x001e:
                boolean r3 = r2.hasNext()     // Catch:{ Exception -> 0x007c }
                if (r3 == 0) goto L_0x0054
                java.lang.Object r3 = r2.next()     // Catch:{ Exception -> 0x007c }
                bz.d r3 = (p401bz.C13710d) r3     // Catch:{ Exception -> 0x007c }
                byte[] r4 = r7.mo46745a(r3, r1)     // Catch:{ IOException -> 0x0046, TException -> 0x0044 }
                com.moovit.aws.kinesis.KinesisStream r3 = r3.mo40578g()     // Catch:{ IOException -> 0x0046, TException -> 0x0044 }
                java.lang.String r3 = r3.getName()     // Catch:{ IOException -> 0x0046, TException -> 0x0044 }
                if (r4 == 0) goto L_0x001e
                com.moovit.aws.kinesis.KinesisStreamRecorder r5 = com.moovit.aws.kinesis.KinesisStreamRecorder.this     // Catch:{ IOException -> 0x0046, TException -> 0x0044 }
                java.lang.String r6 = r5.f40783b     // Catch:{ IOException -> 0x0046, TException -> 0x0044 }
                com.amazonaws.mobileconnectors.kinesis.kinesisrecorder.KinesisRecorder r5 = com.moovit.aws.kinesis.KinesisStreamRecorder.m40013a(r5)     // Catch:{ IOException -> 0x0046, TException -> 0x0044 }
                r5.saveRecord(r4, r3)     // Catch:{ IOException -> 0x0046, TException -> 0x0044 }
                goto L_0x001e
            L_0x0044:
                r3 = move-exception
                goto L_0x0047
            L_0x0046:
                r3 = move-exception
            L_0x0047:
                de.f r4 = p435de.C16596f.m42113a()     // Catch:{ Exception -> 0x007c }
                com.moovit.aws.kinesis.KinesisStreamRecorder$KinesisSaveRecordException r5 = new com.moovit.aws.kinesis.KinesisStreamRecorder$KinesisSaveRecordException     // Catch:{ Exception -> 0x007c }
                r5.<init>(r3)     // Catch:{ Exception -> 0x007c }
                r4.mo49364c(r5)     // Catch:{ Exception -> 0x007c }
                goto L_0x001e
            L_0x0054:
                boolean r1 = r7.f40789c     // Catch:{ Exception -> 0x007c }
                r2 = 1
                if (r1 == 0) goto L_0x006f
                com.moovit.aws.kinesis.KinesisStreamRecorder r1 = com.moovit.aws.kinesis.KinesisStreamRecorder.this     // Catch:{ Exception -> 0x007c }
                java.util.concurrent.ExecutorService r1 = r1.f40785d     // Catch:{ Exception -> 0x007c }
                boolean r1 = r1.isShutdown()     // Catch:{ Exception -> 0x007c }
                r1 = r1 ^ r2
                if (r1 == 0) goto L_0x006f
                com.moovit.aws.kinesis.KinesisStreamRecorder r1 = com.moovit.aws.kinesis.KinesisStreamRecorder.this     // Catch:{ Exception -> 0x007c }
                android.content.Context r1 = r1.f40782a     // Catch:{ Exception -> 0x007c }
                boolean r1 = p977zz.C20947k.m49056a(r1)     // Catch:{ Exception -> 0x007c }
                if (r1 == 0) goto L_0x006f
                goto L_0x0070
            L_0x006f:
                r2 = 0
            L_0x0070:
                if (r2 == 0) goto L_0x0089
                com.moovit.aws.kinesis.KinesisStreamRecorder r1 = com.moovit.aws.kinesis.KinesisStreamRecorder.this     // Catch:{ Exception -> 0x007c }
                com.amazonaws.mobileconnectors.kinesis.kinesisrecorder.KinesisRecorder r1 = com.moovit.aws.kinesis.KinesisStreamRecorder.m40013a(r1)     // Catch:{ Exception -> 0x007c }
                r1.submitAllRecords()     // Catch:{ Exception -> 0x007c }
                goto L_0x0089
            L_0x007c:
                r1 = move-exception
                de.f r2 = p435de.C16596f.m42113a()
                com.moovit.aws.kinesis.KinesisStreamRecorder$KinesisException r3 = new com.moovit.aws.kinesis.KinesisStreamRecorder$KinesisException
                r3.<init>(r1, r0)
                r2.mo49364c(r3)
            L_0x0089:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moovit.aws.kinesis.KinesisStreamRecorder.C15675a.runSafe():void");
        }
    }

    public KinesisStreamRecorder(Context context, String str, KinesisStreamRecorder kinesisStreamRecorder) {
        C21100e.m49373x(context, AppActionRequest.KEY_CONTEXT);
        this.f40782a = context.getApplicationContext();
        C21100e.m49373x(str, "partitionKey");
        this.f40783b = str;
        this.f40784c = C19731i.m47197a(context).f50171a.f50152c;
        this.f40785d = Executors.newCachedThreadPool(C20932c0.m49025a("kinesis-streamer"));
        this.f40786e = kinesisStreamRecorder;
    }

    /* renamed from: a */
    public static KinesisRecorder m40013a(KinesisStreamRecorder kinesisStreamRecorder) {
        if (kinesisStreamRecorder.f40787f == null) {
            synchronized (kinesisStreamRecorder) {
                if (kinesisStreamRecorder.f40787f == null) {
                    Context context = kinesisStreamRecorder.f40782a;
                    String str = kinesisStreamRecorder.f40783b;
                    kinesisStreamRecorder.f40787f = new KinesisRecorder(context.getDir("kinesis", 0), Regions.EU_WEST_1, C13552a.f33497a, new KinesisRecorderConfig().withPartitionKey(str).withMaxStorageSize(15728640));
                }
            }
        }
        return kinesisStreamRecorder.f40787f;
    }

    /* renamed from: b */
    public final void mo46744b() {
        KinesisStreamRecorder kinesisStreamRecorder = this.f40786e;
        if (kinesisStreamRecorder != null) {
            kinesisStreamRecorder.mo46744b();
        }
        this.f40785d.shutdown();
    }
}
