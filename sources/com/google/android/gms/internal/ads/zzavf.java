package com.google.android.gms.internal.ads;

final class zzavf {
    private static final int zzA = zzazn.zzg("sosn");
    private static final int zzB = zzazn.zzg("tvsh");
    private static final int zzC = zzazn.zzg("----");
    private static final String[] zzD = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Negerpunk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop"};
    private static final int zza = zzazn.zzg("nam");
    private static final int zzb = zzazn.zzg("trk");
    private static final int zzc = zzazn.zzg("cmt");
    private static final int zzd = zzazn.zzg("day");
    private static final int zze = zzazn.zzg("ART");
    private static final int zzf = zzazn.zzg("too");
    private static final int zzg = zzazn.zzg("alb");
    private static final int zzh = zzazn.zzg("com");
    private static final int zzi = zzazn.zzg("wrt");
    private static final int zzj = zzazn.zzg("lyr");
    private static final int zzk = zzazn.zzg("gen");
    private static final int zzl = zzazn.zzg("covr");
    private static final int zzm = zzazn.zzg("gnre");
    private static final int zzn = zzazn.zzg("grp");
    private static final int zzo = zzazn.zzg("disk");
    private static final int zzp = zzazn.zzg("trkn");
    private static final int zzq = zzazn.zzg("tmpo");
    private static final int zzr = zzazn.zzg("cpil");
    private static final int zzs = zzazn.zzg("aART");
    private static final int zzt = zzazn.zzg("sonm");
    private static final int zzu = zzazn.zzg("soal");
    private static final int zzv = zzazn.zzg("soar");
    private static final int zzw = zzazn.zzg("soaa");
    private static final int zzx = zzazn.zzg("soco");
    private static final int zzy = zzazn.zzg("rtng");
    private static final int zzz = zzazn.zzg("pgap");

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033 A[Catch:{ all -> 0x01af }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.ads.zzawc zza(com.google.android.gms.internal.ads.zzazg r13) {
        /*
            int r0 = r13.zzc()
            int r1 = r13.zze()
            int r1 = r1 + r0
            int r0 = r13.zze()
            int r2 = r0 >> 24
            r2 = r2 & 255(0xff, float:3.57E-43)
            java.lang.String r3 = "und"
            java.lang.String r4 = "TCON"
            r5 = 0
            r6 = 169(0xa9, float:2.37E-43)
            if (r2 == r6) goto L_0x01b2
            int r2 = zzm     // Catch:{ all -> 0x01af }
            r6 = -1
            if (r0 != r2) goto L_0x003d
            int r0 = zzb(r13)     // Catch:{ all -> 0x01af }
            if (r0 <= 0) goto L_0x0030
            java.lang.String[] r2 = zzD     // Catch:{ all -> 0x01af }
            int r3 = r2.length     // Catch:{ all -> 0x01af }
            r3 = 148(0x94, float:2.07E-43)
            if (r0 > r3) goto L_0x0030
            int r0 = r0 + r6
            r0 = r2[r0]     // Catch:{ all -> 0x01af }
            goto L_0x0031
        L_0x0030:
            r0 = r5
        L_0x0031:
            if (r0 == 0) goto L_0x0039
            com.google.android.gms.internal.ads.zzawl r2 = new com.google.android.gms.internal.ads.zzawl     // Catch:{ all -> 0x01af }
            r2.<init>(r4, r5, r0)     // Catch:{ all -> 0x01af }
            r5 = r2
        L_0x0039:
            r13.zzv(r1)
            return r5
        L_0x003d:
            int r2 = zzo     // Catch:{ all -> 0x01af }
            if (r0 != r2) goto L_0x004b
            java.lang.String r2 = "TPOS"
            com.google.android.gms.internal.ads.zzawl r0 = zzd(r0, r2, r13)     // Catch:{ all -> 0x01af }
            r13.zzv(r1)
            return r0
        L_0x004b:
            int r2 = zzp     // Catch:{ all -> 0x01af }
            if (r0 != r2) goto L_0x0059
            java.lang.String r2 = "TRCK"
            com.google.android.gms.internal.ads.zzawl r0 = zzd(r0, r2, r13)     // Catch:{ all -> 0x01af }
            r13.zzv(r1)
            return r0
        L_0x0059:
            int r2 = zzq     // Catch:{ all -> 0x01af }
            r4 = 1
            r7 = 0
            if (r0 != r2) goto L_0x0069
            java.lang.String r2 = "TBPM"
            com.google.android.gms.internal.ads.zzawj r0 = zzc(r0, r2, r13, r4, r7)     // Catch:{ all -> 0x01af }
            r13.zzv(r1)
            return r0
        L_0x0069:
            int r2 = zzr     // Catch:{ all -> 0x01af }
            if (r0 != r2) goto L_0x0077
            java.lang.String r2 = "TCMP"
            com.google.android.gms.internal.ads.zzawj r0 = zzc(r0, r2, r13, r4, r4)     // Catch:{ all -> 0x01af }
            r13.zzv(r1)
            return r0
        L_0x0077:
            int r2 = zzl     // Catch:{ all -> 0x01af }
            r8 = 4
            if (r0 != r2) goto L_0x00b7
            int r0 = r13.zze()     // Catch:{ all -> 0x01af }
            int r2 = r13.zze()     // Catch:{ all -> 0x01af }
            int r3 = com.google.android.gms.internal.ads.zzaus.zzaH     // Catch:{ all -> 0x01af }
            if (r2 != r3) goto L_0x00b3
            int r2 = r13.zze()     // Catch:{ all -> 0x01af }
            int r2 = com.google.android.gms.internal.ads.zzaus.zze(r2)     // Catch:{ all -> 0x01af }
            r3 = 13
            if (r2 != r3) goto L_0x0097
            java.lang.String r2 = "image/jpeg"
            goto L_0x009f
        L_0x0097:
            r3 = 14
            if (r2 != r3) goto L_0x009e
            java.lang.String r2 = "image/png"
            goto L_0x009f
        L_0x009e:
            r2 = r5
        L_0x009f:
            if (r2 != 0) goto L_0x00a2
            goto L_0x00b3
        L_0x00a2:
            r13.zzw(r8)     // Catch:{ all -> 0x01af }
            int r0 = r0 + -16
            byte[] r3 = new byte[r0]     // Catch:{ all -> 0x01af }
            r13.zzq(r3, r7, r0)     // Catch:{ all -> 0x01af }
            com.google.android.gms.internal.ads.zzawf r0 = new com.google.android.gms.internal.ads.zzawf     // Catch:{ all -> 0x01af }
            r4 = 3
            r0.<init>(r2, r5, r4, r3)     // Catch:{ all -> 0x01af }
            r5 = r0
        L_0x00b3:
            r13.zzv(r1)
            return r5
        L_0x00b7:
            int r2 = zzs     // Catch:{ all -> 0x01af }
            if (r0 != r2) goto L_0x00c5
            java.lang.String r2 = "TPE2"
            com.google.android.gms.internal.ads.zzawl r0 = zze(r0, r2, r13)     // Catch:{ all -> 0x01af }
            r13.zzv(r1)
            return r0
        L_0x00c5:
            int r2 = zzt     // Catch:{ all -> 0x01af }
            if (r0 != r2) goto L_0x00d3
            java.lang.String r2 = "TSOT"
            com.google.android.gms.internal.ads.zzawl r0 = zze(r0, r2, r13)     // Catch:{ all -> 0x01af }
            r13.zzv(r1)
            return r0
        L_0x00d3:
            int r2 = zzu     // Catch:{ all -> 0x01af }
            if (r0 != r2) goto L_0x00e1
            java.lang.String r2 = "TSO2"
            com.google.android.gms.internal.ads.zzawl r0 = zze(r0, r2, r13)     // Catch:{ all -> 0x01af }
            r13.zzv(r1)
            return r0
        L_0x00e1:
            int r2 = zzv     // Catch:{ all -> 0x01af }
            if (r0 != r2) goto L_0x00ef
            java.lang.String r2 = "TSOA"
            com.google.android.gms.internal.ads.zzawl r0 = zze(r0, r2, r13)     // Catch:{ all -> 0x01af }
            r13.zzv(r1)
            return r0
        L_0x00ef:
            int r2 = zzw     // Catch:{ all -> 0x01af }
            if (r0 != r2) goto L_0x00fd
            java.lang.String r2 = "TSOP"
            com.google.android.gms.internal.ads.zzawl r0 = zze(r0, r2, r13)     // Catch:{ all -> 0x01af }
            r13.zzv(r1)
            return r0
        L_0x00fd:
            int r2 = zzx     // Catch:{ all -> 0x01af }
            if (r0 != r2) goto L_0x010b
            java.lang.String r2 = "TSOC"
            com.google.android.gms.internal.ads.zzawl r0 = zze(r0, r2, r13)     // Catch:{ all -> 0x01af }
            r13.zzv(r1)
            return r0
        L_0x010b:
            int r2 = zzy     // Catch:{ all -> 0x01af }
            if (r0 != r2) goto L_0x0119
            java.lang.String r2 = "ITUNESADVISORY"
            com.google.android.gms.internal.ads.zzawj r0 = zzc(r0, r2, r13, r7, r7)     // Catch:{ all -> 0x01af }
            r13.zzv(r1)
            return r0
        L_0x0119:
            int r2 = zzz     // Catch:{ all -> 0x01af }
            if (r0 != r2) goto L_0x0127
            java.lang.String r2 = "ITUNESGAPLESS"
            com.google.android.gms.internal.ads.zzawj r0 = zzc(r0, r2, r13, r7, r4)     // Catch:{ all -> 0x01af }
            r13.zzv(r1)
            return r0
        L_0x0127:
            int r2 = zzA     // Catch:{ all -> 0x01af }
            if (r0 != r2) goto L_0x0135
            java.lang.String r2 = "TVSHOWSORT"
            com.google.android.gms.internal.ads.zzawl r0 = zze(r0, r2, r13)     // Catch:{ all -> 0x01af }
            r13.zzv(r1)
            return r0
        L_0x0135:
            int r2 = zzB     // Catch:{ all -> 0x01af }
            if (r0 != r2) goto L_0x0143
            java.lang.String r2 = "TVSHOW"
            com.google.android.gms.internal.ads.zzawl r0 = zze(r0, r2, r13)     // Catch:{ all -> 0x01af }
            r13.zzv(r1)
            return r0
        L_0x0143:
            int r2 = zzC     // Catch:{ all -> 0x01af }
            if (r0 != r2) goto L_0x0257
            r0 = r5
            r2 = r0
            r4 = -1
            r7 = -1
        L_0x014b:
            int r9 = r13.zzc()     // Catch:{ all -> 0x01af }
            if (r9 >= r1) goto L_0x0185
            int r9 = r13.zzc()     // Catch:{ all -> 0x01af }
            int r10 = r13.zze()     // Catch:{ all -> 0x01af }
            int r11 = r13.zze()     // Catch:{ all -> 0x01af }
            r13.zzw(r8)     // Catch:{ all -> 0x01af }
            int r12 = com.google.android.gms.internal.ads.zzaus.zzaF     // Catch:{ all -> 0x01af }
            if (r11 != r12) goto L_0x016b
            int r10 = r10 + -12
            java.lang.String r0 = r13.zzo(r10)     // Catch:{ all -> 0x01af }
            goto L_0x014b
        L_0x016b:
            int r12 = com.google.android.gms.internal.ads.zzaus.zzaG     // Catch:{ all -> 0x01af }
            if (r11 != r12) goto L_0x0176
            int r10 = r10 + -12
            java.lang.String r2 = r13.zzo(r10)     // Catch:{ all -> 0x01af }
            goto L_0x014b
        L_0x0176:
            int r12 = com.google.android.gms.internal.ads.zzaus.zzaH     // Catch:{ all -> 0x01af }
            if (r11 != r12) goto L_0x017b
            r7 = r10
        L_0x017b:
            if (r11 == r12) goto L_0x017e
            goto L_0x017f
        L_0x017e:
            r4 = r9
        L_0x017f:
            int r10 = r10 + -12
            r13.zzw(r10)     // Catch:{ all -> 0x01af }
            goto L_0x014b
        L_0x0185:
            java.lang.String r8 = "com.apple.iTunes"
            boolean r0 = r8.equals(r0)     // Catch:{ all -> 0x01af }
            if (r0 == 0) goto L_0x01ab
            java.lang.String r0 = "iTunSMPB"
            boolean r0 = r0.equals(r2)     // Catch:{ all -> 0x01af }
            if (r0 == 0) goto L_0x01ab
            if (r4 != r6) goto L_0x0198
            goto L_0x01ab
        L_0x0198:
            r13.zzv(r4)     // Catch:{ all -> 0x01af }
            r0 = 16
            r13.zzw(r0)     // Catch:{ all -> 0x01af }
            int r7 = r7 + -16
            java.lang.String r0 = r13.zzo(r7)     // Catch:{ all -> 0x01af }
            com.google.android.gms.internal.ads.zzawh r5 = new com.google.android.gms.internal.ads.zzawh     // Catch:{ all -> 0x01af }
            r5.<init>(r3, r2, r0)     // Catch:{ all -> 0x01af }
        L_0x01ab:
            r13.zzv(r1)
            return r5
        L_0x01af:
            r0 = move-exception
            goto L_0x0272
        L_0x01b2:
            r2 = 16777215(0xffffff, float:2.3509886E-38)
            r2 = r2 & r0
            int r6 = zzc     // Catch:{ all -> 0x01af }
            if (r2 != r6) goto L_0x01e4
            int r2 = r13.zze()     // Catch:{ all -> 0x01af }
            int r4 = r13.zze()     // Catch:{ all -> 0x01af }
            int r6 = com.google.android.gms.internal.ads.zzaus.zzaH     // Catch:{ all -> 0x01af }
            if (r4 != r6) goto L_0x01d7
            r0 = 8
            r13.zzw(r0)     // Catch:{ all -> 0x01af }
            int r2 = r2 + -16
            java.lang.String r0 = r13.zzo(r2)     // Catch:{ all -> 0x01af }
            com.google.android.gms.internal.ads.zzawh r5 = new com.google.android.gms.internal.ads.zzawh     // Catch:{ all -> 0x01af }
            r5.<init>(r3, r0, r0)     // Catch:{ all -> 0x01af }
            goto L_0x01e0
        L_0x01d7:
            java.lang.String r0 = com.google.android.gms.internal.ads.zzaus.zzg(r0)     // Catch:{ all -> 0x01af }
            java.lang.String r2 = "Failed to parse comment attribute: "
            r2.concat(r0)     // Catch:{ all -> 0x01af }
        L_0x01e0:
            r13.zzv(r1)
            return r5
        L_0x01e4:
            int r3 = zza     // Catch:{ all -> 0x01af }
            if (r2 == r3) goto L_0x0268
            int r3 = zzb     // Catch:{ all -> 0x01af }
            if (r2 != r3) goto L_0x01ee
            goto L_0x0268
        L_0x01ee:
            int r3 = zzh     // Catch:{ all -> 0x01af }
            if (r2 == r3) goto L_0x025e
            int r3 = zzi     // Catch:{ all -> 0x01af }
            if (r2 != r3) goto L_0x01f7
            goto L_0x025e
        L_0x01f7:
            int r3 = zzd     // Catch:{ all -> 0x01af }
            if (r2 != r3) goto L_0x0205
            java.lang.String r2 = "TDRC"
            com.google.android.gms.internal.ads.zzawl r0 = zze(r0, r2, r13)     // Catch:{ all -> 0x01af }
            r13.zzv(r1)
            return r0
        L_0x0205:
            int r3 = zze     // Catch:{ all -> 0x01af }
            if (r2 != r3) goto L_0x0213
            java.lang.String r2 = "TPE1"
            com.google.android.gms.internal.ads.zzawl r0 = zze(r0, r2, r13)     // Catch:{ all -> 0x01af }
            r13.zzv(r1)
            return r0
        L_0x0213:
            int r3 = zzf     // Catch:{ all -> 0x01af }
            if (r2 != r3) goto L_0x0221
            java.lang.String r2 = "TSSE"
            com.google.android.gms.internal.ads.zzawl r0 = zze(r0, r2, r13)     // Catch:{ all -> 0x01af }
            r13.zzv(r1)
            return r0
        L_0x0221:
            int r3 = zzg     // Catch:{ all -> 0x01af }
            if (r2 != r3) goto L_0x022f
            java.lang.String r2 = "TALB"
            com.google.android.gms.internal.ads.zzawl r0 = zze(r0, r2, r13)     // Catch:{ all -> 0x01af }
            r13.zzv(r1)
            return r0
        L_0x022f:
            int r3 = zzj     // Catch:{ all -> 0x01af }
            if (r2 != r3) goto L_0x023d
            java.lang.String r2 = "USLT"
            com.google.android.gms.internal.ads.zzawl r0 = zze(r0, r2, r13)     // Catch:{ all -> 0x01af }
            r13.zzv(r1)
            return r0
        L_0x023d:
            int r3 = zzk     // Catch:{ all -> 0x01af }
            if (r2 != r3) goto L_0x0249
            com.google.android.gms.internal.ads.zzawl r0 = zze(r0, r4, r13)     // Catch:{ all -> 0x01af }
            r13.zzv(r1)
            return r0
        L_0x0249:
            int r3 = zzn     // Catch:{ all -> 0x01af }
            if (r2 != r3) goto L_0x0257
            java.lang.String r2 = "TIT1"
            com.google.android.gms.internal.ads.zzawl r0 = zze(r0, r2, r13)     // Catch:{ all -> 0x01af }
            r13.zzv(r1)
            return r0
        L_0x0257:
            com.google.android.gms.internal.ads.zzaus.zzg(r0)     // Catch:{ all -> 0x01af }
            r13.zzv(r1)
            return r5
        L_0x025e:
            java.lang.String r2 = "TCOM"
            com.google.android.gms.internal.ads.zzawl r0 = zze(r0, r2, r13)     // Catch:{ all -> 0x01af }
            r13.zzv(r1)
            return r0
        L_0x0268:
            java.lang.String r2 = "TIT2"
            com.google.android.gms.internal.ads.zzawl r0 = zze(r0, r2, r13)     // Catch:{ all -> 0x01af }
            r13.zzv(r1)
            return r0
        L_0x0272:
            r13.zzv(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzavf.zza(com.google.android.gms.internal.ads.zzazg):com.google.android.gms.internal.ads.zzawc");
    }

    private static int zzb(zzazg zzazg) {
        zzazg.zzw(4);
        if (zzazg.zze() != zzaus.zzaH) {
            return -1;
        }
        zzazg.zzw(8);
        return zzazg.zzg();
    }

    private static zzawj zzc(int i, String str, zzazg zzazg, boolean z, boolean z2) {
        int zzb2 = zzb(zzazg);
        if (z2) {
            zzb2 = Math.min(1, zzb2);
        }
        if (zzb2 < 0) {
            "Failed to parse uint8 attribute: ".concat(zzaus.zzg(i));
            return null;
        } else if (z) {
            return new zzawl(str, (String) null, Integer.toString(zzb2));
        } else {
            return new zzawh("und", str, Integer.toString(zzb2));
        }
    }

    private static zzawl zzd(int i, String str, zzazg zzazg) {
        int zze2 = zzazg.zze();
        if (zzazg.zze() == zzaus.zzaH && zze2 >= 22) {
            zzazg.zzw(10);
            int zzj2 = zzazg.zzj();
            if (zzj2 > 0) {
                StringBuilder sb = new StringBuilder();
                sb.append(zzj2);
                String sb2 = sb.toString();
                int zzj3 = zzazg.zzj();
                if (zzj3 > 0) {
                    sb2 = C16759e.m42350f(sb2, "/", zzj3);
                }
                return new zzawl(str, (String) null, sb2);
            }
        }
        "Failed to parse index/count attribute: ".concat(zzaus.zzg(i));
        return null;
    }

    private static zzawl zze(int i, String str, zzazg zzazg) {
        int zze2 = zzazg.zze();
        if (zzazg.zze() == zzaus.zzaH) {
            zzazg.zzw(8);
            return new zzawl(str, (String) null, zzazg.zzo(zze2 - 16));
        }
        "Failed to parse text attribute: ".concat(zzaus.zzg(i));
        return null;
    }
}
