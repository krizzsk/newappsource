package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.C2126g;
import com.bumptech.glide.load.engine.C2172e;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p072e6.C4564b;
import p072e6.C4566d;
import p072e6.C4567e;
import p072e6.C4572i;
import p072e6.C4575j;
import p084f6.C4696f;
import p084f6.C4697g;
import p084f6.C4698h;
import p084f6.C4700i;
import p095g6.C4832a;
import p221q6.C6184d;
import p221q6.C6186f;
import p221q6.C6194m;
import p234r6.C6256c;
import p234r6.C6258e;
import p241s0.C6302b;
import p260t6.C6601f;
import p260t6.C6602g;
import p311x6.C7172i;
import p311x6.C7176l;

/* renamed from: com.bumptech.glide.c */
public final class C2116c implements ComponentCallbacks2 {

    /* renamed from: k */
    public static volatile C2116c f6879k;

    /* renamed from: l */
    public static volatile boolean f6880l;

    /* renamed from: b */
    public final C2172e f6881b;

    /* renamed from: c */
    public final C4566d f6882c;

    /* renamed from: d */
    public final C4698h f6883d;

    /* renamed from: e */
    public final C2125f f6884e;

    /* renamed from: f */
    public final Registry f6885f;

    /* renamed from: g */
    public final C4564b f6886g;

    /* renamed from: h */
    public final C6194m f6887h;

    /* renamed from: i */
    public final C6184d f6888i;

    /* renamed from: j */
    public final ArrayList f6889j = new ArrayList();

    /* renamed from: com.bumptech.glide.c$a */
    public interface C2117a {
        C6602g build();
    }

