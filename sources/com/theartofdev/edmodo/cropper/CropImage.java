package com.theartofdev.edmodo.cropper;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.provider.MediaStore;
import com.theartofdev.edmodo.cropper.CropImageView;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import pb0.C13004e;

public final class CropImage {

    public static final class ActivityResult extends CropImageView.C8040b implements Parcelable {
        public static final Parcelable.Creator<ActivityResult> CREATOR = new C8037a();

        /* renamed from: com.theartofdev.edmodo.cropper.CropImage$ActivityResult$a */
        public static class C8037a implements Parcelable.Creator<ActivityResult> {
            public final Object createFromParcel(Parcel parcel) {
                return new ActivityResult(parcel);
            }

            public final Object[] newArray(int i) {
                return new ActivityResult[i];
            }
        }

        public ActivityResult(Uri uri, Uri uri2, Exception exc, float[] fArr, Rect rect, int i, Rect rect2, int i2) {
            super(uri, uri2, exc, fArr, rect, rect2, i, i2);
        }

        public final int describeContents() {
            return 0;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f24403b, i);
            parcel.writeParcelable(this.f24404c, i);
            parcel.writeSerializable(this.f24405d);
            parcel.writeFloatArray(this.f24406e);
            parcel.writeParcelable(this.f24407f, i);
            parcel.writeParcelable(this.f24408g, i);
            parcel.writeInt(this.f24409h);
            parcel.writeInt(this.f24410i);
        }

        public ActivityResult(Parcel parcel) {
            super((Uri) parcel.readParcelable(Uri.class.getClassLoader()), (Uri) parcel.readParcelable(Uri.class.getClassLoader()), (Exception) parcel.readSerializable(), parcel.createFloatArray(), (Rect) parcel.readParcelable(Rect.class.getClassLoader()), (Rect) parcel.readParcelable(Rect.class.getClassLoader()), parcel.readInt(), parcel.readInt());
        }
    }

    /* renamed from: a */
    public static ArrayList m18337a(PackageManager packageManager, String str) {
        Intent intent;
        ArrayList arrayList = new ArrayList();
        if (str == "android.intent.action.GET_CONTENT") {
            intent = new Intent(str);
        } else {
            intent = new Intent(str, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
        }
        intent.setType("image/*");
        for (ResolveInfo next : packageManager.queryIntentActivities(intent, 0)) {
            Intent intent2 = new Intent(intent);
            ActivityInfo activityInfo = next.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.packageName, activityInfo.name));
            intent2.setPackage(next.activityInfo.packageName);
            arrayList.add(intent2);
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Intent intent3 = (Intent) it.next();
            if (intent3.getComponent().getClassName().equals("com.android.documentsui.DocumentsActivity")) {
                arrayList.remove(intent3);
                break;
            }
        }
        return arrayList;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x003a A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m18338b(android.content.Context r7) {
        /*
            java.lang.String r0 = "android.permission.CAMERA"
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 0
            r3 = 1
            r4 = 23
            if (r1 < r4) goto L_0x003b
            java.lang.String r1 = r7.getPackageName()
            android.content.pm.PackageManager r4 = r7.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0030 }
            r5 = 4096(0x1000, float:5.74E-42)
            android.content.pm.PackageInfo r1 = r4.getPackageInfo(r1, r5)     // Catch:{ NameNotFoundException -> 0x0030 }
            java.lang.String[] r1 = r1.requestedPermissions     // Catch:{ NameNotFoundException -> 0x0030 }
            if (r1 == 0) goto L_0x0031
            int r4 = r1.length     // Catch:{ NameNotFoundException -> 0x0030 }
            if (r4 <= 0) goto L_0x0031
            int r4 = r1.length     // Catch:{ NameNotFoundException -> 0x0030 }
            r5 = 0
        L_0x0021:
            if (r5 >= r4) goto L_0x0031
            r6 = r1[r5]     // Catch:{ NameNotFoundException -> 0x0030 }
            boolean r6 = r6.equalsIgnoreCase(r0)     // Catch:{ NameNotFoundException -> 0x0030 }
            if (r6 == 0) goto L_0x002d
            r0 = 1
            goto L_0x0032
        L_0x002d:
            int r5 = r5 + 1
            goto L_0x0021
        L_0x0030:
        L_0x0031:
            r0 = 0
        L_0x0032:
            if (r0 == 0) goto L_0x003b
            int r7 = r7.checkSelfPermission("android.permission.CAMERA")
            if (r7 == 0) goto L_0x003b
            r2 = 1
        L_0x003b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.theartofdev.edmodo.cropper.CropImage.m18338b(android.content.Context):boolean");
    }

    /* renamed from: c */
    public static boolean m18339c(Context context, Uri uri) {
        boolean z;
        if (Build.VERSION.SDK_INT < 23 || context.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") == 0) {
            return false;
        }
        try {
            InputStream openInputStream = context.getContentResolver().openInputStream(uri);
            if (openInputStream != null) {
                openInputStream.close();
            }
            z = false;
        } catch (Exception unused) {
            z = true;
        }
        if (z) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static void m18340d(Activity activity) {
        Intent intent;
        Uri uri;
        String string = activity.getString(C13004e.pick_image_intent_chooser_title);
        ArrayList arrayList = new ArrayList();
        PackageManager packageManager = activity.getPackageManager();
        if (!m18338b(activity)) {
            ArrayList arrayList2 = new ArrayList();
            File externalCacheDir = activity.getExternalCacheDir();
            if (externalCacheDir != null) {
                uri = Uri.fromFile(new File(externalCacheDir.getPath(), "pickImageResult.jpeg"));
            } else {
                uri = null;
            }
            Intent intent2 = new Intent("android.media.action.IMAGE_CAPTURE");
            for (ResolveInfo next : packageManager.queryIntentActivities(intent2, 0)) {
                Intent intent3 = new Intent(intent2);
                ActivityInfo activityInfo = next.activityInfo;
                intent3.setComponent(new ComponentName(activityInfo.packageName, activityInfo.name));
                intent3.setPackage(next.activityInfo.packageName);
                if (uri != null) {
                    intent3.putExtra("output", uri);
                }
                arrayList2.add(intent3);
            }
            arrayList.addAll(arrayList2);
        }
        ArrayList a = m18337a(packageManager, "android.intent.action.GET_CONTENT");
        if (a.size() == 0) {
            a = m18337a(packageManager, "android.intent.action.PICK");
        }
        arrayList.addAll(a);
        if (arrayList.isEmpty()) {
            intent = new Intent();
        } else {
            intent = (Intent) arrayList.get(arrayList.size() - 1);
            arrayList.remove(arrayList.size() - 1);
        }
        Intent createChooser = Intent.createChooser(intent, string);
        createChooser.putExtra("android.intent.extra.INITIAL_INTENTS", (Parcelable[]) arrayList.toArray(new Parcelable[arrayList.size()]));
        activity.startActivityForResult(createChooser, 200);
    }
}
