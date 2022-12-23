package com.google.android.gms.tagmanager;

final class zzfu extends Number implements Comparable<zzfu> {
    private double zza;
    private long zzb;
    private final boolean zzc = false;

    private zzfu(double d) {
        this.zza = d;
    }

    public static zzfu zzc(Double d) {
        return new zzfu(d.doubleValue());
    }

    public static zzfu zzd(long j) {
        return new zzfu(j);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0013, code lost:
        return new com.google.android.gms.tagmanager.zzfu(java.lang.Double.parseDouble(r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0023, code lost:
        throw new java.lang.NumberFormatException(java.lang.String.valueOf(r3).concat(" is not a valid TypedNumber"));
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x000a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.tagmanager.zzfu zze(java.lang.String r3) throws java.lang.NumberFormatException {
        /*
            com.google.android.gms.tagmanager.zzfu r0 = new com.google.android.gms.tagmanager.zzfu     // Catch:{ NumberFormatException -> 0x000a }
            long r1 = java.lang.Long.parseLong(r3)     // Catch:{ NumberFormatException -> 0x000a }
            r0.<init>((long) r1)     // Catch:{ NumberFormatException -> 0x000a }
            return r0
        L_0x000a:
            com.google.android.gms.tagmanager.zzfu r0 = new com.google.android.gms.tagmanager.zzfu     // Catch:{ NumberFormatException -> 0x0014 }
            double r1 = java.lang.Double.parseDouble(r3)     // Catch:{ NumberFormatException -> 0x0014 }
            r0.<init>((double) r1)     // Catch:{ NumberFormatException -> 0x0014 }
            return r0
        L_0x0014:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r1 = " is not a valid TypedNumber"
            java.lang.String r3 = r3.concat(r1)
            r0.<init>(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.tagmanager.zzfu.zze(java.lang.String):com.google.android.gms.tagmanager.zzfu");
    }

    public final byte byteValue() {
        return (byte) ((int) zzb());
    }

    public final double doubleValue() {
        return this.zzc ? (double) this.zzb : this.zza;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zzfu) && compareTo((zzfu) obj) == 0;
    }

    public final float floatValue() {
        return (float) doubleValue();
    }

    public final int hashCode() {
        return new Long(zzb()).hashCode();
    }

    public final int intValue() {
        return (int) zzb();
    }

    public final long longValue() {
        return zzb();
    }

    public final short shortValue() {
        return (short) ((int) zzb());
    }

    public final String toString() {
        return this.zzc ? Long.toString(this.zzb) : Double.toString(this.zza);
    }

    /* renamed from: zza */
    public final int compareTo(zzfu zzfu) {
        if (!this.zzc || !zzfu.zzc) {
            return Double.compare(doubleValue(), zzfu.doubleValue());
        }
        return new Long(this.zzb).compareTo(Long.valueOf(zzfu.zzb));
    }

    public final long zzb() {
        return this.zzc ? this.zzb : (long) this.zza;
    }

    public final boolean zzf() {
        return !this.zzc;
    }

    public final boolean zzg() {
        return this.zzc;
    }

    private zzfu(long j) {
        this.zzb = j;
    }
}
