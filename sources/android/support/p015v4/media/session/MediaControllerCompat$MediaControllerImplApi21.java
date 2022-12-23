package android.support.p015v4.media.session;

import android.content.Context;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.support.p015v4.media.session.C0177c;
import android.support.p015v4.media.session.MediaSessionCompat;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21 */
public final class MediaControllerCompat$MediaControllerImplApi21 {

    /* renamed from: a */
    public final MediaController f450a;

    /* renamed from: b */
    public final Object f451b = new Object();

    /* renamed from: c */
    public final ArrayList f452c = new ArrayList();

    /* renamed from: d */
    public HashMap<C0177c, C0165a> f453d = new HashMap<>();

    /* renamed from: e */
    public final MediaSessionCompat.Token f454e;

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public static class ExtraBinderRequestResultReceiver extends ResultReceiver {

        /* renamed from: b */
        public WeakReference<MediaControllerCompat$MediaControllerImplApi21> f455b;

        public ExtraBinderRequestResultReceiver(MediaControllerCompat$MediaControllerImplApi21 mediaControllerCompat$MediaControllerImplApi21) {
            super((Handler) null);
            this.f455b = new WeakReference<>(mediaControllerCompat$MediaControllerImplApi21);
        }

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
            	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
            	at jadx.core.dex.visitors.regions.RegionMaker.processExcHandler(RegionMaker.java:1043)
            	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:975)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
            */
        public final void onReceiveResult(int r5, android.os.Bundle r6) {
            /*
                r4 = this;
                java.lang.ref.WeakReference<android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21> r5 = r4.f455b
                java.lang.Object r5 = r5.get()
                android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21 r5 = (android.support.p015v4.media.session.MediaControllerCompat$MediaControllerImplApi21) r5
                if (r5 == 0) goto L_0x0064
                if (r6 != 0) goto L_0x000d
                goto L_0x0064
            L_0x000d:
                java.lang.Object r0 = r5.f451b
                monitor-enter(r0)
                android.support.v4.media.session.MediaSessionCompat$Token r1 = r5.f454e     // Catch:{ all -> 0x0061 }
                java.lang.String r2 = "android.support.v4.media.session.EXTRA_BINDER"
                android.os.IBinder r2 = p067e1.C4494j.m11719a(r6, r2)     // Catch:{ all -> 0x0061 }
                android.support.v4.media.session.b r2 = android.support.p015v4.media.session.C0174b.C0175a.m314G(r2)     // Catch:{ all -> 0x0061 }
                java.lang.Object r3 = r1.f459b     // Catch:{ all -> 0x0061 }
                monitor-enter(r3)     // Catch:{ all -> 0x0061 }
                r1.f461d = r2     // Catch:{ all -> 0x005e }
                monitor-exit(r3)     // Catch:{ all -> 0x005e }
                android.support.v4.media.session.MediaSessionCompat$Token r1 = r5.f454e     // Catch:{ all -> 0x0061 }
                java.lang.String r2 = "android.support.v4.media.session.SESSION_TOKEN2"
                r3 = 0
                android.os.Parcelable r6 = r6.getParcelable(r2)     // Catch:{ RuntimeException -> 0x0050 }
                android.os.Bundle r6 = (android.os.Bundle) r6     // Catch:{ RuntimeException -> 0x0050 }
                if (r6 != 0) goto L_0x0030
                goto L_0x0050
            L_0x0030:
                java.lang.Class<b3.a> r2 = p022b3.C1461a.class
                java.lang.ClassLoader r2 = r2.getClassLoader()     // Catch:{ RuntimeException -> 0x0050 }
                r6.setClassLoader(r2)     // Catch:{ RuntimeException -> 0x0050 }
                java.lang.String r2 = "a"
                android.os.Parcelable r6 = r6.getParcelable(r2)     // Catch:{ RuntimeException -> 0x0050 }
                boolean r2 = r6 instanceof androidx.versionedparcelable.ParcelImpl     // Catch:{ RuntimeException -> 0x0050 }
                if (r2 == 0) goto L_0x0048
                androidx.versionedparcelable.ParcelImpl r6 = (androidx.versionedparcelable.ParcelImpl) r6     // Catch:{ RuntimeException -> 0x0050 }
                b3.d r3 = r6.f5035b     // Catch:{ RuntimeException -> 0x0050 }
                goto L_0x0050
            L_0x0048:
                java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException     // Catch:{ RuntimeException -> 0x0050 }
                java.lang.String r2 = "Invalid parcel"
                r6.<init>(r2)     // Catch:{ RuntimeException -> 0x0050 }
                throw r6     // Catch:{ RuntimeException -> 0x0050 }
            L_0x0050:
                java.lang.Object r6 = r1.f459b     // Catch:{ all -> 0x0061 }
                monitor-enter(r6)     // Catch:{ all -> 0x0061 }
                r1.f462e = r3     // Catch:{ all -> 0x005b }
                monitor-exit(r6)     // Catch:{ all -> 0x005b }
                r5.mo565a()     // Catch:{ all -> 0x0061 }
                monitor-exit(r0)     // Catch:{ all -> 0x0061 }
                return
            L_0x005b:
                r5 = move-exception
                monitor-exit(r6)     // Catch:{ all -> 0x005b }
                throw r5     // Catch:{ all -> 0x0061 }
            L_0x005e:
                r5 = move-exception
                monitor-exit(r3)     // Catch:{ all -> 0x005e }
                throw r5     // Catch:{ all -> 0x0061 }
            L_0x0061:
                r5 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0061 }
                throw r5
            L_0x0064:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.p015v4.media.session.MediaControllerCompat$MediaControllerImplApi21.ExtraBinderRequestResultReceiver.onReceiveResult(int, android.os.Bundle):void");
        }
    }

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21$a */
    public static class C0165a extends C0177c.C0179b {
        public C0165a(C0177c cVar) {
            super(cVar);
        }

        /* renamed from: B */
        public final void mo567B() throws RemoteException {
            throw new AssertionError();
        }

        /* renamed from: b */
        public final void mo568b() throws RemoteException {
            throw new AssertionError();
        }

        /* renamed from: e */
        public final void mo569e() throws RemoteException {
            throw new AssertionError();
        }

        /* renamed from: g */
        public final void mo570g() throws RemoteException {
            throw new AssertionError();
        }

        /* renamed from: l */
        public final void mo571l(ParcelableVolumeInfo parcelableVolumeInfo) throws RemoteException {
            throw new AssertionError();
        }

        /* renamed from: y */
        public final void mo572y() throws RemoteException {
            throw new AssertionError();
        }
    }

    public MediaControllerCompat$MediaControllerImplApi21(Context context, MediaSessionCompat.Token token) {
        C0174b bVar;
        this.f454e = token;
        MediaController mediaController = new MediaController(context, (MediaSession.Token) token.f460c);
        this.f450a = mediaController;
        synchronized (token.f459b) {
            bVar = token.f461d;
        }
        if (bVar == null) {
            mediaController.sendCommand("android.support.v4.media.session.command.GET_EXTRA_BINDER", (Bundle) null, new ExtraBinderRequestResultReceiver(this));
        }
    }

    /* renamed from: a */
    public final void mo565a() {
        C0174b bVar;
        C0174b bVar2;
        MediaSessionCompat.Token token = this.f454e;
        synchronized (token.f459b) {
            bVar = token.f461d;
        }
        if (bVar != null) {
            Iterator it = this.f452c.iterator();
            while (it.hasNext()) {
                C0177c cVar = (C0177c) it.next();
                C0165a aVar = new C0165a(cVar);
                this.f453d.put(cVar, aVar);
                cVar.f485a = aVar;
                try {
                    MediaSessionCompat.Token token2 = this.f454e;
                    synchronized (token2.f459b) {
                        bVar2 = token2.f461d;
                    }
                    bVar2.mo604r(aVar);
                } catch (RemoteException unused) {
                }
            }
            this.f452c.clear();
        }
    }
}
