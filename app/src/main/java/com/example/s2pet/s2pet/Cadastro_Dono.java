package com.example.s2pet.s2pet;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Cadastro_Dono extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cadastrodono);
    }

    public class Dono {
        private String id;
        private String nomeDono;
        private List<String> listaPet;

        public Dono(){}

        public Dono(String id, String nomeDono, List<String> listaPet ) {
            this.nomeDono = nomeDono;
            this.listaPet = listaPet;
            this.id = id;
        }

        // TODO 10 - criar um mapa de valores
        public Map<String, Object> mapaDeValores(){
            HashMap<String,Object> resutado = new HashMap<>();
            resutado.put("id", id);
            resutado.put("nomeDono", nomeDono);
            resutado.put("listaPet", listaPet);
            return resutado;
        }

        public List<String> getListaPet() {
            return listaPet;
        }

        public String getNomeDono() {
            return nomeDono;
        }

        public String getid() {
            return id;
        }
    }

}
