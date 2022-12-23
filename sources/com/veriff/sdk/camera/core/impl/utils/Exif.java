package com.veriff.sdk.camera.core.impl.utils;

import android.location.Location;
import java.io.IOException;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import p034c2.C1759a;
import p358af.C13437d;

public final class Exif {
    private static final ThreadLocal<SimpleDateFormat> DATETIME_FORMAT = new ThreadLocal<SimpleDateFormat>() {
        public SimpleDateFormat initialValue() {
            return new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", Locale.US);
        }
    };
    private static final ThreadLocal<SimpleDateFormat> DATE_FORMAT = new ThreadLocal<SimpleDateFormat>() {
        public SimpleDateFormat initialValue() {
            return new SimpleDateFormat("yyyy:MM:dd", Locale.US);
        }
    };
    private static final String TAG = "Exif";
    private static final ThreadLocal<SimpleDateFormat> TIME_FORMAT = new ThreadLocal<SimpleDateFormat>() {
        public SimpleDateFormat initialValue() {
            return new SimpleDateFormat("HH:mm:ss", Locale.US);
        }
    };
    private final C1759a mExifInterface;

    public static final class Speed {

        public static final class Converter {
            public final double mMph;

            public Converter(double d) {
                this.mMph = d;
            }

            public double toMetersPerSecond() {
                return this.mMph / 2.23694d;
            }
        }

        public static Converter fromKilometersPerHour(double d) {
            return new Converter(d * 0.621371d);
        }

        public static Converter fromKnots(double d) {
            return new Converter(d * 1.15078d);
        }

        public static Converter fromMilesPerHour(double d) {
            return new Converter(d);
        }
    }

    private Exif(C1759a aVar) {
        this.mExifInterface = aVar;
    }

    private static Date convertFromExifDate(String str) throws ParseException {
        return DATE_FORMAT.get().parse(str);
    }

    private static Date convertFromExifDateTime(String str) throws ParseException {
        return DATETIME_FORMAT.get().parse(str);
    }

    private static Date convertFromExifTime(String str) throws ParseException {
        return TIME_FORMAT.get().parse(str);
    }

    public static Exif createFromInputStream(InputStream inputStream) throws IOException {
        return new Exif(new C1759a(inputStream));
    }

    private long parseTimestamp(String str, String str2) {
        if (str == null && str2 == null) {
            return -1;
        }
        if (str2 == null) {
            try {
                return convertFromExifDate(str).getTime();
            } catch (ParseException unused) {
                return -1;
            }
        } else if (str != null) {
            return parseTimestamp(C13437d.m33706k(str, " ", str2));
        } else {
            try {
                return convertFromExifTime(str2).getTime();
            } catch (ParseException unused2) {
                return -1;
            }
        }
    }

    public String getDescription() {
        return this.mExifInterface.mo6532e("ImageDescription");
    }

    public int getHeight() {
        return this.mExifInterface.mo6534g(0, "ImageLength");
    }

    public Location getLocation() {
        double d;
        String e = this.mExifInterface.mo6532e("GPSProcessingMethod");
        double[] k = this.mExifInterface.mo6538k();
        double d2 = this.mExifInterface.mo6531d();
        double f = this.mExifInterface.mo6533f(0.0d, "GPSSpeed");
        String e2 = this.mExifInterface.mo6532e("GPSSpeedRef");
        if (e2 == null) {
            e2 = "K";
        }
        long parseTimestamp = parseTimestamp(this.mExifInterface.mo6532e("GPSDateStamp"), this.mExifInterface.mo6532e("GPSTimeStamp"));
        if (k == null) {
            return null;
        }
        if (e == null) {
            e = TAG;
        }
        Location location = new Location(e);
        location.setLatitude(k[0]);
        location.setLongitude(k[1]);
        if (d2 != 0.0d) {
            location.setAltitude(d2);
        }
        if (f != 0.0d) {
            char c = 65535;
            int hashCode = e2.hashCode();
            if (hashCode != 75) {
                if (hashCode != 77) {
                    if (hashCode == 78 && e2.equals("N")) {
                        c = 1;
                    }
                } else if (e2.equals("M")) {
                    c = 0;
                }
            } else if (e2.equals("K")) {
                c = 2;
            }
            if (c == 0) {
                d = Speed.fromMilesPerHour(f).toMetersPerSecond();
            } else if (c != 1) {
                d = Speed.fromKilometersPerHour(f).toMetersPerSecond();
            } else {
                d = Speed.fromKnots(f).toMetersPerSecond();
            }
            location.setSpeed((float) d);
        }
        if (parseTimestamp != -1) {
            location.setTime(parseTimestamp);
        }
        return location;
    }

    public int getOrientation() {
        return this.mExifInterface.mo6534g(0, "Orientation");
    }

    public int getRotation() {
        switch (getOrientation()) {
            case 3:
            case 4:
                return 180;
            case 5:
                return 270;
            case 6:
            case 7:
                return 90;
            case 8:
                return 270;
            default:
                return 0;
        }
    }

    public long getTimestamp() {
        long parseTimestamp = parseTimestamp(this.mExifInterface.mo6532e("DateTimeOriginal"));
        if (parseTimestamp == -1) {
            return -1;
        }
        String e = this.mExifInterface.mo6532e("SubSecTimeOriginal");
        if (e == null) {
            return parseTimestamp;
        }
        try {
            long parseLong = Long.parseLong(e);
            while (parseLong > 1000) {
                parseLong /= 10;
            }
            return parseTimestamp + parseLong;
        } catch (NumberFormatException unused) {
            return parseTimestamp;
        }
    }

    public int getWidth() {
        return this.mExifInterface.mo6534g(0, "ImageWidth");
    }

    public boolean isFlippedHorizontally() {
        return getOrientation() == 2;
    }

    public boolean isFlippedVertically() {
        int orientation = getOrientation();
        return orientation == 4 || orientation == 5 || orientation == 7;
    }

    public String toString() {
        return String.format(Locale.ENGLISH, "Exif{width=%s, height=%s, rotation=%d, isFlippedVertically=%s, isFlippedHorizontally=%s, location=%s, timestamp=%s, description=%s}", new Object[]{Integer.valueOf(getWidth()), Integer.valueOf(getHeight()), Integer.valueOf(getRotation()), Boolean.valueOf(isFlippedVertically()), Boolean.valueOf(isFlippedHorizontally()), getLocation(), Long.valueOf(getTimestamp()), getDescription()});
    }

    private long parseTimestamp(String str) {
        if (str == null) {
            return -1;
        }
        try {
            return convertFromExifDateTime(str).getTime();
        } catch (ParseException unused) {
            return -1;
        }
    }
}
