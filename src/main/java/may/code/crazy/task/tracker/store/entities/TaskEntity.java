package may.code.crazy.task.tracker.store.entities;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.time.Instant;
import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE) // быть аккаратным с этой аннтацией в проде
@Entity
@Table(name = "task")
public class TaskEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Long id;
    @Column(unique = true)
    String name;
    @Builder.Default
    Instant createAt = Instant.now();
    String description;
    }
