package com.matisoft.tp4mdiaz_matias_nicolas;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

public class MainActivityViewModel extends AndroidViewModel {
    private Context context;

    public MainActivityViewModel(@NonNull Application application){
        super(application);
        context= getApplication().getApplicationContext();
    }


    public void login(String mail,String password) {

        //correo@mail.com y constraseña es 123
        //  1) Agregar una activitie
        //navegar a la otra activity si el mail y password es correcto.
        if (mail.equals("correo@mail.com") && password.equals("123")) {
            Intent intent = new Intent(context, MenuMati.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            context.startActivity(intent);

        } else {
            Toast.makeText(context, "Usuario y/o contraseña incorrecto", Toast.LENGTH_LONG).show();

        }
    }
}