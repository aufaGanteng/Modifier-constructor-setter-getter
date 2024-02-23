package com.mycompany.interface1;

public class PushNotification implements InterfaceNotifikasi {
    
    @Override
    public void senMessage(String receiver, String content) {
        System.out.println("Mengirim Push Notif ke" + receiver + " dengan isi");
        System.out.println("content");
    }
    
}
