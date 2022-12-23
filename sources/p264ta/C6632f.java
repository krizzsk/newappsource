package p264ta;

import com.google.android.exoplayer2.metadata.id3.CommentFrame;
import com.google.android.exoplayer2.metadata.id3.Id3Frame;
import com.google.android.exoplayer2.metadata.id3.TextInformationFrame;
import p277ub.C6803r;

/* renamed from: ta.f */
public final class C6632f {

    /* renamed from: a */
    public static final String[] f20563a = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Afro-Punk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop", "Abstract", "Art Rock", "Baroque", "Bhangra", "Big beat", "Breakbeat", "Chillout", "Downtempo", "Dub", "EBM", "Eclectic", "Electro", "Electroclash", "Emo", "Experimental", "Garage", "Global", "IDM", "Illbient", "Industro-Goth", "Jam Band", "Krautrock", "Leftfield", "Lounge", "Math Rock", "New Romantic", "Nu-Breakz", "Post-Punk", "Post-Rock", "Psytrance", "Shoegaze", "Space Rock", "Trop Rock", "World Music", "Neoclassical", "Audiobook", "Audio theatre", "Neue Deutsche Welle", "Podcast", "Indie-Rock", "G-Funk", "Dubstep", "Garage Rock", "Psybient"};

    /* renamed from: a */
    public static TextInformationFrame m15688a(int i, C6803r rVar, String str) {
        int c = rVar.mo22984c();
        if (rVar.mo22984c() == 1684108385 && c >= 22) {
            rVar.mo22981A(10);
            int u = rVar.mo23002u();
            if (u > 0) {
                StringBuilder sb = new StringBuilder(11);
                sb.append(u);
                String sb2 = sb.toString();
                int u2 = rVar.mo23002u();
                if (u2 > 0) {
                    String valueOf = String.valueOf(sb2);
                    StringBuilder sb3 = new StringBuilder(valueOf.length() + 12);
                    sb3.append(valueOf);
                    sb3.append("/");
                    sb3.append(u2);
                    sb2 = sb3.toString();
                }
                return new TextInformationFrame(str, (String) null, sb2);
            }
        }
        String valueOf2 = String.valueOf(C6619a.m15659a(i));
        if (valueOf2.length() != 0) {
            "Failed to parse index/count attribute: ".concat(valueOf2);
        }
        return null;
    }

    /* renamed from: b */
    public static TextInformationFrame m15689b(int i, C6803r rVar, String str) {
        int c = rVar.mo22984c();
        if (rVar.mo22984c() == 1684108385) {
            rVar.mo22981A(8);
            return new TextInformationFrame(str, (String) null, rVar.mo22993l(c - 16));
        }
        String valueOf = String.valueOf(C6619a.m15659a(i));
        if (valueOf.length() != 0) {
            "Failed to parse text attribute: ".concat(valueOf);
        }
        return null;
    }

    /* renamed from: c */
    public static Id3Frame m15690c(int i, String str, C6803r rVar, boolean z, boolean z2) {
        int i2;
        rVar.mo22981A(4);
        if (rVar.mo22984c() == 1684108385) {
            rVar.mo22981A(8);
            i2 = rVar.mo22997p();
        } else {
            i2 = -1;
        }
        if (z2) {
            i2 = Math.min(1, i2);
        }
        if (i2 < 0) {
            String valueOf = String.valueOf(C6619a.m15659a(i));
            if (valueOf.length() != 0) {
                "Failed to parse uint8 attribute: ".concat(valueOf);
            }
            return null;
        } else if (z) {
            return new TextInformationFrame(str, (String) null, Integer.toString(i2));
        } else {
            return new CommentFrame("und", str, Integer.toString(i2));
        }
    }
}
