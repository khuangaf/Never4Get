package com.example.huang.never4get;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by huang on 2016/2/21.
 */
public class DevicePageAdaptor extends FragmentPagerAdapter {

    String[] imageID;
    public DevicePageAdaptor(FragmentManager fm, Context context) {
        super(fm);
        Resources r = context.getResources();

    }


    @Override
    public Fragment getItem(int position) {
        Bundle bundle = new Bundle();

        bundle.putInt(DeviceFragment.ImageID,getImageID(position));
        DeviceFragment deviceFragment = new DeviceFragment();
        deviceFragment.setArguments(bundle);
        return deviceFragment;
    }


    @Override
    public int getCount() {
        return 2;
    }

    private int getImageID(int position)
    {
        if(position == 0) return R.drawable.page1;
        else return R.drawable.page2;

    }
}
