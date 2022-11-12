package com.candles.tarot.adapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.candles.tarot.R;
import com.candles.tarot.model.Tarots;

import java.util.List;

public class TarotAdapter extends ArrayAdapter<Tarots> {
    Activity context;
    int resource;
    @NonNull List<Tarots> objects;
    public TarotAdapter(@NonNull Activity context, int resource, @NonNull List<Tarots> objects) {
        super(context, resource, objects);
        this.context = context;
        this.resource = resource;
        this.objects = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View row, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater = this.context.getLayoutInflater();
        row = layoutInflater.inflate(this.resource, null);

        TextView _sotarot = row.findViewById(R.id.txt_sola);
        ImageView _img = row.findViewById(R.id.imageView);

        Tarots tarots = this.objects.get(position);
        _sotarot.setText(tarots.get_soTarot());
        _img.setImageResource(tarots.get_LinkAnh());
        return row;
    }
}
