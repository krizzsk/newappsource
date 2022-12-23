package androidx.media;

import android.app.Service;
import android.content.Intent;
import android.media.browse.MediaBrowser;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.service.media.MediaBrowserService;
import android.support.p015v4.media.MediaBrowserCompat;
import android.support.p015v4.media.session.MediaSessionCompat;
import android.support.p015v4.p016os.ResultReceiver;
import android.text.TextUtils;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p067e1.C4494j;
import p142k2.C5460a;
import p229r1.C6233c;
import p241s0.C6302b;

public abstract class MediaBrowserServiceCompat extends Service {

    /* renamed from: b */
    public C1062d f4020b;

    /* renamed from: c */
    public final C1059b f4021c = new C1059b("android.media.session.MediaController", -1, -1, (C1071j) null);

    /* renamed from: d */
    public final ArrayList<C1059b> f4022d = new ArrayList<>();

    /* renamed from: e */
    public final C6302b<IBinder, C1059b> f4023e = new C6302b<>();

    /* renamed from: f */
    public final C1073l f4024f = new C1073l(this);

    /* renamed from: androidx.media.MediaBrowserServiceCompat$a */
    public static final class C1058a {

        /* renamed from: a */
        public final String f4025a;

        /* renamed from: b */
        public final Bundle f4026b;

