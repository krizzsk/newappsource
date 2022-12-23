package androidx.core.app;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;
import p022b3.C1462b;

public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(C1462b bVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        Object obj = remoteActionCompat.f3329a;
        if (bVar.mo5799h(1)) {
            obj = bVar.mo5805n();
        }
        remoteActionCompat.f3329a = (IconCompat) obj;
        CharSequence charSequence = remoteActionCompat.f3330b;
        if (bVar.mo5799h(2)) {
            charSequence = bVar.mo5798g();
        }
        remoteActionCompat.f3330b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.f3331c;
        if (bVar.mo5799h(3)) {
            charSequence2 = bVar.mo5798g();
        }
        remoteActionCompat.f3331c = charSequence2;
        remoteActionCompat.f3332d = (PendingIntent) bVar.mo5803l(remoteActionCompat.f3332d, 4);
        boolean z = remoteActionCompat.f3333e;
        if (bVar.mo5799h(5)) {
            z = bVar.mo5796e();
        }
        remoteActionCompat.f3333e = z;
        boolean z2 = remoteActionCompat.f3334f;
        if (bVar.mo5799h(6)) {
            z2 = bVar.mo5796e();
        }
        remoteActionCompat.f3334f = z2;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, C1462b bVar) {
        bVar.getClass();
        IconCompat iconCompat = remoteActionCompat.f3329a;
        bVar.mo5806o(1);
        bVar.mo5814w(iconCompat);
        CharSequence charSequence = remoteActionCompat.f3330b;
        bVar.mo5806o(2);
        bVar.mo5809r(charSequence);
        CharSequence charSequence2 = remoteActionCompat.f3331c;
        bVar.mo5806o(3);
        bVar.mo5809r(charSequence2);
        PendingIntent pendingIntent = remoteActionCompat.f3332d;
        bVar.mo5806o(4);
        bVar.mo5812u(pendingIntent);
        boolean z = remoteActionCompat.f3333e;
        bVar.mo5806o(5);
        bVar.mo5807p(z);
        boolean z2 = remoteActionCompat.f3334f;
        bVar.mo5806o(6);
        bVar.mo5807p(z2);
    }
}
