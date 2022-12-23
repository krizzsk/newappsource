package android.support.p015v4.media;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.media.browse.MediaBrowser;
import android.media.session.MediaSession;
import android.os.BadParcelableException;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.os.RemoteException;
import android.support.p015v4.media.session.C0174b;
import android.support.p015v4.media.session.MediaControllerCompat$MediaControllerImplApi21;
import android.support.p015v4.media.session.MediaSessionCompat;
import android.support.p015v4.p016os.ResultReceiver;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import androidx.media.session.MediaButtonReceiver;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import p067e1.C4494j;
import p241s0.C6302b;
import p358af.C13437d;
import p583jk.C17884p;
import p988j$.util.concurrent.ConcurrentHashMap;

/* renamed from: android.support.v4.media.MediaBrowserCompat */
public final class MediaBrowserCompat {

    /* renamed from: b */
    public static final /* synthetic */ int f415b = 0;

    /* renamed from: a */
    public final C0151c f416a;

    /* renamed from: android.support.v4.media.MediaBrowserCompat$CustomActionResultReceiver */
    public static class CustomActionResultReceiver extends ResultReceiver {
        /* renamed from: b */
        public final void mo533b(int i, Bundle bundle) {
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$ItemReceiver */
    public static class ItemReceiver extends ResultReceiver {
        /* renamed from: b */
        public final void mo533b(int i, Bundle bundle) {
            if (bundle != null) {
                MediaSessionCompat.m306a(bundle);
                try {
                    bundle.isEmpty();
                } catch (BadParcelableException unused) {
                    bundle = null;
                }
            }
            if (i != 0 || bundle == null || !bundle.containsKey("media_item")) {
                throw null;
            }
            Parcelable parcelable = bundle.getParcelable("media_item");
            if (parcelable == null || (parcelable instanceof MediaItem)) {
                MediaItem mediaItem = (MediaItem) parcelable;
                throw null;
            }
            throw null;
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$SearchResultReceiver */
    public static class SearchResultReceiver extends ResultReceiver {
        /* renamed from: b */
        public final void mo533b(int i, Bundle bundle) {
            if (bundle != null) {
                MediaSessionCompat.m306a(bundle);
                try {
                    bundle.isEmpty();
                } catch (BadParcelableException unused) {
                    bundle = null;
                }
            }
            if (i != 0 || bundle == null || !bundle.containsKey("search_results")) {
                throw null;
            }
            Parcelable[] parcelableArray = bundle.getParcelableArray("search_results");
            parcelableArray.getClass();
            ArrayList arrayList = new ArrayList();
            for (Parcelable parcelable : parcelableArray) {
                arrayList.add((MediaItem) parcelable);
            }
            throw null;
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$a */
    public static class C0147a extends Handler {

        /* renamed from: a */
        public final WeakReference<C0154f> f419a;

        /* renamed from: b */
        public WeakReference<Messenger> f420b;

        public C0147a(C0154f fVar) {
            this.f419a = new WeakReference<>(fVar);
        }

        public final void handleMessage(Message message) {
            WeakReference<Messenger> weakReference = this.f420b;
            if (weakReference != null && weakReference.get() != null && this.f419a.get() != null) {
                Bundle data = message.getData();
                MediaSessionCompat.m306a(data);
                C0154f fVar = this.f419a.get();
                Messenger messenger = this.f420b.get();
                try {
                    int i = message.what;
                    if (i == 1) {
                        MediaSessionCompat.m306a(data.getBundle("data_root_hints"));
                        data.getString("data_media_item_id");
                        MediaSessionCompat.Token token = (MediaSessionCompat.Token) data.getParcelable("data_media_session_token");
                        fVar.mo544b();
                    } else if (i == 2) {
                        fVar.mo543a();
                    } else if (i != 3) {
                        message.toString();
                    } else {
                        Bundle bundle = data.getBundle("data_options");
                        MediaSessionCompat.m306a(bundle);
                        MediaSessionCompat.m306a(data.getBundle("data_notify_children_changed_options"));
                        String string = data.getString("data_media_item_id");
                        data.getParcelableArrayList("data_media_item_list");
                        fVar.mo545c(messenger, string, bundle);
                    }
                } catch (BadParcelableException unused) {
                    if (message.what == 1) {
                        fVar.mo543a();
                    }
                }
            }
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$b */
    public static class C0148b {

        /* renamed from: a */
        public final C0149a f421a = new C0149a();

        /* renamed from: b */
        public C0150b f422b;

        /* renamed from: android.support.v4.media.MediaBrowserCompat$b$a */
        public class C0149a extends MediaBrowser.ConnectionCallback {
            public C0149a() {
            }

            public final void onConnected() {
                MediaSessionCompat.Token token;
                C0150b bVar = C0148b.this.f422b;
                MediaSessionCompat.Token token2 = null;
                if (bVar != null) {
                    C0151c cVar = (C0151c) bVar;
                    try {
                        Bundle extras = cVar.f425b.getExtras();
                        if (extras != null) {
                            extras.getInt("extra_service_version", 0);
                            IBinder a = C4494j.m11719a(extras, "extra_messenger");
                            if (a != null) {
                                cVar.f429f = new C0155g(a, cVar.f426c);
                                Messenger messenger = new Messenger(cVar.f427d);
                                cVar.f430g = messenger;
                                C0147a aVar = cVar.f427d;
                                aVar.getClass();
                                aVar.f420b = new WeakReference<>(messenger);
                                try {
                                    C0155g gVar = cVar.f429f;
                                    Context context = cVar.f424a;
                                    Messenger messenger2 = cVar.f430g;
                                    gVar.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putString("data_package_name", context.getPackageName());
                                    bundle.putInt("data_calling_pid", Process.myPid());
                                    bundle.putBundle("data_root_hints", gVar.f433b);
                                    gVar.mo546a(6, bundle, messenger2);
                                } catch (RemoteException unused) {
                                }
                            }
                            C0174b G = C0174b.C0175a.m314G(C4494j.m11719a(extras, "extra_session_binder"));
                            if (G != null) {
                                MediaSession.Token sessionToken = cVar.f425b.getSessionToken();
                                if (sessionToken != null) {
                                    token = new MediaSessionCompat.Token(sessionToken, G);
                                } else {
                                    token = null;
                                }
                                cVar.f431h = token;
                            }
                        }
                    } catch (IllegalStateException unused2) {
                    }
                }
                MediaButtonReceiver.C1083a aVar2 = (MediaButtonReceiver.C1083a) C0148b.this;
                Context context2 = aVar2.f4081c;
                C0151c cVar2 = aVar2.f4084f.f416a;
                if (cVar2.f431h == null) {
                    MediaSession.Token sessionToken2 = cVar2.f425b.getSessionToken();
                    if (sessionToken2 != null) {
                        token2 = new MediaSessionCompat.Token(sessionToken2, (C0174b) null);
                    }
                    cVar2.f431h = token2;
                }
                MediaSessionCompat.Token token3 = cVar2.f431h;
                new ConcurrentHashMap();
                if (token3 != null) {
                    MediaControllerCompat$MediaControllerImplApi21 mediaControllerCompat$MediaControllerImplApi21 = new MediaControllerCompat$MediaControllerImplApi21(context2, token3);
                    KeyEvent keyEvent = (KeyEvent) aVar2.f4082d.getParcelableExtra("android.intent.extra.KEY_EVENT");
                    if (keyEvent != null) {
                        mediaControllerCompat$MediaControllerImplApi21.f450a.dispatchMediaButtonEvent(keyEvent);
                        aVar2.mo4383a();
                        return;
                    }
                    throw new IllegalArgumentException("KeyEvent may not be null");
                }
                throw new IllegalArgumentException("sessionToken must not be null");
            }

            public final void onConnectionFailed() {
                C0150b bVar = C0148b.this.f422b;
                if (bVar != null) {
                    bVar.getClass();
                }
                ((MediaButtonReceiver.C1083a) C0148b.this).mo4383a();
            }

            public final void onConnectionSuspended() {
                C0150b bVar = C0148b.this.f422b;
                if (bVar != null) {
                    C0151c cVar = (C0151c) bVar;
                    cVar.f429f = null;
                    cVar.f430g = null;
                    cVar.f431h = null;
                    C0147a aVar = cVar.f427d;
                    aVar.getClass();
                    aVar.f420b = new WeakReference<>((Object) null);
                }
                ((MediaButtonReceiver.C1083a) C0148b.this).mo4383a();
            }
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$b$b */
        public interface C0150b {
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$c */
    public static class C0151c implements C0154f, C0148b.C0150b {

        /* renamed from: a */
        public final Context f424a;

        /* renamed from: b */
        public final MediaBrowser f425b;

        /* renamed from: c */
        public final Bundle f426c;

        /* renamed from: d */
        public final C0147a f427d = new C0147a(this);

        /* renamed from: e */
        public final C6302b<String, C0156h> f428e = new C6302b<>();

        /* renamed from: f */
        public C0155g f429f;

        /* renamed from: g */
        public Messenger f430g;

        /* renamed from: h */
        public MediaSessionCompat.Token f431h;

        public C0151c(Context context, ComponentName componentName, MediaButtonReceiver.C1083a aVar) {
            this.f424a = context;
            Bundle bundle = new Bundle();
            this.f426c = bundle;
            bundle.putInt("extra_client_version", 1);
            bundle.putInt("extra_calling_pid", Process.myPid());
            aVar.f422b = this;
            this.f425b = new MediaBrowser(context, componentName, aVar.f421a, bundle);
        }

        /* renamed from: a */
        public final void mo543a() {
        }

        /* renamed from: b */
        public final void mo544b() {
        }

        /* renamed from: c */
        public final void mo545c(Messenger messenger, String str, Bundle bundle) {
            if (this.f430g == messenger) {
                C0156h orDefault = this.f428e.getOrDefault(str, null);
                if (orDefault == null) {
                    int i = MediaBrowserCompat.f415b;
                    return;
                }
                for (int i2 = 0; i2 < orDefault.f435b.size(); i2++) {
                    if (C17884p.m44364e((Bundle) orDefault.f435b.get(i2), bundle)) {
                        C0157i iVar = (C0157i) orDefault.f434a.get(i2);
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$d */
    public static class C0152d extends C0151c {
        public C0152d(Context context, ComponentName componentName, MediaButtonReceiver.C1083a aVar) {
            super(context, componentName, aVar);
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$e */
    public static class C0153e extends C0152d {
        public C0153e(Context context, ComponentName componentName, MediaButtonReceiver.C1083a aVar) {
            super(context, componentName, aVar);
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$f */
    public interface C0154f {
        /* renamed from: a */
        void mo543a();

        /* renamed from: b */
        void mo544b();

        /* renamed from: c */
        void mo545c(Messenger messenger, String str, Bundle bundle);
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$g */
    public static class C0155g {

        /* renamed from: a */
        public Messenger f432a;

        /* renamed from: b */
        public Bundle f433b;

        public C0155g(IBinder iBinder, Bundle bundle) {
            this.f432a = new Messenger(iBinder);
            this.f433b = bundle;
        }

        /* renamed from: a */
        public final void mo546a(int i, Bundle bundle, Messenger messenger) throws RemoteException {
            Message obtain = Message.obtain();
            obtain.what = i;
            obtain.arg1 = 1;
            obtain.setData(bundle);
            obtain.replyTo = messenger;
            this.f432a.send(obtain);
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$h */
    public static class C0156h {

        /* renamed from: a */
        public final ArrayList f434a = new ArrayList();

        /* renamed from: b */
        public final ArrayList f435b = new ArrayList();
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$i */
    public static abstract class C0157i {

        /* renamed from: android.support.v4.media.MediaBrowserCompat$i$a */
        public class C0158a extends MediaBrowser.SubscriptionCallback {
            public C0158a() {
            }

            public final void onChildrenLoaded(String str, List<MediaBrowser.MediaItem> list) {
                C0157i.this.getClass();
                C0157i iVar = C0157i.this;
                MediaItem.m267b(list);
                iVar.getClass();
            }

            public final void onError(String str) {
                C0157i.this.getClass();
            }
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$i$b */
        public class C0159b extends C0158a {
            public C0159b() {
                super();
            }

            public final void onChildrenLoaded(String str, List<MediaBrowser.MediaItem> list, Bundle bundle) {
                MediaSessionCompat.m306a(bundle);
                C0157i iVar = C0157i.this;
                MediaItem.m267b(list);
                iVar.getClass();
            }

            public final void onError(String str, Bundle bundle) {
                MediaSessionCompat.m306a(bundle);
                C0157i.this.getClass();
            }
        }

        public C0157i() {
            new Binder();
            if (Build.VERSION.SDK_INT >= 26) {
                new C0159b();
            } else {
                new C0158a();
            }
        }
    }

    static {
        Log.isLoggable("MediaBrowserCompat", 3);
    }

    public MediaBrowserCompat(Context context, ComponentName componentName, MediaButtonReceiver.C1083a aVar) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            this.f416a = new C0153e(context, componentName, aVar);
        } else if (i >= 23) {
            this.f416a = new C0152d(context, componentName, aVar);
        } else {
            this.f416a = new C0151c(context, componentName, aVar);
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    /* renamed from: android.support.v4.media.MediaBrowserCompat$MediaItem */
    public static class MediaItem implements Parcelable {
        public static final Parcelable.Creator<MediaItem> CREATOR = new C0146a();

        /* renamed from: b */
        public final int f417b;

        /* renamed from: c */
        public final MediaDescriptionCompat f418c;

        /* renamed from: android.support.v4.media.MediaBrowserCompat$MediaItem$a */
        public class C0146a implements Parcelable.Creator<MediaItem> {
            public final Object createFromParcel(Parcel parcel) {
                return new MediaItem(parcel);
            }

            public final Object[] newArray(int i) {
                return new MediaItem[i];
            }
        }

        public MediaItem(MediaDescriptionCompat mediaDescriptionCompat, int i) {
            if (mediaDescriptionCompat == null) {
                throw new IllegalArgumentException("description cannot be null");
            } else if (!TextUtils.isEmpty(mediaDescriptionCompat.f438b)) {
                this.f417b = i;
                this.f418c = mediaDescriptionCompat;
            } else {
                throw new IllegalArgumentException("description must have a non-empty media id");
            }
        }

        /* renamed from: b */
        public static void m267b(List list) {
            MediaItem mediaItem;
            if (list != null) {
                ArrayList arrayList = new ArrayList(list.size());
                for (Object next : list) {
                    if (next != null) {
                        MediaBrowser.MediaItem mediaItem2 = (MediaBrowser.MediaItem) next;
                        mediaItem = new MediaItem(MediaDescriptionCompat.m276b(mediaItem2.getDescription()), mediaItem2.getFlags());
                    } else {
                        mediaItem = null;
                    }
                    arrayList.add(mediaItem);
                }
            }
        }

        public final int describeContents() {
            return 0;
        }

        public final String toString() {
            StringBuilder n = C13437d.m33708n("MediaItem{", "mFlags=");
            n.append(this.f417b);
            n.append(", mDescription=");
            n.append(this.f418c);
            n.append('}');
            return n.toString();
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f417b);
            this.f418c.writeToParcel(parcel, i);
        }

        public MediaItem(Parcel parcel) {
            this.f417b = parcel.readInt();
            this.f418c = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
        }
    }
}
