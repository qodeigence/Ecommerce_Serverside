package com.qodeigence.prakash.ecommerce_server_app.Common;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Matrix;

import com.qodeigence.prakash.ecommerce_server_app.Model.Request;
import com.qodeigence.prakash.ecommerce_server_app.Model.User;
import com.qodeigence.prakash.ecommerce_server_app.Remote.IGeoCoordinates;
import com.qodeigence.prakash.ecommerce_server_app.Remote.RetrofitClient;

public class Common {
    public  static User currentUser;
    public  static Request currentRequest;
    public static final String UPDATE = "Update";
    public static final String DELETE = "Delete";

    public static final int PICK_IMAGE_REQUEST = 71;

    public static final String baseUrl = "http://maps.googleapis.com";

    public static String convertCodeToStatus(String code){
        if(code.equals("0")){
            return "Placed";
        }
        else if(code.equals("1")) {
            return "On my way";
        }
        else
            return "Shipped";
    }

    public static IGeoCoordinates getGeoCodeService()
    {
        return RetrofitClient.getClient(baseUrl).create(IGeoCoordinates.class);
    }

    public static Bitmap scaleBitmap(Bitmap bitmap,int newWidth,int newHeight)
    {
        Bitmap scaledBitmap = Bitmap.createBitmap(newWidth,newHeight,Bitmap.Config.ARGB_8888);

        float scaleX = newWidth/(float)bitmap.getWidth();
        float scaleY = newHeight/(float)bitmap.getHeight();
        float pivotX=0,pivotY=0;

        Matrix scaleMatrix = new Matrix();
        scaleMatrix.setScale(scaleX,scaleY,pivotX,pivotY);

        Canvas canvas = new Canvas(scaledBitmap);
        canvas.setMatrix(scaleMatrix);
        canvas.drawBitmap(bitmap,0,0,new Paint(Paint.FILTER_BITMAP_FLAG));

        return scaledBitmap;
    }
}