    /* JADX INFO: finally extract failed */
    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00e6  */
    public C2116c(android.content.Context r28, com.bumptech.glide.load.engine.C2172e r29, p084f6.C4698h r30, p072e6.C4566d r31, p072e6.C4564b r32, p221q6.C6194m r33, p221q6.C6184d r34, int r35, com.bumptech.glide.C2116c.C2117a r36, p241s0.C6302b r37, java.util.List r38, com.bumptech.glide.C2126g r39) {
        /*
            r27 = this;
            r1 = r27
            r0 = r28
            r2 = r31
            r4 = r32
            r11 = r39
            java.lang.Class<a6.a> r3 = p007a6.C0082a.class
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            java.lang.Class<java.lang.Integer> r6 = java.lang.Integer.class
            java.lang.Class<byte[]> r7 = byte[].class
            r27.<init>()
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            r1.f6889j = r8
            com.bumptech.glide.MemoryCategory r8 = com.bumptech.glide.MemoryCategory.LOW
            r10 = r29
            r1.f6881b = r10
            r1.f6882c = r2
            r1.f6886g = r4
            r8 = r30
            r1.f6883d = r8
            r8 = r33
            r1.f6887h = r8
            r8 = r34
            r1.f6888i = r8
            android.content.res.Resources r8 = r28.getResources()
            com.bumptech.glide.Registry r9 = new com.bumptech.glide.Registry
            r9.<init>()
            r1.f6885f = r9
            com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser r12 = new com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser
            r12.<init>()
            c5.e r13 = r9.f6875g
            monitor-enter(r13)
            java.util.List r14 = r13.f6255b     // Catch:{ all -> 0x0422 }
            r14.add(r12)     // Catch:{ all -> 0x0422 }
            monitor-exit(r13)
            int r12 = android.os.Build.VERSION.SDK_INT
            r13 = 27
            if (r12 < r13) goto L_0x0063
            k6.m r13 = new k6.m
            r13.<init>()
            c5.e r14 = r9.f6875g
            monitor-enter(r14)
            java.util.List r15 = r14.f6255b     // Catch:{ all -> 0x0060 }
            r15.add(r13)     // Catch:{ all -> 0x0060 }
            monitor-exit(r14)
            goto L_0x0063
        L_0x0060:
            r0 = move-exception
            monitor-exit(r14)
            throw r0
        L_0x0063:
            java.util.List r13 = r9.mo10830d()
            o6.a r14 = new o6.a
            r14.<init>(r0, r13, r2, r4)
            com.bumptech.glide.load.resource.bitmap.VideoDecoder r15 = new com.bumptech.glide.load.resource.bitmap.VideoDecoder
            com.bumptech.glide.load.resource.bitmap.VideoDecoder$g r10 = new com.bumptech.glide.load.resource.bitmap.VideoDecoder$g
            r10.<init>()
            r15.<init>(r2, r10)
            com.bumptech.glide.load.resource.bitmap.a r10 = new com.bumptech.glide.load.resource.bitmap.a
            java.util.List r1 = r9.mo10830d()
            r16 = r7
            android.util.DisplayMetrics r7 = r8.getDisplayMetrics()
            r10.<init>(r1, r7, r2, r4)
            r1 = 28
            if (r12 < r1) goto L_0x009e
            java.lang.Class<com.bumptech.glide.d$c> r1 = com.bumptech.glide.C2118d.C2121c.class
            java.util.Map<java.lang.Class<?>, java.lang.Object> r7 = r11.f6918a
            boolean r1 = r7.containsKey(r1)
            if (r1 == 0) goto L_0x009e
            k6.p r1 = new k6.p
            r1.<init>()
            k6.g r7 = new k6.g
            r7.<init>()
            goto L_0x00a8
        L_0x009e:
            k6.f r7 = new k6.f
            r7.<init>(r10)
            com.bumptech.glide.load.resource.bitmap.c r1 = new com.bumptech.glide.load.resource.bitmap.c
            r1.<init>(r4, r10)
        L_0x00a8:
            r17 = r5
            java.lang.String r5 = "Animation"
            r18 = r6
            r6 = 28
            if (r12 < r6) goto L_0x00e6
            java.lang.Class<com.bumptech.glide.d$b> r6 = com.bumptech.glide.C2118d.C2120b.class
            r30 = r12
            java.util.Map<java.lang.Class<?>, java.lang.Object> r12 = r11.f6918a
            boolean r6 = r12.containsKey(r6)
            if (r6 == 0) goto L_0x00e3
            java.lang.Class<java.io.InputStream> r6 = java.io.InputStream.class
            java.lang.Class<android.graphics.drawable.Drawable> r12 = android.graphics.drawable.Drawable.class
            m6.a$c r11 = new m6.a$c
            r19 = r3
            m6.a r3 = new m6.a
            r3.<init>(r13, r4)
            r11.<init>(r3)
            r9.mo10827a(r11, r6, r12, r5)
            java.lang.Class<java.nio.ByteBuffer> r3 = java.nio.ByteBuffer.class
            java.lang.Class<android.graphics.drawable.Drawable> r6 = android.graphics.drawable.Drawable.class
            m6.a$b r11 = new m6.a$b
            m6.a r12 = new m6.a
            r12.<init>(r13, r4)
            r11.<init>(r12)
            r9.mo10827a(r11, r3, r6, r5)
            goto L_0x00ea
        L_0x00e3:
            r19 = r3
            goto L_0x00ea
        L_0x00e6:
            r19 = r3
            r30 = r12
        L_0x00ea:
            m6.f r3 = new m6.f
            r3.<init>(r0)
            h6.s$c r6 = new h6.s$c
            r6.<init>(r8)
            h6.s$d r11 = new h6.s$d
            r11.<init>(r8)
            h6.s$b r12 = new h6.s$b
            r12.<init>(r8)
            h6.s$a r0 = new h6.s$a
            r0.<init>(r8)
            r33 = r0
            k6.b r0 = new k6.b
            r0.<init>(r4)
            r34 = r11
            p6.a r11 = new p6.a
            r11.<init>()
            r20 = r11
            cg.e r11 = new cg.e
            r11.<init>()
            r21 = r11
            android.content.ContentResolver r11 = r28.getContentResolver()
            r22 = r11
            java.lang.Class<java.nio.ByteBuffer> r11 = java.nio.ByteBuffer.class
            r23 = r12
            bl.c r12 = new bl.c
            r12.<init>()
            r24 = r6
            s6.a r6 = r9.f6870b
            monitor-enter(r6)
            r25 = r3
            java.util.ArrayList r3 = r6.f20208a     // Catch:{ all -> 0x041d }
            r26 = r5
            s6.a$a r5 = new s6.a$a     // Catch:{ all -> 0x041d }
            r5.<init>(r11, r12)     // Catch:{ all -> 0x041d }
            r3.add(r5)     // Catch:{ all -> 0x041d }
            monitor-exit(r6)
            java.lang.Class<java.io.InputStream> r3 = java.io.InputStream.class
            androidx.appcompat.app.r r5 = new androidx.appcompat.app.r
            r6 = 4
            r5.<init>(r4, r6)
            s6.a r6 = r9.f6870b
            monitor-enter(r6)
            java.util.ArrayList r11 = r6.f20208a     // Catch:{ all -> 0x0418 }
            s6.a$a r12 = new s6.a$a     // Catch:{ all -> 0x0418 }
            r12.<init>(r3, r5)     // Catch:{ all -> 0x0418 }
            r11.add(r12)     // Catch:{ all -> 0x0418 }
            monitor-exit(r6)
            java.lang.Class<java.nio.ByteBuffer> r3 = java.nio.ByteBuffer.class
            java.lang.Class<android.graphics.Bitmap> r5 = android.graphics.Bitmap.class
            java.lang.String r6 = "Bitmap"
            r9.mo10827a(r7, r3, r5, r6)
            java.lang.Class<java.io.InputStream> r3 = java.io.InputStream.class
            java.lang.Class<android.graphics.Bitmap> r5 = android.graphics.Bitmap.class
            r9.mo10827a(r1, r3, r5, r6)
            java.lang.Class<android.os.ParcelFileDescriptor> r3 = android.os.ParcelFileDescriptor.class
            java.lang.Class<android.graphics.Bitmap> r5 = android.graphics.Bitmap.class
            k6.r r11 = new k6.r
            r11.<init>(r10)
            r9.mo10827a(r11, r3, r5, r6)
            java.lang.Class<android.os.ParcelFileDescriptor> r3 = android.os.ParcelFileDescriptor.class
            java.lang.Class<android.graphics.Bitmap> r5 = android.graphics.Bitmap.class
            r9.mo10827a(r15, r3, r5, r6)
            java.lang.Class<android.content.res.AssetFileDescriptor> r3 = android.content.res.AssetFileDescriptor.class
            java.lang.Class<android.graphics.Bitmap> r5 = android.graphics.Bitmap.class
            com.bumptech.glide.load.resource.bitmap.VideoDecoder r10 = new com.bumptech.glide.load.resource.bitmap.VideoDecoder
            com.bumptech.glide.load.resource.bitmap.VideoDecoder$c r11 = new com.bumptech.glide.load.resource.bitmap.VideoDecoder$c
            r11.<init>()
            r10.<init>(r2, r11)
            r9.mo10827a(r10, r3, r5, r6)
            java.lang.Class<android.graphics.Bitmap> r3 = android.graphics.Bitmap.class
            java.lang.Class<android.graphics.Bitmap> r5 = android.graphics.Bitmap.class
            h6.u$a<?> r10 = p108h6.C5125u.C5126a.f17137a
            r9.mo10829c(r3, r5, r10)
            java.lang.Class<android.graphics.Bitmap> r3 = android.graphics.Bitmap.class
            java.lang.Class<android.graphics.Bitmap> r5 = android.graphics.Bitmap.class
            k6.v r11 = new k6.v
            r11.<init>()
            r9.mo10827a(r11, r3, r5, r6)
            java.lang.Class<android.graphics.Bitmap> r3 = android.graphics.Bitmap.class
            r9.mo10828b(r3, r0)
            java.lang.Class<java.nio.ByteBuffer> r3 = java.nio.ByteBuffer.class
            java.lang.Class<android.graphics.drawable.BitmapDrawable> r5 = android.graphics.drawable.BitmapDrawable.class
            k6.a r11 = new k6.a
            r11.<init>(r8, r7)
            java.lang.String r7 = "BitmapDrawable"
            r9.mo10827a(r11, r3, r5, r7)
            java.lang.Class<java.io.InputStream> r3 = java.io.InputStream.class
            java.lang.Class<android.graphics.drawable.BitmapDrawable> r5 = android.graphics.drawable.BitmapDrawable.class
            k6.a r11 = new k6.a
            r11.<init>(r8, r1)
            r9.mo10827a(r11, r3, r5, r7)
            java.lang.Class<android.os.ParcelFileDescriptor> r1 = android.os.ParcelFileDescriptor.class
            java.lang.Class<android.graphics.drawable.BitmapDrawable> r3 = android.graphics.drawable.BitmapDrawable.class
            k6.a r5 = new k6.a
            r5.<init>(r8, r15)
            r9.mo10827a(r5, r1, r3, r7)
            java.lang.Class<android.graphics.drawable.BitmapDrawable> r1 = android.graphics.drawable.BitmapDrawable.class
            u2.a r3 = new u2.a
            r3.<init>(r2, r0)
            r9.mo10828b(r1, r3)
            java.lang.Class<java.io.InputStream> r0 = java.io.InputStream.class
            java.lang.Class<o6.c> r1 = p195o6.C5998c.class
            o6.i r3 = new o6.i
            r3.<init>(r13, r14, r4)
            r5 = r26
            r9.mo10827a(r3, r0, r1, r5)
            java.lang.Class<java.nio.ByteBuffer> r0 = java.nio.ByteBuffer.class
            java.lang.Class<o6.c> r1 = p195o6.C5998c.class
            r9.mo10827a(r14, r0, r1, r5)
            java.lang.Class<o6.c> r0 = p195o6.C5998c.class
            t4.c r1 = new t4.c
            r1.<init>()
            r9.mo10828b(r0, r1)
            r0 = r19
            r9.mo10829c(r0, r0, r10)
            java.lang.Class<android.graphics.Bitmap> r1 = android.graphics.Bitmap.class
            o6.g r3 = new o6.g
            r3.<init>(r2)
            r9.mo10827a(r3, r0, r1, r6)
            java.lang.Class<android.net.Uri> r0 = android.net.Uri.class
            java.lang.Class<android.graphics.drawable.Drawable> r1 = android.graphics.drawable.Drawable.class
            java.lang.String r3 = "legacy_append"
            r5 = r25
            r9.mo10827a(r5, r0, r1, r3)
            java.lang.Class<android.net.Uri> r0 = android.net.Uri.class
            java.lang.Class<android.graphics.Bitmap> r1 = android.graphics.Bitmap.class
            k6.s r6 = new k6.s
            r6.<init>(r5, r2)
            r9.mo10827a(r6, r0, r1, r3)
            l6.a$a r0 = new l6.a$a
            r0.<init>()
            r9.mo10835i(r0)
            java.lang.Class<java.io.File> r0 = java.io.File.class
            java.lang.Class<java.nio.ByteBuffer> r1 = java.nio.ByteBuffer.class
            h6.c$b r5 = new h6.c$b
            r5.<init>()
            r9.mo10829c(r0, r1, r5)
            java.lang.Class<java.io.File> r0 = java.io.File.class
            java.lang.Class<java.io.InputStream> r1 = java.io.InputStream.class
            h6.e$e r5 = new h6.e$e
            r5.<init>()
            r9.mo10829c(r0, r1, r5)
            java.lang.Class<java.io.File> r0 = java.io.File.class
            java.lang.Class<java.io.File> r1 = java.io.File.class
            n6.a r5 = new n6.a
            r5.<init>()
            r9.mo10827a(r5, r0, r1, r3)
            java.lang.Class<java.io.File> r0 = java.io.File.class
            java.lang.Class<android.os.ParcelFileDescriptor> r1 = android.os.ParcelFileDescriptor.class
            h6.e$b r5 = new h6.e$b
            r5.<init>()
            r9.mo10829c(r0, r1, r5)
            java.lang.Class<java.io.File> r0 = java.io.File.class
            java.lang.Class<java.io.File> r1 = java.io.File.class
            r9.mo10829c(r0, r1, r10)
            com.bumptech.glide.load.data.k$a r0 = new com.bumptech.glide.load.data.k$a
            r0.<init>(r4)
            r9.mo10835i(r0)
            com.bumptech.glide.load.data.ParcelFileDescriptorRewinder$a r0 = new com.bumptech.glide.load.data.ParcelFileDescriptorRewinder$a
            r0.<init>()
            r9.mo10835i(r0)
            java.lang.Class r0 = java.lang.Integer.TYPE
            java.lang.Class<java.io.InputStream> r1 = java.io.InputStream.class
            r5 = r24
            r9.mo10829c(r0, r1, r5)
            java.lang.Class<android.os.ParcelFileDescriptor> r1 = android.os.ParcelFileDescriptor.class
            r6 = r23
            r9.mo10829c(r0, r1, r6)
            java.lang.Class<java.io.InputStream> r1 = java.io.InputStream.class
            r7 = r18
            r9.mo10829c(r7, r1, r5)
            java.lang.Class<android.os.ParcelFileDescriptor> r1 = android.os.ParcelFileDescriptor.class
            r9.mo10829c(r7, r1, r6)
            java.lang.Class<android.net.Uri> r1 = android.net.Uri.class
            r5 = r34
            r9.mo10829c(r7, r1, r5)
            java.lang.Class<android.content.res.AssetFileDescriptor> r1 = android.content.res.AssetFileDescriptor.class
            r6 = r33
            r9.mo10829c(r0, r1, r6)
            java.lang.Class<android.content.res.AssetFileDescriptor> r1 = android.content.res.AssetFileDescriptor.class
            r9.mo10829c(r7, r1, r6)
            java.lang.Class<android.net.Uri> r1 = android.net.Uri.class
            r9.mo10829c(r0, r1, r5)
            java.lang.Class<java.io.InputStream> r0 = java.io.InputStream.class
            h6.d$c r1 = new h6.d$c
            r1.<init>()
            r5 = r17
            r9.mo10829c(r5, r0, r1)
            java.lang.Class<android.net.Uri> r0 = android.net.Uri.class
            java.lang.Class<java.io.InputStream> r1 = java.io.InputStream.class
            h6.d$c r6 = new h6.d$c
            r6.<init>()
            r9.mo10829c(r0, r1, r6)
            java.lang.Class<java.io.InputStream> r0 = java.io.InputStream.class
            h6.t$c r1 = new h6.t$c
            r1.<init>()
            r9.mo10829c(r5, r0, r1)
            java.lang.Class<android.os.ParcelFileDescriptor> r0 = android.os.ParcelFileDescriptor.class
            h6.t$b r1 = new h6.t$b
            r1.<init>()
            r9.mo10829c(r5, r0, r1)
            java.lang.Class<android.content.res.AssetFileDescriptor> r0 = android.content.res.AssetFileDescriptor.class
            h6.t$a r1 = new h6.t$a
            r1.<init>()
            r9.mo10829c(r5, r0, r1)
            java.lang.Class<android.net.Uri> r0 = android.net.Uri.class
            java.lang.Class<java.io.InputStream> r1 = java.io.InputStream.class
            h6.a$c r5 = new h6.a$c
            android.content.res.AssetManager r6 = r28.getAssets()
            r5.<init>(r6)
            r9.mo10829c(r0, r1, r5)
            java.lang.Class<android.net.Uri> r0 = android.net.Uri.class
            java.lang.Class<android.content.res.AssetFileDescriptor> r1 = android.content.res.AssetFileDescriptor.class
            h6.a$b r5 = new h6.a$b
            android.content.res.AssetManager r6 = r28.getAssets()
            r5.<init>(r6)
            r9.mo10829c(r0, r1, r5)
            java.lang.Class<android.net.Uri> r0 = android.net.Uri.class
            java.lang.Class<java.io.InputStream> r1 = java.io.InputStream.class
            i6.b$a r5 = new i6.b$a
            r6 = r28
            r5.<init>(r6)
            r9.mo10829c(r0, r1, r5)
            java.lang.Class<android.net.Uri> r0 = android.net.Uri.class
            java.lang.Class<java.io.InputStream> r1 = java.io.InputStream.class
            i6.c$a r5 = new i6.c$a
            r5.<init>(r6)
            r9.mo10829c(r0, r1, r5)
            r0 = 29
            r1 = r30
            if (r1 < r0) goto L_0x0327
            java.lang.Class<android.net.Uri> r0 = android.net.Uri.class
            java.lang.Class<java.io.InputStream> r5 = java.io.InputStream.class
            i6.d$c r7 = new i6.d$c
            r7.<init>(r6)
            r9.mo10829c(r0, r5, r7)
            java.lang.Class<android.net.Uri> r0 = android.net.Uri.class
            java.lang.Class<android.os.ParcelFileDescriptor> r5 = android.os.ParcelFileDescriptor.class
            i6.d$b r7 = new i6.d$b
            r7.<init>(r6)
            r9.mo10829c(r0, r5, r7)
        L_0x0327:
            java.lang.Class<android.net.Uri> r0 = android.net.Uri.class
            java.lang.Class<java.io.InputStream> r5 = java.io.InputStream.class
            h6.v$d r7 = new h6.v$d
            r11 = r22
            r7.<init>(r11)
            r9.mo10829c(r0, r5, r7)
            java.lang.Class<android.net.Uri> r0 = android.net.Uri.class
            java.lang.Class<android.os.ParcelFileDescriptor> r5 = android.os.ParcelFileDescriptor.class
            h6.v$b r7 = new h6.v$b
            r7.<init>(r11)
            r9.mo10829c(r0, r5, r7)
            java.lang.Class<android.net.Uri> r0 = android.net.Uri.class
            java.lang.Class<android.content.res.AssetFileDescriptor> r5 = android.content.res.AssetFileDescriptor.class
            h6.v$a r7 = new h6.v$a
            r7.<init>(r11)
            r9.mo10829c(r0, r5, r7)
            java.lang.Class<android.net.Uri> r0 = android.net.Uri.class
            java.lang.Class<java.io.InputStream> r5 = java.io.InputStream.class
            h6.w$a r7 = new h6.w$a
            r7.<init>()
            r9.mo10829c(r0, r5, r7)
            java.lang.Class<java.net.URL> r0 = java.net.URL.class
            java.lang.Class<java.io.InputStream> r5 = java.io.InputStream.class
            i6.e$a r7 = new i6.e$a
            r7.<init>()
            r9.mo10829c(r0, r5, r7)
            java.lang.Class<android.net.Uri> r0 = android.net.Uri.class
            java.lang.Class<java.io.File> r5 = java.io.File.class
            h6.j$a r7 = new h6.j$a
            r7.<init>(r6)
            r9.mo10829c(r0, r5, r7)
            java.lang.Class<h6.f> r0 = p108h6.C5091f.class
            java.lang.Class<java.io.InputStream> r5 = java.io.InputStream.class
            i6.a$a r7 = new i6.a$a
            r7.<init>()
            r9.mo10829c(r0, r5, r7)
            java.lang.Class<java.nio.ByteBuffer> r0 = java.nio.ByteBuffer.class
            h6.b$a r5 = new h6.b$a
            r5.<init>()
            r7 = r16
            r9.mo10829c(r7, r0, r5)
            java.lang.Class<java.io.InputStream> r0 = java.io.InputStream.class
            h6.b$d r5 = new h6.b$d
            r5.<init>()
            r9.mo10829c(r7, r0, r5)
            java.lang.Class<android.net.Uri> r0 = android.net.Uri.class
            java.lang.Class<android.net.Uri> r5 = android.net.Uri.class
            r9.mo10829c(r0, r5, r10)
            java.lang.Class<android.graphics.drawable.Drawable> r0 = android.graphics.drawable.Drawable.class
            java.lang.Class<android.graphics.drawable.Drawable> r5 = android.graphics.drawable.Drawable.class
            r9.mo10829c(r0, r5, r10)
            java.lang.Class<android.graphics.drawable.Drawable> r0 = android.graphics.drawable.Drawable.class
            java.lang.Class<android.graphics.drawable.Drawable> r5 = android.graphics.drawable.Drawable.class
            m6.g r10 = new m6.g
            r10.<init>()
            r9.mo10827a(r10, r0, r5, r3)
            java.lang.Class<android.graphics.Bitmap> r0 = android.graphics.Bitmap.class
            java.lang.Class<android.graphics.drawable.BitmapDrawable> r3 = android.graphics.drawable.BitmapDrawable.class
            e3.g r5 = new e3.g
            r5.<init>((android.content.res.Resources) r8)
            r9.mo10836j(r0, r3, r5)
            java.lang.Class<android.graphics.Bitmap> r0 = android.graphics.Bitmap.class
            r3 = r20
            r9.mo10836j(r0, r7, r3)
            java.lang.Class<android.graphics.drawable.Drawable> r0 = android.graphics.drawable.Drawable.class
            p6.b r5 = new p6.b
            r10 = r21
            r5.<init>(r2, r3, r10)
            r9.mo10836j(r0, r7, r5)
            java.lang.Class<o6.c> r0 = p195o6.C5998c.class
            r9.mo10836j(r0, r7, r10)
            r0 = 23
            if (r1 < r0) goto L_0x03f6
            com.bumptech.glide.load.resource.bitmap.VideoDecoder r0 = new com.bumptech.glide.load.resource.bitmap.VideoDecoder
            com.bumptech.glide.load.resource.bitmap.VideoDecoder$d r1 = new com.bumptech.glide.load.resource.bitmap.VideoDecoder$d
            r1.<init>()
            r0.<init>(r2, r1)
            java.lang.Class<java.nio.ByteBuffer> r1 = java.nio.ByteBuffer.class
            java.lang.Class<android.graphics.Bitmap> r2 = android.graphics.Bitmap.class
            java.lang.String r3 = "legacy_append"
            r9.mo10827a(r0, r1, r2, r3)
            java.lang.Class<java.nio.ByteBuffer> r1 = java.nio.ByteBuffer.class
            java.lang.Class<android.graphics.drawable.BitmapDrawable> r2 = android.graphics.drawable.BitmapDrawable.class
            k6.a r3 = new k6.a
            r3.<init>(r8, r0)
            java.lang.String r0 = "legacy_append"
            r9.mo10827a(r3, r1, r2, r0)
        L_0x03f6:
            t4.c r0 = new t4.c
            r0.<init>()
            com.bumptech.glide.f r1 = new com.bumptech.glide.f
            r2 = r1
            r3 = r28
            r4 = r32
            r5 = r9
            r6 = r0
            r7 = r36
            r8 = r37
            r9 = r38
            r10 = r29
            r11 = r39
            r12 = r35
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r2 = r27
            r2.f6884e = r1
            return
        L_0x0418:
            r0 = move-exception
            r2 = r27
            monitor-exit(r6)
            throw r0
        L_0x041d:
            r0 = move-exception
            r2 = r27
            monitor-exit(r6)
            throw r0
        L_0x0422:
            r0 = move-exception
            r2 = r1
            monitor-exit(r13)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.C2116c.<init>(android.content.Context, com.bumptech.glide.load.engine.e, f6.h, e6.d, e6.b, q6.m, q6.d, int, com.bumptech.glide.c$a, s0.b, java.util.List, com.bumptech.glide.g):void");
    }

    /* renamed from: a */
    public static void m5519a(Context context, GeneratedAppGlideModule generatedAppGlideModule) {
        List<C6256c> list;
        int i;
        GeneratedAppGlideModule generatedAppGlideModule2 = generatedAppGlideModule;
        if (!f6880l) {
            f6880l = true;
            C2118d dVar = new C2118d();
            Context applicationContext = context.getApplicationContext();
            List emptyList = Collections.emptyList();
            if (generatedAppGlideModule2 == null || generatedAppGlideModule.mo10825c()) {
                ArrayList arrayList = new ArrayList();
                try {
                    ApplicationInfo applicationInfo = applicationContext.getPackageManager().getApplicationInfo(applicationContext.getPackageName(), RecyclerView.C1119a0.FLAG_IGNORE);
                    if (applicationInfo.metaData != null) {
                        if (Log.isLoggable("ManifestParser", 2)) {
                            Objects.toString(applicationInfo.metaData);
                        }
                        for (String next : applicationInfo.metaData.keySet()) {
                            if ("GlideModule".equals(applicationInfo.metaData.get(next))) {
                                arrayList.add(C6258e.m14845a(next));
                            }
                        }
                    }
                    list = arrayList;
                } catch (PackageManager.NameNotFoundException e) {
                    throw new RuntimeException("Unable to find metadata to parse GlideModules", e);
                }
            } else {
                list = emptyList;
            }
            if (generatedAppGlideModule2 != null && !generatedAppGlideModule.mo10821d().isEmpty()) {
                Set<Class<?>> d = generatedAppGlideModule.mo10821d();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    C6256c cVar = (C6256c) it.next();
                    if (d.contains(cVar.getClass())) {
                        if (Log.isLoggable("Glide", 3)) {
                            cVar.toString();
                        }
                        it.remove();
                    }
                }
            }
            if (Log.isLoggable("Glide", 3)) {
                for (C6256c cVar2 : list) {
                    cVar2.getClass().toString();
                }
            }
            C6194m.C6196b bVar = null;
            if (generatedAppGlideModule2 != null) {
                bVar = generatedAppGlideModule.mo10822e();
            }
            dVar.f6903n = bVar;
            for (C6256c a : list) {
                a.mo10823a(applicationContext, dVar);
            }
            if (generatedAppGlideModule2 != null) {
                generatedAppGlideModule2.mo10823a(applicationContext, dVar);
            }
            if (dVar.f6896g == null) {
                int i2 = C4832a.f16251d;
                C4832a.C4833a aVar = new C4832a.C4833a();
                C4832a.C4837c.C4838a aVar2 = C4832a.C4837c.f16260e0;
                if (C4832a.f16251d == 0) {
                    C4832a.f16251d = Math.min(4, Runtime.getRuntime().availableProcessors());
                }
                int i3 = C4832a.f16251d;
                if (!TextUtils.isEmpty("source")) {
                    dVar.f6896g = new C4832a(new ThreadPoolExecutor(i3, i3, 0, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new C4832a.C4835b(aVar, "source", aVar2, false)));
                } else {
                    throw new IllegalArgumentException(C25541a.m63881k("Name must be non-null and non-empty, but given: ", "source"));
                }
            }
            if (dVar.f6897h == null) {
                int i4 = C4832a.f16251d;
                C4832a.C4833a aVar3 = new C4832a.C4833a();
                C4832a.C4837c.C4838a aVar4 = C4832a.C4837c.f16260e0;
                if (!TextUtils.isEmpty("disk-cache")) {
                    dVar.f6897h = new C4832a(new ThreadPoolExecutor(1, 1, 0, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new C4832a.C4835b(aVar3, "disk-cache", aVar4, true)));
                } else {
                    throw new IllegalArgumentException("Name must be non-null and non-empty, but given: disk-cache");
                }
            }
            if (dVar.f6904o == null) {
                if (C4832a.f16251d == 0) {
                    C4832a.f16251d = Math.min(4, Runtime.getRuntime().availableProcessors());
                }
                if (C4832a.f16251d >= 4) {
                    i = 2;
                } else {
                    i = 1;
                }
                C4832a.C4833a aVar5 = new C4832a.C4833a();
                C4832a.C4837c.C4838a aVar6 = C4832a.C4837c.f16260e0;
                if (!TextUtils.isEmpty("animation")) {
                    dVar.f6904o = new C4832a(new ThreadPoolExecutor(i, i, 0, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new C4832a.C4835b(aVar5, "animation", aVar6, true)));
                } else {
                    throw new IllegalArgumentException("Name must be non-null and non-empty, but given: animation");
                }
            }
            if (dVar.f6899j == null) {
                dVar.f6899j = new C4700i(new C4700i.C4701a(applicationContext));
            }
            if (dVar.f6900k == null) {
                dVar.f6900k = new C6186f();
            }
            if (dVar.f6893d == null) {
                int i5 = dVar.f6899j.f15969a;
                if (i5 > 0) {
                    dVar.f6893d = new C4575j((long) i5);
                } else {
                    dVar.f6893d = new C4567e();
                }
            }
            if (dVar.f6894e == null) {
                dVar.f6894e = new C4572i(dVar.f6899j.f15971c);
            }
            if (dVar.f6895f == null) {
                dVar.f6895f = new C4697g((long) dVar.f6899j.f15970b);
            }
            if (dVar.f6898i == null) {
                dVar.f6898i = new C4696f(applicationContext);
            }
            if (dVar.f6892c == null) {
                dVar.f6892c = new C2172e(dVar.f6895f, dVar.f6898i, dVar.f6897h, dVar.f6896g, C4832a.m12161a(), dVar.f6904o);
            }
            List<C6601f<Object>> list2 = dVar.f6905p;
            if (list2 == null) {
                dVar.f6905p = Collections.emptyList();
            } else {
                dVar.f6905p = Collections.unmodifiableList(list2);
            }
            C2126g.C2127a aVar7 = dVar.f6891b;
            aVar7.getClass();
            C2126g gVar = new C2126g(aVar7);
            C6194m mVar = new C6194m(dVar.f6903n, gVar);
            C2172e eVar = dVar.f6892c;
            C4697g gVar2 = dVar.f6895f;
            C4566d dVar2 = dVar.f6893d;
            C4572i iVar = dVar.f6894e;
            C6186f fVar = dVar.f6900k;
            int i6 = dVar.f6901l;
            C2117a aVar8 = dVar.f6902m;
            C6302b bVar2 = dVar.f6890a;
            C2126g gVar3 = gVar;
            List<C6601f<Object>> list3 = dVar.f6905p;
            Context context2 = applicationContext;
            C2116c cVar3 = new C2116c(applicationContext, eVar, gVar2, dVar2, iVar, mVar, fVar, i6, aVar8, bVar2, list3, gVar3);
            for (C6256c cVar4 : list) {
                try {
                    cVar4.mo10824b(context2, cVar3, cVar3.f6885f);
                } catch (AbstractMethodError e2) {
                    StringBuilder k = C13555b.m33972k("Attempting to register a Glide v3 module. If you see this, you or one of your dependencies may be including Glide v3 even though you're using Glide v4. You'll need to find and remove (or update) the offending dependency. The v3 module name is: ");
                    k.append(cVar4.getClass().getName());
                    throw new IllegalStateException(k.toString(), e2);
                }
            }
            if (generatedAppGlideModule2 != null) {
                generatedAppGlideModule2.mo10824b(context2, cVar3, cVar3.f6885f);
            }
            context2.registerComponentCallbacks(cVar3);
            f6879k = cVar3;
            f6880l = false;
            return;
        }
        throw new IllegalStateException("You cannot call Glide.get() in registerComponents(), use the provided Glide instance instead");
    }

