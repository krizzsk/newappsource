package com.moovit.image.glide;

import java.io.IOException;

public class ImageDataException extends IOException {
    public ImageDataException(String str) {
        super(str);
    }

    public ImageDataException(Exception exc) {
        super("Failed to load image data", exc);
    }
}
