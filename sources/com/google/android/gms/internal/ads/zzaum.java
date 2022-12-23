package com.google.android.gms.internal.ads;

import com.appboy.support.ValidationUtils;
import com.google.android.gms.nearby.connection.ConnectionsStatusCodes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

final class zzaum {
    public float zzA = -1.0f;
    public float zzB = -1.0f;
    public float zzC = -1.0f;
    public float zzD = -1.0f;
    public float zzE = -1.0f;
    public float zzF = -1.0f;
    public int zzG = 1;
    public int zzH = -1;
    public int zzI = ConnectionsStatusCodes.STATUS_NETWORK_NOT_CONNECTED;
    public long zzJ = 0;
    public long zzK = 0;
    public boolean zzL;
    public boolean zzM = true;
    public zzaue zzN;
    public int zzO;
    /* access modifiers changed from: private */
    public String zzP = "eng";
    public String zza;
    public int zzb;
    public int zzc;
    public int zzd;
    public boolean zze;
    public byte[] zzf;
    public zzaud zzg;
    public byte[] zzh;
    public zzatr zzi;
    public int zzj = -1;
    public int zzk = -1;
    public int zzl = -1;
    public int zzm = -1;
    public int zzn = 0;
    public byte[] zzo = null;
    public int zzp = -1;
    public boolean zzq = false;
    public int zzr = -1;
    public int zzs = -1;
    public int zzt = -1;
    public int zzu = 1000;
    public int zzv = 200;
    public float zzw = -1.0f;
    public float zzx = -1.0f;
    public float zzy = -1.0f;
    public float zzz = -1.0f;

    private zzaum() {
    }

    public /* synthetic */ zzaum(zzaul zzaul) {
    }

