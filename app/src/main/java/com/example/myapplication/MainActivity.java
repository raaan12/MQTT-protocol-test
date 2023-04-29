package com.example.myapplication;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import org.eclipse.paho.android.service.MqttAndroidClient;

import org.eclipse.paho.client.mqttv3.IMqttActionListener;
import org.eclipse.paho.client.mqttv3.IMqttDeliveryToken;

import org.eclipse.paho.client.mqttv3.IMqttToken;
import org.eclipse.paho.client.mqttv3.MqttCallback;

import org.eclipse.paho.client.mqttv3.MqttConnectOptions;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttMessage;


import java.nio.charset.StandardCharsets;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
/*
    Button mybutton;
    EditText editmessage;
    MqttAndroidClient mqttAndroidClient;

    final String serverUri = "tcp://mqtt3.thingspeak.com:1883";

    String clientId = "BxopEDQYJhEqCzMaKCITPRU";
    char[] cliPassword = "mqyTBJ8I8hwqIdT7A3LJT9Mt".toCharArray();
    final String subscriptionTopic = "channels/2127577/publish/";
    final String publishTopic = "channels/2127577/publish/fields/field1";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mybutton = findViewById(R.id.button);
        editmessage = findViewById(R.id.editTextText);
        // startMail();
        mybutton.setOnClickListener(this::publish);

        mqttAndroidClient = new MqttAndroidClient(getApplicationContext(), serverUri, clientId);
        mqttAndroidClient.setCallback(new MqttCallback() {

            @Override
            public void connectionLost(Throwable cause) {
                Log.d("TAG", "Connection lost" + cause.toString());
            }

            @Override
            public void messageArrived(String topic, MqttMessage message) {
                Log.d("TAG", "Incoming message: " + new String(message.getPayload()));
            }

            @Override
            public void deliveryComplete(IMqttDeliveryToken token) {

            }
        });
        MqttConnectOptions mqttConnectOptions = new MqttConnectOptions();

        mqttConnectOptions.setUserName(clientId);
        mqttConnectOptions.setPassword(cliPassword);
        try {
            mqttAndroidClient.connect(mqttConnectOptions);
        } catch (MqttException e) {
            throw new RuntimeException(e);
        }
    }



    // a tester
    public void subscribeToTopic(){
        try {
            mqttAndroidClient.subscribe(subscriptionTopic, 1, null, new IMqttActionListener() {
                @Override
                public void onSuccess(IMqttToken asyncActionToken) {
                    Log.d("TAG", "Subscribed to "+subscriptionTopic);
                }

                @Override
                public void onFailure(IMqttToken asyncActionToken, Throwable exception) {
                    Log.d("TAG", "failed to subscribe " +subscriptionTopic);
                }
            });

        } catch (MqttException ex){

            ex.printStackTrace();
        }
    }

    public void publishMessage(String mess){
        try {
            MqttMessage message = new MqttMessage();
            message.setPayload(mess.getBytes(StandardCharsets.UTF_8));
            message.setQos(0);
            message.setRetained(true);

            if(mqttAndroidClient.isConnected()) {
                mqttAndroidClient.publish(publishTopic, message, null, new IMqttActionListener() {
                    @Override
                    public void onSuccess(IMqttToken asyncActionToken) {
                        Log.d("TAG",  " published "+ mess + " to "+ publishTopic);
                    }

                    @Override
                    public void onFailure(IMqttToken asyncActionToken, Throwable exception) {
                        Log.d("TAG", "Failed to publish "+ mess +" to "+ publishTopic);
                    }
                });
            } else {
                MqttConnectOptions mqttConnectOptions = new MqttConnectOptions();

                mqttConnectOptions.setUserName(clientId);
                mqttConnectOptions.setPassword(cliPassword);
                mqttAndroidClient.connect(mqttConnectOptions, null, new IMqttActionListener() {
                    @Override
                    public void onSuccess(IMqttToken asyncActionToken) {
                        try {
                            mqttAndroidClient.publish(publishTopic, message, null, new IMqttActionListener() {
                                @Override
                                public void onSuccess(IMqttToken asyncActionToken) {
                                    Log.d("TAG",  " published "+ mess + " to "+ publishTopic);
                                }

                                @Override
                                public void onFailure(IMqttToken asyncActionToken, Throwable exception) {
                                    Log.d("TAG", "Failed to publish "+ mess +" to "+ publishTopic);
                                }
                            });
                        } catch (MqttException e) {
                            System.err.println("Error Publishing: " + e.getMessage());
                            e.printStackTrace();
                        }
                    }

                    @Override
                    public void onFailure(IMqttToken asyncActionToken, Throwable exception) {
                        Log.d("TAG","Failed to connect to: " + serverUri);
                    }
                });
            }
        } catch (MqttException e) {
            System.err.println("Error Publishing: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private void publish(View v)
    {

        this.publishMessage(editmessage.getText().toString() );
        editmessage.setText("");
    }

 */


    Button mybutton;
    EditText editmessage;
    MqttAndroidClient mqttAndroidClient;

    final String serverUri = "tcp://mqtt3.thingspeak.com:1883";

    String clientId = "BxopEDQYJhEqCzMaKCITPRU";
    char[] cliPassword = "mqyTBJ8I8hwqIdT7A3LJT9Mt".toCharArray();
    final String subscriptionTopic = "channels/2128206/publish/";
    final String publishTopic = "channels/2128206/publish/fields/field1";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mybutton= findViewById(R.id.button);
        editmessage =findViewById(R.id.editTextText);
        // startMail();
        mybutton.setOnClickListener(this::publish);

        mqttAndroidClient = new MqttAndroidClient(getApplicationContext(), serverUri, clientId);
        mqttAndroidClient.setCallback(new MqttCallback() {

            @Override
            public void connectionLost(Throwable cause) {
                Log.d("TAG", "Connection lost"+ cause.toString());
            }

            @Override
            public void messageArrived(String topic, MqttMessage message) {
                Log.d("TAG","Incoming message: " + new String(message.getPayload()));
            }

            @Override
            public void deliveryComplete(IMqttDeliveryToken token) {

            }
        });

        MqttConnectOptions mqttConnectOptions = new MqttConnectOptions();

        mqttConnectOptions.setUserName(clientId);
        mqttConnectOptions.setPassword(cliPassword);




        try {

            mqttAndroidClient.connect(mqttConnectOptions, null, new IMqttActionListener() {
                @Override
                public void onSuccess(IMqttToken asyncActionToken) {

                    Log.d("TAG","connection success ");
                }

                @Override
                public void onFailure(IMqttToken asyncActionToken, Throwable exception) {
                    Log.d("TAG","Failed to connect to: " + serverUri);

                }
            });


        } catch (MqttException ex){
            ex.printStackTrace();
        }

    }




    // a tester
    public void subscribeToTopic(){
        try {
            mqttAndroidClient.subscribe(subscriptionTopic, 1, null, new IMqttActionListener() {
                @Override
                public void onSuccess(IMqttToken asyncActionToken) {
                    Log.d("TAG", "Subscribed to "+subscriptionTopic);
                }

                @Override
                public void onFailure(IMqttToken asyncActionToken, Throwable exception) {
                    Log.d("TAG", "failed to subscribe " +subscriptionTopic);
                }
            });

        } catch (MqttException ex){

            ex.printStackTrace();
        }
    }

    public void publishMessage(String mess){

        try {
            MqttMessage message = new MqttMessage();
            message.setPayload(mess.getBytes(StandardCharsets.UTF_8));
            message.setQos(1);
            message.setRetained(true);
            mqttAndroidClient.publish(publishTopic, message, null, new IMqttActionListener() {
                @Override
                public void onSuccess(IMqttToken asyncActionToken) {
                    Log.d("TAG",  " published "+ mess + " to "+ publishTopic);
                }

                @Override
                public void onFailure(IMqttToken asyncActionToken, Throwable exception) {
                    Log.d("TAG", "Failed to publish "+ mess +" to "+ publishTopic);                }
            });

        } catch (MqttException e) {
            System.err.println("Error Publishing: " + e.getMessage());
            e.printStackTrace();
        }
    }


    private void publish(View v)
    {

        this.publishMessage(editmessage.getText().toString() );
        editmessage.setText("");
    }

}