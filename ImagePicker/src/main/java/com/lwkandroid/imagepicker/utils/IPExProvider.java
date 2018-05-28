package com.lwkandroid.imagepicker.utils;

import android.content.Context;
import android.support.v4.content.FileProvider;

/**
 * TODO 自定义FileProvider，适用于缓存地址为external_path
 */

public class IPExProvider extends FileProvider
{
    public static String getAuthorities(Context context)
    {
        return new StringBuffer()
                .append(context.getPackageName())
                .append("_ex.provider")
                .toString();
    }

}
