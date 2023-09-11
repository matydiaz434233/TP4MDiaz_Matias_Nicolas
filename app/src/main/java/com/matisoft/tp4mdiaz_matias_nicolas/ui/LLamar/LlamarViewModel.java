package com.matisoft.tp4mdiaz_matias_nicolas.ui.LLamar;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;

import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class LlamarViewModel extends ViewModel {

    private Context context;
    public Intent telefono (String Numero){
        try {
            Intent intent = new Intent(Intent.ACTION_CALL);
            intent.setData(Uri.parse(Numero));
            return intent;

        }catch (NullPointerException e){
            Toast.makeText(context,"Ingresa bien el numero wachin",Toast.LENGTH_SHORT).show();
        }
return null;

    }

}