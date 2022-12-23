package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.HashMap;
import java.util.List;

public final class zzyo implements zzyz {
    private static final int[] zza = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 14};
    private static final zzyn zzc = new zzyn();

    private static final void zzc(int i, List list) {
        switch (i) {
            case 0:
                list.add(new zzafp());
                return;
            case 1:
                list.add(new zzafs());
                return;
            case 2:
                list.add(new zzafv(0));
                return;
            case 3:
                list.add(new zzaah(0));
                return;
            case 4:
                zzys zza2 = zzc.zza(0);
                if (zza2 != null) {
                    list.add(zza2);
                    return;
                } else {
                    list.add(new zzaan(0));
                    return;
                }
            case 5:
                list.add(new zzaaq());
                return;
            case 6:
                list.add(new zzadh(0));
                return;
            case 7:
                list.add(new zzadp(0));
                return;
            case 8:
                list.add(new zzaej(0, (zzee) null));
                list.add(new zzaeo(0));
                return;
            case 9:
                list.add(new zzafd());
                return;
            case 10:
                list.add(new zzagy());
                return;
            case 11:
                list.add(new zzahi(1, 0, 112800));
                return;
            case 12:
                list.add(new zzahu());
                return;
            case 14:
                list.add(new zzaav());
                return;
            default:
                return;
        }
    }

    public final synchronized zzys[] zza() {
        return zzb(Uri.EMPTY, new HashMap());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v70, resolved type: java.lang.String} */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x017a, code lost:
        r3 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x017c, code lost:
        r3 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x017e, code lost:
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0157, code lost:
        r3 = 65535;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0158, code lost:
        switch(r3) {
            case 0: goto L_0x017e;
            case 1: goto L_0x017e;
            case 2: goto L_0x017e;
            case 3: goto L_0x017c;
            case 4: goto L_0x017a;
            case 5: goto L_0x017a;
            case 6: goto L_0x017a;
            case 7: goto L_0x0178;
            case 8: goto L_0x0176;
            case 9: goto L_0x0174;
            case 10: goto L_0x0174;
            case 11: goto L_0x0174;
            case 12: goto L_0x0174;
            case 13: goto L_0x0174;
            case 14: goto L_0x0172;
            case 15: goto L_0x016f;
            case 16: goto L_0x016f;
            case 17: goto L_0x016f;
            case 18: goto L_0x016c;
            case 19: goto L_0x0169;
            case 20: goto L_0x0166;
            case 21: goto L_0x0163;
            case 22: goto L_0x0160;
            case 23: goto L_0x015d;
            default: goto L_0x015b;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x015d, code lost:
        r3 = 14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0160, code lost:
        r3 = 13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0163, code lost:
        r3 = 12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0166, code lost:
        r3 = 11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0169, code lost:
        r3 = 10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x016c, code lost:
        r3 = 9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x016f, code lost:
        r3 = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0172, code lost:
        r3 = 7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0174, code lost:
        r3 = 6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0176, code lost:
        r3 = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0178, code lost:
        r3 = 4;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x02da  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized com.google.android.gms.internal.ads.zzys[] zzb(android.net.Uri r19, java.util.Map r20) {
        /*
            r18 = this;
            monitor-enter(r18)
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x02f4 }
            r1 = 14
            r0.<init>(r1)     // Catch:{ all -> 0x02f4 }
            java.lang.String r2 = "Content-Type"
            r3 = r20
            java.lang.Object r2 = r3.get(r2)     // Catch:{ all -> 0x02f4 }
            java.util.List r2 = (java.util.List) r2     // Catch:{ all -> 0x02f4 }
            r3 = 0
            r4 = 0
            if (r2 == 0) goto L_0x0024
            boolean r5 = r2.isEmpty()     // Catch:{ all -> 0x02f4 }
            if (r5 == 0) goto L_0x001d
            goto L_0x0024
        L_0x001d:
            java.lang.Object r2 = r2.get(r4)     // Catch:{ all -> 0x02f4 }
            r3 = r2
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x02f4 }
        L_0x0024:
            r6 = 5
            r7 = 4
            r8 = 3
            r9 = 13
            r10 = 12
            r11 = 11
            r12 = 9
            r13 = 6
            r14 = 1
            r15 = 10
            r16 = 8
            r2 = -1
            if (r3 != 0) goto L_0x003b
        L_0x0038:
            r3 = -1
            goto L_0x017f
        L_0x003b:
            java.lang.String r3 = com.google.android.gms.internal.ads.zzbo.zze(r3)     // Catch:{ all -> 0x02f4 }
            int r17 = r3.hashCode()     // Catch:{ all -> 0x02f4 }
            switch(r17) {
                case -2123537834: goto L_0x014d;
                case -1662384011: goto L_0x0142;
                case -1662384007: goto L_0x0137;
                case -1662095187: goto L_0x012c;
                case -1606874997: goto L_0x0122;
                case -1487394660: goto L_0x0117;
                case -1248337486: goto L_0x010c;
                case -1004728940: goto L_0x0101;
                case -387023398: goto L_0x00f6;
                case -43467528: goto L_0x00ea;
                case 13915911: goto L_0x00de;
                case 187078296: goto L_0x00d3;
                case 187078297: goto L_0x00c8;
                case 187078669: goto L_0x00bd;
                case 187090232: goto L_0x00b1;
                case 187091926: goto L_0x00a5;
                case 187099443: goto L_0x0099;
                case 1331848029: goto L_0x008d;
                case 1503095341: goto L_0x0082;
                case 1504578661: goto L_0x0077;
                case 1504619009: goto L_0x006c;
                case 1504831518: goto L_0x0060;
                case 1505118770: goto L_0x0054;
                case 2039520277: goto L_0x0048;
                default: goto L_0x0046;
            }     // Catch:{ all -> 0x02f4 }
        L_0x0046:
            goto L_0x0157
        L_0x0048:
            java.lang.String r4 = "video/x-matroska"
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x02f4 }
            if (r3 == 0) goto L_0x0157
            r3 = 9
            goto L_0x0158
        L_0x0054:
            java.lang.String r4 = "audio/webm"
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x02f4 }
            if (r3 == 0) goto L_0x0157
            r3 = 12
            goto L_0x0158
        L_0x0060:
            java.lang.String r4 = "audio/mpeg"
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x02f4 }
            if (r3 == 0) goto L_0x0157
            r3 = 14
            goto L_0x0158
        L_0x006c:
            java.lang.String r4 = "audio/flac"
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x02f4 }
            if (r3 == 0) goto L_0x0157
            r3 = 7
            goto L_0x0158
        L_0x0077:
            java.lang.String r4 = "audio/eac3"
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x02f4 }
            if (r3 == 0) goto L_0x0157
            r3 = 1
            goto L_0x0158
        L_0x0082:
            java.lang.String r4 = "audio/3gpp"
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x02f4 }
            if (r3 == 0) goto L_0x0157
            r3 = 5
            goto L_0x0158
        L_0x008d:
            java.lang.String r4 = "video/mp4"
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x02f4 }
            if (r3 == 0) goto L_0x0157
            r3 = 15
            goto L_0x0158
        L_0x0099:
            java.lang.String r4 = "audio/wav"
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x02f4 }
            if (r3 == 0) goto L_0x0157
            r3 = 21
            goto L_0x0158
        L_0x00a5:
            java.lang.String r4 = "audio/ogg"
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x02f4 }
            if (r3 == 0) goto L_0x0157
            r3 = 18
            goto L_0x0158
        L_0x00b1:
            java.lang.String r4 = "audio/mp4"
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x02f4 }
            if (r3 == 0) goto L_0x0157
            r3 = 16
            goto L_0x0158
        L_0x00bd:
            java.lang.String r4 = "audio/amr"
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x02f4 }
            if (r3 == 0) goto L_0x0157
            r3 = 4
            goto L_0x0158
        L_0x00c8:
            java.lang.String r4 = "audio/ac4"
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x02f4 }
            if (r3 == 0) goto L_0x0157
            r3 = 3
            goto L_0x0158
        L_0x00d3:
            java.lang.String r4 = "audio/ac3"
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x02f4 }
            if (r3 == 0) goto L_0x0157
            r3 = 0
            goto L_0x0158
        L_0x00de:
            java.lang.String r4 = "video/x-flv"
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x02f4 }
            if (r3 == 0) goto L_0x0157
            r3 = 8
            goto L_0x0158
        L_0x00ea:
            java.lang.String r4 = "application/webm"
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x02f4 }
            if (r3 == 0) goto L_0x0157
            r3 = 13
            goto L_0x0158
        L_0x00f6:
            java.lang.String r4 = "audio/x-matroska"
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x02f4 }
            if (r3 == 0) goto L_0x0157
            r3 = 10
            goto L_0x0158
        L_0x0101:
            java.lang.String r4 = "text/vtt"
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x02f4 }
            if (r3 == 0) goto L_0x0157
            r3 = 22
            goto L_0x0158
        L_0x010c:
            java.lang.String r4 = "application/mp4"
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x02f4 }
            if (r3 == 0) goto L_0x0157
            r3 = 17
            goto L_0x0158
        L_0x0117:
            java.lang.String r4 = "image/jpeg"
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x02f4 }
            if (r3 == 0) goto L_0x0157
            r3 = 23
            goto L_0x0158
        L_0x0122:
            java.lang.String r4 = "audio/amr-wb"
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x02f4 }
            if (r3 == 0) goto L_0x0157
            r3 = 6
            goto L_0x0158
        L_0x012c:
            java.lang.String r4 = "video/webm"
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x02f4 }
            if (r3 == 0) goto L_0x0157
            r3 = 11
            goto L_0x0158
        L_0x0137:
            java.lang.String r4 = "video/mp2t"
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x02f4 }
            if (r3 == 0) goto L_0x0157
            r3 = 20
            goto L_0x0158
        L_0x0142:
            java.lang.String r4 = "video/mp2p"
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x02f4 }
            if (r3 == 0) goto L_0x0157
            r3 = 19
            goto L_0x0158
        L_0x014d:
            java.lang.String r4 = "audio/eac3-joc"
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x02f4 }
            if (r3 == 0) goto L_0x0157
            r3 = 2
            goto L_0x0158
        L_0x0157:
            r3 = -1
        L_0x0158:
            switch(r3) {
                case 0: goto L_0x017e;
                case 1: goto L_0x017e;
                case 2: goto L_0x017e;
                case 3: goto L_0x017c;
                case 4: goto L_0x017a;
                case 5: goto L_0x017a;
                case 6: goto L_0x017a;
                case 7: goto L_0x0178;
                case 8: goto L_0x0176;
                case 9: goto L_0x0174;
                case 10: goto L_0x0174;
                case 11: goto L_0x0174;
                case 12: goto L_0x0174;
                case 13: goto L_0x0174;
                case 14: goto L_0x0172;
                case 15: goto L_0x016f;
                case 16: goto L_0x016f;
                case 17: goto L_0x016f;
                case 18: goto L_0x016c;
                case 19: goto L_0x0169;
                case 20: goto L_0x0166;
                case 21: goto L_0x0163;
                case 22: goto L_0x0160;
                case 23: goto L_0x015d;
                default: goto L_0x015b;
            }     // Catch:{ all -> 0x02f4 }
        L_0x015b:
            goto L_0x0038
        L_0x015d:
            r3 = 14
            goto L_0x017f
        L_0x0160:
            r3 = 13
            goto L_0x017f
        L_0x0163:
            r3 = 12
            goto L_0x017f
        L_0x0166:
            r3 = 11
            goto L_0x017f
        L_0x0169:
            r3 = 10
            goto L_0x017f
        L_0x016c:
            r3 = 9
            goto L_0x017f
        L_0x016f:
            r3 = 8
            goto L_0x017f
        L_0x0172:
            r3 = 7
            goto L_0x017f
        L_0x0174:
            r3 = 6
            goto L_0x017f
        L_0x0176:
            r3 = 5
            goto L_0x017f
        L_0x0178:
            r3 = 4
            goto L_0x017f
        L_0x017a:
            r3 = 3
            goto L_0x017f
        L_0x017c:
            r3 = 1
            goto L_0x017f
        L_0x017e:
            r3 = 0
        L_0x017f:
            if (r3 == r2) goto L_0x0184
            zzc(r3, r0)     // Catch:{ all -> 0x02f4 }
        L_0x0184:
            java.lang.String r4 = r19.getLastPathSegment()     // Catch:{ all -> 0x02f4 }
            if (r4 != 0) goto L_0x018d
        L_0x018a:
            r15 = -1
            goto L_0x02ce
        L_0x018d:
            java.lang.String r5 = ".ac3"
            boolean r5 = r4.endsWith(r5)     // Catch:{ all -> 0x02f4 }
            if (r5 != 0) goto L_0x02cd
            java.lang.String r5 = ".ec3"
            boolean r5 = r4.endsWith(r5)     // Catch:{ all -> 0x02f4 }
            if (r5 == 0) goto L_0x019f
            goto L_0x02cd
        L_0x019f:
            java.lang.String r5 = ".ac4"
            boolean r5 = r4.endsWith(r5)     // Catch:{ all -> 0x02f4 }
            if (r5 == 0) goto L_0x01aa
            r15 = 1
            goto L_0x02ce
        L_0x01aa:
            java.lang.String r5 = ".adts"
            boolean r5 = r4.endsWith(r5)     // Catch:{ all -> 0x02f4 }
            if (r5 != 0) goto L_0x02cb
            java.lang.String r5 = ".aac"
            boolean r5 = r4.endsWith(r5)     // Catch:{ all -> 0x02f4 }
            if (r5 == 0) goto L_0x01bc
            goto L_0x02cb
        L_0x01bc:
            java.lang.String r5 = ".amr"
            boolean r5 = r4.endsWith(r5)     // Catch:{ all -> 0x02f4 }
            if (r5 == 0) goto L_0x01c7
            r15 = 3
            goto L_0x02ce
        L_0x01c7:
            java.lang.String r5 = ".flac"
            boolean r5 = r4.endsWith(r5)     // Catch:{ all -> 0x02f4 }
            if (r5 == 0) goto L_0x01d2
            r15 = 4
            goto L_0x02ce
        L_0x01d2:
            java.lang.String r5 = ".flv"
            boolean r5 = r4.endsWith(r5)     // Catch:{ all -> 0x02f4 }
            if (r5 == 0) goto L_0x01dd
            r15 = 5
            goto L_0x02ce
        L_0x01dd:
            java.lang.String r5 = ".mk"
            int r6 = r4.length()     // Catch:{ all -> 0x02f4 }
            int r6 = r6 + -4
            boolean r5 = r4.startsWith(r5, r6)     // Catch:{ all -> 0x02f4 }
            if (r5 != 0) goto L_0x02c9
            java.lang.String r5 = ".webm"
            boolean r5 = r4.endsWith(r5)     // Catch:{ all -> 0x02f4 }
            if (r5 == 0) goto L_0x01f5
            goto L_0x02c9
        L_0x01f5:
            java.lang.String r5 = ".mp3"
            boolean r5 = r4.endsWith(r5)     // Catch:{ all -> 0x02f4 }
            if (r5 == 0) goto L_0x0200
            r15 = 7
            goto L_0x02ce
        L_0x0200:
            java.lang.String r5 = ".mp4"
            boolean r5 = r4.endsWith(r5)     // Catch:{ all -> 0x02f4 }
            if (r5 != 0) goto L_0x02c6
            java.lang.String r5 = ".m4"
            int r6 = r4.length()     // Catch:{ all -> 0x02f4 }
            int r6 = r6 + -4
            boolean r5 = r4.startsWith(r5, r6)     // Catch:{ all -> 0x02f4 }
            if (r5 != 0) goto L_0x02c6
            java.lang.String r5 = ".mp4"
            int r6 = r4.length()     // Catch:{ all -> 0x02f4 }
            int r6 = r6 + -5
            boolean r5 = r4.startsWith(r5, r6)     // Catch:{ all -> 0x02f4 }
            if (r5 != 0) goto L_0x02c6
            java.lang.String r5 = ".cmf"
            int r6 = r4.length()     // Catch:{ all -> 0x02f4 }
            int r6 = r6 + -5
            boolean r5 = r4.startsWith(r5, r6)     // Catch:{ all -> 0x02f4 }
            if (r5 == 0) goto L_0x0234
            goto L_0x02c6
        L_0x0234:
            java.lang.String r5 = ".og"
            int r6 = r4.length()     // Catch:{ all -> 0x02f4 }
            int r6 = r6 + -4
            boolean r5 = r4.startsWith(r5, r6)     // Catch:{ all -> 0x02f4 }
            if (r5 != 0) goto L_0x02c3
            java.lang.String r5 = ".opus"
            boolean r5 = r4.endsWith(r5)     // Catch:{ all -> 0x02f4 }
            if (r5 == 0) goto L_0x024c
            goto L_0x02c3
        L_0x024c:
            java.lang.String r5 = ".ps"
            boolean r5 = r4.endsWith(r5)     // Catch:{ all -> 0x02f4 }
            if (r5 != 0) goto L_0x02ce
            java.lang.String r5 = ".mpeg"
            boolean r5 = r4.endsWith(r5)     // Catch:{ all -> 0x02f4 }
            if (r5 != 0) goto L_0x02ce
            java.lang.String r5 = ".mpg"
            boolean r5 = r4.endsWith(r5)     // Catch:{ all -> 0x02f4 }
            if (r5 != 0) goto L_0x02ce
            java.lang.String r5 = ".m2p"
            boolean r5 = r4.endsWith(r5)     // Catch:{ all -> 0x02f4 }
            if (r5 == 0) goto L_0x026e
            goto L_0x02ce
        L_0x026e:
            java.lang.String r5 = ".ts"
            boolean r5 = r4.endsWith(r5)     // Catch:{ all -> 0x02f4 }
            if (r5 != 0) goto L_0x02c0
            java.lang.String r5 = ".ts"
            int r6 = r4.length()     // Catch:{ all -> 0x02f4 }
            int r6 = r6 + -4
            boolean r5 = r4.startsWith(r5, r6)     // Catch:{ all -> 0x02f4 }
            if (r5 == 0) goto L_0x0285
            goto L_0x02c0
        L_0x0285:
            java.lang.String r5 = ".wav"
            boolean r5 = r4.endsWith(r5)     // Catch:{ all -> 0x02f4 }
            if (r5 != 0) goto L_0x02bd
            java.lang.String r5 = ".wave"
            boolean r5 = r4.endsWith(r5)     // Catch:{ all -> 0x02f4 }
            if (r5 == 0) goto L_0x0296
            goto L_0x02bd
        L_0x0296:
            java.lang.String r5 = ".vtt"
            boolean r5 = r4.endsWith(r5)     // Catch:{ all -> 0x02f4 }
            if (r5 != 0) goto L_0x02ba
            java.lang.String r5 = ".webvtt"
            boolean r5 = r4.endsWith(r5)     // Catch:{ all -> 0x02f4 }
            if (r5 == 0) goto L_0x02a7
            goto L_0x02ba
        L_0x02a7:
            java.lang.String r5 = ".jpg"
            boolean r5 = r4.endsWith(r5)     // Catch:{ all -> 0x02f4 }
            if (r5 != 0) goto L_0x02b7
            java.lang.String r5 = ".jpeg"
            boolean r4 = r4.endsWith(r5)     // Catch:{ all -> 0x02f4 }
            if (r4 == 0) goto L_0x018a
        L_0x02b7:
            r15 = 14
            goto L_0x02ce
        L_0x02ba:
            r15 = 13
            goto L_0x02ce
        L_0x02bd:
            r15 = 12
            goto L_0x02ce
        L_0x02c0:
            r15 = 11
            goto L_0x02ce
        L_0x02c3:
            r15 = 9
            goto L_0x02ce
        L_0x02c6:
            r15 = 8
            goto L_0x02ce
        L_0x02c9:
            r15 = 6
            goto L_0x02ce
        L_0x02cb:
            r15 = 2
            goto L_0x02ce
        L_0x02cd:
            r15 = 0
        L_0x02ce:
            if (r15 == r2) goto L_0x02d5
            if (r15 == r3) goto L_0x02d5
            zzc(r15, r0)     // Catch:{ all -> 0x02f4 }
        L_0x02d5:
            int[] r2 = zza     // Catch:{ all -> 0x02f4 }
            r4 = 0
        L_0x02d8:
            if (r4 >= r1) goto L_0x02e6
            r5 = r2[r4]     // Catch:{ all -> 0x02f4 }
            if (r5 == r3) goto L_0x02e3
            if (r5 == r15) goto L_0x02e3
            zzc(r5, r0)     // Catch:{ all -> 0x02f4 }
        L_0x02e3:
            int r4 = r4 + 1
            goto L_0x02d8
        L_0x02e6:
            int r1 = r0.size()     // Catch:{ all -> 0x02f4 }
            com.google.android.gms.internal.ads.zzys[] r1 = new com.google.android.gms.internal.ads.zzys[r1]     // Catch:{ all -> 0x02f4 }
            java.lang.Object[] r0 = r0.toArray(r1)     // Catch:{ all -> 0x02f4 }
            com.google.android.gms.internal.ads.zzys[] r0 = (com.google.android.gms.internal.ads.zzys[]) r0     // Catch:{ all -> 0x02f4 }
            monitor-exit(r18)
            return r0
        L_0x02f4:
            r0 = move-exception
            monitor-exit(r18)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzyo.zzb(android.net.Uri, java.util.Map):com.google.android.gms.internal.ads.zzys[]");
    }
}
