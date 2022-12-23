package androidx.camera.view;

import androidx.camera.core.impl.CameraInternal;
import androidx.camera.view.PreviewView;
import androidx.lifecycle.C1043v;
import java.util.Objects;
import p054d0.C4289j0;
import p066e0.C4429g0;
import p066e0.C4443m;
import p102h0.C5019d;

/* renamed from: androidx.camera.view.a */
public final class C0655a implements C4429g0<CameraInternal.State> {

    /* renamed from: a */
    public final C4443m f2251a;

    /* renamed from: b */
    public final C1043v<PreviewView.StreamState> f2252b;

    /* renamed from: c */
    public PreviewView.StreamState f2253c;

    /* renamed from: d */
    public final C0658c f2254d;

    /* renamed from: e */
    public C5019d f2255e;

    /* renamed from: f */
    public boolean f2256f = false;

    public C0655a(C4443m mVar, C1043v<PreviewView.StreamState> vVar, C0658c cVar) {
        this.f2251a = mVar;
        this.f2252b = vVar;
        this.f2254d = cVar;
        synchronized (this) {
            this.f2253c = vVar.getValue();
        }
    }

    /* renamed from: a */
    public final void mo2635a(PreviewView.StreamState streamState) {
        synchronized (this) {
            if (!this.f2253c.equals(streamState)) {
                this.f2253c = streamState;
                Objects.toString(streamState);
                C4289j0.m11435b("StreamStateObserver");
                this.f2252b.postValue(streamState);
            }
        }
    }
}
