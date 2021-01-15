package com.toly1994.opengl_video.view;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.os.Environment;

import java.io.File;

public class GLVideoView extends GLSurfaceView{

    VideoRender render;

    public GLVideoView(Context context) {
        super(context);
        String videoPath = Environment.getExternalStorageDirectory().getPath() + "/1.mp4";
        String playUrl = "http://ilovejoke.tk:9181/test/vod/1.mp4";
        File video=  new File(videoPath);
        setEGLContextClientVersion(3);//设置OpenGL ES 3.0 context
        //render = new VideoRender(getContext(),video);
        render = new VideoRender(getContext(),playUrl);
        setRenderer(render);//设置渲染器
    }

}
