package xyz.jiyong.toolbox.auth.domain;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import org.hibernate.annotations.CurrentTimestamp;
import xyz.jiyong.toolbox.tools.domain.UserFile;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Getter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String email;
    private String password;
    private String nickname;

    @Column(name = "created_at")
    @CurrentTimestamp
    private LocalDateTime createdAt;

    @Column(name = "deleted_at")
    private LocalDateTime deletedAt;

    @OneToMany(mappedBy = "userId")
    private List<UserFile> files;

    protected User() {}

    @Builder
    protected User(String email, String password, String nickname) {
        this.email = email;
        this.password = password;
        this.nickname = nickname;
    }
}
