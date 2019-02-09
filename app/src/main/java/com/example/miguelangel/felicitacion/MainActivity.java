package com.example.miguelangel.felicitacion;

import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Crear un objeto de Typeface: Para cambiar el tipo de Letra descargada
        //Identificación del Tipo de Fuente
        Typeface miFuente = Typeface.createFromAsset(getAssets(), "Beauty and the Beast Sample.ttf");

        //Utilizar el Tipo de Fuente en una Etiqueta en concreto
        //Buscar componente (View) por identificador: getViewById()
        TextView titulo = (TextView)findViewById(R.id.titulo); //Identificador: (id)
        //Los identificadores son únicos, no se pueden repetir

        //Asociar la Etiqueta con la Fuente

        titulo.setTypeface(miFuente);



        //ignar lAsa animacion creada con la Etiquieta FELICIDADES

        //1.Se crea el objeto de la Animación

        //Animation animacionObjeto = AnimationUtils.loadAnimation(this,R.anim.animacion);

        Animation animacionObjeto = AnimationUtils.loadAnimation(this,R.anim.animacion2);

        //2. Asignar a la Etiqueta FELICIDADES el objeto de Animacion

        titulo.startAnimation(animacionObjeto);


        //Asignar lAsa animacion creada con las otras Etiquetas diferentes a FELICIDADES

        //1.Se crea el objeto de la slideUp
        Animation slideUp = AnimationUtils.loadAnimation(this,R.anim.slideup);

        //2. Las cajas de texto se accede por su identificador.

        TextView texto2 = (TextView)findViewById(R.id.textView2); //Identificador: (id)
        TextView texto3 = (TextView)findViewById(R.id.textView3); //Identificador: (id)


        //3. Asignar a las Etiquetas el objeto de slideUp

        //Asignar a cada texto con su correspondiente animacion.
        //Diferentes Views o Componentes pueden compartir la misma Animacion.

        texto2.startAnimation(slideUp);
        texto3.startAnimation(slideUp);




        //Para reproducir el Archivo MP3
        //Se pasa el contexto que es "este archivo java" (this) y el Fichero MP3
        // almacenada en la Clase R que es una clase de java que contiene todos los
        // recursos en forma de variables estáticas
        MediaPlayer cancion = MediaPlayer.create(this, R.raw.happy_birthday);


       //Poner en Marcha el objeto "canción" de la Clase MediaPlayer
       cancion.start();
    }
}
