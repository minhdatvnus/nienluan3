package com.opengles.android.opengles20;

import android.content.Context;
import android.opengl.GLSurfaceView;

public class MyGLSurfaceView extends GLSurfaceView {
    private final MyGLRenderer mRenderer;

    public MyGLSurfaceView(Context context){
        super(context);

        // Khai bao su dung OpenGL ES 2.0
        setEGLContextClientVersion(2);

        mRenderer = new MyGLRenderer();

        // Cai dat Renderer dung de ve GLSurfaceView
        setRenderer(mRenderer);
    }
}