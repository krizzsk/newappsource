package com.veriff.sdk.camera.core.impl.utils;

import android.os.Build;
import android.util.Pair;
import com.appboy.configuration.AppboyConfigurationProvider;
import com.google.android.gms.ads.RequestConfiguration;
import com.veriff.sdk.camera.core.Logger;
import com.veriff.sdk.camera.core.impl.CameraCaptureMetaData$FlashState;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import mf0.C24361g;

public class ExifData {
    public static final ExifTag[] EXIF_POINTER_TAGS = {new ExifTag("SubIFDPointer", 330, 4), new ExifTag("ExifIFDPointer", 34665, 4), new ExifTag("GPSInfoIFDPointer", 34853, 4), new ExifTag("InteroperabilityIFDPointer", 40965, 4)};
    public static final ExifTag[][] EXIF_TAGS;
    public static final HashSet<String> sTagSetForCompatibility = new HashSet<>(Arrays.asList(new String[]{"FNumber", "ExposureTime", "GPSTimeStamp"}));
    private final List<Map<String, ExifAttribute>> mAttributes;
    private final ByteOrder mByteOrder;

    /* renamed from: com.veriff.sdk.camera.core.impl.utils.ExifData$1 */
    public static /* synthetic */ class C125371 {

        /* renamed from: $SwitchMap$com$veriff$sdk$camera$core$impl$CameraCaptureMetaData$FlashState */
        public static final /* synthetic */ int[] f31066x90dcf02e;

        /* renamed from: $SwitchMap$com$veriff$sdk$camera$core$impl$utils$ExifData$WhiteBalanceMode */
        public static final /* synthetic */ int[] f31067xfb04fcd4;

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|(2:1|2)|3|(2:5|6)|7|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0038 */
        static {
            /*
                com.veriff.sdk.camera.core.impl.utils.ExifData$WhiteBalanceMode[] r0 = com.veriff.sdk.camera.core.impl.utils.ExifData.WhiteBalanceMode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f31067xfb04fcd4 = r0
                r1 = 1
                com.veriff.sdk.camera.core.impl.utils.ExifData$WhiteBalanceMode r2 = com.veriff.sdk.camera.core.impl.utils.ExifData.WhiteBalanceMode.AUTO     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f31067xfb04fcd4     // Catch:{ NoSuchFieldError -> 0x001d }
                com.veriff.sdk.camera.core.impl.utils.ExifData$WhiteBalanceMode r3 = com.veriff.sdk.camera.core.impl.utils.ExifData.WhiteBalanceMode.MANUAL     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                com.veriff.sdk.camera.core.impl.CameraCaptureMetaData$FlashState[] r2 = com.veriff.sdk.camera.core.impl.CameraCaptureMetaData$FlashState.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                f31066x90dcf02e = r2
                com.veriff.sdk.camera.core.impl.CameraCaptureMetaData$FlashState r3 = com.veriff.sdk.camera.core.impl.CameraCaptureMetaData$FlashState.READY     // Catch:{ NoSuchFieldError -> 0x002e }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                int[] r1 = f31066x90dcf02e     // Catch:{ NoSuchFieldError -> 0x0038 }
                com.veriff.sdk.camera.core.impl.CameraCaptureMetaData$FlashState r2 = com.veriff.sdk.camera.core.impl.CameraCaptureMetaData$FlashState.NONE     // Catch:{ NoSuchFieldError -> 0x0038 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0038 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0038 }
            L_0x0038:
                int[] r0 = f31066x90dcf02e     // Catch:{ NoSuchFieldError -> 0x0043 }
                com.veriff.sdk.camera.core.impl.CameraCaptureMetaData$FlashState r1 = com.veriff.sdk.camera.core.impl.CameraCaptureMetaData$FlashState.FIRED     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.veriff.sdk.camera.core.impl.utils.ExifData.C125371.<clinit>():void");
        }
    }

    public static final class Builder {
        private static final Pattern DATETIME_PRIMARY_FORMAT_PATTERN = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
        private static final Pattern DATETIME_SECONDARY_FORMAT_PATTERN = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
        private static final Pattern GPS_TIMESTAMP_PATTERN = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
        public static final List<HashMap<String, ExifTag>> sExifTagMapsForWriting = Collections.list(new Enumeration<HashMap<String, ExifTag>>() {
            public int mIfdIndex = 0;

            public boolean hasMoreElements() {
                return this.mIfdIndex < ExifData.EXIF_TAGS.length;
            }

            public HashMap<String, ExifTag> nextElement() {
                HashMap<String, ExifTag> hashMap = new HashMap<>();
                for (ExifTag exifTag : ExifData.EXIF_TAGS[this.mIfdIndex]) {
                    hashMap.put(exifTag.name, exifTag);
                }
                this.mIfdIndex++;
                return hashMap;
            }
        });
        public final List<Map<String, ExifAttribute>> mAttributes = Collections.list(new Enumeration<Map<String, ExifAttribute>>(this) {
            public int mIfdIndex = 0;

            public boolean hasMoreElements() {
                return this.mIfdIndex < ExifData.EXIF_TAGS.length;
            }

            public Map<String, ExifAttribute> nextElement() {
                this.mIfdIndex++;
                return new HashMap();
            }
        });
        private final ByteOrder mByteOrder;

        public Builder(ByteOrder byteOrder) {
            this.mByteOrder = byteOrder;
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(3:67|68|69) */
        /* JADX WARNING: Code restructure failed: missing block: B:68:?, code lost:
            java.lang.Double.parseDouble(r10);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:69:0x014a, code lost:
            return new android.util.Pair<>(12, -1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:72:0x0150, code lost:
            return new android.util.Pair<>(2, -1);
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:67:0x013c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static android.util.Pair<java.lang.Integer, java.lang.Integer> guessDataFormat(java.lang.String r10) {
            /*
                java.lang.String r0 = ","
                boolean r1 = r10.contains(r0)
                r2 = 0
                r3 = 1
                r4 = 2
                java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
                r6 = -1
                java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
                if (r1 == 0) goto L_0x00a6
                java.lang.String[] r10 = r10.split(r0, r6)
                r0 = r10[r2]
                android.util.Pair r0 = guessDataFormat(r0)
                java.lang.Object r1 = r0.first
                java.lang.Integer r1 = (java.lang.Integer) r1
                int r1 = r1.intValue()
                if (r1 != r4) goto L_0x0029
                return r0
            L_0x0029:
                int r1 = r10.length
                if (r3 >= r1) goto L_0x00a5
                r1 = r10[r3]
                android.util.Pair r1 = guessDataFormat(r1)
                java.lang.Object r2 = r1.first
                java.lang.Integer r2 = (java.lang.Integer) r2
                java.lang.Object r4 = r0.first
                boolean r2 = r2.equals(r4)
                if (r2 != 0) goto L_0x004d
                java.lang.Object r2 = r1.second
                java.lang.Integer r2 = (java.lang.Integer) r2
                java.lang.Object r4 = r0.first
                boolean r2 = r2.equals(r4)
                if (r2 == 0) goto L_0x004b
                goto L_0x004d
            L_0x004b:
                r2 = -1
                goto L_0x0055
            L_0x004d:
                java.lang.Object r2 = r0.first
                java.lang.Integer r2 = (java.lang.Integer) r2
                int r2 = r2.intValue()
            L_0x0055:
                java.lang.Object r4 = r0.second
                java.lang.Integer r4 = (java.lang.Integer) r4
                int r4 = r4.intValue()
                if (r4 == r6) goto L_0x0080
                java.lang.Object r4 = r1.first
                java.lang.Integer r4 = (java.lang.Integer) r4
                java.lang.Object r8 = r0.second
                boolean r4 = r4.equals(r8)
                if (r4 != 0) goto L_0x0077
                java.lang.Object r1 = r1.second
                java.lang.Integer r1 = (java.lang.Integer) r1
                java.lang.Object r4 = r0.second
                boolean r1 = r1.equals(r4)
                if (r1 == 0) goto L_0x0080
            L_0x0077:
                java.lang.Object r1 = r0.second
                java.lang.Integer r1 = (java.lang.Integer) r1
                int r1 = r1.intValue()
                goto L_0x0081
            L_0x0080:
                r1 = -1
            L_0x0081:
                if (r2 != r6) goto L_0x008b
                if (r1 != r6) goto L_0x008b
                android.util.Pair r10 = new android.util.Pair
                r10.<init>(r5, r7)
                return r10
            L_0x008b:
                if (r2 != r6) goto L_0x0097
                android.util.Pair r0 = new android.util.Pair
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r0.<init>(r1, r7)
                goto L_0x00a2
            L_0x0097:
                if (r1 != r6) goto L_0x00a2
                android.util.Pair r0 = new android.util.Pair
                java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
                r0.<init>(r1, r7)
            L_0x00a2:
                int r3 = r3 + 1
                goto L_0x0029
            L_0x00a5:
                return r0
            L_0x00a6:
                java.lang.String r0 = "/"
                boolean r1 = r10.contains(r0)
                r8 = 0
                if (r1 == 0) goto L_0x0105
                java.lang.String[] r10 = r10.split(r0, r6)
                int r0 = r10.length
                if (r0 != r4) goto L_0x00ff
                r0 = r10[r2]     // Catch:{ NumberFormatException -> 0x00ff }
                double r0 = java.lang.Double.parseDouble(r0)     // Catch:{ NumberFormatException -> 0x00ff }
                long r0 = (long) r0     // Catch:{ NumberFormatException -> 0x00ff }
                r10 = r10[r3]     // Catch:{ NumberFormatException -> 0x00ff }
                double r2 = java.lang.Double.parseDouble(r10)     // Catch:{ NumberFormatException -> 0x00ff }
                long r2 = (long) r2     // Catch:{ NumberFormatException -> 0x00ff }
                r10 = 10
                int r4 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
                if (r4 < 0) goto L_0x00f5
                int r4 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
                if (r4 >= 0) goto L_0x00d0
                goto L_0x00f5
            L_0x00d0:
                r4 = 5
                r8 = 2147483647(0x7fffffff, double:1.060997895E-314)
                int r6 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
                if (r6 > 0) goto L_0x00eb
                int r0 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
                if (r0 <= 0) goto L_0x00dd
                goto L_0x00eb
            L_0x00dd:
                android.util.Pair r0 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x00ff }
                java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ NumberFormatException -> 0x00ff }
                java.lang.Integer r1 = java.lang.Integer.valueOf(r4)     // Catch:{ NumberFormatException -> 0x00ff }
                r0.<init>(r10, r1)     // Catch:{ NumberFormatException -> 0x00ff }
                return r0
            L_0x00eb:
                android.util.Pair r10 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x00ff }
                java.lang.Integer r0 = java.lang.Integer.valueOf(r4)     // Catch:{ NumberFormatException -> 0x00ff }
                r10.<init>(r0, r7)     // Catch:{ NumberFormatException -> 0x00ff }
                return r10
            L_0x00f5:
                android.util.Pair r0 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x00ff }
                java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ NumberFormatException -> 0x00ff }
                r0.<init>(r10, r7)     // Catch:{ NumberFormatException -> 0x00ff }
                return r0
            L_0x00ff:
                android.util.Pair r10 = new android.util.Pair
                r10.<init>(r5, r7)
                return r10
            L_0x0105:
                long r0 = java.lang.Long.parseLong(r10)     // Catch:{ NumberFormatException -> 0x013c }
                r2 = 4
                int r3 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
                if (r3 < 0) goto L_0x0124
                r8 = 65535(0xffff, double:3.23786E-319)
                int r4 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
                if (r4 > 0) goto L_0x0124
                android.util.Pair r0 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x013c }
                r1 = 3
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ NumberFormatException -> 0x013c }
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ NumberFormatException -> 0x013c }
                r0.<init>(r1, r2)     // Catch:{ NumberFormatException -> 0x013c }
                return r0
            L_0x0124:
                if (r3 >= 0) goto L_0x0132
                android.util.Pair r0 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x013c }
                r1 = 9
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ NumberFormatException -> 0x013c }
                r0.<init>(r1, r7)     // Catch:{ NumberFormatException -> 0x013c }
                return r0
            L_0x0132:
                android.util.Pair r0 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x013c }
                java.lang.Integer r1 = java.lang.Integer.valueOf(r2)     // Catch:{ NumberFormatException -> 0x013c }
                r0.<init>(r1, r7)     // Catch:{ NumberFormatException -> 0x013c }
                return r0
            L_0x013c:
                java.lang.Double.parseDouble(r10)     // Catch:{ NumberFormatException -> 0x014b }
                android.util.Pair r10 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x014b }
                r0 = 12
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ NumberFormatException -> 0x014b }
                r10.<init>(r0, r7)     // Catch:{ NumberFormatException -> 0x014b }
                return r10
            L_0x014b:
                android.util.Pair r10 = new android.util.Pair
                r10.<init>(r5, r7)
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.veriff.sdk.camera.core.impl.utils.ExifData.Builder.guessDataFormat(java.lang.String):android.util.Pair");
        }

        private void setAttributeIfMissing(String str, String str2, List<Map<String, ExifAttribute>> list) {
            for (Map<String, ExifAttribute> containsKey : list) {
                if (containsKey.containsKey(str)) {
                    return;
                }
            }
            setAttributeInternal(str, str2, list);
        }

        private void setAttributeInternal(String str, String str2, List<Map<String, ExifAttribute>> list) {
            int i;
            String str3 = str;
            String str4 = str2;
            List<Map<String, ExifAttribute>> list2 = list;
            if (("DateTime".equals(str3) || "DateTimeOriginal".equals(str3) || "DateTimeDigitized".equals(str3)) && str4 != null) {
                boolean find = DATETIME_PRIMARY_FORMAT_PATTERN.matcher(str4).find();
                boolean find2 = DATETIME_SECONDARY_FORMAT_PATTERN.matcher(str4).find();
                if (str2.length() != 19 || (!find && !find2)) {
                    Logger.m32245w("ExifData", "Invalid value for " + str3 + " : " + str4);
                    return;
                } else if (find2) {
                    str4 = str4.replaceAll("-", ":");
                }
            }
            if ("ISOSpeedRatings".equals(str3)) {
                str3 = "PhotographicSensitivity";
            }
            String str5 = str3;
            int i2 = 2;
            int i3 = 1;
            if (str4 != null && ExifData.sTagSetForCompatibility.contains(str5)) {
                if (str5.equals("GPSTimeStamp")) {
                    Matcher matcher = GPS_TIMESTAMP_PATTERN.matcher(str4);
                    if (!matcher.find()) {
                        Logger.m32245w("ExifData", "Invalid value for " + str5 + " : " + str4);
                        return;
                    }
                    StringBuilder sb = new StringBuilder();
                    String group = matcher.group(1);
                    group.getClass();
                    sb.append(Integer.parseInt(group));
                    sb.append("/1,");
                    String group2 = matcher.group(2);
                    group2.getClass();
                    sb.append(Integer.parseInt(group2));
                    sb.append("/1,");
                    String group3 = matcher.group(3);
                    group3.getClass();
                    sb.append(Integer.parseInt(group3));
                    sb.append("/1");
                    str4 = sb.toString();
                } else {
                    try {
                        str4 = new LongRational(Double.parseDouble(str4)).toString();
                    } catch (NumberFormatException e) {
                        Logger.m32246w("ExifData", C25541a.m63882l("Invalid value for ", str5, " : ", str4), e);
                        return;
                    }
                }
            }
            char c = 0;
            int i4 = 0;
            Builder builder = this;
            while (i4 < ExifData.EXIF_TAGS.length) {
                ExifTag exifTag = (ExifTag) sExifTagMapsForWriting.get(i4).get(str5);
                if (exifTag != null) {
                    if (str4 != null) {
                        Pair<Integer, Integer> guessDataFormat = guessDataFormat(str4);
                        if (exifTag.primaryFormat == ((Integer) guessDataFormat.first).intValue() || exifTag.primaryFormat == ((Integer) guessDataFormat.second).intValue()) {
                            i = exifTag.primaryFormat;
                        } else {
                            int i5 = exifTag.secondaryFormat;
                            if (i5 == -1 || !(i5 == ((Integer) guessDataFormat.first).intValue() || exifTag.secondaryFormat == ((Integer) guessDataFormat.second).intValue())) {
                                int i6 = exifTag.primaryFormat;
                                if (i6 == i3 || i6 == 7 || i6 == i2) {
                                    i = i6;
                                }
                            } else {
                                i = exifTag.secondaryFormat;
                            }
                        }
                        String str6 = "/";
                        switch (i) {
                            case 1:
                                list2.get(i4).put(str5, ExifAttribute.createByte(str4));
                                continue;
                            case 2:
                            case 7:
                                list2.get(i4).put(str5, ExifAttribute.createString(str4));
                                continue;
                            case 3:
                                String[] split = str4.split(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, -1);
                                int[] iArr = new int[split.length];
                                for (int i7 = 0; i7 < split.length; i7++) {
                                    iArr[i7] = Integer.parseInt(split[i7]);
                                }
                                list2.get(i4).put(str5, ExifAttribute.createUShort(iArr, builder.mByteOrder));
                                continue;
                            case 4:
                                String[] split2 = str4.split(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, -1);
                                long[] jArr = new long[split2.length];
                                for (int i8 = 0; i8 < split2.length; i8++) {
                                    jArr[i8] = Long.parseLong(split2[i8]);
                                }
                                list2.get(i4).put(str5, ExifAttribute.createULong(jArr, builder.mByteOrder));
                                continue;
                            case 5:
                                String str7 = str6;
                                String[] split3 = str4.split(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, -1);
                                LongRational[] longRationalArr = new LongRational[split3.length];
                                int i9 = 0;
                                while (i9 < split3.length) {
                                    String[] split4 = split3[i9].split(str7, -1);
                                    longRationalArr[i9] = new LongRational((long) Double.parseDouble(split4[c]), (long) Double.parseDouble(split4[1]));
                                    i9++;
                                    c = 0;
                                }
                                list2.get(i4).put(str5, ExifAttribute.createURational(longRationalArr, builder.mByteOrder));
                                continue;
                            case 9:
                                String[] split5 = str4.split(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, -1);
                                int[] iArr2 = new int[split5.length];
                                for (int i11 = 0; i11 < split5.length; i11++) {
                                    iArr2[i11] = Integer.parseInt(split5[i11]);
                                }
                                list2.get(i4).put(str5, ExifAttribute.createSLong(iArr2, builder.mByteOrder));
                                continue;
                            case 10:
                                String[] split6 = str4.split(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, -1);
                                LongRational[] longRationalArr2 = new LongRational[split6.length];
                                int i12 = 0;
                                while (i12 < split6.length) {
                                    String[] split7 = split6[i12].split(str6, -1);
                                    longRationalArr2[i12] = new LongRational((long) Double.parseDouble(split7[c]), (long) Double.parseDouble(split7[i3]));
                                    i12++;
                                    i3 = 1;
                                    str6 = str6;
                                }
                                list2.get(i4).put(str5, ExifAttribute.createSRational(longRationalArr2, this.mByteOrder));
                                builder = this;
                                continue;
                            case 12:
                                String[] split8 = str4.split(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, -1);
                                double[] dArr = new double[split8.length];
                                for (int i13 = 0; i13 < split8.length; i13++) {
                                    dArr[i13] = Double.parseDouble(split8[i13]);
                                }
                                list2.get(i4).put(str5, ExifAttribute.createDouble(dArr, builder.mByteOrder));
                                break;
                        }
                    } else {
                        list2.get(i4).remove(str5);
                    }
                }
                i4++;
                i2 = 2;
                c = 0;
                i3 = 1;
            }
        }

        public ExifData build() {
            ArrayList list = Collections.list(new Enumeration<Map<String, ExifAttribute>>(this) {
                public final Enumeration<Map<String, ExifAttribute>> mMapEnumeration;

                {
                    this.mMapEnumeration = Collections.enumeration(r1.mAttributes);
                }

                public boolean hasMoreElements() {
                    return this.mMapEnumeration.hasMoreElements();
                }

                public Map<String, ExifAttribute> nextElement() {
                    return new HashMap(this.mMapEnumeration.nextElement());
                }
            });
            if (!((Map) list.get(1)).isEmpty()) {
                setAttributeIfMissing("ExposureProgram", String.valueOf(0), list);
                setAttributeIfMissing("ExifVersion", "0230", list);
                setAttributeIfMissing("ComponentsConfiguration", "1,2,3,0", list);
                setAttributeIfMissing("MeteringMode", String.valueOf(0), list);
                setAttributeIfMissing("LightSource", String.valueOf(0), list);
                setAttributeIfMissing("FlashpixVersion", "0100", list);
                setAttributeIfMissing("FocalPlaneResolutionUnit", String.valueOf(2), list);
                setAttributeIfMissing("FileSource", String.valueOf(3), list);
                setAttributeIfMissing("SceneType", String.valueOf(1), list);
                setAttributeIfMissing("CustomRendered", String.valueOf(0), list);
                setAttributeIfMissing("SceneCaptureType", String.valueOf(0), list);
                setAttributeIfMissing("Contrast", String.valueOf(0), list);
                setAttributeIfMissing("Saturation", String.valueOf(0), list);
                setAttributeIfMissing("Sharpness", String.valueOf(0), list);
            }
            if (!((Map) list.get(2)).isEmpty()) {
                setAttributeIfMissing("GPSVersionID", "2300", list);
                setAttributeIfMissing("GPSSpeedRef", "K", list);
                setAttributeIfMissing("GPSTrackRef", RequestConfiguration.MAX_AD_CONTENT_RATING_T, list);
                setAttributeIfMissing("GPSImgDirectionRef", RequestConfiguration.MAX_AD_CONTENT_RATING_T, list);
                setAttributeIfMissing("GPSDestBearingRef", RequestConfiguration.MAX_AD_CONTENT_RATING_T, list);
                setAttributeIfMissing("GPSDestDistanceRef", "K", list);
            }
            return new ExifData(this.mByteOrder, list);
        }

        public Builder setAttribute(String str, String str2) {
            setAttributeInternal(str, str2, this.mAttributes);
            return this;
        }

        public Builder setExposureTimeNanos(long j) {
            return setAttribute("ExposureTime", String.valueOf(((double) j) / ((double) TimeUnit.SECONDS.toNanos(1))));
        }

        public Builder setFlashState(CameraCaptureMetaData$FlashState cameraCaptureMetaData$FlashState) {
            int i;
            if (cameraCaptureMetaData$FlashState == CameraCaptureMetaData$FlashState.UNKNOWN) {
                return this;
            }
            int i2 = C125371.f31066x90dcf02e[cameraCaptureMetaData$FlashState.ordinal()];
            if (i2 == 1) {
                i = 0;
            } else if (i2 == 2) {
                i = 32;
            } else if (i2 != 3) {
                Logger.m32245w("ExifData", "Unknown flash state: " + cameraCaptureMetaData$FlashState);
                return this;
            } else {
                i = 1;
            }
            if ((i & 1) == 1) {
                setAttribute("LightSource", String.valueOf(4));
            }
            return setAttribute("Flash", String.valueOf(i));
        }

        public Builder setFocalLength(float f) {
            return setAttribute("FocalLength", new LongRational((long) (f * 1000.0f), 1000).toString());
        }

        public Builder setImageHeight(int i) {
            return setAttribute("ImageLength", String.valueOf(i));
        }

        public Builder setImageWidth(int i) {
            return setAttribute("ImageWidth", String.valueOf(i));
        }

        public Builder setIso(int i) {
            return setAttribute("SensitivityType", String.valueOf(3)).setAttribute("PhotographicSensitivity", String.valueOf(Math.min(65535, i)));
        }

        public Builder setLensFNumber(float f) {
            return setAttribute("FNumber", String.valueOf(f));
        }

        public Builder setOrientationDegrees(int i) {
            int i2;
            if (i == 0) {
                i2 = 1;
            } else if (i == 90) {
                i2 = 6;
            } else if (i == 180) {
                i2 = 3;
            } else if (i != 270) {
                Logger.m32245w("ExifData", "Unexpected orientation value: " + i + ". Must be one of 0, 90, 180, 270.");
                i2 = 0;
            } else {
                i2 = 8;
            }
            return setAttribute("Orientation", String.valueOf(i2));
        }

        public Builder setWhiteBalanceMode(WhiteBalanceMode whiteBalanceMode) {
            String str;
            int i = C125371.f31067xfb04fcd4[whiteBalanceMode.ordinal()];
            if (i == 1) {
                str = String.valueOf(0);
            } else if (i != 2) {
                str = null;
            } else {
                str = String.valueOf(1);
            }
            return setAttribute("WhiteBalance", str);
        }
    }

    public enum WhiteBalanceMode {
        AUTO,
        MANUAL
    }

    static {
        ExifTag[] exifTagArr = {new ExifTag("ImageWidth", 256, 3, 4), new ExifTag("ImageLength", 257, 3, 4), new ExifTag("Make", 271, 2), new ExifTag("Model", 272, 2), new ExifTag("Orientation", 274, 3), new ExifTag("XResolution", 282, 5), new ExifTag("YResolution", 283, 5), new ExifTag("ResolutionUnit", 296, 3), new ExifTag("Software", 305, 2), new ExifTag("DateTime", 306, 2), new ExifTag("YCbCrPositioning", 531, 3), new ExifTag("SubIFDPointer", 330, 4), new ExifTag("ExifIFDPointer", 34665, 4), new ExifTag("GPSInfoIFDPointer", 34853, 4)};
        ExifTag[] exifTagArr2 = {new ExifTag("ExposureTime", 33434, 5), new ExifTag("FNumber", 33437, 5), new ExifTag("ExposureProgram", 34850, 3), new ExifTag("PhotographicSensitivity", 34855, 3), new ExifTag("SensitivityType", 34864, 3), new ExifTag("ExifVersion", 36864, 2), new ExifTag("DateTimeOriginal", 36867, 2), new ExifTag("DateTimeDigitized", 36868, 2), new ExifTag("ComponentsConfiguration", 37121, 7), new ExifTag("ShutterSpeedValue", 37377, 10), new ExifTag("ApertureValue", 37378, 5), new ExifTag("BrightnessValue", 37379, 10), new ExifTag("ExposureBiasValue", 37380, 10), new ExifTag("MaxApertureValue", 37381, 5), new ExifTag("MeteringMode", 37383, 3), new ExifTag("LightSource", 37384, 3), new ExifTag("Flash", 37385, 3), new ExifTag("FocalLength", 37386, 5), new ExifTag("SubSecTime", 37520, 2), new ExifTag("SubSecTimeOriginal", 37521, 2), new ExifTag("SubSecTimeDigitized", 37522, 2), new ExifTag("FlashpixVersion", 40960, 7), new ExifTag("ColorSpace", 40961, 3), new ExifTag("PixelXDimension", 40962, 3, 4), new ExifTag("PixelYDimension", 40963, 3, 4), new ExifTag("InteroperabilityIFDPointer", 40965, 4), new ExifTag("FocalPlaneResolutionUnit", 41488, 3), new ExifTag("SensingMethod", 41495, 3), new ExifTag("FileSource", 41728, 7), new ExifTag("SceneType", 41729, 7), new ExifTag("CustomRendered", 41985, 3), new ExifTag("ExposureMode", 41986, 3), new ExifTag("WhiteBalance", 41987, 3), new ExifTag("SceneCaptureType", 41990, 3), new ExifTag("Contrast", 41992, 3), new ExifTag("Saturation", 41993, 3), new ExifTag("Sharpness", 41994, 3)};
        ExifTag[] exifTagArr3 = {new ExifTag("GPSVersionID", 0, 1), new ExifTag("GPSLatitudeRef", 1, 2), new ExifTag("GPSLatitude", 2, 5, 10), new ExifTag("GPSLongitudeRef", 3, 2), new ExifTag("GPSLongitude", 4, 5, 10), new ExifTag("GPSAltitudeRef", 5, 1), new ExifTag("GPSAltitude", 6, 5), new ExifTag("GPSTimeStamp", 7, 5), new ExifTag("GPSSpeedRef", 12, 2), new ExifTag("GPSTrackRef", 14, 2), new ExifTag("GPSImgDirectionRef", 16, 2), new ExifTag("GPSDestBearingRef", 23, 2), new ExifTag("GPSDestDistanceRef", 25, 2)};
        EXIF_TAGS = new ExifTag[][]{exifTagArr, exifTagArr2, exifTagArr3, new ExifTag[]{new ExifTag("InteroperabilityIndex", 1, 2)}};
    }

    public ExifData(ByteOrder byteOrder, List<Map<String, ExifAttribute>> list) {
        boolean z;
        if (list.size() == EXIF_TAGS.length) {
            z = true;
        } else {
            z = false;
        }
        C24361g.m61193w("Malformed attributes list. Number of IFDs mismatch.", z);
        this.mByteOrder = byteOrder;
        this.mAttributes = list;
    }

    public static Builder builderForDevice() {
        return new Builder(ByteOrder.BIG_ENDIAN).setAttribute("Orientation", String.valueOf(1)).setAttribute("XResolution", "72/1").setAttribute("YResolution", "72/1").setAttribute("ResolutionUnit", String.valueOf(2)).setAttribute("YCbCrPositioning", String.valueOf(1)).setAttribute("Make", Build.MANUFACTURER).setAttribute("Model", Build.MODEL);
    }

    public Map<String, ExifAttribute> getAttributes(int i) {
        C24361g.m61179p(i, 0, C25541a.m63878h("Invalid IFD index: ", i, ". Index should be between [0, EXIF_TAGS.length] "), EXIF_TAGS.length);
        return this.mAttributes.get(i);
    }

    public ByteOrder getByteOrder() {
        return this.mByteOrder;
    }
}
