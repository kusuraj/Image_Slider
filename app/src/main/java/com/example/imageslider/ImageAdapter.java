package com.example.imageslider;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

public class ImageAdapter extends PagerAdapter {

Context context;
ImageAdapter(Context context){
    this.context=context;
}

    @Override
    public int getCount() {
        return imageslier.length;
    }
    private int[] imageslier= new int[]{
            R.drawable.one,R.drawable.two,R.drawable.three,R.drawable.four,R.drawable.five,
            R.drawable.six,R.drawable.seven,
            R.drawable.eight,R.drawable.nine,R.drawable.ten,
            R.drawable.eleven,R.drawable.twelve,R.drawable.thirteen,R.drawable.fourteen,R.drawable.fifteen,
            R.drawable.sixteen,R.drawable.eighteen,
            R.drawable.ninteen,R.drawable.twentyone,R.drawable.twenty,
    };

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view==((ImageView)object);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        ImageView imageView =new ImageView(context);
//        imageView.setScaleType(ImageView.ScaleType.);
        imageView.setImageResource(imageslier[position]);
        ((ViewPager)container).addView(imageView,0);
        return imageView;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        ((ViewPager)container).removeView((ImageView)object);
    }
}
