package com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.player.exoplayer2.C3052b;
import com.fyber.inneractive.sdk.player.exoplayer2.C3230l;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.C3108b;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C3377y;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C3406u;
import java.io.BufferedReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.Queue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p988j$.util.DesugarTimeZone;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.d */
public final class C3111d implements C3377y.C3378a<C3110c> {

    /* renamed from: a */
    public static final Pattern f10754a = Pattern.compile("AVERAGE-BANDWIDTH=(\\d+)\\b");

    /* renamed from: b */
    public static final Pattern f10755b = Pattern.compile("[^-]BANDWIDTH=(\\d+)\\b");

    /* renamed from: c */
    public static final Pattern f10756c = Pattern.compile("CODECS=\"(.+?)\"");

    /* renamed from: d */
    public static final Pattern f10757d = Pattern.compile("RESOLUTION=(\\d+x\\d+)");

    /* renamed from: e */
    public static final Pattern f10758e = Pattern.compile("#EXT-X-TARGETDURATION:(\\d+)\\b");

    /* renamed from: f */
    public static final Pattern f10759f = Pattern.compile("#EXT-X-VERSION:(\\d+)\\b");

    /* renamed from: g */
    public static final Pattern f10760g = Pattern.compile("#EXT-X-PLAYLIST-TYPE:(.+)\\b");

    /* renamed from: h */
    public static final Pattern f10761h = Pattern.compile("#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b");

    /* renamed from: i */
    public static final Pattern f10762i = Pattern.compile("#EXTINF:([\\d\\.]+)\\b");

    /* renamed from: j */
    public static final Pattern f10763j = Pattern.compile("TIME-OFFSET=(-?[\\d\\.]+)\\b");

    /* renamed from: k */
    public static final Pattern f10764k = Pattern.compile("#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b");

    /* renamed from: l */
    public static final Pattern f10765l = Pattern.compile("BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\"");

    /* renamed from: m */
    public static final Pattern f10766m = Pattern.compile("METHOD=(NONE|AES-128)");

    /* renamed from: n */
    public static final Pattern f10767n = Pattern.compile("URI=\"(.+?)\"");

    /* renamed from: o */
    public static final Pattern f10768o = Pattern.compile("IV=([^,.*]+)");

    /* renamed from: p */
    public static final Pattern f10769p = Pattern.compile("TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)");

    /* renamed from: q */
    public static final Pattern f10770q = Pattern.compile("LANGUAGE=\"(.+?)\"");

    /* renamed from: r */
    public static final Pattern f10771r = Pattern.compile("NAME=\"(.+?)\"");

    /* renamed from: s */
    public static final Pattern f10772s = Pattern.compile("INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\"");

    /* renamed from: t */
    public static final Pattern f10773t = m7817a("AUTOSELECT");

    /* renamed from: u */
    public static final Pattern f10774u = m7817a("DEFAULT");

    /* renamed from: v */
    public static final Pattern f10775v = m7817a("FORCED");

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.d$a */
    public static class C3112a {

        /* renamed from: a */
        public final BufferedReader f10776a;

        /* renamed from: b */
        public final Queue<String> f10777b;

        /* renamed from: c */
        public String f10778c;

        public C3112a(Queue<String> queue, BufferedReader bufferedReader) {
            this.f10777b = queue;
            this.f10776a = bufferedReader;
        }

        /* renamed from: a */
        public boolean mo14177a() throws IOException {
            String trim;
            if (this.f10778c != null) {
                return true;
            }
            if (!this.f10777b.isEmpty()) {
                this.f10778c = this.f10777b.poll();
                return true;
            }
            do {
                String readLine = this.f10776a.readLine();
                this.f10778c = readLine;
                if (readLine == null) {
                    return false;
                }
                trim = readLine.trim();
                this.f10778c = trim;
            } while (trim.isEmpty());
            return true;
        }

        /* renamed from: b */
        public String mo14178b() throws IOException {
            if (!mo14177a()) {
                return null;
            }
            String str = this.f10778c;
            this.f10778c = null;
            return str;
        }
    }

    /* renamed from: a */
    public static Pattern m7817a(String str) {
        StringBuilder h = C16759e.m42352h(str, "=(", "NO", "|", "YES");
        h.append(")");
        return Pattern.compile(h.toString());
    }

