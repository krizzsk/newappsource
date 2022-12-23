package com.moovit.image;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.moovit.commons.utils.DataUnit;
import com.moovit.image.ImageProviderFragment;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.concurrent.Callable;

/* renamed from: com.moovit.image.j */
public final /* synthetic */ class C16033j implements Callable {

    /* renamed from: b */
    public final /* synthetic */ ImageProviderFragment.PhotoTakingParams f41749b;

    public /* synthetic */ C16033j(ImageProviderFragment.PhotoTakingParams photoTakingParams) {
        this.f41749b = photoTakingParams;
    }

    public final Object call() {
        ImageProviderFragment.PhotoTakingParams photoTakingParams = this.f41749b;
        File file = new File(photoTakingParams.f41704b);
        DataUnit.formatSize(file.length());
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(photoTakingParams.f41704b, options);
        int min = Math.min(options.outWidth / 720, options.outHeight / 1280);
        options.inJustDecodeBounds = false;
        options.inSampleSize = min;
        Bitmap decodeFile = BitmapFactory.decodeFile(photoTakingParams.f41704b, options);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(photoTakingParams.f41704b));
        try {
            decodeFile.compress(ImageProviderFragment.f41701o, 50, bufferedOutputStream);
            bufferedOutputStream.close();
            DataUnit.formatSize(file.length());
            return file;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }
}
