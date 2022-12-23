package mobi.lab.veriff.data;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import java.io.IOException;

@Deprecated
public interface DrawableProvider extends Parcelable {
    Drawable loadImage(Context context) throws IOException;
}