    /* renamed from: b */
    public static C2116c m5520b(Context context) {
        if (f6879k == null) {
            Context applicationContext = context.getApplicationContext();
            GeneratedAppGlideModule generatedAppGlideModule = null;
            try {
                generatedAppGlideModule = GeneratedAppGlideModuleImpl.class.getDeclaredConstructor(new Class[]{Context.class}).newInstance(new Object[]{applicationContext.getApplicationContext()});
            } catch (ClassNotFoundException unused) {
            } catch (InstantiationException e) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e);
            } catch (IllegalAccessException e2) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e2);
            } catch (NoSuchMethodException e3) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e3);
            } catch (InvocationTargetException e4) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e4);
            }
            synchronized (C2116c.class) {
                if (f6879k == null) {
                    m5519a(context, generatedAppGlideModule);
                }
            }
        }
        return f6879k;
    }

    /* renamed from: c */
    public static C6194m m5521c(Context context) {
        if (context != null) {
            return m5520b(context).f6887h;
        }
        throw new NullPointerException("You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
    }

    /* renamed from: d */
    public final void mo10838d(C2131j jVar) {
        synchronized (this.f6889j) {
            if (this.f6889j.contains(jVar)) {
                this.f6889j.remove(jVar);
            } else {
                throw new IllegalStateException("Cannot unregister not yet registered manager");
            }
        }
    }

    public final void onConfigurationChanged(Configuration configuration) {
    }

    public final void onLowMemory() {
        C7176l.m16781a();
        ((C7172i) this.f6883d).mo23473e(0);
        this.f6882c.mo20084b();
        this.f6886g.mo20073b();
    }

    public final void onTrimMemory(int i) {
        long j;
        C7176l.m16781a();
        synchronized (this.f6889j) {
            Iterator it = this.f6889j.iterator();
            while (it.hasNext()) {
                ((C2131j) it.next()).getClass();
            }
        }
        C4697g gVar = (C4697g) this.f6883d;
        if (i >= 40) {
            gVar.mo23473e(0);
        } else if (i >= 20 || i == 15) {
            synchronized (gVar) {
                j = gVar.f22257b;
            }
            gVar.mo23473e(j / 2);
        } else {
            gVar.getClass();
        }
        this.f6882c.mo20083a(i);
        this.f6886g.mo20072a(i);
    }
}
