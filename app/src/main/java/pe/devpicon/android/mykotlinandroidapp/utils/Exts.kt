package pe.devpicon.android.mykotlinandroidapp.utils

import android.widget.ImageView
import com.bumptech.glide.Glide
import pe.devpicon.android.mykotlinandroidapp.R

/**
 * Created by armando on 5/12/17.
 */
fun ImageView.loadImage(url: String?){
    if(url != null){
        Glide.with(this.context)
                .load(url)
                .centerCrop()
                .into(this)
    } else {
        Glide.with(this.context)
                .load(R.mipmap.ic_launcher_round)
                .fitCenter()
                .into(this)
    }
}