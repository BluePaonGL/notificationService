package fr.isep.notificationservice.infrastructure.adapter_repository_db.DAO;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "notification_group")
public class NotificationGroupDao {
    @Id
    @GeneratedValue(generator="system-uuid")
    @GenericGenerator(name="system-uuid", strategy = "uuid")
    private String notificationGroupId;
    
    private String notificationId;

    @ManyToMany(mappedBy = "notificationGroups")
    private List<UserNotifDao> userNotifDaoList = new ArrayList<>();

    @ManyToMany
    @JoinTable(name = "notifications")
    private List<NotificationDao> notifications = new ArrayList<>();
}