package com.example.fcmnotification.controller;


import com.example.fcmnotification.dto.MessageDTO;
import com.example.fcmnotification.service.FcmService;
import com.google.firebase.messaging.FirebaseMessagingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class FcmController {


      @Autowired
      FcmService fcmService;

    @PostMapping("/single-notification")
    String  sendToSpecificDevice(
            @RequestBody MessageDTO note,
            @RequestParam String token) throws FirebaseMessagingException {

        return fcmService.sendNotificationToSpecificDevice(note,token);
    }




}