        public C1058a(String str, Bundle bundle) {
            if (str != null) {
                this.f4025a = str;
                this.f4026b = bundle;
                return;
            }
            throw new IllegalArgumentException("The root id in BrowserRoot cannot be null. Use null for BrowserRoot instead");
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$b */
    public class C1059b implements IBinder.DeathRecipient {

        /* renamed from: a */
        public final String f4027a;

        /* renamed from: b */
        public final int f4028b;

        /* renamed from: c */
        public final int f4029c;

        /* renamed from: d */
        public final C1071j f4030d;

        /* renamed from: e */
        public final HashMap<String, List<C6233c<IBinder, Bundle>>> f4031e = new HashMap<>();

        /* renamed from: f */
        public C1058a f4032f;

        /* renamed from: androidx.media.MediaBrowserServiceCompat$b$a */
        public class C1060a implements Runnable {
            public C1060a() {
            }

            public final void run() {
                C1059b bVar = C1059b.this;
                MediaBrowserServiceCompat.this.f4023e.remove(((C1072k) bVar.f4030d).mo4369a());
            }
        }

        public C1059b(String str, int i, int i2, C1071j jVar) {
            this.f4027a = str;
            this.f4028b = i;
            this.f4029c = i2;
            if (Build.VERSION.SDK_INT >= 28) {
                new C5460a(str, i, i2);
            }
            this.f4030d = jVar;
        }

        public final void binderDied() {
            MediaBrowserServiceCompat.this.f4024f.post(new C1060a());
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$c */
    public interface C1061c {
        void onCreate();
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$d */
    public class C1062d implements C1061c {

        /* renamed from: a */
        public final ArrayList f4035a = new ArrayList();

        /* renamed from: b */
        public C1063a f4036b;

        /* renamed from: c */
        public Messenger f4037c;

        /* renamed from: androidx.media.MediaBrowserServiceCompat$d$a */
        public class C1063a extends MediaBrowserService {
            public C1063a(MediaBrowserServiceCompat mediaBrowserServiceCompat) {
                attachBaseContext(mediaBrowserServiceCompat);
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0076  */
            /* JADX WARNING: Removed duplicated region for block: B:13:0x0078  */
            /* JADX WARNING: Removed duplicated region for block: B:23:0x0099  */
            /* JADX WARNING: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
            @android.annotation.SuppressLint({"SyntheticAccessor"})
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final android.service.media.MediaBrowserService.BrowserRoot onGetRoot(java.lang.String r12, int r13, android.os.Bundle r14) {
                /*
                    r11 = this;
                    android.support.p015v4.media.session.MediaSessionCompat.m306a(r14)
                    androidx.media.MediaBrowserServiceCompat$d r0 = androidx.media.MediaBrowserServiceCompat.C1062d.this
                    r1 = 0
                    if (r14 != 0) goto L_0x000a
                    r2 = r1
                    goto L_0x000f
                L_0x000a:
                    android.os.Bundle r2 = new android.os.Bundle
                    r2.<init>(r14)
                L_0x000f:
                    r14 = -1
                    if (r2 == 0) goto L_0x0057
                    r0.getClass()
                    r3 = 0
                    java.lang.String r4 = "extra_client_version"
                    int r3 = r2.getInt(r4, r3)
                    if (r3 == 0) goto L_0x0057
                    r2.remove(r4)
                    android.os.Messenger r3 = new android.os.Messenger
                    androidx.media.MediaBrowserServiceCompat r4 = androidx.media.MediaBrowserServiceCompat.this
                    androidx.media.MediaBrowserServiceCompat$l r4 = r4.f4024f
                    r3.<init>(r4)
                    r0.f4037c = r3
                    android.os.Bundle r3 = new android.os.Bundle
                    r3.<init>()
                    r4 = 2
                    java.lang.String r5 = "extra_service_version"
                    r3.putInt(r5, r4)
                    android.os.Messenger r4 = r0.f4037c
                    android.os.IBinder r4 = r4.getBinder()
                    java.lang.String r5 = "extra_messenger"
                    p067e1.C4494j.m11720b(r3, r5, r4)
                    androidx.media.MediaBrowserServiceCompat r4 = androidx.media.MediaBrowserServiceCompat.this
                    r4.getClass()
                    java.util.ArrayList r4 = r0.f4035a
                    r4.add(r3)
                    java.lang.String r4 = "extra_calling_pid"
                    int r14 = r2.getInt(r4, r14)
                    r2.remove(r4)
                    r8 = r14
                    goto L_0x0059
                L_0x0057:
                    r3 = r1
                    r8 = -1
                L_0x0059:
                    androidx.media.MediaBrowserServiceCompat$b r14 = new androidx.media.MediaBrowserServiceCompat$b
                    androidx.media.MediaBrowserServiceCompat r6 = androidx.media.MediaBrowserServiceCompat.this
                    r10 = 0
                    r5 = r14
                    r7 = r12
                    r9 = r13
                    r5.<init>(r7, r8, r9, r10)
                    androidx.media.MediaBrowserServiceCompat r12 = androidx.media.MediaBrowserServiceCompat.this
                    r12.getClass()
                    androidx.media.MediaBrowserServiceCompat r12 = androidx.media.MediaBrowserServiceCompat.this
                    androidx.media.MediaBrowserServiceCompat$a r12 = r12.mo4356a()
                    androidx.media.MediaBrowserServiceCompat r13 = androidx.media.MediaBrowserServiceCompat.this
                    r13.getClass()
                    if (r12 != 0) goto L_0x0078
                    r13 = r1
                    goto L_0x0096
                L_0x0078:
                    android.os.Messenger r13 = r0.f4037c
                    if (r13 == 0) goto L_0x0083
                    androidx.media.MediaBrowserServiceCompat r13 = androidx.media.MediaBrowserServiceCompat.this
                    java.util.ArrayList<androidx.media.MediaBrowserServiceCompat$b> r13 = r13.f4022d
                    r13.add(r14)
                L_0x0083:
                    if (r3 != 0) goto L_0x0088
                    android.os.Bundle r3 = r12.f4026b
                    goto L_0x008f
                L_0x0088:
                    android.os.Bundle r13 = r12.f4026b
                    if (r13 == 0) goto L_0x008f
                    r3.putAll(r13)
                L_0x008f:
                    androidx.media.MediaBrowserServiceCompat$a r13 = new androidx.media.MediaBrowserServiceCompat$a
                    java.lang.String r12 = r12.f4025a
                    r13.<init>(r12, r3)
                L_0x0096:
                    if (r13 != 0) goto L_0x0099
                    goto L_0x00a2
                L_0x0099:
                    android.service.media.MediaBrowserService$BrowserRoot r1 = new android.service.media.MediaBrowserService$BrowserRoot
                    java.lang.String r12 = r13.f4025a
                    android.os.Bundle r13 = r13.f4026b
                    r1.<init>(r12, r13)
                L_0x00a2:
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.media.MediaBrowserServiceCompat.C1062d.C1063a.onGetRoot(java.lang.String, int, android.os.Bundle):android.service.media.MediaBrowserService$BrowserRoot");
            }

            public final void onLoadChildren(String str, MediaBrowserService.Result<List<MediaBrowser.MediaItem>> result) {
                C1062d dVar = C1062d.this;
                dVar.getClass();
                MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
                C1059b bVar = mediaBrowserServiceCompat.f4021c;
                mediaBrowserServiceCompat.mo4357b();
                MediaBrowserServiceCompat.this.getClass();
            }
        }

        public C1062d() {
        }

        public void onCreate() {
            C1063a aVar = new C1063a(MediaBrowserServiceCompat.this);
            this.f4036b = aVar;
            aVar.onCreate();
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$e */
    public class C1064e extends C1062d {

        /* renamed from: androidx.media.MediaBrowserServiceCompat$e$a */
        public class C1065a extends C1062d.C1063a {
            public C1065a(MediaBrowserServiceCompat mediaBrowserServiceCompat) {
                super(mediaBrowserServiceCompat);
            }

            public final void onLoadItem(String str, MediaBrowserService.Result<MediaBrowser.MediaItem> result) {
                C1064e eVar = C1064e.this;
                C1069h hVar = new C1069h(result);
                MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
                C1059b bVar = mediaBrowserServiceCompat.f4021c;
                mediaBrowserServiceCompat.getClass();
                hVar.mo4368a(null);
                MediaBrowserServiceCompat.this.getClass();
            }
        }

        public C1064e() {
            super();
        }

        public void onCreate() {
            C1065a aVar = new C1065a(MediaBrowserServiceCompat.this);
            this.f4036b = aVar;
            aVar.onCreate();
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$f */
    public class C1066f extends C1064e {

        /* renamed from: androidx.media.MediaBrowserServiceCompat$f$a */
        public class C1067a extends C1064e.C1065a {
            public C1067a(MediaBrowserServiceCompat mediaBrowserServiceCompat) {
                super(mediaBrowserServiceCompat);
            }

            public final void onLoadChildren(String str, MediaBrowserService.Result<List<MediaBrowser.MediaItem>> result, Bundle bundle) {
                MediaSessionCompat.m306a(bundle);
                C1066f fVar = C1066f.this;
                C1059b bVar = MediaBrowserServiceCompat.this.f4021c;
                fVar.getClass();
                MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
                C1059b bVar2 = mediaBrowserServiceCompat.f4021c;
                mediaBrowserServiceCompat.mo4357b();
                MediaBrowserServiceCompat.this.getClass();
                MediaBrowserServiceCompat.this.getClass();
            }
        }

        public C1066f() {
            super();
        }

        public final void onCreate() {
            C1067a aVar = new C1067a(MediaBrowserServiceCompat.this);
            this.f4036b = aVar;
            aVar.onCreate();
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$g */
    public class C1068g extends C1066f {
        public C1068g(MediaBrowserServiceCompat mediaBrowserServiceCompat) {
            super();
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$h */
    public static class C1069h<T> {

        /* renamed from: a */
        public MediaBrowserService.Result f4044a;

        public C1069h(MediaBrowserService.Result result) {
            this.f4044a = result;
        }

        /* renamed from: a */
        public final void mo4368a(T t) {
            ArrayList arrayList = null;
            if (t instanceof List) {
                MediaBrowserService.Result result = this.f4044a;
                List<Parcel> list = (List) t;
                if (list != null) {
                    arrayList = new ArrayList();
                    for (Parcel parcel : list) {
                        parcel.setDataPosition(0);
                        arrayList.add((MediaBrowser.MediaItem) MediaBrowser.MediaItem.CREATOR.createFromParcel(parcel));
                        parcel.recycle();
                    }
                }
                result.sendResult(arrayList);
            } else if (t instanceof Parcel) {
                Parcel parcel2 = (Parcel) t;
                parcel2.setDataPosition(0);
                this.f4044a.sendResult(MediaBrowser.MediaItem.CREATOR.createFromParcel(parcel2));
                parcel2.recycle();
            } else {
                this.f4044a.sendResult((Object) null);
            }
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$i */
    public class C1070i {
        public C1070i() {
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$j */
    public interface C1071j {
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$k */
    public static class C1072k implements C1071j {

        /* renamed from: a */
        public final Messenger f4046a;

        public C1072k(Messenger messenger) {
            this.f4046a = messenger;
        }

        /* renamed from: a */
        public final IBinder mo4369a() {
            return this.f4046a.getBinder();
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$l */
    public final class C1073l extends Handler {

        /* renamed from: a */
        public final C1070i f4047a;

        public C1073l(MediaBrowserServiceCompat mediaBrowserServiceCompat) {
            this.f4047a = new C1070i();
        }

        /* renamed from: a */
        public final void mo4370a(Runnable runnable) {
            if (Thread.currentThread() == getLooper().getThread()) {
                runnable.run();
            } else {
                post(runnable);
            }
        }

        public final void handleMessage(Message message) {
            Message message2 = message;
            Bundle data = message.getData();
            switch (message2.what) {
                case 1:
                    Bundle bundle = data.getBundle("data_root_hints");
                    MediaSessionCompat.m306a(bundle);
                    C1070i iVar = this.f4047a;
                    String string = data.getString("data_package_name");
                    int i = data.getInt("data_calling_pid");
                    int i2 = data.getInt("data_calling_uid");
                    C1072k kVar = new C1072k(message2.replyTo);
                    MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
                    boolean z = false;
                    if (string == null) {
                        mediaBrowserServiceCompat.getClass();
                    } else {
                        String[] packagesForUid = mediaBrowserServiceCompat.getPackageManager().getPackagesForUid(i2);
                        int length = packagesForUid.length;
                        int i3 = 0;
                        while (true) {
                            if (i3 < length) {
                                if (packagesForUid[i3].equals(string)) {
                                    z = true;
                                } else {
                                    i3++;
                                }
                            }
                        }
                    }
                    if (z) {
                        MediaBrowserServiceCompat.this.f4024f.mo4370a(new C1074a(i, i2, bundle, iVar, kVar, string));
                        return;
                    }
                    throw new IllegalArgumentException("Package/uid mismatch: uid=" + i2 + " package=" + string);
                case 2:
                    C1070i iVar2 = this.f4047a;
                    MediaBrowserServiceCompat.this.f4024f.mo4370a(new C1075b(iVar2, new C1072k(message2.replyTo)));
                    return;
                case 3:
                    Bundle bundle2 = data.getBundle("data_options");
                    MediaSessionCompat.m306a(bundle2);
                    C1070i iVar3 = this.f4047a;
                    String string2 = data.getString("data_media_item_id");
                    IBinder a = C4494j.m11719a(data, "data_callback_token");
                    MediaBrowserServiceCompat.this.f4024f.mo4370a(new C1076c(iVar3, new C1072k(message2.replyTo), string2, a, bundle2));
                    return;
                case 4:
                    C1070i iVar4 = this.f4047a;
                    String string3 = data.getString("data_media_item_id");
                    IBinder a2 = C4494j.m11719a(data, "data_callback_token");
                    MediaBrowserServiceCompat.this.f4024f.mo4370a(new C1077d(iVar4, new C1072k(message2.replyTo), string3, a2));
                    return;
                case 5:
                    C1070i iVar5 = this.f4047a;
                    String string4 = data.getString("data_media_item_id");
                    ResultReceiver resultReceiver = (ResultReceiver) data.getParcelable("data_result_receiver");
                    C1072k kVar2 = new C1072k(message2.replyTo);
                    iVar5.getClass();
                    if (!TextUtils.isEmpty(string4) && resultReceiver != null) {
                        MediaBrowserServiceCompat.this.f4024f.mo4370a(new C1078e(iVar5, kVar2, string4, resultReceiver));
                        return;
                    }
                    return;
                case 6:
                    Bundle bundle3 = data.getBundle("data_root_hints");
                    MediaSessionCompat.m306a(bundle3);
                    C1070i iVar6 = this.f4047a;
                    C1072k kVar3 = new C1072k(message2.replyTo);
                    String string5 = data.getString("data_package_name");
                    int i4 = data.getInt("data_calling_pid");
                    MediaBrowserServiceCompat.this.f4024f.mo4370a(new C1079f(data.getInt("data_calling_uid"), i4, bundle3, iVar6, kVar3, string5));
                    return;
                case 7:
                    C1070i iVar7 = this.f4047a;
                    MediaBrowserServiceCompat.this.f4024f.mo4370a(new C1080g(iVar7, new C1072k(message2.replyTo)));
                    return;
                case 8:
                    Bundle bundle4 = data.getBundle("data_search_extras");
                    MediaSessionCompat.m306a(bundle4);
                    C1070i iVar8 = this.f4047a;
                    String string6 = data.getString("data_search_query");
                    ResultReceiver resultReceiver2 = (ResultReceiver) data.getParcelable("data_result_receiver");
                    C1072k kVar4 = new C1072k(message2.replyTo);
                    iVar8.getClass();
                    if (!TextUtils.isEmpty(string6) && resultReceiver2 != null) {
                        MediaBrowserServiceCompat.this.f4024f.mo4370a(new C1081h(iVar8, kVar4, string6, bundle4, resultReceiver2));
                        return;
                    }
                    return;
                case 9:
                    Bundle bundle5 = data.getBundle("data_custom_action_extras");
                    MediaSessionCompat.m306a(bundle5);
                    C1070i iVar9 = this.f4047a;
                    String string7 = data.getString("data_custom_action");
                    ResultReceiver resultReceiver3 = (ResultReceiver) data.getParcelable("data_result_receiver");
                    C1072k kVar5 = new C1072k(message2.replyTo);
                    iVar9.getClass();
                    if (!TextUtils.isEmpty(string7) && resultReceiver3 != null) {
                        MediaBrowserServiceCompat.this.f4024f.mo4370a(new C1082i(iVar9, kVar5, string7, bundle5, resultReceiver3));
                        return;
                    }
                    return;
                default:
                    message.toString();
                    return;
            }
        }

        public final boolean sendMessageAtTime(Message message, long j) {
            Bundle data = message.getData();
            data.setClassLoader(MediaBrowserCompat.class.getClassLoader());
            data.putInt("data_calling_uid", Binder.getCallingUid());
            int callingPid = Binder.getCallingPid();
            if (callingPid > 0) {
                data.putInt("data_calling_pid", callingPid);
            } else if (!data.containsKey("data_calling_pid")) {
                data.putInt("data_calling_pid", -1);
            }
            return super.sendMessageAtTime(message, j);
        }
    }

    static {
        Log.isLoggable("MBServiceCompat", 3);
    }

    /* renamed from: a */
    public abstract C1058a mo4356a();

    /* renamed from: b */
    public abstract void mo4357b();

    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    public final IBinder onBind(Intent intent) {
        return this.f4020b.f4036b.onBind(intent);
    }

    public final void onCreate() {
        super.onCreate();
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            this.f4020b = new C1068g(this);
        } else if (i >= 26) {
            this.f4020b = new C1066f();
        } else if (i >= 23) {
            this.f4020b = new C1064e();
        } else {
            this.f4020b = new C1062d();
        }
        this.f4020b.onCreate();
    }
}
