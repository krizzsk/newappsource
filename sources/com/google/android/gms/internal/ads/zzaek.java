package com.google.android.gms.internal.ads;

final class zzaek {
    public static final String[] zza = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Afro-Punk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop", "Abstract", "Art Rock", "Baroque", "Bhangra", "Big beat", "Breakbeat", "Chillout", "Downtempo", "Dub", "EBM", "Eclectic", "Electro", "Electroclash", "Emo", "Experimental", "Garage", "Global", "IDM", "Illbient", "Industro-Goth", "Jam Band", "Krautrock", "Leftfield", "Lounge", "Math Rock", "New Romantic", "Nu-Breakz", "Post-Punk", "Post-Rock", "Psytrance", "Shoegaze", "Space Rock", "Trop Rock", "World Music", "Neoclassical", "Audiobook", "Audio theatre", "Neue Deutsche Welle", "Podcast", "Indie-Rock", "G-Funk", "Dubstep", "Garage Rock", "Psybient"};
    public static final /* synthetic */ int zzb = 0;

    /* JADX WARNING: Unknown top exception splitter block from list: {B:137:0x0163=Splitter:B:137:0x0163, B:225:0x026e=Splitter:B:225:0x026e} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.ads.zzbk zza(com.google.android.gms.internal.ads.zzdy r12) {
        /*
            int r0 = r12.zzc()
            int r1 = r12.zze()
            int r1 = r1 + r0
            int r0 = r12.zze()
            int r2 = r0 >> 24
            r2 = r2 & 255(0xff, float:3.57E-43)
            java.lang.String r3 = "TCON"
            r4 = 16777215(0xffffff, float:2.3509886E-38)
            r5 = 1684108385(0x64617461, float:1.6635614E22)
            r6 = 0
            r7 = 169(0xa9, float:2.37E-43)
            if (r2 == r7) goto L_0x01bc
            r7 = 253(0xfd, float:3.55E-43)
            if (r2 != r7) goto L_0x0024
            goto L_0x01bc
        L_0x0024:
            r2 = 1735291493(0x676e7265, float:1.1260334E24)
            r7 = -1
            if (r0 != r2) goto L_0x0047
            int r0 = zzb(r12)     // Catch:{ all -> 0x01ed }
            if (r0 <= 0) goto L_0x003a
            r2 = 192(0xc0, float:2.69E-43)
            if (r0 > r2) goto L_0x003a
            java.lang.String[] r2 = zza     // Catch:{ all -> 0x01ed }
            int r0 = r0 + r7
            r0 = r2[r0]     // Catch:{ all -> 0x01ed }
            goto L_0x003b
        L_0x003a:
            r0 = r6
        L_0x003b:
            if (r0 == 0) goto L_0x0043
            com.google.android.gms.internal.ads.zzack r2 = new com.google.android.gms.internal.ads.zzack     // Catch:{ all -> 0x01ed }
            r2.<init>(r3, r6, r0)     // Catch:{ all -> 0x01ed }
            r6 = r2
        L_0x0043:
            r12.zzF(r1)
            return r6
        L_0x0047:
            r2 = 1684632427(0x6469736b, float:1.7225632E22)
            if (r0 != r2) goto L_0x0056
            java.lang.String r0 = "TPOS"
            com.google.android.gms.internal.ads.zzack r0 = zzd(r2, r0, r12)     // Catch:{ all -> 0x01ed }
            r12.zzF(r1)
            return r0
        L_0x0056:
            r2 = 1953655662(0x74726b6e, float:7.6825853E31)
            if (r0 != r2) goto L_0x0065
            java.lang.String r0 = "TRCK"
            com.google.android.gms.internal.ads.zzack r0 = zzd(r2, r0, r12)     // Catch:{ all -> 0x01ed }
            r12.zzF(r1)
            return r0
        L_0x0065:
            r2 = 1953329263(0x746d706f, float:7.5247484E31)
            r3 = 1
            r8 = 0
            if (r0 != r2) goto L_0x0076
            java.lang.String r0 = "TBPM"
            com.google.android.gms.internal.ads.zzacc r0 = zzc(r2, r0, r12, r3, r8)     // Catch:{ all -> 0x01ed }
            r12.zzF(r1)
            return r0
        L_0x0076:
            r2 = 1668311404(0x6370696c, float:4.434815E21)
            if (r0 != r2) goto L_0x0085
            java.lang.String r0 = "TCMP"
            com.google.android.gms.internal.ads.zzacc r0 = zzc(r2, r0, r12, r3, r3)     // Catch:{ all -> 0x01ed }
            r12.zzF(r1)
            return r0
        L_0x0085:
            r2 = 1668249202(0x636f7672, float:4.4173067E21)
            if (r0 != r2) goto L_0x00c1
            int r0 = r12.zze()     // Catch:{ all -> 0x01ed }
            int r2 = r12.zze()     // Catch:{ all -> 0x01ed }
            if (r2 != r5) goto L_0x00bd
            int r2 = r12.zze()     // Catch:{ all -> 0x01ed }
            r2 = r2 & r4
            r3 = 13
            if (r2 != r3) goto L_0x00a0
            java.lang.String r2 = "image/jpeg"
            goto L_0x00a8
        L_0x00a0:
            r3 = 14
            if (r2 != r3) goto L_0x00a7
            java.lang.String r2 = "image/png"
            goto L_0x00a8
        L_0x00a7:
            r2 = r6
        L_0x00a8:
            if (r2 != 0) goto L_0x00ab
            goto L_0x00bd
        L_0x00ab:
            r3 = 4
            r12.zzG(r3)     // Catch:{ all -> 0x01ed }
            int r0 = r0 + -16
            byte[] r3 = new byte[r0]     // Catch:{ all -> 0x01ed }
            r12.zzB(r3, r8, r0)     // Catch:{ all -> 0x01ed }
            com.google.android.gms.internal.ads.zzabn r0 = new com.google.android.gms.internal.ads.zzabn     // Catch:{ all -> 0x01ed }
            r4 = 3
            r0.<init>(r2, r6, r4, r3)     // Catch:{ all -> 0x01ed }
            r6 = r0
        L_0x00bd:
            r12.zzF(r1)
            return r6
        L_0x00c1:
            r2 = 1631670868(0x61415254, float:2.2288462E20)
            if (r0 != r2) goto L_0x00d0
            java.lang.String r0 = "TPE2"
            com.google.android.gms.internal.ads.zzack r0 = zze(r2, r0, r12)     // Catch:{ all -> 0x01ed }
            r12.zzF(r1)
            return r0
        L_0x00d0:
            r2 = 1936682605(0x736f6e6d, float:1.8969706E31)
            if (r0 != r2) goto L_0x00df
            java.lang.String r0 = "TSOT"
            com.google.android.gms.internal.ads.zzack r0 = zze(r2, r0, r12)     // Catch:{ all -> 0x01ed }
            r12.zzF(r1)
            return r0
        L_0x00df:
            r2 = 1936679276(0x736f616c, float:1.8965681E31)
            if (r0 != r2) goto L_0x00ee
            java.lang.String r0 = "TSO2"
            com.google.android.gms.internal.ads.zzack r0 = zze(r2, r0, r12)     // Catch:{ all -> 0x01ed }
            r12.zzF(r1)
            return r0
        L_0x00ee:
            r2 = 1936679282(0x736f6172, float:1.8965689E31)
            if (r0 != r2) goto L_0x00fd
            java.lang.String r0 = "TSOA"
            com.google.android.gms.internal.ads.zzack r0 = zze(r2, r0, r12)     // Catch:{ all -> 0x01ed }
            r12.zzF(r1)
            return r0
        L_0x00fd:
            r2 = 1936679265(0x736f6161, float:1.8965668E31)
            if (r0 != r2) goto L_0x010c
            java.lang.String r0 = "TSOP"
            com.google.android.gms.internal.ads.zzack r0 = zze(r2, r0, r12)     // Catch:{ all -> 0x01ed }
            r12.zzF(r1)
            return r0
        L_0x010c:
            r2 = 1936679791(0x736f636f, float:1.8966304E31)
            if (r0 != r2) goto L_0x011b
            java.lang.String r0 = "TSOC"
            com.google.android.gms.internal.ads.zzack r0 = zze(r2, r0, r12)     // Catch:{ all -> 0x01ed }
            r12.zzF(r1)
            return r0
        L_0x011b:
            r2 = 1920233063(0x72746e67, float:4.84146E30)
            if (r0 != r2) goto L_0x012a
            java.lang.String r0 = "ITUNESADVISORY"
            com.google.android.gms.internal.ads.zzacc r0 = zzc(r2, r0, r12, r8, r8)     // Catch:{ all -> 0x01ed }
            r12.zzF(r1)
            return r0
        L_0x012a:
            r2 = 1885823344(0x70676170, float:2.8643533E29)
            if (r0 != r2) goto L_0x0139
            java.lang.String r0 = "ITUNESGAPLESS"
            com.google.android.gms.internal.ads.zzacc r0 = zzc(r2, r0, r12, r8, r3)     // Catch:{ all -> 0x01ed }
            r12.zzF(r1)
            return r0
        L_0x0139:
            r2 = 1936683886(0x736f736e, float:1.8971255E31)
            if (r0 != r2) goto L_0x0148
            java.lang.String r0 = "TVSHOWSORT"
            com.google.android.gms.internal.ads.zzack r0 = zze(r2, r0, r12)     // Catch:{ all -> 0x01ed }
            r12.zzF(r1)
            return r0
        L_0x0148:
            r2 = 1953919848(0x74767368, float:7.810338E31)
            if (r0 != r2) goto L_0x015a
            r0 = 1953919848(0x74767368, float:7.810338E31)
            java.lang.String r2 = "TVSHOW"
            com.google.android.gms.internal.ads.zzack r0 = zze(r0, r2, r12)     // Catch:{ all -> 0x01ed }
            r12.zzF(r1)
            return r0
        L_0x015a:
            r2 = 757935405(0x2d2d2d2d, float:9.8439425E-12)
            if (r0 != r2) goto L_0x026e
            r0 = r6
            r2 = r0
            r3 = -1
            r4 = -1
        L_0x0163:
            int r8 = r12.zzc()     // Catch:{ all -> 0x01ed }
            if (r8 >= r1) goto L_0x019e
            int r8 = r12.zzc()     // Catch:{ all -> 0x01ed }
            int r9 = r12.zze()     // Catch:{ all -> 0x01ed }
            int r10 = r12.zze()     // Catch:{ all -> 0x01ed }
            r11 = 4
            r12.zzG(r11)     // Catch:{ all -> 0x01ed }
            r11 = 1835360622(0x6d65616e, float:4.4368658E27)
            if (r10 != r11) goto L_0x0185
            int r9 = r9 + -12
            java.lang.String r0 = r12.zzw(r9)     // Catch:{ all -> 0x01ed }
            goto L_0x0163
        L_0x0185:
            r11 = 1851878757(0x6e616d65, float:1.7441594E28)
            if (r10 != r11) goto L_0x0191
            int r9 = r9 + -12
            java.lang.String r2 = r12.zzw(r9)     // Catch:{ all -> 0x01ed }
            goto L_0x0163
        L_0x0191:
            if (r10 != r5) goto L_0x0194
            r4 = r9
        L_0x0194:
            if (r10 == r5) goto L_0x0197
            goto L_0x0198
        L_0x0197:
            r3 = r8
        L_0x0198:
            int r9 = r9 + -12
            r12.zzG(r9)     // Catch:{ all -> 0x01ed }
            goto L_0x0163
        L_0x019e:
            if (r0 == 0) goto L_0x01b8
            if (r2 == 0) goto L_0x01b8
            if (r3 != r7) goto L_0x01a5
            goto L_0x01b8
        L_0x01a5:
            r12.zzF(r3)     // Catch:{ all -> 0x01ed }
            r3 = 16
            r12.zzG(r3)     // Catch:{ all -> 0x01ed }
            int r4 = r4 + -16
            java.lang.String r3 = r12.zzw(r4)     // Catch:{ all -> 0x01ed }
            com.google.android.gms.internal.ads.zzace r6 = new com.google.android.gms.internal.ads.zzace     // Catch:{ all -> 0x01ed }
            r6.<init>(r0, r2, r3)     // Catch:{ all -> 0x01ed }
        L_0x01b8:
            r12.zzF(r1)
            return r6
        L_0x01bc:
            r2 = r0 & r4
            r4 = 6516084(0x636d74, float:9.130979E-39)
            if (r2 != r4) goto L_0x01f0
            int r2 = r12.zze()     // Catch:{ all -> 0x01ed }
            int r3 = r12.zze()     // Catch:{ all -> 0x01ed }
            if (r3 != r5) goto L_0x01e0
            r0 = 8
            r12.zzG(r0)     // Catch:{ all -> 0x01ed }
            int r2 = r2 + -16
            java.lang.String r0 = r12.zzw(r2)     // Catch:{ all -> 0x01ed }
            com.google.android.gms.internal.ads.zzabv r6 = new com.google.android.gms.internal.ads.zzabv     // Catch:{ all -> 0x01ed }
            java.lang.String r2 = "und"
            r6.<init>(r2, r0, r0)     // Catch:{ all -> 0x01ed }
            goto L_0x01e9
        L_0x01e0:
            java.lang.String r0 = com.google.android.gms.internal.ads.zzadw.zzf(r0)     // Catch:{ all -> 0x01ed }
            java.lang.String r2 = "Failed to parse comment attribute: "
            r2.concat(r0)     // Catch:{ all -> 0x01ed }
        L_0x01e9:
            r12.zzF(r1)
            return r6
        L_0x01ed:
            r0 = move-exception
            goto L_0x0289
        L_0x01f0:
            r4 = 7233901(0x6e616d, float:1.0136854E-38)
            if (r2 == r4) goto L_0x027f
            r4 = 7631467(0x74726b, float:1.0693963E-38)
            if (r2 != r4) goto L_0x01fc
            goto L_0x027f
        L_0x01fc:
            r4 = 6516589(0x636f6d, float:9.131686E-39)
            if (r2 == r4) goto L_0x0275
            r4 = 7828084(0x777274, float:1.0969482E-38)
            if (r2 != r4) goto L_0x0207
            goto L_0x0275
        L_0x0207:
            r4 = 6578553(0x646179, float:9.218516E-39)
            if (r2 != r4) goto L_0x0216
            java.lang.String r2 = "TDRC"
            com.google.android.gms.internal.ads.zzack r0 = zze(r0, r2, r12)     // Catch:{ all -> 0x01ed }
            r12.zzF(r1)
            return r0
        L_0x0216:
            r4 = 4280916(0x415254, float:5.998841E-39)
            if (r2 != r4) goto L_0x0225
            java.lang.String r2 = "TPE1"
            com.google.android.gms.internal.ads.zzack r0 = zze(r0, r2, r12)     // Catch:{ all -> 0x01ed }
            r12.zzF(r1)
            return r0
        L_0x0225:
            r4 = 7630703(0x746f6f, float:1.0692892E-38)
            if (r2 != r4) goto L_0x0234
            java.lang.String r2 = "TSSE"
            com.google.android.gms.internal.ads.zzack r0 = zze(r0, r2, r12)     // Catch:{ all -> 0x01ed }
            r12.zzF(r1)
            return r0
        L_0x0234:
            r4 = 6384738(0x616c62, float:8.946924E-39)
            if (r2 != r4) goto L_0x0243
            java.lang.String r2 = "TALB"
            com.google.android.gms.internal.ads.zzack r0 = zze(r0, r2, r12)     // Catch:{ all -> 0x01ed }
            r12.zzF(r1)
            return r0
        L_0x0243:
            r4 = 7108978(0x6c7972, float:9.9618E-39)
            if (r2 != r4) goto L_0x0252
            java.lang.String r2 = "USLT"
            com.google.android.gms.internal.ads.zzack r0 = zze(r0, r2, r12)     // Catch:{ all -> 0x01ed }
            r12.zzF(r1)
            return r0
        L_0x0252:
            r4 = 6776174(0x67656e, float:9.495442E-39)
            if (r2 != r4) goto L_0x025f
            com.google.android.gms.internal.ads.zzack r0 = zze(r0, r3, r12)     // Catch:{ all -> 0x01ed }
            r12.zzF(r1)
            return r0
        L_0x025f:
            r3 = 6779504(0x677270, float:9.500109E-39)
            if (r2 != r3) goto L_0x026e
            java.lang.String r2 = "TIT1"
            com.google.android.gms.internal.ads.zzack r0 = zze(r0, r2, r12)     // Catch:{ all -> 0x01ed }
            r12.zzF(r1)
            return r0
        L_0x026e:
            com.google.android.gms.internal.ads.zzadw.zzf(r0)     // Catch:{ all -> 0x01ed }
            r12.zzF(r1)
            return r6
        L_0x0275:
            java.lang.String r2 = "TCOM"
            com.google.android.gms.internal.ads.zzack r0 = zze(r0, r2, r12)     // Catch:{ all -> 0x01ed }
            r12.zzF(r1)
            return r0
        L_0x027f:
            java.lang.String r2 = "TIT2"
            com.google.android.gms.internal.ads.zzack r0 = zze(r0, r2, r12)     // Catch:{ all -> 0x01ed }
            r12.zzF(r1)
            return r0
        L_0x0289:
            r12.zzF(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaek.zza(com.google.android.gms.internal.ads.zzdy):com.google.android.gms.internal.ads.zzbk");
    }

    private static int zzb(zzdy zzdy) {
        zzdy.zzG(4);
        if (zzdy.zze() != 1684108385) {
            return -1;
        }
        zzdy.zzG(8);
        return zzdy.zzk();
    }

    private static zzacc zzc(int i, String str, zzdy zzdy, boolean z, boolean z2) {
        int zzb2 = zzb(zzdy);
        if (z2) {
            zzb2 = Math.min(1, zzb2);
        }
        if (zzb2 < 0) {
            "Failed to parse uint8 attribute: ".concat(zzadw.zzf(i));
            return null;
        } else if (z) {
            return new zzack(str, (String) null, Integer.toString(zzb2));
        } else {
            return new zzabv("und", str, Integer.toString(zzb2));
        }
    }

    private static zzack zzd(int i, String str, zzdy zzdy) {
        int zze = zzdy.zze();
        if (zzdy.zze() == 1684108385 && zze >= 22) {
            zzdy.zzG(10);
            int zzo = zzdy.zzo();
            if (zzo > 0) {
                StringBuilder sb = new StringBuilder();
                sb.append(zzo);
                String sb2 = sb.toString();
                int zzo2 = zzdy.zzo();
                if (zzo2 > 0) {
                    sb2 = C16759e.m42350f(sb2, "/", zzo2);
                }
                return new zzack(str, (String) null, sb2);
            }
        }
        "Failed to parse index/count attribute: ".concat(zzadw.zzf(i));
        return null;
    }

    private static zzack zze(int i, String str, zzdy zzdy) {
        int zze = zzdy.zze();
        if (zzdy.zze() == 1684108385) {
            zzdy.zzG(8);
            return new zzack(str, (String) null, zzdy.zzw(zze - 16));
        }
        "Failed to parse text attribute: ".concat(zzadw.zzf(i));
        return null;
    }
}
