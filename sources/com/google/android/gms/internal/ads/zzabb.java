package com.google.android.gms.internal.ads;

import ak0.C21006a;
import java.io.IOException;
import java.io.StringReader;
import org.xmlpull.p982v1.XmlPullParser;
import org.xmlpull.p982v1.XmlPullParserException;

final class zzabb {
    private static final String[] zza = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};
    private static final String[] zzb = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};
    private static final String[] zzc = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    public static zzaax zza(String str) throws IOException {
        long j;
        try {
            XmlPullParser b = C21006a.m49161a().mo53086b();
            b.setInput(new StringReader(str));
            b.next();
            if (zzeh.zzc(b, "x:xmpmeta")) {
                zzfrh zzo = zzfrh.zzo();
                long j2 = -9223372036854775807L;
                do {
                    b.next();
                    if (zzeh.zzc(b, "rdf:Description")) {
                        String[] strArr = zza;
                        int i = 0;
                        int i2 = 0;
                        while (i2 < 4) {
                            String zza2 = zzeh.zza(b, strArr[i2]);
                            if (zza2 == null) {
                                i2++;
                            } else if (Integer.parseInt(zza2) != 1) {
                                return null;
                            } else {
                                String[] strArr2 = zzb;
                                int i3 = 0;
                                while (true) {
                                    if (i3 >= 4) {
                                        break;
                                    }
                                    String zza3 = zzeh.zza(b, strArr2[i3]);
                                    if (zza3 != null) {
                                        j = Long.parseLong(zza3);
                                        if (j == -1) {
                                        }
                                    } else {
                                        i3++;
                                    }
                                }
                                j = -9223372036854775807L;
                                String[] strArr3 = zzc;
                                while (true) {
                                    if (i >= 2) {
                                        zzo = zzfrh.zzo();
                                        break;
                                    }
                                    String zza4 = zzeh.zza(b, strArr3[i]);
                                    if (zza4 != null) {
                                        zzo = zzfrh.zzq(new zzaaw("image/jpeg", "Primary", 0, 0), new zzaaw("video/mp4", "MotionPhoto", Long.parseLong(zza4), 0));
                                        break;
                                    }
                                    i++;
                                }
                                j2 = j;
                            }
                        }
                        return null;
                    } else if (zzeh.zzc(b, "Container:Directory")) {
                        zzo = zzb(b, "Container", "Item");
                    } else if (zzeh.zzc(b, "GContainer:Directory")) {
                        zzo = zzb(b, "GContainer", "GContainerItem");
                    }
                } while (!zzeh.zzb(b, "x:xmpmeta"));
                if (zzo.isEmpty()) {
                    return null;
                }
                return new zzaax(j2, zzo);
            }
            throw zzbp.zza("Couldn't find xmp metadata", (Throwable) null);
        } catch (zzbp | NumberFormatException | XmlPullParserException unused) {
            return null;
        }
    }

    private static zzfrh zzb(XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException {
        long j;
        long j2;
        String concat = str.concat(":Item");
        String concat2 = str.concat(":Directory");
        zzfre zzi = zzfrh.zzi();
        do {
            xmlPullParser.next();
            if (zzeh.zzc(xmlPullParser, concat)) {
                String zza2 = zzeh.zza(xmlPullParser, str2.concat(":Mime"));
                String zza3 = zzeh.zza(xmlPullParser, str2.concat(":Semantic"));
                String zza4 = zzeh.zza(xmlPullParser, str2.concat(":Length"));
                String zza5 = zzeh.zza(xmlPullParser, str2.concat(":Padding"));
                if (zza2 == null || zza3 == null) {
                    return zzfrh.zzo();
                }
                if (zza4 != null) {
                    j = Long.parseLong(zza4);
                } else {
                    j = 0;
                }
                if (zza5 != null) {
                    j2 = Long.parseLong(zza5);
                } else {
                    j2 = 0;
                }
                zzi.zze(new zzaaw(zza2, zza3, j, j2));
            }
        } while (!zzeh.zzb(xmlPullParser, concat2));
        return zzi.zzg();
    }
}
