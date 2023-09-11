package com.matisoft.tp4mdiaz_matias_nicolas.ui.MiFoto;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.matisoft.tp4mdiaz_matias_nicolas.R;
import com.matisoft.tp4mdiaz_matias_nicolas.modelo.Usuario;

public class HomeViewModel extends ViewModel {
    private MutableLiveData<Usuario> usuarioM;

    private final MutableLiveData<String> mText;
    public LiveData<Usuario> getUsuarioM(){

        if(usuarioM==null){

            usuarioM=new MutableLiveData<Usuario>();
        }
        return usuarioM;

    }

    public HomeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is home fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
    public void cargarUsuario(){

        Usuario usuario=new Usuario("Diaz","Matias","2657-547868", R.drawable.foto);
        usuarioM.setValue(usuario);

    }
}