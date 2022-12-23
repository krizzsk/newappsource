package com.moovit.image;

import android.content.ActivityNotFoundException;
import android.content.ClipData;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.google.android.gms.tasks.Tasks;
import com.moovit.C15682c;
import com.moovit.MoovitActivity;
import com.moovit.MoovitExecutors;
import com.moovit.commons.utils.DataUnit;
import com.theartofdev.edmodo.cropper.CropImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import p034c2.C1759a;
import p244s3.C6444s;
import p372at.C13515b;
import p578jf.C17843u;
import p578jf.C17844v;
import p686ns.C18587a;
import p805su.C19543e;
import p824tp.C19746x;
import p853uu.C19996f;
import p862vf.C20121e;
import p977zz.C20943i;
import p977zz.C20978z;

public abstract class ImageProviderFragment<A extends MoovitActivity> extends C15682c<A> {

    /* renamed from: o */
    public static final Bitmap.CompressFormat f41701o = Bitmap.CompressFormat.JPEG;

    /* renamed from: n */
    public PhotoTakingParams f41702n = null;

    public ImageProviderFragment(Class<A> cls) {
        super(cls);
    }

    /* renamed from: m2 */
    public static File m40784m2(ImageProviderFragment imageProviderFragment) {
        PhotoTakingParams photoTakingParams = imageProviderFragment.f41702n;
        List<String> list = PhotoTakingParams.f41703g;
        photoTakingParams.getClass();
        try {
            if (photoTakingParams.f41706d != null) {
                C1759a aVar = new C1759a(photoTakingParams.f41704b);
                for (String next : PhotoTakingParams.f41703g) {
                    String str = (String) photoTakingParams.f41706d.get(next);
                    if (str != null) {
                        aVar.mo6524I(next, str);
                    }
                }
                aVar.mo6520E();
            }
        } catch (IOException unused) {
        }
        File file = new File(imageProviderFragment.f41702n.f41704b);
        DataUnit.formatSize(file.length());
        return file;
    }

    /* renamed from: p2 */
    public static /* synthetic */ void m40787p2(ImageProviderFragment imageProviderFragment, File file) {
        PhotoTakingParams photoTakingParams = imageProviderFragment.f41702n;
        imageProviderFragment.mo47928s1(file, photoTakingParams.f41708f, photoTakingParams.f41707e);
    }

    /* renamed from: g */
    public void mo48175g(Bundle bundle) {
        this.f41702n = null;
    }

