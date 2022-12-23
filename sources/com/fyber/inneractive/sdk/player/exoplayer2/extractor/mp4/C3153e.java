package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4;

import com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.C3246a;
import com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.C3254e;
import com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.C3261h;
import com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.C3264j;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C3393k;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C3406u;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.e */
public final class C3153e {

    /* renamed from: A */
    public static final int f11124A = C3406u.m8589a("sosn");

    /* renamed from: B */
    public static final int f11125B = C3406u.m8589a("tvsh");

    /* renamed from: C */
    public static final int f11126C = C3406u.m8589a("----");

    /* renamed from: D */
    public static final String[] f11127D = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Negerpunk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop"};

    /* renamed from: a */
    public static final int f11128a = C3406u.m8589a("nam");

    /* renamed from: b */
    public static final int f11129b = C3406u.m8589a("trk");

    /* renamed from: c */
    public static final int f11130c = C3406u.m8589a("cmt");

    /* renamed from: d */
    public static final int f11131d = C3406u.m8589a("day");

    /* renamed from: e */
    public static final int f11132e = C3406u.m8589a("ART");

    /* renamed from: f */
    public static final int f11133f = C3406u.m8589a("too");

    /* renamed from: g */
    public static final int f11134g = C3406u.m8589a("alb");

    /* renamed from: h */
    public static final int f11135h = C3406u.m8589a("com");

    /* renamed from: i */
    public static final int f11136i = C3406u.m8589a("wrt");

    /* renamed from: j */
    public static final int f11137j = C3406u.m8589a("lyr");

    /* renamed from: k */
    public static final int f11138k = C3406u.m8589a("gen");

    /* renamed from: l */
    public static final int f11139l = C3406u.m8589a("covr");

    /* renamed from: m */
    public static final int f11140m = C3406u.m8589a("gnre");

    /* renamed from: n */
    public static final int f11141n = C3406u.m8589a("grp");

    /* renamed from: o */
    public static final int f11142o = C3406u.m8589a("disk");

    /* renamed from: p */
    public static final int f11143p = C3406u.m8589a("trkn");

    /* renamed from: q */
    public static final int f11144q = C3406u.m8589a("tmpo");

    /* renamed from: r */
    public static final int f11145r = C3406u.m8589a("cpil");

    /* renamed from: s */
    public static final int f11146s = C3406u.m8589a("aART");

    /* renamed from: t */
    public static final int f11147t = C3406u.m8589a("sonm");

    /* renamed from: u */
    public static final int f11148u = C3406u.m8589a("soal");

    /* renamed from: v */
    public static final int f11149v = C3406u.m8589a("soar");

    /* renamed from: w */
    public static final int f11150w = C3406u.m8589a("soaa");

    /* renamed from: x */
    public static final int f11151x = C3406u.m8589a("soco");

    /* renamed from: y */
    public static final int f11152y = C3406u.m8589a("rtng");

    /* renamed from: z */
    public static final int f11153z = C3406u.m8589a("pgap");

    /* renamed from: a */
    public static C3261h m7934a(C3393k kVar, int i) {
        String str = null;
        String str2 = null;
        int i2 = -1;
        int i3 = -1;
        while (true) {
            int i4 = kVar.f12122b;
            if (i4 >= i) {
                break;
            }
            int c = kVar.mo14544c();
            int c2 = kVar.mo14544c();
            kVar.mo14551f(4);
            if (c2 == C3141a.f10970D0) {
                str = kVar.mo14538a(c - 12);
            } else if (c2 == C3141a.f10972E0) {
                str2 = kVar.mo14538a(c - 12);
            } else {
                if (c2 == C3141a.f10974F0) {
                    i2 = i4;
                    i3 = c;
                }
                kVar.mo14551f(c - 12);
            }
        }
        if (!"com.apple.iTunes".equals(str) || !"iTunSMPB".equals(str2) || i2 == -1) {
            return null;
        }
        kVar.mo14549e(i2);
        kVar.mo14551f(16);
        return new C3254e("und", str2, kVar.mo14538a(i3 - 16));
    }

    /* renamed from: b */
    public static C3264j m7937b(int i, String str, C3393k kVar) {
        int c = kVar.mo14544c();
        if (kVar.mo14544c() == C3141a.f10974F0) {
            kVar.mo14551f(8);
            return new C3264j(str, (String) null, kVar.mo14538a(c - 16));
        }
        C3141a.m7902a(i);
        return null;
    }

    /* renamed from: b */
    public static int m7936b(C3393k kVar) {
        kVar.mo14551f(4);
        if (kVar.mo14544c() != C3141a.f10974F0) {
            return -1;
        }
        kVar.mo14551f(8);
        return kVar.mo14557l();
    }

    /* renamed from: a */
    public static C3254e m7932a(int i, C3393k kVar) {
        int c = kVar.mo14544c();
        if (kVar.mo14544c() == C3141a.f10974F0) {
            kVar.mo14551f(8);
            String a = kVar.mo14538a(c - 16);
            return new C3254e("und", a, a);
        }
        C3141a.m7902a(i);
        return null;
    }

    /* renamed from: a */
    public static C3261h m7933a(int i, String str, C3393k kVar, boolean z, boolean z2) {
        int b = m7936b(kVar);
        if (z2) {
            b = Math.min(1, b);
        }
        if (b < 0) {
            C3141a.m7902a(i);
            return null;
        } else if (z) {
            return new C3264j(str, (String) null, Integer.toString(b));
        } else {
            return new C3254e("und", str, Integer.toString(b));
        }
    }

    /* renamed from: a */
    public static C3264j m7935a(int i, String str, C3393k kVar) {
        int c = kVar.mo14544c();
        if (kVar.mo14544c() == C3141a.f10974F0 && c >= 22) {
            kVar.mo14551f(10);
            int q = kVar.mo14562q();
            if (q > 0) {
                String e = C16759e.m42349e("", q);
                int q2 = kVar.mo14562q();
                if (q2 > 0) {
                    e = C16759e.m42350f(e, "/", q2);
                }
                return new C3264j(str, (String) null, e);
            }
        }
        C3141a.m7902a(i);
        return null;
    }

    /* renamed from: a */
    public static C3246a m7931a(C3393k kVar) {
        int c = kVar.mo14544c();
        if (kVar.mo14544c() != C3141a.f10974F0) {
            return null;
        }
        int c2 = kVar.mo14544c() & 16777215;
        String str = c2 == 13 ? "image/jpeg" : c2 == 14 ? "image/png" : null;
        if (str == null) {
            return null;
        }
        kVar.mo14551f(4);
        int i = c - 16;
        byte[] bArr = new byte[i];
        System.arraycopy(kVar.f12121a, kVar.f12122b, bArr, 0, i);
        kVar.f12122b += i;
        return new C3246a(str, (String) null, 3, bArr);
    }
}
