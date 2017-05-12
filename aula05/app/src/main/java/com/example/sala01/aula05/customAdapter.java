package com.example.sala01.aula05;

import android.content.ClipData.Item;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sala01 on 12/05/2017.
 */

public class CustomAdapter extends ArrayAdapter<Item> {

    Context context;
    List<Item> items;

    public CustomAdapter(Context context, List<Item> items){
        super(context, R.layout.item, items);
        this.context = context;
        this.items = items;
    }

    class ViewHolder{

        TextView name, local, likes;
        ImageView avatar, photo;
        Button botao1, botao2, botao3, botao4, botao5;


        public TextView getName() {
            return name;
        }

        public void setName(TextView name) {
            this.name = name;
        }

        public TextView getLocal() {
            return local;
        }

        public void setLocal(TextView local) {
            this.local = local;
        }

        public TextView getLikes() {
            return likes;
        }

        public void setLikes(TextView likes) {
            this.likes = likes;
        }

        public ImageView getAvatar() {
            return avatar;
        }

        public void setAvatar(ImageView avatar) {
            this.avatar = avatar;
        }

        public ImageView getPhoto() {
            return photo;
        }

        public void setPhoto(ImageView photo) {
            this.photo = photo;
        }


    }



    @Override
    public View getView(int position, View convertView, ViewGroup parent){

        // Check if an existing view is being reused, otherwise inflate the view
        ViewHolder viewHolder; // view lookup cache stored in tag
        if (convertView == null) {
            // If there's no view to re-use, inflate a brand new view for row
            viewHolder = new ViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.item, parent, false);
            viewHolder.name = (TextView) convertView.findViewById(R.id.textView2);
            viewHolder.likes = (TextView) convertView.findViewById(R.id.textView5);
            viewHolder.photo = (ImageView) convertView.findViewById(R.id.imageView4);
            viewHolder.local = (TextView) convertView.findViewById(R.id.textView2);
            viewHolder.botao1 = (Button) convertView.findViewById(R.id.button);

            // Cache the viewHolder object inside the fresh view
            convertView.setTag(viewHolder);
        } else {
            // View is being recycled, retrieve the viewHolder object from tag
            viewHolder = (ViewHolder) convertView.getTag();
        }

        viewHolder.botao1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //faz qualquer coisa
            }
        });

        // Populate the data from the data object via the viewHolder object
        // into the template view.
        viewHolder.name.setText(//Todo );
        // Return the completed view to render on screen
        return convertView;



    }
}
