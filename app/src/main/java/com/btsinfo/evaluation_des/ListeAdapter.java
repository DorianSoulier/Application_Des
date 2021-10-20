package com.btsinfo.evaluation_des;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/*public class ListeAdapter extends ArrayAdapter<Des> {
    Context contex;

    public ListeAdapter(@NonNull Context context, List<Des> listeDes) {
        super(context, -1,listeDes);
        this.contex = context;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        View view;
        Des unDe;
        view=null;

        if(convertView==null){
            LayoutInflater layoutInflater = (LayoutInflater) this.contex.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = layoutInflater.inflate(R.layout.ligne,parent,false);
        }
        else{
            view = convertView;
        }
        unDe = getItem(position);
        ImageView img1 = (ImageView) view.findViewById(R.id.);

        tvTitre.setText(uneEquipe.getNomE());
        tvDesc.setText(uneEquipe.getDesE());

    AssetManager manager = contex.getAssets();
    InputStream open = null;
        try {
        open = manager.open(unDe.getImgDes());
        //Déclaration de la classe image appelé en programmation bitmap
        Bitmap bitmap = BitmapFactory.decodeStream(open);
        //On affecte a notre zone dédié, l'image correspondante
        img1.setImageBitmap(bitmap);
    } catch (
    IOException e) {
        e.printStackTrace();
    }
        return view;
}

 */