package com.moovit.commons.utils;

import java.util.Locale;

public enum DataUnit {
    B {
        public double convert(double d, DataUnit dataUnit) {
            return dataUnit.toBytes(d);
        }

        public double toBytes(double d) {
            return d;
        }

        public double toGibibytes(double d) {
            return DataUnit.m40227d(d, DataUnit.f41013Gi, DataUnit.BYTE);
        }

        public double toGigabytes(double d) {
            return DataUnit.m40227d(d, DataUnit.f41011G, DataUnit.BYTE);
        }

        public double toKibibytes(double d) {
            return DataUnit.m40227d(d, DataUnit.f41016Ki, DataUnit.BYTE);
        }

        public double toKilobytes(double d) {
            return DataUnit.m40227d(d, DataUnit.f41014K, DataUnit.BYTE);
        }

        public double toMebibytes(double d) {
            return DataUnit.m40227d(d, DataUnit.f41019Mi, DataUnit.BYTE);
        }

        public double toMegabytes(double d) {
            return DataUnit.m40227d(d, DataUnit.f41017M, DataUnit.BYTE);
        }

        public double toPebibytes(double d) {
            return DataUnit.m40227d(d, DataUnit.f41022Pi, DataUnit.BYTE);
        }

        public double toPetabytes(double d) {
            return DataUnit.m40227d(d, DataUnit.f41020P, DataUnit.BYTE);
        }

        public double toTebibytes(double d) {
            return DataUnit.m40227d(d, DataUnit.f41025Ti, DataUnit.BYTE);
        }

        public double toTerabytes(double d) {
            return DataUnit.m40227d(d, DataUnit.f41023T, DataUnit.BYTE);
        }
    },
    KB {
        public double convert(double d, DataUnit dataUnit) {
            return dataUnit.toKilobytes(d);
        }

        public double toBytes(double d) {
            return DataUnit.m40228m(d, DataUnit.f41014K, DataUnit.BYTE);
        }

        public double toGibibytes(double d) {
            return DataUnit.m40227d(d, DataUnit.f41013Gi, DataUnit.f41014K);
        }

        public double toGigabytes(double d) {
            return DataUnit.m40227d(d, DataUnit.f41011G, DataUnit.f41014K);
        }

        public double toKibibytes(double d) {
            return DataUnit.m40227d(d, DataUnit.f41016Ki, DataUnit.f41014K);
        }

        public double toKilobytes(double d) {
            return d;
        }

        public double toMebibytes(double d) {
            return DataUnit.m40227d(d, DataUnit.f41019Mi, DataUnit.f41014K);
        }

        public double toMegabytes(double d) {
            return DataUnit.m40227d(d, DataUnit.f41017M, DataUnit.f41014K);
        }

        public double toPebibytes(double d) {
            return DataUnit.m40227d(d, DataUnit.f41022Pi, DataUnit.f41014K);
        }

        public double toPetabytes(double d) {
            return DataUnit.m40227d(d, DataUnit.f41020P, DataUnit.f41014K);
        }

        public double toTebibytes(double d) {
            return DataUnit.m40227d(d, DataUnit.f41025Ti, DataUnit.f41014K);
        }

        public double toTerabytes(double d) {
            return DataUnit.m40227d(d, DataUnit.f41023T, DataUnit.f41014K);
        }
    },
    KiB {
        public double convert(double d, DataUnit dataUnit) {
            return dataUnit.toKibibytes(d);
        }

        public double toBytes(double d) {
            return DataUnit.m40228m(d, DataUnit.f41016Ki, DataUnit.BYTE);
        }

        public double toGibibytes(double d) {
            return DataUnit.m40227d(d, DataUnit.f41013Gi, DataUnit.f41016Ki);
        }

        public double toGigabytes(double d) {
            return DataUnit.m40227d(d, DataUnit.f41011G, DataUnit.f41016Ki);
        }

        public double toKibibytes(double d) {
            return d;
        }

        public double toKilobytes(double d) {
            return DataUnit.m40228m(d, DataUnit.f41016Ki, DataUnit.f41014K);
        }

        public double toMebibytes(double d) {
            return DataUnit.m40227d(d, DataUnit.f41019Mi, DataUnit.f41016Ki);
        }

        public double toMegabytes(double d) {
            return DataUnit.m40227d(d, DataUnit.f41017M, DataUnit.f41016Ki);
        }

        public double toPebibytes(double d) {
            return DataUnit.m40227d(d, DataUnit.f41022Pi, DataUnit.f41016Ki);
        }

        public double toPetabytes(double d) {
            return DataUnit.m40227d(d, DataUnit.f41020P, DataUnit.f41016Ki);
        }

        public double toTebibytes(double d) {
            return DataUnit.m40227d(d, DataUnit.f41025Ti, DataUnit.f41016Ki);
        }

        public double toTerabytes(double d) {
            return DataUnit.m40227d(d, DataUnit.f41023T, DataUnit.f41016Ki);
        }
    },
    MB {
        public double convert(double d, DataUnit dataUnit) {
            return dataUnit.toMegabytes(d);
        }

        public double toBytes(double d) {
            return DataUnit.m40228m(d, DataUnit.f41017M, DataUnit.BYTE);
        }

        public double toGibibytes(double d) {
            return DataUnit.m40227d(d, DataUnit.f41013Gi, DataUnit.f41017M);
        }

        public double toGigabytes(double d) {
            return DataUnit.m40227d(d, DataUnit.f41011G, DataUnit.f41017M);
        }

        public double toKibibytes(double d) {
            return DataUnit.m40228m(d, DataUnit.f41017M, DataUnit.f41016Ki);
        }

        public double toKilobytes(double d) {
            return DataUnit.m40228m(d, DataUnit.f41017M, DataUnit.f41014K);
        }

        public double toMebibytes(double d) {
            return DataUnit.m40227d(d, DataUnit.f41019Mi, DataUnit.f41017M);
        }

        public double toMegabytes(double d) {
            return d;
        }

        public double toPebibytes(double d) {
            return DataUnit.m40227d(d, DataUnit.f41022Pi, DataUnit.f41017M);
        }

        public double toPetabytes(double d) {
            return DataUnit.m40227d(d, DataUnit.f41020P, DataUnit.f41017M);
        }

        public double toTebibytes(double d) {
            return DataUnit.m40227d(d, DataUnit.f41025Ti, DataUnit.f41017M);
        }

        public double toTerabytes(double d) {
            return DataUnit.m40227d(d, DataUnit.f41023T, DataUnit.f41017M);
        }
    },
    MiB {
        public double convert(double d, DataUnit dataUnit) {
            return dataUnit.toMebibytes(d);
        }

        public double toBytes(double d) {
            return DataUnit.m40228m(d, DataUnit.f41019Mi, DataUnit.BYTE);
        }

        public double toGibibytes(double d) {
            return DataUnit.m40227d(d, DataUnit.f41013Gi, DataUnit.f41019Mi);
        }

        public double toGigabytes(double d) {
            return DataUnit.m40227d(d, DataUnit.f41011G, DataUnit.f41019Mi);
        }

        public double toKibibytes(double d) {
            return DataUnit.m40228m(d, DataUnit.f41019Mi, DataUnit.f41016Ki);
        }

        public double toKilobytes(double d) {
            return DataUnit.m40228m(d, DataUnit.f41019Mi, DataUnit.f41014K);
        }

        public double toMebibytes(double d) {
            return d;
        }

        public double toMegabytes(double d) {
            return DataUnit.m40228m(d, DataUnit.f41019Mi, DataUnit.f41017M);
        }

        public double toPebibytes(double d) {
            return DataUnit.m40227d(d, DataUnit.f41022Pi, DataUnit.f41019Mi);
        }

        public double toPetabytes(double d) {
            return DataUnit.m40227d(d, DataUnit.f41020P, DataUnit.f41019Mi);
        }

        public double toTebibytes(double d) {
            return DataUnit.m40227d(d, DataUnit.f41025Ti, DataUnit.f41019Mi);
        }

        public double toTerabytes(double d) {
            return DataUnit.m40227d(d, DataUnit.f41023T, DataUnit.f41019Mi);
        }
    },
    GB {
        public double convert(double d, DataUnit dataUnit) {
            return dataUnit.toGigabytes(d);
        }

        public double toBytes(double d) {
            return DataUnit.m40228m(d, DataUnit.f41011G, DataUnit.BYTE);
        }

        public double toGibibytes(double d) {
            return DataUnit.m40227d(d, DataUnit.f41013Gi, DataUnit.f41011G);
        }

        public double toGigabytes(double d) {
            return d;
        }

        public double toKibibytes(double d) {
            return DataUnit.m40228m(d, DataUnit.f41011G, DataUnit.f41016Ki);
        }

        public double toKilobytes(double d) {
            return DataUnit.m40228m(d, DataUnit.f41011G, DataUnit.f41014K);
        }

        public double toMebibytes(double d) {
            return DataUnit.m40228m(d, DataUnit.f41011G, DataUnit.f41019Mi);
        }

        public double toMegabytes(double d) {
            return DataUnit.m40228m(d, DataUnit.f41011G, DataUnit.f41017M);
        }

        public double toPebibytes(double d) {
            return DataUnit.m40227d(d, DataUnit.f41022Pi, DataUnit.f41011G);
        }

        public double toPetabytes(double d) {
            return DataUnit.m40227d(d, DataUnit.f41020P, DataUnit.f41011G);
        }

        public double toTebibytes(double d) {
            return DataUnit.m40227d(d, DataUnit.f41025Ti, DataUnit.f41011G);
        }

        public double toTerabytes(double d) {
            return DataUnit.m40227d(d, DataUnit.f41023T, DataUnit.f41011G);
        }
    },
    GiB {
        public double convert(double d, DataUnit dataUnit) {
            return dataUnit.toGibibytes(d);
        }

        public double toBytes(double d) {
            return DataUnit.m40228m(d, DataUnit.f41013Gi, DataUnit.BYTE);
        }

        public double toGibibytes(double d) {
            return d;
        }

        public double toGigabytes(double d) {
            return DataUnit.m40228m(d, DataUnit.f41013Gi, DataUnit.f41011G);
        }

        public double toKibibytes(double d) {
            return DataUnit.m40228m(d, DataUnit.f41013Gi, DataUnit.f41016Ki);
        }

        public double toKilobytes(double d) {
            return DataUnit.m40228m(d, DataUnit.f41013Gi, DataUnit.f41014K);
        }

        public double toMebibytes(double d) {
            return DataUnit.m40228m(d, DataUnit.f41013Gi, DataUnit.f41019Mi);
        }

        public double toMegabytes(double d) {
            return DataUnit.m40228m(d, DataUnit.f41013Gi, DataUnit.f41017M);
        }

        public double toPebibytes(double d) {
            return DataUnit.m40227d(d, DataUnit.f41022Pi, DataUnit.f41013Gi);
        }

        public double toPetabytes(double d) {
            return DataUnit.m40227d(d, DataUnit.f41020P, DataUnit.f41013Gi);
        }

        public double toTebibytes(double d) {
            return DataUnit.m40227d(d, DataUnit.f41025Ti, DataUnit.f41013Gi);
        }

        public double toTerabytes(double d) {
            return DataUnit.m40227d(d, DataUnit.f41023T, DataUnit.f41013Gi);
        }
    },
    TB {
        public double convert(double d, DataUnit dataUnit) {
            return dataUnit.toTerabytes(d);
        }

        public double toBytes(double d) {
            return DataUnit.m40228m(d, DataUnit.f41023T, DataUnit.BYTE);
        }

        public double toGibibytes(double d) {
            return DataUnit.m40228m(d, DataUnit.f41023T, DataUnit.f41013Gi);
        }

        public double toGigabytes(double d) {
            return DataUnit.m40228m(d, DataUnit.f41023T, DataUnit.f41011G);
        }

        public double toKibibytes(double d) {
            return DataUnit.m40228m(d, DataUnit.f41023T, DataUnit.f41016Ki);
        }

        public double toKilobytes(double d) {
            return DataUnit.m40228m(d, DataUnit.f41023T, DataUnit.f41014K);
        }

        public double toMebibytes(double d) {
            return DataUnit.m40228m(d, DataUnit.f41023T, DataUnit.f41019Mi);
        }

        public double toMegabytes(double d) {
            return DataUnit.m40228m(d, DataUnit.f41023T, DataUnit.f41017M);
        }

        public double toPebibytes(double d) {
            return DataUnit.m40227d(d, DataUnit.f41022Pi, DataUnit.f41023T);
        }

        public double toPetabytes(double d) {
            return DataUnit.m40227d(d, DataUnit.f41020P, DataUnit.f41023T);
        }

        public double toTebibytes(double d) {
            return DataUnit.m40227d(d, DataUnit.f41025Ti, DataUnit.f41023T);
        }

        public double toTerabytes(double d) {
            return d;
        }
    },
    TiB {
        public double convert(double d, DataUnit dataUnit) {
            return dataUnit.toTebibytes(d);
        }

        public double toBytes(double d) {
            return DataUnit.m40228m(d, DataUnit.f41025Ti, DataUnit.BYTE);
        }

        public double toGibibytes(double d) {
            return DataUnit.m40228m(d, DataUnit.f41025Ti, DataUnit.f41013Gi);
        }

        public double toGigabytes(double d) {
            return DataUnit.m40228m(d, DataUnit.f41025Ti, DataUnit.f41011G);
        }

        public double toKibibytes(double d) {
            return DataUnit.m40228m(d, DataUnit.f41025Ti, DataUnit.f41016Ki);
        }

        public double toKilobytes(double d) {
            return DataUnit.m40228m(d, DataUnit.f41025Ti, DataUnit.f41014K);
        }

        public double toMebibytes(double d) {
            return DataUnit.m40228m(d, DataUnit.f41025Ti, DataUnit.f41019Mi);
        }

        public double toMegabytes(double d) {
            return DataUnit.m40228m(d, DataUnit.f41025Ti, DataUnit.f41017M);
        }

        public double toPebibytes(double d) {
            return DataUnit.m40227d(d, DataUnit.f41022Pi, DataUnit.f41025Ti);
        }

        public double toPetabytes(double d) {
            return DataUnit.m40227d(d, DataUnit.f41020P, DataUnit.f41025Ti);
        }

        public double toTebibytes(double d) {
            return d;
        }

        public double toTerabytes(double d) {
            return DataUnit.m40228m(d, DataUnit.f41025Ti, DataUnit.f41023T);
        }
    },
    PB {
        public double convert(double d, DataUnit dataUnit) {
            return dataUnit.toPetabytes(d);
        }

        public double toBytes(double d) {
            return DataUnit.m40228m(d, DataUnit.f41020P, DataUnit.BYTE);
        }

        public double toGibibytes(double d) {
            return DataUnit.m40228m(d, DataUnit.f41020P, DataUnit.f41013Gi);
        }

        public double toGigabytes(double d) {
            return DataUnit.m40228m(d, DataUnit.f41020P, DataUnit.f41011G);
        }

        public double toKibibytes(double d) {
            return DataUnit.m40228m(d, DataUnit.f41020P, DataUnit.f41016Ki);
        }

        public double toKilobytes(double d) {
            return DataUnit.m40228m(d, DataUnit.f41020P, DataUnit.f41014K);
        }

        public double toMebibytes(double d) {
            return DataUnit.m40228m(d, DataUnit.f41020P, DataUnit.f41019Mi);
        }

        public double toMegabytes(double d) {
            return DataUnit.m40228m(d, DataUnit.f41020P, DataUnit.f41017M);
        }

        public double toPebibytes(double d) {
            return DataUnit.m40227d(d, DataUnit.f41022Pi, DataUnit.f41020P);
        }

        public double toPetabytes(double d) {
            return d;
        }

        public double toTebibytes(double d) {
            return DataUnit.m40228m(d, DataUnit.f41020P, DataUnit.f41025Ti);
        }

        public double toTerabytes(double d) {
            return DataUnit.m40228m(d, DataUnit.f41020P, DataUnit.f41023T);
        }
    },
    PiB {
        public double convert(double d, DataUnit dataUnit) {
            return dataUnit.toPebibytes(d);
        }

        public double toBytes(double d) {
            return DataUnit.m40228m(d, DataUnit.f41022Pi, DataUnit.BYTE);
        }

        public double toGibibytes(double d) {
            return DataUnit.m40228m(d, DataUnit.f41022Pi, DataUnit.f41013Gi);
        }

        public double toGigabytes(double d) {
            return DataUnit.m40228m(d, DataUnit.f41022Pi, DataUnit.f41011G);
        }

        public double toKibibytes(double d) {
            return DataUnit.m40228m(d, DataUnit.f41022Pi, DataUnit.f41016Ki);
        }

        public double toKilobytes(double d) {
            return DataUnit.m40228m(d, DataUnit.f41022Pi, DataUnit.f41014K);
        }

        public double toMebibytes(double d) {
            return DataUnit.m40228m(d, DataUnit.f41022Pi, DataUnit.f41019Mi);
        }

        public double toMegabytes(double d) {
            return DataUnit.m40228m(d, DataUnit.f41022Pi, DataUnit.f41017M);
        }

        public double toPebibytes(double d) {
            return d;
        }

        public double toPetabytes(double d) {
            return DataUnit.m40228m(d, DataUnit.f41022Pi, DataUnit.f41025Ti);
        }

        public double toTebibytes(double d) {
            return DataUnit.m40228m(d, DataUnit.f41022Pi, DataUnit.f41025Ti);
        }

        public double toTerabytes(double d) {
            return DataUnit.m40228m(d, DataUnit.f41022Pi, DataUnit.f41023T);
        }
    };
    
