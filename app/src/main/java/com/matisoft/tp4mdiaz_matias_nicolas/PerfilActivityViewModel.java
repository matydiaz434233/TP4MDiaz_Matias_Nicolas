package com.matisoft.tp4mdiaz_matias_nicolas;

import android.app.Application;
import android.content.Context;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.matisoft.tp4mdiaz_matias_nicolas.modelo.Usuario;

public class PerfilActivityViewModel extends AndroidViewModel {
    private Context context;
    private MutableLiveData<Usuario> usuarioM;
    public PerfilActivityViewModel(@NonNull Application application) {
        super(application);
        this.context=application.getApplicationContext();
    }

    public LiveData<Usuario> getUsuarioM(){

        if(usuarioM==null){

            usuarioM=new MutableLiveData<Usuario>();
        }
        return usuarioM;

    }
    public void cargarUsuario(){

        Usuario usuario=new Usuario("Diaz","Matias","2657-547868",R.drawable.foto);
        usuarioM.setValue(usuario);

    }
}
