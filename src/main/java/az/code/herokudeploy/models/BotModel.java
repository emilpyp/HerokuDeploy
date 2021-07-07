package az.code.herokudeploy.models;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
@Entity(name = "bot")
@Table(name = "bots")
public class BotModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "_from")
    private String from;
    @Column(name = "_to")
    private String to;
}
