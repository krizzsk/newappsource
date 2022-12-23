package androidx.camera.core;

import android.media.Image;
import androidx.camera.core.C0627p;
import java.util.HashSet;
import java.util.Iterator;
import p054d0.C4282g0;

/* renamed from: androidx.camera.core.h */
public abstract class C0554h implements C0627p {

    /* renamed from: b */
    public final C0627p f1909b;

    /* renamed from: c */
    public final HashSet f1910c = new HashSet();

    /* renamed from: androidx.camera.core.h$a */
    public interface C0555a {
        /* renamed from: b */
        void mo2437b(C0627p pVar);
    }

    public C0554h(C0627p pVar) {
        this.f1909b = pVar;
    }

    /* renamed from: a */
    public final synchronized void mo2436a(C0555a aVar) {
        this.f1910c.add(aVar);
    }

    public void close() {
        HashSet hashSet;
        synchronized (this) {
            this.f1909b.close();
        }
        synchronized (this) {
            hashSet = new HashSet(this.f1910c);
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((C0555a) it.next()).mo2437b(this);
        }
    }

    public final synchronized int getFormat() {
        return this.f1909b.getFormat();
    }

    public synchronized int getHeight() {
        return this.f1909b.getHeight();
    }

    public final synchronized Image getImage() {
        return this.f1909b.getImage();
    }

    public synchronized C4282g0 getImageInfo() {
        return this.f1909b.getImageInfo();
    }

    public final synchronized C0627p.C0628a[] getPlanes() {
        return this.f1909b.getPlanes();
    }

    public synchronized int getWidth() {
        return this.f1909b.getWidth();
    }
}