    private static final double BYTE = 1.0d;

    /* renamed from: G */
    private static final double f41011G = 1.0E9d;

    /* renamed from: Gi */
    private static final double f41013Gi = 1.073741824E9d;

    /* renamed from: K */
    private static final double f41014K = 1000.0d;

    /* renamed from: Ki */
    private static final double f41016Ki = 1024.0d;

    /* renamed from: M */
    private static final double f41017M = 1000000.0d;

    /* renamed from: Mi */
    private static final double f41019Mi = 1048576.0d;

    /* renamed from: P */
    private static final double f41020P = 1.0E15d;

    /* renamed from: Pi */
    private static final double f41022Pi = 1.125899906842624E15d;

    /* renamed from: T */
    private static final double f41023T = 1.0E12d;

    /* renamed from: Ti */
    private static final double f41025Ti = 1.099511627776E12d;

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static double m40227d(double d, double d2, double d3) {
        return d / (d2 / d3);
    }

    public static String formatSize(long j) {
        return formatSize(j, false);
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public static double m40228m(double d, double d2, double d3) {
        double d4 = d2 / d3;
        double d5 = Double.MAX_VALUE / d4;
        if (d > d5) {
            return Double.MAX_VALUE;
        }
        if (d < (-d5)) {
            return Double.MIN_VALUE;
        }
        return d * d4;
    }

    public abstract double convert(double d, DataUnit dataUnit);

    public abstract double toBytes(double d);

    public abstract double toGibibytes(double d);

    public abstract double toGigabytes(double d);

    public abstract double toKibibytes(double d);

    public abstract double toKilobytes(double d);

    public abstract double toMebibytes(double d);

    public abstract double toMegabytes(double d);

    public abstract double toPebibytes(double d);

    public abstract double toPetabytes(double d);

    public abstract double toTebibytes(double d);

    public abstract double toTerabytes(double d);

    public static String formatSize(long j, boolean z) {
        double[] dArr = new double[5];
        if (z) {
            // fill-array-data instruction
            dArr[0] = 4652007308841189376;
            dArr[1] = 4696837146684686336;
            dArr[2] = 4741671816366391296;
            dArr[3] = 4786511204640096256;
            dArr[4] = 4831355200913801216;
        } else {
            // fill-array-data instruction
            dArr[0] = 4652218415073722368;
            dArr[1] = 4697254411347427328;
            dArr[2] = 4742290407621132288;
            dArr[3] = 4787326403894837248;
            dArr[4] = 4832362400168542208;
        }
        DataUnit[] dataUnitArr = z ? new DataUnit[]{B, KB, MB, GB, TB, PB} : new DataUnit[]{B, KiB, MiB, GiB, TiB, PiB};
        int i = 0;
        while (i < dArr.length) {
            if (((double) j) <= dArr[i]) {
                break;
            }
            i++;
        }
        DataUnit dataUnit = dataUnitArr[i];
        return String.format(Locale.ENGLISH, "%.2f %s", new Object[]{Double.valueOf(dataUnit.convert((double) j, B)), dataUnit.name()});
    }
}
