package com.veriff.sdk.internal;

import java.io.PrintWriter;

/* renamed from: com.veriff.sdk.internal.cq */
public class C21535cq {

    /* renamed from: a */
    public final int f54203a;

    /* renamed from: b */
    public final int f54204b;

    /* renamed from: c */
    public final long f54205c;

    /* renamed from: d */
    public final long f54206d;

    /* renamed from: e */
    public final long f54207e;

    /* renamed from: f */
    public final long f54208f;

    /* renamed from: g */
    public final long f54209g;

    /* renamed from: h */
    public final long f54210h;

    /* renamed from: i */
    public final long f54211i;

    /* renamed from: j */
    public final long f54212j;

    /* renamed from: k */
    public final int f54213k;

    /* renamed from: l */
    public final int f54214l;

    /* renamed from: m */
    public final int f54215m;

    /* renamed from: n */
    public final long f54216n;

    public C21535cq(int i, int i2, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, int i3, int i4, int i5, long j9) {
        this.f54203a = i;
        this.f54204b = i2;
        this.f54205c = j;
        this.f54206d = j2;
        this.f54207e = j3;
        this.f54208f = j4;
        this.f54209g = j5;
        this.f54210h = j6;
        this.f54211i = j7;
        this.f54212j = j8;
        this.f54213k = i3;
        this.f54214l = i4;
        this.f54215m = i5;
        this.f54216n = j9;
    }

    /* renamed from: a */
    public void mo54547a(PrintWriter printWriter) {
        printWriter.println("===============BEGIN PICASSO STATS ===============");
        printWriter.println("Memory Cache Stats");
        printWriter.print("  Max Cache Size: ");
        printWriter.println(this.f54203a);
        printWriter.print("  Cache Size: ");
        printWriter.println(this.f54204b);
        printWriter.print("  Cache % Full: ");
        printWriter.println((int) Math.ceil((double) ((((float) this.f54204b) / ((float) this.f54203a)) * 100.0f)));
        printWriter.print("  Cache Hits: ");
        printWriter.println(this.f54205c);
        printWriter.print("  Cache Misses: ");
        printWriter.println(this.f54206d);
        printWriter.println("Network Stats");
        printWriter.print("  Download Count: ");
        printWriter.println(this.f54213k);
        printWriter.print("  Total Download Size: ");
        printWriter.println(this.f54207e);
        printWriter.print("  Average Download Size: ");
        printWriter.println(this.f54210h);
        printWriter.println("Bitmap Stats");
        printWriter.print("  Total Bitmaps Decoded: ");
        printWriter.println(this.f54214l);
        printWriter.print("  Total Bitmap Size: ");
        printWriter.println(this.f54208f);
        printWriter.print("  Total Transformed Bitmaps: ");
        printWriter.println(this.f54215m);
        printWriter.print("  Total Transformed Bitmap Size: ");
        printWriter.println(this.f54209g);
        printWriter.print("  Average Bitmap Size: ");
        printWriter.println(this.f54211i);
        printWriter.print("  Average Transformed Bitmap Size: ");
        printWriter.println(this.f54212j);
        printWriter.println("===============END PICASSO STATS ===============");
        printWriter.flush();
    }

    public String toString() {
        StringBuilder k = C13555b.m33972k("StatsSnapshot{maxSize=");
        k.append(this.f54203a);
        k.append(", size=");
        k.append(this.f54204b);
        k.append(", cacheHits=");
        k.append(this.f54205c);
        k.append(", cacheMisses=");
        k.append(this.f54206d);
        k.append(", downloadCount=");
        k.append(this.f54213k);
        k.append(", totalDownloadSize=");
        k.append(this.f54207e);
        k.append(", averageDownloadSize=");
        k.append(this.f54210h);
        k.append(", totalOriginalBitmapSize=");
        k.append(this.f54208f);
        k.append(", totalTransformedBitmapSize=");
        k.append(this.f54209g);
        k.append(", averageOriginalBitmapSize=");
        k.append(this.f54211i);
        k.append(", averageTransformedBitmapSize=");
        k.append(this.f54212j);
        k.append(", originalBitmapCount=");
        k.append(this.f54214l);
        k.append(", transformedBitmapCount=");
        k.append(this.f54215m);
        k.append(", timeStamp=");
        k.append(this.f54216n);
        k.append('}');
        return k.toString();
    }
}
