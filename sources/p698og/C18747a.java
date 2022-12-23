package p698og;

import android.content.Context;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzap;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzbc;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzbk;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzbu;
import com.google.android.libraries.barhopper.BarhopperV3;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.nio.ByteBuffer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p887wg.C20305a;
import p887wg.C20329v;

/* renamed from: og.a */
public final class C18747a extends zzbk {

    /* renamed from: e */
    public static final int[] f47686e = {5, 7, 7, 7, 5, 5};

    /* renamed from: f */
    public static final double[][] f47687f = {new double[]{0.075d, 1.0d}, new double[]{0.1d, 1.0d}, new double[]{0.125d, 1.0d}, new double[]{0.2d, 2.0d}, new double[]{0.2d, 0.5d}, new double[]{0.15d, 1.0d}, new double[]{0.2d, 1.0d}, new double[]{0.25d, 1.0d}, new double[]{0.35d, 2.0d}, new double[]{0.35d, 0.5d}, new double[]{0.35d, 3.0d}, new double[]{0.35d, 0.3333d}, new double[]{0.3d, 1.0d}, new double[]{0.4d, 1.0d}, new double[]{0.5d, 1.0d}, new double[]{0.5d, 2.0d}, new double[]{0.5d, 0.5d}, new double[]{0.5d, 3.0d}, new double[]{0.5d, 0.3333d}, new double[]{0.6d, 1.0d}, new double[]{0.8d, 1.0d}, new double[]{1.0d, 1.0d}, new double[]{0.65d, 2.0d}, new double[]{0.65d, 0.5d}, new double[]{0.65d, 3.0d}, new double[]{0.65d, 0.3333d}, new double[]{1.0d, 1.0d}, new double[]{0.8d, 2.0d}, new double[]{0.8d, 0.5d}, new double[]{0.8d, 3.0d}, new double[]{0.8d, 0.3333d}, new double[]{1.0d, 1.0d}, new double[]{0.95d, 2.0d}, new double[]{0.95d, 0.5d}, new double[]{0.95d, 3.0d}, new double[]{0.95d, 0.3333d}};

    /* renamed from: b */
    public final Context f47688b;

    /* renamed from: c */
    public final RecognitionOptions f47689c;

    /* renamed from: d */
    public BarhopperV3 f47690d;

    public C18747a(Context context, zzbc zzbc) {
        RecognitionOptions recognitionOptions = new RecognitionOptions();
        this.f47689c = recognitionOptions;
        this.f47688b = context;
        recognitionOptions.mo19355a(zzbc.zza());
    }

    /* renamed from: G */
    public static zzap m45754G(C20329v vVar, String str, String str2) {
        String str3 = null;
        if (vVar == null || str == null) {
            return null;
        }
        Matcher matcher = Pattern.compile(str2).matcher(str);
        int d = vVar.mo52515d();
        int zzd = vVar.zzd();
        int a = vVar.mo52512a();
        int b = vVar.mo52513b();
        int zzc = vVar.zzc();
        int c = vVar.mo52514c();
        boolean g = vVar.mo52516g();
        if (matcher.find()) {
            str3 = matcher.group(1);
        }
        return new zzap(d, zzd, a, b, zzc, c, g, str3);
    }

    /* renamed from: H */
    public final C20305a mo51243H(ByteBuffer byteBuffer, zzbu zzbu) {
        BarhopperV3 barhopperV3 = (BarhopperV3) Preconditions.checkNotNull(this.f47690d);
        if (((ByteBuffer) Preconditions.checkNotNull(byteBuffer)).isDirect()) {
            return barhopperV3.mo19350c(zzbu.zzd(), zzbu.zza(), byteBuffer, this.f47689c);
        }
        if (byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0) {
            return barhopperV3.mo19352e(zzbu.zzd(), zzbu.zza(), byteBuffer.array(), this.f47689c);
        }
        byte[] bArr = new byte[byteBuffer.remaining()];
        byteBuffer.get(bArr);
        return barhopperV3.mo19352e(zzbu.zzd(), zzbu.zza(), bArr, this.f47689c);
    }

