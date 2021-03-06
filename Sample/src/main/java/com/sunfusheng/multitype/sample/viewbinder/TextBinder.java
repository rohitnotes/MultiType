package com.sunfusheng.multitype.sample.viewbinder;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.sunfusheng.multitype.ItemViewBinder;
import com.sunfusheng.multitype.sample.R;
import com.sunfusheng.multitype.sample.model.News;

/**
 * @author sunfusheng on 2018/7/1.
 */
public class TextBinder extends ItemViewBinder<News, TextBinder.ViewHolder> {

    @NonNull
    @Override
    protected ViewHolder onCreateViewHolder(@NonNull LayoutInflater inflater, @NonNull ViewGroup parent) {
        return new ViewHolder(inflater.inflate(R.layout.item_text, parent, false));
    }

    @Override
    protected void onBindViewHolder(@NonNull ViewHolder holder, @NonNull News item) {
        holder.vTitle.setText(item.title);
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        TextView vTitle;

        ViewHolder(View view) {
            super(view);
            vTitle = view.findViewById(R.id.title);
        }
    }
}
