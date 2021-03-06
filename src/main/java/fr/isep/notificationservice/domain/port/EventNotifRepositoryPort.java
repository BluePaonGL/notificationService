package fr.isep.notificationservice.domain.port;

import fr.isep.notificationservice.domain.model.EventNotif;

import java.util.List;

public interface EventNotifRepositoryPort {
    EventNotif saveEventNotification(EventNotif eventNotif);

    List<EventNotif> findAll();

    void addUserToEventNotif(String eventNotifId, String userId);

    void deleteEventNotif(String eventNotifId);
}