package com.example.harshit.jason_parsing;

import android.content.Context;
import android.content.Intent;

import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.MemoryPolicy;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

import static android.support.v4.content.ContextCompat.startActivity;

/**
 * Created by Harshit on 9/1/2018.
 */

public class CustomAdapter extends ArrayAdapter<DataModel>{


    private Context mcontext;
    private List<DataModel> dataModelList=new ArrayList<>();

    public CustomAdapter(@NonNull Context context, @NonNull List<DataModel> list) {
        super(context, 0, list);
        mcontext=context;
        dataModelList=list;



    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listitem=convertView;

            listitem= LayoutInflater.from(mcontext).inflate(R.layout.list_item,parent,false);
            final DataModel currentDataModel=dataModelList.get(position);


            ImageView urltoimage=(ImageView)listitem.findViewById(R.id.img);
            Picasso.with(getContext())
                    .load(currentDataModel.getUrltoImage())
                    .resize(400,150)
                    //memory policey is applied so that image can be stored in cache and retrived from cache when ever requried
                    .placeholder(R.drawable.background)
                    .error(R.drawable.errorimg)
                    .into(urltoimage);


            TextView title=(TextView)listitem.findViewById(R.id.title);
            title.setText(currentDataModel.getTitle());


            TextView description=(TextView)listitem.findViewById(R.id.description);
            description.setText(currentDataModel.getDescription());
            TextView url=(TextView)listitem.findViewById(R.id.url);
            url.setText(currentDataModel.getUrl());
          //  TextView url=(TextView)listitem.findViewById(R.id.url);
        /*   txt.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_VIEW).setData(Uri.parse(currentDataModel.getUrl()));

                }
            });
          //  url.setText(currentDataModel.getUrl());
        NEED TO IMPLEMENT THS , WE HAVE TO MAKE LINK CLICKABLE BUT FOR LEAVE AS IT IS

          */







        return listitem;

    }
}