    private static List zzc(zzazg zzazg) throws zzarv {
        try {
            zzazg.zzw(16);
            if (zzazg.zzk() != 826496599) {
                return null;
            }
            int zzc2 = zzazg.zzc() + 20;
            byte[] bArr = zzazg.zza;
            while (true) {
                int length = bArr.length;
                if (zzc2 >= length - 4) {
                    throw new zzarv("Failed to find FourCC VC1 initialization data");
                } else if (bArr[zzc2] == 0 && bArr[zzc2 + 1] == 0 && bArr[zzc2 + 2] == 1 && bArr[zzc2 + 3] == 15) {
                    return Collections.singletonList(Arrays.copyOfRange(bArr, zzc2, length));
                } else {
                    zzc2++;
                }
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new zzarv("Error parsing FourCC VC1 codec private");
        }
    }

    private static List zzd(byte[] bArr) throws zzarv {
        byte b;
        byte b2;
        try {
            if (bArr[0] == 2) {
                int i = 1;
                int i2 = 0;
                while (true) {
                    b = bArr[i];
                    if (b != -1) {
                        break;
                    }
                    i2 += ValidationUtils.APPBOY_STRING_MAX_LENGTH;
                    i++;
                }
                int i3 = i + 1;
                int i4 = i2 + b;
                int i5 = 0;
                while (true) {
                    b2 = bArr[i3];
                    if (b2 != -1) {
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
                        throw new zzarv("Error parsing vorbis codec private");
                    }
                    throw new zzarv("Error parsing vorbis codec private");
                }
                throw new zzarv("Error parsing vorbis codec private");
            }
            throw new zzarv("Error parsing vorbis codec private");
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new zzarv("Error parsing vorbis codec private");
        }
    }

    private static boolean zze(zzazg zzazg) throws zzarv {
        try {
            int zzf2 = zzazg.zzf();
            if (zzf2 == 1) {
                return true;
            }
            if (zzf2 == 65534) {
                zzazg.zzv(24);
                if (zzazg.zzl() == zzaun.zzd.getMostSignificantBits() && zzazg.zzl() == zzaun.zzd.getLeastSignificantBits()) {
                    return true;
                }
                return false;
            }
            return false;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new zzarv("Error parsing MS/ACM codec private");
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x01c0, code lost:
        if (r1 != 0) goto L_0x01a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x01c2, code lost:
        r2 = "audio/x-unknown";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x01e9, code lost:
        r1 = null;
        r26 = -1;
        r31 = 4096;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0290, code lost:
        r26 = -1;
        r31 = -1;
        r42 = r2;
        r2 = r1;
        r1 = r42;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x02b0, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x02b2, code lost:
        r26 = -1;
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x02b4, code lost:
        r31 = -1;
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x02b6, code lost:
        r5 = r0.zzM;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x02ba, code lost:
        if (true == r0.zzL) goto L_0x02be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x02bc, code lost:
        r8 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x02be, code lost:
        r8 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x02bf, code lost:
        r5 = r5 | r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x02c4, code lost:
        if (com.google.android.gms.internal.ads.zzazd.zza(r2) == false) goto L_0x02f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x02c6, code lost:
        r1 = com.google.android.gms.internal.ads.zzars.zzh(java.lang.Integer.toString(r45), r2, (java.lang.String) null, -1, r31, r0.zzG, r0.zzI, r26, -1, -1, r1, r0.zzi, r5 ? 1 : 0, r0.zzP, (com.google.android.gms.internal.ads.zzawd) null);
        r6 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x02f7, code lost:
        if (com.google.android.gms.internal.ads.zzazd.zzb(r2) == false) goto L_0x0420;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x02fb, code lost:
        if (r0.zzn != 0) goto L_0x030d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x02fd, code lost:
        r5 = r0.zzl;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x02ff, code lost:
        if (r5 != -1) goto L_0x0303;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0301, code lost:
        r5 = r0.zzj;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x0303, code lost:
        r0.zzl = r5;
        r5 = r0.zzm;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0307, code lost:
        if (r5 != -1) goto L_0x030b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0309, code lost:
        r5 = r0.zzk;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x030b, code lost:
        r0.zzm = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x030d, code lost:
        r5 = r0.zzl;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0311, code lost:
        if (r5 == -1) goto L_0x0325;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0313, code lost:
        r8 = r0.zzm;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x0315, code lost:
        if (r8 == -1) goto L_0x0325;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0317, code lost:
        r37 = ((float) (r0.zzk * r5)) / ((float) (r0.zzj * r8));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0325, code lost:
        r37 = -1.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x0329, code lost:
        if (r0.zzq == false) goto L_0x03f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x032f, code lost:
        if (r0.zzw == -1.0f) goto L_0x03e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x0335, code lost:
        if (r0.zzx == -1.0f) goto L_0x03e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x033b, code lost:
        if (r0.zzy == -1.0f) goto L_0x03e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x0341, code lost:
        if (r0.zzz == -1.0f) goto L_0x03e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x0347, code lost:
        if (r0.zzA == -1.0f) goto L_0x03e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x034d, code lost:
        if (r0.zzB == -1.0f) goto L_0x03e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x0353, code lost:
        if (r0.zzC == -1.0f) goto L_0x03e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x0359, code lost:
        if (r0.zzD == -1.0f) goto L_0x03e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x035f, code lost:
        if (r0.zzE == -1.0f) goto L_0x03e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x0365, code lost:
        if (r0.zzF != -1.0f) goto L_0x0369;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x0369, code lost:
        r3 = new byte[25];
        r5 = java.nio.ByteBuffer.wrap(r3);
        r5.put((byte) 0);
        r5.putShort((short) ((int) ((r0.zzw * 50000.0f) + 0.5f)));
        r5.putShort((short) ((int) ((r0.zzx * 50000.0f) + 0.5f)));
        r5.putShort((short) ((int) ((r0.zzy * 50000.0f) + 0.5f)));
        r5.putShort((short) ((int) ((r0.zzz * 50000.0f) + 0.5f)));
        r5.putShort((short) ((int) ((r0.zzA * 50000.0f) + 0.5f)));
        r5.putShort((short) ((int) ((r0.zzB * 50000.0f) + 0.5f)));
        r5.putShort((short) ((int) ((r0.zzC * 50000.0f) + 0.5f)));
        r5.putShort((short) ((int) ((r0.zzD * 50000.0f) + 0.5f)));
        r5.putShort((short) ((int) (r0.zzE + 0.5f)));
        r5.putShort((short) ((int) (r0.zzF + 0.5f)));
        r5.putShort((short) r0.zzu);
        r5.putShort((short) r0.zzv);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x03e5, code lost:
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x03e7, code lost:
        r40 = new com.google.android.gms.internal.ads.zzazq(r0.zzr, r0.zzt, r0.zzs, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x03f5, code lost:
        r40 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x03f7, code lost:
        r1 = com.google.android.gms.internal.ads.zzars.zzl(java.lang.Integer.toString(r45), r2, (java.lang.String) null, -1, r31, r0.zzj, r0.zzk, -1.0f, r1, -1, r37, r0.zzo, r0.zzp, r40, r0.zzi);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x0424, code lost:
        if ("application/x-subrip".equals(r2) == false) goto L_0x044b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x0426, code lost:
        r1 = com.google.android.gms.internal.ads.zzars.zzk(java.lang.Integer.toString(r45), r2, (java.lang.String) null, -1, r5 ? 1 : 0, r0.zzP, -1, r0.zzi, Long.MAX_VALUE, java.util.Collections.emptyList());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x0449, code lost:
        r6 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x044f, code lost:
        if ("application/vobsub".equals(r2) != false) goto L_0x0466;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x0455, code lost:
        if ("application/pgs".equals(r2) != false) goto L_0x0466;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x045b, code lost:
        if ("application/dvbsubs".equals(r2) == false) goto L_0x045e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x0465, code lost:
        throw new com.google.android.gms.internal.ads.zzarv("Unexpected MIME type.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x0466, code lost:
        r1 = com.google.android.gms.internal.ads.zzars.zzi(java.lang.Integer.toString(r45), r2, (java.lang.String) null, -1, r1, r0.zzP, r0.zzi);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x047f, code lost:
        r2 = r44.zzbi(r0.zzb, r6);
        r0.zzN = r2;
        r2.zza(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x048c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x01a4, code lost:
        if (r1 == 0) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x01a7, code lost:
        r26 = r1;
        r1 = null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzb(com.google.android.gms.internal.ads.zzatw r44, int r45) throws com.google.android.gms.internal.ads.zzarv {
        /*
            r43 = this;
            r0 = r43
            java.lang.String r1 = r0.zza
            int r2 = r1.hashCode()
            r3 = 25
            r4 = 4
            r5 = 8
            r6 = 2
            r7 = 1
            r8 = 0
            r9 = 3
            r10 = -1
            switch(r2) {
                case -2095576542: goto L_0x014c;
                case -2095575984: goto L_0x0142;
                case -1985379776: goto L_0x0137;
                case -1784763192: goto L_0x012c;
                case -1730367663: goto L_0x0121;
                case -1482641358: goto L_0x0116;
                case -1482641357: goto L_0x010b;
                case -1373388978: goto L_0x0100;
                case -933872740: goto L_0x00f5;
                case -538363189: goto L_0x00ea;
                case -538363109: goto L_0x00df;
                case -425012669: goto L_0x00d3;
                case -356037306: goto L_0x00c7;
                case 62923557: goto L_0x00bb;
                case 62923603: goto L_0x00af;
                case 62927045: goto L_0x00a3;
                case 82338133: goto L_0x0098;
                case 82338134: goto L_0x008d;
                case 99146302: goto L_0x0081;
                case 444813526: goto L_0x0075;
                case 542569478: goto L_0x0069;
                case 725957860: goto L_0x005d;
                case 855502857: goto L_0x0052;
                case 1422270023: goto L_0x0046;
                case 1809237540: goto L_0x003b;
                case 1950749482: goto L_0x002f;
                case 1950789798: goto L_0x0023;
                case 1951062397: goto L_0x0017;
                default: goto L_0x0015;
            }
        L_0x0015:
            goto L_0x0156
        L_0x0017:
            java.lang.String r2 = "A_OPUS"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0156
            r1 = 11
            goto L_0x0157
        L_0x0023:
            java.lang.String r2 = "A_FLAC"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0156
            r1 = 21
            goto L_0x0157
        L_0x002f:
            java.lang.String r2 = "A_EAC3"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0156
            r1 = 16
            goto L_0x0157
        L_0x003b:
            java.lang.String r2 = "V_MPEG2"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0156
            r1 = 2
            goto L_0x0157
        L_0x0046:
            java.lang.String r2 = "S_TEXT/UTF8"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0156
            r1 = 24
            goto L_0x0157
        L_0x0052:
            java.lang.String r2 = "V_MPEGH/ISO/HEVC"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0156
            r1 = 7
            goto L_0x0157
        L_0x005d:
            java.lang.String r2 = "A_PCM/INT/LIT"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0156
            r1 = 23
            goto L_0x0157
        L_0x0069:
            java.lang.String r2 = "A_DTS/EXPRESS"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0156
            r1 = 19
            goto L_0x0157
        L_0x0075:
            java.lang.String r2 = "V_THEORA"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0156
            r1 = 9
            goto L_0x0157
        L_0x0081:
            java.lang.String r2 = "S_HDMV/PGS"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0156
            r1 = 26
            goto L_0x0157
        L_0x008d:
            java.lang.String r2 = "V_VP9"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0156
            r1 = 1
            goto L_0x0157
        L_0x0098:
            java.lang.String r2 = "V_VP8"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0156
            r1 = 0
            goto L_0x0157
        L_0x00a3:
            java.lang.String r2 = "A_DTS"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0156
            r1 = 18
            goto L_0x0157
        L_0x00af:
            java.lang.String r2 = "A_AC3"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0156
            r1 = 15
            goto L_0x0157
        L_0x00bb:
            java.lang.String r2 = "A_AAC"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0156
            r1 = 12
            goto L_0x0157
        L_0x00c7:
            java.lang.String r2 = "A_DTS/LOSSLESS"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0156
            r1 = 20
            goto L_0x0157
        L_0x00d3:
            java.lang.String r2 = "S_VOBSUB"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0156
            r1 = 25
            goto L_0x0157
        L_0x00df:
            java.lang.String r2 = "V_MPEG4/ISO/AVC"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0156
            r1 = 6
            goto L_0x0157
        L_0x00ea:
            java.lang.String r2 = "V_MPEG4/ISO/ASP"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0156
            r1 = 4
            goto L_0x0157
        L_0x00f5:
            java.lang.String r2 = "S_DVBSUB"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0156
            r1 = 27
            goto L_0x0157
        L_0x0100:
            java.lang.String r2 = "V_MS/VFW/FOURCC"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0156
            r1 = 8
            goto L_0x0157
        L_0x010b:
            java.lang.String r2 = "A_MPEG/L3"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0156
            r1 = 14
            goto L_0x0157
        L_0x0116:
            java.lang.String r2 = "A_MPEG/L2"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0156
            r1 = 13
            goto L_0x0157
        L_0x0121:
            java.lang.String r2 = "A_VORBIS"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0156
            r1 = 10
            goto L_0x0157
        L_0x012c:
            java.lang.String r2 = "A_TRUEHD"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0156
            r1 = 17
            goto L_0x0157
        L_0x0137:
            java.lang.String r2 = "A_MS/ACM"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0156
            r1 = 22
            goto L_0x0157
        L_0x0142:
            java.lang.String r2 = "V_MPEG4/ISO/SP"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0156
            r1 = 3
            goto L_0x0157
        L_0x014c:
            java.lang.String r2 = "V_MPEG4/ISO/AP"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0156
            r1 = 5
            goto L_0x0157
        L_0x0156:
            r1 = -1
        L_0x0157:
            java.lang.String r2 = "audio/raw"
            java.lang.String r11 = "application/dvbsubs"
            java.lang.String r12 = "application/pgs"
            java.lang.String r13 = "application/vobsub"
            java.lang.String r14 = "application/x-subrip"
            r15 = 4096(0x1000, float:5.74E-42)
            java.lang.String r16 = "video/x-unknown"
            java.lang.String r17 = "audio/x-unknown"
            r18 = 0
            switch(r1) {
                case 0: goto L_0x02ae;
                case 1: goto L_0x02ab;
                case 2: goto L_0x02a8;
                case 3: goto L_0x029a;
                case 4: goto L_0x029a;
                case 5: goto L_0x029a;
                case 6: goto L_0x027d;
                case 7: goto L_0x0269;
                case 8: goto L_0x0256;
                case 9: goto L_0x0253;
                case 10: goto L_0x0242;
                case 11: goto L_0x01fb;
                case 12: goto L_0x01f1;
                case 13: goto L_0x01e7;
                case 14: goto L_0x01e4;
                case 15: goto L_0x01e0;
                case 16: goto L_0x01dc;
                case 17: goto L_0x01d8;
                case 18: goto L_0x01d4;
                case 19: goto L_0x01d4;
                case 20: goto L_0x01d0;
                case 21: goto L_0x01c6;
                case 22: goto L_0x01ad;
                case 23: goto L_0x019e;
                case 24: goto L_0x019b;
                case 25: goto L_0x0192;
                case 26: goto L_0x018f;
                case 27: goto L_0x0174;
                default: goto L_0x016c;
            }
        L_0x016c:
            com.google.android.gms.internal.ads.zzarv r1 = new com.google.android.gms.internal.ads.zzarv
            java.lang.String r2 = "Unrecognized codec identifier."
            r1.<init>(r2)
            throw r1
        L_0x0174:
            byte[] r1 = new byte[r4]
            byte[] r2 = r0.zzh
            byte r4 = r2[r8]
            r1[r8] = r4
            byte r4 = r2[r7]
            r1[r7] = r4
            byte r4 = r2[r6]
            r1[r6] = r4
            byte r2 = r2[r9]
            r1[r9] = r2
            java.util.List r1 = java.util.Collections.singletonList(r1)
            r2 = r11
            goto L_0x02b2
        L_0x018f:
            r2 = r12
            goto L_0x02b0
        L_0x0192:
            byte[] r1 = r0.zzh
            java.util.List r1 = java.util.Collections.singletonList(r1)
            r2 = r13
            goto L_0x02b2
        L_0x019b:
            r2 = r14
            goto L_0x02b0
        L_0x019e:
            int r1 = r0.zzH
            int r1 = com.google.android.gms.internal.ads.zzazn.zzh(r1)
            if (r1 != 0) goto L_0x01a7
            goto L_0x01c2
        L_0x01a7:
            r26 = r1
            r1 = r18
            goto L_0x02b4
        L_0x01ad:
            com.google.android.gms.internal.ads.zzazg r1 = new com.google.android.gms.internal.ads.zzazg
            byte[] r4 = r0.zzh
            r1.<init>((byte[]) r4)
            boolean r1 = zze(r1)
            if (r1 == 0) goto L_0x01c2
            int r1 = r0.zzH
            int r1 = com.google.android.gms.internal.ads.zzazn.zzh(r1)
            if (r1 != 0) goto L_0x01a7
        L_0x01c2:
            r2 = r17
            goto L_0x02b0
        L_0x01c6:
            byte[] r1 = r0.zzh
            java.util.List r1 = java.util.Collections.singletonList(r1)
            java.lang.String r2 = "audio/x-flac"
            goto L_0x02b2
        L_0x01d0:
            java.lang.String r2 = "audio/vnd.dts.hd"
            goto L_0x02b0
        L_0x01d4:
            java.lang.String r2 = "audio/vnd.dts"
            goto L_0x02b0
        L_0x01d8:
            java.lang.String r2 = "audio/true-hd"
            goto L_0x02b0
        L_0x01dc:
            java.lang.String r2 = "audio/eac3"
            goto L_0x02b0
        L_0x01e0:
            java.lang.String r2 = "audio/ac3"
            goto L_0x02b0
        L_0x01e4:
            java.lang.String r2 = "audio/mpeg"
            goto L_0x01e9
        L_0x01e7:
            java.lang.String r2 = "audio/mpeg-L2"
        L_0x01e9:
            r1 = r18
            r26 = -1
            r31 = 4096(0x1000, float:5.74E-42)
            goto L_0x02b6
        L_0x01f1:
            byte[] r1 = r0.zzh
            java.util.List r1 = java.util.Collections.singletonList(r1)
            java.lang.String r2 = "audio/mp4a-latm"
            goto L_0x02b2
        L_0x01fb:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r9)
            byte[] r2 = r0.zzh
            r1.add(r2)
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocate(r5)
            java.nio.ByteOrder r4 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteBuffer r2 = r2.order(r4)
            long r8 = r0.zzJ
            java.nio.ByteBuffer r2 = r2.putLong(r8)
            byte[] r2 = r2.array()
            r1.add(r2)
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocate(r5)
            java.nio.ByteOrder r5 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteBuffer r2 = r2.order(r5)
            long r8 = r0.zzK
            java.nio.ByteBuffer r2 = r2.putLong(r8)
            byte[] r2 = r2.array()
            r1.add(r2)
            r2 = 5760(0x1680, float:8.071E-42)
            java.lang.String r5 = "audio/opus"
            r2 = r5
            r26 = -1
            r31 = 5760(0x1680, float:8.071E-42)
            goto L_0x02b6
        L_0x0242:
            byte[] r1 = r0.zzh
            java.util.List r1 = zzd(r1)
            r2 = 8192(0x2000, float:1.14794E-41)
            java.lang.String r5 = "audio/vorbis"
            r2 = r5
            r26 = -1
            r31 = 8192(0x2000, float:1.14794E-41)
            goto L_0x02b6
        L_0x0253:
            r2 = r16
            goto L_0x02b0
        L_0x0256:
            com.google.android.gms.internal.ads.zzazg r1 = new com.google.android.gms.internal.ads.zzazg
            byte[] r2 = r0.zzh
            r1.<init>((byte[]) r2)
            java.util.List r1 = zzc(r1)
            if (r1 == 0) goto L_0x0266
            java.lang.String r2 = "video/wvc1"
            goto L_0x02b2
        L_0x0266:
            r2 = r16
            goto L_0x02b2
        L_0x0269:
            com.google.android.gms.internal.ads.zzazg r1 = new com.google.android.gms.internal.ads.zzazg
            byte[] r2 = r0.zzh
            r1.<init>((byte[]) r2)
            com.google.android.gms.internal.ads.zzazu r1 = com.google.android.gms.internal.ads.zzazu.zza(r1)
            java.util.List r2 = r1.zza
            int r1 = r1.zzb
            r0.zzO = r1
            java.lang.String r1 = "video/hevc"
            goto L_0x0290
        L_0x027d:
            com.google.android.gms.internal.ads.zzazg r1 = new com.google.android.gms.internal.ads.zzazg
            byte[] r2 = r0.zzh
            r1.<init>((byte[]) r2)
            com.google.android.gms.internal.ads.zzazo r1 = com.google.android.gms.internal.ads.zzazo.zza(r1)
            java.util.List r2 = r1.zza
            int r1 = r1.zzb
            r0.zzO = r1
            java.lang.String r1 = "video/avc"
        L_0x0290:
            r26 = -1
            r31 = -1
            r42 = r2
            r2 = r1
            r1 = r42
            goto L_0x02b6
        L_0x029a:
            byte[] r1 = r0.zzh
            if (r1 != 0) goto L_0x02a1
            r1 = r18
            goto L_0x02a5
        L_0x02a1:
            java.util.List r1 = java.util.Collections.singletonList(r1)
        L_0x02a5:
            java.lang.String r2 = "video/mp4v-es"
            goto L_0x02b2
        L_0x02a8:
            java.lang.String r2 = "video/mpeg2"
            goto L_0x02b0
        L_0x02ab:
            java.lang.String r2 = "video/x-vnd.on2.vp9"
            goto L_0x02b0
        L_0x02ae:
            java.lang.String r2 = "video/x-vnd.on2.vp8"
        L_0x02b0:
            r1 = r18
        L_0x02b2:
            r26 = -1
        L_0x02b4:
            r31 = -1
        L_0x02b6:
            boolean r5 = r0.zzM
            boolean r8 = r0.zzL
            if (r7 == r8) goto L_0x02be
            r8 = 0
            goto L_0x02bf
        L_0x02be:
            r8 = 2
        L_0x02bf:
            r5 = r5 | r8
            boolean r8 = com.google.android.gms.internal.ads.zzazd.zza(r2)
            if (r8 == 0) goto L_0x02f3
            java.lang.String r19 = java.lang.Integer.toString(r45)
            r21 = 0
            r22 = -1
            int r3 = r0.zzG
            int r4 = r0.zzI
            r27 = -1
            r28 = -1
            com.google.android.gms.internal.ads.zzatr r6 = r0.zzi
            java.lang.String r8 = r0.zzP
            r33 = 0
            r20 = r2
            r23 = r31
            r24 = r3
            r25 = r4
            r29 = r1
            r30 = r6
            r31 = r5
            r32 = r8
            com.google.android.gms.internal.ads.zzars r1 = com.google.android.gms.internal.ads.zzars.zzh(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            r6 = 1
            goto L_0x047f
        L_0x02f3:
            boolean r7 = com.google.android.gms.internal.ads.zzazd.zzb(r2)
            if (r7 == 0) goto L_0x0420
            int r5 = r0.zzn
            if (r5 != 0) goto L_0x030d
            int r5 = r0.zzl
            if (r5 != r10) goto L_0x0303
            int r5 = r0.zzj
        L_0x0303:
            r0.zzl = r5
            int r5 = r0.zzm
            if (r5 != r10) goto L_0x030b
            int r5 = r0.zzk
        L_0x030b:
            r0.zzm = r5
        L_0x030d:
            int r5 = r0.zzl
            r7 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r5 == r10) goto L_0x0325
            int r8 = r0.zzm
            if (r8 == r10) goto L_0x0325
            int r9 = r0.zzk
            int r9 = r9 * r5
            float r5 = (float) r9
            int r9 = r0.zzj
            int r9 = r9 * r8
            float r8 = (float) r9
            float r5 = r5 / r8
            r37 = r5
            goto L_0x0327
        L_0x0325:
            r37 = -1082130432(0xffffffffbf800000, float:-1.0)
        L_0x0327:
            boolean r5 = r0.zzq
            if (r5 == 0) goto L_0x03f5
            float r5 = r0.zzw
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 == 0) goto L_0x03e5
            float r5 = r0.zzx
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 == 0) goto L_0x03e5
            float r5 = r0.zzy
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 == 0) goto L_0x03e5
            float r5 = r0.zzz
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 == 0) goto L_0x03e5
            float r5 = r0.zzA
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 == 0) goto L_0x03e5
            float r5 = r0.zzB
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 == 0) goto L_0x03e5
            float r5 = r0.zzC
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 == 0) goto L_0x03e5
            float r5 = r0.zzD
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 == 0) goto L_0x03e5
            float r5 = r0.zzE
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 == 0) goto L_0x03e5
            float r5 = r0.zzF
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 != 0) goto L_0x0369
            goto L_0x03e5
        L_0x0369:
            byte[] r3 = new byte[r3]
            java.nio.ByteBuffer r5 = java.nio.ByteBuffer.wrap(r3)
            r4 = 0
            r5.put(r4)
            float r4 = r0.zzw
            r7 = 1195593728(0x47435000, float:50000.0)
            float r4 = r4 * r7
            r8 = 1056964608(0x3f000000, float:0.5)
            float r4 = r4 + r8
            int r4 = (int) r4
            short r4 = (short) r4
            r5.putShort(r4)
            float r4 = r0.zzx
            float r4 = r4 * r7
            float r4 = r4 + r8
            int r4 = (int) r4
            short r4 = (short) r4
            r5.putShort(r4)
            float r4 = r0.zzy
            float r4 = r4 * r7
            float r4 = r4 + r8
            int r4 = (int) r4
            short r4 = (short) r4
            r5.putShort(r4)
            float r4 = r0.zzz
            float r4 = r4 * r7
            float r4 = r4 + r8
            int r4 = (int) r4
            short r4 = (short) r4
            r5.putShort(r4)
            float r4 = r0.zzA
            float r4 = r4 * r7
            float r4 = r4 + r8
            int r4 = (int) r4
            short r4 = (short) r4
            r5.putShort(r4)
            float r4 = r0.zzB
            float r4 = r4 * r7
            float r4 = r4 + r8
            int r4 = (int) r4
            short r4 = (short) r4
            r5.putShort(r4)
            float r4 = r0.zzC
            float r4 = r4 * r7
            float r4 = r4 + r8
            int r4 = (int) r4
            short r4 = (short) r4
            r5.putShort(r4)
            float r4 = r0.zzD
            float r4 = r4 * r7
            float r4 = r4 + r8
            int r4 = (int) r4
            short r4 = (short) r4
            r5.putShort(r4)
            float r4 = r0.zzE
            float r4 = r4 + r8
            int r4 = (int) r4
            short r4 = (short) r4
            r5.putShort(r4)
            float r4 = r0.zzF
            float r4 = r4 + r8
            int r4 = (int) r4
            short r4 = (short) r4
            r5.putShort(r4)
            int r4 = r0.zzu
            short r4 = (short) r4
            r5.putShort(r4)
            int r4 = r0.zzv
            short r4 = (short) r4
            r5.putShort(r4)
            goto L_0x03e7
        L_0x03e5:
            r3 = r18
        L_0x03e7:
            com.google.android.gms.internal.ads.zzazq r4 = new com.google.android.gms.internal.ads.zzazq
            int r5 = r0.zzr
            int r7 = r0.zzt
            int r8 = r0.zzs
            r4.<init>(r5, r7, r8, r3)
            r40 = r4
            goto L_0x03f7
        L_0x03f5:
            r40 = r18
        L_0x03f7:
            java.lang.String r27 = java.lang.Integer.toString(r45)
            r29 = 0
            r30 = -1
            int r3 = r0.zzj
            int r4 = r0.zzk
            r34 = -1082130432(0xffffffffbf800000, float:-1.0)
            r36 = -1
            byte[] r5 = r0.zzo
            int r7 = r0.zzp
            com.google.android.gms.internal.ads.zzatr r8 = r0.zzi
            r28 = r2
            r32 = r3
            r33 = r4
            r35 = r1
            r38 = r5
            r39 = r7
            r41 = r8
            com.google.android.gms.internal.ads.zzars r1 = com.google.android.gms.internal.ads.zzars.zzl(r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41)
            goto L_0x047f
        L_0x0420:
            boolean r3 = r14.equals(r2)
            if (r3 == 0) goto L_0x044b
            java.lang.String r27 = java.lang.Integer.toString(r45)
            r29 = 0
            r30 = -1
            java.lang.String r1 = r0.zzP
            r33 = -1
            com.google.android.gms.internal.ads.zzatr r3 = r0.zzi
            r35 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.util.List r37 = java.util.Collections.emptyList()
            r28 = r2
            r31 = r5
            r32 = r1
            r34 = r3
            com.google.android.gms.internal.ads.zzars r1 = com.google.android.gms.internal.ads.zzars.zzk(r27, r28, r29, r30, r31, r32, r33, r34, r35, r37)
        L_0x0449:
            r6 = 3
            goto L_0x047f
        L_0x044b:
            boolean r3 = r13.equals(r2)
            if (r3 != 0) goto L_0x0466
            boolean r3 = r12.equals(r2)
            if (r3 != 0) goto L_0x0466
            boolean r3 = r11.equals(r2)
            if (r3 == 0) goto L_0x045e
            goto L_0x0466
        L_0x045e:
            com.google.android.gms.internal.ads.zzarv r1 = new com.google.android.gms.internal.ads.zzarv
            java.lang.String r2 = "Unexpected MIME type."
            r1.<init>(r2)
            throw r1
        L_0x0466:
            java.lang.String r19 = java.lang.Integer.toString(r45)
            r21 = 0
            r22 = -1
            java.lang.String r3 = r0.zzP
            com.google.android.gms.internal.ads.zzatr r4 = r0.zzi
            r20 = r2
            r23 = r1
            r24 = r3
            r25 = r4
            com.google.android.gms.internal.ads.zzars r1 = com.google.android.gms.internal.ads.zzars.zzi(r19, r20, r21, r22, r23, r24, r25)
            goto L_0x0449
        L_0x047f:
            int r2 = r0.zzb
            r3 = r44
            com.google.android.gms.internal.ads.zzaue r2 = r3.zzbi(r2, r6)
            r0.zzN = r2
            r2.zza(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaum.zzb(com.google.android.gms.internal.ads.zzatw, int):void");
    }
}
