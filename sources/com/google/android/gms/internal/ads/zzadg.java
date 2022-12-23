package com.google.android.gms.internal.ads;

import android.util.Pair;
import com.appboy.support.ValidationUtils;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.nearby.connection.ConnectionsStatusCodes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class zzadg {
    public int zzA = 1000;
    public int zzB = 200;
    public float zzC = -1.0f;
    public float zzD = -1.0f;
    public float zzE = -1.0f;
    public float zzF = -1.0f;
    public float zzG = -1.0f;
    public float zzH = -1.0f;
    public float zzI = -1.0f;
    public float zzJ = -1.0f;
    public float zzK = -1.0f;
    public float zzL = -1.0f;
    public byte[] zzM;
    public int zzN = 1;
    public int zzO = -1;
    public int zzP = ConnectionsStatusCodes.STATUS_NETWORK_NOT_CONNECTED;
    public long zzQ = 0;
    public long zzR = 0;
    public zzaaa zzS;
    public boolean zzT;
    public boolean zzU = true;
    public zzzz zzV;
    public int zzW;
    /* access modifiers changed from: private */
    public int zzX;
    /* access modifiers changed from: private */
    public String zzY = "eng";
    public String zza;
    public String zzb;
    public int zzc;
    public int zzd;
    public int zze;
    public int zzf;
    public boolean zzg;
    public byte[] zzh;
    public zzzy zzi;
    public byte[] zzj;
    public zzv zzk;
    public int zzl = -1;
    public int zzm = -1;
    public int zzn = -1;
    public int zzo = -1;
    public int zzp = 0;
    public int zzq = -1;
    public float zzr = BitmapDescriptorFactory.HUE_RED;
    public float zzs = BitmapDescriptorFactory.HUE_RED;
    public float zzt = BitmapDescriptorFactory.HUE_RED;
    public byte[] zzu = null;
    public int zzv = -1;
    public boolean zzw = false;
    public int zzx = -1;
    public int zzy = -1;
    public int zzz = -1;

    private static Pair zzf(zzdy zzdy) throws zzbp {
        try {
            zzdy.zzG(16);
            long zzq2 = zzdy.zzq();
            if (zzq2 == 1482049860) {
                return new Pair("video/divx", (Object) null);
            }
            if (zzq2 == 859189832) {
                return new Pair("video/3gpp", (Object) null);
            }
            if (zzq2 != 826496599) {
                return new Pair("video/x-unknown", (Object) null);
            }
            int zzc2 = zzdy.zzc() + 20;
            byte[] zzH2 = zzdy.zzH();
            while (true) {
                int length = zzH2.length;
                if (zzc2 >= length - 4) {
                    throw zzbp.zza("Failed to find FourCC VC1 initialization data", (Throwable) null);
                } else if (zzH2[zzc2] == 0 && zzH2[zzc2 + 1] == 0 && zzH2[zzc2 + 2] == 1 && zzH2[zzc2 + 3] == 15) {
                    return new Pair("video/wvc1", Collections.singletonList(Arrays.copyOfRange(zzH2, zzc2, length)));
                } else {
                    zzc2++;
                }
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw zzbp.zza("Error parsing FourCC private data", (Throwable) null);
        }
    }

    private static List zzg(byte[] bArr) throws zzbp {
        byte b;
        byte b2;
        try {
            if (bArr[0] == 2) {
                int i = 1;
                int i2 = 0;
                while (true) {
                    b = bArr[i] & 255;
                    if (b != 255) {
                        break;
                    }
                    i2 += ValidationUtils.APPBOY_STRING_MAX_LENGTH;
                    i++;
                }
                int i3 = i + 1;
                int i4 = i2 + b;
                int i5 = 0;
                while (true) {
                    b2 = bArr[i3] & 255;
                    if (b2 != 255) {
                        break;
                    }
                    i5 += ValidationUtils.APPBOY_STRING_MAX_LENGTH;
                    i3++;
                }
                int i6 = i3 + 1;
                int i7 = i5 + b2;
                if (bArr[i6] == 1) {
                    byte[] bArr2 = new byte[i4];
                    System.arraycopy(bArr, i6, bArr2, 0, i4);
                    int i8 = i6 + i4;
                    if (bArr[i8] == 3) {
                        int i9 = i8 + i7;
                        if (bArr[i9] == 5) {
                            int length = bArr.length - i9;
                            byte[] bArr3 = new byte[length];
                            System.arraycopy(bArr, i9, bArr3, 0, length);
                            ArrayList arrayList = new ArrayList(2);
                            arrayList.add(bArr2);
                            arrayList.add(bArr3);
                            return arrayList;
                        }
                        throw zzbp.zza("Error parsing vorbis codec private", (Throwable) null);
                    }
                    throw zzbp.zza("Error parsing vorbis codec private", (Throwable) null);
                }
                throw zzbp.zza("Error parsing vorbis codec private", (Throwable) null);
            }
            throw zzbp.zza("Error parsing vorbis codec private", (Throwable) null);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw zzbp.zza("Error parsing vorbis codec private", (Throwable) null);
        }
    }

    private static boolean zzh(zzdy zzdy) throws zzbp {
        try {
            int zzi2 = zzdy.zzi();
            if (zzi2 == 1) {
                return true;
            }
            if (zzi2 == 65534) {
                zzdy.zzF(24);
                if (zzdy.zzr() == zzadh.zzf.getMostSignificantBits() && zzdy.zzr() == zzadh.zzf.getLeastSignificantBits()) {
                    return true;
                }
                return false;
            }
            return false;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw zzbp.zza("Error parsing MS/ACM codec private", (Throwable) null);
        }
    }

    private final byte[] zzi(String str) throws zzbp {
        byte[] bArr = this.zzj;
        if (bArr != null) {
            return bArr;
        }
        throw zzbp.zza("Missing CodecPrivate for codec ".concat(String.valueOf(str)), (Throwable) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: com.google.android.gms.internal.ads.zzo} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: com.google.android.gms.internal.ads.zzfrh} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: com.google.android.gms.internal.ads.zzfrh} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v21, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v18, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v17, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v31, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v35, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v47, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v50, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v57, resolved type: com.google.android.gms.internal.ads.zzfrh} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v58, resolved type: com.google.android.gms.internal.ads.zzfrh} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v59, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v61, resolved type: com.google.android.gms.internal.ads.zzfrh} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v64, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v68, resolved type: com.google.android.gms.internal.ads.zzfrh} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v69, resolved type: com.google.android.gms.internal.ads.zzfrh} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v70, resolved type: com.google.android.gms.internal.ads.zzfrh} */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v10 */
    /* JADX WARNING: type inference failed for: r3v15 */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0210, code lost:
        if (r9 == 0) goto L_0x0230;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0213, code lost:
        r1 = null;
        r2 = null;
        r11 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0216, code lost:
        r4 = -1;
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x022e, code lost:
        if (r9 != 0) goto L_0x0213;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0230, code lost:
        r1 = null;
        r2 = null;
        r17 = "audio/x-unknown";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x0262, code lost:
        r1 = null;
        r2 = null;
        r4 = 4096;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x02f3, code lost:
        r2 = null;
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0324, code lost:
        r4 = -1;
        r11 = -1;
        r19 = r2;
        r2 = r1;
        r1 = r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0344, code lost:
        r1 = null;
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0346, code lost:
        r4 = -1;
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0347, code lost:
        r11 = -1;
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x0348, code lost:
        r8 = r0.zzM;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x034a, code lost:
        if (r8 == null) goto L_0x035b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x034c, code lost:
        r8 = com.google.android.gms.internal.ads.zzyp.zza(new com.google.android.gms.internal.ads.zzdy(r8));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x0355, code lost:
        if (r8 == null) goto L_0x035b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x0357, code lost:
        r2 = r8.zza;
        r17 = "video/dolby-vision";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x035b, code lost:
        r8 = r17;
        r10 = r0.zzU;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x0361, code lost:
        if (true == r0.zzT) goto L_0x0365;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x0363, code lost:
        r5 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x0365, code lost:
        r5 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x0366, code lost:
        r5 = r5 | r10;
        r10 = new com.google.android.gms.internal.ads.zzab();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x0370, code lost:
        if (com.google.android.gms.internal.ads.zzbo.zzg(r8) == false) goto L_0x0381;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x0372, code lost:
        r10.zzw(r0.zzN);
        r10.zzT(r0.zzP);
        r10.zzN(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x0385, code lost:
        if (com.google.android.gms.internal.ads.zzbo.zzh(r8) == false) goto L_0x0519;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x0389, code lost:
        if (r0.zzp != 0) goto L_0x039b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x038b, code lost:
        r6 = r0.zzn;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x038d, code lost:
        if (r6 != -1) goto L_0x0391;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x038f, code lost:
        r6 = r0.zzl;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x0391, code lost:
        r0.zzn = r6;
        r6 = r0.zzo;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x0395, code lost:
        if (r6 != -1) goto L_0x0399;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x0397, code lost:
        r6 = r0.zzm;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x0399, code lost:
        r0.zzo = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x039b, code lost:
        r6 = r0.zzn;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x039f, code lost:
        if (r6 == -1) goto L_0x03b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x03a1, code lost:
        r9 = r0.zzo;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x03a3, code lost:
        if (r9 == -1) goto L_0x03b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x03a5, code lost:
        r6 = ((float) (r0.zzm * r6)) / ((float) (r0.zzl * r9));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x03b1, code lost:
        r6 = -1.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x03b5, code lost:
        if (r0.zzw == false) goto L_0x0487;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x03bb, code lost:
        if (r0.zzC == -1.0f) goto L_0x0479;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x03c1, code lost:
        if (r0.zzD == -1.0f) goto L_0x0479;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x03c7, code lost:
        if (r0.zzE == -1.0f) goto L_0x0479;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x03cd, code lost:
        if (r0.zzF == -1.0f) goto L_0x0479;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x03d3, code lost:
        if (r0.zzG == -1.0f) goto L_0x0479;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x03d9, code lost:
        if (r0.zzH == -1.0f) goto L_0x0479;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x03df, code lost:
        if (r0.zzI == -1.0f) goto L_0x0479;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x03e5, code lost:
        if (r0.zzJ == -1.0f) goto L_0x0479;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x03eb, code lost:
        if (r0.zzK == -1.0f) goto L_0x0479;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x03f1, code lost:
        if (r0.zzL != -1.0f) goto L_0x03f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x03f5, code lost:
        r3 = new byte[25];
        r7 = java.nio.ByteBuffer.wrap(r3).order(java.nio.ByteOrder.LITTLE_ENDIAN);
        r7.put((byte) 0);
        r7.putShort((short) ((int) ((r0.zzC * 50000.0f) + 0.5f)));
        r7.putShort((short) ((int) ((r0.zzD * 50000.0f) + 0.5f)));
        r7.putShort((short) ((int) ((r0.zzE * 50000.0f) + 0.5f)));
        r7.putShort((short) ((int) ((r0.zzF * 50000.0f) + 0.5f)));
        r7.putShort((short) ((int) ((r0.zzG * 50000.0f) + 0.5f)));
        r7.putShort((short) ((int) ((r0.zzH * 50000.0f) + 0.5f)));
        r7.putShort((short) ((int) ((r0.zzI * 50000.0f) + 0.5f)));
        r7.putShort((short) ((int) ((r0.zzJ * 50000.0f) + 0.5f)));
        r7.putShort((short) ((int) (r0.zzK + 0.5f)));
        r7.putShort((short) ((int) (r0.zzL + 0.5f)));
        r7.putShort((short) r0.zzA);
        r7.putShort((short) r0.zzB);
        r3 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x047a, code lost:
        r3 = new com.google.android.gms.internal.ads.zzo(r0.zzx, r0.zzz, r0.zzy, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x048a, code lost:
        if (r0.zza == null) goto L_0x04a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x0496, code lost:
        if (com.google.android.gms.internal.ads.zzadh.zzg.containsKey(r0.zza) == false) goto L_0x04a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x0498, code lost:
        r12 = ((java.lang.Integer) com.google.android.gms.internal.ads.zzadh.zzg.get(r0.zza)).intValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x04aa, code lost:
        if (r0.zzq != 0) goto L_0x04f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x04b3, code lost:
        if (java.lang.Float.compare(r0.zzr, com.google.android.gms.maps.model.BitmapDescriptorFactory.HUE_RED) != 0) goto L_0x04f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x04bb, code lost:
        if (java.lang.Float.compare(r0.zzs, com.google.android.gms.maps.model.BitmapDescriptorFactory.HUE_RED) != 0) goto L_0x04f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x04c3, code lost:
        if (java.lang.Float.compare(r0.zzt, com.google.android.gms.maps.model.BitmapDescriptorFactory.HUE_RED) != 0) goto L_0x04c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x04c5, code lost:
        r7 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x04cf, code lost:
        if (java.lang.Float.compare(r0.zzs, 90.0f) != 0) goto L_0x04d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x04d1, code lost:
        r7 = 90;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x04dc, code lost:
        if (java.lang.Float.compare(r0.zzs, -180.0f) == 0) goto L_0x04f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x04e6, code lost:
        if (java.lang.Float.compare(r0.zzs, 180.0f) != 0) goto L_0x04e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x04f1, code lost:
        if (java.lang.Float.compare(r0.zzs, -90.0f) != 0) goto L_0x04f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x04f3, code lost:
        r7 = 270;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x04f6, code lost:
        r7 = 180;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x04f9, code lost:
        r7 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x04fa, code lost:
        r10.zzX(r0.zzl);
        r10.zzF(r0.zzm);
        r10.zzP(r6);
        r10.zzR(r7);
        r10.zzQ(r0.zzu);
        r10.zzV(r0.zzv);
        r10.zzy(r3);
        r6 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x051d, code lost:
        if ("application/x-subrip".equals(r8) != false) goto L_0x0549;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x0523, code lost:
        if ("text/x-ssa".equals(r8) != false) goto L_0x0549;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x0529, code lost:
        if ("text/vtt".equals(r8) != false) goto L_0x0549;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x052f, code lost:
        if ("application/vobsub".equals(r8) != false) goto L_0x0549;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x0537, code lost:
        if ("application/pgs".equals(r8) != false) goto L_0x0549;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x053f, code lost:
        if ("application/dvbsubs".equals(r8) == false) goto L_0x0542;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x0548, code lost:
        throw com.google.android.gms.internal.ads.zzbp.zza("Unexpected MIME type.", (java.lang.Throwable) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x0549, code lost:
        r6 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x054c, code lost:
        if (r0.zza == null) goto L_0x055f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x0558, code lost:
        if (com.google.android.gms.internal.ads.zzadh.zzg.containsKey(r0.zza) != false) goto L_0x055f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x055a, code lost:
        r10.zzJ(r0.zza);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:261:0x055f, code lost:
        r10.zzG(r22);
        r10.zzS(r8);
        r10.zzL(r4);
        r10.zzK(r0.zzY);
        r10.zzU(r5);
        r10.zzI(r1);
        r10.zzx(r2);
        r10.zzB(r0.zzk);
        r1 = r10.zzY();
        r2 = r21.zzv(r0.zzc, r6);
        r0.zzV = r2;
        r2.zzk(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:262:0x058e, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zze(com.google.android.gms.internal.ads.zzyv r21, int r22) throws com.google.android.gms.internal.ads.zzbp {
        /*
            r20 = this;
            r0 = r20
            java.lang.String r1 = r0.zzb
            int r2 = r1.hashCode()
            r4 = 16
            r5 = 32
            r6 = 1
            r8 = 8
            r9 = 4
            r10 = 0
            r11 = 3
            r12 = -1
            switch(r2) {
                case -2095576542: goto L_0x0189;
                case -2095575984: goto L_0x017f;
                case -1985379776: goto L_0x0174;
                case -1784763192: goto L_0x0169;
                case -1730367663: goto L_0x015e;
                case -1482641358: goto L_0x0153;
                case -1482641357: goto L_0x0148;
                case -1373388978: goto L_0x013d;
                case -933872740: goto L_0x0132;
                case -538363189: goto L_0x0127;
                case -538363109: goto L_0x011c;
                case -425012669: goto L_0x0110;
                case -356037306: goto L_0x0104;
                case 62923557: goto L_0x00f8;
                case 62923603: goto L_0x00ec;
                case 62927045: goto L_0x00e0;
                case 82318131: goto L_0x00d5;
                case 82338133: goto L_0x00ca;
                case 82338134: goto L_0x00bf;
                case 99146302: goto L_0x00b3;
                case 444813526: goto L_0x00a7;
                case 542569478: goto L_0x009b;
                case 635596514: goto L_0x008f;
                case 725948237: goto L_0x0083;
                case 725957860: goto L_0x0077;
                case 738597099: goto L_0x006b;
                case 855502857: goto L_0x005f;
                case 1045209816: goto L_0x0053;
                case 1422270023: goto L_0x0047;
                case 1809237540: goto L_0x003c;
                case 1950749482: goto L_0x0030;
                case 1950789798: goto L_0x0024;
                case 1951062397: goto L_0x0018;
                default: goto L_0x0016;
            }
        L_0x0016:
            goto L_0x0193
        L_0x0018:
            java.lang.String r2 = "A_OPUS"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0193
            r2 = 12
            goto L_0x0194
        L_0x0024:
            java.lang.String r2 = "A_FLAC"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0193
            r2 = 22
            goto L_0x0194
        L_0x0030:
            java.lang.String r2 = "A_EAC3"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0193
            r2 = 17
            goto L_0x0194
        L_0x003c:
            java.lang.String r2 = "V_MPEG2"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0193
            r2 = 3
            goto L_0x0194
        L_0x0047:
            java.lang.String r2 = "S_TEXT/UTF8"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0193
            r2 = 27
            goto L_0x0194
        L_0x0053:
            java.lang.String r2 = "S_TEXT/WEBVTT"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0193
            r2 = 29
            goto L_0x0194
        L_0x005f:
            java.lang.String r2 = "V_MPEGH/ISO/HEVC"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0193
            r2 = 8
            goto L_0x0194
        L_0x006b:
            java.lang.String r2 = "S_TEXT/ASS"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0193
            r2 = 28
            goto L_0x0194
        L_0x0077:
            java.lang.String r2 = "A_PCM/INT/LIT"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0193
            r2 = 24
            goto L_0x0194
        L_0x0083:
            java.lang.String r2 = "A_PCM/INT/BIG"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0193
            r2 = 25
            goto L_0x0194
        L_0x008f:
            java.lang.String r2 = "A_PCM/FLOAT/IEEE"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0193
            r2 = 26
            goto L_0x0194
        L_0x009b:
            java.lang.String r2 = "A_DTS/EXPRESS"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0193
            r2 = 20
            goto L_0x0194
        L_0x00a7:
            java.lang.String r2 = "V_THEORA"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0193
            r2 = 10
            goto L_0x0194
        L_0x00b3:
            java.lang.String r2 = "S_HDMV/PGS"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0193
            r2 = 31
            goto L_0x0194
        L_0x00bf:
            java.lang.String r2 = "V_VP9"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0193
            r2 = 1
            goto L_0x0194
        L_0x00ca:
            java.lang.String r2 = "V_VP8"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0193
            r2 = 0
            goto L_0x0194
        L_0x00d5:
            java.lang.String r2 = "V_AV1"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0193
            r2 = 2
            goto L_0x0194
        L_0x00e0:
            java.lang.String r2 = "A_DTS"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0193
            r2 = 19
            goto L_0x0194
        L_0x00ec:
            java.lang.String r2 = "A_AC3"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0193
            r2 = 16
            goto L_0x0194
        L_0x00f8:
            java.lang.String r2 = "A_AAC"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0193
            r2 = 13
            goto L_0x0194
        L_0x0104:
            java.lang.String r2 = "A_DTS/LOSSLESS"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0193
            r2 = 21
            goto L_0x0194
        L_0x0110:
            java.lang.String r2 = "S_VOBSUB"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0193
            r2 = 30
            goto L_0x0194
        L_0x011c:
            java.lang.String r2 = "V_MPEG4/ISO/AVC"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0193
            r2 = 7
            goto L_0x0194
        L_0x0127:
            java.lang.String r2 = "V_MPEG4/ISO/ASP"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0193
            r2 = 5
            goto L_0x0194
        L_0x0132:
            java.lang.String r2 = "S_DVBSUB"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0193
            r2 = 32
            goto L_0x0194
        L_0x013d:
            java.lang.String r2 = "V_MS/VFW/FOURCC"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0193
            r2 = 9
            goto L_0x0194
        L_0x0148:
            java.lang.String r2 = "A_MPEG/L3"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0193
            r2 = 15
            goto L_0x0194
        L_0x0153:
            java.lang.String r2 = "A_MPEG/L2"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0193
            r2 = 14
            goto L_0x0194
        L_0x015e:
            java.lang.String r2 = "A_VORBIS"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0193
            r2 = 11
            goto L_0x0194
        L_0x0169:
            java.lang.String r2 = "A_TRUEHD"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0193
            r2 = 18
            goto L_0x0194
        L_0x0174:
            java.lang.String r2 = "A_MS/ACM"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0193
            r2 = 23
            goto L_0x0194
        L_0x017f:
            java.lang.String r2 = "V_MPEG4/ISO/SP"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0193
            r2 = 4
            goto L_0x0194
        L_0x0189:
            java.lang.String r2 = "V_MPEG4/ISO/AP"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0193
            r2 = 6
            goto L_0x0194
        L_0x0193:
            r2 = -1
        L_0x0194:
            java.lang.String r13 = "application/vobsub"
            java.lang.String r14 = "text/vtt"
            java.lang.String r15 = "text/x-ssa"
            java.lang.String r7 = "application/x-subrip"
            r16 = 4096(0x1000, float:5.74E-42)
            java.lang.String r17 = "audio/raw"
            java.lang.String r18 = "audio/x-unknown"
            r3 = 0
            switch(r2) {
                case 0: goto L_0x0342;
                case 1: goto L_0x033f;
                case 2: goto L_0x033c;
                case 3: goto L_0x0339;
                case 4: goto L_0x032c;
                case 5: goto L_0x032c;
                case 6: goto L_0x032c;
                case 7: goto L_0x030d;
                case 8: goto L_0x02f5;
                case 9: goto L_0x02dc;
                case 10: goto L_0x02d8;
                case 11: goto L_0x02c7;
                case 12: goto L_0x0284;
                case 13: goto L_0x0268;
                case 14: goto L_0x0260;
                case 15: goto L_0x025d;
                case 16: goto L_0x0259;
                case 17: goto L_0x0255;
                case 18: goto L_0x024a;
                case 19: goto L_0x0246;
                case 20: goto L_0x0246;
                case 21: goto L_0x0242;
                case 22: goto L_0x0236;
                case 23: goto L_0x0219;
                case 24: goto L_0x020a;
                case 25: goto L_0x01f8;
                case 26: goto L_0x01ee;
                case 27: goto L_0x01e8;
                case 28: goto L_0x01d5;
                case 29: goto L_0x01cf;
                case 30: goto L_0x01c2;
                case 31: goto L_0x01be;
                case 32: goto L_0x01ad;
                default: goto L_0x01a6;
            }
        L_0x01a6:
            java.lang.String r1 = "Unrecognized codec identifier."
            com.google.android.gms.internal.ads.zzbp r1 = com.google.android.gms.internal.ads.zzbp.zza(r1, r3)
            throw r1
        L_0x01ad:
            byte[] r2 = new byte[r9]
            byte[] r1 = r0.zzi(r1)
            java.lang.System.arraycopy(r1, r10, r2, r10, r9)
            com.google.android.gms.internal.ads.zzfrh r1 = com.google.android.gms.internal.ads.zzfrh.zzp(r2)
            java.lang.String r17 = "application/dvbsubs"
            goto L_0x02f3
        L_0x01be:
            java.lang.String r17 = "application/pgs"
            goto L_0x0344
        L_0x01c2:
            byte[] r1 = r0.zzi(r1)
            com.google.android.gms.internal.ads.zzfrh r1 = com.google.android.gms.internal.ads.zzfrh.zzp(r1)
            r2 = r3
            r17 = r13
            goto L_0x0346
        L_0x01cf:
            r1 = r3
            r2 = r1
            r17 = r14
            goto L_0x0346
        L_0x01d5:
            byte[] r1 = com.google.android.gms.internal.ads.zzadh.zzc
            java.lang.String r2 = r0.zzb
            byte[] r2 = r0.zzi(r2)
            com.google.android.gms.internal.ads.zzfrh r1 = com.google.android.gms.internal.ads.zzfrh.zzq(r1, r2)
            r2 = r3
            r17 = r15
            goto L_0x0346
        L_0x01e8:
            r1 = r3
            r2 = r1
            r17 = r7
            goto L_0x0346
        L_0x01ee:
            int r1 = r0.zzO
            if (r1 != r5) goto L_0x0230
            r1 = r3
            r2 = r1
            r4 = -1
            r11 = 4
            goto L_0x0348
        L_0x01f8:
            int r1 = r0.zzO
            if (r1 != r8) goto L_0x01ff
            r1 = r3
            r2 = r1
            goto L_0x0216
        L_0x01ff:
            if (r1 != r4) goto L_0x0230
            r9 = 268435456(0x10000000, float:2.5243549E-29)
            r1 = r3
            r2 = r1
            r4 = -1
            r11 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x0348
        L_0x020a:
            int r1 = r0.zzO
            int r9 = com.google.android.gms.internal.ads.zzeg.zzn(r1)
            if (r9 != 0) goto L_0x0213
            goto L_0x0230
        L_0x0213:
            r1 = r3
            r2 = r1
            r11 = r9
        L_0x0216:
            r4 = -1
            goto L_0x0348
        L_0x0219:
            com.google.android.gms.internal.ads.zzdy r2 = new com.google.android.gms.internal.ads.zzdy
            byte[] r1 = r0.zzi(r1)
            r2.<init>((byte[]) r1)
            boolean r1 = zzh(r2)
            if (r1 == 0) goto L_0x0230
            int r1 = r0.zzO
            int r9 = com.google.android.gms.internal.ads.zzeg.zzn(r1)
            if (r9 != 0) goto L_0x0213
        L_0x0230:
            r1 = r3
            r2 = r1
            r17 = r18
            goto L_0x0346
        L_0x0236:
            byte[] r1 = r0.zzi(r1)
            java.util.List r1 = java.util.Collections.singletonList(r1)
            java.lang.String r17 = "audio/flac"
            goto L_0x02f3
        L_0x0242:
            java.lang.String r17 = "audio/vnd.dts.hd"
            goto L_0x0344
        L_0x0246:
            java.lang.String r17 = "audio/vnd.dts"
            goto L_0x0344
        L_0x024a:
            com.google.android.gms.internal.ads.zzaaa r1 = new com.google.android.gms.internal.ads.zzaaa
            r1.<init>()
            r0.zzS = r1
            java.lang.String r17 = "audio/true-hd"
            goto L_0x0344
        L_0x0255:
            java.lang.String r17 = "audio/eac3"
            goto L_0x0344
        L_0x0259:
            java.lang.String r17 = "audio/ac3"
            goto L_0x0344
        L_0x025d:
            java.lang.String r17 = "audio/mpeg"
            goto L_0x0262
        L_0x0260:
            java.lang.String r17 = "audio/mpeg-L2"
        L_0x0262:
            r1 = r3
            r2 = r1
            r4 = 4096(0x1000, float:5.74E-42)
            goto L_0x0347
        L_0x0268:
            byte[] r1 = r0.zzi(r1)
            java.util.List r1 = java.util.Collections.singletonList(r1)
            byte[] r2 = r0.zzj
            com.google.android.gms.internal.ads.zzxt r2 = com.google.android.gms.internal.ads.zzxu.zza(r2)
            int r4 = r2.zza
            r0.zzP = r4
            int r4 = r2.zzb
            r0.zzN = r4
            java.lang.String r2 = r2.zzc
            java.lang.String r17 = "audio/mp4a-latm"
            goto L_0x0346
        L_0x0284:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r11)
            java.lang.String r2 = r0.zzb
            byte[] r2 = r0.zzi(r2)
            r1.add(r2)
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocate(r8)
            java.nio.ByteOrder r4 = java.nio.ByteOrder.LITTLE_ENDIAN
            java.nio.ByteBuffer r2 = r2.order(r4)
            long r10 = r0.zzQ
            java.nio.ByteBuffer r2 = r2.putLong(r10)
            byte[] r2 = r2.array()
            r1.add(r2)
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocate(r8)
            java.nio.ByteBuffer r2 = r2.order(r4)
            long r10 = r0.zzR
            java.nio.ByteBuffer r2 = r2.putLong(r10)
            byte[] r2 = r2.array()
            r1.add(r2)
            r16 = 5760(0x1680, float:8.071E-42)
            java.lang.String r17 = "audio/opus"
            r2 = r3
            r4 = 5760(0x1680, float:8.071E-42)
            goto L_0x0347
        L_0x02c7:
            byte[] r1 = r0.zzi(r1)
            java.util.List r1 = zzg(r1)
            r16 = 8192(0x2000, float:1.14794E-41)
            java.lang.String r17 = "audio/vorbis"
            r2 = r3
            r4 = 8192(0x2000, float:1.14794E-41)
            goto L_0x0347
        L_0x02d8:
            java.lang.String r17 = "video/x-unknown"
            goto L_0x0344
        L_0x02dc:
            com.google.android.gms.internal.ads.zzdy r2 = new com.google.android.gms.internal.ads.zzdy
            byte[] r1 = r0.zzi(r1)
            r2.<init>((byte[]) r1)
            android.util.Pair r1 = zzf(r2)
            java.lang.Object r2 = r1.first
            r17 = r2
            java.lang.String r17 = (java.lang.String) r17
            java.lang.Object r1 = r1.second
            java.util.List r1 = (java.util.List) r1
        L_0x02f3:
            r2 = r3
            goto L_0x0346
        L_0x02f5:
            com.google.android.gms.internal.ads.zzdy r2 = new com.google.android.gms.internal.ads.zzdy
            byte[] r1 = r0.zzi(r1)
            r2.<init>((byte[]) r1)
            com.google.android.gms.internal.ads.zzzi r1 = com.google.android.gms.internal.ads.zzzi.zza(r2)
            java.util.List r2 = r1.zza
            int r4 = r1.zzb
            r0.zzW = r4
            java.lang.String r1 = r1.zzd
            java.lang.String r17 = "video/hevc"
            goto L_0x0324
        L_0x030d:
            com.google.android.gms.internal.ads.zzdy r2 = new com.google.android.gms.internal.ads.zzdy
            byte[] r1 = r0.zzi(r1)
            r2.<init>((byte[]) r1)
            com.google.android.gms.internal.ads.zzyb r1 = com.google.android.gms.internal.ads.zzyb.zza(r2)
            java.util.List r2 = r1.zza
            int r4 = r1.zzb
            r0.zzW = r4
            java.lang.String r1 = r1.zzf
            java.lang.String r17 = "video/avc"
        L_0x0324:
            r4 = -1
            r11 = -1
            r19 = r2
            r2 = r1
            r1 = r19
            goto L_0x0348
        L_0x032c:
            byte[] r1 = r0.zzj
            if (r1 != 0) goto L_0x0332
            r1 = r3
            goto L_0x0336
        L_0x0332:
            java.util.List r1 = java.util.Collections.singletonList(r1)
        L_0x0336:
            java.lang.String r17 = "video/mp4v-es"
            goto L_0x02f3
        L_0x0339:
            java.lang.String r17 = "video/mpeg2"
            goto L_0x0344
        L_0x033c:
            java.lang.String r17 = "video/av01"
            goto L_0x0344
        L_0x033f:
            java.lang.String r17 = "video/x-vnd.on2.vp9"
            goto L_0x0344
        L_0x0342:
            java.lang.String r17 = "video/x-vnd.on2.vp8"
        L_0x0344:
            r1 = r3
            r2 = r1
        L_0x0346:
            r4 = -1
        L_0x0347:
            r11 = -1
        L_0x0348:
            byte[] r8 = r0.zzM
            if (r8 == 0) goto L_0x035b
            com.google.android.gms.internal.ads.zzdy r10 = new com.google.android.gms.internal.ads.zzdy
            r10.<init>((byte[]) r8)
            com.google.android.gms.internal.ads.zzyp r8 = com.google.android.gms.internal.ads.zzyp.zza(r10)
            if (r8 == 0) goto L_0x035b
            java.lang.String r2 = r8.zza
            java.lang.String r17 = "video/dolby-vision"
        L_0x035b:
            r8 = r17
            boolean r10 = r0.zzU
            boolean r5 = r0.zzT
            if (r6 == r5) goto L_0x0365
            r5 = 0
            goto L_0x0366
        L_0x0365:
            r5 = 2
        L_0x0366:
            r5 = r5 | r10
            com.google.android.gms.internal.ads.zzab r10 = new com.google.android.gms.internal.ads.zzab
            r10.<init>()
            boolean r17 = com.google.android.gms.internal.ads.zzbo.zzg(r8)
            if (r17 == 0) goto L_0x0381
            int r3 = r0.zzN
            r10.zzw(r3)
            int r3 = r0.zzP
            r10.zzT(r3)
            r10.zzN(r11)
            goto L_0x054a
        L_0x0381:
            boolean r6 = com.google.android.gms.internal.ads.zzbo.zzh(r8)
            if (r6 == 0) goto L_0x0519
            int r6 = r0.zzp
            if (r6 != 0) goto L_0x039b
            int r6 = r0.zzn
            if (r6 != r12) goto L_0x0391
            int r6 = r0.zzl
        L_0x0391:
            r0.zzn = r6
            int r6 = r0.zzo
            if (r6 != r12) goto L_0x0399
            int r6 = r0.zzm
        L_0x0399:
            r0.zzo = r6
        L_0x039b:
            int r6 = r0.zzn
            r7 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r6 == r12) goto L_0x03b1
            int r9 = r0.zzo
            if (r9 == r12) goto L_0x03b1
            int r11 = r0.zzm
            int r11 = r11 * r6
            float r6 = (float) r11
            int r11 = r0.zzl
            int r11 = r11 * r9
            float r9 = (float) r11
            float r6 = r6 / r9
            goto L_0x03b3
        L_0x03b1:
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
        L_0x03b3:
            boolean r9 = r0.zzw
            if (r9 == 0) goto L_0x0487
            float r9 = r0.zzC
            int r9 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r9 == 0) goto L_0x0479
            float r9 = r0.zzD
            int r9 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r9 == 0) goto L_0x0479
            float r9 = r0.zzE
            int r9 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r9 == 0) goto L_0x0479
            float r9 = r0.zzF
            int r9 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r9 == 0) goto L_0x0479
            float r9 = r0.zzG
            int r9 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r9 == 0) goto L_0x0479
            float r9 = r0.zzH
            int r9 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r9 == 0) goto L_0x0479
            float r9 = r0.zzI
            int r9 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r9 == 0) goto L_0x0479
            float r9 = r0.zzJ
            int r9 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r9 == 0) goto L_0x0479
            float r9 = r0.zzK
            int r9 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r9 == 0) goto L_0x0479
            float r9 = r0.zzL
            int r7 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r7 != 0) goto L_0x03f5
            goto L_0x0479
        L_0x03f5:
            r3 = 25
            byte[] r3 = new byte[r3]
            java.nio.ByteBuffer r7 = java.nio.ByteBuffer.wrap(r3)
            java.nio.ByteOrder r9 = java.nio.ByteOrder.LITTLE_ENDIAN
            java.nio.ByteBuffer r7 = r7.order(r9)
            r9 = 0
            r7.put(r9)
            float r11 = r0.zzC
            r13 = 1195593728(0x47435000, float:50000.0)
            float r11 = r11 * r13
            r14 = 1056964608(0x3f000000, float:0.5)
            float r11 = r11 + r14
            int r11 = (int) r11
            short r11 = (short) r11
            r7.putShort(r11)
            float r11 = r0.zzD
            float r11 = r11 * r13
            float r11 = r11 + r14
            int r11 = (int) r11
            short r11 = (short) r11
            r7.putShort(r11)
            float r11 = r0.zzE
            float r11 = r11 * r13
            float r11 = r11 + r14
            int r11 = (int) r11
            short r11 = (short) r11
            r7.putShort(r11)
            float r11 = r0.zzF
            float r11 = r11 * r13
            float r11 = r11 + r14
            int r11 = (int) r11
            short r11 = (short) r11
            r7.putShort(r11)
            float r11 = r0.zzG
            float r11 = r11 * r13
            float r11 = r11 + r14
            int r11 = (int) r11
            short r11 = (short) r11
            r7.putShort(r11)
            float r11 = r0.zzH
            float r11 = r11 * r13
            float r11 = r11 + r14
            int r11 = (int) r11
            short r11 = (short) r11
            r7.putShort(r11)
            float r11 = r0.zzI
            float r11 = r11 * r13
            float r11 = r11 + r14
            int r11 = (int) r11
            short r11 = (short) r11
            r7.putShort(r11)
            float r11 = r0.zzJ
            float r11 = r11 * r13
            float r11 = r11 + r14
            int r11 = (int) r11
            short r11 = (short) r11
            r7.putShort(r11)
            float r11 = r0.zzK
            float r11 = r11 + r14
            int r11 = (int) r11
            short r11 = (short) r11
            r7.putShort(r11)
            float r11 = r0.zzL
            float r11 = r11 + r14
            int r11 = (int) r11
            short r11 = (short) r11
            r7.putShort(r11)
            int r11 = r0.zzA
            short r11 = (short) r11
            r7.putShort(r11)
            int r11 = r0.zzB
            short r11 = (short) r11
            r7.putShort(r11)
            goto L_0x047a
        L_0x0479:
            r9 = 0
        L_0x047a:
            com.google.android.gms.internal.ads.zzo r7 = new com.google.android.gms.internal.ads.zzo
            int r11 = r0.zzx
            int r13 = r0.zzz
            int r14 = r0.zzy
            r7.<init>(r11, r13, r14, r3)
            r3 = r7
            goto L_0x0488
        L_0x0487:
            r9 = 0
        L_0x0488:
            java.lang.String r7 = r0.zza
            if (r7 == 0) goto L_0x04a8
            java.util.Map r7 = com.google.android.gms.internal.ads.zzadh.zzg
            java.lang.String r11 = r0.zza
            boolean r7 = r7.containsKey(r11)
            if (r7 == 0) goto L_0x04a8
            java.util.Map r7 = com.google.android.gms.internal.ads.zzadh.zzg
            java.lang.String r11 = r0.zza
            java.lang.Object r7 = r7.get(r11)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r12 = r7.intValue()
        L_0x04a8:
            int r7 = r0.zzq
            if (r7 != 0) goto L_0x04f9
            float r7 = r0.zzr
            r11 = 0
            int r7 = java.lang.Float.compare(r7, r11)
            if (r7 != 0) goto L_0x04f9
            float r7 = r0.zzs
            int r7 = java.lang.Float.compare(r7, r11)
            if (r7 != 0) goto L_0x04f9
            float r7 = r0.zzt
            int r7 = java.lang.Float.compare(r7, r11)
            if (r7 != 0) goto L_0x04c7
            r7 = 0
            goto L_0x04fa
        L_0x04c7:
            float r7 = r0.zzs
            r9 = 1119092736(0x42b40000, float:90.0)
            int r7 = java.lang.Float.compare(r7, r9)
            if (r7 != 0) goto L_0x04d4
            r7 = 90
            goto L_0x04fa
        L_0x04d4:
            float r7 = r0.zzs
            r9 = -1020002304(0xffffffffc3340000, float:-180.0)
            int r7 = java.lang.Float.compare(r7, r9)
            if (r7 == 0) goto L_0x04f6
            float r7 = r0.zzs
            r9 = 1127481344(0x43340000, float:180.0)
            int r7 = java.lang.Float.compare(r7, r9)
            if (r7 != 0) goto L_0x04e9
            goto L_0x04f6
        L_0x04e9:
            float r7 = r0.zzs
            r9 = -1028390912(0xffffffffc2b40000, float:-90.0)
            int r7 = java.lang.Float.compare(r7, r9)
            if (r7 != 0) goto L_0x04f9
            r7 = 270(0x10e, float:3.78E-43)
            goto L_0x04fa
        L_0x04f6:
            r7 = 180(0xb4, float:2.52E-43)
            goto L_0x04fa
        L_0x04f9:
            r7 = r12
        L_0x04fa:
            int r9 = r0.zzl
            r10.zzX(r9)
            int r9 = r0.zzm
            r10.zzF(r9)
            r10.zzP(r6)
            r10.zzR(r7)
            byte[] r6 = r0.zzu
            r10.zzQ(r6)
            int r6 = r0.zzv
            r10.zzV(r6)
            r10.zzy(r3)
            r6 = 2
            goto L_0x054a
        L_0x0519:
            boolean r6 = r7.equals(r8)
            if (r6 != 0) goto L_0x0549
            boolean r6 = r15.equals(r8)
            if (r6 != 0) goto L_0x0549
            boolean r6 = r14.equals(r8)
            if (r6 != 0) goto L_0x0549
            boolean r6 = r13.equals(r8)
            if (r6 != 0) goto L_0x0549
            java.lang.String r6 = "application/pgs"
            boolean r6 = r6.equals(r8)
            if (r6 != 0) goto L_0x0549
            java.lang.String r6 = "application/dvbsubs"
            boolean r6 = r6.equals(r8)
            if (r6 == 0) goto L_0x0542
            goto L_0x0549
        L_0x0542:
            java.lang.String r1 = "Unexpected MIME type."
            com.google.android.gms.internal.ads.zzbp r1 = com.google.android.gms.internal.ads.zzbp.zza(r1, r3)
            throw r1
        L_0x0549:
            r6 = 3
        L_0x054a:
            java.lang.String r3 = r0.zza
            if (r3 == 0) goto L_0x055f
            java.util.Map r3 = com.google.android.gms.internal.ads.zzadh.zzg
            java.lang.String r7 = r0.zza
            boolean r3 = r3.containsKey(r7)
            if (r3 != 0) goto L_0x055f
            java.lang.String r3 = r0.zza
            r10.zzJ(r3)
        L_0x055f:
            r3 = r22
            r10.zzG(r3)
            r10.zzS(r8)
            r10.zzL(r4)
            java.lang.String r3 = r0.zzY
            r10.zzK(r3)
            r10.zzU(r5)
            r10.zzI(r1)
            r10.zzx(r2)
            com.google.android.gms.internal.ads.zzv r1 = r0.zzk
            r10.zzB(r1)
            com.google.android.gms.internal.ads.zzad r1 = r10.zzY()
            int r2 = r0.zzc
            r3 = r21
            com.google.android.gms.internal.ads.zzzz r2 = r3.zzv(r2, r6)
            r0.zzV = r2
            r2.zzk(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzadg.zze(com.google.android.gms.internal.ads.zzyv, int):void");
    }
}
