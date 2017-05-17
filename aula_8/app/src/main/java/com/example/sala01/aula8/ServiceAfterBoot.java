package com.example.sala01.aula8;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by sala01 on 17/05/2017.
 */

public class ServiceAfterBoot extends Service{

    //Binding de Serviço
    @Override
    public IBinder onBind(Intent intent){
        return null;
    }

    //Criação do Serviço
    @Override
    public void onCreate(){
        super.onCreate();

        //faz algo algums vezes
        repeat();
        PendingIntent pintent = PendingIntent.getService(this, 0, new Intent(this, ServiceAfterBoot.class), 0);
        //PendingIntent pintent = PendingIntent.getBroadcast(this, 0, new Intent(this, ServiceAfterBoot.class), 0);
        AlarmManager alarm = (AlarmManager) getSystemService(Context.ALARM_SERVICE);
        //1 em 1 minuto
        alarm.setRepeating(AlarmManager.RTC_WAKEUP, System.currentTimeMillis(), 60*1000, pintent);

    }

    @Override
    public int onStartCommand(Intent intent, int flag, int id){
        //super.onStartCommand(intent, flag, id);
        repeat();


        return START_STICKY;
    }


    private void repeat(){
        Toast
                .makeText(getApplicationContext(),"fui chamado"
                        , Toast.LENGTH_LONG)
                        .show();

        Log.d("MLog","bla");

    }

    //Quando o serviço for morto
    @Override
    public void onDestroy(){
        super.onDestroy();
    }





}
