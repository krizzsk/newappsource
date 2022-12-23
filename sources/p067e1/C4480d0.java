package p067e1;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.RemoteInput;
import android.content.Context;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.appboy.models.InAppMessageBase;
import java.util.ArrayList;
import java.util.Iterator;
import p067e1.C4489h0;
import p241s0.C6304d;

/* renamed from: e1.d0 */
public final class C4480d0 implements C4508n {

    /* renamed from: a */
    public final Context f15540a;

    /* renamed from: b */
    public final Notification.Builder f15541b;

    /* renamed from: c */
    public final C4522y f15542c;

    /* renamed from: d */
    public RemoteViews f15543d;

    /* renamed from: e */
    public RemoteViews f15544e;

    /* renamed from: f */
    public final Bundle f15545f;

    /* renamed from: g */
    public RemoteViews f15546g;

    public C4480d0(C4522y yVar) {
        boolean z;
        boolean z2;
        boolean z3;
        String str;
        ArrayList<String> arrayList;
        int i;
        Bundle bundle;
        Notification.Action.Builder builder;
        Bundle bundle2;
        int i2;
        Icon icon;
        C4480d0 d0Var = this;
        C4522y yVar2 = yVar;
        new ArrayList();
        d0Var.f15545f = new Bundle();
        d0Var.f15542c = yVar2;
        d0Var.f15540a = yVar2.f15620a;
        if (Build.VERSION.SDK_INT >= 26) {
            d0Var.f15541b = new Notification.Builder(yVar2.f15620a, yVar2.f15642w);
        } else {
            d0Var.f15541b = new Notification.Builder(yVar2.f15620a);
        }
        Notification notification = yVar2.f15644y;
        Bundle[] bundleArr = null;
        Notification.Builder lights = d0Var.f15541b.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, (RemoteViews) null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS);
        boolean z4 = true;
        if ((notification.flags & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        Notification.Builder ongoing = lights.setOngoing(z);
        if ((notification.flags & 8) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        Notification.Builder onlyAlertOnce = ongoing.setOnlyAlertOnce(z2);
        if ((notification.flags & 16) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        onlyAlertOnce.setAutoCancel(z3).setDefaults(notification.defaults).setContentTitle(yVar2.f15624e).setContentText(yVar2.f15625f).setContentInfo((CharSequence) null).setContentIntent(yVar2.f15626g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent((PendingIntent) null, (notification.flags & RecyclerView.C1119a0.FLAG_IGNORE) == 0 ? false : z4).setLargeIcon(yVar2.f15627h).setNumber(yVar2.f15628i).setProgress(0, 0, false);
        d0Var.f15541b.setSubText(yVar2.f15632m).setUsesChronometer(false).setPriority(yVar2.f15629j);
        Iterator<C4514t> it = yVar2.f15621b.iterator();
        while (true) {
            str = "android.support.allowGeneratedReplies";
            if (!it.hasNext()) {
                break;
            }
            C4514t next = it.next();
            int i3 = Build.VERSION.SDK_INT;
            IconCompat a = next.mo20029a();
            if (i3 >= 23) {
                if (a != null) {
                    icon = a.mo3433j((Context) null);
                } else {
                    icon = null;
                }
                builder = new Notification.Action.Builder(icon, next.f15613i, next.f15614j);
            } else {
                if (a != null) {
                    i2 = a.mo3428d();
                } else {
                    i2 = 0;
                }
                builder = new Notification.Action.Builder(i2, next.f15613i, next.f15614j);
            }
            C4495j0[] j0VarArr = next.f15607c;
            if (j0VarArr != null) {
                int length = j0VarArr.length;
                RemoteInput[] remoteInputArr = new RemoteInput[length];
                for (int i4 = 0; i4 < j0VarArr.length; i4++) {
                    remoteInputArr[i4] = C4495j0.m11721a(j0VarArr[i4]);
                }
                for (int i5 = 0; i5 < length; i5++) {
                    builder.addRemoteInput(remoteInputArr[i5]);
                }
            }
            if (next.f15605a != null) {
                bundle2 = new Bundle(next.f15605a);
            } else {
                bundle2 = new Bundle();
            }
            bundle2.putBoolean(str, next.f15608d);
            int i6 = Build.VERSION.SDK_INT;
            if (i6 >= 24) {
                builder.setAllowGeneratedReplies(next.f15608d);
            }
            bundle2.putInt("android.support.action.semanticAction", next.f15610f);
            if (i6 >= 28) {
                builder.setSemanticAction(next.f15610f);
            }
            if (i6 >= 29) {
                builder.setContextual(next.f15611g);
            }
            if (i6 >= 31) {
                builder.setAuthenticationRequired(next.f15615k);
            }
            bundle2.putBoolean("android.support.action.showsUserInterface", next.f15609e);
            builder.addExtras(bundle2);
            d0Var.f15541b.addAction(builder.build());
        }
        Bundle bundle3 = yVar2.f15635p;
        if (bundle3 != null) {
            d0Var.f15545f.putAll(bundle3);
        }
        int i7 = Build.VERSION.SDK_INT;
        d0Var.f15543d = yVar2.f15639t;
        d0Var.f15544e = yVar2.f15640u;
        d0Var.f15541b.setShowWhen(yVar2.f15630k);
        d0Var.f15541b.setLocalOnly(yVar2.f15633n).setGroup((String) null).setGroupSummary(false).setSortKey((String) null);
        d0Var.f15541b.setCategory(yVar2.f15634o).setColor(yVar2.f15636q).setVisibility(yVar2.f15637r).setPublicVersion(yVar2.f15638s).setSound(notification.sound, notification.audioAttributes);
        if (i7 < 28) {
            ArrayList<C4489h0> arrayList2 = yVar2.f15622c;
            if (arrayList2 == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList<>(arrayList2.size());
                Iterator<C4489h0> it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    C4489h0 next2 = it2.next();
                    String str2 = next2.f15565c;
                    if (str2 == null) {
                        if (next2.f15563a != null) {
                            StringBuilder k = C13555b.m33972k("name:");
                            k.append(next2.f15563a);
                            str2 = k.toString();
                        } else {
                            str2 = "";
                        }
                    }
                    arrayList.add(str2);
                }
            }
            ArrayList<String> arrayList3 = yVar2.f15645z;
            if (arrayList == null) {
                arrayList = arrayList3;
            } else if (arrayList3 != null) {
                C6304d dVar = new C6304d(arrayList3.size() + arrayList.size());
                dVar.addAll(arrayList);
                dVar.addAll(arrayList3);
                arrayList = new ArrayList<>(dVar);
            }
        } else {
            arrayList = yVar2.f15645z;
        }
        if (arrayList != null && !arrayList.isEmpty()) {
            for (String addPerson : arrayList) {
                d0Var.f15541b.addPerson(addPerson);
            }
        }
        d0Var.f15546g = yVar2.f15641v;
        if (yVar2.f15623d.size() > 0) {
            if (yVar2.f15635p == null) {
                yVar2.f15635p = new Bundle();
            }
            Bundle bundle4 = yVar2.f15635p.getBundle("android.car.EXTENSIONS");
            bundle4 = bundle4 == null ? new Bundle() : bundle4;
            Bundle bundle5 = new Bundle(bundle4);
            Bundle bundle6 = new Bundle();
            int i8 = 0;
            while (i8 < yVar2.f15623d.size()) {
                String num = Integer.toString(i8);
                C4514t tVar = yVar2.f15623d.get(i8);
                Object obj = C4482e0.f15549a;
                Bundle bundle7 = new Bundle();
                IconCompat a2 = tVar.mo20029a();
                if (a2 != null) {
                    i = a2.mo3428d();
                } else {
                    i = 0;
                }
                bundle7.putInt("icon", i);
                bundle7.putCharSequence("title", tVar.f15613i);
                bundle7.putParcelable("actionIntent", tVar.f15614j);
                if (tVar.f15605a != null) {
                    bundle = new Bundle(tVar.f15605a);
                } else {
                    bundle = new Bundle();
                }
                bundle.putBoolean(str, tVar.f15608d);
                bundle7.putBundle(InAppMessageBase.EXTRAS, bundle);
                C4495j0[] j0VarArr2 = tVar.f15607c;
                if (j0VarArr2 != null) {
                    bundleArr = new Bundle[j0VarArr2.length];
                    int i9 = 0;
                    while (i9 < j0VarArr2.length) {
                        C4495j0 j0Var = j0VarArr2[i9];
                        String str3 = str;
                        Bundle bundle8 = new Bundle();
                        j0Var.getClass();
                        bundle8.putString("resultKey", (String) null);
                        bundle8.putCharSequence("label", (CharSequence) null);
                        bundle8.putCharSequenceArray("choices", (CharSequence[]) null);
                        bundle8.putBoolean("allowFreeFormInput", false);
                        bundle8.putBundle(InAppMessageBase.EXTRAS, (Bundle) null);
                        bundleArr[i9] = bundle8;
                        i9++;
                        str = str3;
                        j0VarArr2 = j0VarArr2;
                    }
                }
                String str4 = str;
                bundle7.putParcelableArray("remoteInputs", bundleArr);
                bundle7.putBoolean("showsUserInterface", tVar.f15609e);
                bundle7.putInt("semanticAction", tVar.f15610f);
                bundle6.putBundle(num, bundle7);
                i8++;
                bundleArr = null;
                str = str4;
            }
            bundle4.putBundle("invisible_actions", bundle6);
            bundle5.putBundle("invisible_actions", bundle6);
            if (yVar2.f15635p == null) {
                yVar2.f15635p = new Bundle();
            }
            yVar2.f15635p.putBundle("android.car.EXTENSIONS", bundle4);
            d0Var = this;
            d0Var.f15545f.putBundle("android.car.EXTENSIONS", bundle5);
        }
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 24) {
            d0Var.f15541b.setExtras(yVar2.f15635p).setRemoteInputHistory((CharSequence[]) null);
            RemoteViews remoteViews = yVar2.f15639t;
            if (remoteViews != null) {
                d0Var.f15541b.setCustomContentView(remoteViews);
            }
            RemoteViews remoteViews2 = yVar2.f15640u;
            if (remoteViews2 != null) {
                d0Var.f15541b.setCustomBigContentView(remoteViews2);
            }
            RemoteViews remoteViews3 = yVar2.f15641v;
            if (remoteViews3 != null) {
                d0Var.f15541b.setCustomHeadsUpContentView(remoteViews3);
            }
        }
        if (i11 >= 26) {
            d0Var.f15541b.setBadgeIconType(0).setSettingsText((CharSequence) null).setShortcutId((String) null).setTimeoutAfter(0).setGroupAlertBehavior(0);
            if (!TextUtils.isEmpty(yVar2.f15642w)) {
                d0Var.f15541b.setSound((Uri) null).setDefaults(0).setLights(0, 0, 0).setVibrate((long[]) null);
            }
        }
        if (i11 >= 28) {
            Iterator<C4489h0> it3 = yVar2.f15622c.iterator();
            while (it3.hasNext()) {
                C4489h0 next3 = it3.next();
                Notification.Builder builder2 = d0Var.f15541b;
                next3.getClass();
                builder2.addPerson(C4489h0.C4490a.m11715b(next3));
            }
        }
        if (Build.VERSION.SDK_INT >= 29) {
            d0Var.f15541b.setAllowSystemGeneratedContextualActions(yVar2.f15643x);
            d0Var.f15541b.setBubbleMetadata((Notification.BubbleMetadata) null);
        }
    }
}
