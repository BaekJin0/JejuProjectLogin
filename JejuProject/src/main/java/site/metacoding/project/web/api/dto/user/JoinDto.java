package site.metacoding.project.web.api.dto.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import site.metacoding.project.domain.user.User;

// DTO : Data Transper Object (통신으로 전달하거나 받는 오브젝트를 엔티티 타입으로 변환)

@AllArgsConstructor
@NoArgsConstructor
@Data
public class JoinDto {
    private String username;
    private String password;
    private String email;

    // Entity로 변환해서 리턴
    public User toEntity() {
        User user = new User();
        user.setUsername(this.username);
        user.setPassword(this.password);
        user.setEmail(this.email);

        return user;
        // return new User(null, username, password, email, null, null);
    }
}
