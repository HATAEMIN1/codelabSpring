package exam2;

import jakarta.persistence.*;

@Entity
@Table(name = "JpaMember2")
public class Member2 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Access(AccessType.FIELD)
    private String username;
    @Access(AccessType.PROPERTY)  //getter setter로만 접근
    private String password;
    @Transient    //테이블 생성 x
    private long timestamp;

    public Member2() {
    }

    public Member2(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
