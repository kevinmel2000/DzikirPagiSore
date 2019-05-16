package com.azhar.doapagisore.view;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.azhar.doapagisore.PagiActivity;
import com.azhar.doapagisore.R;

public class ViewPagerAdapterPG extends PagerAdapter {

    String judul[];
    String keteranganarab[];
    String keteranganindo[];
    PagiActivity context;

    LayoutInflater inflater;

    public ViewPagerAdapterPG(PagiActivity pagiActivity, String[] judul, String[] keteranganarab, String[] keteranganindo) {

        this.context = pagiActivity;
        this.judul = judul;
        this.keteranganarab = keteranganarab;
        this.keteranganindo = keteranganindo;

    }

    @Override
    public int getCount() {
        return judul.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    public Object instantiateItem(ViewGroup container, int position) {
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.itempagi, container, false);

        TextView jdl = view.findViewById(R.id.judul);
        TextView ktrng = view.findViewById(R.id.keteranganarab);
        TextView ktrngindo = view.findViewById(R.id.keteranganindo);

        jdl.setText(judul[position]);
        ktrng.setText(keteranganarab[position]);
        ktrngindo.setText(keteranganindo[position]);
        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((LinearLayout) object);
    }
}