    /* JADX WARNING: type inference failed for: r0v45, types: [com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzec] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List zzb(com.google.android.gms.dynamic.IObjectWrapper r39, com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzbu r40) {
        /*
            r38 = this;
            r0 = r38
            r1 = r40
            int r2 = r40.zzb()
            r3 = -1
            r4 = 0
            if (r2 == r3) goto L_0x0052
            r5 = 17
            if (r2 == r5) goto L_0x0047
            r5 = 35
            if (r2 == r5) goto L_0x002c
            r5 = 842094169(0x32315659, float:1.0322389E-8)
            if (r2 != r5) goto L_0x001a
            goto L_0x0047
        L_0x001a:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            int r1 = r40.zzb()
            r3 = 37
            java.lang.String r4 = "Unsupported image format: "
            java.lang.String r1 = p379.C13715c.m34241g(r3, r4, r1)
            r2.<init>(r1)
            throw r2
        L_0x002c:
            java.lang.Object r2 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r39)
            android.media.Image r2 = (android.media.Image) r2
            java.lang.Object r2 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r2)
            android.media.Image r2 = (android.media.Image) r2
            android.media.Image$Plane[] r2 = r2.getPlanes()
            r2 = r2[r4]
            java.nio.ByteBuffer r2 = r2.getBuffer()
            wg.a r2 = r0.mo51243H(r2, r1)
            goto L_0x0066
        L_0x0047:
            java.lang.Object r2 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r39)
            java.nio.ByteBuffer r2 = (java.nio.ByteBuffer) r2
            wg.a r2 = r0.mo51243H(r2, r1)
            goto L_0x0066
        L_0x0052:
            com.google.android.libraries.barhopper.BarhopperV3 r2 = r0.f47690d
            java.lang.Object r2 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r2)
            com.google.android.libraries.barhopper.BarhopperV3 r2 = (com.google.android.libraries.barhopper.BarhopperV3) r2
            java.lang.Object r5 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r39)
            android.graphics.Bitmap r5 = (android.graphics.Bitmap) r5
            com.google.android.libraries.barhopper.RecognitionOptions r6 = r0.f47689c
            wg.a r2 = r2.mo19353f(r5, r6)
        L_0x0066:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            tg.d r6 = p815tg.C19674d.f49953a
            int r7 = r40.zzd()
            int r8 = r40.zza()
            int r9 = r40.zzc()
            r6.getClass()
            if (r9 != 0) goto L_0x0080
            r6 = 0
            goto L_0x00a7
        L_0x0080:
            android.graphics.Matrix r6 = new android.graphics.Matrix
            r6.<init>()
            int r10 = -r7
            float r10 = (float) r10
            r11 = 1073741824(0x40000000, float:2.0)
            float r10 = r10 / r11
            int r12 = -r8
            float r12 = (float) r12
            float r12 = r12 / r11
            r6.postTranslate(r10, r12)
            int r10 = r9 * 90
            float r10 = (float) r10
            r6.postRotate(r10)
            int r9 = r9 % 2
            if (r9 == 0) goto L_0x009c
            r10 = r8
            goto L_0x009d
        L_0x009c:
            r10 = r7
        L_0x009d:
            if (r9 != 0) goto L_0x00a0
            r7 = r8
        L_0x00a0:
            float r8 = (float) r10
            float r8 = r8 / r11
            float r7 = (float) r7
            float r7 = r7 / r11
            r6.postTranslate(r8, r7)
        L_0x00a7:
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzek r2 = r2.mo52471c()
            java.util.Iterator r2 = r2.iterator()
        L_0x00af:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L_0x04df
            java.lang.Object r7 = r2.next()
            wg.p r7 = (p887wg.C20323p) r7
            int r8 = r7.mo52489b()
            r9 = 8
            if (r8 <= 0) goto L_0x0156
            if (r6 == 0) goto L_0x0156
            float[] r8 = new float[r9]
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzek r9 = r7.mo52500n()
            int r10 = r7.mo52489b()
            r11 = 0
        L_0x00d0:
            if (r11 >= r10) goto L_0x00f3
            int r12 = r11 + r11
            java.lang.Object r13 = r9.get(r11)
            wg.f r13 = (p887wg.C20313f) r13
            int r13 = r13.mo52479a()
            float r13 = (float) r13
            r8[r12] = r13
            int r12 = r12 + 1
            java.lang.Object r13 = r9.get(r11)
            wg.f r13 = (p887wg.C20313f) r13
            int r13 = r13.mo52480b()
            float r13 = (float) r13
            r8[r12] = r13
            int r11 = r11 + 1
            goto L_0x00d0
        L_0x00f3:
            r6.mapPoints(r8)
            int r9 = r40.zzc()
            r11 = 0
        L_0x00fb:
            if (r11 >= r10) goto L_0x0156
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdw r7 = r7.zzG()
            wg.o r7 = (p887wg.C20322o) r7
            int r12 = r11 + r9
            int r12 = r12 % r10
            int r13 = r11 + r11
            wg.e r14 = p887wg.C20313f.m47892c()
            r15 = r8[r13]
            int r15 = (int) r15
            boolean r0 = r14.zzb
            if (r0 == 0) goto L_0x0118
            r14.zzo()
            r14.zzb = r4
        L_0x0118:
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzec r0 = r14.zza
            wg.f r0 = (p887wg.C20313f) r0
            p887wg.C20313f.m47894e(r15, r0)
            int r13 = r13 + 1
            r0 = r8[r13]
            int r0 = (int) r0
            boolean r13 = r14.zzb
            if (r13 == 0) goto L_0x012d
            r14.zzo()
            r14.zzb = r4
        L_0x012d:
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzec r13 = r14.zza
            wg.f r13 = (p887wg.C20313f) r13
            p887wg.C20313f.m47895f(r0, r13)
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzec r0 = r14.zzl()
            wg.f r0 = (p887wg.C20313f) r0
            boolean r13 = r7.zzb
            if (r13 == 0) goto L_0x0143
            r7.zzo()
            r7.zzb = r4
        L_0x0143:
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzec r13 = r7.zza
            wg.p r13 = (p887wg.C20323p) r13
            p887wg.C20323p.m47906o(r13, r12, r0)
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzec r0 = r7.zzl()
            r7 = r0
            wg.p r7 = (p887wg.C20323p) r7
            int r11 = r11 + 1
            r0 = r38
            goto L_0x00fb
        L_0x0156:
            boolean r0 = r7.mo52504s()
            if (r0 == 0) goto L_0x0177
            wg.b0 r0 = r7.mo52493g()
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzat r4 = new com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzat
            int r8 = r0.mo52473c()
            int r8 = r8 + r3
            java.lang.String r9 = r0.zzc()
            java.lang.String r10 = r0.zze()
            java.lang.String r0 = r0.zzd()
            r4.<init>(r8, r9, r10, r0)
            goto L_0x0178
        L_0x0177:
            r4 = 0
        L_0x0178:
            r15 = r4
            boolean r0 = r7.mo52506u()
            if (r0 == 0) goto L_0x0194
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzci r0 = r7.zzb()
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzaw r4 = new com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzaw
            int r8 = r0.zzd()
            int r8 = r8 + r3
            java.lang.String r0 = r0.zzc()
            r4.<init>(r8, r0)
            r16 = r4
            goto L_0x0197
        L_0x0194:
            r0 = 0
            r16 = r0
        L_0x0197:
            boolean r0 = r7.mo52507v()
            if (r0 == 0) goto L_0x01b1
            wg.h r0 = r7.mo52495i()
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzax r4 = new com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzax
            java.lang.String r8 = r0.zzc()
            java.lang.String r0 = r0.zzd()
            r4.<init>(r8, r0)
            r17 = r4
            goto L_0x01b4
        L_0x01b1:
            r0 = 0
            r17 = r0
        L_0x01b4:
            boolean r0 = r7.mo52509x()
            if (r0 == 0) goto L_0x01d3
            wg.n r0 = r7.mo52497k()
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzaz r4 = new com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzaz
            java.lang.String r8 = r0.zzd()
            java.lang.String r9 = r0.zzc()
            int r0 = r0.mo52485c()
            int r0 = r0 + r3
            r4.<init>(r8, r9, r0)
            r18 = r4
            goto L_0x01d6
        L_0x01d3:
            r0 = 0
            r18 = r0
        L_0x01d6:
            boolean r0 = r7.mo52508w()
            if (r0 == 0) goto L_0x01f0
            wg.k r0 = r7.mo52496j()
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzay r4 = new com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzay
            java.lang.String r8 = r0.zzc()
            java.lang.String r0 = r0.zzd()
            r4.<init>(r8, r0)
            r19 = r4
            goto L_0x01f3
        L_0x01f0:
            r0 = 0
            r19 = r0
        L_0x01f3:
            boolean r0 = r7.mo52505t()
            if (r0 == 0) goto L_0x020d
            wg.d r0 = r7.mo52494h()
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzau r4 = new com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzau
            double r8 = r0.mo52477a()
            double r10 = r0.mo52478b()
            r4.<init>(r8, r10)
            r20 = r4
            goto L_0x0210
        L_0x020d:
            r0 = 0
            r20 = r0
        L_0x0210:
            boolean r0 = r7.mo52501p()
            if (r0 == 0) goto L_0x0272
            wg.x r0 = r7.mo52490d()
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzaq r4 = new com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzaq
            java.lang.String r22 = r0.zzj()
            java.lang.String r23 = r0.zze()
            java.lang.String r24 = r0.zzf()
            java.lang.String r25 = r0.zzh()
            java.lang.String r26 = r0.zzi()
            wg.v r8 = r0.mo52520b()
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb r9 = r7.mo52498l()
            boolean r9 = r9.zzn()
            if (r9 == 0) goto L_0x0247
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb r9 = r7.mo52498l()
            java.lang.String r9 = r9.zzv()
            goto L_0x0248
        L_0x0247:
            r9 = 0
        L_0x0248:
            java.lang.String r10 = "DTSTART:([0-9TZ]*)"
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzap r27 = m45754G(r8, r9, r10)
            wg.v r0 = r0.mo52519a()
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb r8 = r7.mo52498l()
            boolean r8 = r8.zzn()
            if (r8 == 0) goto L_0x0265
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb r8 = r7.mo52498l()
            java.lang.String r8 = r8.zzv()
            goto L_0x0266
        L_0x0265:
            r8 = 0
        L_0x0266:
            java.lang.String r9 = "DTEND:([0-9TZ]*)"
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzap r28 = m45754G(r0, r8, r9)
            r21 = r4
            r21.<init>(r22, r23, r24, r25, r26, r27, r28)
            goto L_0x0275
        L_0x0272:
            r0 = 0
            r21 = r0
        L_0x0275:
            boolean r0 = r7.mo52502q()
            if (r0 == 0) goto L_0x03a0
            wg.y r0 = r7.mo52491e()
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzar r4 = new com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzar
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcd r8 = r0.zza()
            if (r8 == 0) goto L_0x02ad
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzav r9 = new com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzav
            java.lang.String r23 = r8.zzd()
            java.lang.String r24 = r8.zzi()
            java.lang.String r25 = r8.zzh()
            java.lang.String r26 = r8.zzc()
            java.lang.String r27 = r8.zzf()
            java.lang.String r28 = r8.zze()
            java.lang.String r29 = r8.zzj()
            r22 = r9
            r22.<init>(r23, r24, r25, r26, r27, r28, r29)
            r23 = r9
            goto L_0x02b0
        L_0x02ad:
            r8 = 0
            r23 = r8
        L_0x02b0:
            java.lang.String r24 = r0.zzd()
            java.lang.String r25 = r0.zze()
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzek r8 = r0.mo52528e()
            boolean r9 = r8.isEmpty()
            if (r9 == 0) goto L_0x02c6
            r8 = 0
            r26 = r8
            goto L_0x02f4
        L_0x02c6:
            int r9 = r8.size()
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzaw[] r9 = new com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzaw[r9]
            r10 = 0
        L_0x02cd:
            int r11 = r8.size()
            if (r10 >= r11) goto L_0x02f2
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzaw r11 = new com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzaw
            java.lang.Object r12 = r8.get(r10)
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzci r12 = (com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzci) r12
            int r12 = r12.zzd()
            int r12 = r12 + r3
            java.lang.Object r13 = r8.get(r10)
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzci r13 = (com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzci) r13
            java.lang.String r13 = r13.zzc()
            r11.<init>(r12, r13)
            r9[r10] = r11
            int r10 = r10 + 1
            goto L_0x02cd
        L_0x02f2:
            r26 = r9
        L_0x02f4:
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzek r8 = r0.mo52527d()
            boolean r9 = r8.isEmpty()
            if (r9 == 0) goto L_0x0302
            r3 = 0
            r27 = r3
            goto L_0x0345
        L_0x0302:
            int r9 = r8.size()
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzat[] r9 = new com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzat[r9]
            r10 = 0
        L_0x0309:
            int r11 = r8.size()
            if (r10 >= r11) goto L_0x0343
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzat r11 = new com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzat
            java.lang.Object r12 = r8.get(r10)
            wg.b0 r12 = (p887wg.C20308b0) r12
            int r12 = r12.mo52473c()
            int r12 = r12 + r3
            java.lang.Object r3 = r8.get(r10)
            wg.b0 r3 = (p887wg.C20308b0) r3
            java.lang.String r3 = r3.zzc()
            java.lang.Object r13 = r8.get(r10)
            wg.b0 r13 = (p887wg.C20308b0) r13
            java.lang.String r13 = r13.zze()
            java.lang.Object r14 = r8.get(r10)
            wg.b0 r14 = (p887wg.C20308b0) r14
            java.lang.String r14 = r14.zzd()
            r11.<init>(r12, r3, r13, r14)
            r9[r10] = r11
            int r10 = r10 + 1
            r3 = -1
            goto L_0x0309
        L_0x0343:
            r27 = r9
        L_0x0345:
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzek r3 = r0.mo52529f()
            r8 = 0
            java.lang.String[] r8 = new java.lang.String[r8]
            java.lang.Object[] r3 = r3.toArray(r8)
            r28 = r3
            java.lang.String[] r28 = (java.lang.String[]) r28
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzek r0 = r0.mo52526c()
            boolean r3 = r0.isEmpty()
            if (r3 == 0) goto L_0x0362
            r0 = 0
            r29 = r0
            goto L_0x039a
        L_0x0362:
            int r3 = r0.size()
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzao[] r3 = new com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzao[r3]
            r8 = 0
        L_0x0369:
            int r9 = r0.size()
            if (r8 >= r9) goto L_0x0398
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzao r9 = new com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzao
            java.lang.Object r10 = r0.get(r8)
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcb r10 = (com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcb) r10
            int r10 = r10.zzc()
            int r10 = r10 + -1
            java.lang.Object r11 = r0.get(r8)
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcb r11 = (com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcb) r11
            java.util.List r11 = r11.zzb()
            r12 = 0
            java.lang.String[] r12 = new java.lang.String[r12]
            java.lang.Object[] r11 = r11.toArray(r12)
            java.lang.String[] r11 = (java.lang.String[]) r11
            r9.<init>(r10, r11)
            r3[r8] = r9
            int r8 = r8 + 1
            goto L_0x0369
        L_0x0398:
            r29 = r3
        L_0x039a:
            r22 = r4
            r22.<init>(r23, r24, r25, r26, r27, r28, r29)
            goto L_0x03a3
        L_0x03a0:
            r0 = 0
            r22 = r0
        L_0x03a3:
            boolean r0 = r7.mo52503r()
            if (r0 == 0) goto L_0x03ed
            wg.z r0 = r7.mo52492f()
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzas r3 = new com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzas
            java.lang.String r24 = r0.zzi()
            java.lang.String r25 = r0.mo52533c()
            java.lang.String r26 = r0.mo52539i()
            java.lang.String r27 = r0.mo52537g()
            java.lang.String r28 = r0.mo52534d()
            java.lang.String r29 = r0.zze()
            java.lang.String r30 = r0.zzc()
            java.lang.String r31 = r0.zzd()
            java.lang.String r32 = r0.zzf()
            java.lang.String r33 = r0.mo52538h()
            java.lang.String r34 = r0.mo52535e()
            java.lang.String r35 = r0.zzj()
            java.lang.String r36 = r0.zzh()
            java.lang.String r37 = r0.mo52536f()
            r23 = r3
            r23.<init>(r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37)
            goto L_0x03f0
        L_0x03ed:
            r0 = 0
            r23 = r0
        L_0x03f0:
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzba r0 = new com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzba
            int r3 = r7.mo52510y()
            int r3 = r3 + -1
            switch(r3) {
                case 0: goto L_0x0439;
                case 1: goto L_0x0436;
                case 2: goto L_0x0433;
                case 3: goto L_0x0430;
                case 4: goto L_0x042b;
                case 5: goto L_0x0426;
                case 6: goto L_0x0421;
                case 7: goto L_0x041c;
                case 8: goto L_0x0417;
                case 9: goto L_0x0412;
                case 10: goto L_0x040d;
                case 11: goto L_0x0408;
                case 12: goto L_0x0403;
                case 13: goto L_0x03fe;
                default: goto L_0x03fb;
            }
        L_0x03fb:
            r3 = -1
            r9 = -1
            goto L_0x043b
        L_0x03fe:
            r3 = 4096(0x1000, float:5.74E-42)
            r9 = 4096(0x1000, float:5.74E-42)
            goto L_0x043b
        L_0x0403:
            r3 = 2048(0x800, float:2.87E-42)
            r9 = 2048(0x800, float:2.87E-42)
            goto L_0x043b
        L_0x0408:
            r3 = 1024(0x400, float:1.435E-42)
            r9 = 1024(0x400, float:1.435E-42)
            goto L_0x043b
        L_0x040d:
            r3 = 512(0x200, float:7.175E-43)
            r9 = 512(0x200, float:7.175E-43)
            goto L_0x043b
        L_0x0412:
            r3 = 256(0x100, float:3.59E-43)
            r9 = 256(0x100, float:3.59E-43)
            goto L_0x043b
        L_0x0417:
            r3 = 128(0x80, float:1.794E-43)
            r9 = 128(0x80, float:1.794E-43)
            goto L_0x043b
        L_0x041c:
            r3 = 64
            r9 = 64
            goto L_0x043b
        L_0x0421:
            r3 = 32
            r9 = 32
            goto L_0x043b
        L_0x0426:
            r3 = 16
            r9 = 16
            goto L_0x043b
        L_0x042b:
            r3 = 8
            r9 = 8
            goto L_0x043b
        L_0x0430:
            r3 = 4
            r9 = 4
            goto L_0x043b
        L_0x0433:
            r3 = 2
            r9 = 2
            goto L_0x043b
        L_0x0436:
            r3 = 1
            r9 = 1
            goto L_0x043b
        L_0x0439:
            r3 = 0
            r9 = 0
        L_0x043b:
            java.lang.String r10 = r7.mo52499m()
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb r3 = r7.mo52498l()
            boolean r3 = r3.zzn()
            if (r3 == 0) goto L_0x0452
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb r3 = r7.mo52498l()
            java.lang.String r3 = r3.zzv()
            goto L_0x0453
        L_0x0452:
            r3 = 0
        L_0x0453:
            r11 = r3
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb r3 = r7.mo52498l()
            byte[] r12 = r3.zzy()
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzek r3 = r7.mo52500n()
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L_0x0469
            r3 = 0
            r13 = r3
            goto L_0x0497
        L_0x0469:
            int r4 = r3.size()
            android.graphics.Point[] r4 = new android.graphics.Point[r4]
            r8 = 0
        L_0x0470:
            int r13 = r3.size()
            if (r8 >= r13) goto L_0x0496
            android.graphics.Point r13 = new android.graphics.Point
            java.lang.Object r14 = r3.get(r8)
            wg.f r14 = (p887wg.C20313f) r14
            int r14 = r14.mo52479a()
            java.lang.Object r24 = r3.get(r8)
            wg.f r24 = (p887wg.C20313f) r24
            int r1 = r24.mo52480b()
            r13.<init>(r14, r1)
            r4[r8] = r13
            int r8 = r8 + 1
            r1 = r40
            goto L_0x0470
        L_0x0496:
            r13 = r4
        L_0x0497:
            int r1 = r7.mo52488a()
            int r1 = r1 + -1
            switch(r1) {
                case 1: goto L_0x04ce;
                case 2: goto L_0x04cb;
                case 3: goto L_0x04c8;
                case 4: goto L_0x04c5;
                case 5: goto L_0x04c2;
                case 6: goto L_0x04bf;
                case 7: goto L_0x04bc;
                case 8: goto L_0x04b7;
                case 9: goto L_0x04b2;
                case 10: goto L_0x04ad;
                case 11: goto L_0x04a8;
                case 12: goto L_0x04a3;
                default: goto L_0x04a0;
            }
        L_0x04a0:
            r1 = 0
            r14 = 0
            goto L_0x04d0
        L_0x04a3:
            r1 = 12
            r14 = 12
            goto L_0x04d0
        L_0x04a8:
            r1 = 11
            r14 = 11
            goto L_0x04d0
        L_0x04ad:
            r1 = 10
            r14 = 10
            goto L_0x04d0
        L_0x04b2:
            r1 = 9
            r14 = 9
            goto L_0x04d0
        L_0x04b7:
            r1 = 8
            r14 = 8
            goto L_0x04d0
        L_0x04bc:
            r1 = 7
            r14 = 7
            goto L_0x04d0
        L_0x04bf:
            r1 = 6
            r14 = 6
            goto L_0x04d0
        L_0x04c2:
            r1 = 5
            r14 = 5
            goto L_0x04d0
        L_0x04c5:
            r1 = 4
            r14 = 4
            goto L_0x04d0
        L_0x04c8:
            r1 = 3
            r14 = 3
            goto L_0x04d0
        L_0x04cb:
            r1 = 2
            r14 = 2
            goto L_0x04d0
        L_0x04ce:
            r1 = 1
            r14 = 1
        L_0x04d0:
            r8 = r0
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            r5.add(r0)
            r3 = -1
            r4 = 0
            r0 = r38
            r1 = r40
            goto L_0x00af
        L_0x04df:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p698og.C18747a.zzb(com.google.android.gms.dynamic.IObjectWrapper, com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzbu):java.util.List");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:66:0x016f */
    /* JADX WARNING: Missing exception handler attribute for start block: B:72:0x0176 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:78:0x017d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzc() {
        /*
            r13 = this;
            com.google.android.libraries.barhopper.BarhopperV3 r0 = r13.f47690d
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            com.google.android.libraries.barhopper.BarhopperV3 r0 = new com.google.android.libraries.barhopper.BarhopperV3
            r0.<init>()
            r13.f47690d = r0
            kd.f r0 = p600kd.C18024g.m44693a()
            kd.d r1 = p600kd.C18022e.m44690a()
            r2 = 16
            r3 = 0
            r4 = 0
            r5 = 0
        L_0x0019:
            r6 = 6
            if (r4 >= r6) goto L_0x009e
            kd.b r6 = p600kd.C18020c.m44684a()
            boolean r7 = r6.zzb
            if (r7 == 0) goto L_0x0029
            r6.zzo()
            r6.zzb = r3
        L_0x0029:
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzec r7 = r6.zza
            kd.c r7 = (p600kd.C18020c) r7
            p600kd.C18020c.m44689f(r7, r2)
            boolean r7 = r6.zzb
            if (r7 == 0) goto L_0x0039
            r6.zzo()
            r6.zzb = r3
        L_0x0039:
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzec r7 = r6.zza
            kd.c r7 = (p600kd.C18020c) r7
            p600kd.C18020c.m44686c(r7, r2)
            r7 = 0
        L_0x0041:
            int[] r8 = f47686e
            r8 = r8[r4]
            if (r7 >= r8) goto L_0x0083
            double[][] r8 = f47687f
            r8 = r8[r5]
            r9 = r8[r3]
            r11 = 4644337115725824000(0x4074000000000000, double:320.0)
            double r9 = r9 * r11
            float r9 = (float) r9
            r10 = 1
            r10 = r8[r10]
            double r10 = java.lang.Math.sqrt(r10)
            float r8 = (float) r10
            float r10 = r9 / r8
            boolean r11 = r6.zzb
            if (r11 == 0) goto L_0x0065
            r6.zzo()
            r6.zzb = r3
        L_0x0065:
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzec r11 = r6.zza
            kd.c r11 = (p600kd.C18020c) r11
            p600kd.C18020c.m44687d(r11, r10)
            float r9 = r9 * r8
            boolean r8 = r6.zzb
            if (r8 == 0) goto L_0x0077
            r6.zzo()
            r6.zzb = r3
        L_0x0077:
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzec r8 = r6.zza
            kd.c r8 = (p600kd.C18020c) r8
            p600kd.C18020c.m44688e(r8, r9)
            int r5 = r5 + 1
            int r7 = r7 + 1
            goto L_0x0041
        L_0x0083:
            int r2 = r2 + r2
            boolean r7 = r1.zzb
            if (r7 == 0) goto L_0x008d
            r1.zzo()
            r1.zzb = r3
        L_0x008d:
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzec r7 = r1.zza
            kd.e r7 = (p600kd.C18022e) r7
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzec r6 = r6.zzl()
            kd.c r6 = (p600kd.C18020c) r6
            p600kd.C18022e.m44692c(r7, r6)
            int r4 = r4 + 1
            goto L_0x0019
        L_0x009e:
            boolean r2 = r0.zzb
            if (r2 == 0) goto L_0x00a7
            r0.zzo()
            r0.zzb = r3
        L_0x00a7:
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzec r2 = r0.zza
            kd.g r2 = (p600kd.C18024g) r2
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzec r1 = r1.zzl()
            kd.e r1 = (p600kd.C18022e) r1
            p600kd.C18024g.m44695c(r2, r1)
            android.content.Context r1 = r13.f47688b     // Catch:{ IOException -> 0x017e }
            android.content.res.AssetManager r1 = r1.getAssets()     // Catch:{ IOException -> 0x017e }
            java.lang.String r2 = "mlkit_barcode_models/barcode_ssd_mobilenet_v1_dmp25_quant.tflite"
            java.io.InputStream r1 = r1.open(r2)     // Catch:{ IOException -> 0x017e }
            android.content.Context r2 = r13.f47688b     // Catch:{ all -> 0x0177 }
            android.content.res.AssetManager r2 = r2.getAssets()     // Catch:{ all -> 0x0177 }
            java.lang.String r4 = "mlkit_barcode_models/oned_auto_regressor_mobile.tflite"
            java.io.InputStream r2 = r2.open(r4)     // Catch:{ all -> 0x0177 }
            android.content.Context r4 = r13.f47688b     // Catch:{ all -> 0x0170 }
            android.content.res.AssetManager r4 = r4.getAssets()     // Catch:{ all -> 0x0170 }
            java.lang.String r5 = "mlkit_barcode_models/oned_feature_extractor_mobile.tflite"
            java.io.InputStream r4 = r4.open(r5)     // Catch:{ all -> 0x0170 }
            com.google.android.libraries.barhopper.BarhopperV3 r5 = r13.f47690d     // Catch:{ all -> 0x0169 }
            java.lang.Object r5 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r5)     // Catch:{ all -> 0x0169 }
            com.google.android.libraries.barhopper.BarhopperV3 r5 = (com.google.android.libraries.barhopper.BarhopperV3) r5     // Catch:{ all -> 0x0169 }
            kd.h r6 = p600kd.C18018a.m44680a()     // Catch:{ all -> 0x0169 }
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb r7 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb.zzt(r1)     // Catch:{ all -> 0x0169 }
            boolean r8 = r0.zzb     // Catch:{ all -> 0x0169 }
            if (r8 == 0) goto L_0x00f1
            r0.zzo()     // Catch:{ all -> 0x0169 }
            r0.zzb = r3     // Catch:{ all -> 0x0169 }
        L_0x00f1:
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzec r8 = r0.zza     // Catch:{ all -> 0x0169 }
            kd.g r8 = (p600kd.C18024g) r8     // Catch:{ all -> 0x0169 }
            p600kd.C18024g.m44696d(r8, r7)     // Catch:{ all -> 0x0169 }
            boolean r7 = r6.zzb     // Catch:{ all -> 0x0169 }
            if (r7 == 0) goto L_0x0101
            r6.zzo()     // Catch:{ all -> 0x0169 }
            r6.zzb = r3     // Catch:{ all -> 0x0169 }
        L_0x0101:
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzec r7 = r6.zza     // Catch:{ all -> 0x0169 }
            kd.a r7 = (p600kd.C18018a) r7     // Catch:{ all -> 0x0169 }
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzec r0 = r0.zzl()     // Catch:{ all -> 0x0169 }
            kd.g r0 = (p600kd.C18024g) r0     // Catch:{ all -> 0x0169 }
            p600kd.C18018a.m44682c(r7, r0)     // Catch:{ all -> 0x0169 }
            kd.i r0 = p600kd.C18027j.m44697a()     // Catch:{ all -> 0x0169 }
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb r7 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb.zzt(r2)     // Catch:{ all -> 0x0169 }
            boolean r8 = r0.zzb     // Catch:{ all -> 0x0169 }
            if (r8 == 0) goto L_0x011f
            r0.zzo()     // Catch:{ all -> 0x0169 }
            r0.zzb = r3     // Catch:{ all -> 0x0169 }
        L_0x011f:
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzec r8 = r0.zza     // Catch:{ all -> 0x0169 }
            kd.j r8 = (p600kd.C18027j) r8     // Catch:{ all -> 0x0169 }
            p600kd.C18027j.m44700d(r8, r7)     // Catch:{ all -> 0x0169 }
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb r7 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb.zzt(r4)     // Catch:{ all -> 0x0169 }
            boolean r8 = r0.zzb     // Catch:{ all -> 0x0169 }
            if (r8 == 0) goto L_0x0133
            r0.zzo()     // Catch:{ all -> 0x0169 }
            r0.zzb = r3     // Catch:{ all -> 0x0169 }
        L_0x0133:
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzec r8 = r0.zza     // Catch:{ all -> 0x0169 }
            kd.j r8 = (p600kd.C18027j) r8     // Catch:{ all -> 0x0169 }
            p600kd.C18027j.m44699c(r8, r7)     // Catch:{ all -> 0x0169 }
            boolean r7 = r6.zzb     // Catch:{ all -> 0x0169 }
            if (r7 == 0) goto L_0x0143
            r6.zzo()     // Catch:{ all -> 0x0169 }
            r6.zzb = r3     // Catch:{ all -> 0x0169 }
        L_0x0143:
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzec r3 = r6.zza     // Catch:{ all -> 0x0169 }
            kd.a r3 = (p600kd.C18018a) r3     // Catch:{ all -> 0x0169 }
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzec r0 = r0.zzl()     // Catch:{ all -> 0x0169 }
            kd.j r0 = (p600kd.C18027j) r0     // Catch:{ all -> 0x0169 }
            p600kd.C18018a.m44683d(r3, r0)     // Catch:{ all -> 0x0169 }
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzec r0 = r6.zzl()     // Catch:{ all -> 0x0169 }
            kd.a r0 = (p600kd.C18018a) r0     // Catch:{ all -> 0x0169 }
            r5.mo19349a(r0)     // Catch:{ all -> 0x0169 }
            if (r4 == 0) goto L_0x015e
            r4.close()     // Catch:{ all -> 0x0170 }
        L_0x015e:
            if (r2 == 0) goto L_0x0163
            r2.close()     // Catch:{ all -> 0x0177 }
        L_0x0163:
            if (r1 == 0) goto L_0x0168
            r1.close()     // Catch:{ IOException -> 0x017e }
        L_0x0168:
            return
        L_0x0169:
            r0 = move-exception
            if (r4 == 0) goto L_0x016f
            r4.close()     // Catch:{ all -> 0x016f }
        L_0x016f:
            throw r0     // Catch:{ all -> 0x0170 }
        L_0x0170:
            r0 = move-exception
            if (r2 == 0) goto L_0x0176
            r2.close()     // Catch:{ all -> 0x0176 }
        L_0x0176:
            throw r0     // Catch:{ all -> 0x0177 }
        L_0x0177:
            r0 = move-exception
            if (r1 == 0) goto L_0x017d
            r1.close()     // Catch:{ all -> 0x017d }
        L_0x017d:
            throw r0     // Catch:{ IOException -> 0x017e }
        L_0x017e:
            r0 = move-exception
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Failed to open Barcode models"
            r1.<init>(r2, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p698og.C18747a.zzc():void");
    }

    public final void zzd() {
        BarhopperV3 barhopperV3 = this.f47690d;
        if (barhopperV3 != null) {
            barhopperV3.close();
            this.f47690d = null;
        }
    }
}