    /* renamed from: j0 */
    public void mo48176j0(Bundle bundle, Exception exc) {
        this.f41702n = null;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        boolean z;
        Uri uri;
        String action;
        if (i == 6646) {
            if (i2 == -1) {
                mo48178r2(this.f41702n);
            } else if (i2 == 0) {
                mo48175g(this.f41702n.f41707e);
            }
        } else if (i == 6846) {
            if (i2 == -1) {
                if (intent == null || intent.getData() == null || ((action = intent.getAction()) != null && action.equals("android.media.action.IMAGE_CAPTURE"))) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    mo48178r2(this.f41702n);
                    return;
                }
                PhotoTakingParams photoTakingParams = this.f41702n;
                C21100e.m49369v(1);
                Context context = getContext();
                if (context == null) {
                    mo48176j0(this.f41702n.f41707e, (Exception) null);
                    return;
                }
                if (intent != null) {
                    uri = intent.getData();
                } else {
                    uri = null;
                }
                if (uri == null) {
                    mo48176j0(this.f41702n.f41707e, (Exception) null);
                    return;
                }
                this.f41702n.f41708f = false;
                Tasks.call(MoovitExecutors.SINGLE, new C16031h(this, context, uri, context.getContentResolver(), photoTakingParams)).addOnSuccessListener(new C13515b(this, 4)).addOnFailureListener(new C19543e(this, 2));
            } else if (i2 == 0) {
                mo48175g(this.f41702n.f41707e);
            }
        } else if (i != 6849) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 == -1) {
            C21100e.m49369v(1);
            Tasks.call(MoovitExecutors.SINGLE, new C20121e(this, 1)).addOnSuccessListener(new C19996f(this, 1));
        } else if (i2 == 0) {
            mo48175g(this.f41702n.f41707e);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f41702n = (PhotoTakingParams) bundle.getParcelable("PHOTO_TAKING_PARAMS_KEY");
        }
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (i == 1001) {
            if (iArr.length <= 0 || iArr[0] != 0) {
                mo48175g(this.f41702n.f41707e);
            } else {
                mo48177q2(requireContext(), this.f41702n.f41704b);
            }
        } else if (i == 1002) {
            mo48180t2(requireContext(), this.f41702n.f41704b);
        } else {
            super.onRequestPermissionsResult(i, strArr, iArr);
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("PHOTO_TAKING_PARAMS_KEY", this.f41702n);
    }

    /* renamed from: q2 */
    public final boolean mo48177q2(Context context, String str) {
        C21100e.m49369v(1);
        Uri c = C20978z.m49127c(context, new File(str));
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        intent.putExtra("output", c);
        intent.setClipData(ClipData.newRawUri("", c));
        intent.addFlags(3);
        if (intent.resolveActivity(context.getPackageManager()) == null) {
            return false;
        }
        startActivityForResult(intent, 6646);
        return true;
    }

    /* renamed from: r2 */
    public final void mo48178r2(PhotoTakingParams photoTakingParams) {
        C21100e.m49369v(1);
        Context context = getContext();
        if (context == null) {
            mo48176j0(this.f41702n.f41707e, (Exception) null);
            return;
        }
        this.f41702n.f41708f = true;
        context.getContentResolver();
        Tasks.call(MoovitExecutors.SINGLE, new C16032i(photoTakingParams)).addOnSuccessListener(new C17843u(this, 7)).addOnFailureListener(new C17844v(this, 4));
    }

    /* renamed from: s1 */
    public abstract void mo47928s1(File file, boolean z, Bundle bundle);

    /* renamed from: s2 */
    public final void mo48179s2() {
        C21100e.m49369v(1);
        PhotoTakingParams photoTakingParams = this.f41702n;
        if (photoTakingParams.f41705c) {
            C21100e.m49369v(1);
            Context context = getContext();
            if (context != null) {
                Tasks.call(MoovitExecutors.SINGLE, new C16034k(this, photoTakingParams, context)).addOnSuccessListener(new C18587a(this, 3));
                return;
            }
            return;
        }
        Tasks.call(MoovitExecutors.SINGLE, new C16033j(photoTakingParams)).addOnSuccessListener(new C6444s(this, 3));
    }

    /* renamed from: t2 */
    public final boolean mo48180t2(Context context, String str) {
        Intent intent;
        C21100e.m49369v(1);
        String string = context.getString(C19746x.action_select_photo);
        ArrayList arrayList = new ArrayList();
        PackageManager packageManager = context.getPackageManager();
        if (!CropImage.m18338b(context) && str != null) {
            ArrayList arrayList2 = new ArrayList();
            Uri c = C20978z.m49127c(context, new File(str));
            Intent intent2 = new Intent("android.media.action.IMAGE_CAPTURE");
            intent2.putExtra("output", c);
            intent2.setClipData(ClipData.newRawUri("", c));
            intent2.addFlags(3);
            for (ResolveInfo next : packageManager.queryIntentActivities(intent2, 0)) {
                Intent intent3 = new Intent(intent2);
                ActivityInfo activityInfo = next.activityInfo;
                intent3.setComponent(new ComponentName(activityInfo.packageName, activityInfo.name));
                intent3.setPackage(next.activityInfo.packageName);
                arrayList2.add(intent3);
            }
            arrayList.addAll(arrayList2);
        }
        ArrayList a = CropImage.m18337a(packageManager, "android.intent.action.GET_CONTENT");
        if (a.size() == 0) {
            a = CropImage.m18337a(packageManager, "android.intent.action.PICK");
        }
        arrayList.addAll(a);
        if (arrayList.isEmpty()) {
            intent = new Intent();
        } else {
            intent = (Intent) arrayList.get(arrayList.size() - 1);
            arrayList.remove(arrayList.size() - 1);
        }
        Intent createChooser = Intent.createChooser(intent, string);
        Parcelable[] parcelableArr = (Parcelable[]) arrayList.toArray(new Parcelable[arrayList.size()]);
        if (C20943i.m49051d(23)) {
            createChooser.putExtra("android.intent.extra.ALTERNATE_INTENTS", parcelableArr);
        } else {
            createChooser.putExtra("android.intent.extra.INITIAL_INTENTS", parcelableArr);
        }
        try {
            startActivityForResult(createChooser, 6846, (Bundle) null);
            return true;
        } catch (ActivityNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: u2 */
    public final void mo48181u2(boolean z, boolean z2, Bundle bundle) {
        PhotoTakingParams photoTakingParams;
        int i;
        C21100e.m49369v(1);
        Context context = getContext();
        if (context != null && this.f41702n == null) {
            try {
                photoTakingParams = new PhotoTakingParams(C20978z.m49125a(context).getPath(), z2, bundle);
            } catch (IOException e) {
                mo48176j0(bundle, e);
                photoTakingParams = null;
            }
            this.f41702n = photoTakingParams;
            if (photoTakingParams != null) {
                if (CropImage.m18338b(context)) {
                    String[] strArr = {"android.permission.CAMERA"};
                    if (z) {
                        i = 1002;
                    } else {
                        i = 1001;
                    }
                    requestPermissions(strArr, i);
                } else if (z) {
                    mo48180t2(context, this.f41702n.f41704b);
                } else {
                    mo48177q2(context, this.f41702n.f41704b);
                }
            }
        }
    }

    public static class PhotoTakingParams implements Parcelable {
        public static final Parcelable.Creator<PhotoTakingParams> CREATOR = new C16014a();

        /* renamed from: g */
        public static final List<String> f41703g = Arrays.asList(new String[]{"FNumber", "DateTime", "ExposureTime", "Flash", "FocalLength", "GPSTimeStamp", "GPSAltitude", "GPSAltitudeRef", "GPSLatitude", "GPSLatitudeRef", "GPSLongitude", "GPSLongitudeRef", "GPSProcessingMethod", "Make", "Model", "Orientation"});

        /* renamed from: b */
        public final String f41704b;

        /* renamed from: c */
        public final boolean f41705c;

        /* renamed from: d */
        public HashMap f41706d;

        /* renamed from: e */
        public final Bundle f41707e;

        /* renamed from: f */
        public boolean f41708f;

        /* renamed from: com.moovit.image.ImageProviderFragment$PhotoTakingParams$a */
        public class C16014a implements Parcelable.Creator<PhotoTakingParams> {
            public final Object createFromParcel(Parcel parcel) {
                return new PhotoTakingParams(parcel);
            }

            public final Object[] newArray(int i) {
                return new PhotoTakingParams[i];
            }
        }

        public PhotoTakingParams(String str, boolean z, Bundle bundle) {
            this.f41704b = str;
            this.f41705c = z;
            this.f41706d = null;
            this.f41707e = bundle;
            this.f41708f = false;
        }

        /* renamed from: b */
        public static void m40796b(PhotoTakingParams photoTakingParams) {
            photoTakingParams.getClass();
            try {
                C1759a aVar = new C1759a(photoTakingParams.f41704b);
                photoTakingParams.f41706d = new HashMap();
                for (String next : f41703g) {
                    String e = aVar.mo6532e(next);
                    if (e != null) {
                        photoTakingParams.f41706d.put(next, e);
                    }
                }
            } catch (IOException unused) {
            }
        }

        public final int describeContents() {
            return 0;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f41704b);
            parcel.writeInt(this.f41705c ? 1 : 0);
            parcel.writeMap(this.f41706d);
            parcel.writeBundle(this.f41707e);
            parcel.writeInt(this.f41708f ? 1 : 0);
        }

        public PhotoTakingParams(Parcel parcel) {
            String readString = parcel.readString();
            C21100e.m49373x(readString, "outputFilePath");
            this.f41704b = readString;
            boolean z = false;
            this.f41705c = parcel.readInt() == 1;
            HashMap hashMap = new HashMap();
            this.f41706d = hashMap;
            parcel.readMap(hashMap, PhotoTakingParams.class.getClassLoader());
            this.f41707e = parcel.readBundle(PhotoTakingParams.class.getClassLoader());
            this.f41708f = parcel.readInt() == 1 ? true : z;
        }
    }
}
