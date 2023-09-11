package com.matisoft.tp4mdiaz_matias_nicolas;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.matisoft.tp4mdiaz_matias_nicolas.databinding.ActivityPerfilBinding;
import com.matisoft.tp4mdiaz_matias_nicolas.modelo.Usuario;

public class PerfilActivity extends AppCompatActivity {
    private PerfilActivityViewModel mv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityPerfilBinding binding=ActivityPerfilBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        mv= ViewModelProvider.AndroidViewModelFactory.getInstance(getApplication()).create(PerfilActivityViewModel.class);
        mv.getUsuarioM().observe(this, new Observer<Usuario>() {
            @Override
            public void onChanged(Usuario usuario) {
                //binding.tvApellido.setText(usuario.getApellido());
                binding.tvNombre.setText(usuario.getNombre());
                binding.tvTelefono.setText(usuario.getTelefono());
                binding.imageView.setImageResource(usuario.getFoto());
            }
        });
        mv.cargarUsuario();


    }
}