    /* renamed from: b */
    public static C3108b m7819b(C3112a aVar, String str) throws IOException {
        long j;
        int i;
        long j2;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i2 = 2;
        long j3 = -9223372036854775807L;
        long j4 = -9223372036854775807L;
        long j5 = -1;
        char c = 0;
        int i3 = 1;
        int i4 = 0;
        int i5 = 0;
        boolean z = false;
        int i6 = 0;
        int i7 = 0;
        boolean z2 = false;
        int i8 = 0;
        boolean z3 = false;
        long j6 = 0;
        long j7 = 0;
        long j8 = 0;
        long j9 = 0;
        C3108b.C3109a aVar2 = null;
        int i9 = 1;
        while (true) {
            boolean z4 = z2;
            C3108b.C3109a aVar3 = aVar2;
            boolean z5 = z3;
            long j10 = j6;
            long j11 = j8;
            long j12 = j9;
            String str2 = null;
            String str3 = null;
            int i11 = i6;
            int i12 = i7;
            int i13 = i9;
            boolean z6 = z;
            long j13 = j4;
            long j14 = j3;
            long j15 = j5;
            while (aVar.mo14177a()) {
                String b = aVar.mo14178b();
                if (b.startsWith("#EXT-X-PLAYLIST-TYPE")) {
                    String b2 = m7820b(b, f10760g);
                    if ("VOD".equals(b2)) {
                        i4 = 1;
                    } else if ("EVENT".equals(b2)) {
                        i4 = 2;
                    } else {
                        j = j13;
                    }
                } else if (b.startsWith("#EXT-X-START")) {
                    j14 = (long) (Double.parseDouble(m7820b(b, f10763j)) * 1000000.0d);
                } else {
                    j = j13;
                    if (b.startsWith("#EXT-X-MAP")) {
                        String b3 = m7820b(b, f10767n);
                        String a = m7816a(b, f10765l);
                        if (a != null) {
                            String[] split = a.split("@");
                            long parseLong = Long.parseLong(split[c]);
                            if (split.length > i3) {
                                j7 = Long.parseLong(split[i3]);
                            }
                            j2 = parseLong;
                        } else {
                            j2 = j15;
                        }
                        aVar3 = new C3108b.C3109a(b3, 0, -1, -9223372036854775807L, false, (String) null, (String) null, j7, j2);
                        j15 = -1;
                        j13 = j;
                        j7 = 0;
                    } else if (b.startsWith("#EXT-X-TARGETDURATION")) {
                        j13 = 1000000 * ((long) Integer.parseInt(m7820b(b, f10758e)));
                    } else {
                        if (b.startsWith("#EXT-X-MEDIA-SEQUENCE")) {
                            i8 = Integer.parseInt(m7820b(b, f10761h));
                            i12 = i8;
                        } else if (b.startsWith("#EXT-X-VERSION")) {
                            i13 = Integer.parseInt(m7820b(b, f10759f));
                        } else if (b.startsWith("#EXTINF")) {
                            j12 = (long) (Double.parseDouble(m7820b(b, f10762i)) * 1000000.0d);
                        } else if (b.startsWith("#EXT-X-KEY")) {
                            z5 = "AES-128".equals(m7820b(b, f10766m));
                            if (z5) {
                                str3 = m7820b(b, f10767n);
                                str2 = m7816a(b, f10768o);
                            } else {
                                j5 = j15;
                                j3 = j14;
                                z = z6;
                                i6 = i11;
                                i7 = i12;
                                i9 = i13;
                                z2 = z4;
                                aVar2 = aVar3;
                                z3 = z5;
                                j6 = j10;
                                j8 = j11;
                                j9 = j12;
                                j4 = j;
                            }
                        } else if (b.startsWith("#EXT-X-BYTERANGE")) {
                            String[] split2 = m7820b(b, f10764k).split("@");
                            long parseLong2 = Long.parseLong(split2[c]);
                            if (split2.length > i3) {
                                j7 = Long.parseLong(split2[i3]);
                            }
                            j15 = parseLong2;
                        } else if (b.startsWith("#EXT-X-DISCONTINUITY-SEQUENCE")) {
                            i11 = Integer.parseInt(b.substring(b.indexOf(58) + i3));
                            z6 = true;
                        } else if (b.equals("#EXT-X-DISCONTINUITY")) {
                            i5++;
                        } else if (b.startsWith("#EXT-X-PROGRAM-DATE-TIME")) {
                            if (j10 == 0) {
                                String substring = b.substring(b.indexOf(58) + i3);
                                Matcher matcher = C3406u.f12153f.matcher(substring);
                                if (matcher.matches()) {
                                    if (matcher.group(9) != null && !matcher.group(9).equalsIgnoreCase("Z")) {
                                        i = (Integer.parseInt(matcher.group(12)) * 60) + Integer.parseInt(matcher.group(13));
                                        if (matcher.group(11).equals("-")) {
                                            i *= -1;
                                        }
                                    } else {
                                        i = 0;
                                    }
                                    GregorianCalendar gregorianCalendar = new GregorianCalendar(DesugarTimeZone.getTimeZone("GMT"));
                                    gregorianCalendar.clear();
                                    gregorianCalendar.set(Integer.parseInt(matcher.group(i3)), Integer.parseInt(matcher.group(i2)) - 1, Integer.parseInt(matcher.group(3)), Integer.parseInt(matcher.group(4)), Integer.parseInt(matcher.group(5)), Integer.parseInt(matcher.group(6)));
                                    if (!TextUtils.isEmpty(matcher.group(8))) {
                                        StringBuilder k = C13555b.m33972k("0.");
                                        k.append(matcher.group(8));
                                        gregorianCalendar.set(14, new BigDecimal(k.toString()).movePointRight(3).intValue());
                                    }
                                    long timeInMillis = gregorianCalendar.getTimeInMillis();
                                    if (i != 0) {
                                        timeInMillis -= (long) (i * 60000);
                                    }
                                    j10 = C3052b.m7657a(timeInMillis) - j11;
                                } else {
                                    throw new C3230l(C25541a.m63881k("Invalid date/time format: ", substring));
                                }
                            }
                        } else if (b.startsWith("#EXT-X-DATERANGE")) {
                            arrayList2.add(b);
                        } else if (!b.startsWith("#")) {
                            String hexString = !z5 ? null : str2 != null ? str2 : Integer.toHexString(i8);
                            int i14 = i8 + 1;
                            int i15 = (j15 > -1 ? 1 : (j15 == -1 ? 0 : -1));
                            long j16 = i15 == 0 ? 0 : j7;
                            arrayList.add(new C3108b.C3109a(b, j12, i5, j11, z5, str3, hexString, j16, j15));
                            j11 += j12;
                            if (i15 != 0) {
                                j16 += j15;
                            }
                            i8 = i14;
                            j15 = -1;
                            j7 = j16;
                            j12 = 0;
                        } else if (b.equals("#EXT-X-ENDLIST")) {
                            i2 = 2;
                            c = 0;
                            i3 = 1;
                            z4 = true;
                        }
                        j13 = j;
                    }
                }
                i2 = 2;
                c = 0;
                i3 = 1;
                j13 = j;
            }
            return new C3108b(i4, str, j14, j10, z6, i11, i12, i13, j13, z4, j10 != 0, aVar3, arrayList, arrayList2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00d7, code lost:
        r9.add(r1);
        r8 = m7819b(new com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.C3111d.C3112a(r9, r0), r8.toString());
     */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0068 A[Catch:{ all -> 0x00fe }, LOOP:3: B:29:0x0068->B:74:0x0068, LOOP_START] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00f6 A[SYNTHETIC, Splitter:B:60:0x00f6] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo14176a(android.net.Uri r8, java.io.InputStream r9) throws java.io.IOException {
        /*
            r7 = this;
            java.io.BufferedReader r0 = new java.io.BufferedReader
            java.io.InputStreamReader r1 = new java.io.InputStreamReader
            r1.<init>(r9)
            r0.<init>(r1)
            java.util.LinkedList r9 = new java.util.LinkedList
            r9.<init>()
            int r1 = r0.read()     // Catch:{ all -> 0x00fe }
            r2 = 239(0xef, float:3.35E-43)
            r3 = 0
            if (r1 != r2) goto L_0x002d
            int r1 = r0.read()     // Catch:{ all -> 0x00fe }
            r2 = 187(0xbb, float:2.62E-43)
            if (r1 != r2) goto L_0x0066
            int r1 = r0.read()     // Catch:{ all -> 0x00fe }
            r2 = 191(0xbf, float:2.68E-43)
            if (r1 == r2) goto L_0x0029
            goto L_0x0066
        L_0x0029:
            int r1 = r0.read()     // Catch:{ all -> 0x00fe }
        L_0x002d:
            r2 = -1
            if (r1 == r2) goto L_0x003b
            boolean r4 = java.lang.Character.isWhitespace(r1)     // Catch:{ all -> 0x00fe }
            if (r4 == 0) goto L_0x003b
            int r1 = r0.read()     // Catch:{ all -> 0x00fe }
            goto L_0x002d
        L_0x003b:
            r4 = 7
            r5 = 0
        L_0x003d:
            if (r5 >= r4) goto L_0x004f
            java.lang.String r6 = "#EXTM3U"
            char r6 = r6.charAt(r5)     // Catch:{ all -> 0x00fe }
            if (r1 == r6) goto L_0x0048
            goto L_0x0066
        L_0x0048:
            int r1 = r0.read()     // Catch:{ all -> 0x00fe }
            int r5 = r5 + 1
            goto L_0x003d
        L_0x004f:
            if (r1 == r2) goto L_0x0062
            boolean r3 = java.lang.Character.isWhitespace(r1)     // Catch:{ all -> 0x00fe }
            if (r3 == 0) goto L_0x0062
            boolean r3 = com.fyber.inneractive.sdk.player.exoplayer2.util.C3406u.m8600b((int) r1)     // Catch:{ all -> 0x00fe }
            if (r3 != 0) goto L_0x0062
            int r1 = r0.read()     // Catch:{ all -> 0x00fe }
            goto L_0x004f
        L_0x0062:
            boolean r3 = com.fyber.inneractive.sdk.player.exoplayer2.util.C3406u.m8600b((int) r1)     // Catch:{ all -> 0x00fe }
        L_0x0066:
            if (r3 == 0) goto L_0x00f6
        L_0x0068:
            java.lang.String r1 = r0.readLine()     // Catch:{ all -> 0x00fe }
            if (r1 == 0) goto L_0x00eb
            java.lang.String r1 = r1.trim()     // Catch:{ all -> 0x00fe }
            boolean r2 = r1.isEmpty()     // Catch:{ all -> 0x00fe }
            if (r2 == 0) goto L_0x0079
            goto L_0x0068
        L_0x0079:
            java.lang.String r2 = "#EXT-X-STREAM-INF"
            boolean r2 = r1.startsWith(r2)     // Catch:{ all -> 0x00fe }
            if (r2 == 0) goto L_0x0092
            r9.add(r1)     // Catch:{ all -> 0x00fe }
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.d$a r1 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.d$a     // Catch:{ all -> 0x00fe }
            r1.<init>(r9, r0)     // Catch:{ all -> 0x00fe }
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x00fe }
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a r8 = m7815a((com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.C3111d.C3112a) r1, (java.lang.String) r8)     // Catch:{ all -> 0x00fe }
            goto L_0x00e7
        L_0x0092:
            java.lang.String r2 = "#EXT-X-TARGETDURATION"
            boolean r2 = r1.startsWith(r2)     // Catch:{ all -> 0x00fe }
            if (r2 != 0) goto L_0x00d7
            java.lang.String r2 = "#EXT-X-MEDIA-SEQUENCE"
            boolean r2 = r1.startsWith(r2)     // Catch:{ all -> 0x00fe }
            if (r2 != 0) goto L_0x00d7
            java.lang.String r2 = "#EXTINF"
            boolean r2 = r1.startsWith(r2)     // Catch:{ all -> 0x00fe }
            if (r2 != 0) goto L_0x00d7
            java.lang.String r2 = "#EXT-X-KEY"
            boolean r2 = r1.startsWith(r2)     // Catch:{ all -> 0x00fe }
            if (r2 != 0) goto L_0x00d7
            java.lang.String r2 = "#EXT-X-BYTERANGE"
            boolean r2 = r1.startsWith(r2)     // Catch:{ all -> 0x00fe }
            if (r2 != 0) goto L_0x00d7
            java.lang.String r2 = "#EXT-X-DISCONTINUITY"
            boolean r2 = r1.equals(r2)     // Catch:{ all -> 0x00fe }
            if (r2 != 0) goto L_0x00d7
            java.lang.String r2 = "#EXT-X-DISCONTINUITY-SEQUENCE"
            boolean r2 = r1.equals(r2)     // Catch:{ all -> 0x00fe }
            if (r2 != 0) goto L_0x00d7
            java.lang.String r2 = "#EXT-X-ENDLIST"
            boolean r2 = r1.equals(r2)     // Catch:{ all -> 0x00fe }
            if (r2 == 0) goto L_0x00d3
            goto L_0x00d7
        L_0x00d3:
            r9.add(r1)     // Catch:{ all -> 0x00fe }
            goto L_0x0068
        L_0x00d7:
            r9.add(r1)     // Catch:{ all -> 0x00fe }
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.d$a r1 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.d$a     // Catch:{ all -> 0x00fe }
            r1.<init>(r9, r0)     // Catch:{ all -> 0x00fe }
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x00fe }
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.b r8 = m7819b((com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.C3111d.C3112a) r1, (java.lang.String) r8)     // Catch:{ all -> 0x00fe }
        L_0x00e7:
            com.fyber.inneractive.sdk.player.exoplayer2.util.C3406u.m8594a((java.io.Closeable) r0)
            return r8
        L_0x00eb:
            com.fyber.inneractive.sdk.player.exoplayer2.util.C3406u.m8594a((java.io.Closeable) r0)
            com.fyber.inneractive.sdk.player.exoplayer2.l r8 = new com.fyber.inneractive.sdk.player.exoplayer2.l
            java.lang.String r9 = "Failed to parse the playlist, could not identify any tags."
            r8.<init>((java.lang.String) r9)
            throw r8
        L_0x00f6:
            com.fyber.inneractive.sdk.player.exoplayer2.source.t r9 = new com.fyber.inneractive.sdk.player.exoplayer2.source.t     // Catch:{ all -> 0x00fe }
            java.lang.String r1 = "Input does not start with the #EXTM3U header."
            r9.<init>(r1, r8)     // Catch:{ all -> 0x00fe }
            throw r9     // Catch:{ all -> 0x00fe }
        L_0x00fe:
            r8 = move-exception
            com.fyber.inneractive.sdk.player.exoplayer2.util.C3406u.m8594a((java.io.Closeable) r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.C3111d.mo14176a(android.net.Uri, java.io.InputStream):java.lang.Object");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x007f, code lost:
        if (r14.equals("CLOSED-CAPTIONS") == false) goto L_0x006c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x019a  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0018 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.C3106a m7815a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.C3111d.C3112a r45, java.lang.String r46) throws java.io.IOException {
        /*
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r1 = 0
            r2 = 0
            r6 = r1
            r7 = 0
        L_0x0018:
            boolean r8 = r45.mo14177a()
            if (r8 == 0) goto L_0x01e0
            java.lang.String r8 = r45.mo14178b()
            java.lang.String r9 = "#EXT-X-MEDIA"
            boolean r9 = r8.startsWith(r9)
            r10 = 1
            if (r9 == 0) goto L_0x013a
            java.util.regex.Pattern r9 = f10774u
            boolean r9 = m7818a(r8, r9, r2)
            java.util.regex.Pattern r12 = f10775v
            boolean r12 = m7818a(r8, r12, r2)
            r13 = 2
            if (r12 == 0) goto L_0x003c
            r12 = 2
            goto L_0x003d
        L_0x003c:
            r12 = 0
        L_0x003d:
            r9 = r9 | r12
            java.util.regex.Pattern r12 = f10773t
            boolean r12 = m7818a(r8, r12, r2)
            if (r12 == 0) goto L_0x0048
            r12 = 4
            goto L_0x0049
        L_0x0048:
            r12 = 0
        L_0x0049:
            r9 = r9 | r12
            java.util.regex.Pattern r12 = f10767n
            java.lang.String r12 = m7816a((java.lang.String) r8, (java.util.regex.Pattern) r12)
            java.util.regex.Pattern r14 = f10771r
            java.lang.String r15 = m7820b((java.lang.String) r8, (java.util.regex.Pattern) r14)
            java.util.regex.Pattern r14 = f10770q
            java.lang.String r35 = m7816a((java.lang.String) r8, (java.util.regex.Pattern) r14)
            java.util.regex.Pattern r14 = f10769p
            java.lang.String r14 = m7820b((java.lang.String) r8, (java.util.regex.Pattern) r14)
            r14.getClass()
            int r16 = r14.hashCode()
            switch(r16) {
                case -959297733: goto L_0x0082;
                case -333210994: goto L_0x0079;
                case 62628790: goto L_0x006e;
                default: goto L_0x006c;
            }
        L_0x006c:
            r10 = -1
            goto L_0x008c
        L_0x006e:
            java.lang.String r10 = "AUDIO"
            boolean r10 = r14.equals(r10)
            if (r10 != 0) goto L_0x0077
            goto L_0x006c
        L_0x0077:
            r10 = 2
            goto L_0x008c
        L_0x0079:
            java.lang.String r11 = "CLOSED-CAPTIONS"
            boolean r11 = r14.equals(r11)
            if (r11 != 0) goto L_0x008c
            goto L_0x006c
        L_0x0082:
            java.lang.String r10 = "SUBTITLES"
            boolean r10 = r14.equals(r10)
            if (r10 != 0) goto L_0x008b
            goto L_0x006c
        L_0x008b:
            r10 = 0
        L_0x008c:
            switch(r10) {
                case 0: goto L_0x011b;
                case 1: goto L_0x00d8;
                case 2: goto L_0x0090;
                default: goto L_0x008f;
            }
        L_0x008f:
            goto L_0x0018
        L_0x0090:
            com.fyber.inneractive.sdk.player.exoplayer2.i r8 = new com.fyber.inneractive.sdk.player.exoplayer2.i
            r14 = r8
            r17 = 0
            r18 = 0
            r19 = -1
            r20 = -1
            r21 = -1
            r22 = -1
            r23 = -1082130432(0xffffffffbf800000, float:-1.0)
            r24 = -1
            r25 = -1082130432(0xffffffffbf800000, float:-1.0)
            r26 = 0
            r27 = -1
            r28 = 0
            r29 = -1
            r30 = -1
            r31 = -1
            r32 = -1
            r33 = -1
            r36 = -1
            r37 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r39 = 0
            r40 = 0
            r41 = 0
            java.lang.String r16 = "application/x-mpegURL"
            r34 = r9
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r39, r40, r41)
            if (r12 != 0) goto L_0x00ce
            r6 = r8
            goto L_0x0018
        L_0x00ce:
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a$a r9 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a$a
            r9.<init>(r12, r8)
            r4.add(r9)
            goto L_0x0018
        L_0x00d8:
            java.util.regex.Pattern r10 = f10772s
            java.lang.String r8 = m7820b((java.lang.String) r8, (java.util.regex.Pattern) r10)
            java.lang.String r10 = "CC"
            boolean r10 = r8.startsWith(r10)
            if (r10 == 0) goto L_0x00f1
            java.lang.String r8 = r8.substring(r13)
            int r8 = java.lang.Integer.parseInt(r8)
            java.lang.String r10 = "application/cea-608"
            goto L_0x00fc
        L_0x00f1:
            r10 = 7
            java.lang.String r8 = r8.substring(r10)
            int r8 = java.lang.Integer.parseInt(r8)
            java.lang.String r10 = "application/cea-708"
        L_0x00fc:
            r21 = r8
            r16 = r10
            if (r1 != 0) goto L_0x0107
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
        L_0x0107:
            r8 = 0
            r17 = 0
            r18 = -1
            r14 = r15
            r15 = r8
            r19 = r9
            r20 = r35
            com.fyber.inneractive.sdk.player.exoplayer2.i r8 = com.fyber.inneractive.sdk.player.exoplayer2.C3226i.m8183a(r14, r15, r16, r17, r18, r19, r20, r21)
            r1.add(r8)
            goto L_0x0018
        L_0x011b:
            r17 = 0
            r18 = -1
            r21 = -1
            java.lang.String r8 = "application/x-mpegURL"
            java.lang.String r16 = "text/vtt"
            r14 = r15
            r15 = r8
            r19 = r9
            r20 = r35
            com.fyber.inneractive.sdk.player.exoplayer2.i r8 = com.fyber.inneractive.sdk.player.exoplayer2.C3226i.m8183a(r14, r15, r16, r17, r18, r19, r20, r21)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a$a r9 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a$a
            r9.<init>(r12, r8)
            r5.add(r9)
            goto L_0x0018
        L_0x013a:
            java.lang.String r9 = "#EXT-X-STREAM-INF"
            boolean r9 = r8.startsWith(r9)
            if (r9 == 0) goto L_0x0018
            java.util.regex.Pattern r9 = f10755b
            java.lang.String r9 = m7820b((java.lang.String) r8, (java.util.regex.Pattern) r9)
            int r9 = java.lang.Integer.parseInt(r9)
            java.util.regex.Pattern r11 = f10754a
            java.lang.String r11 = m7816a((java.lang.String) r8, (java.util.regex.Pattern) r11)
            if (r11 == 0) goto L_0x0158
            int r9 = java.lang.Integer.parseInt(r11)
        L_0x0158:
            r22 = r9
            java.util.regex.Pattern r9 = f10756c
            java.lang.String r21 = m7816a((java.lang.String) r8, (java.util.regex.Pattern) r9)
            java.util.regex.Pattern r9 = f10757d
            java.lang.String r9 = m7816a((java.lang.String) r8, (java.util.regex.Pattern) r9)
            java.lang.String r11 = "CLOSED-CAPTIONS=NONE"
            boolean r8 = r8.contains(r11)
            r7 = r7 | r8
            if (r9 == 0) goto L_0x018c
            java.lang.String r8 = "x"
            java.lang.String[] r8 = r9.split(r8)
            r9 = r8[r2]
            int r9 = java.lang.Integer.parseInt(r9)
            r8 = r8[r10]
            int r8 = java.lang.Integer.parseInt(r8)
            if (r9 <= 0) goto L_0x018c
            if (r8 > 0) goto L_0x0187
            goto L_0x018c
        L_0x0187:
            r25 = r8
            r24 = r9
            goto L_0x0190
        L_0x018c:
            r24 = -1
            r25 = -1
        L_0x0190:
            java.lang.String r8 = r45.mo14178b()
            boolean r9 = r0.add(r8)
            if (r9 == 0) goto L_0x0018
            int r9 = r3.size()
            java.lang.String r18 = java.lang.Integer.toString(r9)
            com.fyber.inneractive.sdk.player.exoplayer2.i r9 = new com.fyber.inneractive.sdk.player.exoplayer2.i
            r17 = r9
            r20 = 0
            r23 = -1
            r26 = -1082130432(0xffffffffbf800000, float:-1.0)
            r27 = -1
            r28 = -1082130432(0xffffffffbf800000, float:-1.0)
            r29 = 0
            r30 = -1
            r31 = 0
            r32 = -1
            r33 = -1
            r34 = -1
            r35 = -1
            r36 = -1
            r37 = 0
            r38 = 0
            r39 = -1
            r40 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r42 = 0
            r43 = 0
            r44 = 0
            java.lang.String r19 = "application/x-mpegURL"
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r42, r43, r44)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a$a r10 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a$a
            r10.<init>(r8, r9)
            r3.add(r10)
            goto L_0x0018
        L_0x01e0:
            if (r7 == 0) goto L_0x01e8
            java.util.List r0 = java.util.Collections.emptyList()
            r7 = r0
            goto L_0x01e9
        L_0x01e8:
            r7 = r1
        L_0x01e9:
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a r0 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a
            r1 = r0
            r2 = r46
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.C3111d.m7815a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.d$a, java.lang.String):com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a");
    }

    /* renamed from: a */
    public static String m7816a(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            return matcher.group(1);
        }
        return null;
    }

    /* renamed from: b */
    public static String m7820b(String str, Pattern pattern) throws C3230l {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find() && matcher.groupCount() == 1) {
            return matcher.group(1);
        }
        StringBuilder k = C13555b.m33972k("Couldn't match ");
        k.append(pattern.pattern());
        k.append(" in ");
        k.append(str);
        throw new C3230l(k.toString());
    }

    /* renamed from: a */
    public static boolean m7818a(String str, Pattern pattern, boolean z) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? matcher.group(1).equals("YES") : z;
    }
}
